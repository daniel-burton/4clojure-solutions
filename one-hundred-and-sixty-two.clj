;;in clojure, only nil and false are false, everything else is true.

;;examples:

(= __ (if-not false 1 0))

(= 1 (if-not nil 1 0))

(= 1 (if true 1 0))

(= 1 (if [] 1 0))

(= 1 (if [0] 1 0))

(= 1 (if 0 1 0))


