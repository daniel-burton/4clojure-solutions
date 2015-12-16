;;factorials

;;write a function to calculate factorials

(defn answer #(loop [n %, x 1]
                (if (= 0 n)
                  x
                  (recur (dec n) (* x n)))))

(= (answer 1) 1)

(= (answer 3) 6)

(= (answer 5) 120)

(= (answer 8) 40320)
