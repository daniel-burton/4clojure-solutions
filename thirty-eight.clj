;; find max in a series of numbers (not in a sequence) without using max

(defn biggest [& lst] (reduce #(if (> %1 %2) %1 %2) lst))

;;tests

(= (biggest 1 8 3 4) 8)
(= (biggest 30 20) 30)
(= (biggest 45 67 11) 67)
