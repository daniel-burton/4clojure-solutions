;; local bindings... silly example.

(def __ 7)

(= (__ '(:a :b :c)) 3)

(= __ (let [x 3, y 10] (- y x)))

(= __ (let [x 21] (let [y 3] (/ x y))))


