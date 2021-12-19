package com.ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;

public interface f {
    static {
        Covode.recordClassIndex(75134);
    }

    a a();

    void a(int i2);

    void b();

    String c();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f116375a;

        /* renamed from: b  reason: collision with root package name */
        public final String f116376b;

        /* renamed from: c  reason: collision with root package name */
        public final String f116377c;

        /* renamed from: d  reason: collision with root package name */
        public final String f116378d;

        /* renamed from: e  reason: collision with root package name */
        public final Map<String, String> f116379e;

        static {
            Covode.recordClassIndex(75135);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f116375a, aVar.f116375a) && l.a(this.f116376b, aVar.f116376b) && l.a(this.f116377c, aVar.f116377c) && l.a(this.f116378d, aVar.f116378d) && l.a(this.f116379e, aVar.f116379e);
        }

        public final int hashCode() {
            String str = this.f116375a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f116376b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f116377c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f116378d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Map<String, String> map = this.f116379e;
            if (map != null) {
                i2 = map.hashCode();
            }
            return hashCode4 + i2;
        }

        public final String toString() {
            return "Config(roomId=" + this.f116375a + ", anchorId=" + this.f116376b + ", enterFromMerge=" + this.f116377c + ", enterMethod=" + this.f116378d + ", extras=" + this.f116379e + ")";
        }

        public a(String str, String str2, String str3, String str4, Map<String, String> map) {
            l.d(map, "");
            this.f116375a = str;
            this.f116376b = str2;
            this.f116377c = str3;
            this.f116378d = str4;
            this.f116379e = map;
        }
    }
}
