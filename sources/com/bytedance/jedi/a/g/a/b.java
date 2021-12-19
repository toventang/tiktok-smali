package com.bytedance.jedi.a.g.a;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Objects;

public final class b {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f39132a;

        /* renamed from: b  reason: collision with root package name */
        private final C0948a f39133b;

        /* renamed from: c  reason: collision with root package name */
        private C0948a f39134c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f39135d;

        static {
            Covode.recordClassIndex(23985);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.jedi.a.g.a.b$a$a  reason: collision with other inner class name */
        public static final class C0948a {

            /* renamed from: a  reason: collision with root package name */
            String f39136a;

            /* renamed from: b  reason: collision with root package name */
            Object f39137b;

            /* renamed from: c  reason: collision with root package name */
            C0948a f39138c;

            static {
                Covode.recordClassIndex(23986);
            }

            private C0948a() {
            }

            /* synthetic */ C0948a(byte b2) {
                this();
            }
        }

        private C0948a a() {
            C0948a aVar = new C0948a((byte) 0);
            this.f39134c.f39138c = aVar;
            this.f39134c = aVar;
            return aVar;
        }

        public final String toString() {
            boolean z = this.f39135d;
            StringBuilder append = new StringBuilder(32).append(this.f39132a).append('{');
            String str = "";
            for (C0948a aVar = this.f39133b.f39138c; aVar != null; aVar = aVar.f39138c) {
                Object obj = aVar.f39137b;
                if (!z || obj != null) {
                    append.append(str);
                    if (aVar.f39136a != null) {
                        append.append(aVar.f39136a).append('=');
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
            a().f39137b = obj;
            return this;
        }

        private a(String str) {
            C0948a aVar = new C0948a((byte) 0);
            this.f39133b = aVar;
            this.f39134c = aVar;
            this.f39135d = false;
            this.f39132a = (String) c.a(str);
        }

        public /* synthetic */ a(String str, byte b2) {
            this(str);
        }

        public final a a(String str, int i2) {
            return a(str, String.valueOf(i2));
        }

        public final a a(String str, long j2) {
            return a(str, String.valueOf(j2));
        }

        public final a a(String str, Object obj) {
            C0948a a2 = a();
            a2.f39137b = obj;
            a2.f39136a = (String) c.a(str);
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23984);
    }

    public static <T> T a(T t, T t2) {
        if (t != null) {
            return t;
        }
        Objects.requireNonNull(t2, "Both parameters are null");
        return t2;
    }
}
