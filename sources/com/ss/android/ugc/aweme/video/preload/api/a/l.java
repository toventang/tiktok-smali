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

public final class l implements IVideoPreloadConfig {

    /* renamed from: a  reason: collision with root package name */
    public static final l f143619a = new l();

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean canPreload() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final e getSpeedManager() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isDashABREnabled() {
        return false;
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
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final int playerPreferchTtsAudioSize() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean useSyncPreloadStyle() {
        return false;
    }

    private l() {
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final h createVideoUrlProcessor() {
        return m.f143620a;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final a getAppLog() {
        return a.f143609a;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final b getBitrateSelectListener() {
        return b.f143610a;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final com.ss.android.ugc.aweme.video.preload.api.b getCacheHelper() {
        return c.f143611a;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final c getMLServiceSpeedModel() {
        return d.f143612a;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final d getMusicService() {
        return e.f143613a;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final g getNetClient() {
        return f.f143614a;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final com.ss.android.ugc.aweme.video.preload.api.g getPlayerCommonParamManager() {
        return h.f143616a;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final f getPlayerEventReportService() {
        return g.f143615a;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final i getStorageManager() {
        return j.f143617a;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final j getVideoCachePlugin() {
        return k.f143618a;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IPreloaderExperiment getExperiment() {
        return new i();
    }

    static {
        Covode.recordClassIndex(93960);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final u getSelectedBitrateForColdBoot(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        h.f.b.l.c(iVar, "");
        return new u();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final com.ss.android.ugc.aweme.player.sdk.b.b getProperResolution(String str, com.ss.android.ugc.aweme.player.sdk.b.c cVar) {
        return com.ss.android.ugc.aweme.player.sdk.b.b.Undefine;
    }
}
