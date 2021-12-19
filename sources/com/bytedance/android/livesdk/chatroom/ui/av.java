package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class av implements b {

    /* renamed from: a  reason: collision with root package name */
    private final at f15916a;

    static {
        Covode.recordClassIndex(8800);
    }

    av(at atVar) {
        this.f15916a = atVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        at atVar = this.f15916a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (!atVar.I && booleanValue) {
            atVar.I = true;
            atVar.D();
            atVar.a(0);
        }
        return z.f158842a;
    }
}
