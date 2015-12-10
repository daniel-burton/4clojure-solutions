;; return last element in sequence without 'last'

(defn solution [lst] (nth lst (- (count lst) 1)))

(= (solution [1 2 3 4 5]) 5)

(= (solution '(5 4 3)) 3)

(= (solution ["b" "c" "d"]) "d")
