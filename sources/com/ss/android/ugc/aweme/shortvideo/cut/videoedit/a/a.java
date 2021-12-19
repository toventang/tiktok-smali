package com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a;

import com.bytedance.covode.number.Covode;

public final class a<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final C3283a f126142b = new C3283a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final T f126143a;

    /* renamed from: c  reason: collision with root package name */
    private final int f126144c;

    static {
        Covode.recordClassIndex(82824);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.a$a  reason: collision with other inner class name */
    public static final class C3283a {
        static {
            Covode.recordClassIndex(82825);
        }

        private C3283a() {
        }

        public /* synthetic */ C3283a(byte b2) {
            this();
        }

        public static <T> a<T> a(T t) {
            return new a<>(1, t, (byte) 0);
        }

        public static <T> a<T> b(T t) {
            return new a<>(2, t, (byte) 0);
        }
    }

    public final boolean a() {
        if (this.f126144c == 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f126144c == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f126144c == 2) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "InterceptResult(type=" + this.f126144c + ", result=" + ((Object) this.f126143a) + ')';
    }

    private a(int i2, T t) {
        this.f126144c = i2;
        this.f126143a = t;
    }

    public /* synthetic */ a(int i2, Object obj, byte b2) {
        this(i2, obj);
    }
}
