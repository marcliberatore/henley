(ns henley.core
  (:require [henley.controller.register :as reg]
            [henley.view.application :as appl]
            [henley.view.view :as view])
  (:gen-class))

(defn -main [& args]
  (let [app (appl/create-application)]
    (reg/register-listeners app)
    (view/show app)))
