(defproject mosaan-clojure-rest-api "0.1.0-SNAPSHOT"
  :description "REST API server sample"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[integrant "0.8.0"] ; アプリケーション状態/ライフサイクル管理ライブラリのひとつ
                 [org.clojure/clojure "1.10.1"]
                 [ring/ring-core "1.8.2"] ; Ringのコア機能を提供するもの
                 [ring/ring-jetty-adapter "1.8.2"]] ; RingにJettyサーバを接続するもの
  :main ^:skip-aot mosaan-clojure-rest-api.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
