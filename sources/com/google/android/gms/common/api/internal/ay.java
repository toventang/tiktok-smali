package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.d.g;

/* access modifiers changed from: package-private */
public final class ay extends g {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ aw f50082a;

    static {
        Covode.recordClassIndex(31241);
    }

    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            ((av) message.obj).a(this.f50082a);
        } else if (i2 != 2) {
            int i3 = message.what;
        } else {
            throw ((Throwable) message.obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ay(aw awVar, Looper looper) {
        super(looper);
        this.f50082a = awVar;
    }
}
