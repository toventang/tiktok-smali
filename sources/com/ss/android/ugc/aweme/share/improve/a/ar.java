package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.share.improve.c.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.sticker.model.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ar implements h {

    /* renamed from: a  reason: collision with root package name */
    private final g f123644a;

    static {
        Covode.recordClassIndex(81164);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.fcr;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "report_sticker";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_flag;
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

    public ar(g gVar) {
        l.d(gVar, "");
        this.f123644a = gVar;
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
    public final void a(Context context, SharePackage sharePackage) {
        String str;
        l.d(context, "");
        l.d(sharePackage, "");
        if (TextUtils.isEmpty(this.f123644a.ownerId)) {
            str = "0";
        } else {
            str = this.f123644a.ownerId;
        }
        a.a().a(b.a(context), new Uri.Builder().appendQueryParameter("report_type", "effect").appendQueryParameter("object_id", this.f123644a.id).appendQueryParameter("owner_id", str));
        r.a("tns_tiktok_ttep_sharepanel_click_report", new c().a("source", (Integer) 1).a("enter_from", "ttep_detail_page").a());
    }
}
