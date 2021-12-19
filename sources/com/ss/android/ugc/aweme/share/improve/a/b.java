package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    private Aweme f123682a;

    /* renamed from: b  reason: collision with root package name */
    private String f123683b;

    static {
        Covode.recordClassIndex(81191);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.fqa;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "ad_settings";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_horn_ltr;
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
    public final void a(Context context) {
        String uid;
        String str = "";
        l.d(context, str);
        d a2 = new d().a("enter_from", this.f123683b).a("group_id", this.f123682a.getAid());
        User author = this.f123682a.getAuthor();
        if (!(author == null || (uid = author.getUid()) == null)) {
            str = uid;
        }
        r.a("show_adsetting_entrance", a2.a("author_id", str).a("enter_method", "click_share_button").f66730a);
    }

    public b(Aweme aweme, String str) {
        l.d(aweme, "");
        l.d(str, "");
        this.f123682a = aweme;
        this.f123683b = str;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        String uid;
        String str = "";
        l.d(context, str);
        l.d(sharePackage, str);
        ShareDependService.a.a().d(context, this.f123682a);
        d a2 = new d().a("enter_from", this.f123683b).a("group_id", this.f123682a.getAid());
        User author = this.f123682a.getAuthor();
        if (!(author == null || (uid = author.getUid()) == null)) {
            str = uid;
        }
        r.a("click_adsetting_entrance", a2.a("author_id", str).a("enter_method", "click_share_button").f66730a);
    }
}
