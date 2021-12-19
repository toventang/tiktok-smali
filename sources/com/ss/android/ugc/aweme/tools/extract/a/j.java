package com.ss.android.ugc.aweme.tools.extract.a;

import com.bytedance.covode.number.Covode;
import h.a.z;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class j implements Serializable {
    private int awemeType = -1;
    private boolean checkAudioFrame;
    private boolean checkImageFrame;
    private boolean checkVideoFrame;
    private String contentType;
    private long endTime;
    private boolean isGreenDuet;
    private List<Integer> photoDurationList = z.INSTANCE;
    private long startTime;
    private List<com.ss.android.ugc.aweme.tools.extract.z> uploadFrameInfoList = new ArrayList();
    private int videoOrigin = -1;
    private int videoType = -1;

    static {
        Covode.recordClassIndex(91498);
    }

    public final int getAwemeType() {
        return this.awemeType;
    }

    public final boolean getCheckAudioFrame() {
        return this.checkAudioFrame;
    }

    public final boolean getCheckImageFrame() {
        return this.checkImageFrame;
    }

    public final boolean getCheckVideoFrame() {
        return this.checkVideoFrame;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final List<Integer> getPhotoDurationList() {
        return this.photoDurationList;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final List<com.ss.android.ugc.aweme.tools.extract.z> getUploadFrameInfoList() {
        return this.uploadFrameInfoList;
    }

    public final int getVideoOrigin() {
        return this.videoOrigin;
    }

    public final int getVideoType() {
        return this.videoType;
    }

    public final boolean isGreenDuet() {
        return this.isGreenDuet;
    }

    public final String toJSONString() {
        int i2;
        int i3;
        try {
            JSONObject jSONObject = new JSONObject();
            int i4 = 0;
            if (this.checkVideoFrame) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("video_check", i2);
            if (this.checkAudioFrame) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("audio_check", i3);
            if (!this.photoDurationList.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<T> it = this.photoDurationList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().intValue());
                }
                jSONObject.put("photo_time", jSONArray.toString());
            }
            jSONObject.put("video_type", this.videoType);
            jSONObject.put("content_type", this.contentType);
            jSONObject.put("origin", this.videoOrigin);
            jSONObject.put("aweme_type", this.awemeType);
            if (this.isGreenDuet) {
                i4 = 1;
            }
            jSONObject.put("is_greenscreen_duet", i4);
            return jSONObject.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final void setAwemeType(int i2) {
        this.awemeType = i2;
    }

    public final void setCheckAudioFrame(boolean z) {
        this.checkAudioFrame = z;
    }

    public final void setCheckImageFrame(boolean z) {
        this.checkImageFrame = z;
    }

    public final void setCheckVideoFrame(boolean z) {
        this.checkVideoFrame = z;
    }

    public final void setContentType(String str) {
        this.contentType = str;
    }

    public final void setEndTime(long j2) {
        this.endTime = j2;
    }

    public final void setGreenDuet(boolean z) {
        this.isGreenDuet = z;
    }

    public final void setStartTime(long j2) {
        this.startTime = j2;
    }

    public final void setVideoOrigin(int i2) {
        this.videoOrigin = i2;
    }

    public final void setVideoType(int i2) {
        this.videoType = i2;
    }

    public final void setPhotoDurationList(List<Integer> list) {
        l.d(list, "");
        this.photoDurationList = list;
    }

    public final void setUploadFrameInfoList(List<com.ss.android.ugc.aweme.tools.extract.z> list) {
        l.d(list, "");
        this.uploadFrameInfoList = list;
    }
}
