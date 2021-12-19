package com.ss.android.ugc.aweme.simkit.config;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.b.c;
import com.ss.android.ugc.aweme.player.sdk.c.d;
import com.ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.simkit.impl.b.a;
import com.ss.android.ugc.aweme.simkit.impl.bitrateselector.e;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.ss.android.ugc.aweme.video.preload.i;
import com.ss.android.ugc.aweme.video.preload.s;
import com.ss.android.ugc.playerkit.model.m;
import com.ss.android.ugc.playerkit.model.u;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.a.h;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import com.ss.android.ugc.playerkit.videoview.d.f;
import com.ss.android.ugc.playerkit.videoview.d.g;
import com.ss.android.ugc.playerkit.videoview.d.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class b implements ISimPlayerConfig {

    /* renamed from: a  reason: collision with root package name */
    private final ISimPlayerConfig f133494a;

    static {
        Covode.recordClassIndex(87319);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void downloadFile(String str, String str2, String str3, String str4) {
        this.f133494a.downloadFile(str, str2, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final int getAverageSpeedInKBps() {
        return this.f133494a.getAverageSpeedInKBps();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final d getISimPlayerPlaySessionConfig(boolean z) {
        return this.f133494a.getISimPlayerPlaySessionConfig(z);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final m getPlayerConfig(m.e eVar, boolean z, boolean z2) {
        return this.f133494a.getPlayerConfig(eVar, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final com.ss.android.ugc.aweme.player.sdk.b.b getProperResolution(String str, c cVar) {
        return this.f133494a.getProperResolution(str, cVar);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final i getVideoPlayAddr(h hVar, m.e eVar) {
        return this.f133494a.getVideoPlayAddr(hVar, eVar);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isCache(i iVar) {
        return this.f133494a.isCache(iVar);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isHttpsVideoUrlModel(i iVar) {
        return this.f133494a.isHttpsVideoUrlModel(iVar);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isPluginApplied() {
        return this.f133494a.isPluginApplied();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void onRecordFirstFrameTime(String str, long j2, String str2, boolean z, boolean z2) {
        this.f133494a.onRecordFirstFrameTime(str, j2, str2, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void onRecordPrepareTime(String str, long j2, String str2, boolean z, boolean z2) {
        this.f133494a.onRecordPrepareTime(str, j2, str2, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void recordMiscLog(Context context, String str, JSONObject jSONObject) {
        this.f133494a.recordMiscLog(context, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean enableByteVc1FailCheckCountPolicy() {
        return this.f133494a.enableByteVc1FailCheckCountPolicy();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean enableForceUseH264CheckPolicy() {
        return this.f133494a.enableForceUseH264CheckPolicy();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean enableForceUseH264Global() {
        return this.f133494a.enableForceUseH264Global();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final int getPlayerType() {
        return this.f133494a.getPlayerType();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isPlayerPreferchCaption() {
        return this.f133494a.isPlayerPreferchCaption();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isPlayerPreferchTtsAudio() {
        return this.f133494a.isPlayerPreferchTtsAudio();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final com.ss.android.ugc.playerkit.videoview.d.h createVideoUrlProcessor() {
        com.ss.android.ugc.playerkit.videoview.d.h createVideoUrlProcessor = this.f133494a.createVideoUrlProcessor();
        if (createVideoUrlProcessor != null) {
            return createVideoUrlProcessor;
        }
        return a.a();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final com.ss.android.ugc.aweme.player.sdk.api.b getBitrateSelectListener() {
        com.ss.android.ugc.aweme.player.sdk.api.b bitrateSelectListener = this.f133494a.getBitrateSelectListener();
        if (bitrateSelectListener != null) {
            return bitrateSelectListener;
        }
        return com.ss.android.ugc.aweme.simkit.impl.bitrateselector.c.f133533a;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final com.ss.android.ugc.aweme.player.sdk.api.d getBitrateSelector() {
        com.ss.android.ugc.aweme.player.sdk.api.d bitrateSelector = this.f133494a.getBitrateSelector();
        if (bitrateSelector != null) {
            return bitrateSelector;
        }
        return e.f133537a;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final f createAudioUrlProcessor() {
        f createAudioUrlProcessor = this.f133494a.createAudioUrlProcessor();
        if (createAudioUrlProcessor != null) {
            return createAudioUrlProcessor;
        }
        ArrayList arrayList = new ArrayList();
        com.ss.android.ugc.aweme.simkit.c a2 = com.ss.android.ugc.aweme.simkit.d.a();
        l.a((Object) a2, "");
        ISimKitConfig b2 = a2.b();
        l.a((Object) b2, "");
        ICommonConfig commonConfig = b2.getCommonConfig();
        l.a((Object) commonConfig, "");
        if (commonConfig.getVideoUrlHooks() != null) {
            com.ss.android.ugc.aweme.simkit.c a3 = com.ss.android.ugc.aweme.simkit.d.a();
            l.a((Object) a3, "");
            ISimKitConfig b3 = a3.b();
            l.a((Object) b3, "");
            ICommonConfig commonConfig2 = b3.getCommonConfig();
            l.a((Object) commonConfig2, "");
            List<n> videoUrlHooks = commonConfig2.getVideoUrlHooks();
            l.a((Object) videoUrlHooks, "");
            arrayList.addAll(videoUrlHooks);
        }
        com.ss.android.ugc.aweme.simkit.c a4 = com.ss.android.ugc.aweme.simkit.d.a();
        l.a((Object) a4, "");
        ISimKitConfig b4 = a4.b();
        l.a((Object) b4, "");
        if (b4.getPreloaderExperiment().PreloadTypeExperiment() == i.a.VideoCache) {
            arrayList.add(new com.ss.android.ugc.aweme.simkit.impl.b.b(s.b()));
        } else {
            com.ss.android.ugc.aweme.video.preload.i b5 = s.b();
            com.ss.android.ugc.aweme.simkit.c a5 = com.ss.android.ugc.aweme.simkit.d.a();
            l.a((Object) a5, "");
            ISimKitConfig b6 = a5.b();
            l.a((Object) b6, "");
            ICommonConfig commonConfig3 = b6.getCommonConfig();
            l.a((Object) commonConfig3, "");
            arrayList.add(new a(b5, commonConfig3.getVideoUrlHookHook()));
        }
        com.ss.android.ugc.aweme.simkit.c a6 = com.ss.android.ugc.aweme.simkit.d.a();
        l.a((Object) a6, "");
        ISimKitConfig b7 = a6.b();
        l.a((Object) b7, "");
        ICommonConfig commonConfig4 = b7.getCommonConfig();
        l.a((Object) commonConfig4, "");
        return new com.ss.android.ugc.playerkit.videoview.d.b(arrayList, (long) commonConfig4.getDefaultCDNTimeoutTime());
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final g createSubUrlProcessor() {
        g createSubUrlProcessor = this.f133494a.createSubUrlProcessor();
        if (createSubUrlProcessor != null) {
            return createSubUrlProcessor;
        }
        ArrayList arrayList = new ArrayList();
        com.ss.android.ugc.aweme.simkit.c a2 = com.ss.android.ugc.aweme.simkit.d.a();
        l.a((Object) a2, "");
        ISimKitConfig b2 = a2.b();
        l.a((Object) b2, "");
        ICommonConfig commonConfig = b2.getCommonConfig();
        l.a((Object) commonConfig, "");
        if (commonConfig.getVideoUrlHooks() != null) {
            com.ss.android.ugc.aweme.simkit.c a3 = com.ss.android.ugc.aweme.simkit.d.a();
            l.a((Object) a3, "");
            ISimKitConfig b3 = a3.b();
            l.a((Object) b3, "");
            ICommonConfig commonConfig2 = b3.getCommonConfig();
            l.a((Object) commonConfig2, "");
            List<n> videoUrlHooks = commonConfig2.getVideoUrlHooks();
            l.a((Object) videoUrlHooks, "");
            arrayList.addAll(videoUrlHooks);
        }
        com.ss.android.ugc.aweme.simkit.c a4 = com.ss.android.ugc.aweme.simkit.d.a();
        l.a((Object) a4, "");
        ISimKitConfig b4 = a4.b();
        l.a((Object) b4, "");
        if (b4.getPreloaderExperiment().PreloadTypeExperiment() == i.a.VideoCache) {
            arrayList.add(new com.ss.android.ugc.aweme.simkit.impl.b.b(s.b()));
        } else {
            com.ss.android.ugc.aweme.video.preload.i b5 = s.b();
            com.ss.android.ugc.aweme.simkit.c a5 = com.ss.android.ugc.aweme.simkit.d.a();
            l.a((Object) a5, "");
            ISimKitConfig b6 = a5.b();
            l.a((Object) b6, "");
            ICommonConfig commonConfig3 = b6.getCommonConfig();
            l.a((Object) commonConfig3, "");
            arrayList.add(new a(b5, commonConfig3.getVideoUrlHookHook()));
        }
        com.ss.android.ugc.aweme.simkit.c a6 = com.ss.android.ugc.aweme.simkit.d.a();
        l.a((Object) a6, "");
        ISimKitConfig b7 = a6.b();
        l.a((Object) b7, "");
        ICommonConfig commonConfig4 = b7.getCommonConfig();
        l.a((Object) commonConfig4, "");
        return new com.ss.android.ugc.playerkit.videoview.d.m(arrayList, (long) commonConfig4.getDefaultCDNTimeoutTime());
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean disableSleepResume(String str) {
        return this.f133494a.disableSleepResume(str);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean enableFileIoOpt(String str) {
        return this.f133494a.enableFileIoOpt(str);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final String getThumbCacheDir(Context context) {
        return this.f133494a.getThumbCacheDir(context);
    }

    public b(ISimPlayerConfig iSimPlayerConfig) {
        l.c(iSimPlayerConfig, "");
        this.f133494a = iSimPlayerConfig;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final u getDashProcessUrlData(String str, boolean z, long j2) {
        int i2;
        u uVar = new u();
        com.ss.android.ugc.aweme.simkit.c a2 = com.ss.android.ugc.aweme.simkit.d.a();
        l.a((Object) a2, "");
        ISimKitConfig b2 = a2.b();
        l.a((Object) b2, "");
        ICommonConfig commonConfig = b2.getCommonConfig();
        l.a((Object) commonConfig, "");
        com.ss.android.ugc.aweme.simkit.api.d superResolutionStrategy = commonConfig.getSuperResolutionStrategy();
        if (!z || superResolutionStrategy == null) {
            i2 = 1;
        } else {
            i2 = superResolutionStrategy.a(str, true, j2, 0, "", 1.0f);
            if (i2 == 100) {
                uVar.f148832i = true;
            }
        }
        Session c2 = com.ss.android.ugc.playerkit.session.a.f148854a.c(str);
        if (c2 != null) {
            if (uVar.f148832i) {
                i2 = 100;
            }
            c2.preSuperResolution = i2;
            c2.isOpenSuperResolution = uVar.f148832i;
        }
        return uVar;
    }
}
