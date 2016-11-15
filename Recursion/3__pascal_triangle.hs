
-- https://www.hackerrank.com/challenges/pascals-triangle/

pascal :: Int -> [[Int]]
pascal 0 = [[1]]
pascal m = [x | x <- pascal (m-1)] ++ [[choose m k | k <- [0,1..m]]]

choose :: Int -> Int -> Int
choose n k = ([1,1]^n) !! k

main = do
    input <- getLine
    mapM_ putStrLn $ map (unwords . map show $) (pascal . (read :: String -> Int) $ input)