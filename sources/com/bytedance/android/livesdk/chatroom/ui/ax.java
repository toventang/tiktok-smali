package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.chatroom.model.k;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ax implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final at f15918a;

    static {
        Covode.recordClassIndex(8802);
    }

    ax(at atVar) {
        this.f15918a = atVar;
    }

    public final void run() {
        at atVar = this.f15918a;
        k kVar = new k();
        kVar.f15787a = atVar.J;
        a.a().a(kVar);
    }
}
