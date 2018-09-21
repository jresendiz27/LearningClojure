(ns hello_world_test
  (:require [clojure.test :refer :all]
            [hello-world :as hl]))

(deftest hw-test
  "Verify hello world function"
  (is (= (hl/hello-world) "hello world")))
