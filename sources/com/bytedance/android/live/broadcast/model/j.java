package com.bytedance.android.live.broadcast.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Objects;

public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final j f7923b = new j(-1);

    /* renamed from: c  reason: collision with root package name */
    public static final a f7924c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f7925a;

    public static final class a {
        static {
            Covode.recordClassIndex(3924);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int hashCode() {
        long j2 = this.f7925a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    static {
        Covode.recordClassIndex(3923);
    }

    public final String toString() {
        return "MuteDuration(duration=" + this.f7925a + ')';
    }

    public j(long j2) {
        this.f7925a = j2;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l.a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.live.broadcast.model.MuteDuration");
        if (this.f7925a == ((j) obj).f7925a) {
            return true;
        }
        return false;
    }
}
