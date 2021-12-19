package com.ss.bytertc.engine.mediaio;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.data.VideoCodecType;
import com.ss.bytertc.engine.data.VideoPictureType;
import com.ss.bytertc.engine.data.VideoRotation;
import java.nio.ByteBuffer;

public class RTCEncodedVideoFrame {
    public final ByteBuffer buffer;
    public int height;
    public long timebaseDen;
    public long timebaseNum;
    public long timestampDts;
    public long timestampPts;
    public long timestampUs;
    public VideoCodecType videoCodecType;
    public VideoPictureType videoPictureType;
    public VideoRotation videoRotation;
    public int width;

    static {
        Covode.recordClassIndex(101010);
    }

    public RTCEncodedVideoFrame(ByteBuffer byteBuffer, long j2, long j3, long j4, long j5, long j6, int i2, int i3, VideoCodecType videoCodecType2, VideoPictureType videoPictureType2, VideoRotation videoRotation2) {
        this.buffer = byteBuffer;
        this.timestampUs = j2;
        this.timestampPts = j3;
        this.timestampDts = j4;
        this.timebaseNum = j5;
        this.timebaseDen = j6;
        this.width = i2;
        this.height = i3;
        this.videoCodecType = videoCodecType2;
        this.videoPictureType = videoPictureType2;
        this.videoRotation = videoRotation2;
    }
}
