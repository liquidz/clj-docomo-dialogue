(ns clj-docomo-dialogue.core
  (:require
    [clojure.data.json :as json]
    [clj-http.client :as client]))

(def ^:const DIALOGUE_API
  "https://api.apigw.smt.docomo.ne.jp/dialogue/v1/dialogue")

(defn talk
  ([api-key text] (talk api-key text {}))
  ([api-key text option]
   (let [json (json/write-str (merge option {:utt text}))]
     (-> (str DIALOGUE_API "?APIKEY=" api-key)
         (client/post {:content-type :json, :body json})
         :body
         json/read-str))))
