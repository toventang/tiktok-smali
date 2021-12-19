package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.e.c;
import com.ss.android.sdk.a.b;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.app.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.cs.c;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.n.o;
import com.ss.android.ugc.aweme.im.g;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.pendant.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService;
import com.ss.android.ugc.aweme.profile.service.d;
import com.ss.android.ugc.aweme.profile.service.f;
import com.ss.android.ugc.aweme.profile.ui.CropActivity;
import com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.profile.ui.UserProfileFragment;
import com.ss.android.ugc.aweme.qrcode.j;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import com.ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.gc;
import com.ss.android.ugc.aweme.utils.in;
import f.a.ab;
import f.a.af;
import f.a.t;
import h.f.a.s;
import h.f.b.l;
import h.k.e;
import h.m.p;
import h.z;

public final class ProfileDependentComponentImpl implements IProfileDependentComponentService {
    static {
        Covode.recordClassIndex(79548);
    }

    public final void activeTT(Context context, String str, String str2) {
        l.d(context, "");
        l.d(str, "");
        l.d(str2, "");
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean shouldDoCaptcha(Exception exc) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void showCaptchaDialog(i iVar, a aVar, com.ss.android.ugc.aweme.captcha.a aVar2) {
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final s<Activity, Fragment, Integer, String, String, z> getStartCameraActivity() {
        return ProfileDependentComponentImpl$startCameraActivity$1.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final d adUtilsService() {
        return new AdUtilsServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean canIM() {
        return com.ss.android.ugc.aweme.im.a.a();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean isEnableSettingDiskManager() {
        return com.ss.android.ugc.aweme.experiment.a.a.a();
    }

    public final boolean platformInfoManagerHasPlatformBinded() {
        return b.f60131a.a();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final BridgeServiceImpl bridgeService() {
        return new BridgeServiceImpl();
    }

    public final f contactUtilService() {
        return IRecommendUsersServiceImpl.j().i();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final FavoritesMobUtilsServiceImpl favoritesMobUtilsService() {
        return new FavoritesMobUtilsServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final e<z> getNotificationManagerHandleSystemCamera() {
        return new ProfileDependentComponentImpl$notificationManagerHandleSystemCamera$1(g.a.a());
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void logShowProfileDiskManagerGuideView() {
        c.a().storeBoolean("has_show_disk_manager_guide", true);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean shouldUseRecyclerPartialUpdate() {
        return SettingsRequestServiceImpl.i().c();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final t<Boolean> needShowDiskManagerGuideView() {
        t<Boolean> a2 = t.a(ProfileDependentComponentImpl$needShowDiskManagerGuideView$1.INSTANCE).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean isDetailActivity(Activity activity) {
        return activity instanceof DetailActivity;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final String hexDigest(String str) {
        l.d(str, "");
        return com.bytedance.sdk.a.c.b.a.a(str);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final com.ss.android.ugc.aweme.profile.d.a mainAnimViewModel(androidx.fragment.app.e eVar) {
        l.d(eVar, "");
        return new ProfileDependentComponentImpl$mainAnimViewModel$1(eVar);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startDiskManagerActivity(Context context) {
        l.d(context, "");
        SmartRouter.buildRoute(context, "//setting/diskmanager").open();
    }

    public static IProfileDependentComponentService createIProfileDependentComponentServicebyMonsterPlugin(boolean z) {
        Object a2 = com.ss.android.ugc.b.a(IProfileDependentComponentService.class, z);
        if (a2 != null) {
            return (IProfileDependentComponentService) a2;
        }
        return new ProfileDependentComponentImpl();
    }

    public final void clearNinePatchBubbleState(Context context) {
        if (context != null) {
            com.ss.android.ugc.aweme.pendant.b bVar = b.C2935b.f114627a;
            l.d(context, "");
            bVar.a().storeBoolean(com.ss.android.ugc.aweme.pendant.b.f114619f, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean isUserProfileActivity(Activity activity) {
        if (!(activity instanceof com.bytedance.ies.powerpage.a) || !(((com.bytedance.ies.powerpage.a) activity).getRootFragment() instanceof UserProfileFragment)) {
            return activity instanceof UserProfileActivity;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean onAntiCrawlerEvent(String str) {
        if (str == null) {
            return false;
        }
        if (p.a((CharSequence) str, (CharSequence) "/aweme/v1/aweme/post/?", false) || p.a((CharSequence) str, (CharSequence) "/aweme/v1/aweme/favorite/?", false) || p.a((CharSequence) str, (CharSequence) "/aweme/v1/aweme/listcollection/?", false)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final RecyclerView buildBaseRecyclerView(RecyclerView recyclerView, o oVar) {
        l.d(recyclerView, "");
        l.d(oVar, "");
        return gc.a(recyclerView, oVar, 10);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final com.ss.android.ugc.aweme.live.e.c newLivePlayHelper(Runnable runnable, com.ss.android.ugc.aweme.live.e.b bVar) {
        l.d(runnable, "");
        l.d(bVar, "");
        return new ProfileDependentComponentImpl$newLivePlayHelper$1(runnable, bVar);
    }

    public final void openFestivalPageWithSchema(Context context, String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.aq.a.b.a(context, str);
    }

    public final void startAdsAppActivity(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        d.a.a(context, str, "", false);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, Bundle bundle) {
        if (bundle == null) {
            l.b();
        }
        HeaderDetailActivity.a(activity, bundle);
    }

    public final void startQRCodeActivityV2(Context context, j jVar) {
        SmartRouter.buildRoute(context, "//qrcodev2").withParam("extra_params", jVar).open();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startDownloadControlSettingActivity(Activity activity, int i2) {
        l.d(activity, "");
        SmartRouter.buildRoute(activity, "//setting/download").withParam("currentSettingsValue", i2).withParam("enter_from", "personal_homepage").open();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final ab<BaseResponse> setPrivateSettingItem(String str, int i2) {
        l.d(str, "");
        ab<BaseResponse> a2 = ab.a((af) new ProfileDependentComponentImpl$setPrivateSettingItem$1(str, i2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final com.ss.android.ugc.aweme.newfollow.a.a newLiveBlurProcessor(int i2, float f2, c.a aVar) {
        return new com.ss.android.ugc.aweme.newfollow.a.a(i2, f2, new ProfileDependentComponentImpl$newLiveBlurProcessor$1(aVar));
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void watchFromProfile(Context context, User user, boolean z, r rVar) {
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.i().a(context, user, z);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void watchLiveMob(Context context, User user, String str, String str2) {
        l.d(context, "");
        l.d(user, "");
        l.d(str, "");
        l.d(str2, "");
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f23299c.J = str;
        enterRoomConfig.f23299c.L = str2;
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.i().a(context, user, enterRoomConfig);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z) {
        boolean z2;
        l.d(user, "");
        UrlModel c2 = in.c(user);
        if (c2 != null && com.ss.android.ugc.aweme.base.utils.d.b(c2.getUrlList())) {
            int size = c2.getUrlList().size();
            String[] strArr = new String[size];
            for (int i2 = 0; i2 < size; i2++) {
                strArr[i2] = c2.getUrlList().get(i2);
            }
            if (user == null || user.getAvatarVideoUri() != c2) {
                z2 = false;
            } else {
                z2 = true;
            }
            HeaderDetailActivity.a(activity, view, 1.0f, user, z, z2, strArr);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, View view, String str, User user) {
        l.d(view, "");
        l.d(user, "");
        HeaderDetailActivity.a(activity, new ap().a("extra_zoom_info", ZoomAnimationUtils.a(view)).a("enable_edit_img", false).a("uri", TextUtils.isEmpty(str) ? in.a(in.d(user)) : new String[]{str}).a("enable_download_img", true).a("share_info", user).f142646a);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final <T> T apiExecuteGetJSONObject(String str, Class<T> cls, String str2, boolean z, String str3) {
        l.d(str, "");
        l.d(cls, "");
        return (T) Api.a(str, cls, str2, (com.ss.android.http.a.b.e) null);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2) {
        l.d(user, "");
        UrlModel c2 = in.c(user);
        if (c2 != null && com.ss.android.ugc.aweme.base.utils.d.b(c2.getUrlList())) {
            int size = c2.getUrlList().size();
            String[] strArr = new String[size];
            for (int i2 = 0; i2 < size; i2++) {
                strArr[i2] = c2.getUrlList().get(i2);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_zoom_info", ZoomAnimationUtils.a(view));
            bundle.putStringArray("uri", strArr);
            bundle.putBoolean("enable_edit_img", z2);
            bundle.putFloat("wh_ratio", 1.0f);
            bundle.putBoolean("enable_download_img", z);
            bundle.putBoolean("handle_with_video_avatar", false);
            if (user != null) {
                bundle.putSerializable("share_info", user);
            }
            HeaderDetailActivity.a(activity, bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final <T> T apiExecuteGetJSONObject(int i2, String str, Class<T> cls, String str2, com.ss.android.http.a.b.e eVar, boolean z, String str3) {
        l.d(str, "");
        l.d(cls, "");
        l.d(eVar, "");
        return (T) Api.a(str, cls, str2, eVar);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void gotoCropActivity(Activity activity, String str, boolean z, float f2, int i2, int i3, int i4, int i5, int i6) {
        l.d(activity, "");
        l.d(str, "");
        CropActivity.a.a(activity, str, z, f2, i2, i3, i4, i5, i6, true);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void gotoCropActivity(Fragment fragment, String str, boolean z, float f2, int i2, int i3, int i4, int i5, int i6) {
        l.d(fragment, "");
        l.d(str, "");
        l.d(fragment, "");
        l.d(str, "");
        SmartRouter.buildFragmentRoute(fragment, "//profile/crop").withParam("original_url", str).withParam("is_oval", z).withParam("rect_ratio", f2).withParam("rect_margin", i2).withParam("extra_min_width", i4).withParam("extra_min_height", i5).withParam("extra_source_type", i6).open(i3);
    }
}
