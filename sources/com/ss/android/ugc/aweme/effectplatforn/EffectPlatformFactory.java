package com.ss.android.ugc.aweme.effectplatforn;

import android.os.Build;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.effectplatform.h;
import com.ss.android.ugc.aweme.effectplatform.w;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.cache.EffectCacheManager;
import com.ss.android.ugc.effectmanager.common.cache.EffectDiskLruCache;
import com.ss.android.ugc.effectmanager.common.cachemanager.FileICache;
import com.ss.android.ugc.effectmanager.common.task.SyncTask;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcher;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcherArguments;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import com.ss.ugc.effectplatform.algorithm.e;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerListResponse;
import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import com.ss.ugc.effectplatform.task.aj;
import h.f.b.l;
import h.m.p;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EffectPlatformFactory implements IEffectPlatformFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final a f89093a = new a((byte) 0);

    static {
        Covode.recordClassIndex(56025);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(56026);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class d implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f89096a;

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ f f89097b;

        static {
            Covode.recordClassIndex(56029);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(int i2, String str, String str2, Integer num, Integer num2, com.ss.ugc.effectplatform.h.e<InfoStickerListResponse> eVar) {
            l.d(str, "");
            l.d(str2, "");
            l.d(eVar, "");
            this.f89097b.a(i2, str, str2, num, num2, eVar);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f
        public final void a(m mVar) {
            this.f89097b.a(mVar);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f
        public final void a(Effect effect, IFetchEffectListener iFetchEffectListener) {
            this.f89097b.a(effect, iFetchEffectListener);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
        public final void a(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
            l.d(providerEffect, "");
            l.d(iDownloadProviderEffectListener, "");
            this.f89097b.a(providerEffect, iDownloadProviderEffectListener);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(com.ss.ugc.effectplatform.h.e<RecommendSearchWordsResponse> eVar) {
            l.d(eVar, "");
            this.f89097b.a(eVar);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(InfoStickerEffect infoStickerEffect, com.ss.ugc.effectplatform.h.b bVar) {
            l.d(infoStickerEffect, "");
            this.f89097b.a(infoStickerEffect, bVar);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f
        public final void a(String str) {
            l.d(str, "");
            this.f89097b.a(str);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f
        public final void a(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
            l.d(str, "");
            l.d(iFetchEffectChannelListener, "");
            this.f89097b.a(str, iFetchEffectChannelListener);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
        public final void a(String str, IFetchFavoriteList iFetchFavoriteList) {
            l.d(str, "");
            l.d(iFetchFavoriteList, "");
            this.f89097b.a(str, iFetchFavoriteList);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, String str2, int i2, int i3, int i4, String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
            l.d(str, "");
            l.d(iFetchCategoryEffectListener, "");
            this.f89097b.a(str, str2, i2, i3, i4, str3, z, iFetchCategoryEffectListener);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, String str2, int i2, int i3, Map<String, String> map, ISearchEffectListenerV2 iSearchEffectListenerV2) {
            l.d(str, "");
            l.d(str2, "");
            l.d(map, "");
            l.d(iSearchEffectListenerV2, "");
            this.f89097b.a(str, str2, i2, i3, map, iSearchEffectListenerV2);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, String str2, int i2, ICheckChannelListener iCheckChannelListener, Map<String, String> map) {
            l.d(iCheckChannelListener, "");
            this.f89097b.a(str, str2, i2, iCheckChannelListener, map);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
        public final void a(String str, String str2, IUpdateTagListener iUpdateTagListener) {
            l.d(iUpdateTagListener, "");
            this.f89097b.a(str, str2, iUpdateTagListener);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, String str2, String str3, int i2, int i3, IFetchProviderEffect iFetchProviderEffect, boolean z) {
            l.d(str, "");
            l.d(iFetchProviderEffect, "");
            this.f89097b.a(str, str2, str3, i2, i3, iFetchProviderEffect, z);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, String str2, String str3, Integer num, Integer num2, com.ss.ugc.effectplatform.h.e<InfoStickerListResponse> eVar) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            l.d(eVar, "");
            this.f89097b.a(str, str2, str3, num, num2, eVar);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, String str2, String str3, String str4, int i2, int i3, Map<String, String> map, ISearchEffectListenerV2 iSearchEffectListenerV2) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            l.d(str4, "");
            l.d(map, "");
            l.d(iSearchEffectListenerV2, "");
            this.f89097b.a(str, str2, str3, str4, i2, i3, map, iSearchEffectListenerV2);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f
        public final void a(String str, String str2, Map<String, String> map, boolean z, com.ss.ugc.effectplatform.h.c cVar) {
            l.d(str, "");
            l.d(cVar, "");
            this.f89097b.a(str, str2, map, z, cVar);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f
        public final void a(String str, String str2, boolean z, int i2, int i3, int i4, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
            l.d(str, "");
            l.d(iFetchCategoryEffectListener, "");
            this.f89097b.a(str, str2, z, i2, i3, i4, str3, iFetchCategoryEffectListener);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
        public final void a(String str, String str2, boolean z, int i2, int i3, IFetchProviderEffect iFetchProviderEffect) {
            l.d(iFetchProviderEffect, "");
            this.f89097b.a(str, str2, z, i2, i3, iFetchProviderEffect);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
        public final void a(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
            l.d(iIsTagNeedUpdatedListener, "");
            this.f89097b.a(str, list, str2, iIsTagNeedUpdatedListener);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
        public final void a(String str, List<String> list, boolean z, IModFavoriteList iModFavoriteList) {
            l.d(str, "");
            l.d(list, "");
            l.d(iModFavoriteList, "");
            this.f89097b.a(str, list, z, iModFavoriteList);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f
        public final void a(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
            l.d(str, "");
            this.f89097b.a(str, map, iFetchEffectListener);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f
        public final void a(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
            l.d(str, "");
            l.d(iFetchEffectChannelListener, "");
            this.f89097b.a(str, z, iFetchEffectChannelListener);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f
        public final void a(String str, boolean z, String str2, int i2, int i3, IFetchPanelInfoListener iFetchPanelInfoListener) {
            l.d(str, "");
            this.f89097b.a(str, z, str2, i2, i3, iFetchPanelInfoListener);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, boolean z, String str2, int i2, int i3, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener) {
            l.d(str, "");
            l.d(iFetchPanelInfoListener, "");
            this.f89097b.a(str, z, str2, i2, i3, z2, iFetchPanelInfoListener);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void a(String str, boolean z, boolean z2, IFetchEffectChannelListener iFetchEffectChannelListener) {
            l.d(str, "");
            l.d(iFetchEffectChannelListener, "");
            this.f89097b.a(str, z, z2, iFetchEffectChannelListener);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
        public final void a(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
            l.d(list, "");
            this.f89097b.a(list, map, iFetchEffectListByIdsListener);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
        public final void a(List<String> list, Map<String, String> map, boolean z, IFetchEffectListListener iFetchEffectListListener) {
            this.f89097b.a(list, map, z, iFetchEffectListListener);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f
        public final void a(Map<String, Object> map) {
            this.f89097b.a(map);
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final void b(Effect effect, IFetchEffectListener iFetchEffectListener) {
            l.d(effect, "");
            l.d(iFetchEffectListener, "");
            this.f89097b.b(effect, iFetchEffectListener);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f
        public final boolean b(Effect effect) {
            return this.f89097b.b(effect);
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
        public final EffectManager c() {
            return this.f89097b.c();
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f
        public final void d() {
            this.f89097b.d();
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f, com.ss.android.ugc.tools.b.a.d
        public final void destroy() {
            this.f89097b.destroy();
        }

        @Override // com.ss.android.ugc.aweme.effectplatform.f
        public final boolean a(Effect effect) {
            com.ss.android.ttve.nativePort.d.a();
            return this.f89096a.a(effect);
        }

        d(f fVar) {
            this.f89096a = fVar;
            this.f89097b = fVar;
        }

        @Override // com.ss.android.ugc.tools.b.a.d
        public final boolean c(Effect effect) {
            l.d(effect, "");
            com.ss.android.ttve.nativePort.d.a();
            return this.f89096a.c(effect);
        }
    }

    public static final class c implements com.ss.ugc.effectplatform.a.a {

        /* renamed from: a  reason: collision with root package name */
        public final com.ss.ugc.effectplatform.algorithm.a f89095a = e.a.a().b();

        static {
            Covode.recordClassIndex(56028);
        }

        c() {
        }

        @Override // com.ss.ugc.effectplatform.a.a
        public final aj<com.ss.ugc.effectplatform.task.c.a> a(com.ss.ugc.effectplatform.a.b bVar) {
            l.d(bVar, "");
            com.ss.android.ttve.nativePort.d.a();
            return this.f89095a.a(bVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public List<Host> getDownloadableModelHosts() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Host("https://api-va.tiktokv.com"));
        return arrayList;
    }

    public static final class b implements EffectFetcher {

        /* renamed from: a  reason: collision with root package name */
        private final EffectFetcher f89094a;

        static {
            Covode.recordClassIndex(56027);
        }

        b() {
            DownloadableModelSupport instance = DownloadableModelSupport.getInstance();
            l.b(instance, "");
            this.f89094a = instance.getEffectFetcher();
        }

        @Override // com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcher
        public final SyncTask<EffectTaskResult> fetchEffect(EffectFetcherArguments effectFetcherArguments) {
            l.d(effectFetcherArguments, "");
            com.ss.android.ttve.nativePort.d.a();
            SyncTask<EffectTaskResult> fetchEffect = this.f89094a.fetchEffect(effectFetcherArguments);
            l.b(fetchEffect, "");
            return fetchEffect;
        }
    }

    public static IEffectPlatformFactory a() {
        MethodCollector.i(8929);
        Object a2 = com.ss.android.ugc.b.a(IEffectPlatformFactory.class, false);
        if (a2 != null) {
            IEffectPlatformFactory iEffectPlatformFactory = (IEffectPlatformFactory) a2;
            MethodCollector.o(8929);
            return iEffectPlatformFactory;
        }
        if (com.ss.android.ugc.b.bl == null) {
            synchronized (IEffectPlatformFactory.class) {
                try {
                    if (com.ss.android.ugc.b.bl == null) {
                        com.ss.android.ugc.b.bl = new EffectPlatformFactory();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8929);
                    throw th;
                }
            }
        }
        EffectPlatformFactory effectPlatformFactory = (EffectPlatformFactory) com.ss.android.ugc.b.bl;
        MethodCollector.o(8929);
        return effectPlatformFactory;
    }

    @Override // com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public List<Host> getHosts() {
        ArrayList arrayList = new ArrayList();
        if (g.a().A().a()) {
            arrayList.add(new Host("https://api-va.tiktokv.com/tiktok/v1/kids"));
        } else {
            arrayList.add(new Host("https://api-va.tiktokv.com"));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public f create(EffectPlatformBuilder effectPlatformBuilder) {
        l.d(effectPlatformBuilder, "");
        g.a().v();
        EffectConfiguration.Builder createEffectConfigurationBuilder = createEffectConfigurationBuilder(effectPlatformBuilder);
        if (effectPlatformBuilder.getEffectFetcher() == null) {
            createEffectConfigurationBuilder.effectFetcher(new b());
            if (e.a.b()) {
                createEffectConfigurationBuilder.knEffectFetcher(new c());
            }
        } else {
            createEffectConfigurationBuilder.effectFetcher(effectPlatformBuilder.getEffectFetcher());
        }
        f create$default = IEffectPlatformFactory.DefaultImpls.create$default(this, createEffectConfigurationBuilder, e.f89098a, false, 4, null);
        create$default.a(effectPlatformBuilder.getMonitorExtraParams());
        return new d(create$default);
    }

    static final class e extends h.f.b.m implements h.f.a.b<EffectConfiguration, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f89098a = new e();

        static {
            Covode.recordClassIndex(56030);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(EffectConfiguration effectConfiguration) {
            EffectConfiguration effectConfiguration2 = effectConfiguration;
            l.d(effectConfiguration2, "");
            File effectDir = effectConfiguration2.getEffectDir();
            l.b(effectDir, "");
            String absolutePath = effectDir.getAbsolutePath();
            l.b(absolutePath, "");
            l.d(absolutePath, "");
            boolean z = true;
            if (!com.bytedance.ies.abmock.b.a().a(true, "use_effect_lru_cache", true) || !p.a((CharSequence) absolutePath, (CharSequence) "files/effect", false)) {
                z = false;
            }
            if (z) {
                if (effectConfiguration2.getDraftList() == null) {
                    effectConfiguration2.setDraftList(EffectPlatform.e());
                }
                if (EffectCacheManager.Companion.getInstance().getCache(absolutePath) == null) {
                    try {
                        EffectCacheManager.Companion.getInstance().setCache(absolutePath, new EffectDiskLruCache(effectConfiguration2, 0, 2, null));
                    } catch (Exception unused) {
                        EffectCacheManager instance = EffectCacheManager.Companion.getInstance();
                        File effectDir2 = effectConfiguration2.getEffectDir();
                        l.b(effectDir2, "");
                        String absolutePath2 = effectDir2.getAbsolutePath();
                        l.b(absolutePath2, "");
                        instance.setCache(absolutePath, new FileICache(absolutePath2));
                    }
                }
                effectConfiguration2.setCache(EffectCacheManager.Companion.getInstance().getCache(absolutePath));
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public EffectConfiguration.Builder createEffectConfigurationBuilder(EffectPlatformBuilder effectPlatformBuilder) {
        String serverDeviceId;
        l.d(effectPlatformBuilder, "");
        if (effectPlatformBuilder.getContext() != null) {
            if (effectPlatformBuilder.getRegion() == null) {
                String a2 = g.a().y().a();
                if (a2 == null) {
                    a2 = "";
                }
                effectPlatformBuilder.setRegion(a2);
            }
            if (effectPlatformBuilder.getAccessKey() == null) {
                effectPlatformBuilder.setAccessKey(g.a().f().a());
            }
            if (effectPlatformBuilder.getCacheDir() == null) {
                effectPlatformBuilder.setCacheDir(EffectPlatform.f89012a);
            }
            if (l.a(effectPlatformBuilder.getCacheDir(), EffectPlatform.f89012a) && com.bytedance.ies.abmock.b.a().a(true, "creative_tools_open_effect_cache", false)) {
                effectPlatformBuilder.setEffectMaxCacheSize(com.bytedance.ies.abmock.b.a().a(true, "creative_tool_effect_cache_threshold", 838860800L) * 1048576);
            }
            if (effectPlatformBuilder.getSdkVersion() == null) {
                effectPlatformBuilder.setSdkVersion(g.a().f().b());
            }
            if (effectPlatformBuilder.getChannel() == null) {
                String j2 = g.a().w().j();
                g.a();
                l.b(j2, "");
                effectPlatformBuilder.setChannel(j2);
            }
            if (effectPlatformBuilder.getAppVersion() == null) {
                effectPlatformBuilder.setAppVersion(g.a().w().i());
            }
            if (effectPlatformBuilder.getAppID() == null) {
                String a3 = EffectPlatform.a();
                l.b(a3, "");
                effectPlatformBuilder.setAppID(a3);
            }
            if (effectPlatformBuilder.getAppLanguage() == null) {
                effectPlatformBuilder.setAppLanguage(IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getAppLanguage());
            }
            if (effectPlatformBuilder.getSystemLanguage() == null) {
                effectPlatformBuilder.setSystemLanguage(IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getSysLanguage());
            }
            if (effectPlatformBuilder.getRetryCount() == null) {
                effectPlatformBuilder.setRetryCount(1);
            }
            if (effectPlatformBuilder.getHosts() == null) {
                effectPlatformBuilder.setHosts(getHosts());
            }
            if (effectPlatformBuilder.getEffectNetWorker() == null) {
                effectPlatformBuilder.setEffectNetWorker(new w());
            }
            if (effectPlatformBuilder.getExecutorService() == null) {
                effectPlatformBuilder.setExecutorService(com.ss.android.ugc.aweme.cw.g.a());
            }
            if (effectPlatformBuilder.getJsonConverter() == null) {
                effectPlatformBuilder.setJsonConverter(h.a());
            }
            if (effectPlatformBuilder.getRequestStrategy() == null) {
                effectPlatformBuilder.setRequestStrategy(2);
            }
            if (effectPlatformBuilder.getEffectMaxCacheSize() <= 0) {
                effectPlatformBuilder.setEffectMaxCacheSize(838860800);
            }
            EffectConfiguration.Builder monitorService = new EffectConfiguration.Builder().accessKey(effectPlatformBuilder.getAccessKey()).channel(effectPlatformBuilder.getChannel()).sdkVersion(effectPlatformBuilder.getSdkVersion()).appVersion(effectPlatformBuilder.getAppVersion()).platform("android").deviceType(Build.MODEL).JsonConverter(effectPlatformBuilder.getJsonConverter()).monitorService(new com.ss.android.ugc.aweme.effectplatform.e());
            if (AppLog.getServerDeviceId() == null) {
                serverDeviceId = "0";
            } else {
                serverDeviceId = AppLog.getServerDeviceId();
            }
            EffectConfiguration.Builder sysLanguage = monitorService.deviceId(serverDeviceId).appID(effectPlatformBuilder.getAppID()).appLanguage(effectPlatformBuilder.getAppLanguage()).sysLanguage(effectPlatformBuilder.getSystemLanguage());
            Integer retryCount = effectPlatformBuilder.getRetryCount();
            l.b(retryCount, "");
            EffectConfiguration.Builder effectFetcher = sysLanguage.retryCount(retryCount.intValue()).effectDir(effectPlatformBuilder.getCacheDir()).effectNetWorker(effectPlatformBuilder.getEffectNetWorker()).region(effectPlatformBuilder.getRegion()).hosts(effectPlatformBuilder.getHosts()).context(effectPlatformBuilder.getContext()).executor(effectPlatformBuilder.getExecutorService()).effectFetcher(effectPlatformBuilder.getEffectFetcher());
            Integer requestStrategy = effectPlatformBuilder.getRequestStrategy();
            l.b(requestStrategy, "");
            EffectConfiguration.Builder effectMaxCacheSize = effectFetcher.requestStrategy(requestStrategy.intValue()).effectMaxCacheSize(effectPlatformBuilder.getEffectMaxCacheSize());
            g.a();
            l.b(effectMaxCacheSize, "");
            return effectMaxCacheSize;
        }
        throw new IllegalArgumentException("context is null.".toString());
    }

    @Override // com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public f create(EffectConfiguration.Builder builder, h.f.a.b<? super EffectConfiguration, z> bVar, boolean z) {
        l.d(builder, "");
        EffectConfiguration build = builder.build();
        if (bVar != null) {
            l.b(build, "");
            bVar.invoke(build);
        }
        return new EffectPlatform(build);
    }
}
