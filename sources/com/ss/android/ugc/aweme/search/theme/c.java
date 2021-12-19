package com.ss.android.ugc.aweme.search.theme;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f121704a;

    /* renamed from: b  reason: collision with root package name */
    public final int f121705b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f121706c;

    /* renamed from: d  reason: collision with root package name */
    public final a f121707d;

    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final C3150a f121708c = new C3150a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public final int f121709a;

        /* renamed from: b  reason: collision with root package name */
        public final Float f121710b;

        static {
            Covode.recordClassIndex(79271);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f121709a == aVar.f121709a && l.a(this.f121710b, aVar.f121710b);
        }

        public final int hashCode() {
            int i2 = this.f121709a * 31;
            Float f2 = this.f121710b;
            return i2 + (f2 != null ? f2.hashCode() : 0);
        }

        public final String toString() {
            return "AnimationInfo(state=" + this.f121709a + ", animatedFraction=" + this.f121710b + ")";
        }

        /* renamed from: com.ss.android.ugc.aweme.search.theme.c$a$a  reason: collision with other inner class name */
        public static final class C3150a {
            static {
                Covode.recordClassIndex(79272);
            }

            private C3150a() {
            }

            public /* synthetic */ C3150a(byte b2) {
                this();
            }
        }

        public /* synthetic */ a(int i2) {
            this(i2, null);
        }

        public a(int i2, Float f2) {
            this.f121709a = i2;
            this.f121710b = f2;
        }
    }

    static {
        Covode.recordClassIndex(79270);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f121704a, cVar.f121704a) && this.f121705b == cVar.f121705b && l.a(this.f121706c, cVar.f121706c) && l.a(this.f121707d, cVar.f121707d);
    }

    public final int hashCode() {
        String str = this.f121704a;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f121705b) * 31;
        Integer num = this.f121706c;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        a aVar = this.f121707d;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "SearchThemeInfo(theme=" + this.f121704a + ", backgroundColor=" + this.f121705b + ", maxIndex=" + this.f121706c + ", animInfo=" + this.f121707d + ")";
    }

    public static /* synthetic */ c a(c cVar, a aVar) {
        String str = cVar.f121704a;
        int i2 = cVar.f121705b;
        Integer num = cVar.f121706c;
        l.d(str, "");
        return new c(str, i2, num, aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i2, Integer num, int i3) {
        this(str, i2, (i3 & 4) != 0 ? null : num, (a) null);
    }

    private c(String str, int i2, Integer num, a aVar) {
        l.d(str, "");
        this.f121704a = str;
        this.f121705b = i2;
        this.f121706c = num;
        this.f121707d = aVar;
    }
}
