package com.ss.bytertc.engine.video;

import com.bytedance.covode.number.Covode;

public class VideoEncoderConfiguration {
    public VideoDimensions dimensions;
    public FrameRate frameRate;
    public int kBitrate;
    public OrientationMode orientationMode;

    static {
        Covode.recordClassIndex(101084);
    }

    public enum OrientationMode {
        ORIENTATION_MODE_ADAPTIVE(0),
        ORIENTATION_MODE_FIXED_LANDSCAPE(1),
        ORIENTATION_MODE_FIXED_PORTRAIT(2);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(101085);
        }

        private OrientationMode(int i2) {
            this.value = i2;
        }
    }

    public String toString() {
        return "VideoEncoderConfiguration{dimensions=" + this.dimensions + ", frameRate=" + this.frameRate + ", bitrate=" + this.kBitrate + ", orienttationMode=" + this.orientationMode + '}';
    }

    public VideoEncoderConfiguration(VideoDimensions videoDimensions, FrameRate frameRate2, int i2, OrientationMode orientationMode2) {
        this.dimensions = videoDimensions;
        this.frameRate = frameRate2;
        this.kBitrate = i2;
        this.orientationMode = orientationMode2;
    }
}
