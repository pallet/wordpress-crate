(ns pallet.crate.wordpress-test
  (:use
   pallet.crate.wordpress
   clojure.test)
  (:require
   [pallet.crate.mysql :as mysql]
   [pallet.resource :as resource]))

(deftest invoke-test
  (is (resource/build-resources
       []
       (mysql/mysql-server "pw")
       (wordpress
        "mysql-wp-username" "mysql-wp-password" "mysql-wp-database")
       (wordpress
        "mysql-wp-username" "mysql-wp-password" "mysql-wp-database"
        "extension"))))
