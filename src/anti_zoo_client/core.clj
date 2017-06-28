(ns anti-zoo-client.core
  (:require
    [clojure.string :as str]
    [clj-http.client :as http]
    [cheshire.core :refer :all]
    [clojure.tools.logging :as log]))

(defn client
  [host port]
  {:conn (str "http://" host ":" port)})

(defn save-el
  "save state into anti-zoo"
  [client id state type ts info])

(defn get-el
  "get state from anti-zoo"
  [client id])

(defn get-els
  "get els which match state (and type if defined)"
  [client state & [type]])

(defn switch-els-state
  "Switch state for all elements which match source state, to target state"
  [client source-state target-state])
