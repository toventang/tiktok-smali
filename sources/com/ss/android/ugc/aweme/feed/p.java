package com.ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.commercialize.c.a;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements a {

    /* renamed from: a  reason: collision with root package name */
    static final a f93627a = new p();

    static {
        Covode.recordClassIndex(59573);
    }

    private p() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.c.a
    public final void a(Object[] objArr) {
        try {
            g.a().a(d.a(), (AwemeRawAd) objArr[0], (String) objArr[1]);
        } catch (Exception unused) {
        }
    }
}
