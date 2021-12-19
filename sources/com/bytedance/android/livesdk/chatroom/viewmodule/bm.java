package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.graphics.Color;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class bm implements b {

    /* renamed from: a  reason: collision with root package name */
    private final FullVideoButtonWidget f16494a;

    static {
        Covode.recordClassIndex(9130);
    }

    bm(FullVideoButtonWidget fullVideoButtonWidget) {
        this.f16494a = fullVideoButtonWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        this.f16494a.getView().setBackgroundColor(((Boolean) obj).booleanValue() ? 0 : Color.parseColor("#2B2B2B"));
        return z.f158842a;
    }
}
