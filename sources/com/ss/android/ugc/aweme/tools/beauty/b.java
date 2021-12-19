package com.ss.android.ugc.aweme.tools.beauty;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f138833c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f138834a;

    /* renamed from: b  reason: collision with root package name */
    public final int f138835b;

    static {
        Covode.recordClassIndex(90801);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f138834a, bVar.f138834a) && this.f138835b == bVar.f138835b;
    }

    public final int hashCode() {
        String str = this.f138834a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f138835b;
    }

    public final String toString() {
        return "BeautySequence(effectId=" + this.f138834a + ", type=" + this.f138835b + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90802);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public /* synthetic */ b(String str) {
        this(str, 1);
    }

    public b(String str, int i2) {
        l.d(str, "");
        this.f138834a = str;
        this.f138835b = i2;
    }
}
