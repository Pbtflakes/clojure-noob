
(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn error-message
  "Prints an error message able to handle both mild and significant errors."
  [severity]
  (str "error is "
       (if (= severity :mild)
         "not that bad"
         "terrible")))

(defn multi-arity
  "A function with support for arity of 0, 1, or 2"
  ([arg1 arg2]
   (str "These are " arg1 " and " arg2 " put together."))
  ([arg1]
   (multi-arity arg1 "the non-existent arg2"))
  ([]
   (str "No arguments were given.")))

; Exercises from braveclojure.com
; Two: Increment of 100
(defn centi-inc
  [num]
  (-> num (+ 100)))
; Three: Custom decrement
(defn dec-maker
  [dec-by]
  #(- % dec-by))
(def dec9 (dec-maker 9))

; Constantly incremented interest
(defn cons-int
  "Gives account balance as function of initial deposit, percent interest, & years spent in the account."
  [dep pct yrs]
  (* dep (Math/pow (Math/E) (* pct yrs))))

