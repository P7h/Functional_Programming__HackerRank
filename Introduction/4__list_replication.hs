
-- https://www.hackerrank.com/challenges/fp-list-replication

f :: Int -> [Int] -> [Int]
f _ []  = []
f n (x:xs) = [x | _ <- [1..n]] ++ f n xs

-- This part handles the Input and Output and can be used as it is. Do not modify this part.
main :: IO ()
main = getContents >>=
       mapM_ print. (\(n:arr) -> f n arr). map read. words
