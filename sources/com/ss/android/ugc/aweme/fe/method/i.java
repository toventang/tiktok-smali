package com.ss.android.ugc.aweme.fe.method;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    private final e f91306a;

    /* renamed from: b  reason: collision with root package name */
    private final int f91307b;

    static {
        Covode.recordClassIndex(57466);
    }

    i(e eVar, int i2) {
        this.f91306a = eVar;
        this.f91307b = i2;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        this.f91306a.a(this.f91307b, message);
    }
}
