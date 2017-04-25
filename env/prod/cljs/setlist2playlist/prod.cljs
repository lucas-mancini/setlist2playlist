(ns setlist2playlist.prod
  (:require [setlist2playlist.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
