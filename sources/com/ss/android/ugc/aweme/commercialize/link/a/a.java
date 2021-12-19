package com.ss.android.ugc.aweme.commercialize.link.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f74497a;

    /* renamed from: b  reason: collision with root package name */
    public final ac f74498b;

    /* renamed from: c  reason: collision with root package name */
    public final Aweme f74499c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f74500d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f74501e;

    /* renamed from: f  reason: collision with root package name */
    public final int f74502f;

    /* renamed from: g  reason: collision with root package name */
    public final long f74503g;

    /* renamed from: h  reason: collision with root package name */
    public final String f74504h;

    static {
        Covode.recordClassIndex(45947);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f74497a, aVar.f74497a) && l.a(this.f74498b, aVar.f74498b) && l.a(this.f74499c, aVar.f74499c) && this.f74500d == aVar.f74500d && this.f74501e == aVar.f74501e && this.f74502f == aVar.f74502f && this.f74503g == aVar.f74503g && l.a(this.f74504h, aVar.f74504h);
    }

    public final String toString() {
        return "AdLinkLogParams(label=" + this.f74497a + ", linkData=" + this.f74498b + ", aweme=" + this.f74499c + ", fromCommentDialog=" + this.f74500d + ", useLinkExtra=" + this.f74501e + ", visibleRatio=" + this.f74502f + ", showDuration=" + this.f74503g + ", refer=" + this.f74504h + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        String str = this.f74497a;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = i2 * 31;
        ac acVar = this.f74498b;
        if (acVar != null) {
            i3 = acVar.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        Aweme aweme = this.f74499c;
        if (aweme != null) {
            i4 = aweme.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        boolean z = this.f74500d;
        int i9 = 1;
        if (z) {
            z = true;
        }
        int i10 = z ? 1 : 0;
        int i11 = z ? 1 : 0;
        int i12 = z ? 1 : 0;
        int i13 = (i8 + i10) * 31;
        if (!this.f74501e) {
            i9 = 0;
        }
        long j2 = this.f74503g;
        int i14 = (((((i13 + i9) * 31) + this.f74502f) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.f74504h;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return i14 + i5;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.a.a$a  reason: collision with other inner class name */
    public static final class C1683a {

        /* renamed from: a  reason: collision with root package name */
        public String f74505a = "";

        /* renamed from: b  reason: collision with root package name */
        public ac f74506b;

        /* renamed from: c  reason: collision with root package name */
        public Aweme f74507c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f74508d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f74509e = true;

        /* renamed from: f  reason: collision with root package name */
        public int f74510f = -1;

        /* renamed from: g  reason: collision with root package name */
        public long f74511g = -1;

        /* renamed from: h  reason: collision with root package name */
        public String f74512h = "";

        static {
            Covode.recordClassIndex(45948);
        }

        public final a a() {
            return new a(this.f74505a, this.f74506b, this.f74507c, this.f74508d, this.f74509e, this.f74510f, this.f74511g, this.f74512h);
        }

        public final C1683a a(int i2) {
            this.f74510f = i2;
            return this;
        }

        public final C1683a a(long j2) {
            this.f74511g = j2;
            return this;
        }

        public final C1683a a(ac acVar) {
            this.f74506b = acVar;
            return this;
        }

        public final C1683a a(Aweme aweme) {
            this.f74507c = aweme;
            return this;
        }

        public final C1683a a(String str) {
            if (str == null) {
                str = "";
            }
            this.f74505a = str;
            return this;
        }

        public final C1683a a(boolean z) {
            this.f74508d = z;
            return this;
        }
    }

    public final void b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                long j2 = this.f74503g;
                if (j2 >= 0) {
                    jSONObject.put("duration", j2);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("ad_extra_data")) {
                    jSONObject2 = jSONObject.getJSONObject("ad_extra_data");
                    l.b(jSONObject2, "");
                } else {
                    jSONObject2 = new JSONObject();
                }
                int i2 = this.f74502f;
                if (i2 >= 0) {
                    jSONObject2.put("pixel_pct", i2);
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public a(String str, ac acVar, Aweme aweme, boolean z, boolean z2, int i2, long j2, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f74497a = str;
        this.f74498b = acVar;
        this.f74499c = aweme;
        this.f74500d = z;
        this.f74501e = z2;
        this.f74502f = i2;
        this.f74503g = j2;
        this.f74504h = str2;
    }
}
