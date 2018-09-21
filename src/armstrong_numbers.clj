(ns armstrong-numbers)

(defn digit-list [num]
  (let [
        result (/ num 10)
        reminder (rem num 10)]
    (if (not= result 0)
      (cons reminder (digit-list (/ (- num reminder) 10)))
      nil)))

(defn exp [base exponent]
  (reduce * (repeat exponent base)))

(defn reduce-digits [list size]
  (if (empty? list)
    0
    (+
      (exp (first list) size)
      (reduce-digits (rest list) size))))

(defn armstrong? [num]
  (let [digits (digit-list num)]
    (if (= num (reduce-digits (reverse digits) (count digits)))
      true
      false)))