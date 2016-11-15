
-- https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list
f :: [Int] -> [Int] 
f [] = []
f (x:y:xs) = y : f xs

--  f xs = [xs !! i | i <- [0..(n-1)], i `mod` 2 == 1]
--  	where n = length xs


-- This part deals with the Input and Output and can be used as it is. Do not modify it.
main = do
   inputdata <- getContents
   mapM_ (putStrLn. show). f. map read. lines $ inputdata
