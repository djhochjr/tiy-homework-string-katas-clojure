(ns kata
  (:require [clojure.string :as str]))

(defn explode [a]
  (str/trim a)
  (str/replace a #"" " "))

(defn not-string [a]
  (if (and (> (count a) 3) (= "not" (subs a 0 3)))
    (str a))
  (str "not" a))

(defn missing-char [a n]
  (let [front (subs a 0 n)
        back (subs a (+ n 1))]
    (str front back)))

(defn front-back [a]
  (if (<= (count a) 1)
    (str a)
    (let [mid (subs a 1 (- (count a) 1))]
      (str (subs a (- (count a) 1)) mid (subs a 0 1)))))

(defn front-3 [a]
  (if (>= (count a) 3)
    (let [front (subs a 0 3)]
      (str front front front)
      (str a a a))))


(defn back-around [a]
  (let [bob (subs a (- (count a) 1))]
    (str bob a bob)))

(defn front22 [a]
  (if (> (count a) 2)
    (str (subs a 0 2) a (subs a 0 2)
         (str a a a))))

(defn del-del [a]
  (if (= (subs a 1 4) "del")
    (str (subs a 0 1) (subs a 4))
    (str a)))
;(defn start-oz [a]
;               (def result (if (and (= "o" (subs a 0 )) (> (count a) 1))
;                 (str ("o"(count a) 0)))
;               (if  (and (= "z" (subs a 1 )) (> (count a) 2))
;                 (str ("z"(count a) 1))))
;               (str result))
(defn start-oz [a]
  (if (= (subs a 0 2) "oz")
    "oz"
    (if (= (subs a 0 1) "o")
      "o"
      (if (= (subs a 1 2) "z")
        "z"
        (if (>= (count a) 2)
          (subs a 0 2))))))

;                ("Example of startOz --> ")
;                (cond)
;                (and (= (subs a 0 1) "o") (= (subs 1 2) "z") (str ((subs a 0 2)))
;                     (= (subs a 0 1) "o") (str (subs a 0 1))
;                     (= (subs a 1 2) "z") (str (subs a 1 2))
;                     :else (str " ")))



(defn end-up [a] (let [last3 (subs a (- (count a) 3))
                       front (subs a 0 (- (count a) 3))]
                   (str front (str/upper-case last3))))





;(defn end-up [a]
;  (if (<= (subs a 3))
;    (str str/upper-case a)
;    (let [cut (subs a (- (count a) 3))
;          front (subs  cut)
;          back cut]
;      (str (+ ((str/upper-case back) (str/upper-case front)))))))



(defn -main [])
(print "(explode \"kitten\") -> ")
(println (explode "kitten"))
(print "(explode \"cat\") -> ")
(println (explode "cat"))
(print "(explode \"\") -> ")
(println (explode ""))
(print "(explode \"c\") -> ")
(println (explode "c"))
(print "(explode \"dark\") -> ")
(println (explode "dark"))
(print "(explode \"gross\") -> ")
(println (explode "gross"))
(println)
(print "(not-string \"candy\")-> ")
(println (not-string "candy"))
(print "(not-string \"x\")-> ")
(println (not-string "x"))
(print "(not-string \"not bad\")-> ")
(println (not-string "not bad"))
(print "(not-string \"notty\")-> ")
(println (not-string "notty"))
(print "(not-string \"nothing\")-> ")
(println (not-string "nothing"))
(print "(not-string \"notwist\")-> ")
(println (not-string "notwist"))
(println)
(print "(missing-char \"kitten\",1) -> ")
(println (missing-char "kitten" 1))
(print "(missing-char \"kitten\",0) -> ")
(println (missing-char "kitten" 0))
(print "(missing-char \"kitten\",4) -> ")
(println (missing-char "kitten" 4))
(print "(missing-char \"kitten\",5) -> ")
(println (missing-char "kitten" 5))
(print "(missing-char \"kitten\",3) -> ")
(println (missing-char "kitten" 3))
(print "(missing-char \"kitten\",2) -> ")
(println (missing-char "kitten" 2))
(println)
(print "(front-back \"code\")-> ")
(println (front-back "code"))
(print "(front-back \"dorky\")-> ")
(println (front-back "dorky"))
(print "(front-back \"jimmy\")-> ")
(println (front-back "jimmy"))
(print "(front-back \"this\")-> ")
(println (front-back "this"))
(print "(front-back \"doots\")-> ")
(println (front-back "doots"))
(print "(front-back \"park\")-> ")
(println (front-back "park"))
(println)
(print "(front-3 \"Java\")-> ")
(println (front-3 "Java"))
(print "(front-3 \"chocolate\")-> ")
(println (front-3 "chocolate"))
(print "(front-3 \"abc\")-> ")
(println (front-3 "abc"))
(print "(front-3 \"tick\")-> ")
(println (front-3 "tick"))
(print "(front-3 \"dummy\")-> ")
(println (front-3 "dummy"))
(print "(front-3 \"song\")-> ")
(println (front-3 "song"))
(println)
(print "(back-around \"cat\")-> ")
(println (back-around "cat"))
(print "(back-around \"hello\")-> ")
(println (back-around "hello"))
(print "(back-around \"a\")-> ")
(println (back-around "a"))
(print "(back-around \"soup\")-> ")
(println (back-around "soup"))
(print "(back-around \"sortee\")-> ")
(println (back-around "sortee"))
(print "(back-around \"sublime\")-> ")
(println (back-around "sublime"))
(println)
(print "(front22 \"kitten\") -> ")
(println (front22 "kitten"))
(print "(front22 \"ha\") -> ")
(println (front22 "ha"))
(print "(front22 \"abc\") -> ")
(println (front22 "abc"))
(print "(front22 \"jojo\") -> ")
(println (front22 "jojo"))
(print "(front22 \"lamb\") -> ")
(println (front22 "lamb"))
(print "(front22 \"god\") -> ")
(println (front22 "god"))
(println)
(print "(del-del \"adelbc\") -> ")
(println (del-del "adelbc"))
(print "(del-del \"adelhello\") -> ")
(println (del-del "adelhello"))
(print "(del-del \"adelphi\") -> ")
(println (del-del "adelphi"))
(print "(del-del \"adelll\") -> ")
(println (del-del "adelll"))
(print "(del-del \"addell\") -> ")
(println (del-del "adedll"))
(print "(del-del \"deli\") -> ")
(println (del-del "deli"))
(println)
(print "(start-oz \"ozmandias\") -> ")
(println (start-oz "ozmandias"))
(print "(start-oz \"bzoo\") -> ")
(println (start-oz "bzoo"))
(print "(start-oz \"oxx\") -> ")
(println (start-oz "oxx"))
(print "(start-oz \"kitten\") -> ")
(println (start-oz "kitten"))
(print "(start-oz \"ozone\") -> ")
(println (start-oz "ozone"))
(print "(start-oz \"bozo\") -> ")
(println (start-oz "bozo"))
(println)
(print "(end-up \"hello\") -> ")
(println (end-up "hello"))
(print "(end-up \"hi there\") -> ")
(println (end-up "hi there"))
(print "(end-up \"hii\") -> ")
(println (end-up "hii"))
(print "(end-up \"jelly\") -> ")
(println (end-up "jelly"))
(print "(end-up \"portion\") -> ")
(println (end-up "portion"))
(print "(end-up \"blargh\") -> ")
(println (end-up "blargh"))


(-main)















