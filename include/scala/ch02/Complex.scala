class Complex(val re:Double, val im:Double) {
  def +(that:Complex) = new Complex(this.re + that.re, this.im + that.im)
  def -(that:Complex) = new Complex(this.re - that.re, this.im - that.im)
  def *(that:Complex) = new Complex(this.re * that.re - this.im * that.im,
                                    this.re * that.im + this.im * that.re)
  def /(that:Complex) = {
    val denominator = that.re * that.re + that.im * that.im 
    new Complex((this.re * that.re + this.im * that.im) / denominator,
                (this.im * that.re - this.re * that.im) / denominator)
  }

  override def toString = re + (if(im < 0) ("-" + (-im)) else ("+" + im)) + "i"
  
  override def equals(that:Any) = {
    that match {
      case c:Complex => (this.re == c.re) && (this.im == c.im)
      case _ => false
    }
  }
}

object Complex {
  val i = new Complex(0, 1)
  def apply(r:Double, i:Double) = new Complex(r,i)
  implicit def double2complex(x:Double) = new Complex(x,0)
}

import Complex._
val a = Complex(1,2)
val b = Complex(3,4)
assert(a+b == Complex(4, 6))
assert(a-b == Complex(-2, -2))
assert(a*b == Complex(-5, 10))
assert(a/b == Complex(0.44, 0.08))
