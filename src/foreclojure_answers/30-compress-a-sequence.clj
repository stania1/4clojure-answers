#(reduce (fn [curr v] (if-not (= (last curr) v) (concat curr [v]) curr)) [] %)
