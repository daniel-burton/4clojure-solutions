;; the ->

(def answer last)

(= (answer (sort (rest (reverse [2 5 4 1 3 6]))))
   (-> [2 5 4 1 3 6] (reverse) (rest) (sort) (answer))
   5)

