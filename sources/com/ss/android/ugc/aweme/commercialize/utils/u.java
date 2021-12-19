package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

final /* synthetic */ class u implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final Context f75809a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f75810b;

    /* renamed from: c  reason: collision with root package name */
    private final String f75811c;

    static {
        Covode.recordClassIndex(46754);
    }

    u(Context context, Aweme aweme, String str) {
        this.f75809a = context;
        this.f75810b = aweme;
        this.f75811c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        Context context = this.f75809a;
        Aweme aweme = this.f75810b;
        String str = this.f75811c;
        n.a(context, aweme);
        j.b(context, "click_open_url_window_confirm", aweme, j.a(context, aweme, false, (Map<String, String>) null));
        a.a("draw_ad", "click_open_url_window_confirm", aweme.getAwemeRawAd()).c();
        j.a(context, aweme, str);
        dialogInterface.dismiss();
    }
}
