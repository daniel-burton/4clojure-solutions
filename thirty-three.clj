;;write a function which replicates each element of a sequence a variable number of times

;;answer

(def answer (fn repeat-n-times [coll n]
              (mapcat #(repeat n %) coll)))

;;tests

(= (answer [1 2 3] 2) '(1 1 2 2 3 3))

(= (answer [:a :b] 4) '(:a :a :a :a :b :b :b :b))

(= (answer [4 5 6] 1) '(4 5 6))

(= (answer [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))

(= (answer [44 33] 2) [44 44 33 33])
