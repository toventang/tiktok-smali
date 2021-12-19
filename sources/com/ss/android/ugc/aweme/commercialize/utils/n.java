package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.router.SmartRouter;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.app.d;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.commercialize.d.a;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b;
import com.ss.android.ugc.aweme.commercialize.log.ai;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget;
import com.ss.android.ugc.aweme.commercialize.utils.b.a.a;
import com.ss.android.ugc.aweme.commercialize.utils.b.d;
import com.ss.android.ugc.aweme.commercialize.utils.b.e;
import com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.ss.android.ugc.aweme.feed.helper.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.x.k;
import com.ss.android.ugc.aweme.miniapp_api.model.b.a;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.Map;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f75800a = {"webcast_room"};

    public interface a {
        static {
            Covode.recordClassIndex(46747);
        }

        void sendLog(boolean z);
    }

    public static boolean a(Uri uri) {
        if (uri != null) {
            return TextUtils.equals("http", uri.getScheme()) || TextUtils.equals("https", uri.getScheme());
        }
        return false;
    }

    public static boolean a(Context context, String str, Aweme aweme) {
        return a(context, str, aweme, false, 0);
    }

    private static boolean a(Context context, String str, Aweme aweme, boolean z, int i2) {
        if (context == null || aweme == null || !aweme.isAd() || TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.getScheme())) {
            return false;
        }
        Uri build = parse.buildUpon().appendQueryParameter("source_aid", aweme.getAid()).build();
        String lowerCase = build.getScheme().toLowerCase();
        if (a(str) && aweme.getAwemeRawAd() != null) {
            build = build.buildUpon().appendQueryParameter("creative_id", aweme.getAwemeRawAd().getCreativeIdStr()).appendQueryParameter("log_extra", aweme.getAwemeRawAd().getLogExtra()).appendQueryParameter("ad_id", String.valueOf(aweme.getAwemeRawAd().getAdId())).appendQueryParameter("live.intent.extra.ENTER_AWEME_ID", aweme.getAid()).build();
            str = build.toString();
        }
        if (b.a(lowerCase)) {
            e.a(str);
            d.f66684e.a(context, str);
            ai.a(str);
            return true;
        } else if (TextUtils.equals(lowerCase, "aweme")) {
            SmartRouter.buildRoute(context, str).open();
            return true;
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(build);
            if (!f.a(context, intent)) {
                return false;
            }
            if (str.contains("__back_url__")) {
                str = str.replace("__back_url__", Uri.encode(a.AbstractC1652a.f73756a));
                intent.setData(Uri.parse(str));
                i.b(new o(aweme), i.f4824a);
            }
            intent.putExtra("open_url", str);
            intent.addFlags(268435456);
            if (!a(context, intent)) {
                return false;
            }
            if (!b.q(aweme)) {
                if (i2 == 53) {
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad", "open_url_app", aweme.getAwemeRawAd()).b("refer", "button").c();
                    a(new p(aweme));
                } else if (i2 == 54) {
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad_bg", "open_url_app", aweme.getAwemeRawAd()).b("refer", "bg_more_button").c();
                    a(new q(aweme));
                } else {
                    j.c(context, aweme);
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "open_url_app", aweme.getAwemeRawAd()).c();
                    a(new r(context, aweme));
                }
            }
            return true;
        }
    }

    private static boolean a(String str) {
        if (str == null) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            for (String str2 : f75800a) {
                if (TextUtils.equals(str2, parse.getHost())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (com.ss.android.ugc.aweme.miniapp_api.d.c(str)) {
            c.a.f109704a.a().openMiniApp(context, str, new com.ss.android.ugc.aweme.miniapp_api.model.b.a());
            return true;
        }
        if (str.contains("__back_url__")) {
            str = str.replace("__back_url__", Uri.encode(a.AbstractC1652a.f73756a));
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !w.d(context, str)) {
            return false;
        }
        if (b.a(scheme)) {
            e.a(str);
            d.f66684e.a(context, str);
            return true;
        } else if (b(str)) {
            t.a(t.a(), str);
            return true;
        } else if (z) {
            return false;
        } else {
            if (c(str)) {
                return a(context, new Intent("android.intent.action.SENDTO", parse));
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            if (!f.a(context, intent)) {
                return false;
            }
            intent.putExtra("open_url", str);
            if (!a(context, intent)) {
                return false;
            }
            return true;
        }
    }

    public static boolean a(Context context, Aweme aweme, String str, String str2) {
        return a(context, aweme, str, str2, aweme == null || (aweme.isAd() && k.a(aweme.getAwemeRawAd())));
    }

    public static boolean a(Context context, String str, String str2) {
        return a(context, str, str2, false, (Map<String, String>) null);
    }

    public static boolean a(Context context, String str, String str2, boolean z, Map<String, String> map) {
        return a(context, str, str2, z, map, true);
    }

    public static boolean a(Context context, String str, String str2, boolean z, Map<String, String> map, boolean z2) {
        return a(context, str, str2, z, map, z2, null);
    }

    public static boolean a(Context context, String str, String str2, boolean z, Map<String, String> map, boolean z2, a.C1724a aVar) {
        return com.ss.android.ugc.aweme.commercialize.utils.b.a.a.a(context, str, str2, z, map, z2, aVar);
    }

    public static boolean a(b.a aVar) {
        if (!(aVar == null || aVar.f74383a == null || aVar.f74384b == null)) {
            aVar.a(com.ss.android.ugc.aweme.commercialize.e.a.b.d(aVar.f74390h));
            int i2 = aVar.f74386d;
            if (((i2 == 7 || i2 == 8) && a(aVar, false)) || b(aVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(b.a aVar, boolean z) {
        if (!(aVar == null || aVar.f74383a == null || aVar.f74384b == null)) {
            aVar.b(8);
            aVar.a(z);
            if ((aVar.f74383a instanceof Activity) && com.ss.android.ugc.aweme.commercialize.e.a.a.b(aVar.f74391i)) {
                AdProfilePopUpWebPageWidget.a(aVar.a());
                return true;
            }
        }
        return false;
    }

    static {
        Covode.recordClassIndex(46746);
    }

    public static void a(a aVar) {
        i.a(5000).a(new s(aVar));
    }

    static final /* synthetic */ Object a(Aweme aweme) {
        try {
            com.ss.android.ugc.aweme.commercialize.d.f73752a.f73753b = aweme.getAwemeRawAd();
            return null;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            return null;
        }
    }

    private static boolean b(b.a aVar) {
        if (aVar == null || aVar.f74383a == null || aVar.f74384b == null || !(aVar.f74383a instanceof Activity) || !com.ss.android.ugc.aweme.commercialize.e.a.b.a(aVar.f74384b, aVar.f74387e) || !com.ss.android.ugc.aweme.commercialize.e.a.a.a(aVar.f74391i)) {
            return false;
        }
        if (com.ss.android.ugc.aweme.commercialize.feed.assem.b.f74088a) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.feed.assem.popup.b.b(aVar.a()));
        } else {
            AdPopUpWebPageWidget.s.a(aVar.a());
        }
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.event.a(1));
        return true;
    }

    private static boolean b(Aweme aweme) {
        if (aweme == null) {
            return true;
        }
        if (!aweme.isAd() || !k.a(aweme.getAwemeRawAd())) {
            return false;
        }
        return true;
    }

    private static boolean b(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("aweme://")) {
            return false;
        }
        return true;
    }

    private static boolean c(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("mailto:")) {
            return false;
        }
        return true;
    }

    public static boolean b(Context context, Aweme aweme) {
        if (context != null && com.ss.android.ugc.aweme.commercialize.e.a.b.r(aweme)) {
            return b(context, aweme.getAwemeRawAd().getWebUrl());
        }
        return false;
    }

    public static boolean a(Context context, int i2) {
        if (c(context, PreRenderWebViewBusiness.a.a(i2))) {
            return true;
        }
        return false;
    }

    public static boolean b(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return a(context, Intent.createChooser(intent, ""));
        }
        return false;
    }

    private static boolean c(Context context, String str) {
        if (!(context instanceof Activity) || !com.ss.android.ugc.aweme.commercialize.views.a.a((Activity) context, str)) {
            return false;
        }
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.event.a(1));
        return true;
    }

    public static void c(Context context, Aweme aweme) {
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.n(aweme).getSplashInfo().isEnableSplashOpen()) {
            com.ss.android.ugc.aweme.commercialize.utils.b.a.a.a(context, aweme, null, null, b(aweme), true, 7, true);
        } else if (!a(context, aweme)) {
            IPluginService d2 = AabPluginServiceImpl.d();
            if (d2 == null || !d2.a("com.ss.android.ugc.aweme.miniapp") || !com.ss.android.ugc.aweme.miniapp.utils.a.a(context, aweme)) {
                com.ss.android.ugc.aweme.commercialize.utils.b.a.a.a(context, aweme, null, null, b(aweme), true, 7, true);
            }
        }
    }

    public static void a(Context context, String str) {
        Integer e2;
        if (context != null && str != null) {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            intent.setData(Uri.parse(parse.getQueryParameter("url")));
            String queryParameter = parse.getQueryParameter("immersive_mode");
            String queryParameter2 = parse.getQueryParameter("enter_from");
            String queryParameter3 = parse.getQueryParameter("author_id");
            if (!(queryParameter == null || (e2 = p.e(queryParameter)) == null || e2.intValue() != 1)) {
                intent.putExtra("use_ordinary_web", false);
            }
            if (queryParameter2 != null) {
                intent.putExtra("quick_shop_enter_from", queryParameter2);
            }
            if (queryParameter3 != null) {
                intent.putExtra("owner_id", queryParameter3);
            }
            intent.putExtra("web_type", 2);
            w.a(context, intent);
        }
    }

    public static boolean a(Context context, Intent intent) {
        if (!(context == null || intent == null)) {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException | SecurityException unused) {
            }
        }
        return false;
    }

    public static boolean a(Context context, Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return a(context, aweme.getAwemeRawAd().getOpenUrl(), aweme);
    }

    public static boolean e(Context context, Aweme aweme, int i2) {
        if (context == null || aweme == null) {
            return false;
        }
        return a(new b.a().a(context).a(aweme.getAwemeRawAd()).b(i2).c(aweme.getAid()));
    }

    static boolean d(Context context, Aweme aweme, int i2) {
        IAdSceneService f2 = AdSceneServiceImpl.f();
        if (f2 != null) {
            f2.c().a(aweme, context, i2);
        }
        if (i2 == 3 || i2 == 4 || i2 == 35 || i2 == 5 || i2 == 36 || i2 == 6) {
            if ((com.ss.android.ugc.aweme.commercialize.e.a.b.aN(aweme) && a(context, aweme)) || com.ss.android.ugc.aweme.miniapp.utils.a.a(context, aweme)) {
                return false;
            }
            if (e(context, aweme, i2) || a(context, i2)) {
                return true;
            }
            a(context, aweme, (String) null, (String) null);
            return false;
        } else if (e(context, aweme, i2) || a(context, i2)) {
            return true;
        } else {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.event.e(aweme, i2));
            return true;
        }
    }

    static boolean f(Context context, Aweme aweme, int i2) {
        IAdSceneService f2 = AdSceneServiceImpl.f();
        if (f2 != null) {
            f2.c().a(aweme, context, i2);
        }
        if (aweme != null && aweme.isAd() && !a(context, aweme.getAwemeRawAd().getRedOpenUrl(), aweme)) {
            if (!(context == null || aweme.getAwemeRawAd() == null)) {
                String redMpUrl = aweme.getAwemeRawAd().getRedMpUrl();
                if (com.ss.android.ugc.aweme.miniapp_api.d.c(redMpUrl)) {
                    a.C2810a aVar = new a.C2810a();
                    aVar.f109681c = "025002";
                    aVar.f109682d = "red_mp_url";
                    c.a.f109704a.a().openMiniApp(context, redMpUrl, aVar.a());
                }
            }
            a(context, aweme, aweme.getAwemeRawAd().getRedUrl(), (String) null, k.a(aweme.getAwemeRawAd()));
        }
        return false;
    }

    public static void a(Context context, Aweme aweme, String str) {
        if (aweme != null) {
            new a.C0731a(context).b(R.string.oj).a(R.string.asg, (DialogInterface.OnClickListener) new u(context, aweme, str), false).b(R.string.a9e, (DialogInterface.OnClickListener) new v(context, aweme), false).a().b();
            j.k(context, aweme);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "open_url_window_show", aweme.getAwemeRawAd()).c();
        }
    }

    static boolean c(Context context, Aweme aweme, int i2) {
        boolean z;
        IAdSceneService f2 = AdSceneServiceImpl.f();
        if (f2 == null || !f2.c().a(aweme, context, i2)) {
            z = false;
        } else {
            z = true;
        }
        if ((i2 == 2 || i2 == 6 || i2 == 3 || i2 == 8 || i2 == 45) && com.ss.android.ugc.aweme.commercialize.e.a.b.a(com.ss.android.ugc.aweme.commercialize.e.a.b.ar(aweme))) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.event.d(aweme, i2));
            if (i2 == 6) {
                return true;
            }
            return false;
        } else if (z && !com.ss.android.ugc.aweme.commercialize.e.a.b.aN(aweme) && !com.ss.android.ugc.aweme.commercialize.e.a.b.F(aweme)) {
            e.a(context, null);
            return true;
        } else if (a(context, aweme) || com.ss.android.ugc.aweme.miniapp.utils.a.a(context, aweme)) {
            return false;
        } else {
            a(context, aweme, (String) null, (String) null);
            return false;
        }
    }

    public static boolean b(Context context, Aweme aweme, int i2) {
        boolean z;
        boolean z2;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        IAdSceneService f2 = AdSceneServiceImpl.f();
        if (b(context, aweme)) {
            if (f2 != null) {
                f2.c().a(aweme, context, i2);
            }
            return true;
        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.az(aweme) && i2 == 8) {
            SmartRouter.buildRoute(context, com.ss.android.ugc.aweme.bullet.utils.c.b(aweme.getAwemeRawAd().getOpenUrl(), "fullScreen") + "&fullScreen=false&player_control=0&collapsible=0&expandHeight=0.9").open();
            return true;
        } else if (w.e(context, aweme)) {
            if (f2 != null) {
                f2.c().a(aweme, context, i2);
            }
            return true;
        } else if (!com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme) || TextUtils.isEmpty(aweme.getAwemeRawAd().getAuthorUrl()) || !(i2 == 35 || i2 == 36)) {
            com.bytedance.ies.ugc.aweme.rich.c.a.f fVar = null;
            if (f2 == null || !f2.c().a(aweme, context, i2) || com.ss.android.ugc.aweme.commercialize.e.a.b.aN(aweme) || com.ss.android.ugc.aweme.commercialize.e.a.b.F(aweme) || com.ss.android.ugc.aweme.landpage.b.a.f107275a.a(aweme)) {
                if (i2 != 2 || !com.ss.android.ugc.aweme.commercialize.tasks.b.a()) {
                    if (!(context == null || aweme == null || !aweme.isAd())) {
                        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                        if (awemeRawAd3 == null) {
                            l.b();
                        }
                        l.b(awemeRawAd3, "");
                        String openUrl = awemeRawAd3.getOpenUrl();
                        if (com.ss.android.ugc.aweme.commercialize.im.a.a(openUrl)) {
                            String b2 = com.ss.android.ugc.aweme.commercialize.im.a.b(openUrl);
                            AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                            if (awemeRawAd4 == null) {
                                l.b();
                            }
                            l.b(awemeRawAd4, "");
                            String logExtra = awemeRawAd4.getLogExtra();
                            AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
                            if (awemeRawAd5 == null) {
                                l.b();
                            }
                            l.b(awemeRawAd5, "");
                            d.a aVar = new d.a(aweme, context, new com.ss.android.ugc.aweme.im.service.model.e(logExtra, String.valueOf(awemeRawAd5.getCreativeId().longValue())), Looper.getMainLooper());
                            com.ss.android.ugc.aweme.profile.api.e.a();
                            com.ss.android.ugc.aweme.profile.api.e.a(aVar, b2);
                            return false;
                        }
                    }
                    if (i2 == 53 || i2 == 54) {
                        if (aweme != null && aweme.isAd() && a(context, aweme.getAwemeRawAd().getOpenUrl(), aweme, false, i2)) {
                            return false;
                        }
                    } else if (a(context, aweme)) {
                        return false;
                    }
                    if (com.ss.android.ugc.aweme.miniapp.utils.a.a(context, aweme)) {
                        return false;
                    }
                    if (e(context, aweme, i2) || a(context, i2)) {
                        return true;
                    }
                    if (i2 == 53) {
                        if (aweme == null || (aweme.isAd() && k.a(aweme.getAwemeRawAd()))) {
                            z = true;
                        } else {
                            z = false;
                        }
                        com.ss.android.ugc.aweme.commercialize.utils.b.a.a.a(context, aweme, null, null, z, true, 5, false);
                    } else if (i2 == 54) {
                        if (aweme == null || (aweme.isAd() && k.a(aweme.getAwemeRawAd()))) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        com.ss.android.ugc.aweme.commercialize.utils.b.a.a.a(context, aweme, null, null, z2, true, 8, false);
                    } else {
                        a(context, aweme, (String) null, (String) null);
                    }
                    return false;
                }
                AwemeRawAd awemeRawAd6 = aweme.getAwemeRawAd();
                com.ss.android.ugc.aweme.commercialize.tasks.d dVar = com.ss.android.ugc.aweme.commercialize.tasks.d.f75342a;
                String openUrl2 = awemeRawAd6.getOpenUrl();
                String webUrl = awemeRawAd6.getWebUrl();
                String webTitle = awemeRawAd6.getWebTitle();
                if (!(context == null || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
                    l.b(awemeRawAd, "");
                    boolean a2 = k.a(awemeRawAd);
                    com.bytedance.ies.ugc.aweme.rich.c.a.e a3 = com.ss.android.ugc.aweme.commercialize.tasks.d.a(context, awemeRawAd);
                    Bundle bundle = new Bundle();
                    AwemeRawAd awemeRawAd7 = aweme.getAwemeRawAd();
                    if (awemeRawAd7 != null) {
                        l.b(awemeRawAd7, "");
                        bundle.putString("aweme_id", aweme.getAid());
                        bundle.putString("open_url", awemeRawAd7.getOpenUrl());
                        bundle.putString("log_extra", awemeRawAd7.getLogExtra());
                        bundle.putString("creative_id", String.valueOf(awemeRawAd7.getCreativeId().longValue()));
                    }
                    fVar = a3.a(8, bundle).a(0, com.ss.android.ugc.aweme.commercialize.tasks.d.a(openUrl2)).a(1, com.ss.android.ugc.aweme.commercialize.tasks.d.a(openUrl2, aweme)).a(5, com.ss.android.ugc.aweme.commercialize.tasks.d.a(webUrl, webTitle, aweme, i2)).a(6, com.ss.android.ugc.aweme.commercialize.tasks.d.a(aweme, i2)).a(4, com.ss.android.ugc.aweme.commercialize.tasks.d.b(webUrl, aweme)).a(3, com.ss.android.ugc.aweme.commercialize.tasks.d.a(dVar, context, webUrl, webTitle, aweme, a2)).a(2, com.ss.android.ugc.aweme.commercialize.tasks.d.a(context, webUrl, webTitle, aweme, a2, null, 0, null, 224)).c();
                }
                int i3 = fVar.f35148b;
                if (i3 == 5 || i3 == 6) {
                    return true;
                }
                return false;
            } else if (i2 == 2 && com.ss.android.ugc.aweme.commercialize.tasks.b.a()) {
                AwemeRawAd awemeRawAd8 = aweme.getAwemeRawAd();
                String webUrl2 = awemeRawAd8.getWebUrl();
                String webTitle2 = awemeRawAd8.getWebTitle();
                if (!(context == null || aweme == null || (awemeRawAd2 = aweme.getAwemeRawAd()) == null)) {
                    l.b(awemeRawAd2, "");
                    fVar = com.ss.android.ugc.aweme.commercialize.tasks.d.a(context, awemeRawAd2).a(5, com.ss.android.ugc.aweme.commercialize.tasks.d.a(webUrl2, webTitle2, aweme, i2)).a(6, com.ss.android.ugc.aweme.commercialize.tasks.d.a(aweme, i2)).a(7, null).c();
                }
                return fVar.f35147a;
            } else if (e(context, aweme, i2) || a(context, i2)) {
                return true;
            } else {
                h.a().f93346i = i2;
                e.a(context, null);
                return true;
            }
        } else {
            e.a(context, "click_title");
            return true;
        }
    }

    static boolean a(Context context, Aweme aweme, int i2) {
        if (!aweme.isAd()) {
            return false;
        }
        IAdSceneService f2 = AdSceneServiceImpl.f();
        if (f2 != null) {
            f2.c().a(aweme, context, i2);
        }
        if (a(context, aweme, aweme.getAwemeRawAd().getConsultUrl(), aweme.getAwemeRawAd().getWebTitle(), true)) {
            return true;
        }
        return false;
    }

    public static void a(Context context, ac acVar, Aweme aweme, boolean z) {
        if (context != null && acVar != null) {
            if (a(acVar.openUrl) && aweme.getAwemeRawAd() != null) {
                acVar.openUrl = Uri.parse(acVar.openUrl).buildUpon().appendQueryParameter("creative_id", aweme.getAwemeRawAd().getCreativeIdStr()).appendQueryParameter("log_extra", aweme.getAwemeRawAd().getLogExtra()).build().toString();
            }
            com.ss.android.ugc.aweme.commercialize.utils.a.a.a(context, acVar, aweme, z);
        }
    }

    private static boolean a(Context context, Aweme aweme, String str, String str2, boolean z) {
        return b(context, aweme, str, str2, z);
    }

    private static boolean b(Context context, Aweme aweme, String str, String str2, boolean z) {
        return c(context, aweme, str, str2, z);
    }

    private static boolean c(Context context, Aweme aweme, String str, String str2, boolean z) {
        return com.ss.android.ugc.aweme.commercialize.utils.b.a.a.a(context, aweme, str, str2, z, true, 1, false);
    }
}
