#(take %(drop 1 (map first (iterate (fn [[a b]] [b (+' a b)]) [0 1]))))
