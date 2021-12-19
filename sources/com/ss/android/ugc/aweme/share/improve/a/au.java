package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.improve.c.a;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class au implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Aweme f123651a;

    /* renamed from: b  reason: collision with root package name */
    private final String f123652b;

    static {
        Covode.recordClassIndex(81169);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.fey;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "reuse_mv_template";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_template;
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
        return R.raw.icon_template;
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

    public au(Aweme aweme, String str) {
        l.d(aweme, "");
        l.d(str, "");
        this.f123651a = aweme;
        this.f123652b = str;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        String str;
        String str2;
        l.d(context, "");
        l.d(sharePackage, "");
        if (a.a(this, context, this.f123651a, this.f123652b)) {
            FaceStickerBean.sCurPropSource = "prop_reuse";
            r.a("mvtheme_reuse_icon", new d().a("mv_id", this.f123651a.getUploadMiscInfoStruct().mvThemeId).a("action_type", "click").a("group_id", this.f123651a.getAid()).f66730a);
            IAccountUserService g2 = b.g();
            l.b(g2, "");
            if (g2.isLogin() || !AVExternalServiceImpl.a().configService().avsettingsConfig().needLoginBeforeRecord()) {
                ShareDependService a2 = ShareDependService.a.a();
                String str3 = this.f123651a.getUploadMiscInfoStruct().mvThemeId;
                l.b(str3, "");
                a2.a(context, str3, this.f123651a.getUploadMiscInfoStruct().mvType);
                int i2 = this.f123651a.getUploadMiscInfoStruct().mvType;
                d dVar = new d();
                String str4 = "mv_page";
                if (i2 == 1) {
                    str = "jianying_mv_reuse";
                } else {
                    str = str4;
                }
                d a3 = dVar.a("shoot_way", str);
                if (i2 == 1) {
                    str4 = "jianying_mv_page";
                }
                d a4 = a3.a("enter_from", str4).a("mv_id", this.f123651a.getUploadMiscInfoStruct().mvThemeId).a("log_pb", ac.a.f91473a.a(new LogPbBean())).a("group_id", this.f123651a.getAid()).a("author_id", this.f123651a.getAuthorUid());
                if (i2 == 1) {
                    str2 = "jianying_mv";
                } else {
                    str2 = "mv";
                }
                r.a("shoot", a4.a("content_type", str2).f66730a);
                return;
            }
            c.a(com.ss.android.ugc.aweme.share.improve.c.b.a(context), this.f123652b, "click_share_button");
        }
    }
}
