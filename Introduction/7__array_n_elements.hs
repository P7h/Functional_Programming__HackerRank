
-- https://www.hackerrank.com/challenges/fp-array-of-n-elements

fn n    | n == 0 = []
        | otherwise = fn (n-1) ++ [(n-1)]
        -- | otherwise = (n-1):  fn (n-1)

fn n = [h | h <- [1..n]]

fn n = [1..n]