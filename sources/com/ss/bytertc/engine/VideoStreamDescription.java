package com.ss.bytertc.engine;

import android.util.Pair;
import com.bytedance.covode.number.Covode;

public class VideoStreamDescription {
    public EncoderPreference encodePreference = EncoderPreference.MaintainFramerate;
    public int frameRate;
    public int maxKbps;
    public ScaleMode scaleMode = ScaleMode.SCALE_MODE_AUTO;
    public Pair<Integer, Integer> videoSize;

    static {
        Covode.recordClassIndex(100821);
    }

    public enum CodecMode {
        CODEC_MODE_AUTO(0),
        CODEC_MODE_HARDWARE(1),
        CODEC_MODE_SOFTWARE(2);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100822);
        }

        public static CodecMode convertFromInt(int i2) {
            return values()[i2];
        }

        private CodecMode(int i2) {
            this.value = i2;
        }
    }

    public enum EncoderPreference {
        Disabled(0),
        MaintainFramerate(1),
        MaintainQuality(2),
        Balance(3);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100823);
        }

        public static EncoderPreference convertFromInt(int i2) {
            return values()[i2];
        }

        private EncoderPreference(int i2) {
            this.value = i2;
        }
    }

    public enum ScaleMode {
        SCALE_MODE_AUTO(0),
        SCALE_MODE_STRETCH(1),
        SCALE_MODE_FIT_WITH_CROPPING(2),
        SCALE_MODE_FIT_WITH_FILLING(3);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100824);
        }

        public static ScaleMode convertFromInt(int i2) {
            return values()[i2];
        }

        private ScaleMode(int i2) {
            this.value = i2;
        }
    }

    public enum VideoCodecType {
        CODEC_TYPE_AUTO(0),
        CODEC_TYPE_H264(1),
        CODEC_TYPE_BYTEVC1(2);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100825);
        }

        public static VideoCodecType convertFromInt(int i2) {
            return values()[i2];
        }

        private VideoCodecType(int i2) {
            this.value = i2;
        }
    }

    public VideoStreamDescription() {
    }

    public boolean isValid() {
        Pair<Integer, Integer> pair = this.videoSize;
        if (pair == null || ((Integer) pair.first).intValue() <= 0 || ((Integer) this.videoSize.second).intValue() <= 0 || this.frameRate <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "VideoStreamDescription{videoSize=" + this.videoSize + ", frameRate=" + this.frameRate + ", maxKbps=" + this.maxKbps + ", scaleMode=" + this.scaleMode + ", encodePreference=" + this.encodePreference + '}';
    }

    private static VideoStreamDescription create(int i2, int i3, int i4, int i5, int i6) {
        return new VideoStreamDescription(i2, i3, i4, i5, i6);
    }

    public VideoStreamDescription(int i2, int i3, int i4, int i5, int i6) {
        this.videoSize = new Pair<>(Integer.valueOf(i2), Integer.valueOf(i3));
        this.frameRate = i4;
        this.maxKbps = i5;
        this.scaleMode = ScaleMode.convertFromInt(i6);
    }

    public VideoStreamDescription(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.videoSize = new Pair<>(Integer.valueOf(i2), Integer.valueOf(i3));
        this.frameRate = i4;
        this.maxKbps = i5;
        this.scaleMode = ScaleMode.convertFromInt(i6);
        this.encodePreference = EncoderPreference.convertFromInt(i9);
    }
}
