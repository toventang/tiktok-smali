package com.ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.f;
import com.bytedance.android.livesdkapi.service.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class b implements h {

    /* renamed from: a  reason: collision with root package name */
    private final c f124031a;

    static {
        Covode.recordClassIndex(81434);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.dhi;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "live_dislike_action";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public int ch_() {
        return R.raw.icon_2pt_broken_heart;
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

    public b(c cVar) {
        l.d(cVar, "");
        this.f124031a = cVar;
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

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        d a2 = f.a();
        if (a2 != null) {
            a2.a(this.f124031a);
        }
    }
}
