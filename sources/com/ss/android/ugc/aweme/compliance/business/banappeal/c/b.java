package com.ss.android.ugc.aweme.compliance.business.banappeal.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;

public abstract class b {
    static {
        Covode.recordClassIndex(47465);
    }

    private b() {
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final String f76782a;

        /* renamed from: b  reason: collision with root package name */
        public final String f76783b;

        /* renamed from: c  reason: collision with root package name */
        public final d f76784c;

        /* renamed from: d  reason: collision with root package name */
        public final a f76785d;

        /* renamed from: e  reason: collision with root package name */
        public final c f76786e;

        static {
            Covode.recordClassIndex(47466);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f76782a, aVar.f76782a) && l.a(this.f76783b, aVar.f76783b) && l.a(this.f76784c, aVar.f76784c) && l.a(this.f76785d, aVar.f76785d) && l.a(this.f76786e, aVar.f76786e);
        }

        public final int hashCode() {
            String str = this.f76782a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f76783b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            d dVar = this.f76784c;
            int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
            a aVar = this.f76785d;
            int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            c cVar = this.f76786e;
            if (cVar != null) {
                i2 = cVar.hashCode();
            }
            return hashCode4 + i2;
        }

        public final String toString() {
            return "AgsViewState(titleText=" + this.f76782a + ", bodyText=" + this.f76783b + ", hyperLinkState=" + this.f76784c + ", positiveButtonState=" + this.f76785d + ", secondButtonState=" + this.f76786e + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, d dVar, a aVar, c cVar) {
            super((byte) 0);
            l.d(str2, "");
            l.d(dVar, "");
            l.d(aVar, "");
            this.f76782a = str;
            this.f76783b = str2;
            this.f76784c = dVar;
            this.f76785d = aVar;
            this.f76786e = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.c.b$b  reason: collision with other inner class name */
    public static final class C1756b extends b {

        /* renamed from: a  reason: collision with root package name */
        public final String f76787a;

        /* renamed from: b  reason: collision with root package name */
        public final String f76788b;

        /* renamed from: c  reason: collision with root package name */
        public final d f76789c;

        /* renamed from: d  reason: collision with root package name */
        public final a f76790d;

        /* renamed from: e  reason: collision with root package name */
        public final a f76791e;

        /* renamed from: f  reason: collision with root package name */
        public final c f76792f;

        /* renamed from: g  reason: collision with root package name */
        public final h.f.a.a<z> f76793g;

        static {
            Covode.recordClassIndex(47467);
        }

        public C1756b() {
            this(null, null, null, null, null, null, 127);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1756b)) {
                return false;
            }
            C1756b bVar = (C1756b) obj;
            return l.a(this.f76787a, bVar.f76787a) && l.a(this.f76788b, bVar.f76788b) && l.a(this.f76789c, bVar.f76789c) && l.a(this.f76790d, bVar.f76790d) && l.a(this.f76791e, bVar.f76791e) && l.a(this.f76792f, bVar.f76792f) && l.a(this.f76793g, bVar.f76793g);
        }

        public final int hashCode() {
            String str = this.f76787a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f76788b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            d dVar = this.f76789c;
            int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
            a aVar = this.f76790d;
            int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            a aVar2 = this.f76791e;
            int hashCode5 = (hashCode4 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
            c cVar = this.f76792f;
            int hashCode6 = (hashCode5 + (cVar != null ? cVar.hashCode() : 0)) * 31;
            h.f.a.a<z> aVar3 = this.f76793g;
            if (aVar3 != null) {
                i2 = aVar3.hashCode();
            }
            return hashCode6 + i2;
        }

        public final String toString() {
            return "AppealViewState(titleText=" + this.f76787a + ", bodyText=" + this.f76788b + ", hyperLinkState=" + this.f76789c + ", positiveButtonState=" + this.f76790d + ", negativeButtonState=" + this.f76791e + ", secondButtonState=" + this.f76792f + ", eventTracker=" + this.f76793g + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C1756b(String str, String str2, d dVar, a aVar, a aVar2, h.f.a.a<z> aVar3) {
            super((byte) 0);
            l.d(str2, "");
            this.f76787a = str;
            this.f76788b = str2;
            this.f76789c = dVar;
            this.f76790d = aVar;
            this.f76791e = aVar2;
            this.f76792f = null;
            this.f76793g = aVar3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C1756b(String str, String str2, d dVar, a aVar, a aVar2, h.f.a.a aVar3, int i2) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : dVar, (i2 & 8) != 0 ? null : aVar, (i2 & 16) != 0 ? null : aVar2, (i2 & 64) == 0 ? aVar3 : null);
        }
    }
}
