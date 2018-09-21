(ns learning-clojure.seven.concurrency.parallel-sum-test
  (:require [clojure.test :refer :all])
  (:use [learning-clojure.seven.concurrency.parallel-sum :only [parallel-sum simple-sum]]))

(def numbers [1, 2, 3, 4, 5, 6, 7, 8])

(def large-range (into [] (range 0 100)) )

(deftest compare-sums
  (testing "Compare the sums"
    (is (=  (time (parallel-sum large-range))
            (time (simple-sum large-range))))))
(deftest parallel-sum-test
  (testing "Parallel-sum using reducers and clojure core"
    (is (= (parallel-sum numbers) 36))))
