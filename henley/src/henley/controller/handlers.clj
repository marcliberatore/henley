(ns henley.controller.handlers
  (:require [henley.view.view :as view]
            [henley.model.text-generator :as textgen]))

(defn on-select-statfile [view pathname]
  (view/display-statfile view pathname))

(defn on-generate-text [view pathname nb-words]
  (let [stats (textgen/read-text pathname)
        generated (textgen/generate-text nb-words stats)]
    (view/display-generated-text view generated)))


