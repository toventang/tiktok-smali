package com.ss.android.ugc.aweme.commercialize.utils.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.feed.f;
import com.ss.android.ugc.aweme.commercialize.d.a;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.commercialize.util.adrouter.b;
import com.ss.android.ugc.aweme.commercialize.util.adrouter.c;
import com.ss.android.ugc.aweme.commercialize.utils.b.a.a;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.miniapp_api.model.b.a;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75510a = new a();

    private a() {
    }

    public static final class b extends com.ss.android.ugc.aweme.commercialize.util.adrouter.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ac f75517a;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f75518d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Aweme f75519e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f75520f;

        static {
            Covode.recordClassIndex(46598);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.e
        public final boolean a() {
            return TextUtils.equals(this.f75517a.type, "app");
        }

        @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.e
        public final boolean b() {
            return com.ss.android.ugc.aweme.commercialize.utils.b.b.a(this.f75518d, this.f75517a.packageName);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.a.a
        public final void a(boolean z, com.ss.android.ugc.aweme.commercialize.util.adrouter.b bVar) {
            l.d(bVar, "");
            super.a(z, bVar);
            if (z) {
                j.a("open_url_app", this.f75518d, this.f75517a, this.f75519e, this.f75520f);
            }
        }

        b(ac acVar, Context context, Aweme aweme, boolean z) {
            this.f75517a = acVar;
            this.f75518d = context;
            this.f75519e = aweme;
            this.f75520f = z;
        }
    }

    static {
        Covode.recordClassIndex(46595);
    }

    /* access modifiers changed from: package-private */
    public static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f75525a;

        static {
            Covode.recordClassIndex(46600);
        }

        d(Aweme aweme) {
            this.f75525a = aweme;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                com.ss.android.ugc.aweme.commercialize.d dVar = com.ss.android.ugc.aweme.commercialize.d.f73752a;
                l.b(dVar, "");
                dVar.f73753b = this.f75525a.getAwemeRawAd();
                return null;
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a("", e2);
                return null;
            }
        }
    }

    private static boolean a() {
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            Boolean enableAdRouter = iESSettingsProxy.getEnableAdRouter();
            l.b(enableAdRouter, "");
            return enableAdRouter.booleanValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements n.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f75526a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ac f75527b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f75528c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f75529d;

        static {
            Covode.recordClassIndex(46601);
        }

        e(Context context, ac acVar, Aweme aweme, boolean z) {
            this.f75526a = context;
            this.f75527b = acVar;
            this.f75528c = aweme;
            this.f75529d = z;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.n.a
        public final void sendLog(boolean z) {
            if (z) {
                j.a("deeplink_success", this.f75526a, this.f75527b, this.f75528c, this.f75529d);
            } else {
                j.a("deeplink_failed", this.f75526a, this.f75527b, this.f75528c, this.f75529d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a$a  reason: collision with other inner class name */
    public static final class C1720a extends com.ss.android.ugc.aweme.commercialize.util.adrouter.a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f75512a;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ac f75513e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Aweme f75514f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f75515g;

        static {
            Covode.recordClassIndex(46596);
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a$a$a  reason: collision with other inner class name */
        static final class C1721a implements n.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1720a f75516a;

            static {
                Covode.recordClassIndex(46597);
            }

            C1721a(C1720a aVar) {
                this.f75516a = aVar;
            }

            @Override // com.ss.android.ugc.aweme.commercialize.utils.n.a
            public final void sendLog(boolean z) {
                if (z) {
                    j.a("deeplink_success", this.f75516a.f75512a, this.f75516a.f75513e, this.f75516a.f75514f, this.f75516a.f75515g);
                } else {
                    j.a("deeplink_failed", this.f75516a.f75512a, this.f75516a.f75513e, this.f75516a.f75514f, this.f75516a.f75515g);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.a.a
        public final void a(boolean z, com.ss.android.ugc.aweme.commercialize.util.adrouter.b bVar) {
            l.d(bVar, "");
            super.a(z, bVar);
            if (z) {
                j.a("open_url_app", this.f75512a, this.f75513e, this.f75514f, this.f75515g);
                w.a(new C1721a(this));
            }
        }

        C1720a(Context context, ac acVar, Aweme aweme, boolean z) {
            this.f75512a = context;
            this.f75513e = acVar;
            this.f75514f = aweme;
            this.f75515g = z;
        }
    }

    private static boolean a(String str) {
        try {
            if (Long.parseLong(str) > 0) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static final class c extends com.ss.android.ugc.aweme.commercialize.utils.a.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f75521a;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ac f75522d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Aweme f75523e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f75524f;

        static {
            Covode.recordClassIndex(46599);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.a.a
        public final void a(boolean z, com.ss.android.ugc.aweme.commercialize.util.adrouter.b bVar) {
            l.d(bVar, "");
            super.a(z, bVar);
            if (z) {
                j.a("open_url_h5", this.f75521a, this.f75522d, this.f75523e, this.f75524f);
            }
        }

        c(Context context, ac acVar, Aweme aweme, boolean z) {
            this.f75521a = context;
            this.f75522d = acVar;
            this.f75523e = aweme;
            this.f75524f = z;
        }
    }

    public static final boolean a(Context context, ac acVar, Aweme aweme, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (context == null || acVar == null || aweme == null) {
            return false;
        }
        String str8 = acVar.creativeId;
        l.b(str8, "");
        String str9 = acVar.logExtra;
        if (!a(str8)) {
            f fVar = f.f65854a;
            l.b(fVar, "");
            com.ss.android.ugc.aweme.ad.feed.d.a aVar = fVar.f65855b;
            if (aVar != null) {
                str8 = String.valueOf(aVar.f65815a);
                str9 = aVar.f65816b;
            }
        }
        String str10 = "mp_url";
        String str11 = null;
        if (a()) {
            b.a f2 = new b.a().f(acVar.openUrl);
            String str12 = acVar.mpUrl;
            b.e eVar = f2.f75413a.f75410d;
            if (str12 == null) {
                str12 = "";
            }
            l.d(str12, "");
            eVar.f75437a = str12;
            a.C2810a aVar2 = new a.C2810a();
            if (com.ss.android.ugc.aweme.miniapp_api.d.c(acVar.openUrl)) {
                str10 = "open_url";
            }
            aVar2.f109682d = str10;
            if (z) {
                str5 = "comment_page";
            } else {
                str5 = "in_video_tag";
            }
            aVar2.f109679a = str5;
            f2.f75413a.f75410d.f75438b = aVar2.a();
            b.a h2 = f2.g(acVar.webUrl).h(acVar.webTitle);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null || (str6 = awemeRawAd.getDownloadUrl()) == null) {
                str6 = acVar.downloadUrl;
            }
            b.a s = h2.s(str6);
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 == null || (str7 = awemeRawAd2.getPackageName()) == null) {
                str7 = acVar.packageName;
            }
            b.a t = s.t(str7);
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 != null) {
                str11 = awemeRawAd3.getAppName();
            }
            return new c.a().a(context).a(t.v(str11).a(aweme.getAwemeRawAd()).c(str8).d(str9).a(aweme.getAid()).b(aweme.getAuthorUid()).f75413a).a(new com.ss.android.ugc.aweme.commercialize.util.adrouter.a.c()).a(new C1720a(context, acVar, aweme, z)).a(new b(acVar, context, aweme, z)).a(new com.ss.android.ugc.aweme.commercialize.util.adrouter.a.d()).a(new c(context, acVar, aweme, z)).f75460a.a();
        }
        String str13 = acVar.openUrl;
        if (!TextUtils.isEmpty(acVar.openUrl) && com.ss.android.ugc.aweme.miniapp_api.d.c(str13)) {
            String a2 = l.a(str13, (Object) "&schema_from=ad_link");
            if (z) {
                str4 = "&position=comment_page";
            } else {
                str4 = "&position=in_video_tag";
            }
            str13 = l.a(a2, (Object) str4);
        }
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.b(str13)) {
            if (acVar.feedShowType == 3) {
                str3 = "comment_ad";
            } else {
                str3 = "draw_ad";
            }
            String builder = Uri.parse(a.AbstractC1652a.f73756a).buildUpon().appendQueryParameter("tag", str3).toString();
            l.b(builder, "");
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.b(str13)) {
                str13 = str13.replace("__back_url__", Uri.encode(builder));
            }
            i.b(new d(aweme), i.f4824a);
        }
        if (w.a(context, str13, false)) {
            j.a("open_url_app", context, acVar, aweme, z);
            w.a(new e(context, acVar, aweme, z));
            return true;
        }
        if (com.ss.android.ugc.aweme.miniapp_api.d.c(acVar.mpUrl)) {
            com.ss.android.ugc.aweme.miniapp_api.services.c cVar = c.a.f109704a;
            l.b(cVar, "");
            IMiniAppService a3 = cVar.a();
            l.b(a3, "");
            String str14 = acVar.mpUrl;
            com.ss.android.ugc.aweme.miniapp_api.model.b.a aVar3 = new com.ss.android.ugc.aweme.miniapp_api.model.b.a();
            aVar3.f109677e = str10;
            if (a3.openMiniApp(context, str14, aVar3)) {
                return true;
            }
        }
        if (TextUtils.equals(acVar.type, "app")) {
            j.a("open_url_app", context, acVar, aweme, z);
            return com.ss.android.ugc.aweme.commercialize.utils.b.b.a(context, acVar.packageName);
        }
        long j2 = 0;
        try {
            j2 = Long.parseLong(str8);
        } catch (Exception unused) {
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aweme.getAwemeRawAd() != null) {
            AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
            if (awemeRawAd4 != null) {
                str = awemeRawAd4.getDownloadUrl();
            } else {
                str = null;
            }
            AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
            if (awemeRawAd5 != null) {
                str2 = awemeRawAd5.getPackageName();
            } else {
                str2 = null;
            }
            AwemeRawAd awemeRawAd6 = aweme.getAwemeRawAd();
            if (awemeRawAd6 != null) {
                str11 = awemeRawAd6.getAppName();
            }
        } else if (acVar.feedShowType == 3) {
            str = acVar.downloadUrl;
            str2 = acVar.packageName;
            linkedHashMap.put("aweme_package_name", acVar.packageName);
            linkedHashMap.put("bundle_app_ad_from", "6");
        } else {
            str = null;
            str2 = null;
            str11 = null;
        }
        if (!com.ss.android.ugc.aweme.commercialize.utils.b.a.a.a(context, acVar.webUrl, acVar.webTitle, false, linkedHashMap, true, new a.C1724a(Long.valueOf(j2), str9, str, str2, str11, acVar.type, 192))) {
            return false;
        }
        j.a("open_url_h5", context, acVar, aweme, z);
        return true;
    }
}
