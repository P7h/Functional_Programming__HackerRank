
-- https://www.hackerrank.com/challenges/string-mingling/

main :: IO ()
main = getContents >>= putStrLn. (\[p, q] -> mangle p q). lines

mangle :: String -> String -> String
mangle [] _ = []
mangle _ [] = []
mangle (x:xs) (y:ys) = x:y: mangle xs ys