(defproject monacella "0.1.0-SNAPSHOT"
  :description "The Accidental Distributed Multihypergraph Database"
  :url "http://gworley3.github.io/monacella/"
  :license {:name "MIT License"
            :url "https://github.com/gworley3/monacella/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot monacella.core
  :target-path "target/%s"
  :plugins [[speclj "3.1.0"]]
  :test-paths ["spec"]
  :profiles {:uberjar {:aot :all}
             :dev {:dependencies [
               [speclj "3.1.0"]]}})
