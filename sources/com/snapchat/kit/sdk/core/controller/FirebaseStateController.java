package com.snapchat.kit.sdk.core.controller;

import com.bytedance.covode.number.Covode;

public interface FirebaseStateController {

    public interface OnFirebaseCustomTokenResultListener {
        static {
            Covode.recordClassIndex(35585);
        }

        void onFailure(a aVar);

        void onSuccess(String str);
    }

    static {
        Covode.recordClassIndex(35584);
    }

    void addOnFirebaseCustomTokenResultListener(OnFirebaseCustomTokenResultListener onFirebaseCustomTokenResultListener);

    void removeOnFirebaseCustomTokenResultListener(OnFirebaseCustomTokenResultListener onFirebaseCustomTokenResultListener);
}
