(ns henley.view.application
  (:require [henley.view.view :refer [View]]
            [henley.view.swingui :refer [SwingUI]]
            [henley.view.uicomponents :refer [frame generated-text input-file generate-button select-button nb-words]]
            [henley.swing-utils :as sutils])
  (:import (javax.swing JFileChooser)))

(deftype Application []
  View SwingUI
  (show
   [this]
   ;; (set-look-and-feel2 "Nimbus")
   (sutils/do-swing-and-wait
    (.setVisible frame true)))
  
  (display-generated-text
   [this text]
   (.setText generated-text text))

  (display-statfile
   [this pathname]
   (.setText input-file pathname))

  (prompt-file
   [this]
   (let [jc (JFileChooser.)
         val (.showOpenDialog jc frame)]
     (when (= val JFileChooser/APPROVE_OPTION)
       (.getSelectedFile jc))))

  
  (add-select-button-listener
   [this f args]
   (apply sutils/add-action-listener select-button f args))
  
  (add-generate-button-listener
   [this f args]
   (apply sutils/add-action-listener generate-button f args))
  
  (get-number-of-words
   [this]
   (Integer/parseInt (.getText nb-words)))

  (get-statfile
   [this]
   (.getText input-file))

  (set-generate-button-enabled
   [this enabled]
   (.setEnabled generate-button enabled)))

(defn create-application []
  (Application.))
