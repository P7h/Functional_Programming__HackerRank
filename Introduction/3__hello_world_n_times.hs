
-- https://www.hackerrank.com/challenges/fp-hello-world-n-times

hello_worlds n  | n == 1 = putStrLn "Hello World"
                | otherwise = do
                                putStrLn "Hello World"
                                hello_worlds (n-1)

-- This part is related to the Input/Output and can be used as it is
-- Do not modify it
main = do
   n <- readLn :: IO Int
   hello_worlds n
