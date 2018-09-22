(ns armstrong-numbers)

(defn digits [num]
  (if (pos? num)
    (conj (digits (quot num 10)) (mod num 10))
    []))

(defn exp [base exponent]
  (reduce * (repeat exponent base)))

(defn armstrong-definition [list size]
  (if (empty? list)
    0
    (+ (exp (first list) size)
       (armstrong-definition (rest list) size))))

(defn armstrong? [num]
  (let [digits (digits num)]
    (if (= num (armstrong-definition digits (count digits)))
      true
      false)))