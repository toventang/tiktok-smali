package com.ss.android.ugc.aweme.search.d;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.k.r;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final View f120990a;

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f120991b;

    /* renamed from: c  reason: collision with root package name */
    public final String f120992c;

    /* renamed from: d  reason: collision with root package name */
    public final r f120993d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.search.ecom.a.a f120994e;

    static {
        Covode.recordClassIndex(78818);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f120990a, aVar.f120990a) && l.a(this.f120991b, aVar.f120991b) && l.a(this.f120992c, aVar.f120992c) && l.a(this.f120993d, aVar.f120993d) && l.a(this.f120994e, aVar.f120994e);
    }

    public final int hashCode() {
        View view = this.f120990a;
        int i2 = 0;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        Aweme aweme = this.f120991b;
        int hashCode2 = (hashCode + (aweme != null ? aweme.hashCode() : 0)) * 31;
        String str = this.f120992c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        r rVar = this.f120993d;
        int hashCode4 = (hashCode3 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        com.ss.android.ugc.aweme.search.ecom.a.a aVar = this.f120994e;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "AwemeData(view=" + this.f120990a + ", aweme=" + this.f120991b + ", label=" + this.f120992c + ", itemMobParam=" + this.f120993d + ", product=" + this.f120994e + ")";
    }

    private /* synthetic */ a() {
        this(null, null, null, null, null);
    }

    public a(View view, Aweme aweme, String str, r rVar, com.ss.android.ugc.aweme.search.ecom.a.a aVar) {
        this.f120990a = view;
        this.f120991b = aweme;
        this.f120992c = str;
        this.f120993d = rVar;
        this.f120994e = aVar;
    }
}
