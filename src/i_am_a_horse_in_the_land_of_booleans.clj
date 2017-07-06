(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil) false (if (= x false) false true)))

(defn abs [x]
  (if (> x 0) x (- x)))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
    (= (mod n 15) 0) "gotcha!"
    (= (mod n 3) 0) "fizz"
    (= (mod n 5) 0) "buzz"
    :else ""
    )
  )

(defn teen? [age]
  (if (< 12 age 20) true false))

(defn not-teen? [age]
  (if (teen? age) false true))

(defn generic-doublificate [x]
  (
    cond
      (number? x) (* 2 x)
      (empty? x) nil
      (list? x) (* (count x) 2)
      (vector? x) (* (count x) 2)
    :else true
  )
  )

(defn leap-year? [year]
  ( cond
    (> (mod year 4) 0) false
    (> (mod year 100) 0) true
    (> (mod year 400) 0) false
    :else true
    )
  )

; '_______'






