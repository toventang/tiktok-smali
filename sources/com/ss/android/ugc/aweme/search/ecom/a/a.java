package com.ss.android.ugc.aweme.search.ecom.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.util.List;

public final class a {
    @c(a = "product_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f121033a = null;
    @c(a = "title")

    /* renamed from: b  reason: collision with root package name */
    public final String f121034b = null;
    @c(a = "cover")

    /* renamed from: c  reason: collision with root package name */
    public final String f121035c = null;
    @c(a = "elastic_title")

    /* renamed from: d  reason: collision with root package name */
    public final String f121036d = null;
    @c(a = "img")

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f121037e = null;
    @c(a = "format_price")

    /* renamed from: f  reason: collision with root package name */
    public final String f121038f = null;
    @c(a = "activity_info")

    /* renamed from: g  reason: collision with root package name */
    public final C3132a f121039g = null;
    @c(a = "schema")

    /* renamed from: h  reason: collision with root package name */
    public final String f121040h = null;
    @c(a = "detail_url")

    /* renamed from: i  reason: collision with root package name */
    public final String f121041i = null;
    @c(a = "platform")

    /* renamed from: j  reason: collision with root package name */
    public final Integer f121042j = null;
    @c(a = "source_from")

    /* renamed from: k  reason: collision with root package name */
    public final String f121043k = null;
    @c(a = "source")

    /* renamed from: l  reason: collision with root package name */
    public final String f121044l = null;
    @c(a = "extra")

    /* renamed from: m  reason: collision with root package name */
    public final b f121045m = null;

    public static final class b {
        @c(a = "is_pinned")

        /* renamed from: a  reason: collision with root package name */
        public final int f121048a;

        static {
            Covode.recordClassIndex(78855);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && this.f121048a == ((b) obj).f121048a;
            }
            return true;
        }

        public final int hashCode() {
            return this.f121048a;
        }

        public final String toString() {
            return "ExtraInfo(isPinned=" + this.f121048a + ")";
        }
    }

    static {
        Covode.recordClassIndex(78853);
    }

    public final int hashCode() {
        String str = this.f121033a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f121034b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f121035c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f121036d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<String> list = this.f121037e;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str5 = this.f121038f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        C3132a aVar = this.f121039g;
        int hashCode7 = (hashCode6 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str6 = this.f121040h;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f121041i;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Integer num = this.f121042j;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        String str8 = this.f121043k;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f121044l;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
        b bVar = this.f121045m;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode12 + i2;
    }

    public final String toString() {
        return "Product(id=" + this.f121033a + ", title=" + this.f121034b + ", cover=" + this.f121035c + ", elasticTitle=" + this.f121036d + ", imgUrlList=" + this.f121037e + ", formatPrice=" + this.f121038f + ", activityInfo=" + this.f121039g + ", schema=" + this.f121040h + ", detailUrl=" + this.f121041i + ", platform=" + this.f121042j + ", sourceFrom=" + this.f121043k + ", source=" + this.f121044l + ", extra=" + this.f121045m + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.search.ecom.a.a$a  reason: collision with other inner class name */
    public static final class C3132a {
        @c(a = StringSet.name)

        /* renamed from: a  reason: collision with root package name */
        public final String f121046a = null;
        @c(a = "icon")

        /* renamed from: b  reason: collision with root package name */
        public final UrlModel f121047b = null;

        static {
            Covode.recordClassIndex(78854);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3132a)) {
                return false;
            }
            C3132a aVar = (C3132a) obj;
            return l.a(this.f121046a, aVar.f121046a) && l.a(this.f121047b, aVar.f121047b);
        }

        public final int hashCode() {
            String str = this.f121046a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            UrlModel urlModel = this.f121047b;
            if (urlModel != null) {
                i2 = urlModel.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "ActivityInfo(name=" + this.f121046a + ", iconUrl=" + this.f121047b + ")";
        }

        private C3132a() {
        }
    }

    private a() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return l.a((Object) ((a) obj).f121033a, (Object) this.f121033a);
        }
        return false;
    }
}
