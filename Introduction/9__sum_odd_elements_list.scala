
// https://www.hackerrank.com/challenges/fp-sum-of-odd-elements

def f(l: List[Int]): Int = l match {
    case h :: tail => odd1(h) + f(tail)
    case Nil => 0
}

def odd1(x: Int): Int = {
    if(x % 2 != 0) x
    else 0
}


def f1(l: List[Int]): Int = l.filter(_ % 2 != 0).sum