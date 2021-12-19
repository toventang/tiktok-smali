package com.ss.android.ugc.aweme.shoutouts.player;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    private final String f133282a;

    /* renamed from: b  reason: collision with root package name */
    private final String f133283b;

    static {
        Covode.recordClassIndex(87174);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.fcr;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "shoutouts_report";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.drawable.bj4;
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

    public f(String str, String str2) {
        this.f133282a = str;
        this.f133283b = str2;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "video").appendQueryParameter("object_id", this.f133282a);
        String str = this.f133283b;
        if (str == null) {
            str = "0";
        }
        a.a().a((Activity) context, appendQueryParameter.appendQueryParameter("owner_id", str));
        IReportService a2 = a.a();
        String str2 = this.f133282a;
        a2.a("", "video", str2, str2, this.f133283b, "", "");
    }
}
