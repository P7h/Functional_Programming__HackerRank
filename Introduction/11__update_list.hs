
-- https://www.hackerrank.com/challenges/fp-update-list

f arr = [abs(h) | h <- arr]

f' arr = map (abs) arr

f'' (x:xs)	| x < 0		= abs(x) : f'' xs
			| otherwise	= x : f'' xs