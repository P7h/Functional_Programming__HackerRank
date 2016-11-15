
-- https://www.hackerrank.com/challenges/fp-reverse-a-list

rev :: [Int] -> [Int]
rev [] = []
rev (x:xs) = rev xs ++ [x]