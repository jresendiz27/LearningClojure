(ns learning-clojure.seven.concurrency.parallel-sum
  (:require [clojure.core.reducers :as red]))

(defn parallel-sum [numbers]
  (red/fold + numbers))
