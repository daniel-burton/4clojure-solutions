;;get string, return new string that only has the caps

(defn answer [field] (apply str (re-seq #"[A-Z]+" field)))

(= (answer "HeLlO, WoRlD!") "HLOWRD")

(empty? (answer "nothing"))

(= (__ "$#A(*&987Zf") "AZ")
