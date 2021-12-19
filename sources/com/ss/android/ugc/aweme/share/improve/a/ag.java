package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ag implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123610a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f123611b;

    /* renamed from: c  reason: collision with root package name */
    private final String f123612c;

    static {
        Covode.recordClassIndex(81142);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.eul;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "privacy";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_lock;
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
        return R.raw.icon_lock;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81143);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
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

    public ag(Aweme aweme, String str) {
        l.d(aweme, "");
        l.d(str, "");
        this.f123611b = aweme;
        this.f123612c = str;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        String str;
        l.d(context, "");
        l.d(sharePackage, "");
        String string = sharePackage.f124595i.getString("tab_name", "");
        String string2 = sharePackage.f124595i.getString("impr_id", "");
        d a2 = new d().a("group_id", this.f123611b.getAid()).a("enter_from", this.f123612c).a("impr_id", string2);
        if (TextUtils.equals(this.f123612c, "personal_homepage")) {
            a2.a("tab_name", string);
        }
        if (this.f123611b.getAwemeType() == 40) {
            str = "story";
        } else {
            str = UGCMonitor.TYPE_POST;
        }
        a2.a("story_type", str);
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        l.b(curUser, "");
        a2.a("is_private", curUser.isSecret() ? 1 : 0);
        r.a("click_privacy_setting_video", a2.f66730a);
        ShareDependService a3 = ShareDependService.a.a();
        Aweme aweme = this.f123611b;
        l.b(string, "");
        String str2 = this.f123612c;
        l.b(string2, "");
        a3.a(context, aweme, string, str2, string2);
    }
}
