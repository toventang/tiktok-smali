package org.webrtc;

import com.bytedance.covode.number.Covode;

public interface VideoDecoder {

    public interface Callback {
        static {
            Covode.recordClassIndex(106695);
        }

        void onDecodedFrame(VideoFrame videoFrame);
    }

    static {
        Covode.recordClassIndex(106693);
    }

    long createNativeVideoDecoder();

    VideoCodecStatus decode(EncodedImage encodedImage);

    String getImplementationName();

    boolean getPrefersLateDecoding();

    VideoCodecStatus initDecode(Settings settings, Callback callback);

    VideoCodecStatus release();

    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        static {
            Covode.recordClassIndex(106696);
        }

        public DecodeInfo(boolean z, long j2) {
            this.isMissingFrames = z;
            this.renderTimeMs = j2;
        }
    }

    public static class Settings {
        public final int height;
        public final int numberOfCores;
        public final boolean output_by_dts;
        public final int width;

        static {
            Covode.recordClassIndex(106697);
        }

        public Settings(int i2, int i3, int i4, boolean z) {
            this.numberOfCores = i2;
            this.width = i3;
            this.height = i4;
            this.output_by_dts = z;
        }
    }
}
