(ns henley.controller.register
  (:require [henley.view.swingui :as ui]
            [henley.controller.swing-listeners :as l]))

(defn register-listeners [swingui]
  (ui/add-select-button-listener swingui l/select-button-listener [swingui])
  (ui/add-generate-button-listener swingui l/generate-button-listener [swingui]))
