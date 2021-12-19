package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class du implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final dq f16180a;

    /* renamed from: b  reason: collision with root package name */
    private final long f16181b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16182c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16183d;

    static {
        Covode.recordClassIndex(8950);
    }

    du(dq dqVar, long j2, int i2, int i3) {
        this.f16180a = dqVar;
        this.f16181b = j2;
        this.f16182c = i2;
        this.f16183d = i3;
    }

    public final void run() {
        this.f16180a.a(this.f16181b, this.f16182c, this.f16183d);
    }
}
