(defproject incanter/incanter-core "1.9.1-SNAPSHOT"
  :description "Incanter-core is the core module of the Incanter project."
  :url "http://incanter.org/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "https://github.com/incanter/incanter"
        :dir "modules/incanter-core"}
  :min-lein-version "2.0.0"
  :java-source-paths ["java"]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/math.combinatorics "0.0.8"
                  :exclusions [org.clojure/clojure]]
		 [org.jblas/jblas "1.2.3"]
                 [net.mikera/vectorz-clj "0.28.0"]
                 [net.mikera/core.matrix "0.33.1"]
                 [clatrix "0.4.0"
                  :exclusions [org.clojure/clojure]]
                 [net.sourceforge.parallelcolt/parallelcolt "0.10.1"]])
