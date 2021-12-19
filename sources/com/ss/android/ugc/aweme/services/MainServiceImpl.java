package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.task.CookieMonitorTask;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.app.b;
import com.ss.android.ugc.aweme.app.d;
import com.ss.android.ugc.aweme.app.o;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.aw;
import com.ss.android.ugc.aweme.base.component.h;
import com.ss.android.ugc.aweme.commercialize.utils.an;
import com.ss.android.ugc.aweme.commercialize.views.cards.X2CAdWebPage;
import com.ss.android.ugc.aweme.commercialize.views.cards.ab;
import com.ss.android.ugc.aweme.commercialize.views.form.a;
import com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.deeplink.AppLinkHandler;
import com.ss.android.ugc.aweme.deeplink.AppLinkHandlerV2;
import com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2;
import com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity;
import com.ss.android.ugc.aweme.experiment.dv;
import com.ss.android.ugc.aweme.experiment.gy;
import com.ss.android.ugc.aweme.fe.method.l;
import com.ss.android.ugc.aweme.feed.model.AnchorLynxModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.lancet.I18nLancet;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.q;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImp.task.ColdBootPreloadInstanceTask;
import com.ss.android.ugc.aweme.legoImp.task.LegoRequestTask;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.main.ae;
import com.ss.android.ugc.aweme.model.a.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.requesttask.idle.FetchImUnder16RequestTask;
import com.ss.android.ugc.aweme.requesttask.idle.c;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.settingsrequest.RegisterStorageTask;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.ss.android.ugc.trill.share.base.ShareCacheRegisterTask;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class MainServiceImpl implements IMainService {
    static {
        Covode.recordClassIndex(79523);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public int getLauncherIconRes() {
        return R.drawable.ao7;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isUseJediAwemelistFragment() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean openAdTestUrl(Context context, String str, int i2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public String getApiUrlPrefix() {
        return Api.f66569d;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Class<? extends Activity> getMainActivityClass() {
        return MainActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public w getPreloadInstanceTask() {
        return ColdBootPreloadInstanceTask.f107756a;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Class<? extends Activity> getSplashActivityClass() {
        return SplashActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public r getAnchorListRequest() {
        return new c();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public int getAppVersionCode() {
        return (int) d.h();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public w getCookieMonitorTask() {
        return new CookieMonitorTask();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public w getFetchImUnder16RequestTask() {
        return new FetchImUnder16RequestTask();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public w getLegoRequestTask() {
        return new LegoRequestTask();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public q getMainInflate() {
        return new X2CAdWebPage();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public w getRegisterStorageTask() {
        return new RegisterStorageTask();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public w getShareCacheRegisterTask() {
        return new ShareCacheRegisterTask();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Class[] getFixFragmentManagerWhiteList() {
        return new Class[]{ab.class, a.class};
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void initLegoInflate() {
        f.n.a(X2CAdWebPage.class, new X2CAdWebPage());
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isAppHot() {
        return o.a().f66861a.a();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isAwemeAppDataEmpty() {
        if (AwemeAppData.a() != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isContainsKeyWithLruEntries() {
        com.ss.android.ugc.aweme.settingsrequest.a.b();
        return b.a().a(true, "contains_key_with_lruEntries", true);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isReplaceAwemeCache() {
        com.ss.android.ugc.aweme.settingsrequest.a.b();
        return b.a().a(true, "is_replace_aweme_manager_with_lrucache", true);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Fragment getFollowFragmentCache() {
        ColdBootPreloadInstanceTask coldBootPreloadInstanceTask = (ColdBootPreloadInstanceTask) f.a((n) ColdBootPreloadInstanceTask.f107756a);
        if (coldBootPreloadInstanceTask.f107758c == null) {
            return null;
        }
        Fragment fragment = coldBootPreloadInstanceTask.f107758c;
        coldBootPreloadInstanceTask.f107758c = null;
        return fragment;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Fragment getRecommendFragmentCache() {
        ColdBootPreloadInstanceTask coldBootPreloadInstanceTask = (ColdBootPreloadInstanceTask) f.a((n) ColdBootPreloadInstanceTask.f107756a);
        if (coldBootPreloadInstanceTask.f107757b == null) {
            return null;
        }
        Fragment fragment = coldBootPreloadInstanceTask.f107757b;
        coldBootPreloadInstanceTask.f107757b = null;
        return fragment;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Fragment obtainFriendTabFragment() {
        if (MSAdaptionService.c().a(d.a())) {
            return new com.ss.android.ugc.aweme.newfollow.ui.c();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Fragment obtainMainPageFragment() {
        if (!MSAdaptionService.c().a(d.a())) {
            return null;
        }
        Bundle bundle = new Bundle();
        MainPageFragment mainPageFragment = new MainPageFragment();
        mainPageFragment.setArguments(bundle);
        return mainPageFragment;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isLimitAdTrackingEnabled() {
        if (((Boolean) an.f75583c.getValue()).booleanValue()) {
            return true;
        }
        if (!an.f75582b) {
            an.f75582b = true;
            if (com.ss.android.ugc.aweme.lego.d.e()) {
                i.b(an.a.f75585a, g.a());
            } else {
                i.b(an.b.f75586a, i.f4824a);
            }
        }
        return an.f75581a;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public List<aw> getDeeplinkCommands() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new b.af());
        arrayList2.add(new x.y());
        arrayList2.add(new x.p());
        arrayList2.add(new x.q());
        arrayList2.add(new x.u());
        arrayList2.add(new x.h());
        arrayList2.add(new x.w());
        arrayList2.add(new x.v());
        arrayList2.add(new x.d());
        arrayList2.add(new x.j());
        arrayList2.add(new x.z());
        arrayList2.add(new x.C1506x());
        arrayList2.add(new x.r());
        arrayList2.add(new x.e());
        arrayList2.add(new x.t());
        arrayList2.add(new x.s());
        arrayList2.add(new x.g());
        arrayList2.add(new x.b());
        arrayList2.add(new x.i());
        arrayList2.add(new x.f());
        arrayList2.add(new x.o());
        arrayList2.add(new x.l());
        arrayList2.add(new x.k());
        arrayList2.add(new x.n());
        arrayList2.add(new x.a());
        arrayList2.add(new x.m());
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new b.ae());
        arrayList3.add(new b.r());
        arrayList3.add(new b.m());
        arrayList3.add(new b.ac());
        arrayList3.add(new b.i());
        arrayList3.add(new b.ad());
        arrayList3.add(new b.ap());
        arrayList3.add(new b.ar());
        arrayList3.add(new b.a());
        arrayList3.add(new b.c());
        arrayList3.add(new b.u());
        arrayList3.add(new b.aa());
        arrayList3.add(new b.ah());
        arrayList3.add(new b.f());
        arrayList3.add(new b.z());
        arrayList3.add(new b.ai());
        arrayList3.add(new b.p());
        arrayList3.add(new b.q());
        arrayList3.add(new b.am());
        arrayList3.add(new b.w());
        arrayList3.add(new b.l());
        arrayList3.add(new b.ab());
        arrayList3.add(new b.av());
        arrayList3.add(new b.x());
        arrayList3.add(new b.n());
        arrayList3.add(new b.e());
        arrayList3.add(new b.g());
        arrayList3.add(new b.aq());
        arrayList3.add(new b.al());
        arrayList3.add(new b.as());
        arrayList3.add(new b.ao());
        arrayList3.add(new b.aj());
        arrayList3.add(new b.s());
        arrayList3.add(new b.an());
        arrayList3.add(new b.au());
        arrayList3.add(new b.ag());
        arrayList3.add(new b.at());
        arrayList3.add(new b.t());
        arrayList3.add(new b.C1494b());
        arrayList3.add(new b.y());
        arrayList3.add(new b.o());
        arrayList3.add(new b.d());
        arrayList3.add(new b.ak());
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isMainPage(Context context) {
        return context instanceof MainActivity;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void restartApp(Bundle bundle) {
        com.ss.android.ugc.aweme.login.d.a(bundle);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public com.ss.android.ugc.aweme.shortvideo.c avMusicApply(MusicModel musicModel) {
        return com.ss.android.ugc.aweme.shortvideo.ae.b.a(musicModel);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public w getAmeActivityResumeRunTask(Activity activity) {
        return new I18nLancet.AmeActivityResumeRun(activity);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Class<? extends Activity> getAppLinkHandlerActivityClass(boolean z) {
        if (z) {
            return AppLinkHandlerV2.class;
        }
        return AppLinkHandler.class;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Class<? extends Activity> getDeepLinkHandlerActivityClass(boolean z) {
        if (z) {
            return DeepLinkActivityV2.class;
        }
        return DeepLinkHandlerActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Long getFeedCount(Integer num) {
        return com.ss.android.ugc.aweme.commerce.d.a.a(num);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Intent getMainActivityIntent(Context context) {
        return com.ss.android.ugc.aweme.utils.a.c.a(context);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public String getSecurityUrl(String str) {
        return com.ss.android.ugc.aweme.app.i.a.a(str, "qrcode");
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean handleLiveSchema(String str) {
        return l.c(str);
    }

    private JSONArray jsonArrayToJSONArray(com.google.gson.i iVar) {
        return new JSONArray(iVar.toString());
    }

    private JSONObject jsonObjectToJSONObject(com.google.gson.o oVar) {
        return new JSONObject(oVar.toString());
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Context interceptActivityAttachBaseContext(Context context) {
        com.ss.android.ugc.aweme.bz.a.a(context);
        Context b2 = com.ss.android.ugc.aweme.i18n.language.i18n.c.b(context);
        com.google.android.play.core.d.a.a(b2, false);
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isDeepLinkHandlerActivity(Context context) {
        if ((context instanceof DeepLinkHandlerActivity) || (context instanceof DeepLinkActivityV2)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void pendingDeepLinkLog(h.f.a.b<Boolean, z> bVar) {
        bVar.getClass();
        com.ss.android.ugc.aweme.commercialize.utils.w.a(MainServiceImpl$$Lambda$2.get$Lambda(bVar));
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void updateIMUserFollowStatus(User user) {
        IMService.createIIMServicebyMonsterPlugin(false).updateIMUserFollowStatus(com.ss.android.ugc.aweme.im.a.a(user));
    }

    public static IMainService createIMainServicebyMonsterPlugin(boolean z) {
        Object a2 = com.ss.android.ugc.b.a(IMainService.class, z);
        if (a2 != null) {
            return (IMainService) a2;
        }
        return new MainServiceImpl();
    }

    private List<String> mergeKeys(List<String> list) {
        HashSet hashSet = new HashSet();
        for (String str : list) {
            String[] split = str.split("\\.");
            if (split.length > 0) {
                hashSet.add(split[0]);
            }
        }
        return new ArrayList(hashSet);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isOnFollowPage(Activity activity) {
        if (activity == null || !(activity instanceof MainActivity)) {
            return false;
        }
        MainActivity mainActivity = (MainActivity) activity;
        if (!mainActivity.isUnderMainTab() || !(mainActivity.getCurFragment() instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) mainActivity.getCurFragment();
        if (!aeVar.getUserVisibleHint() || !aeVar.n()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean shouldChangeToHandle(String str) {
        h.f.b.l.d(str, "");
        int a2 = com.bytedance.ies.abmock.b.a().a(true, "nickname_to_username", 2);
        if (a2 == 1) {
            return true;
        }
        if (a2 == 2) {
            return !h.f.b.l.a((Object) str, (Object) "Message");
        }
        if (a2 == 3) {
            return h.f.b.l.a((Object) str, (Object) "Message");
        }
        if (a2 != 4) {
            return false;
        }
        if (h.f.b.l.a((Object) str, (Object) "Comment") || h.f.b.l.a((Object) str, (Object) "Notification")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Map<String, Object> getSettings(List<String> list) {
        try {
            Map<String, Object> a2 = com.ss.android.ugc.aweme.settingsrequest.b.a.a(mergeKeys(list));
            Map<String, Object> hashMap = new HashMap<>();
            for (Map.Entry<String, Object> entry : a2.entrySet()) {
                if (entry.getValue() != null) {
                    if (entry.getValue() instanceof com.google.gson.o) {
                        hashMap.put(entry.getKey(), jsonObjectToJSONObject((com.google.gson.o) entry.getValue()));
                    } else if (entry.getValue() instanceof com.google.gson.i) {
                        hashMap.put(entry.getKey(), jsonArrayToJSONArray((com.google.gson.i) entry.getValue()));
                    } else {
                        hashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            HashMap hashMap2 = new HashMap();
            for (String str : list) {
                Object retrieveSettingValue = retrieveSettingValue(str, hashMap);
                if (retrieveSettingValue != null) {
                    hashMap2.put(str, retrieveSettingValue);
                }
            }
            return hashMap2;
        } catch (Exception unused) {
            return new HashMap();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void trackAppsFlyerEvent(String str, String str2) {
        com.ss.android.ugc.aweme.t.b.a(str, str2);
    }

    public static void com_ss_android_ugc_aweme_services_MainServiceImpl_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public String getFeedOrder(Aweme aweme, Integer num) {
        return com.ss.android.ugc.aweme.commerce.d.a.a(aweme, num);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean openSystemBrowser(Context context, String str) {
        return com.ss.android.ugc.aweme.commercialize.utils.w.b(context, str);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean shouldShowCommerceTagOnFeed(Aweme aweme, Integer num) {
        num.intValue();
        return false;
    }

    static final /* synthetic */ void lambda$downloadStickerHelper$1$MainServiceImpl(IMainService.DownLoadFinishListener downLoadFinishListener, int i2) {
        boolean z;
        if (i2 == 2006) {
            z = true;
        } else {
            z = false;
        }
        downLoadFinishListener.doAfterDownLoad(i2, Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void openDeepLinkActivity(Context context, String str) {
        Intent intent = new Intent(context, DeepLinkActivityV2.class);
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        com_ss_android_ugc_aweme_services_MainServiceImpl_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(context, intent);
    }

    private Object retrieveSettingValue(String str, Map<String, Object> map) {
        Object opt;
        String[] split = str.split("\\.");
        if (split.length == 0) {
            return null;
        }
        int i2 = 0;
        Map<String, Object> map2 = map;
        while (map2 != null && i2 < split.length) {
            String str2 = split[i2];
            if (map2 instanceof Map) {
                Map<String, Object> map3 = map2;
                if (map3.containsKey(str2)) {
                    opt = map3.get(str2);
                    i2++;
                    map2 = opt;
                }
            }
            if (map2 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) map2;
                if (jSONObject.opt(str2) != null) {
                    opt = jSONObject.opt(str2);
                    i2++;
                    map2 = opt;
                }
            }
            return null;
        }
        return map2;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean checkIsMinAppVersionNotSatisfied(Activity activity, String str, String str2) {
        com.ss.android.ugc.aweme.deeplink.b.a();
        return com.ss.android.ugc.aweme.deeplink.b.a(activity, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean openAdOpenUrl(Context context, String str, boolean z) {
        return com.ss.android.ugc.aweme.commercialize.utils.w.a(context, str, z);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean openAdWebUrl(Context context, String str, String str2) {
        return com.ss.android.ugc.aweme.commercialize.utils.w.a(context, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean startAdsAppActivity(Context context, String str, String str2) {
        return d.a.a(context, str, str2, false);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean tryShowIllegalUsernameDialog(String str, Runnable runnable, Runnable runnable2) {
        h.f.b.l.d(str, "");
        long currentTimeMillis = System.currentTimeMillis();
        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
        if (com.ss.android.ugc.aweme.compliance.api.a.c().a(4) || gy.a() || j2 == null) {
            return false;
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        if (!g2.isLogin()) {
            return false;
        }
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g3, "");
        User curUser = g3.getCurUser();
        IAccountUserService g4 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g4, "");
        String curUserId = g4.getCurUserId();
        h.f.b.l.b(curUserId, "");
        long j3 = currentTimeMillis - dv.f89850c.getLong("last_illegal_dialog_show_".concat(String.valueOf(curUserId)), -1);
        int a2 = com.bytedance.ies.abmock.b.a().a(true, "username_modify_tip_interval_2", 0);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4 || j3 <= 604800000) {
                        return false;
                    }
                    if (!h.f.b.l.a((Object) str, (Object) UGCMonitor.EVENT_COMMENT) && !h.f.b.l.a((Object) str, (Object) "publish") && !h.f.b.l.a((Object) str, (Object) "profile")) {
                        return false;
                    }
                } else if (j3 <= 172800000) {
                    return false;
                } else {
                    if (!h.f.b.l.a((Object) str, (Object) UGCMonitor.EVENT_COMMENT) && !h.f.b.l.a((Object) str, (Object) "publish") && !h.f.b.l.a((Object) str, (Object) "profile")) {
                        return false;
                    }
                }
            } else if (j3 <= 172800000) {
                return false;
            } else {
                if (!h.f.b.l.a((Object) str, (Object) UGCMonitor.EVENT_COMMENT) && !h.f.b.l.a((Object) str, (Object) "publish")) {
                    return false;
                }
            }
        } else if (j3 <= 172800000) {
            return false;
        } else {
            if (!h.f.b.l.a((Object) str, (Object) UGCMonitor.EVENT_COMMENT) && !h.f.b.l.a((Object) str, (Object) "profile")) {
                return false;
            }
        }
        h hVar = new h(j2, curUser);
        dv.f89848a = currentTimeMillis;
        dv.f89849b = str;
        hVar.setOnDismissListener(new dv.a(runnable2, hVar, str, currentTimeMillis));
        if (runnable != null) {
            runnable.run();
        }
        hVar.show();
        com.ss.android.ugc.aweme.common.r.a("notify_username", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).f66730a);
        dv.f89850c.storeLong("last_illegal_dialog_show_".concat(String.valueOf(curUserId)), currentTimeMillis);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void startBulletActivity(Context context, String str, String str2, Bundle bundle) {
        com.ss.android.ugc.aweme.bullet.b.a(context, str, str2, bundle);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Intent getAwemeWebIntent(Context context, Uri uri, Boolean bool, Boolean bool2) {
        return d.a.a(context, uri, bool.booleanValue(), bool2.booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Intent handleAmeWebViewBrowserForDeeplink(Context context, Uri uri, Boolean bool, Boolean bool2) {
        return d.a.a(context, uri, bool.booleanValue(), bool2.booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void downloadStickerHelper(String str, String str2, Activity activity, boolean z, IMainService.DownLoadFinishListener downLoadFinishListener) {
        a.C2826a a2 = new a.C2826a().a("scan");
        a2.f110690f = false;
        a.C2826a a3 = a2.a(new MainServiceImpl$$Lambda$0(str));
        MainServiceImpl$$Lambda$1 mainServiceImpl$$Lambda$1 = new MainServiceImpl$$Lambda$1(downLoadFinishListener);
        h.f.b.l.d(mainServiceImpl$$Lambda$1, "");
        a3.f110692h = mainServiceImpl$$Lambda$1;
        h.f.b.l.d("qrcode", "");
        a3.f110689e = "qrcode";
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        PropReuseServiceImpl.c().a(activity, arrayList, a3.a(), z);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void startVideoPlayActivity(Context context, String str, String str2, boolean z, String str3, String str4, String str5, String str6, float f2) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        h.f.b.l.d(str4, "");
        Intent intent = new Intent(context, VideoPlayActivity.class);
        intent.putExtra("play_addr_string", str);
        intent.putExtra("cover_image_string", str2);
        intent.putExtra("loop", z);
        intent.putExtra("video_id", str3);
        intent.putExtra("video_md5", str4);
        intent.putExtra("enter_from", str5);
        intent.putExtra("video_type", str6);
        intent.putExtra("progress", f2);
        intent.putExtra("tag_line", "");
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void showAdPopUpWebPageWidget(Context context, AwemeRawAd awemeRawAd, Integer num, Integer num2, String str, String str2, Boolean bool, String str3, Aweme aweme, AnchorLynxModel anchorLynxModel) {
        if (com.ss.android.ugc.aweme.commercialize.feed.assem.b.f74088a) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.feed.assem.popup.b.b(new com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b(context, awemeRawAd, num.intValue(), num2.intValue(), str, str2, bool.booleanValue(), str3, aweme, anchorLynxModel, (byte) 0)));
            return;
        }
        AdPopUpWebPageWidget.s.a(new com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b(context, awemeRawAd, num.intValue(), num2.intValue(), str, str2, bool.booleanValue(), str3, aweme, anchorLynxModel, (byte) 0));
    }
}
