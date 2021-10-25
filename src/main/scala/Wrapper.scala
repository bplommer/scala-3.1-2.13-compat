import fs2.Stream
import cats.effect.IO

object Wrapper {
  def hello = Stream.eval(IO(println("hello world"))).compile.drain
}
