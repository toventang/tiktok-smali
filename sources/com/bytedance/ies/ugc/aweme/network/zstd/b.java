package com.bytedance.ies.ugc.aweme.network.zstd;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final c f35042a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final b f35043b = new b();

    public static final class c {
        @com.google.gson.a.c(a = "zstd_dict")

        /* renamed from: a  reason: collision with root package name */
        public final C0789b f35048a;

        static {
            Covode.recordClassIndex(21030);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && l.a(this.f35048a, ((c) obj).f35048a);
            }
            return true;
        }

        public final int hashCode() {
            C0789b bVar = this.f35048a;
            if (bVar != null) {
                return bVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ZstdDictConfigWrapper(config=" + this.f35048a + ")";
        }
    }

    private b() {
    }

    public static final class a {
        @com.google.gson.a.c(a = "url")

        /* renamed from: a  reason: collision with root package name */
        public final String f35044a = null;
        @com.google.gson.a.c(a = "checksum")

        /* renamed from: b  reason: collision with root package name */
        public final String f35045b = null;

        static {
            Covode.recordClassIndex(21028);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f35044a, aVar.f35044a) && l.a(this.f35045b, aVar.f35045b);
        }

        public final int hashCode() {
            String str = this.f35044a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f35045b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "DictUrl(url=" + this.f35044a + ", checksum=" + this.f35045b + ")";
        }

        private a() {
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.zstd.b$b  reason: collision with other inner class name */
    public static final class C0789b {
        @com.google.gson.a.c(a = "path")

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, String> f35046a = null;
        @com.google.gson.a.c(a = "version_url")

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, a> f35047b = null;

        static {
            Covode.recordClassIndex(21029);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0789b)) {
                return false;
            }
            C0789b bVar = (C0789b) obj;
            return l.a(this.f35046a, bVar.f35046a) && l.a(this.f35047b, bVar.f35047b);
        }

        public final int hashCode() {
            Map<String, String> map = this.f35046a;
            int i2 = 0;
            int hashCode = (map != null ? map.hashCode() : 0) * 31;
            Map<String, a> map2 = this.f35047b;
            if (map2 != null) {
                i2 = map2.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "ZstdDictConfig(path=" + this.f35046a + ", versionUrl=" + this.f35047b + ")";
        }

        private C0789b() {
        }
    }

    static {
        Covode.recordClassIndex(21027);
    }
}
