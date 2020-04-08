(ns coviz.app
  (:require [clojure.java.jdbc :as jdbc]
            [honeysql.core :as honey]
            [honeysql.helpers :as hsql]
            [honeysql.format :as fmt]
            [honeysql-postgres.helpers :as psqlh]
            [oz.core :as oz]))

;; (oz/start-server!)

;; (def db-spec
;;   {:dbtype "postgres"
;;    :dbname "coviz"
;;    :host "localhost"
;;    :port 5432
;;    :user "postgres"
;;    :password "example"})

;; (def basic-query
;;   "select date, country, confirmed, recovered, deaths from countries where country = 'United Kingdom' or country = 'Italy' or country = 'Japan' or country = 'China' or country = 'US'")

;; (let [data (jdbc/query db-spec basic-query)]
;;   (oz/view! {:data {:values data}
;;              :width 800
;;              :mark :line
;;              :encoding {:x {:field :date
;;                             :type :temporal}
;;                         :y {:field :confirmed
;;                             :type :quantitative}
;;                         :color {:field :country
;;                                 :type :nominal}}}))
