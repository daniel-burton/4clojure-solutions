;;recursive functions

(def answer '(5 4 3 2 1))

;;test

(= answer ((fn foo [x] (when (> x 0) 
                         (conj (foo (dec x)) x))) 
           5))
