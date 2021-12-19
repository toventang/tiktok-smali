package com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ecommercebase.dto.GImage;
import h.f.b.l;
import java.util.List;

public final class c {

    /* renamed from: i  reason: collision with root package name */
    public static final a f87763i = new a((byte) 0);
    @com.google.gson.a.c(a = StringSet.type)

    /* renamed from: a  reason: collision with root package name */
    public Integer f87764a;
    @com.google.gson.a.c(a = "title")

    /* renamed from: b  reason: collision with root package name */
    public String f87765b;
    @com.google.gson.a.c(a = "content")

    /* renamed from: c  reason: collision with root package name */
    public String f87766c;
    @com.google.gson.a.c(a = "from_price")

    /* renamed from: d  reason: collision with root package name */
    public String f87767d;
    @com.google.gson.a.c(a = "to_price")

    /* renamed from: e  reason: collision with root package name */
    public String f87768e;
    @com.google.gson.a.c(a = "buttons")

    /* renamed from: f  reason: collision with root package name */
    public List<b> f87769f;
    @com.google.gson.a.c(a = "schema")

    /* renamed from: g  reason: collision with root package name */
    public String f87770g;
    @com.google.gson.a.c(a = "image")

    /* renamed from: h  reason: collision with root package name */
    public final GImage f87771h;

    public static final class a {
        static {
            Covode.recordClassIndex(55199);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.c$a$a  reason: collision with other inner class name */
        public static final class C2123a {

            /* renamed from: a  reason: collision with root package name */
            public static final String f87772a = "live_popup_card";

            /* renamed from: b  reason: collision with root package name */
            public static final C2123a f87773b = new C2123a();

            private C2123a() {
            }

            static {
                Covode.recordClassIndex(55200);
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(55198);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f87764a, cVar.f87764a) && l.a(this.f87765b, cVar.f87765b) && l.a(this.f87766c, cVar.f87766c) && l.a(this.f87767d, cVar.f87767d) && l.a(this.f87768e, cVar.f87768e) && l.a(this.f87769f, cVar.f87769f) && l.a(this.f87770g, cVar.f87770g) && l.a(this.f87771h, cVar.f87771h);
    }

    public final int hashCode() {
        Integer num = this.f87764a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f87765b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f87766c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f87767d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f87768e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<b> list = this.f87769f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        String str5 = this.f87770g;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        GImage gImage = this.f87771h;
        if (gImage != null) {
            i2 = gImage.hashCode();
        }
        return hashCode7 + i2;
    }

    public final String toString() {
        return "FansPopUpData(type=" + this.f87764a + ", title=" + this.f87765b + ", content=" + this.f87766c + ", fromPrice=" + this.f87767d + ", toPrice=" + this.f87768e + ", buttons=" + this.f87769f + ", schema=" + this.f87770g + ", image=" + this.f87771h + ")";
    }
}
