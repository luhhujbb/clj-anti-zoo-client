(defproject anti-zoo-client "0.1.6"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                  ;;for proxy
                 [clj-http "3.6.1"]
                 [cheshire "5.8.0"]
                 [org.clojure/core.async "0.3.465"]
                 ;; logging stuff
                 [org.clojure/tools.logging "0.3.1"]
                 [org.slf4j/slf4j-api "1.7.19"]
                 [org.slf4j/slf4j-log4j12 "1.7.19"]
                 [org.slf4j/jcl-over-slf4j "1.7.19"]]
  :aot :all
  :pedantic? :warn)
