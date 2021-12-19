package com.bytedance.android.livesdk.chatroom.g;

import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.bytedance.covode.number.Covode;

public final class q implements a.AbstractC0502a {

    /* renamed from: a  reason: collision with root package name */
    public static long f15568a = 10000;

    /* renamed from: b  reason: collision with root package name */
    public long f15569b;

    /* renamed from: c  reason: collision with root package name */
    public a f15570c = new a(this);

    /* renamed from: d  reason: collision with root package name */
    public boolean f15571d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15572e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15573f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15574g = true;

    static {
        Covode.recordClassIndex(8605);
    }

    public final void a() {
        if (this.f15571d && !this.f15572e) {
            this.f15571d = false;
            this.f15573f = true;
            this.f15570c.removeCallbacksAndMessages(null);
        }
    }

    public final void b() {
        this.f15571d = false;
        this.f15573f = false;
        this.f15572e = false;
        this.f15574g = true;
        this.f15570c.removeCallbacksAndMessages(null);
    }

    @Override // com.bytedance.android.livesdkapi.depend.c.a.AbstractC0502a
    public final void handleMsg(Message message) {
        if (!this.f15573f && message.what == 100) {
            if (this.f15574g) {
                this.f15574g = false;
            }
            this.f15569b = SystemClock.elapsedRealtime();
            this.f15570c.sendEmptyMessageDelayed(100, f15568a);
        }
    }
}
