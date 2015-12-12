;;implement range without range.

(fn [start end] (loop [coll (list start), x start, end end]
                  (if (= x (- end 1))
                    (reverse coll)
                    (recur (conj coll (inc x)) (inc x) end))))

;;tests

(= (__ 1 4) '(1 2 3))

(= (__ -2 2) '(-2 -1 0 1))

(= (__ 5 8) '(5 6 7))
