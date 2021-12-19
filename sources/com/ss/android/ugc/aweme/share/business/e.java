package com.ss.android.ugc.aweme.share.business;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.share.a.b;
import com.ss.android.ugc.aweme.metrics.ag;
import com.ss.android.ugc.aweme.share.improve.d.h;
import com.ss.android.ugc.aweme.share.improve.e.a;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.ss.android.ugc.aweme.sharer.ui.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;

public final class e {
    static {
        Covode.recordClassIndex(81043);
    }

    public static final class d implements com.ss.android.ugc.aweme.sharer.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f123411a;

        static {
            Covode.recordClassIndex(81047);
        }

        @Override // com.ss.android.ugc.aweme.sharer.a.a
        public final Activity a() {
            return this.f123411a;
        }

        public d(Activity activity) {
            this.f123411a = activity;
        }
    }

    public static final class a extends g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f123408a;

        static {
            Covode.recordClassIndex(81044);
        }

        public a(Aweme aweme) {
            this.f123408a = aweme;
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.b, com.ss.android.ugc.aweme.sharer.ui.g
        public final void a(com.ss.android.ugc.aweme.sharer.b bVar, boolean z, SharePackage sharePackage, Context context) {
            String str;
            String str2;
            Bundle bundle;
            Bundle bundle2;
            Bundle bundle3;
            l.d(bVar, "");
            l.d(context, "");
            ag a2 = new ag().a("release");
            a2.f109481d = "publish_then_share";
            ag f2 = a2.g(this.f123408a);
            f2.f109480c = bVar.a();
            f2.p = 0;
            String str3 = null;
            if (sharePackage == null || (bundle3 = sharePackage.f124595i) == null) {
                str = null;
            } else {
                str = bundle3.getString("share_form");
            }
            f2.Z = str;
            if (sharePackage == null || (bundle2 = sharePackage.f124595i) == null) {
                str2 = null;
            } else {
                str2 = bundle2.getString("share_form");
            }
            if (l.a((Object) str2, (Object) "url_form")) {
                if (!(sharePackage == null || (bundle = sharePackage.f124595i) == null)) {
                    str3 = bundle.getString("share_url");
                }
                f2.q = str3;
            } else {
                ShareInfo shareInfo = this.f123408a.getShareInfo();
                l.b(shareInfo, "");
                String shareUrl = shareInfo.getShareUrl();
                if (shareUrl == null) {
                    shareUrl = this.f123408a.getShareUrl();
                }
                f2.q = shareUrl;
            }
            f2.f();
        }
    }

    public static final class b implements com.ss.android.ugc.aweme.im.service.share.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f123409a;

        static {
            Covode.recordClassIndex(81045);
        }

        @Override // com.ss.android.ugc.aweme.im.service.share.a.b
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.im.service.share.a.b
        public final void b(SharePackage sharePackage) {
            l.d(sharePackage, "");
        }

        @Override // com.ss.android.ugc.aweme.im.service.share.a.b
        public final void c(SharePackage sharePackage) {
            l.d(sharePackage, "");
        }

        public b(Activity activity) {
            this.f123409a = activity;
        }

        @Override // com.ss.android.ugc.aweme.im.service.share.a.b
        public final boolean a(SharePackage sharePackage) {
            l.d(sharePackage, "");
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.U(d.a(sharePackage))) {
                new com.bytedance.tux.g.b(this.f123409a).e(R.string.og).b();
                return false;
            }
            l.d(sharePackage, "");
            return true;
        }

        @Override // com.ss.android.ugc.aweme.im.service.share.a.b
        public final void a(String str, SharePackage sharePackage) {
            l.d(str, "");
            l.d(sharePackage, "");
            b.a.a(str, sharePackage);
        }
    }

    public static final class c extends m implements h.f.a.b<com.ss.android.ugc.aweme.sharer.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f123410a = new c();

        static {
            Covode.recordClassIndex(81046);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sharer.b bVar) {
            boolean z;
            com.ss.android.ugc.aweme.sharer.b bVar2 = bVar;
            l.d(bVar2, "");
            if (a.C3219a.a().isEmpty() || l.a((Object) bVar2.a(), (Object) "download")) {
                z = true;
            } else {
                z = a.C3219a.a().contains(bVar2.a());
            }
            return Boolean.valueOf(z);
        }
    }

    private static com.ss.android.ugc.aweme.sharer.b a(com.ss.android.ugc.aweme.sharer.b bVar, ACLCommonShare aCLCommonShare) {
        return new com.ss.android.ugc.aweme.share.improve.f.c(bVar, aCLCommonShare);
    }

    public static void a(Aweme aweme, String str, com.ss.android.ugc.aweme.sharer.d dVar, e.b bVar) {
        com.ss.android.ugc.aweme.sharer.b a2;
        ACLCommonShare a3 = h.a.a(aweme, str);
        if ((a3 == null || a3.getShowType() != 0) && (a2 = com.ss.android.ugc.aweme.sharer.c.a(str, dVar)) != null) {
            bVar.a(a(a2, a3));
        }
    }
}
