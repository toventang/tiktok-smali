package com.ss.android.ugc.aweme.commercialize.tasks;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.c.a.e;
import com.bytedance.ies.ugc.aweme.rich.c.a.f;
import com.bytedance.ies.ugc.aweme.rich.c.b.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.ag;
import com.ss.android.ugc.aweme.commercialize.util.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f75342a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(46491);
    }

    public static Bundle a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("open_url", str);
        return bundle;
    }

    public static Bundle a(Aweme aweme, int i2) {
        AwemeRawAd awemeRawAd;
        Bundle bundle = new Bundle();
        if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
            l.b(awemeRawAd, "");
            bundle.putString("ad_type", awemeRawAd.getType());
            bundle.putString("light_page_web_url", awemeRawAd.getLightWebUrl());
            bundle.putInt("webview_type", awemeRawAd.getWebviewType());
            bundle.putInt("click_from", i2);
        }
        return bundle;
    }

    public static Bundle b(String str, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Bundle bundle = new Bundle();
        if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
            l.b(awemeRawAd, "");
            if (str == null && (str = awemeRawAd.getWebUrl()) == null) {
                str = h.b(aweme);
            }
            bundle.putString("real_web_url", str);
        }
        return bundle;
    }

    public static /* synthetic */ e a(Context context, AwemeRawAd awemeRawAd) {
        c cVar = c.f75341a;
        l.d(context, "");
        l.d(cVar, "");
        a aVar = new a(context, cVar);
        aVar.f35154c = awemeRawAd;
        return aVar;
    }

    /* access modifiers changed from: private */
    public static Bundle a(String str, Aweme aweme, String str2) {
        AwemeRawAd awemeRawAd;
        long j2;
        Bundle bundle = new Bundle();
        if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
            l.b(awemeRawAd, "");
            Long creativeId = awemeRawAd.getCreativeId();
            long j3 = 0;
            if (creativeId != null) {
                j2 = creativeId.longValue();
            } else {
                j2 = 0;
            }
            bundle.putLong("creative_id", j2);
            bundle.putString("log_extra", awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                j3 = groupId.longValue();
            }
            bundle.putLong("group_id", j3);
            bundle.putString("open_url", str);
            bundle.putString("log_tag", str2);
            bundle.putString("aweme_id", aweme.getAid());
        }
        return bundle;
    }

    public static Bundle a(String str, String str2, Aweme aweme, int i2) {
        AwemeRawAd awemeRawAd;
        Bundle bundle = new Bundle();
        if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
            l.b(awemeRawAd, "");
            bundle.putString("real_web_url", str);
            if (str2 == null) {
                str2 = awemeRawAd.getWebTitle();
            }
            bundle.putString("title", str2);
            bundle.putString("aweme_id", aweme.getAid());
            bundle.putInt("click_from", i2);
        }
        return bundle;
    }

    public static f a(Context context, Aweme aweme, String str, int i2) {
        AwemeRawAd awemeRawAd;
        if (context == null || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return null;
        }
        l.b(awemeRawAd, "");
        boolean z = false;
        e a2 = a(context, awemeRawAd).a(0, a(str)).a(1, a(str, aweme, "draw_ad")).a(6, a(aweme, i2));
        Bundle bundle = new Bundle();
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            l.b(awemeRawAd2, "");
            if (awemeRawAd2.getSplashInfo() != null) {
                AwemeSplashInfo splashInfo = awemeRawAd2.getSplashInfo();
                l.b(splashInfo, "");
                if (!TextUtils.isEmpty(splashInfo.getAwesomeSplashId())) {
                    z = true;
                }
            }
            bundle.putBoolean("is_awesome_splash_ad", z);
            bundle.putString("ad_type", awemeRawAd2.getType());
            bundle.putString("aweme_package_name", awemeRawAd2.getPackageName());
        }
        return a2.a(9, bundle).c();
    }

    public static /* synthetic */ Bundle a(d dVar, Context context, String str, String str2, Aweme aweme, boolean z) {
        AwemeRawAd awemeRawAd;
        long j2;
        UrlModel originCover;
        List<String> urlList;
        Bundle a2 = a(context, str, str2, aweme, z, "draw_ad", 0, null, 192);
        if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
            String str3 = "";
            l.b(awemeRawAd, str3);
            if (com.ss.android.ugc.aweme.landpage.b.a.f107275a.a(awemeRawAd)) {
                ag nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                Long adId = awemeRawAd.getAdId();
                if (adId != null) {
                    j2 = adId.longValue();
                } else {
                    j2 = 0;
                }
                a2.putLong("ad_id", j2);
                a2.putString("render_type", nativeSiteConfig.getRenderType());
                a2.putString("lynx_scheme", nativeSiteConfig.getLynxScheme());
                a2.putInt("lynx_landing_style", nativeSiteConfig.getLynxLandingStyle());
                Video video = aweme.getVideo();
                if (!(video == null || (originCover = video.getOriginCover()) == null || (urlList = originCover.getUrlList()) == null || !(!urlList.isEmpty()))) {
                    a2.putString("video_cover", urlList.get(0));
                }
                List<String> geckoChannel = nativeSiteConfig.getGeckoChannel();
                if (geckoChannel != null && !geckoChannel.isEmpty()) {
                    str3 = geckoChannel.get(0);
                }
                a2.putString("lynx_channel_name", str3);
                a2.putString("native_site_custom_data", awemeRawAd.getNativeSiteCustomData());
                List<String> secondPageGeckoChannel = nativeSiteConfig.getSecondPageGeckoChannel();
                if (secondPageGeckoChannel != null) {
                    a2.putStringArrayList("second_page_preload_channels", new ArrayList<>(secondPageGeckoChannel));
                }
                a2.putString("key_native_site_ad_info", awemeRawAd.getNativeSiteAdInfo());
                a2.putString("native_site_app_data", awemeRawAd.getAppData());
                a2.putString("log_tag", "draw_ad");
            }
        }
        return a2;
    }

    private static Bundle a(Context context, String str, String str2, Aweme aweme, boolean z, String str3, int i2, Boolean bool) {
        AwemeRawAd awemeRawAd;
        long j2;
        String str4;
        com.ss.android.ugc.aweme.commercialize.feed.c.a preloadData;
        String jSONObject;
        Bundle bundle = new Bundle();
        if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
            String str5 = "";
            l.b(awemeRawAd, str5);
            Long creativeId = awemeRawAd.getCreativeId();
            long j3 = 0;
            if (creativeId != null) {
                j2 = creativeId.longValue();
            } else {
                j2 = 0;
            }
            bundle.putLong("creative_id", j2);
            bundle.putString("log_extra", awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                j3 = groupId.longValue();
            }
            bundle.putLong("group_id", j3);
            bundle.putString("log_tag", str3);
            int i3 = 0;
            if (str == null) {
                str = awemeRawAd.getWebUrl();
                i3 = 1;
                if (str == null) {
                    str = h.b(aweme);
                }
            }
            bundle.putString("real_web_url", str);
            if (str2 == null) {
                str2 = awemeRawAd.getWebTitle();
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = " ";
            }
            bundle.putString("title", str2);
            bundle.putBoolean("show_report", awemeRawAd.isReportEnable());
            bundle.putInt("app_ad_from", i2);
            if (a.f75298a.a(aweme)) {
                bundle.putString("enter_from", "topview");
            }
            bundle.putString("ad_type", awemeRawAd.getType());
            bundle.putInt("ad_system_origin", awemeRawAd.getSystemOrigin());
            bundle.putString("landing_page_info", awemeRawAd.getLandingPageInfo());
            bundle.putBoolean("disable_download_dialog", awemeRawAd.isDisableDownloadDialog());
            bundle.putString("download_url", awemeRawAd.getDownloadUrl());
            bundle.putString("aweme_package_name", awemeRawAd.getPackageName());
            bundle.putString("ad_quick_app_url", awemeRawAd.getQuickAppUrl());
            bundle.putString("download_app_name", awemeRawAd.getAppName());
            bundle.putString("web_url", awemeRawAd.getWebUrl());
            bundle.putString("web_title", awemeRawAd.getWebTitle());
            bundle.putInt("download_mode", awemeRawAd.getDownloadMode());
            bundle.putInt("link_mode", awemeRawAd.getLinkMode());
            bundle.putBoolean("support_multiple_download", awemeRawAd.isSupportMultiple());
            bundle.putString("open_url", awemeRawAd.getOpenUrl());
            JSONObject a2 = a.f75298a.a(context, aweme, str5);
            if (!(a2 == null || (jSONObject = a2.toString()) == null)) {
                str5 = jSONObject;
            }
            bundle.putString("aweme_json_extra", str5);
            bundle.putBoolean("use_default_color", awemeRawAd.isUseDefaultColor());
            bundle.putString("channel_name", awemeRawAd.getChannelName());
            bundle.putString("aweme_id", aweme.getAid());
            bundle.putString("owner_id", aweme.getAuthorUid());
            bundle.putBoolean("use_ordinary_web", z);
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 == null || (preloadData = awemeRawAd2.getPreloadData()) == null) {
                str4 = null;
            } else {
                str4 = preloadData.getSiteId();
            }
            bundle.putString("site_id", str4);
            bundle.putInt("preload_web_status", awemeRawAd.getPreloadWeb());
            bundle.putInt("preload_is_web_url", i3);
            bundle.putInt("web_type", awemeRawAd.getWebType());
            bundle.putBoolean("enable_web_report", awemeRawAd.isEnableWebReport());
            bundle.putInt("webview_progress_bar", awemeRawAd.getWebviewProgressBar());
            if (l.a((Object) bool, (Object) true)) {
                bundle.putString("commerce_enter_from", "splash");
            } else {
                bundle.putString("commerce_enter_from", "feedad");
            }
        }
        return bundle;
    }

    public static /* synthetic */ Bundle a(Context context, String str, String str2, Aweme aweme, boolean z, String str3, int i2, Boolean bool, int i3) {
        if ((i3 & 32) != 0) {
            str3 = "draw_ad";
        }
        if ((i3 & 64) != 0) {
            i2 = 1;
        }
        if ((i3 & 128) != 0) {
            bool = false;
        }
        return a(context, str, str2, aweme, z, str3, i2, bool);
    }
}
