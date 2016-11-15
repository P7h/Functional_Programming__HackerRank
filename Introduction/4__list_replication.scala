// https://www.hackerrank.com/challenges/fp-list-replication

def f(num:Int,arr:List[Int]):List[Int] = arr.map(i => (1 to num).map(_=> i)).flatMap(j => j)

