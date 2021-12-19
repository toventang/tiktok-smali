package com.ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.config.a;
import com.ss.android.ugc.playerkit.model.i;
import java.util.HashMap;
import java.util.Map;

public enum x implements i {
    Normal(true, "prepare_time", "first_frame_time"),
    Local(true, "prepare_time", "first_frame_time"),
    Story(false, "story_prepare_time", "story_first_frame_time");
    

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f144010a;
    String mFirstFrameKey;
    boolean mIsLoop = true;
    boolean mLoop;
    String mPrepareKey;
    String mTag;
    String subTag;
    boolean useSuperResolution;

    public final String getSubTag() {
        return this.subTag;
    }

    public final String getTag() {
        return this.mTag;
    }

    @Override // com.ss.android.ugc.playerkit.model.i
    public final boolean isLoop() {
        return this.mLoop;
    }

    @Override // com.ss.android.ugc.playerkit.model.i
    public final boolean isPlayLoop() {
        return this.mIsLoop;
    }

    public final boolean isUseSuperResolution() {
        return this.useSuperResolution;
    }

    @Override // com.ss.android.ugc.playerkit.model.i
    public final String getFirstFrameKey() {
        if (a.C3820a.f143369a.b().videoBitRateEnabled()) {
            return f144010a.get(this.mFirstFrameKey);
        }
        return this.mFirstFrameKey;
    }

    @Override // com.ss.android.ugc.playerkit.model.i
    public final String getPrepareKey() {
        if (a.C3820a.f143369a.b().videoBitRateEnabled()) {
            return f144010a.get(this.mPrepareKey);
        }
        return this.mPrepareKey;
    }

    static {
        Covode.recordClassIndex(94227);
        HashMap hashMap = new HashMap();
        f144010a = hashMap;
        hashMap.put("prepare_time", "video_bitrate_prepare_time");
        f144010a.put("story_prepare_time", "story_video_bitrate_prepare_time");
        f144010a.put("first_frame_time", "aweme_video_bitrate_first_frame_log");
        f144010a.put("story_first_frame_time", "story_video_bitrate_first_frame_time");
    }

    public final void setLoop(boolean z) {
        this.mIsLoop = z;
    }

    public final void setSubTag(String str) {
        this.subTag = str;
    }

    public final void setTag(String str) {
        this.mTag = str;
    }

    public final void setUseSuperResolution(boolean z) {
        this.useSuperResolution = z;
    }

    private x(boolean z, String str, String str2) {
        this.mLoop = z;
        this.mPrepareKey = str;
        this.mFirstFrameKey = str2;
    }
}
