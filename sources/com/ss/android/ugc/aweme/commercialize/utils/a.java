package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.x.k;
import com.zhiliaoapp.musically.R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75509a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(46594);
    }

    public static Bundle a(Bundle bundle, Context context) {
        if (context == null) {
            return bundle;
        }
        bundle.putInt("bundle_app_ad_from", 1);
        bundle.putBoolean("bundle_is_ad_fake", true);
        return bundle;
    }

    public static Bundle a(Bundle bundle, Aweme aweme, Context context) {
        String str;
        if (!(context == null || aweme == null || aweme.getAwemeRawAd() == null)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                str = awemeRawAd.getWebUrl();
            } else {
                str = null;
            }
            bundle.putString("url", str);
            bundle.putString("aweme_id", aweme.getAid());
            bundle.putBoolean("control_request_url", true);
        }
        return bundle;
    }

    public static Bundle c(Bundle bundle, Aweme aweme, Context context) {
        String str;
        if (!(context == null || aweme == null || aweme.getAwemeRawAd() == null)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                str = awemeRawAd.getWebTitle();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                str = " ";
            }
            bundle.putString("bundle_web_title", str);
            boolean z = true;
            bundle.putBoolean("bundle_nav_bar_status_padding", true);
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 == null || !awemeRawAd2.isUseDefaultColor()) {
                bundle.putInt("bundle_webview_background", -1);
            } else {
                bundle.putInt("bundle_webview_background", b.c(context, R.color.f159928l));
            }
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 != null) {
                bundle.putBoolean("show_report", awemeRawAd3.isReportEnable());
            }
            AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
            if (awemeRawAd4 != null) {
                bundle.putBoolean("use_ordinary_web", k.a(awemeRawAd4));
            }
            AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
            if (awemeRawAd5 == null || awemeRawAd5.getWebviewProgressBar() != 1) {
                z = false;
            }
            bundle.putBoolean("webview_progress_bar", z);
        }
        return bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0199  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle b(android.os.Bundle r10, com.ss.android.ugc.aweme.feed.model.Aweme r11, android.content.Context r12) {
        /*
        // Method dump skipped, instructions count: 653
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.a.b(android.os.Bundle, com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context):android.os.Bundle");
    }
}
