(ns {{name}}.server
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.resource :as resources])
  (:gen-class))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body 
   (str "<!DOCTYPE html>"
        "<html>"
        "<head>"
        "</head>"
        "<body>"
        "<p id=\"clickable\">Click me!</p>"
        "<script src=\"js/cljs.js\"></script>"
        "</body>"
        "</html>")})

(def app 
  (-> handler
    (resources/wrap-resource "public")))

(defn -main [& args]
  (jetty/run-jetty app {:port 3000}))

