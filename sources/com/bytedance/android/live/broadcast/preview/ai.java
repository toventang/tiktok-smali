package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.browser.c.e;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final /* synthetic */ class ai implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8111a;

    static {
        Covode.recordClassIndex(4036);
    }

    public ai(Context context) {
        this.f8111a = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        Context context = this.f8111a;
        ((f) a.a(f.class)).webViewManager().a(context, e.b("https://www.tiktok.com/aweme/in_app/suicide/help/" + "?is_live=1" + "&enter_from=livestream_keyword_popup" + "&title=" + context.getString(R.string.gxn)));
    }
}
