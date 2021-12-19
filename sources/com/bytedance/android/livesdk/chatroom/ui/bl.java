package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.utils.o;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bg f15971a;

    /* renamed from: b  reason: collision with root package name */
    private final long f15972b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15973c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15974d;

    static {
        Covode.recordClassIndex(8836);
    }

    bl(bg bgVar, long j2, int i2, int i3) {
        this.f15971a = bgVar;
        this.f15972b = j2;
        this.f15973c = i2;
        this.f15974d = i3;
    }

    public final void run() {
        bg bgVar = this.f15971a;
        long j2 = this.f15972b;
        int i2 = this.f15973c;
        int i3 = this.f15974d;
        if (bgVar.isResumed() && bgVar.f15945d) {
            o.a(bgVar.getContext(), bgVar.f15952k);
            bgVar.a(j2, i2 + 1, i3);
        }
    }
}
