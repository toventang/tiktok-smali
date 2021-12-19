package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.chatroom.ui.bg;
import com.bytedance.android.livesdk.utils.o;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class bm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bg f15975a;

    /* renamed from: b  reason: collision with root package name */
    private final bg.a f15976b;

    static {
        Covode.recordClassIndex(8837);
    }

    bm(bg bgVar, bg.a aVar) {
        this.f15975a = bgVar;
        this.f15976b = aVar;
    }

    public final void run() {
        bg bgVar = this.f15975a;
        if (this.f15976b == bg.a.Keyboard) {
            o.a(bgVar.getContext(), bgVar.f15952k);
        } else {
            bgVar.g();
        }
    }
}
