package com.ss.android.ugc.aweme.video.preload.api.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.b;
import com.ss.android.ugc.aweme.player.sdk.api.g;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.aweme.video.preload.api.a;
import com.ss.android.ugc.aweme.video.preload.api.c;
import com.ss.android.ugc.aweme.video.preload.api.d;
import com.ss.android.ugc.aweme.video.preload.api.e;
import com.ss.android.ugc.aweme.video.preload.api.f;
import com.ss.android.ugc.aweme.video.preload.api.i;
import com.ss.android.ugc.aweme.video.preload.api.j;
import com.ss.android.ugc.playerkit.model.u;
import com.ss.android.ugc.playerkit.videoview.d.h;
import h.f.b.l;

public final class n implements IVideoPreloadConfig {

    /* renamed from: a  reason: collision with root package name */
    public final IVideoPreloadConfig f143621a;

    static {
        Covode.recordClassIndex(93962);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean canPreload() {
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.canPreload();
        }
        return l.f143619a.canPreload();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isDashABREnabled() {
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.isDashABREnabled();
        }
        return l.f143619a.isDashABREnabled();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPlayerPreferchCaption() {
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.isPlayerPreferchCaption();
        }
        return l.f143619a.isPlayerPreferchCaption();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPlayerPreferchTtsAudio() {
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.isPlayerPreferchTtsAudio();
        }
        return l.f143619a.isPlayerPreferchTtsAudio();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPreloadV3Enabled() {
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.isPreloadV3Enabled();
        }
        return l.f143619a.isPreloadV3Enabled();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final int playerPreferchTtsAudioSize() {
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.playerPreferchTtsAudioSize();
        }
        return l.f143619a.playerPreferchTtsAudioSize();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean useSyncPreloadStyle() {
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.useSyncPreloadStyle();
        }
        return l.f143619a.useSyncPreloadStyle();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final h createVideoUrlProcessor() {
        h createVideoUrlProcessor;
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig == null || (createVideoUrlProcessor = iVideoPreloadConfig.createVideoUrlProcessor()) == null) {
            return l.f143619a.createVideoUrlProcessor();
        }
        return createVideoUrlProcessor;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final a getAppLog() {
        a appLog;
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig == null || (appLog = iVideoPreloadConfig.getAppLog()) == null) {
            return l.f143619a.getAppLog();
        }
        return appLog;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final b getBitrateSelectListener() {
        b bitrateSelectListener;
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig == null || (bitrateSelectListener = iVideoPreloadConfig.getBitrateSelectListener()) == null) {
            return l.f143619a.getBitrateSelectListener();
        }
        return bitrateSelectListener;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final com.ss.android.ugc.aweme.video.preload.api.b getCacheHelper() {
        com.ss.android.ugc.aweme.video.preload.api.b cacheHelper;
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig == null || (cacheHelper = iVideoPreloadConfig.getCacheHelper()) == null) {
            return l.f143619a.getCacheHelper();
        }
        return cacheHelper;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IPreloaderExperiment getExperiment() {
        IPreloaderExperiment experiment;
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig == null || (experiment = iVideoPreloadConfig.getExperiment()) == null) {
            return l.f143619a.getExperiment();
        }
        return experiment;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final c getMLServiceSpeedModel() {
        c mLServiceSpeedModel;
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig == null || (mLServiceSpeedModel = iVideoPreloadConfig.getMLServiceSpeedModel()) == null) {
            return l.f143619a.getMLServiceSpeedModel();
        }
        return mLServiceSpeedModel;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final d getMusicService() {
        d musicService;
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig == null || (musicService = iVideoPreloadConfig.getMusicService()) == null) {
            return l.f143619a.getMusicService();
        }
        return musicService;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final g getNetClient() {
        g netClient;
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig == null || (netClient = iVideoPreloadConfig.getNetClient()) == null) {
            return l.f143619a.getNetClient();
        }
        return netClient;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final com.ss.android.ugc.aweme.video.preload.api.g getPlayerCommonParamManager() {
        com.ss.android.ugc.aweme.video.preload.api.g playerCommonParamManager;
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig == null || (playerCommonParamManager = iVideoPreloadConfig.getPlayerCommonParamManager()) == null) {
            return l.f143619a.getPlayerCommonParamManager();
        }
        return playerCommonParamManager;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final f getPlayerEventReportService() {
        f playerEventReportService;
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig == null || (playerEventReportService = iVideoPreloadConfig.getPlayerEventReportService()) == null) {
            return l.f143619a.getPlayerEventReportService();
        }
        return playerEventReportService;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final e getSpeedManager() {
        e speedManager;
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig == null || (speedManager = iVideoPreloadConfig.getSpeedManager()) == null) {
            return l.f143619a.getSpeedManager();
        }
        return speedManager;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final i getStorageManager() {
        i storageManager;
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig == null || (storageManager = iVideoPreloadConfig.getStorageManager()) == null) {
            return l.f143619a.getStorageManager();
        }
        return storageManager;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final j getVideoCachePlugin() {
        j videoCachePlugin;
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig == null || (videoCachePlugin = iVideoPreloadConfig.getVideoCachePlugin()) == null) {
            return l.f143619a.getVideoCachePlugin();
        }
        return videoCachePlugin;
    }

    public n(IVideoPreloadConfig iVideoPreloadConfig) {
        this.f143621a = iVideoPreloadConfig;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final u getSelectedBitrateForColdBoot(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        u selectedBitrateForColdBoot;
        l.c(iVar, "");
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig == null || (selectedBitrateForColdBoot = iVideoPreloadConfig.getSelectedBitrateForColdBoot(iVar)) == null) {
            return l.f143619a.getSelectedBitrateForColdBoot(iVar);
        }
        return selectedBitrateForColdBoot;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final com.ss.android.ugc.aweme.player.sdk.b.b getProperResolution(String str, com.ss.android.ugc.aweme.player.sdk.b.c cVar) {
        com.ss.android.ugc.aweme.player.sdk.b.b properResolution;
        IVideoPreloadConfig iVideoPreloadConfig = this.f143621a;
        if (iVideoPreloadConfig == null || (properResolution = iVideoPreloadConfig.getProperResolution(str, cVar)) == null) {
            return l.f143619a.getProperResolution(str, cVar);
        }
        return properResolution;
    }
}
