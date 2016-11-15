
-- https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---gcd

euclid :: Int -> Int -> Int
euclid a b  | a == b    = a
            | a > b     = euclid (a-b) b
            | otherwise = euclid a (b-a)

-- This part is related to the Input/Output and can be used as it is
-- Do not modify it
main = do
  input <- getLine
  print . uncurry euclid . listToTuple . convertToInt . words $ input
 where
  listToTuple (x:xs:_) = (x,xs)
  convertToInt = map (read :: String -> Int)
