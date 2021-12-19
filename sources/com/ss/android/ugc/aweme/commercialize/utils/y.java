package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.feed.ba;
import com.ss.android.ugc.aweme.commercialize.utils.b.a.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class y implements ba {
    static {
        Covode.recordClassIndex(46758);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.ba
    public final boolean a(Uri uri) {
        return w.a(uri);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.ba
    public final void a(Context context, String str) {
        w.a(context, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.ba
    public final void a(Context context, Aweme aweme) {
        n.a(context, aweme, (String) null, (String) null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.ba
    public final boolean b(Context context, Aweme aweme) {
        return n.a(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.ba
    public final boolean c(Context context, Aweme aweme) {
        return w.d(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.ba
    public final boolean b(Context context, String str) {
        return w.c(context, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.ba
    public final void a(Context context, Aweme aweme, bo boVar) {
        bp.a(context, aweme, 43, boVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.ba
    public final boolean a(Activity activity, Aweme aweme, int i2) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return b.a(activity, aweme.getAwemeRawAd().getFormUrl(), aweme, i2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.ba
    public final boolean a(Context context, String str, String str2) {
        return w.a(context, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.ba
    public final boolean a(Context context, String str, boolean z) {
        return w.a(context, str, z);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.ba
    public final boolean a(Context context, Aweme aweme, int i2, com.ss.android.ugc.aweme.commercialize.j.b bVar) {
        return w.a(context, aweme, i2, bVar);
    }
}
