package com.google.c.a;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Objects;

public final class h {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f53689a;

        /* renamed from: b  reason: collision with root package name */
        private final C1230a f53690b;

        /* renamed from: c  reason: collision with root package name */
        private C1230a f53691c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f53692d;

        static {
            Covode.recordClassIndex(33243);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.google.c.a.h$a$a  reason: collision with other inner class name */
        public static final class C1230a {

            /* renamed from: a  reason: collision with root package name */
            String f53693a;

            /* renamed from: b  reason: collision with root package name */
            Object f53694b;

            /* renamed from: c  reason: collision with root package name */
            C1230a f53695c;

            static {
                Covode.recordClassIndex(33244);
            }

            private C1230a() {
            }

            /* synthetic */ C1230a(byte b2) {
                this();
            }
        }

        private C1230a a() {
            C1230a aVar = new C1230a((byte) 0);
            this.f53691c.f53695c = aVar;
            this.f53691c = aVar;
            return aVar;
        }

        public final String toString() {
            boolean z = this.f53692d;
            StringBuilder append = new StringBuilder(32).append(this.f53689a).append('{');
            String str = "";
            for (C1230a aVar = this.f53690b.f53695c; aVar != null; aVar = aVar.f53695c) {
                Object obj = aVar.f53694b;
                if (!z || obj != null) {
                    append.append(str);
                    if (aVar.f53693a != null) {
                        append.append(aVar.f53693a).append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        append.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        append.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            return append.append('}').toString();
        }

        public final a a(Object obj) {
            a().f53694b = obj;
            return this;
        }

        private a(String str) {
            C1230a aVar = new C1230a((byte) 0);
            this.f53690b = aVar;
            this.f53691c = aVar;
            this.f53692d = false;
            this.f53689a = (String) k.a(str);
        }

        /* synthetic */ a(String str, byte b2) {
            this(str);
        }

        public final a a(String str, int i2) {
            return a(str, String.valueOf(i2));
        }

        public final a a(String str, long j2) {
            return a(str, String.valueOf(j2));
        }

        public final a a(String str, Object obj) {
            C1230a a2 = a();
            a2.f53694b = obj;
            a2.f53693a = (String) k.a(str);
            return this;
        }
    }

    static {
        Covode.recordClassIndex(33242);
    }

    public static a a(Object obj) {
        return new a(obj.getClass().getSimpleName(), (byte) 0);
    }

    public static <T> T a(T t, T t2) {
        if (t != null) {
            return t;
        }
        Objects.requireNonNull(t2, "Both parameters are null");
        return t2;
    }
}
