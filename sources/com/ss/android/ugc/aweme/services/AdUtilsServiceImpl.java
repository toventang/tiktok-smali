package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget;
import com.ss.android.ugc.aweme.commercialize.profile.h;
import com.ss.android.ugc.aweme.commercialize.profile.o;
import com.ss.android.ugc.aweme.commercialize.utils.bo;
import com.ss.android.ugc.aweme.commercialize.utils.bp;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget;
import com.ss.android.ugc.aweme.feed.i.x;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.landpage.a;
import com.ss.android.ugc.aweme.landpage.b;
import com.ss.android.ugc.aweme.profile.service.d;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class AdUtilsServiceImpl implements d {
    static {
        Covode.recordClassIndex(79408);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public a getAdFlutterLandPageUtil() {
        return com.ss.android.ugc.aweme.landpage.a.a.f107274a;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public b getAdLynxLandPageUtil() {
        return com.ss.android.ugc.aweme.landpage.b.a.f107275a;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public com.ss.android.ugc.aweme.profile.ui.d.a createFakeUserProfileFragment() {
        return new o();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public com.ss.android.ugc.aweme.profile.ui.d.a createNewFakeUserProfileFragment() {
        return new h();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public boolean shouldShowBioEmail() {
        try {
            return c.f99077a.f99078b.getBioSettings().getEnableBioEmail().booleanValue();
        } catch (com.bytedance.ies.a unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public boolean shouldShowBioUrl() {
        try {
            return c.f99077a.f99078b.getBioSettings().getEnableBioUrl().booleanValue();
        } catch (com.bytedance.ies.a unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public boolean shouldShowFakeUserProfile(Aweme aweme) {
        return com.ss.android.ugc.aweme.commercialize.e.a.b.F(aweme);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public boolean shouldShowAdBrowser(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || !com.ss.android.ugc.aweme.commercialize.e.a.b.E(aweme) || TextUtils.isEmpty(com.ss.android.ugc.aweme.commercialize.e.a.b.b(aweme))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public void closeProfilePopUpWebPage(Activity activity) {
        l.d(activity, "");
        AdPopUpWebPageView b2 = AdProfilePopUpWebPageWidget.a.b(activity);
        if (b2 != null && b2.g()) {
            b2.a(true);
            FrameLayout a2 = AdProfilePopUpWebPageWidget.a.a(activity);
            if (a2 != null) {
                a2.setVisibility(8);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public void logFeedRawAdOpenUrlH5(Context context, Aweme aweme) {
        j.f(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public void logFeedRawLynxAdOpenUrlH5(Context context, Aweme aweme) {
        j.g(context, aweme);
    }

    public void logFeedRawFlutterAdOpenUrlH5(Context context, Aweme aweme) {
        HashMap hashMap = new HashMap();
        hashMap.put("render_type", "flutter");
        j.b(context, "open_url_h5", aweme, j.a(context, aweme, false, j.a(hashMap)));
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public JSONObject getExtJson(Context context, Aweme aweme, String str) {
        return j.a(context, aweme, false, (Map<String, String>) null);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public boolean openProfilePopUpWebPageInSixTwoMode(Context context, Aweme aweme, String str) {
        return openProfilePopUpWebPage(context, aweme, str, 5, false);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public boolean openProfilePopUpWebPageInTwoExpandMode(Context context, Aweme aweme, String str) {
        return openProfilePopUpWebPage(context, aweme, str, 6, false);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str) {
        return openProfilePopUpWebPage(context, aweme, str, 1, false);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public void onProfileWebPageHide(Context context, Aweme aweme, String str) {
        if (context != null) {
            com.ss.android.ugc.d.a.c.a(new x(context.hashCode(), 2, aweme, str));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public void onProfileWebPageShow(Context context, Aweme aweme, String str) {
        if (context != null) {
            com.ss.android.ugc.d.a.c.a(new x(context.hashCode(), 1, aweme, str));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public boolean openProfilePopUpWebPage(Context context, AwemeRawAd awemeRawAd, String str) {
        AwemeRawAd awemeRawAd2;
        b.a c2 = new b.a().a(context).a(awemeRawAd).a(3).c(str);
        if (!(c2.f74383a == null || c2.f74384b == null || !(c2.f74383a instanceof Activity) || (awemeRawAd2 = c2.f74384b) == null || awemeRawAd2.getProfileWithWebview() != 1)) {
            if (AdPopUpWebPageWidget.s.a(c2.a())) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.event.a(1));
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.profile.service.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void feedLiveProfileAvatarOpen(android.content.Context r8, com.ss.android.ugc.aweme.feed.model.Aweme r9, int r10) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.AdUtilsServiceImpl.feedLiveProfileAvatarOpen(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int):void");
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public boolean openTopViewLive(Context context, Aweme aweme, int i2, bo boVar) {
        return bp.a(context, aweme, i2, boVar);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str, boolean z) {
        return openProfilePopUpWebPage(context, aweme, str, 4, z);
    }

    public boolean openAdWebUrl(Context context, String str, String str2, boolean z, Map<String, String> map) {
        return w.a(context, str, str2, z, map);
    }

    public boolean openProfilePopUpWebPage(Context context, Aweme aweme, String str, int i2, boolean z) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return w.a(new b.a().a(context).a(aweme.getAwemeRawAd()).a(i2).c(str).a(aweme), z);
    }
}
