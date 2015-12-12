;;some takes a predicate and collection-- returns first true value of predicate.

(def answer 6)

(= answer (some #(when (even? %) %) [5 6 7 8]))

(= answer (some #{2 7 6} [5 6 7 8]))
