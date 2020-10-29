(ns user
  (:require [integrant.repl :refer [go reset reset-all init halt resume suspend]]
            [com.server.example :refer [config]]))

(integrant.repl/set-prep! (constantly config))

(comment
  (init)
  (go)
  (reset)
  (halt))
