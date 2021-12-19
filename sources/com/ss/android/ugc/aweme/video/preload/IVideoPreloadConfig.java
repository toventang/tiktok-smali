package com.ss.android.ugc.aweme.video.preload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.b;
import com.ss.android.ugc.aweme.player.sdk.api.g;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.aweme.video.preload.api.a;
import com.ss.android.ugc.aweme.video.preload.api.c;
import com.ss.android.ugc.aweme.video.preload.api.d;
import com.ss.android.ugc.aweme.video.preload.api.e;
import com.ss.android.ugc.aweme.video.preload.api.f;
import com.ss.android.ugc.aweme.video.preload.api.j;
import com.ss.android.ugc.playerkit.model.u;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import com.ss.android.ugc.playerkit.videoview.d.h;

public interface IVideoPreloadConfig {
    static {
        Covode.recordClassIndex(93894);
    }

    boolean canPreload();

    h createVideoUrlProcessor();

    a getAppLog();

    b getBitrateSelectListener();

    com.ss.android.ugc.aweme.video.preload.api.b getCacheHelper();

    IPreloaderExperiment getExperiment();

    c getMLServiceSpeedModel();

    d getMusicService();

    g getNetClient();

    com.ss.android.ugc.aweme.video.preload.api.g getPlayerCommonParamManager();

    f getPlayerEventReportService();

    com.ss.android.ugc.aweme.player.sdk.b.b getProperResolution(String str, com.ss.android.ugc.aweme.player.sdk.b.c cVar);

    u getSelectedBitrateForColdBoot(i iVar);

    e getSpeedManager();

    com.ss.android.ugc.aweme.video.preload.api.i getStorageManager();

    j getVideoCachePlugin();

    boolean isDashABREnabled();

    boolean isPlayerPreferchCaption();

    boolean isPlayerPreferchTtsAudio();

    boolean isPreloadV3Enabled();

    int playerPreferchTtsAudioSize();

    boolean useSyncPreloadStyle();
}
