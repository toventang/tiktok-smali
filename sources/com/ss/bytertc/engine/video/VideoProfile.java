package com.ss.bytertc.engine.video;

import android.util.SparseArray;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.VideoStreamDescription;
import com.ss.bytertc.engine.data.RTCData;

public class VideoProfile {
    private static SparseArray<VideoPreset> sVideoProfileMap;

    public static SparseArray<VideoPreset> getsVideoProfileMap() {
        return sVideoProfileMap;
    }

    public static VideoPreset getVideoVideoPreset() {
        VideoStreamDescription[] videoStreamDescriptions = RTCData.instance().getVideoStreamDescriptions();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (VideoStreamDescription videoStreamDescription : videoStreamDescriptions) {
            if (((Integer) videoStreamDescription.videoSize.first).intValue() > i2) {
                i2 = ((Integer) videoStreamDescription.videoSize.first).intValue();
            }
            if (((Integer) videoStreamDescription.videoSize.second).intValue() > i3) {
                i3 = ((Integer) videoStreamDescription.videoSize.second).intValue();
            }
            if (videoStreamDescription.frameRate > i4) {
                i4 = videoStreamDescription.frameRate;
            }
            if (videoStreamDescription.maxKbps > i5) {
                i5 = videoStreamDescription.maxKbps;
            }
        }
        return new VideoPreset(i2, i3, i4, i5);
    }

    static {
        Covode.recordClassIndex(101087);
        SparseArray<VideoPreset> sparseArray = new SparseArray<>();
        sVideoProfileMap = sparseArray;
        sparseArray.put(0, new VideoPreset(160, 120, 15, 65));
        sVideoProfileMap.put(2, new VideoPreset(120, 120, 15, 50));
        sVideoProfileMap.put(10, new VideoPreset(320, LiveFeedRefreshTimeSetting.DEFAULT, 15, 140));
        sVideoProfileMap.put(12, new VideoPreset(LiveFeedRefreshTimeSetting.DEFAULT, LiveFeedRefreshTimeSetting.DEFAULT, 15, 100));
        sVideoProfileMap.put(13, new VideoPreset(240, LiveFeedRefreshTimeSetting.DEFAULT, 15, 120));
        sVideoProfileMap.put(14, new VideoPreset(240, LiveFeedRefreshTimeSetting.DEFAULT, 15, 240));
        sVideoProfileMap.put(20, new VideoPreset(320, 240, 15, 200));
        sVideoProfileMap.put(21, new VideoPreset(320, 240, 15, 360));
        sVideoProfileMap.put(22, new VideoPreset(240, 240, 15, 140));
        sVideoProfileMap.put(23, new VideoPreset(424, 240, 15, 220));
        sVideoProfileMap.put(30, new VideoPreset(640, 360, 15, 600));
        sVideoProfileMap.put(32, new VideoPreset(360, 360, 15, 260));
        sVideoProfileMap.put(33, new VideoPreset(640, 360, 30, 600));
        sVideoProfileMap.put(34, new VideoPreset(640, 360, 15, 800));
        sVideoProfileMap.put(35, new VideoPreset(360, 360, 30, 400));
        sVideoProfileMap.put(36, new VideoPreset(480, 360, 15, 320));
        sVideoProfileMap.put(37, new VideoPreset(480, 360, 30, 490));
        sVideoProfileMap.put(40, new VideoPreset(640, 480, 15, 500));
        sVideoProfileMap.put(42, new VideoPreset(480, 480, 15, 400));
        sVideoProfileMap.put(43, new VideoPreset(640, 480, 30, 750));
        sVideoProfileMap.put(45, new VideoPreset(480, 480, 30, 600));
        sVideoProfileMap.put(46, new VideoPreset(848, 480, 15, 1200));
        sVideoProfileMap.put(47, new VideoPreset(848, 480, 30, 800));
        sVideoProfileMap.put(48, new VideoPreset(848, 480, 30, 930));
        sVideoProfileMap.put(50, new VideoPreset(1280, 720, 15, 1130));
        sVideoProfileMap.put(52, new VideoPreset(1280, 720, 30, 1710));
        sVideoProfileMap.put(54, new VideoPreset(960, 720, 15, 910));
        sVideoProfileMap.put(55, new VideoPreset(960, 720, 30, 1380));
    }

    public static VideoPreset getVideoVideoPresetById(int i2) {
        VideoPreset videoPreset = sVideoProfileMap.get(i2);
        if (videoPreset == null) {
            return sVideoProfileMap.get(33);
        }
        return videoPreset;
    }

    public static void addVideoVideoPreset(int i2, VideoPreset videoPreset) {
        sVideoProfileMap.put(i2, videoPreset);
    }
}
