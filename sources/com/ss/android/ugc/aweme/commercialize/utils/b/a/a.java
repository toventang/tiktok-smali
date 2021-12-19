package com.ss.android.ugc.aweme.commercialize.utils.b.a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.r;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.preload.f;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.abtest.c;
import com.ss.android.ugc.aweme.commercialize.d.a;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.model.ag;
import com.ss.android.ugc.aweme.commercialize.utils.ay;
import com.ss.android.ugc.aweme.commercialize.utils.b.b;
import com.ss.android.ugc.aweme.commercialize.utils.bs;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.crossplatform.activity.e;
import com.ss.android.ugc.aweme.crossplatform.activity.l;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;
import h.m.p;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75645a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(46654);
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(String str) {
        if (str != null && str.length() != 0) {
            e.a();
            e.a(new l(str, "Jump directly to open the landing page"));
        }
    }

    public static boolean a(String str, Context context, AwemeRawAd awemeRawAd) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(context, "");
        Uri parse = Uri.parse(str);
        h.f.b.l.b(parse, "");
        if (h.f.b.l.a((Object) parse.getScheme(), (Object) "market")) {
            if (!b.a(context)) {
                com.ss.android.ugc.aweme.commercialize.utils.b.a.a(context, awemeRawAd, str);
                while (true) {
                    if (context != null) {
                        if (!(context instanceof Activity)) {
                            if (!(context instanceof ContextWrapper)) {
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        } else {
                            Activity activity = (Activity) context;
                            if (activity != null) {
                                new com.bytedance.tux.g.b(activity).e(R.string.of).b();
                            }
                        }
                    } else {
                        break;
                    }
                }
            } else if (b.a(context, parse)) {
                com.ss.android.ugc.aweme.commercialize.utils.b.a.b(context, awemeRawAd, str);
            }
            return true;
        } else if (b.a(parse)) {
            if (!b.a(context)) {
                return false;
            }
            if (b.b(context, parse)) {
                com.ss.android.ugc.aweme.commercialize.utils.b.a.b(context, awemeRawAd, str);
            }
            return true;
        } else if (w.a(parse)) {
            if (!com.ss.android.ugc.aweme.commercialize.utils.b.a.c(context, parse)) {
                return false;
            }
            if (com.ss.android.ugc.aweme.commercialize.utils.b.a.a(context, parse)) {
                com.ss.android.ugc.aweme.commercialize.utils.b.a.b(context, awemeRawAd, str);
            }
            return true;
        } else if (com.ss.android.ugc.aweme.commercialize.utils.b.a.d(context, parse)) {
            if (com.ss.android.ugc.aweme.commercialize.utils.b.a.b(context, parse)) {
                com.ss.android.ugc.aweme.commercialize.utils.b.a.b(context, awemeRawAd, str);
            }
            return true;
        } else {
            if (!(!h.f.b.l.a((Object) "sslocal", (Object) parse.getScheme())) || !(!h.f.b.l.a((Object) "localsdk", (Object) parse.getScheme()))) {
                d.a.a(context, str, (String) null, false);
            } else {
                com.ss.android.ugc.aweme.commercialize.utils.b.a.a(context, awemeRawAd, str);
            }
            while (true) {
                if (context != null) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        Activity activity2 = (Activity) context;
                        if (activity2 != null) {
                            new com.bytedance.tux.g.b(activity2).e(R.string.of).b();
                        }
                    }
                } else {
                    break;
                }
            }
            return true;
        }
    }

    private static boolean a(Context context, Aweme aweme, Bundle bundle) {
        String str;
        String str2;
        List<String> secondPageGeckoChannel;
        String str3;
        List<String> geckoChannel;
        UrlModel originCover;
        List<String> urlList;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            return false;
        }
        h.f.b.l.b(awemeRawAd, "");
        if (awemeRawAd.getNonNativeClick() != 0 || !com.ss.android.ugc.aweme.landpage.b.a.f107275a.a(awemeRawAd)) {
            return false;
        }
        ag nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
        if (nativeSiteConfig == null || (str = nativeSiteConfig.getLynxScheme()) == null) {
            str = "";
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("is_lynx_landing_page", true);
        bundle.putBoolean("hide_nav_bar", true);
        bundle.putBoolean("hide_status_bar", false);
        bundle.putBoolean("bundle_nav_bar_status_padding", true);
        bundle.putBoolean("need_bottom_out", true);
        ag nativeSiteConfig2 = awemeRawAd.getNativeSiteConfig();
        if (nativeSiteConfig2 != null && nativeSiteConfig2.getLynxLandingStyle() == 1) {
            Video video = aweme.getVideo();
            if (!(video == null || (originCover = video.getOriginCover()) == null || (urlList = originCover.getUrlList()) == null || !(!urlList.isEmpty()))) {
                bundle.putString("bundle_full_screen_bg_image", urlList.get(0));
            }
            bundle.putInt("bundle_webview_background", 0);
        }
        ag nativeSiteConfig3 = awemeRawAd.getNativeSiteConfig();
        if (nativeSiteConfig3 == null || (geckoChannel = nativeSiteConfig3.getGeckoChannel()) == null || geckoChannel.isEmpty()) {
            str2 = "";
        } else {
            str2 = geckoChannel.get(0);
        }
        bundle.putString("lynx_channel_name", str2);
        bundle.putString("bundle_native_site_custom_data", awemeRawAd.getNativeSiteCustomData());
        ag nativeSiteConfig4 = awemeRawAd.getNativeSiteConfig();
        if (!(nativeSiteConfig4 == null || (secondPageGeckoChannel = nativeSiteConfig4.getSecondPageGeckoChannel()) == null || secondPageGeckoChannel.isEmpty())) {
            IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
            if (f2 == null || (str3 = f2.b(awemeRawAd.getAdId())) == null) {
                str3 = "";
            }
            bundle.putString("second_page_preload_channel_prefix", str3);
            f.f66130b.b(secondPageGeckoChannel);
        }
        bundle.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(n.a(context), 1073741824));
        bundle.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(n.b(context) - hh.b(), 1073741824));
        Uri parse = Uri.parse(str);
        h.f.b.l.b(parse, "");
        if (parse.isHierarchical()) {
            bundle.putString("bundle_origin_url", parse.getQueryParameter("fallback_url"));
            if (TextUtils.equals(parse.getQueryParameter("async_layout"), "1")) {
                bundle.putBoolean("preset_safe_point", true);
                bundle.putInt("thread_strategy", r.PART_ON_LAYOUT.id());
            }
        }
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.appendQueryParameter("lynx_landing_page_data", com.ss.android.ugc.aweme.landpage.b.a.f107275a.a(awemeRawAd, context));
        buildUpon.appendQueryParameter("lynx_landing_page_title", awemeRawAd.getWebTitle());
        String builder = buildUpon.toString();
        h.f.b.l.b(builder, "");
        com.ss.android.ugc.aweme.bullet.b.a(context, builder, "ad_commerce", bundle);
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b.a.a$a  reason: collision with other inner class name */
    public static final class C1724a {

        /* renamed from: a  reason: collision with root package name */
        public Long f75646a;

        /* renamed from: b  reason: collision with root package name */
        public String f75647b;

        /* renamed from: c  reason: collision with root package name */
        public String f75648c;

        /* renamed from: d  reason: collision with root package name */
        public String f75649d;

        /* renamed from: e  reason: collision with root package name */
        public String f75650e;

        /* renamed from: f  reason: collision with root package name */
        public String f75651f;

        /* renamed from: g  reason: collision with root package name */
        public int f75652g;

        /* renamed from: h  reason: collision with root package name */
        public int f75653h;

        static {
            Covode.recordClassIndex(46655);
        }

        public C1724a() {
            this((Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255);
        }

        public C1724a(Long l2, String str, String str2, String str3, String str4, String str5, byte b2) {
            this(l2, str, str2, str3, str4, str5, 192);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1724a)) {
                return false;
            }
            C1724a aVar = (C1724a) obj;
            return h.f.b.l.a(this.f75646a, aVar.f75646a) && h.f.b.l.a(this.f75647b, aVar.f75647b) && h.f.b.l.a(this.f75648c, aVar.f75648c) && h.f.b.l.a(this.f75649d, aVar.f75649d) && h.f.b.l.a(this.f75650e, aVar.f75650e) && h.f.b.l.a(this.f75651f, aVar.f75651f) && this.f75652g == aVar.f75652g && this.f75653h == aVar.f75653h;
        }

        public final int hashCode() {
            Long l2 = this.f75646a;
            int i2 = 0;
            int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
            String str = this.f75647b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f75648c;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f75649d;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f75650e;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f75651f;
            if (str5 != null) {
                i2 = str5.hashCode();
            }
            return ((((hashCode5 + i2) * 31) + this.f75652g) * 31) + this.f75653h;
        }

        public final String toString() {
            return "AdWebUrlData(creativeId=" + this.f75646a + ", logExtra=" + this.f75647b + ", downloadUrl=" + this.f75648c + ", packageName=" + this.f75649d + ", appName=" + this.f75650e + ", adType=" + this.f75651f + ", adSystemOrigin=" + this.f75652g + ", appAdFrom=" + this.f75653h + ")";
        }

        private C1724a(Long l2, String str, String str2, String str3, String str4, String str5) {
            this.f75646a = l2;
            this.f75647b = str;
            this.f75648c = str2;
            this.f75649d = str3;
            this.f75650e = str4;
            this.f75651f = str5;
            this.f75652g = 0;
            this.f75653h = 0;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C1724a(Long l2, String str, String str2, String str3, String str4, String str5, int i2) {
            this((i2 & 1) != 0 ? 0L : l2, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) == 0 ? str5 : null);
        }
    }

    public static final boolean a(Context context, String str, String str2, boolean z, Map<String, String> map, boolean z2, C1724a aVar) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (map != null && (!map.isEmpty())) {
            g gVar = new g(str);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                gVar.a(entry.getKey(), entry.getValue());
            }
            str = gVar.a();
        }
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse(str));
        Uri data = intent.getData();
        Integer num = null;
        if (!TextUtils.equals(data != null ? data.getQueryParameter("launch_mode") : null, "standard")) {
            intent.setFlags(268435456);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("title", str2);
        } else {
            intent.putExtra("title", " ");
            intent.putExtra("use_webview_title", true);
        }
        intent.putExtra("hide_nav_bar", z);
        intent.putExtra("bundle_forbidden_jump", true);
        intent.putExtra("use_ordinary_web", z2);
        if (aVar != null) {
            if (!TextUtils.isEmpty(aVar.f75647b)) {
                intent.putExtra("bundle_download_app_log_extra", aVar.f75647b);
            }
            Long l2 = aVar.f75646a;
            if (l2 == null || l2.longValue() != 0) {
                intent.putExtra("ad_id", aVar.f75646a);
                intent.putExtra("ad_type", aVar.f75651f);
                intent.putExtra("ad_system_origin", aVar.f75652g);
                intent.putExtra("aweme_creative_id", String.valueOf(aVar.f75646a));
            }
            SharePrefCache inst = SharePrefCache.inst();
            h.f.b.l.b(inst, "");
            aj<String> jsActlogUrl = inst.getJsActlogUrl();
            h.f.b.l.b(jsActlogUrl, "");
            String c2 = jsActlogUrl.c();
            if (!TextUtils.isEmpty(c2)) {
                intent.putExtra("ad_js_url", c2);
            }
            if (!TextUtils.isEmpty(aVar.f75648c)) {
                intent.putExtra("bundle_download_url", aVar.f75648c);
                intent.putExtra("aweme_package_name", aVar.f75649d);
                intent.putExtra("bundle_download_app_name", aVar.f75650e);
                intent.putExtra("bundle_app_ad_from", aVar.f75653h);
                intent.putExtra("bundle_is_from_app_ad", true);
                if (map != null) {
                    String str3 = map.get("aweme_package_name");
                    String str4 = map.get("bundle_app_ad_from");
                    if (str4 != null) {
                        num = Integer.valueOf(Integer.parseInt(str4));
                    }
                    intent.putExtra("bundle_app_ad_from", num);
                    intent.putExtra("aweme_package_name", str3);
                    if (num != null && num.intValue() == 6) {
                        intent.putExtra("bundle_is_from_comment_app_ad", true);
                    }
                }
            }
        }
        a(str);
        return w.a(context, intent);
    }

    public static final boolean a(Context context, Aweme aweme, String str, String str2, boolean z, boolean z2, int i2, Boolean bool) {
        int i3;
        String str3;
        boolean z3;
        String channelName;
        String appName;
        String str4 = str;
        String str5 = str2;
        if (context == null || aweme == null || !aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (str4 == null) {
            if (awemeRawAd == null) {
                h.f.b.l.b();
            }
            str4 = awemeRawAd.getWebUrl();
            i3 = 1;
            if (str4 == null && (str4 = bs.f(aweme)) == null) {
                return false;
            }
        } else {
            i3 = 0;
        }
        Uri.parse(str4);
        if ((bs.b(awemeRawAd) || bs.c(awemeRawAd)) && a(str4, context, awemeRawAd)) {
            return true;
        }
        if (str5 == null) {
            if (awemeRawAd == null) {
                h.f.b.l.b();
            }
            str5 = awemeRawAd.getWebTitle();
        } else if (awemeRawAd == null) {
            h.f.b.l.b();
        }
        Long creativeId = awemeRawAd.getCreativeId();
        Long groupId = awemeRawAd.getGroupId();
        String logExtra = awemeRawAd.getLogExtra();
        String downloadUrl = awemeRawAd.getDownloadUrl();
        JSONObject a2 = j.a(context, aweme, false, (Map<String, String>) null);
        String packageName = awemeRawAd.getPackageName();
        String quickAppUrl = awemeRawAd.getQuickAppUrl();
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        if (com.ss.android.ugc.aweme.landpage.b.a.f107275a.a(aweme.getAwemeRawAd())) {
            if (i2 == 5) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad", "open_url_h5", awemeRawAd).b("refer", "button").a("render_type", "lynx").b();
            } else if (i2 == 8) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad_bg", "open_url_h5", awemeRawAd).b("refer", "bg_more_button").a("render_type", "lynx").b();
            } else {
                j.g(context, aweme);
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "open_url_h5", awemeRawAd).a("render_type", "lynx").c();
            }
        } else if (i2 == 5) {
            com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad", "open_url_h5", awemeRawAd).b("refer", "button").b();
        } else if (i2 == 8) {
            com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad_bg", "open_url_h5", awemeRawAd).b("refer", "bg_more_button").b();
        } else {
            j.f(context, aweme);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "open_url_h5", awemeRawAd).c();
        }
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse(str4));
        if (TextUtils.isEmpty(str5)) {
            str5 = " ";
        }
        if (!TextUtils.isEmpty(str5)) {
            intent.putExtra("title", str5);
        } else {
            intent.putExtra("title", " ");
            intent.putExtra("use_webview_title", true);
        }
        intent.putExtra("show_report", awemeRawAd.isReportEnable());
        if (!TextUtils.isEmpty(logExtra)) {
            intent.putExtra("bundle_download_app_log_extra", logExtra);
        }
        intent.putExtra("bundle_app_ad_from", i2);
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.B(aweme)) {
            intent.putExtra("enter_from", "topview");
        }
        String str6 = "";
        if (creativeId == null || creativeId.longValue() != 0) {
            h.f.b.l.b(creativeId, str6);
            intent.putExtra("ad_id", creativeId.longValue());
            intent.putExtra("ad_type", awemeRawAd.getType());
            intent.putExtra("ad_system_origin", awemeRawAd.getSystemOrigin());
            intent.putExtra("bundle_download_app_extra", String.valueOf(creativeId.longValue()));
            intent.putExtra("landing_page_info", awemeRawAd.getLandingPageInfo());
            intent.putExtra("enable_web_google_login", awemeRawAd.isEnableWebGoogleLogin());
        }
        SharePrefCache inst = SharePrefCache.inst();
        h.f.b.l.b(inst, str6);
        aj<String> jsActlogUrl = inst.getJsActlogUrl();
        h.f.b.l.b(jsActlogUrl, str6);
        String c2 = jsActlogUrl.c();
        if (!TextUtils.isEmpty(c2)) {
            intent.putExtra("ad_js_url", c2);
        }
        intent.putExtra("bundle_disable_download_dialog", awemeRawAd.isDisableDownloadDialog());
        if (!TextUtils.isEmpty(downloadUrl)) {
            intent.putExtra("bundle_is_from_app_ad", true);
            intent.putExtra("bundle_download_url", downloadUrl);
            intent.putExtra("aweme_package_name", packageName);
            intent.putExtra("bundle_ad_quick_app_url", quickAppUrl);
            boolean isEmpty = TextUtils.isEmpty(awemeRawAd.getAppName());
            if (isEmpty) {
                appName = awemeRawAd.getWebTitle();
            } else if (!isEmpty) {
                appName = awemeRawAd.getAppName();
            } else {
                throw new h.n();
            }
            intent.putExtra("bundle_download_app_name", appName);
            intent.putExtra("bundle_download_mode", awemeRawAd.getDownloadMode());
            intent.putExtra("bundle_link_mode", awemeRawAd.getLinkMode());
            intent.putExtra("bundle_support_multiple_download", awemeRawAd.isSupportMultiple());
            intent.putExtra("bundle_web_url", awemeRawAd.getWebUrl());
            intent.putExtra("bundle_web_title", awemeRawAd.getWebTitle());
            String openUrl = awemeRawAd.getOpenUrl();
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.b(openUrl)) {
                Uri.Builder buildUpon = Uri.parse(a.AbstractC1652a.f73756a).buildUpon();
                if (i2 == 5) {
                    buildUpon.appendQueryParameter("tag", "result_ad");
                }
                h.f.b.l.b(openUrl, str6);
                String builder = buildUpon.toString();
                h.f.b.l.b(builder, str6);
                openUrl = p.a(openUrl, "__back_url__", builder);
            }
            intent.putExtra("bundle_open_url", openUrl);
        }
        if (a2 == null || (str3 = a2.toString()) == null) {
            str3 = str6;
        }
        intent.putExtra("aweme_json_extra", str3);
        if (!(groupId == null || groupId.longValue() == 0)) {
            intent.putExtra("aweme_group_id", String.valueOf(groupId.longValue()));
        }
        if (creativeId.longValue() != 0) {
            intent.putExtra("aweme_creative_id", String.valueOf(creativeId.longValue()));
        }
        if (!TextUtils.isEmpty(packageName)) {
            intent.putExtra("aweme_package_name", packageName);
        }
        if (awemeRawAd.isUseDefaultColor()) {
            intent.putExtra("bundle_webview_background", androidx.core.content.b.c(context, R.color.f159928l));
        } else {
            intent.putExtra("bundle_webview_background", -1);
        }
        intent.putExtra("aweme_id", aweme.getAid());
        intent.putExtra("owner_id", aweme.getAuthorUid());
        intent.putExtra("bundle_forbidden_jump", true);
        intent.putExtra("use_ordinary_web", z);
        intent.addFlags(268435456);
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (!(awemeRawAd2 == null || (channelName = awemeRawAd2.getChannelName()) == null)) {
            str6 = channelName;
        }
        intent.putExtra("preload_channel_name", str6);
        intent.putExtra("preload_scene", "feed");
        intent.putExtra("preload_web_status", awemeRawAd.getPreloadWeb());
        intent.putExtra("preload_web_status_new", awemeRawAd.getPreloadWebNew());
        intent.putExtra("preload_is_web_url", i3);
        intent.putExtra("web_type", awemeRawAd.getWebType());
        intent.putExtra("enable_web_report", awemeRawAd.isEnableWebReport());
        if (awemeRawAd.getWebviewProgressBar() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        intent.putExtra("webview_progress_bar", z3);
        if (h.f.b.l.a((Object) bool, (Object) true)) {
            intent.putExtra("commerce_enter_from", "splash");
        } else {
            intent.putExtra("commerce_enter_from", "feedad");
        }
        ay.f75622a = awemeRawAd;
        a(str4);
        if (a(context, aweme, a(intent))) {
            return true;
        }
        if (!c.a()) {
            return w.a(context, intent);
        }
        com.ss.android.ugc.aweme.bullet.b.a(context, str4, "ad_commerce", a(intent));
        return true;
    }
}
