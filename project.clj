(defproject org.clojure/core.logic "0.8.0-beta3-SNAPSHOT" 
  :description "A logic/relational programming library for Clojure"
  :extra-classpath-dirs ["checkouts/clojurescript/src/clj"
                         "checkouts/clojurescript/src/cljs"]
  :parent [org.clojure/pom.contrib "0.0.25"]

  ;; lein 1
  :source-path "src/main/clojure"
  :test-path "src/test/clojure"

  ;; lein 2
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/tools.macro "0.1.1"]
                 [org.clojure/tools.nrepl "0.2.0-RC1"]
                 [com.datomic/datomic-free "0.8.3551" :scope "provided"]]
  :dev-dependencies [[lein-cljsbuild "0.2.9"]]
  :cljsbuild {:builds {:test-simp {:source-path "src/test/cljs"
                                   :compiler {:optimizations :simple
                                              :pretty-print true
                                              :static-fns true
                                              :output-to "tests.js"}}
                       :test-adv {:source-path "src/test/cljs"
                                  :compiler {:optimizations :advanced
                                             :pretty-print true
                                             :output-to "tests.js"}}}})
