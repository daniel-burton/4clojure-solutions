;;duplicates each item in a sequence

(def answer #(interleave % %))

;;tests

(= (__ [1 2 3]) '(1 1 2 2 3 3))

(= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))

(= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))

(= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
