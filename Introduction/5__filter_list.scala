
// https://www.hackerrank.com/challenges/fp-filter-array

def f(delim:Int,arr:List[Int]):List[Int] = for (x <- arr if x < delim) yield x