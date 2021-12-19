package com.ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.f;
import com.bytedance.android.livesdkapi.service.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import h.f.b.l;

public final class m implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f124047a;

    /* renamed from: b  reason: collision with root package name */
    private final c f124048b;

    static {
        Covode.recordClassIndex(81446);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "share_setting";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return ch_();
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        d a2 = f.a();
        if (a2 != null) {
            return a2.c("share_setting");
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        d a2 = f.a();
        if (a2 != null) {
            return a2.b("share_setting");
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        l.d(imageView, "");
        l.d(imageView, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        l.d(textView, "");
        h.a.a(this, textView);
    }

    public m(Activity activity, c cVar) {
        l.d(activity, "");
        l.d(cVar, "");
        this.f124047a = activity;
        this.f124048b = cVar;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        d a2 = f.a();
        if (a2 != null) {
            a2.b(this.f124047a);
        }
    }
}
