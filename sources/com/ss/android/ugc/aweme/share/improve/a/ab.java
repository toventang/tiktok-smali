package com.ss.android.ugc.aweme.share.improve.a;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.livewallpaper.f.c;
import com.ss.android.ugc.aweme.livewallpaper.f.f;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.improve.c.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ab implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123594a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f123595b;

    /* renamed from: c  reason: collision with root package name */
    private final String f123596c;

    static {
        Covode.recordClassIndex(81132);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.he7;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "live_photo";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_live_wallpaper;
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
    public final int g() {
        return R.raw.icon_live_wallpaper;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81133);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        AwemeACLShare awemeACLShareInfo;
        ACLCommonShare downloadGeneral;
        if (f.c() || (awemeACLShareInfo = this.f123595b.getAwemeACLShareInfo()) == null || (downloadGeneral = awemeACLShareInfo.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 2) {
            return false;
        }
        return true;
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

    public ab(Aweme aweme, String str) {
        l.d(aweme, "");
        l.d(str, "");
        this.f123595b = aweme;
        this.f123596c = str;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        ACLCommonShare downloadGeneral;
        ACLCommonShare downloadGeneral2;
        String toastMsg;
        l.d(context, "");
        l.d(sharePackage, "");
        if (f.c()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(R.string.he9).a();
            return;
        }
        AwemeACLShare awemeACLShareInfo = this.f123595b.getAwemeACLShareInfo();
        if (!(awemeACLShareInfo == null || (downloadGeneral2 = awemeACLShareInfo.getDownloadGeneral()) == null || (toastMsg = downloadGeneral2.getToastMsg()) == null || toastMsg.length() == 0)) {
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(toastMsg).a();
        }
        AwemeACLShare awemeACLShareInfo2 = this.f123595b.getAwemeACLShareInfo();
        if (awemeACLShareInfo2 != null && (downloadGeneral = awemeACLShareInfo2.getDownloadGeneral()) != null && downloadGeneral.getCode() == 0) {
            String string = sharePackage.f124595i.getString("previousPage");
            if (string == null) {
                string = "";
            }
            l.b(string, "");
            Activity a2 = b.a(context);
            if (a2 != null) {
                Aweme aweme = this.f123595b;
                com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid()).a("request_id", aweme.getRequestId()).a("previous_page", string).a("enter_from", "share");
                boolean d2 = f.d();
                a3.a("need_plugin", d2 ? 1 : 0);
                if (d2) {
                    boolean b2 = com.ss.android.common.util.f.b(a2, c.f108896a);
                    a3.a("plugin_install", b2 ? 1 : 0);
                    if (b2) {
                        a3.a("install_type", f.a(a2) ? 1 : 0);
                    }
                }
                r.a("wall_paper_click", a3.f66730a);
                ShareDependService.a.a().a(a2, this.f123595b);
            }
        }
    }
}
