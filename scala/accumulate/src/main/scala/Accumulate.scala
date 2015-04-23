import scala.annotation.tailrec

class Accumulate {
    def accumulate[T, U](fun: T => U, list: List[T]) = map(fun)(list)

    private def map[T, U](fun: T => U)(list: List[T]) = {

        @tailrec def mapIter(accu: List[U], list: List[T]) : List[U] = list match {
            case Nil => accu.reverse
            case x :: xs => mapIter(fun(x) :: accu, xs)
        }

        mapIter(Nil, list)
    } 
}
