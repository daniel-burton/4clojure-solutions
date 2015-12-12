;; the ->> macro threads an expression through a number of forms. insterted as last item in each form, going left to right.

(= (reduce + (map inc (take 3 (drop 2 [2 5 4 1 3 6]))))
   (->> [2 5 3 1 3 6] (drop 2) (take 3) (map inc) (reduce +))
   11)
