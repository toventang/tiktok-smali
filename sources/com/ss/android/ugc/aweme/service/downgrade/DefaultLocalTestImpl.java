package com.ss.android.ugc.aweme.service.downgrade;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.local_test.b.a;
import com.ss.android.ugc.aweme.local_test.b.b;
import com.ss.android.ugc.aweme.local_test.b.c;
import com.ss.android.ugc.aweme.service.d;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.test_settings.settting.IDebugSettingRegistry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class DefaultLocalTestImpl implements LocalTestApi {
    private static d defaultSpecActDebugService;

    static {
        Covode.recordClassIndex(79376);
    }

    static final /* synthetic */ void lambda$getSpecActDebugService$0$DefaultLocalTestImpl(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final String appendDeviceId(String str) {
        return str;
    }

    public final void checkApi(String str, String str2, boolean z, String str3, boolean z2, String str4) {
    }

    public final void copyContent(String str, Context context) {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final boolean enableBoe() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final boolean enableBoeJsbBypass() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final boolean enableDeeplinkIntercept() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final boolean enableLynxSec() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final boolean enablePpe() {
        return false;
    }

    public final boolean enableStark() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final boolean enableWebHttps() {
        return true;
    }

    public final Aweme getAdPreviewAweme(Context context) {
        return null;
    }

    public final String getAdPreviewBaseUrl() {
        return null;
    }

    public final h getAdminOpsAction(Aweme aweme, String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final String getBoeLane() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final void getDebugUrlMessage(Context context, String str, String str2) {
    }

    public final String getDefaultRNTestHost() {
        return "";
    }

    public final Map getDownGradeList() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final w getInitBoeTask() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final List<String> getJsbSafeHost() {
        return null;
    }

    public final String getKidsModeAllowListJsonStr(Context context) {
        return null;
    }

    public final String getLynxDurlDataBaseUrl() {
        return "";
    }

    public final String getMiniAppListH5Url() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final String getPPELane() {
        return "";
    }

    public final String getPpeLane() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final Resources getTranslationProxyResource(Resources resources) {
        return resources;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final g getWebViewLoadUrlInterceptorDelegate() {
        return null;
    }

    public final void handleUrl(String str, String str2, String str3) {
    }

    public final void initCronyManager(Application application) {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final void initTranslationHotSwap(Context context) {
    }

    public final void injectTranslationHotSwap(androidx.appcompat.app.d dVar) {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final boolean isPPEEnable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final void jumpToMessageDebugActivity(Context context, String str, String str2) {
    }

    public final boolean lynxDebugEnable() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final boolean lynxDevToolDebugEnable() {
        return false;
    }

    public final Boolean onShouldOverrideUrlLoading(WebView webView, String str) {
        return null;
    }

    public final void registerTools(IDebugSettingRegistry iDebugSettingRegistry) {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final boolean shouldBulletShowDebugTagView() {
        return true;
    }

    public final void showBoeToast(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final void showDeeplinkInterceptorRemind(String str, String str2) {
    }

    public final Boolean enableManualDowngrade() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final b getAccountDebugService() {
        return new a();
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final List<String> getBoeBypassHostList() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final List<String> getBoeBypassPathList() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final c getResFakerService() {
        return new com.ss.android.ugc.aweme.local_test.a.a();
    }

    public final Boolean getSearchMobVerifySwitch() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public final d getSpecActDebugService() {
        if (defaultSpecActDebugService == null) {
            defaultSpecActDebugService = a.f121834a;
        }
        return defaultSpecActDebugService;
    }
}
