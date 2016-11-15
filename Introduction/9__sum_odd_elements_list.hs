
-- https://www.hackerrank.com/challenges/fp-sum-of-odd-elements

-- Does not work
f1 :: [Int] -> Int
f1 arr = sum (filter (odd arr))


f2 :: [Int] -> Int
f2 arr = sum[x | x <- arr, x `mod` 2 /= 0]


f :: [Int] -> Int
f []        = 0
f (x:xs)    = odd1 x + f xs
            where odd1 n    | odd n     = n
                            | otherwise = 0