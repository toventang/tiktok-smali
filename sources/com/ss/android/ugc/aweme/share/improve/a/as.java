package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.improve.c.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class as implements h {

    /* renamed from: a  reason: collision with root package name */
    private final User f123645a;

    static {
        Covode.recordClassIndex(81165);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.fcr;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "report";
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

    public as(User user) {
        l.d(user, "");
        this.f123645a = user;
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
        String str = "";
        l.d(context, str);
        l.d(sharePackage, str);
        r.a("report_user", new d().a("enter_from", "others_homepage").a("to_user_id", this.f123645a.getUid()).f66730a);
        try {
            o oVar = new o();
            oVar.a("unique_id", in.b(this.f123645a));
            oVar.a("is_blocked", Boolean.valueOf(this.f123645a.isBlock()));
            String b2 = dg.a().b(oVar);
            l.b(b2, str);
            str = b2;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        a.a().a(b.a(context), new Uri.Builder().appendQueryParameter("owner_id", this.f123645a.getUid()).appendQueryParameter("object_id", this.f123645a.getUid()).appendQueryParameter("report_type", "user").appendQueryParameter("extra", str));
        a.a().a("others_homepage", "user", "", this.f123645a.getUid(), this.f123645a.getUid(), "", "click_share_button");
    }
}
