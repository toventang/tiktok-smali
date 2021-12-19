package com.ss.android.ugc.aweme.profile.service;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.utils.bo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.landpage.b;
import org.json.JSONObject;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f116616a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ d f116617b = h.f116622a.adUtilsService();

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final void closeProfilePopUpWebPage(Activity activity) {
        this.f116617b.closeProfilePopUpWebPage(activity);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final com.ss.android.ugc.aweme.profile.ui.d.a createFakeUserProfileFragment() {
        return this.f116617b.createFakeUserProfileFragment();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final com.ss.android.ugc.aweme.profile.ui.d.a createNewFakeUserProfileFragment() {
        return this.f116617b.createNewFakeUserProfileFragment();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final void feedLiveProfileAvatarOpen(Context context, Aweme aweme, int i2) {
        this.f116617b.feedLiveProfileAvatarOpen(context, aweme, i2);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final com.ss.android.ugc.aweme.landpage.a getAdFlutterLandPageUtil() {
        return this.f116617b.getAdFlutterLandPageUtil();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final b getAdLynxLandPageUtil() {
        return this.f116617b.getAdLynxLandPageUtil();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final JSONObject getExtJson(Context context, Aweme aweme, String str) {
        return this.f116617b.getExtJson(context, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final void logFeedRawAdOpenUrlH5(Context context, Aweme aweme) {
        this.f116617b.logFeedRawAdOpenUrlH5(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final void logFeedRawLynxAdOpenUrlH5(Context context, Aweme aweme) {
        this.f116617b.logFeedRawLynxAdOpenUrlH5(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final void onProfileWebPageHide(Context context, Aweme aweme, String str) {
        this.f116617b.onProfileWebPageHide(context, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final void onProfileWebPageShow(Context context, Aweme aweme, String str) {
        this.f116617b.onProfileWebPageShow(context, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final boolean openProfilePopUpWebPage(Context context, AwemeRawAd awemeRawAd, String str) {
        return this.f116617b.openProfilePopUpWebPage(context, awemeRawAd, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final boolean openProfilePopUpWebPageInSixTwoMode(Context context, Aweme aweme, String str) {
        return this.f116617b.openProfilePopUpWebPageInSixTwoMode(context, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final boolean openProfilePopUpWebPageInTwoExpandMode(Context context, Aweme aweme, String str) {
        return this.f116617b.openProfilePopUpWebPageInTwoExpandMode(context, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str) {
        return this.f116617b.openProfilePopUpWebPageInTwoMode(context, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str, boolean z) {
        return this.f116617b.openProfilePopUpWebPageInTwoMode(context, aweme, str, z);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final boolean openTopViewLive(Context context, Aweme aweme, int i2, bo boVar) {
        return this.f116617b.openTopViewLive(context, aweme, i2, boVar);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final boolean shouldShowAdBrowser(Aweme aweme) {
        return this.f116617b.shouldShowAdBrowser(aweme);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final boolean shouldShowBioEmail() {
        return this.f116617b.shouldShowBioEmail();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final boolean shouldShowBioUrl() {
        return this.f116617b.shouldShowBioUrl();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.d
    public final boolean shouldShowFakeUserProfile(Aweme aweme) {
        return this.f116617b.shouldShowFakeUserProfile(aweme);
    }

    static {
        Covode.recordClassIndex(75342);
    }

    private a() {
    }
}
