(ns henley.controller.swing-listeners
  (:require [henley.view.swingui :as ui]
            [henley.controller.handlers :as hand]))

(defn select-button-listener [event view]
  (when-let [file (ui/prompt-file view)]
    (ui/set-generate-button-enabled view true)
    (hand/on-select-statfile view (.getPath file))))

(defn generate-button-listener [event view]
  (when-let [nb-words (ui/get-number-of-words view)]
    (when-let [pathname (ui/get-statfile view)]
      (hand/on-generate-text view pathname nb-words))))
