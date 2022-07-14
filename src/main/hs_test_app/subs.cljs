(ns hs-test-app.subs
  (:require [re-frame.core :as rf]))

(rf/reg-sub
 ::current-route
 (fn [db _]
   ;@TODO correct value for :route
   ;(get db :route :hs-test-app.views/list)))
   (get db :route)))

(rf/reg-sub
 ::patients
 (fn [db _]
   (:patients db)))

(rf/reg-sub
 ::patient-in-edit
 (fn [db _]
   (:patient-in-edit db)))

(rf/reg-sub
 ::form-control-value
 (fn [db [_ form-id control-id]]
   (get-in db [:form form-id control-id] "")))

(rf/reg-sub
 ::form
 (fn [db [_ form-id]]
   (get-in db [:form form-id] [])))
