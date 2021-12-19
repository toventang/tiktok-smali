package com.ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.share.aa;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.sharer.k;
import com.ss.android.ugc.aweme.sharer.m;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.shortvideo.util.am;
import com.zhiliaoapp.musically.R;
import f.a.n;
import f.a.o;
import f.a.q;
import h.f.b.l;
import h.m.p;
import h.z;
import org.json.JSONObject;

public final class WebSharePackage extends SharePackage {

    /* renamed from: b  reason: collision with root package name */
    public static final a f124006b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f124007a;

    static {
        Covode.recordClassIndex(81419);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81420);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static String a(JSONObject jSONObject, String str) {
            String optString = jSONObject.optString(str);
            if (optString == null || l.a((Object) optString, (Object) "null")) {
                return null;
            }
            return optString;
        }

        public static WebSharePackage a(Context context, com.ss.android.ugc.aweme.web.c.a.b bVar, String str) {
            String str2 = "";
            l.d(context, str2);
            l.d(bVar, str2);
            SharePackage.a b2 = new SharePackage.a().a("pic").b("web");
            String str3 = bVar.f144901a;
            l.b(str3, str2);
            SharePackage.a c2 = b2.c(str3);
            String str4 = bVar.f144902b;
            l.b(str4, str2);
            SharePackage.a d2 = c2.d(str4);
            String b3 = com.ss.android.ugc.aweme.share.improve.c.b.b(bVar.f144904d);
            if (b3 != null) {
                str2 = b3;
            }
            WebSharePackage webSharePackage = new WebSharePackage(d2.e(str2));
            Bundle bundle = webSharePackage.f124595i;
            bundle.putString("app_name", context.getString(R.string.uh));
            bundle.putString("thumb_url", "file://" + bVar.f144906f);
            bundle.putString("thumb_path", bVar.f144906f);
            bundle.putString("url_for_im_share", str);
            return webSharePackage;
        }

        public static WebSharePackage a(Context context, com.ss.android.ugc.aweme.web.c.a.b bVar, String str, boolean z) {
            String str2 = "";
            l.d(context, str2);
            l.d(bVar, str2);
            SharePackage.a b2 = new SharePackage.a().a("web").b("web");
            String str3 = bVar.f144901a;
            l.b(str3, str2);
            SharePackage.a c2 = b2.c(str3);
            String str4 = bVar.f144902b;
            l.b(str4, str2);
            SharePackage.a d2 = c2.d(str4);
            String b3 = com.ss.android.ugc.aweme.share.improve.c.b.b(bVar.f144904d);
            if (b3 != null) {
                str2 = b3;
            }
            WebSharePackage webSharePackage = new WebSharePackage(d2.e(str2));
            Bundle bundle = webSharePackage.f124595i;
            bundle.putString("app_name", context.getString(R.string.uh));
            bundle.putString("thumb_url", bVar.f144903c);
            bundle.putString("url_for_im_share", str);
            bundle.putBoolean("user_origin_link", z);
            webSharePackage.f124007a = bVar.f144903c;
            com.ss.android.ugc.aweme.base.e.b(bVar.f144903c);
            return webSharePackage;
        }

        public static WebSharePackage a(Context context, String str, JSONObject jSONObject, String str2, String str3) {
            l.d(context, "");
            l.d(jSONObject, "");
            l.d(str2, "");
            l.d(str3, "");
            SharePackage.a aVar = new SharePackage.a();
            aVar.a("web");
            String a2 = a(jSONObject, "title");
            if (a2 == null) {
                a2 = "";
            }
            aVar.c(a2);
            String a3 = a(jSONObject, "description");
            if (a3 == null) {
                a3 = "";
            }
            aVar.d(a3);
            String a4 = a(jSONObject, "url");
            if (a4 == null) {
                a4 = "";
            }
            aVar.e(a4);
            String str4 = aVar.f124599c;
            if (str4 == null || str4.length() == 0) {
                if (str == null || str.length() == 0 || !(!l.a((Object) str, (Object) "undefined"))) {
                    aVar.c(str3);
                } else {
                    aVar.c(str);
                }
            }
            String str5 = aVar.f124600d;
            if (str5 == null || str5.length() == 0) {
                aVar.d(" ");
            }
            String str6 = aVar.f124601e;
            if (str6 == null || !(!p.a((CharSequence) str6))) {
                aVar.e(str2);
            } else {
                com.ss.android.common.util.g gVar = new com.ss.android.common.util.g(aVar.f124601e);
                if (!aa.a.a()) {
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, "");
                    gVar.a("u_code", com.ss.android.newmedia.d.b(g2.getCurUserId()));
                }
                if (!aa.a.b()) {
                    gVar.a("iid", DeviceRegisterManager.getInstallId());
                }
                String a5 = gVar.a();
                l.b(a5, "");
                aVar.e(a5);
            }
            WebSharePackage webSharePackage = new WebSharePackage(aVar);
            Bundle bundle = webSharePackage.f124595i;
            bundle.putString("app_name", context.getString(R.string.uh));
            bundle.putString("thumb_url", a(jSONObject, "image"));
            return webSharePackage;
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f124020a;

        static {
            Covode.recordClassIndex(81427);
        }

        e(h.f.a.b bVar) {
            this.f124020a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            h.f.a.b bVar = this.f124020a;
            l.b(obj, "");
            bVar.invoke(obj);
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f124027a;

        static {
            Covode.recordClassIndex(81430);
        }

        g(h.f.a.b bVar) {
            this.f124027a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            h.f.a.b bVar = this.f124027a;
            l.b(obj, "");
            bVar.invoke(obj);
        }
    }

    static final class i<T> implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WebSharePackage f124029a;

        static {
            Covode.recordClassIndex(81432);
        }

        i(WebSharePackage webSharePackage) {
            this.f124029a = webSharePackage;
        }

        @Override // f.a.q
        public final void a(o<String> oVar) {
            l.d(oVar, "");
            oVar.a(this.f124029a.f124594h);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebSharePackage(SharePackage.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    static final class b<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f124008a;

        static {
            Covode.recordClassIndex(81421);
        }

        b(String str) {
            this.f124008a = str;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            l.d(str, "");
            return n.a((q) new q(this) {
                /* class com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f124009a;

                static {
                    Covode.recordClassIndex(81422);
                }

                {
                    this.f124009a = r1;
                }

                @Override // f.a.q
                public final void a(o<com.ss.android.ugc.aweme.sharer.h> oVar) {
                    l.d(oVar, "");
                    String str = str;
                    l.b(str, "");
                    oVar.a(new k(str, this.f124009a.f124008a, null, 4));
                }
            });
        }
    }

    static final class d<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f124017a;

        static {
            Covode.recordClassIndex(81425);
        }

        d(String str) {
            this.f124017a = str;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            l.d(str, "");
            return n.a((q) new q(this) {
                /* class com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f124018a;

                static {
                    Covode.recordClassIndex(81426);
                }

                {
                    this.f124018a = r1;
                }

                @Override // f.a.q
                public final void a(o<com.ss.android.ugc.aweme.sharer.h> oVar) {
                    l.d(oVar, "");
                    String str = str;
                    l.b(str, "");
                    oVar.a(new k(str, this.f124018a.f124017a, null, 4));
                }
            });
        }
    }

    static final class h<T> implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WebSharePackage f124028a;

        static {
            Covode.recordClassIndex(81431);
        }

        h(WebSharePackage webSharePackage) {
            this.f124028a = webSharePackage;
        }

        @Override // f.a.q
        public final void a(o<String> oVar) {
            String str = "";
            l.d(oVar, str);
            String str2 = this.f124028a.f124594h;
            if (str2 != null) {
                str = str2;
            }
            oVar.a(str);
        }
    }

    static final class c<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WebSharePackage f124011a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f124012b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f124013c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f124014d;

        static {
            Covode.recordClassIndex(81423);
        }

        c(WebSharePackage webSharePackage, boolean z, com.ss.android.ugc.aweme.sharer.b bVar, String str) {
            this.f124011a = webSharePackage;
            this.f124012b = z;
            this.f124013c = bVar;
            this.f124014d = str;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            final m mVar;
            String str = (String) obj;
            l.d(str, "");
            if (this.f124012b) {
                str = this.f124011a.f124594h;
            }
            if (l.a((Object) this.f124013c.a(), (Object) "email")) {
                mVar = new k(str, this.f124011a.f124592f, this.f124014d);
            } else {
                mVar = new m(str, this.f124014d);
            }
            return n.a((q) new q(this) {
                /* class com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f124015a;

                static {
                    Covode.recordClassIndex(81424);
                }

                {
                    this.f124015a = r1;
                }

                @Override // f.a.q
                public final void a(o<com.ss.android.ugc.aweme.sharer.h> oVar) {
                    l.d(oVar, "");
                    m mVar = mVar;
                    String str = this.f124015a.f124011a.f124007a;
                    if (str == null) {
                        str = "";
                    }
                    String a2 = com.ss.android.ugc.aweme.base.e.a(str);
                    l.b(a2, "");
                    if (a2.length() > 0) {
                        String str2 = am.g(com.bytedance.ies.ugc.appcontext.d.a()) + "image_for_share.jpg";
                        com.ss.android.ugc.aweme.video.e.c(str2);
                        com.ss.android.ugc.aweme.video.e.c(a2, str2);
                        String uri = com.ss.android.ugc.aweme.share.improve.c.c.a(str2, com.bytedance.ies.ugc.appcontext.d.a()).toString();
                        l.b(uri, "");
                        mVar.a("image", uri);
                    }
                    oVar.a(mVar);
                }
            });
        }
    }

    static final class f<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WebSharePackage f124021a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f124022b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f124023c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f124024d;

        static {
            Covode.recordClassIndex(81428);
        }

        f(WebSharePackage webSharePackage, boolean z, com.ss.android.ugc.aweme.sharer.b bVar, String str) {
            this.f124021a = webSharePackage;
            this.f124022b = z;
            this.f124023c = bVar;
            this.f124024d = str;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            final m mVar;
            String str = (String) obj;
            l.d(str, "");
            if (this.f124022b) {
                str = this.f124021a.f124594h;
            }
            if (l.a((Object) this.f124023c.a(), (Object) "email")) {
                mVar = new k(str, this.f124021a.f124592f, this.f124024d);
            } else {
                mVar = new m(str, this.f124024d);
            }
            return n.a((q) new q(this) {
                /* class com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f124025a;

                static {
                    Covode.recordClassIndex(81429);
                }

                {
                    this.f124025a = r1;
                }

                @Override // f.a.q
                public final void a(o<com.ss.android.ugc.aweme.sharer.h> oVar) {
                    l.d(oVar, "");
                    m mVar = mVar;
                    String str = this.f124025a.f124021a.f124007a;
                    if (str == null) {
                        str = "";
                    }
                    String a2 = com.ss.android.ugc.aweme.base.e.a(str);
                    l.b(a2, "");
                    if (a2.length() > 0) {
                        String str2 = am.g(com.bytedance.ies.ugc.appcontext.d.a()) + "image_for_share.jpg";
                        com.ss.android.ugc.aweme.video.e.c(str2);
                        com.ss.android.ugc.aweme.video.e.c(a2, str2);
                        String uri = com.ss.android.ugc.aweme.share.improve.c.c.a(str2, com.bytedance.ies.ugc.appcontext.d.a()).toString();
                        l.b(uri, "");
                        mVar.a("image", uri);
                    }
                    oVar.a(mVar);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final n<com.ss.android.ugc.aweme.sharer.h> b(com.ss.android.ugc.aweme.sharer.b bVar) {
        n<String> b2;
        l.d(bVar, "");
        String a2 = com.ss.android.ugc.aweme.share.m.h.f124087a.a(bVar, this.f124590d, this.f124593g);
        boolean z = this.f124595i.getBoolean("user_origin_link");
        if (z) {
            b2 = n.a((q) new h(this));
            l.b(b2, "");
        } else {
            b2 = com.ss.android.ugc.aweme.share.improve.c.c.b(this.f124594h, this.f124590d, bVar);
        }
        if (l.a((Object) bVar.a(), (Object) "facebook")) {
            n<R> a3 = b2.a(new b(a2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
            l.b(a3, "");
            return a3;
        }
        n<R> a4 = b2.a(new c(this, z, bVar, a2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        l.b(a4, "");
        return a4;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final com.ss.android.ugc.aweme.sharer.h a(com.ss.android.ugc.aweme.sharer.b bVar) {
        String a2;
        l.d(bVar, "");
        String a3 = com.ss.android.ugc.aweme.share.m.h.f124087a.a(bVar, this.f124590d, this.f124593g);
        if (this.f124595i.getBoolean("user_origin_link")) {
            a2 = this.f124594h;
        } else {
            a2 = com.ss.android.ugc.aweme.share.improve.c.c.a(this.f124594h, this.f124590d, bVar);
        }
        if (l.a((Object) bVar.a(), (Object) "facebook")) {
            return new k(a2, a3, null, 4);
        }
        if (l.a((Object) bVar.a(), (Object) "email")) {
            return new k(a2, this.f124592f, a3);
        }
        m mVar = new m(a2, a3);
        String str = this.f124007a;
        if (str == null) {
            str = "";
        }
        String a4 = com.ss.android.ugc.aweme.base.e.a(str);
        l.b(a4, "");
        if (a4.length() > 0) {
            String str2 = am.g(com.bytedance.ies.ugc.appcontext.d.a()) + "image_for_share.jpg";
            com.ss.android.ugc.aweme.video.e.c(str2);
            com.ss.android.ugc.aweme.video.e.c(a4, str2);
            String uri = com.ss.android.ugc.aweme.share.improve.c.c.a(str2, com.bytedance.ies.ugc.appcontext.d.a()).toString();
            l.b(uri, "");
            mVar.a("image", uri);
        }
        return mVar;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final void a(com.ss.android.ugc.aweme.sharer.b bVar, h.f.a.b<? super com.ss.android.ugc.aweme.sharer.h, z> bVar2) {
        n<String> b2;
        l.d(bVar, "");
        l.d(bVar2, "");
        String a2 = com.ss.android.ugc.aweme.share.m.h.f124087a.a(bVar, this.f124590d, this.f124593g);
        boolean z = this.f124595i.getBoolean("user_origin_link");
        if (z) {
            b2 = n.a((q) new i(this));
            l.b(b2, "");
        } else {
            b2 = com.ss.android.ugc.aweme.share.improve.c.c.b(this.f124594h, this.f124590d, bVar);
        }
        if (l.a((Object) bVar.a(), (Object) "facebook")) {
            b2.a(new d(a2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).e(new e(bVar2));
        } else {
            b2.a(new f(this, z, bVar, a2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).e(new g(bVar2));
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
