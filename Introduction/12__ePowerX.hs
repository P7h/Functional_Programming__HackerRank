
-- https://www.hackerrank.com/challenges/eval-ex/

solve :: Double -> Double
solve 0.0 = 1.0
solve x = round' (sum [x ^ y / fromIntegral (factorial y) | y <- [0..9]])

factorial :: Integral a => a -> a
factorial 0 = 1
factorial n = n * factorial (n - 1)

-- rounds the number to better match the responses
round' :: RealFloat a => a -> a
round' num = (fromIntegral (round (num * 10000))) / 10000

main :: IO ()
main = getContents >>= mapM_ print. map solve. map (read::String->Double). tail. words