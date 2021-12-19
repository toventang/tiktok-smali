package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f54462a;

    static {
        Covode.recordClassIndex(33805);
    }

    i(FirebaseInstanceId firebaseInstanceId) {
        this.f54462a = firebaseInstanceId;
    }

    public final void run() {
        this.f54462a.lambda$new$0$FirebaseInstanceId();
    }
}
