package com.facebook.common.d;

import com.bytedance.covode.number.Covode;

public final class h {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f47071a;

        /* renamed from: b  reason: collision with root package name */
        private C1166a f47072b;

        /* renamed from: c  reason: collision with root package name */
        private C1166a f47073c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f47074d;

        static {
            Covode.recordClassIndex(28637);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.facebook.common.d.h$a$a  reason: collision with other inner class name */
        public static final class C1166a {

            /* renamed from: a  reason: collision with root package name */
            String f47075a;

            /* renamed from: b  reason: collision with root package name */
            Object f47076b;

            /* renamed from: c  reason: collision with root package name */
            C1166a f47077c;

            static {
                Covode.recordClassIndex(28638);
            }

            private C1166a() {
            }

            /* synthetic */ C1166a(byte b2) {
                this();
            }
        }

        private C1166a a() {
            C1166a aVar = new C1166a((byte) 0);
            this.f47073c.f47077c = aVar;
            this.f47073c = aVar;
            return aVar;
        }

        public final String toString() {
            boolean z = this.f47074d;
            StringBuilder append = new StringBuilder(32).append(this.f47071a).append('{');
            String str = "";
            for (C1166a aVar = this.f47072b.f47077c; aVar != null; aVar = aVar.f47077c) {
                if (!z || aVar.f47076b != null) {
                    append.append(str);
                    if (aVar.f47075a != null) {
                        append.append(aVar.f47075a).append('=');
                    }
                    append.append(aVar.f47076b);
                    str = ", ";
                }
            }
            return append.append('}').toString();
        }

        private a(String str) {
            C1166a aVar = new C1166a((byte) 0);
            this.f47072b = aVar;
            this.f47073c = aVar;
            this.f47074d = false;
            this.f47071a = (String) i.a(str);
        }

        /* synthetic */ a(String str, byte b2) {
            this(str);
        }

        public final a a(String str, int i2) {
            return a(str, String.valueOf(i2));
        }

        public final a a(String str, Object obj) {
            C1166a a2 = a();
            a2.f47076b = obj;
            a2.f47075a = (String) i.a(str);
            return this;
        }

        public final a a(String str, boolean z) {
            return a(str, String.valueOf(z));
        }
    }

    static {
        Covode.recordClassIndex(28636);
    }

    public static a a(Object obj) {
        String replaceAll = obj.getClass().getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return new a(replaceAll.substring(lastIndexOf + 1), (byte) 0);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }
}
