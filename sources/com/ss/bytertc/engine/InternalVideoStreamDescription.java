package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.VideoStreamDescription;

public class InternalVideoStreamDescription {
    public VideoEncoderPreference encodePreference = VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
    public int frameRate;
    public int height;
    public int maxKbps;
    public VideoStreamScaleMode scaleMode = VideoStreamScaleMode.VIDEO_STREAM_SCALE_MODE_AUTO;
    public int width;

    static {
        Covode.recordClassIndex(100768);
    }

    public enum VideoCodecMode {
        VIDEO_CODEC_MODE_AUTO(0),
        VIDEO_CODEC_MODE_HARDWARE(1),
        VIDEO_CODEC_MODE_SOFTWARE(2);
        
        private int value;

        public final int getIntValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100770);
        }

        private VideoCodecMode(int i2) {
            this.value = i2;
        }
    }

    public enum VideoCodecType {
        VIDEO_CODEC_TYPE_AUTO(0),
        VIDEO_CODEC_TYPE_H264(1),
        VIDEO_CODEC_TYPE_BYTEVC1(2);
        
        private int value;

        public final int getIntValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100771);
        }

        private VideoCodecType(int i2) {
            this.value = i2;
        }
    }

    public enum VideoEncoderPreference {
        VIDEO_ENCODER_PREFERENCE_DISABLED(0),
        VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE(1),
        VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY(2),
        VIDEO_ENCODER_PREFERENCE_BALANCE(3);
        
        private int value;

        public final int getIntValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100772);
        }

        private VideoEncoderPreference(int i2) {
            this.value = i2;
        }
    }

    public enum VideoStreamScaleMode {
        VIDEO_STREAM_SCALE_MODE_AUTO(0),
        VIDEO_STREAM_SCALE_MODE_STRETCH(1),
        VIDEO_STREAM_SCALE_FIT_WITH_CROPPING(2),
        VIDEO_STREAM_SCALE_FIT_WITH_FILLING(3);
        
        private int value;

        /* access modifiers changed from: package-private */
        public final int getIntValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100773);
        }

        private VideoStreamScaleMode(int i2) {
            this.value = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public VideoEncoderPreference getEncoderPreference() {
        return this.encodePreference;
    }

    /* access modifiers changed from: package-private */
    public int getFrameRate() {
        return this.frameRate;
    }

    /* access modifiers changed from: package-private */
    public int getHeight() {
        return this.height;
    }

    /* access modifiers changed from: package-private */
    public int getMaxKBps() {
        return this.maxKbps;
    }

    /* access modifiers changed from: package-private */
    public VideoStreamScaleMode getScaleMode() {
        return this.scaleMode;
    }

    /* access modifiers changed from: package-private */
    public int getWidth() {
        return this.width;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.bytertc.engine.InternalVideoStreamDescription$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$CodecMode;
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference;
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$ScaleMode;
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$VideoCodecType;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|(2:25|26)|27|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0093 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x009d */
        static {
            /*
            // Method dump skipped, instructions count: 169
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.InternalVideoStreamDescription.AnonymousClass1.<clinit>():void");
        }
    }

    private VideoCodecMode ConvertEnumValue(VideoStreamDescription.CodecMode codecMode) {
        int i2 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$CodecMode[codecMode.ordinal()];
        if (i2 == 1) {
            return VideoCodecMode.VIDEO_CODEC_MODE_AUTO;
        }
        if (i2 == 2) {
            return VideoCodecMode.VIDEO_CODEC_MODE_HARDWARE;
        }
        if (i2 != 3) {
            return VideoCodecMode.VIDEO_CODEC_MODE_AUTO;
        }
        return VideoCodecMode.VIDEO_CODEC_MODE_SOFTWARE;
    }

    public InternalVideoStreamDescription(VideoStreamDescription videoStreamDescription) {
        this.width = ((Integer) videoStreamDescription.videoSize.first).intValue();
        this.height = ((Integer) videoStreamDescription.videoSize.second).intValue();
        this.frameRate = videoStreamDescription.frameRate;
        this.maxKbps = videoStreamDescription.maxKbps;
        this.scaleMode = ConvertEnumValue(videoStreamDescription.scaleMode);
        this.encodePreference = ConvertEnumValue(videoStreamDescription.encodePreference);
    }

    private VideoCodecType ConvertEnumValue(VideoStreamDescription.VideoCodecType videoCodecType) {
        int i2 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$VideoCodecType[videoCodecType.ordinal()];
        if (i2 == 1) {
            return VideoCodecType.VIDEO_CODEC_TYPE_AUTO;
        }
        if (i2 == 2) {
            return VideoCodecType.VIDEO_CODEC_TYPE_H264;
        }
        if (i2 != 3) {
            return VideoCodecType.VIDEO_CODEC_TYPE_AUTO;
        }
        return VideoCodecType.VIDEO_CODEC_TYPE_BYTEVC1;
    }

    private VideoEncoderPreference ConvertEnumValue(VideoStreamDescription.EncoderPreference encoderPreference) {
        VideoEncoderPreference videoEncoderPreference = VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        int i2 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference[encoderPreference.ordinal()];
        if (i2 == 1) {
            return VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        }
        if (i2 == 2) {
            return VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY;
        }
        if (i2 != 3) {
            return videoEncoderPreference;
        }
        return VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_BALANCE;
    }

    private VideoStreamScaleMode ConvertEnumValue(VideoStreamDescription.ScaleMode scaleMode2) {
        int i2 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$ScaleMode[scaleMode2.ordinal()];
        if (i2 == 1) {
            return VideoStreamScaleMode.VIDEO_STREAM_SCALE_MODE_AUTO;
        }
        if (i2 == 2) {
            return VideoStreamScaleMode.VIDEO_STREAM_SCALE_MODE_STRETCH;
        }
        if (i2 == 3) {
            return VideoStreamScaleMode.VIDEO_STREAM_SCALE_FIT_WITH_CROPPING;
        }
        if (i2 != 4) {
            return VideoStreamScaleMode.VIDEO_STREAM_SCALE_MODE_AUTO;
        }
        return VideoStreamScaleMode.VIDEO_STREAM_SCALE_FIT_WITH_FILLING;
    }
}
