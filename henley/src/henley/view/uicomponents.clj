(ns henley.view.uicomponents
  (:import henley.uicomponents.MainFrame))

(def *frame* (MainFrame.))
(def *generate-button* (.generateButton *frame*))
(def *select-button* (.selectButton *frame*))
(def *input-file* (.inputFileText *frame*))
(def *nb-words* (.numberOfWordsText *frame*))
(def *generated-text* (.generatedText *frame*))

