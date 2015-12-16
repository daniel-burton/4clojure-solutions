;;intro to destructuring
;;let bindings and function parameter lists support destructuring

(= [2 4] (let [[a b c d e] [0 1 2 3 4]] answer))

(def answer [c e])
