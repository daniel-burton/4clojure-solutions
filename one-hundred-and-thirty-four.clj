;;function that if and only if map contains given key, and value is nil

(def answer (fn [query coll]
              (if (and (contains? coll query) (= nil coll query))
               true
              false)))

;;tests

(true? (answer :a {:a nil :b 2}))

(false? (answer :b {:a nil :b 2}))

(false? (answer :c {:a nil :b 2}))
