package com.ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.sharer.h;
import com.ss.android.ugc.aweme.sharer.k;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import f.a.d.f;
import f.a.d.g;
import f.a.n;
import f.a.o;
import f.a.q;
import h.f.b.l;
import h.z;

public final class DownloadedVideoSharePackage extends KtfDefaultSharePackage {

    /* renamed from: c  reason: collision with root package name */
    public static final a f123943c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f123944a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f123945b;

    static {
        Covode.recordClassIndex(81377);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81378);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.KtfDefaultSharePackage
    public final Aweme b() {
        Aweme aweme = this.f123945b;
        if (aweme == null) {
            l.a("aweme");
        }
        return aweme;
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f123948a;

        static {
            Covode.recordClassIndex(81381);
        }

        c(h.f.a.b bVar) {
            this.f123948a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            h.f.a.b bVar = this.f123948a;
            l.b(obj, "");
            bVar.invoke(obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DownloadedVideoSharePackage(SharePackage.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    static final class b<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f123946a = new b();

        static {
            Covode.recordClassIndex(81379);
        }

        b() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            l.d(str, "");
            return n.a((q) new q() {
                /* class com.ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(81380);
                }

                @Override // f.a.q
                public final void a(o<h> oVar) {
                    l.d(oVar, "");
                    String str = str;
                    l.b(str, "");
                    oVar.a(new k(str, null, null, 6));
                }
            });
        }
    }

    private static boolean c(com.ss.android.ugc.aweme.sharer.b bVar) {
        com.ss.android.ugc.aweme.sharer.b a2;
        if (!l.a((Object) bVar.a(), (Object) "facebook") || (a2 = com.ss.android.ugc.aweme.sharer.c.a("facebook_story", null)) == null || a2.b(d.a())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final void a(com.ss.android.ugc.aweme.sharer.b bVar, h.f.a.b<? super h, z> bVar2) {
        l.d(bVar, "");
        l.d(bVar2, "");
        if (com.ss.android.ugc.aweme.sharer.ui.a.a.a()) {
            if (c(bVar)) {
                Aweme aweme = this.f123945b;
                if (aweme == null) {
                    l.a("aweme");
                }
                ShareInfo shareInfo = aweme.getShareInfo();
                l.b(shareInfo, "");
                String shareUrl = shareInfo.getShareUrl();
                l.b(shareUrl, "");
                com.ss.android.ugc.aweme.share.improve.c.c.b(shareUrl, this.f124590d, bVar).a(b.f123946a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).e(new c(bVar2));
                return;
            }
            String str = this.f123944a;
            if (str == null) {
                l.a("path");
            }
            Uri a2 = com.ss.android.ugc.aweme.share.improve.c.c.a(str, d.a());
            String str2 = this.f123944a;
            if (str2 == null) {
                l.a("path");
            }
            com.ss.android.ugc.aweme.sharer.n nVar = new com.ss.android.ugc.aweme.sharer.n(a2, str2, null, null, null, 60);
            String str3 = nVar.f124588g;
            if (str3 == null) {
                str3 = "";
            }
            nVar.a("content_url", str3);
            l.b("597615686992125", "");
            nVar.a("fb_app_id", "597615686992125");
            nVar.a("media_type", "video/mp4");
            bVar2.invoke(nVar);
        } else if (c(bVar)) {
            Aweme aweme2 = this.f123945b;
            if (aweme2 == null) {
                l.a("aweme");
            }
            ShareInfo shareInfo2 = aweme2.getShareInfo();
            l.b(shareInfo2, "");
            String shareUrl2 = shareInfo2.getShareUrl();
            l.b(shareUrl2, "");
            bVar2.invoke(new k(com.ss.android.ugc.aweme.share.improve.c.c.a(shareUrl2, this.f124590d, bVar), null, null, 6));
        } else {
            String str4 = this.f123944a;
            if (str4 == null) {
                l.a("path");
            }
            Uri a3 = com.ss.android.ugc.aweme.share.improve.c.c.a(str4, d.a());
            String str5 = this.f123944a;
            if (str5 == null) {
                l.a("path");
            }
            com.ss.android.ugc.aweme.sharer.n nVar2 = new com.ss.android.ugc.aweme.sharer.n(a3, str5, null, null, null, 60);
            String str6 = nVar2.f124588g;
            if (str6 == null) {
                str6 = "";
            }
            nVar2.a("content_url", str6);
            l.b("597615686992125", "");
            nVar2.a("fb_app_id", "597615686992125");
            nVar2.a("media_type", "video/mp4");
            bVar2.invoke(nVar2);
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final boolean a(com.ss.android.ugc.aweme.sharer.b bVar, Context context, h.f.a.b<? super Boolean, z> bVar2) {
        l.d(bVar, "");
        l.d(context, "");
        l.d(bVar2, "");
        ah.f123353b.a(bVar.a(), 0);
        return false;
    }
}
