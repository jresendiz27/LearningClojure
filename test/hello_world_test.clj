(ns hello-world-test
  (:require [clojure.test :refer :all]
            [hello-world :as hl]))

(deftest hello-world-test
  "Verify hello world function"
  (is (= (hl/hello-world) "hello world")))
