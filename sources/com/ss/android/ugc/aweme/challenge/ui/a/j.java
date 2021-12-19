package com.ss.android.ugc.aweme.challenge.ui.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import h.f.b.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public k f70083a;

    /* renamed from: b  reason: collision with root package name */
    public c f70084b;

    /* renamed from: c  reason: collision with root package name */
    public d f70085c;

    /* renamed from: d  reason: collision with root package name */
    public String f70086d;

    /* renamed from: e  reason: collision with root package name */
    public String f70087e;

    /* renamed from: f  reason: collision with root package name */
    public final ChallengeDetailParam f70088f;

    static {
        Covode.recordClassIndex(43229);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f70083a, jVar.f70083a) && l.a(this.f70084b, jVar.f70084b) && l.a(this.f70085c, jVar.f70085c) && l.a(this.f70086d, jVar.f70086d) && l.a(this.f70087e, jVar.f70087e) && l.a(this.f70088f, jVar.f70088f);
    }

    public final int hashCode() {
        k kVar = this.f70083a;
        int i2 = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        c cVar = this.f70084b;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        d dVar = this.f70085c;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        String str = this.f70086d;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f70087e;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ChallengeDetailParam challengeDetailParam = this.f70088f;
        if (challengeDetailParam != null) {
            i2 = challengeDetailParam.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "HeaderParam(headerType=" + this.f70083a + ", attrsType=" + this.f70084b + ", buttonType=" + this.f70085c + ", enterFrom=" + this.f70086d + ", processId=" + this.f70087e + ", detailParam=" + this.f70088f + ")";
    }

    public /* synthetic */ j(String str, String str2, ChallengeDetailParam challengeDetailParam) {
        this(k.TYPE_NORMAL, c.TYPE_LINK, d.TYPE_NORMAL, str, str2, challengeDetailParam);
    }

    private j(k kVar, c cVar, d dVar, String str, String str2, ChallengeDetailParam challengeDetailParam) {
        l.d(kVar, "");
        l.d(cVar, "");
        l.d(dVar, "");
        l.d(challengeDetailParam, "");
        this.f70083a = kVar;
        this.f70084b = cVar;
        this.f70085c = dVar;
        this.f70086d = str;
        this.f70087e = str2;
        this.f70088f = challengeDetailParam;
    }
}
