package com.ss.ttm.player;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.bytedance.covode.number.Covode;
import com.ss.ttm.a.e;

final class c {

    /* renamed from: a  reason: collision with root package name */
    final a f152032a;

    /* renamed from: b  reason: collision with root package name */
    int f152033b;

    /* renamed from: c  reason: collision with root package name */
    long f152034c;

    /* renamed from: d  reason: collision with root package name */
    long f152035d;

    /* renamed from: e  reason: collision with root package name */
    long f152036e;

    /* renamed from: f  reason: collision with root package name */
    long f152037f;

    static {
        Covode.recordClassIndex(101330);
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final AudioTrack f152038a;

        /* renamed from: b  reason: collision with root package name */
        final AudioTimestamp f152039b = new AudioTimestamp();

        /* renamed from: c  reason: collision with root package name */
        long f152040c;

        /* renamed from: d  reason: collision with root package name */
        long f152041d;

        /* renamed from: e  reason: collision with root package name */
        public long f152042e;

        static {
            Covode.recordClassIndex(101331);
        }

        public final long a() {
            return this.f152039b.nanoTime / 1000;
        }

        public a(AudioTrack audioTrack) {
            this.f152038a = audioTrack;
        }
    }

    public final void a() {
        if (this.f152032a != null) {
            a(0);
        }
    }

    public final long b() {
        a aVar = this.f152032a;
        if (aVar != null) {
            return aVar.a();
        }
        return -9223372036854775807L;
    }

    public final long c() {
        a aVar = this.f152032a;
        if (aVar != null) {
            return aVar.f152042e;
        }
        return -1;
    }

    public c(AudioTrack audioTrack) {
        if (e.f151888a >= 19) {
            this.f152032a = new a(audioTrack);
            a();
            return;
        }
        this.f152032a = null;
        a(3);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        this.f152033b = i2;
        if (i2 == 0) {
            this.f152036e = 0;
            this.f152037f = -1;
            this.f152034c = System.nanoTime() / 1000;
            this.f152035d = 5000;
        } else if (i2 == 1) {
            this.f152035d = 5000;
        } else if (i2 == 2 || i2 == 3) {
            this.f152035d = 10000000;
        } else if (i2 == 4) {
            this.f152035d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }
}
