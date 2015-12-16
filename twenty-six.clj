;;write a function that returns the first x fibonacci numbers

(def answer #(take %
                   (map first
                        (iterate (fn [[a b]] [b (+ a b)])
                                 [1, 1]))))

(= (answer 3) '(1 1 2))

(= (answer 6) '(1 1 2 3 5 8))

;;etc
