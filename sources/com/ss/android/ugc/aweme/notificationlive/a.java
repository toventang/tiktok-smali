package com.ss.android.ugc.aweme.notificationlive;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.notificationlive.t;
import com.ss.android.ugc.aweme.profile.f;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final User f114303a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f114304b;

    /* renamed from: c  reason: collision with root package name */
    public final String f114305c;

    /* renamed from: d  reason: collision with root package name */
    public final String f114306d;

    /* renamed from: e  reason: collision with root package name */
    public final String f114307e;

    /* renamed from: f  reason: collision with root package name */
    public final t.a f114308f;

    /* renamed from: g  reason: collision with root package name */
    public final String f114309g;

    /* renamed from: h  reason: collision with root package name */
    public final AwemeRawAd f114310h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f114311i;

    /* renamed from: j  reason: collision with root package name */
    public final f f114312j;

    static {
        Covode.recordClassIndex(73503);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f114303a, aVar.f114303a) && l.a(this.f114304b, aVar.f114304b) && l.a(this.f114305c, aVar.f114305c) && l.a(this.f114306d, aVar.f114306d) && l.a(this.f114307e, aVar.f114307e) && l.a(this.f114308f, aVar.f114308f) && l.a(this.f114309g, aVar.f114309g) && l.a(this.f114310h, aVar.f114310h) && this.f114311i == aVar.f114311i && l.a(this.f114312j, aVar.f114312j);
    }

    public final int hashCode() {
        User user = this.f114303a;
        int i2 = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        Activity activity = this.f114304b;
        int hashCode2 = (hashCode + (activity != null ? activity.hashCode() : 0)) * 31;
        String str = this.f114305c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f114306d;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f114307e;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        t.a aVar = this.f114308f;
        int hashCode6 = (hashCode5 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str4 = this.f114309g;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AwemeRawAd awemeRawAd = this.f114310h;
        int hashCode8 = (hashCode7 + (awemeRawAd != null ? awemeRawAd.hashCode() : 0)) * 31;
        boolean z = this.f114311i;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode8 + i3) * 31;
        f fVar = this.f114312j;
        if (fVar != null) {
            i2 = fVar.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "BellClickParameter(user=" + this.f114303a + ", activity=" + this.f114304b + ", enterFrom=" + this.f114305c + ", previousPage=" + this.f114306d + ", previousPagePosition=" + this.f114307e + ", displayUI=" + this.f114308f + ", clickFrom=" + this.f114309g + ", awemeRawAd=" + this.f114310h + ", isVertical=" + this.f114311i + ", pushStatusCallback=" + this.f114312j + ")";
    }

    public /* synthetic */ a(User user, Activity activity, String str, String str2) {
        this(user, activity, str, str2, "", null, "", null);
    }

    public a(User user, Activity activity, String str, String str2, boolean z, f fVar) {
        this(user, activity, str, str2, "", null, "", null, z, fVar);
    }

    public a(User user, Activity activity, String str, String str2, String str3, t.a aVar, String str4, AwemeRawAd awemeRawAd) {
        this(user, activity, str, str2, str3, aVar, str4, awemeRawAd, true, null);
    }

    private a(User user, Activity activity, String str, String str2, String str3, t.a aVar, String str4, AwemeRawAd awemeRawAd, boolean z, f fVar) {
        this.f114303a = user;
        this.f114304b = activity;
        this.f114305c = str;
        this.f114306d = str2;
        this.f114307e = str3;
        this.f114308f = aVar;
        this.f114309g = str4;
        this.f114310h = awemeRawAd;
        this.f114311i = z;
        this.f114312j = fVar;
    }
}
