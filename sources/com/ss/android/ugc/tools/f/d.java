package com.ss.android.ugc.tools.f;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public interface d {
    static {
        Covode.recordClassIndex(98250);
    }

    String a();

    void a(a aVar);

    void a(String str);

    void a(String str, int i2, String str2);

    void a(String str, String str2);

    void a(String str, String str2, String str3);

    void a(String str, boolean z);

    String b();

    void b(String str, String str2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f149196a;

        /* renamed from: b  reason: collision with root package name */
        public final String f149197b;

        /* renamed from: c  reason: collision with root package name */
        public final String f149198c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f149199d;

        static {
            Covode.recordClassIndex(98251);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f149196a, aVar.f149196a) && l.a(this.f149197b, aVar.f149197b) && l.a(this.f149198c, aVar.f149198c) && this.f149199d == aVar.f149199d;
        }

        public final int hashCode() {
            String str = this.f149196a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f149197b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f149198c;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            int i3 = (hashCode2 + i2) * 31;
            boolean z = this.f149199d;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            return i3 + i4;
        }

        public final String toString() {
            return "SelectParam(giphyId=" + this.f149196a + ", stickerId=" + this.f149197b + ", tabName=" + this.f149198c + ", isImage=" + this.f149199d + ")";
        }

        public a(String str, String str2, String str3, boolean z) {
            l.d(str3, "");
            this.f149196a = str;
            this.f149197b = str2;
            this.f149198c = str3;
            this.f149199d = z;
        }
    }
}
