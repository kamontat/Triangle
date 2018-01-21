(ns main)

(defn- validate [a, b, c]
    (and (> (+ a b) c)
         (> (+ b c) a)
         (> (+ c a) b)))
         
(defn- is_isosceles [a b c]
    (or (= a b)
        (= b c)
        (= c a)))
(defn type [a b c]
    (cond
        (= a b c) :equilateral
        (not (validate a b c)) :illogical
        (is_isosceles a b c) :isosceles
        :else :scalene))
