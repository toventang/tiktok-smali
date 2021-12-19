package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.d.g;

/* access modifiers changed from: package-private */
public final class ar extends g {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ aq f50065a;

    static {
        Covode.recordClassIndex(31234);
    }

    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            aq aqVar = this.f50065a;
            aqVar.f50053b.lock();
            try {
                if (aqVar.i()) {
                    aqVar.h();
                }
            } finally {
                aqVar.f50053b.unlock();
            }
        } else if (i2 != 2) {
            int i3 = message.what;
        } else {
            aq.a(this.f50065a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ar(aq aqVar, Looper looper) {
        super(looper);
        this.f50065a = aqVar;
    }
}
