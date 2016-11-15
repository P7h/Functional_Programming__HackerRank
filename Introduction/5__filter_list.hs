
-- https://www.hackerrank.com/challenges/fp-filter-array
f' :: Int -> [Int] -> [Int]
f' n arr = [h | h <- arr, h < n]

f :: Int -> [Int] -> [Int]
f _ []              = []
f n (x:xs)  | x < n = x : f n xs
            | otherwise = f n xs


-- The Input/Output section. You do not need to change or modify this part
main = do 
    n <- readLn :: IO Int 
    inputdata <- getContents 
    let 
        numbers = map read (lines inputdata) :: [Int] 
    putStrLn . unlines $ (map show . f n) numbers

