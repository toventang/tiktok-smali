package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class bd implements b {

    /* renamed from: a  reason: collision with root package name */
    private final at f15939a;

    static {
        Covode.recordClassIndex(8819);
    }

    bd(at atVar) {
        this.f15939a = atVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        at atVar = this.f15939a;
        atVar.J = !atVar.J;
        atVar.e();
        if (atVar.J) {
            atVar.I = true;
            atVar.D();
        }
        atVar.a(1);
        return z.f158842a;
    }
}
