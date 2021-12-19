package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class dj implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final dd f16127a;

    /* renamed from: b  reason: collision with root package name */
    private final View f16128b;

    static {
        Covode.recordClassIndex(8935);
    }

    dj(dd ddVar, View view) {
        this.f16127a = ddVar;
        this.f16128b = view;
    }

    public final void run() {
        this.f16127a.a(this.f16128b);
    }
}
