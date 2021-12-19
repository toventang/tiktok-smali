package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.net.b;
import com.ss.android.ugc.aweme.net.d;
import com.ss.android.ugc.aweme.net.i;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;

public final class m implements d<Object>, h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f123792b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f123793a;

    static {
        Covode.recordClassIndex(81246);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "top";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81247);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        if (this.f123793a.isTop()) {
            return R.string.dqr;
        }
        return R.string.dqp;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        if (!this.f123793a.isTop()) {
            return R.raw.icon_2pt_pin;
        }
        return R.raw.icon_2pt_pin_fill;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        if (!this.f123793a.isTop()) {
            return R.raw.icon_pin;
        }
        return R.raw.icon_pin_fill;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo = this.f123793a.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo == null || commerceVideoAuthInfo.getDarkPostStatus() != 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.net.d
    public final void a() {
        int i2;
        String str;
        Aweme aweme = this.f123793a;
        aweme.setIsTop(!aweme.isTop());
        Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
        if (this.f123793a.isTop()) {
            i2 = R.string.dqq;
        } else {
            i2 = R.string.dqs;
        }
        String string = a2.getString(i2);
        l.b(string, "");
        new com.ss.android.ugc.aweme.tux.a.i.a(a2).a(string).a();
        com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("group_id", this.f123793a.getAid());
        User author = this.f123793a.getAuthor();
        l.b(author, "");
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("author_id", author.getUid()).a("enter_from", "personal_homepage");
        if (this.f123793a.isTop()) {
            str = "top";
        } else {
            str = "top_cancel";
        }
        r.a("click_video_top", a4.a("final_status", str).f66730a);
        c.a(new com.ss.android.ugc.aweme.commercialize.event.h());
    }

    public m(Aweme aweme) {
        l.d(aweme, "");
        this.f123793a = aweme;
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

    @Override // com.ss.android.ugc.aweme.net.d
    public final void a(Exception exc) {
        String str;
        com.ss.android.ugc.aweme.app.api.b.a.a(com.bytedance.ies.ugc.appcontext.d.a(), (Throwable) exc, (int) R.string.de8);
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("group_id", this.f123793a.getAid());
        User author = this.f123793a.getAuthor();
        l.b(author, "");
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", author.getUid()).a("enter_from", "personal_homepage");
        if (this.f123793a.isTop()) {
            str = "top";
        } else {
            str = "top_cancel";
        }
        r.a("click_video_top", a3.a("final_status", str).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        String str;
        l.d(context, "");
        l.d(sharePackage, "");
        if (!this.f123793a.isPrivate() || this.f123793a.isTop()) {
            com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo = this.f123793a.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo == null || commerceVideoAuthInfo.getDarkPostStatus() != 1 || this.f123793a.isTop()) {
                String aid = this.f123793a.getAid();
                boolean isTop = true ^ this.f123793a.isTop();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new com.ss.android.http.a.b.d("item_id", aid));
                if (isTop) {
                    str = com.ss.android.ugc.aweme.share.api.a.f123368a;
                } else {
                    str = com.ss.android.ugc.aweme.share.api.a.f123369b;
                }
                b bVar = new b(str, i.POST, arrayList, String.class);
                bVar.f112221a = this;
                bVar.f112227g = false;
                bVar.a(com.bytedance.ies.ugc.appcontext.d.a());
                return;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.b4g).a();
            return;
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.evz).a();
    }
}
