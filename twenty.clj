;;return penultimate element in sequence

(def solution #(nth % (- (count %) 2)))

;;tests

(= (solution (list 1 2 3 4 5)) 4)

(= (solution ["a" "b" "c"]) "b")

(= (solution [[1 2] [3 4]]) [1 2])
