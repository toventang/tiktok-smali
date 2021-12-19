package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.ab;
import com.ss.android.ugc.aweme.share.improve.c.a;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Aweme f123693a;

    /* renamed from: b  reason: collision with root package name */
    private final String f123694b;

    static {
        Covode.recordClassIndex(81197);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.d2b;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "ad_plan";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return 2131233780;
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
        return 2131233781;
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

    public c(Aweme aweme, String str) {
        l.d(aweme, "");
        l.d(str, "");
        this.f123693a = aweme;
        this.f123694b = str;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        if (a.a(this, context, this.f123693a, this.f123694b)) {
            ab.a("promote_layer_show").b("enter_from", this.f123694b).b("content", "promote_plan").b("group_id", this.f123693a.getAid()).f();
            a.C0731a a2 = new a.C0731a(context).a(R.string.d2_);
            a2.f33402b = this.f123693a.getAdSchedule();
            a2.a(R.string.asg, (DialogInterface.OnClickListener) null, false).a().c();
        }
    }
}
