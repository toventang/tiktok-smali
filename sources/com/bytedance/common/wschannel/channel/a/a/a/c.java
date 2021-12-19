package com.bytedance.common.wschannel.channel.a.a.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private final int f27050a;

    /* renamed from: b  reason: collision with root package name */
    private int f27051b;

    static {
        Covode.recordClassIndex(15972);
    }

    @Override // com.bytedance.common.wschannel.channel.a.a.a.a, com.bytedance.common.wschannel.channel.a.a.a.b
    public final void c() {
        super.c();
        this.f27051b = 0;
    }

    @Override // com.bytedance.common.wschannel.channel.a.a.a.a
    public final long a() {
        if (this.f27051b >= this.f27050a) {
            return -1;
        }
        long a2 = super.a();
        if (a2 == -1) {
            return a2;
        }
        this.f27051b++;
        return a2;
    }

    public final String toString() {
        return "RetryTimesPolicy{mMaxRetryTime=" + this.f27050a + ", mCurrRetryTime=" + this.f27051b + '}';
    }

    public c(Context context) {
        this(context, (byte) 0);
    }

    private c(Context context, byte b2) {
        super(context);
        this.f27050a = 4;
    }
}
