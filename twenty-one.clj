;;return nth element in sequence

(def solution #(loop [lst %1, n %2]
                 (if (zero? n)
                   (first lst)
                   (recur (rest lst) (dec n)))))

;;tests

(= (__ '(4 5 6 7) 2) 6)

(= (__ [:a :b :c] 0) :a)

(= (__ [1 2 3 4] 1) 2)

(= (__ '([1 2] [3 4] [5 6]) 2) [5 6])
