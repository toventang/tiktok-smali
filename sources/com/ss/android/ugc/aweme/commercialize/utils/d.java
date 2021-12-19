package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.x.k;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import org.json.JSONObject;

public final class d {
    static {
        Covode.recordClassIndex(46728);
    }

    public static Bundle c(Aweme aweme) {
        Bundle a2 = a(aweme);
        CardStruct h2 = b.h(aweme);
        if (h2 != null && !TextUtils.isEmpty(h2.getCardUrl())) {
            a2.putString("url", h2.getCardUrl());
            a2.putBoolean("use_css_injection", false);
        }
        if (ad.a(aweme)) {
            a2.putBoolean("show_load_dialog", true);
        }
        return a2;
    }

    public static Bundle a(k kVar) {
        if (kVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("ad_id", kVar.f75781a);
        bundle.putLong("aweme_creative_id", kVar.f75781a);
        bundle.putString("bundle_download_app_log_extra", kVar.f75782b);
        bundle.putString("group_id", String.valueOf(kVar.f75783c));
        bundle.putString("ad_type", kVar.f75790j);
        bundle.putInt("ad_system_origin", kVar.f75791k);
        if (!TextUtils.isEmpty(kVar.f75787g)) {
            bundle.putString("bundle_download_url", kVar.f75787g);
            bundle.putBoolean("bundle_is_from_app_ad", true);
            bundle.putString("aweme_package_name", kVar.f75788h);
            bundle.putString("bundle_download_app_name", kVar.f75789i);
        }
        bundle.putString("ad_js_url", SharePrefCache.inst().getJsActlogUrl().c());
        if (kVar.f75793m != null) {
            bundle.putString("aweme_id", kVar.f75793m.getAid());
        }
        return bundle;
    }

    public static Bundle b(Aweme aweme) {
        Bundle a2 = a(aweme);
        CardStruct ar = b.ar(aweme);
        if (ar != null) {
            if (!TextUtils.isEmpty(ar.getCardUrl()) && b.a(ar)) {
                a2.putString("url", Uri.parse(ar.getCardUrl()).buildUpon().appendQueryParameter(StringSet.type, "4").toString());
                a2.putBoolean("use_css_injection", false);
            } else if (!TextUtils.isEmpty(ar.getCardUrl()) && ar.getCardType() == 1001) {
                a2.putString("url", ar.getCardUrl());
            }
        }
        a2.putBoolean("show_load_dialog", true);
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d(com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.d.d(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static Bundle a(Aweme aweme) {
        Bundle bundle = new Bundle();
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return bundle;
        }
        long longValue = aweme.getAwemeRawAd().getCreativeId().longValue();
        String logExtra = aweme.getAwemeRawAd().getLogExtra();
        String downloadUrl = aweme.getAwemeRawAd().getDownloadUrl();
        String quickAppUrl = aweme.getAwemeRawAd().getQuickAppUrl();
        String c2 = b.c(aweme);
        CardStruct e2 = b.e(aweme);
        if (b.a(e2)) {
            c2 = Uri.parse(c2).buildUpon().appendQueryParameter(StringSet.type, "3").toString();
        }
        bundle.putString("url", c2);
        bundle.putLong("ad_id", longValue);
        bundle.putString("ad_type", aweme.getAwemeRawAd().getType());
        bundle.putInt("ad_system_origin", aweme.getAwemeRawAd().getSystemOrigin());
        bundle.putString("ad_js_url", SharePrefCache.inst().getJsActlogUrl().c());
        bundle.putString("aweme_id", aweme.getAid());
        bundle.putBoolean("show_load_dialog", false);
        bundle.putString("bundle_download_app_log_extra", logExtra);
        bundle.putString("bundle_download_url", downloadUrl);
        bundle.putString("bundle_ad_quick_app_url", quickAppUrl);
        bundle.putBoolean("bundle_forbidden_jump", true);
        bundle.putBoolean("bundle_show_download_status_bar", false);
        if (!TextUtils.equals("SM-G9550", Build.MODEL) || !TextUtils.equals("samsung", Build.BRAND.toLowerCase())) {
            bundle.putBoolean("bundle_fix_webview", false);
        }
        bundle.putString("preload_channel_name", aweme.getAwemeRawAd().getChannelName());
        bundle.putString("preload_scene", "feed");
        bundle.putInt("preload_web_status", aweme.getAwemeRawAd().getPreloadWeb());
        bundle.putInt("preload_web_status_new", aweme.getAwemeRawAd().getPreloadWebNew());
        bundle.putString("commerce_enter_from", "feedad");
        if (e2 != null) {
            bundle.putBoolean("bundle_enable_card_preload", e2.isEnablePreload());
        }
        bundle.putString("landing_page_info", aweme.getAwemeRawAd().getLandingPageInfo());
        return bundle;
    }

    public static Bundle a(Bundle bundle, Context context) {
        if (!(bundle == null || context == null)) {
            bundle.putInt("bundle_app_ad_from", 1);
            bundle.putBoolean("bundle_is_ad_fake", true);
        }
        return bundle;
    }

    public static Bundle a(Bundle bundle, Aweme aweme, Context context) {
        if (!(bundle == null || context == null || aweme == null || aweme.getAwemeRawAd() == null)) {
            bundle.putString("url", aweme.getAwemeRawAd().getWebUrl());
            bundle.putString("aweme_id", aweme.getAid());
            bundle.putBoolean("control_request_url", true);
        }
        return bundle;
    }

    public static Bundle c(Bundle bundle, Aweme aweme, Context context) {
        if (!(bundle == null || context == null || aweme == null || aweme.getAwemeRawAd() == null)) {
            String webTitle = aweme.getAwemeRawAd().getWebTitle();
            if (TextUtils.isEmpty(webTitle)) {
                webTitle = " ";
            }
            bundle.putString("bundle_web_title", webTitle);
            boolean z = true;
            bundle.putBoolean("bundle_nav_bar_status_padding", true);
            if (aweme.getAwemeRawAd().isUseDefaultColor()) {
                bundle.putInt("bundle_webview_background", androidx.core.content.b.c(context, R.color.f159928l));
            } else {
                bundle.putInt("bundle_webview_background", -1);
            }
            bundle.putBoolean("show_report", aweme.getAwemeRawAd().isReportEnable());
            bundle.putBoolean("use_ordinary_web", k.a(aweme.getAwemeRawAd()));
            if (aweme.getAwemeRawAd().getWebviewProgressBar() != 1) {
                z = false;
            }
            bundle.putBoolean("webview_progress_bar", z);
        }
        return bundle;
    }

    public static Bundle b(Bundle bundle, Aweme aweme, Context context) {
        String webTitle;
        String jSONObject;
        if (!(bundle == null || context == null || aweme == null || aweme.getAwemeRawAd() == null)) {
            Long creativeId = aweme.getAwemeRawAd().getCreativeId();
            bundle.putString("bundle_download_app_extra", String.valueOf(aweme.getAwemeRawAd().getCreativeId()));
            String downloadUrl = aweme.getAwemeRawAd().getDownloadUrl();
            if (!TextUtils.isEmpty(downloadUrl)) {
                bundle.putBoolean("bundle_is_from_app_ad", true);
                bundle.putString("bundle_download_url", downloadUrl);
                bundle.putString("bundle_ad_quick_app_url", aweme.getAwemeRawAd().getQuickAppUrl());
                bundle.putString("aweme_package_name", aweme.getAwemeRawAd().getPackageName());
                if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getAppName())) {
                    bundle.putString("bundle_download_app_name", aweme.getAwemeRawAd().getAppName());
                }
                bundle.putInt("bundle_download_mode", aweme.getAwemeRawAd().getDownloadMode());
                bundle.putInt("bundle_link_mode", aweme.getAwemeRawAd().getLinkMode());
                bundle.putBoolean("bundle_support_multiple_download", aweme.getAwemeRawAd().isSupportMultiple());
                bundle.putString("bundle_open_url", aweme.getAwemeRawAd().getOpenUrl());
                bundle.putString("bundle_web_url", aweme.getAwemeRawAd().getWebUrl());
            }
            bundle.putString("bundle_download_app_log_extra", aweme.getAwemeRawAd().getLogExtra());
            if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getSource())) {
                webTitle = aweme.getAwemeRawAd().getSource();
            } else {
                webTitle = aweme.getAwemeRawAd().getWebTitle();
            }
            bundle.putString("bundle_download_app_name", webTitle);
            bundle.putBoolean("bundle_disable_download_dialog", aweme.getAwemeRawAd().isDisableDownloadDialog());
            String packageName = aweme.getAwemeRawAd().getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                bundle.putString("aweme_package_name", packageName);
            }
            JSONObject a2 = j.a(context, aweme, false, (Map<String, String>) null);
            if (a2 == null) {
                jSONObject = "";
            } else {
                jSONObject = a2.toString();
            }
            bundle.putString("aweme_json_extra", jSONObject);
            Long groupId = aweme.getAwemeRawAd().getGroupId();
            if (!(groupId == null || groupId.longValue() == 0)) {
                bundle.putString("aweme_group_id", String.valueOf(groupId));
            }
            if (aweme.getAwemeRawAd().getCreativeId().longValue() != 0) {
                bundle.putString("aweme_creative_id", String.valueOf(creativeId));
            }
            bundle.putLong("ad_id", aweme.getAwemeRawAd().getCreativeId().longValue());
            bundle.putString("ad_type", aweme.getAwemeRawAd().getType());
            bundle.putInt("ad_system_origin", aweme.getAwemeRawAd().getSystemOrigin());
            bundle.putInt("web_type", aweme.getAwemeRawAd().getWebType());
            bundle.putBoolean("enable_web_google_login", aweme.getAwemeRawAd().isEnableWebGoogleLogin());
            bundle.putString("preload_channel_name", aweme.getAwemeRawAd().getChannelName());
            bundle.putString("preload_scene", "feed");
            bundle.putInt("preload_web_status", aweme.getAwemeRawAd().getPreloadWeb());
            bundle.putInt("preload_web_status_new", aweme.getAwemeRawAd().getPreloadWebNew());
            bundle.putInt("preload_is_web_url", 1);
            bundle.putString("commerce_enter_from", "feedad");
            bundle.putBoolean("enable_web_report", aweme.getAwemeRawAd().isEnableWebReport());
            bundle.putBoolean("bundle_forbidden_jump", true);
            bundle.putString("ad_js_url", SharePrefCache.inst().getJsActlogUrl().c());
            bundle.putString("landing_page_info", aweme.getAwemeRawAd().getLandingPageInfo());
        }
        return bundle;
    }
}
