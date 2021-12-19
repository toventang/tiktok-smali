package com.google.firebase.iid;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.google.firebase.iid.x;

/* access modifiers changed from: package-private */
public final /* synthetic */ class y implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final x.a f54508a;

    static {
        Covode.recordClassIndex(33828);
    }

    y(x.a aVar) {
        this.f54508a = aVar;
    }

    public final boolean handleMessage(Message message) {
        return this.f54508a.a(message);
    }
}
