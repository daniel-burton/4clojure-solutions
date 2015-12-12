;;function that reverses a sequence

(def answer #(into () %))
;;this works because into adds to the front of a list.
;;tests

(= (answer [1 2 3 4 5]) [5 4 3 2 1])

(= (answer (sorted-set 5 7 2 7)) '(7 5 2))

(= (answer [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])
