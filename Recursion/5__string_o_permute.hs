
-- https://www.hackerrank.com/challenges/string-mingling/
main :: IO()
main =  fmap (tail. lines) getContents >>= mapM_ (putStrLn. permute)

permute :: String -> String
permute [] = []
permute (x:y:xs) = y:x: permute xs