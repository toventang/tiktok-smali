package org.webrtc;

import com.bytedance.covode.number.Covode;

public interface VideoEncoder {

    public interface Callback {
        static {
            Covode.recordClassIndex(106701);
        }

        void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo);
    }

    public static class CodecSpecificInfo {
        static {
            Covode.recordClassIndex(106702);
        }
    }

    static {
        Covode.recordClassIndex(106700);
    }

    VideoCodecStatus encode(VideoFrame videoFrame, boolean z);

    VideoCodecStatus initEncode(Settings settings, Callback callback);

    VideoCodecStatus release();

    VideoCodecStatus requestKeyFrame();

    VideoCodecStatus setRateAllocation(int i2, int i3);

    public static class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();
        public final Integer high;
        public final Integer low;
        public final boolean on;

        private ScalingSettings() {
        }

        static {
            Covode.recordClassIndex(106704);
        }

        public String toString() {
            if (this.on) {
                return "[ " + this.low + ", " + this.high + " ]";
            }
            return "OFF";
        }

        public ScalingSettings(boolean z) {
            this.on = z;
        }

        public ScalingSettings(int i2, int i3) {
            this.on = true;
            this.low = Integer.valueOf(i2);
            this.high = Integer.valueOf(i3);
        }

        public ScalingSettings(boolean z, int i2, int i3) {
            this.on = z;
            this.low = Integer.valueOf(i2);
            this.high = Integer.valueOf(i3);
        }
    }

    public enum ScaleMode {
        AUTO(0),
        STRETCH(1),
        FIT_WITH_CROPPING(2),
        FIT_WITH_FILLING(3);
        
        private int value;

        static {
            Covode.recordClassIndex(106703);
        }

        static ScaleMode fromValue(int i2) {
            if (i2 == 0) {
                return AUTO;
            }
            if (i2 == 1) {
                return STRETCH;
            }
            if (i2 == 2) {
                return FIT_WITH_CROPPING;
            }
            if (i2 != 3) {
                return AUTO;
            }
            return FIT_WITH_FILLING;
        }

        private ScaleMode(int i2) {
            this.value = i2;
        }
    }

    public static class Settings {
        public final int height;
        public final int matrixId;
        public final int maxQp;
        public final int minQp;
        public final int primaryId;
        public final int rangeId;
        public final ScaleMode scaleMode;
        public final int targetBps;
        public final int targetFps;
        public final int temporalLayerNum;
        public final int transferId;
        public final int width;

        static {
            Covode.recordClassIndex(106705);
        }

        public Settings(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
            this.width = i2;
            this.height = i3;
            this.scaleMode = ScaleMode.fromValue(i4);
            this.targetBps = i5;
            this.targetFps = i6;
            this.primaryId = i7;
            this.transferId = i8;
            this.matrixId = i9;
            this.rangeId = i10;
            this.maxQp = i11;
            this.minQp = i12;
            this.temporalLayerNum = i13;
        }
    }
}
