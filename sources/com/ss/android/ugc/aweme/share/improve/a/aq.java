package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.qna.model.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class aq implements h {

    /* renamed from: a  reason: collision with root package name */
    private final b f123643a;

    static {
        Covode.recordClassIndex(81163);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.fcr;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "report_qna";
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

    public aq(b bVar) {
        l.d(bVar, "");
        this.f123643a = bVar;
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
        if (TextUtils.isEmpty(this.f123643a.f119475a)) {
            str = "0";
        } else {
            str = this.f123643a.f119475a;
        }
        a.a().a(com.ss.android.ugc.aweme.share.improve.c.b.a(context), new Uri.Builder().appendQueryParameter("report_type", "ques_ans").appendQueryParameter("object_id", String.valueOf(this.f123643a.f119476b)).appendQueryParameter("owner_id", str));
        a.a().a("qa_detail", "ques_ans", "", String.valueOf(this.f123643a.f119476b), this.f123643a.f119475a, "", "click_share_button");
    }
}
