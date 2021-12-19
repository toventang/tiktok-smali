package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

final /* synthetic */ class v implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final Context f75812a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f75813b;

    static {
        Covode.recordClassIndex(46755);
    }

    v(Context context, Aweme aweme) {
        this.f75812a = context;
        this.f75813b = aweme;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        Context context = this.f75812a;
        Aweme aweme = this.f75813b;
        j.b(context, "click_open_url_window_cancel", aweme, j.a(context, aweme, false, (Map<String, String>) null));
        a.a("draw_ad", "click_open_url_window_cancel", aweme.getAwemeRawAd()).c();
        dialogInterface.dismiss();
    }
}
