
// https://www.hackerrank.com/challenges/fp-reverse-a-list

def f[A](l: List[A]): List[A] = l match {
    case h :: tail => f(tail) ::: List(h)
    case Nil => Nil
}