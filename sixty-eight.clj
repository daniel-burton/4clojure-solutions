;;recursion and "recur"

;;test

(= answer
   (loop [x 5
          result []]
     (if (> x 0)
       (recur (dec x) (conj result (+ 2 x)))
       result)))

(def answer '(7 6 5 4 3))
