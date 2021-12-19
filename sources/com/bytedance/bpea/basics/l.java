package com.bytedance.bpea.basics;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public a f26610a = new a();

    /* renamed from: b  reason: collision with root package name */
    public final a f26611b;

    /* renamed from: c  reason: collision with root package name */
    public a f26612c;

    static {
        Covode.recordClassIndex(15671);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f26613a;

        /* renamed from: b  reason: collision with root package name */
        public long f26614b;

        static {
            Covode.recordClassIndex(15672);
        }

        public final long a() {
            long j2 = this.f26614b - this.f26613a;
            if (j2 < 0) {
                return 0;
            }
            return j2;
        }

        public final String toString() {
            return "TimeAnchorBean(startTime=" + this.f26613a + ", endTime=" + this.f26614b + ",costTime=" + a() + ')';
        }
    }

    public final void a() {
        this.f26610a.f26614b = System.currentTimeMillis();
        this.f26611b.f26614b = System.nanoTime();
        this.f26612c.f26614b = SystemClock.currentThreadTimeMillis();
    }

    public l() {
        a aVar = new a();
        this.f26611b = aVar;
        this.f26612c = new a();
        this.f26610a.f26613a = System.currentTimeMillis();
        aVar.f26613a = System.nanoTime();
        this.f26612c.f26613a = SystemClock.currentThreadTimeMillis();
    }

    public final String toString() {
        return "TimeAnchor(absoluteTime=" + this.f26610a + ", threadTime=" + this.f26612c + ", nanoTime=" + this.f26611b + ')';
    }
}
