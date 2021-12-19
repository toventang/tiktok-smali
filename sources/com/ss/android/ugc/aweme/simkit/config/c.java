package com.ss.android.ugc.aweme.simkit.config;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.g;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.aweme.video.preload.api.a;
import com.ss.android.ugc.aweme.video.preload.api.b;
import com.ss.android.ugc.aweme.video.preload.api.d;
import com.ss.android.ugc.aweme.video.preload.api.e;
import com.ss.android.ugc.aweme.video.preload.api.f;
import com.ss.android.ugc.aweme.video.preload.api.i;
import com.ss.android.ugc.aweme.video.preload.api.j;
import com.ss.android.ugc.playerkit.model.u;
import com.ss.android.ugc.playerkit.videoview.d.h;
import com.ss.android.ugc.playerkit.videoview.d.n;
import h.f.b.l;
import java.util.ArrayList;

public final class c implements IVideoPreloadConfig {

    /* renamed from: a  reason: collision with root package name */
    private final IVideoPreloadConfig f133495a;

    static {
        Covode.recordClassIndex(87321);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean canPreload() {
        return this.f133495a.canPreload();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final a getAppLog() {
        return this.f133495a.getAppLog();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final b getCacheHelper() {
        return this.f133495a.getCacheHelper();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IPreloaderExperiment getExperiment() {
        return this.f133495a.getExperiment();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final com.ss.android.ugc.aweme.video.preload.api.c getMLServiceSpeedModel() {
        return this.f133495a.getMLServiceSpeedModel();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final d getMusicService() {
        return this.f133495a.getMusicService();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final g getNetClient() {
        return this.f133495a.getNetClient();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final com.ss.android.ugc.aweme.video.preload.api.g getPlayerCommonParamManager() {
        return this.f133495a.getPlayerCommonParamManager();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final f getPlayerEventReportService() {
        return this.f133495a.getPlayerEventReportService();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final com.ss.android.ugc.aweme.player.sdk.b.b getProperResolution(String str, com.ss.android.ugc.aweme.player.sdk.b.c cVar) {
        return this.f133495a.getProperResolution(str, cVar);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final e getSpeedManager() {
        return this.f133495a.getSpeedManager();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final i getStorageManager() {
        return this.f133495a.getStorageManager();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final j getVideoCachePlugin() {
        return this.f133495a.getVideoCachePlugin();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isDashABREnabled() {
        return this.f133495a.isDashABREnabled();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPlayerPreferchCaption() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPlayerPreferchTtsAudio() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPreloadV3Enabled() {
        return this.f133495a.isPreloadV3Enabled();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final int playerPreferchTtsAudioSize() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean useSyncPreloadStyle() {
        return this.f133495a.useSyncPreloadStyle();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final h createVideoUrlProcessor() {
        h createVideoUrlProcessor = this.f133495a.createVideoUrlProcessor();
        if (createVideoUrlProcessor != null) {
            return createVideoUrlProcessor;
        }
        return a.a();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final com.ss.android.ugc.aweme.player.sdk.api.b getBitrateSelectListener() {
        com.ss.android.ugc.aweme.player.sdk.api.b bitrateSelectListener = this.f133495a.getBitrateSelectListener();
        l.a((Object) bitrateSelectListener, "");
        return bitrateSelectListener;
    }

    public c(IVideoPreloadConfig iVideoPreloadConfig) {
        l.c(iVideoPreloadConfig, "");
        this.f133495a = iVideoPreloadConfig;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final u getSelectedBitrateForColdBoot(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        l.c(iVar, "");
        l.c(iVar, "");
        return com.ss.android.ugc.playerkit.videoview.d.d.a(iVar, (ArrayList<n>) null);
    }
}
