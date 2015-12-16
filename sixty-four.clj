;;intro to reduce

(def answer +)

;;tests

(= 15 (reduce answer [1 2 3 4 5]))

(= 0 (reduce answer []))

(= 6 (reduce answer 1 [2 3]))


