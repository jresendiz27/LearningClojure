(ns learning-clojure.seven.concurrency.parallel-sum-test
  (:require [clojure.test :refer :all])
  (:use learning-clojure.seven.concurrency.parallel-sum))

(def numbers [1, 2, 3, 4, 5, 6, 7, 8])

(deftest parallel-sum-test
  (testing "Parallel-sum using reducers and clojure core"
    (is (= (parallel-sum numbers) 36))))