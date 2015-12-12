;;function that returns sum of sequence of numbers

(def answer # (reduce + %))

;;tests

(= (answer [1 2 3]) 6)

(= (answer (list 0 -2 5 5)) 8)

(= (answer #{4 2 1}) 7)

(= (answer '(0 0 -1)) -1)

(= (answer '(1 10 3)) 14)
