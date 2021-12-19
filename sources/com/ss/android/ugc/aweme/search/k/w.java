package com.ss.android.ugc.aweme.search.k;

import com.bytedance.covode.number.Covode;

public final class w extends c<w> {
    public static final a q = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f121287a = -1;

    /* renamed from: b  reason: collision with root package name */
    public long f121288b = -1;

    static {
        Covode.recordClassIndex(79051);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79052);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public w() {
        super("music_play_time");
    }

    @Override // com.ss.android.ugc.aweme.metrics.c, com.ss.android.ugc.aweme.search.k.b
    public final void a() {
        super.a();
        int i2 = this.f121287a;
        if (i2 != -1) {
            a("time", String.valueOf(i2));
        }
        long j2 = this.f121288b;
        if (j2 != -1) {
            a("stay_time", String.valueOf(j2));
        }
    }
}
