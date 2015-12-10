;first regex

(def solution "ABC")

(= solution (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))
