(ns learning-clojure.seven.concurrency.parallel-sum
  (:require [clojure.core.reducers :as red]))

(defn simple-sum [numbers]
  (reduce + numbers))

(defn parallel-sum [numbers]
  (red/fold + numbers))

(defn word-frequencies [words]
  (reduce
    (fn [counts word] (assoc counts word (inc (get counts word 0))))
    {} words))