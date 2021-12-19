package com.bytedance.hybrid.spark;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.d.o;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static b f31109a;

    /* renamed from: b  reason: collision with root package name */
    public static a f31110b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f31111c = new a((byte) 0);

    static {
        Covode.recordClassIndex(18067);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(18068);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f31127a;

        /* renamed from: b  reason: collision with root package name */
        public o.a.EnumC0658a f31128b;

        static {
            Covode.recordClassIndex(18069);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f31127a == bVar.f31127a && l.a(this.f31128b, bVar.f31128b);
        }

        public final int hashCode() {
            int i2 = this.f31127a * 31;
            o.a.EnumC0658a aVar = this.f31128b;
            return i2 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "DefaultUIConfig(defaultStatusBarBgColor=" + this.f31127a + ", defaultStatusFontMode=" + this.f31128b + ")";
        }

        public /* synthetic */ b() {
            this(o.a.EnumC0658a.DARK);
        }

        private b(o.a.EnumC0658a aVar) {
            l.c(aVar, "");
            this.f31127a = 0;
            this.f31128b = aVar;
        }
    }
}
