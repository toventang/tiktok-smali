package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.improve.c.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ao implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Challenge f123641a;

    static {
        Covode.recordClassIndex(81161);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.fcr;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "report_hashtag";
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

    public ao(Challenge challenge) {
        this.f123641a = challenge;
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
        String str2;
        String str3;
        User author;
        User author2;
        l.d(context, "");
        l.d(sharePackage, "");
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "hashtag");
        Challenge challenge = this.f123641a;
        String str4 = null;
        if (challenge != null) {
            str = challenge.getCid();
        } else {
            str = null;
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("object_id", str);
        Challenge challenge2 = this.f123641a;
        if (challenge2 == null || (author2 = challenge2.getAuthor()) == null) {
            str2 = null;
        } else {
            str2 = author2.getUid();
        }
        a.a().a(b.a(context), appendQueryParameter2.appendQueryParameter("owner_id", str2));
        IReportService a2 = a.a();
        Challenge challenge3 = this.f123641a;
        if (challenge3 != null) {
            str3 = challenge3.getCid();
        } else {
            str3 = null;
        }
        Challenge challenge4 = this.f123641a;
        if (!(challenge4 == null || (author = challenge4.getAuthor()) == null)) {
            str4 = author.getUid();
        }
        a2.a("challenge_detail", "hashtag", "", str3, str4, "", "click_share_button");
    }
}
