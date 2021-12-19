package com.ss.android.ugc.aweme.profile.service;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.o.d;
import com.ss.android.e.c;
import com.ss.android.http.a.b.e;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.n.o;
import com.ss.android.ugc.aweme.profile.d.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl;
import f.a.ab;
import f.a.t;
import h.f.a.b;
import h.f.a.s;
import h.f.b.l;
import h.z;

public final class h implements IProfileDependentComponentService {

    /* renamed from: a  reason: collision with root package name */
    public static final h f116622a = new h();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IProfileDependentComponentService f116623b;

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final d adUtilsService() {
        return this.f116623b.adUtilsService();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final <T> T apiExecuteGetJSONObject(int i2, String str, Class<T> cls, String str2, e eVar, boolean z, String str3) {
        l.d(str, "");
        l.d(cls, "");
        l.d(eVar, "");
        return (T) this.f116623b.apiExecuteGetJSONObject(i2, str, cls, str2, eVar, z, str3);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final <T> T apiExecuteGetJSONObject(String str, Class<T> cls, String str2, boolean z, String str3) {
        l.d(str, "");
        l.d(cls, "");
        return (T) this.f116623b.apiExecuteGetJSONObject(str, cls, str2, z, str3);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final e bridgeService() {
        return this.f116623b.bridgeService();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final RecyclerView buildBaseRecyclerView(RecyclerView recyclerView, o oVar) {
        l.d(recyclerView, "");
        l.d(oVar, "");
        return this.f116623b.buildBaseRecyclerView(recyclerView, oVar);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean canIM() {
        return this.f116623b.canIM();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final g favoritesMobUtilsService() {
        return this.f116623b.favoritesMobUtilsService();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final b<Boolean, z> getNotificationManagerHandleSystemCamera() {
        return this.f116623b.getNotificationManagerHandleSystemCamera();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final s<Activity, Fragment, Integer, String, String, z> getStartCameraActivity() {
        return this.f116623b.getStartCameraActivity();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void gotoCropActivity(Activity activity, String str, boolean z, float f2, int i2, int i3, int i4, int i5, int i6) {
        l.d(activity, "");
        l.d(str, "");
        this.f116623b.gotoCropActivity(activity, str, z, f2, i2, i3, i4, i5, i6);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void gotoCropActivity(Fragment fragment, String str, boolean z, float f2, int i2, int i3, int i4, int i5, int i6) {
        l.d(fragment, "");
        l.d(str, "");
        this.f116623b.gotoCropActivity(fragment, str, z, f2, i2, i3, i4, i5, i6);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final String hexDigest(String str) {
        l.d(str, "");
        return this.f116623b.hexDigest(str);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean isDetailActivity(Activity activity) {
        return this.f116623b.isDetailActivity(activity);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean isEnableSettingDiskManager() {
        return this.f116623b.isEnableSettingDiskManager();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean isUserProfileActivity(Activity activity) {
        return this.f116623b.isUserProfileActivity(activity);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void logShowProfileDiskManagerGuideView() {
        this.f116623b.logShowProfileDiskManagerGuideView();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final a mainAnimViewModel(androidx.fragment.app.e eVar) {
        l.d(eVar, "");
        return this.f116623b.mainAnimViewModel(eVar);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final t<Boolean> needShowDiskManagerGuideView() {
        return this.f116623b.needShowDiskManagerGuideView();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final d newLiveBlurProcessor(int i2, float f2, c.a aVar) {
        return this.f116623b.newLiveBlurProcessor(i2, f2, aVar);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final com.ss.android.ugc.aweme.live.e.c newLivePlayHelper(Runnable runnable, com.ss.android.ugc.aweme.live.e.b bVar) {
        l.d(runnable, "");
        l.d(bVar, "");
        return this.f116623b.newLivePlayHelper(runnable, bVar);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean onAntiCrawlerEvent(String str) {
        return this.f116623b.onAntiCrawlerEvent(str);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final ab<BaseResponse> setPrivateSettingItem(String str, int i2) {
        l.d(str, "");
        return this.f116623b.setPrivateSettingItem(str, i2);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean shouldDoCaptcha(Exception exc) {
        return this.f116623b.shouldDoCaptcha(exc);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean shouldUseRecyclerPartialUpdate() {
        return this.f116623b.shouldUseRecyclerPartialUpdate();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void showCaptchaDialog(i iVar, com.ss.android.ugc.aweme.base.api.a.b.a aVar, com.ss.android.ugc.aweme.captcha.a aVar2) {
        this.f116623b.showCaptchaDialog(iVar, aVar, aVar2);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startDiskManagerActivity(Context context) {
        l.d(context, "");
        this.f116623b.startDiskManagerActivity(context);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startDownloadControlSettingActivity(Activity activity, int i2) {
        l.d(activity, "");
        this.f116623b.startDownloadControlSettingActivity(activity, i2);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, Bundle bundle) {
        this.f116623b.startHeaderDetailActivity(activity, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z) {
        l.d(user, "");
        this.f116623b.startHeaderDetailActivity(activity, view, user, z);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2) {
        l.d(user, "");
        this.f116623b.startHeaderDetailActivity(activity, view, user, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, View view, String str, User user) {
        l.d(view, "");
        l.d(user, "");
        this.f116623b.startHeaderDetailActivity(activity, view, str, user);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void watchFromProfile(Context context, User user, boolean z, r rVar) {
        this.f116623b.watchFromProfile(context, user, z, rVar);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void watchLiveMob(Context context, User user, String str, String str2) {
        l.d(context, "");
        l.d(user, "");
        l.d(str, "");
        l.d(str2, "");
        this.f116623b.watchLiveMob(context, user, str, str2);
    }

    static {
        Covode.recordClassIndex(75349);
    }

    private h() {
        IProfileDependentComponentService createIProfileDependentComponentServicebyMonsterPlugin = ProfileDependentComponentImpl.createIProfileDependentComponentServicebyMonsterPlugin(false);
        l.b(createIProfileDependentComponentServicebyMonsterPlugin, "");
        this.f116623b = createIProfileDependentComponentServicebyMonsterPlugin;
    }
}
