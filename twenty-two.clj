;;function that counts elements in sequence

(def solution #(loop [lst %1, n 0]
                 (if (empty? lst)
                   n
                   (recur (rest lst) (inc n)))))

;;tests

(= (solution '([1 2] [3 4] [5 6]) 2) [5 6])

(= (solution "Hello World") 11)

(= (solution [[1 2] [3 4] [5 6]]) 3)

(= (solution '(13)) 1)

(= (solution '(:a :b :c)) 3)
