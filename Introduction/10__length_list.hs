
-- https://www.hackerrank.com/challenges/fp-list-length

len :: [a] -> Int
len []      = 0
len (_:xs)  = 1 + len xs

len' :: [a] -> Int
len (xs)    = sum [1 | _ <- xs]