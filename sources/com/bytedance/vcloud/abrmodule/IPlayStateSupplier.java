package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public interface IPlayStateSupplier {
    static {
        Covode.recordClassIndex(28015);
    }

    Map<String, IBufferInfo> getAudioBufferInfo();

    float getAverageDownloadSpeed(int i2, int i3, boolean z);

    int getCurrentDownloadAudioBitrate();

    int getCurrentDownloadAudioSegmentIndex();

    int getCurrentDownloadVideoBitrate();

    int getCurrentDownloadVideoSegmentIndex();

    int getCurrentPlaybackTime();

    float getDownloadSpeed();

    int getLoaderType();

    int getMaxCacheAudioTime();

    int getMaxCacheVideoTime();

    float getNetworkSpeed();

    int getNetworkState();

    float getPlaySpeed();

    int getPlayerAudioCacheTime();

    int getPlayerVideoCacheTime();

    List<? extends ISegmentInfo> getSegmentInfoList(int i2, int i3);

    float getSpeedConfidence();

    Queue<IABRModuleSpeedRecord> getTimelineNetworkSpeed();

    Map<String, IBufferInfo> getVideoBufferInfo();
}
