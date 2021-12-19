package com.ss.android.ugc.aweme.video.config;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.b;
import com.ss.android.ugc.aweme.player.sdk.api.d;
import com.ss.android.ugc.aweme.player.sdk.b.c;
import com.ss.android.ugc.playerkit.model.m;
import com.ss.android.ugc.playerkit.model.u;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import com.ss.android.ugc.playerkit.videoview.d.f;
import com.ss.android.ugc.playerkit.videoview.d.g;
import com.ss.android.ugc.playerkit.videoview.d.h;
import org.json.JSONObject;

public interface ISimPlayerConfig {

    public interface a {
        static {
            Covode.recordClassIndex(93823);
        }
    }

    static {
        Covode.recordClassIndex(93821);
    }

    f createAudioUrlProcessor();

    g createSubUrlProcessor();

    h createVideoUrlProcessor();

    boolean disableSleepResume(String str);

    void downloadFile(String str, String str2, String str3, String str4);

    boolean enableByteVc1FailCheckCountPolicy();

    boolean enableFileIoOpt(String str);

    boolean enableForceUseH264CheckPolicy();

    boolean enableForceUseH264Global();

    int getAverageSpeedInKBps();

    b getBitrateSelectListener();

    d getBitrateSelector();

    u getDashProcessUrlData(String str, boolean z, long j2);

    com.ss.android.ugc.aweme.player.sdk.c.d getISimPlayerPlaySessionConfig(boolean z);

    m getPlayerConfig(m.e eVar, boolean z, boolean z2);

    int getPlayerType();

    com.ss.android.ugc.aweme.player.sdk.b.b getProperResolution(String str, c cVar);

    String getThumbCacheDir(Context context);

    i getVideoPlayAddr(com.ss.android.ugc.playerkit.simapicommon.a.h hVar, m.e eVar);

    boolean isCache(i iVar);

    boolean isHttpsVideoUrlModel(i iVar);

    boolean isPlayerPreferchCaption();

    boolean isPlayerPreferchTtsAudio();

    boolean isPluginApplied();

    void onRecordFirstFrameTime(String str, long j2, String str2, boolean z, boolean z2);

    void onRecordPrepareTime(String str, long j2, String str2, boolean z, boolean z2);

    void recordMiscLog(Context context, String str, JSONObject jSONObject);
}
