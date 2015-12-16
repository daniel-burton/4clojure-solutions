;;write function that detects if given sequence is a palindrome

(defn answer [coll] (if (string? coll)
                      (= (seq coll) (reverse (seq coll)))
                      (= coll (reverse coll))))

;;tests

(false? (answer '(1 2 3 4 5)))

(true? (answer "racecar"))

(true? (answer [:foo :bar :foo]))

(true? (answer '(1 1 3 3 1 1)))

(false? (answer '(:a :b :c)))
  
