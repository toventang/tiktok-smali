package com.ss.android.ugc.aweme.effect.c.b;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f88923c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f88924a;

    /* renamed from: b  reason: collision with root package name */
    public final float f88925b;

    static {
        Covode.recordClassIndex(55927);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55928);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static b a(float f2) {
            return new b(1, f2, (byte) 0);
        }

        public static b b(float f2) {
            return new b(0, f2, (byte) 0);
        }
    }

    public final String toString() {
        return "op = " + this.f88924a + ", duration = " + this.f88925b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f88924a == bVar.f88924a && this.f88925b == bVar.f88925b) {
                return true;
            }
            return false;
        }
        return false;
    }

    private b(int i2, float f2) {
        this.f88924a = i2;
        this.f88925b = f2;
    }

    public /* synthetic */ b(int i2, float f2, byte b2) {
        this(i2, f2);
    }
}
