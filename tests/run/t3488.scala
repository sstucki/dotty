object Test extends dotty.runtime.LegacyApp {
  def foo(p: => Unit)(x:Int = 0) = x

  println(foo { val List(_: _*)=List(0); 1 } ())
  println(foo { val List(_: _*)=List(0); 1 } (1))
}
