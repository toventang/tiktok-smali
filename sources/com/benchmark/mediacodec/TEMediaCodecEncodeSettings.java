package com.benchmark.mediacodec;

import com.bytedance.covode.number.Covode;

public class TEMediaCodecEncodeSettings {
    public int mBitRate;
    public int mBitRateMode;
    public int mChangeFPSIndex;
    public int mColorRange;
    public int mColorStandard;
    public int mColorTransfer;
    public int mEncodeProfile;
    public int mFrameRate;
    public int mHeight;
    public int mIFrameInternal;
    public int mInputColorFormat;
    public String mMimeType;
    public boolean mOffBFrame;
    public int mWidth;

    static {
        Covode.recordClassIndex(3004);
    }

    public int getBitRate() {
        return this.mBitRate;
    }

    public int getBitRateMode() {
        return this.mBitRateMode;
    }

    public int getChangeFPSIndex() {
        return this.mChangeFPSIndex;
    }

    public int getColorRange() {
        return this.mColorRange;
    }

    public int getColorStandard() {
        return this.mColorStandard;
    }

    public int getColorTransfer() {
        return this.mColorTransfer;
    }

    public int getEncodeProfile() {
        return this.mEncodeProfile;
    }

    public int getFrameRate() {
        return this.mFrameRate;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getIFrameInternal() {
        return this.mIFrameInternal;
    }

    public int getInputColorFormat() {
        return this.mInputColorFormat;
    }

    public String getMimeType() {
        return this.mMimeType;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isOffBFrame() {
        return this.mOffBFrame;
    }

    public boolean useSurfaceInput() {
        if (this.mInputColorFormat == 2130708361) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "mimeType: " + this.mMimeType + ", mInputColorFormat: " + this.mInputColorFormat + ", mFrameRate" + this.mFrameRate + ", mIFrameInternal: " + this.mIFrameInternal + ", mBitRate: " + this.mBitRate + ", mBitRateMode: " + this.mBitRateMode + ", mEncodeProfile: " + this.mEncodeProfile + ", width: " + this.mWidth + ", height: " + this.mHeight + ",colorRange: " + this.mColorRange + ", colorStandard: " + this.mColorStandard + ", colorTransfer: " + this.mColorTransfer;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TEMediaCodecEncodeSettings f6207a = new TEMediaCodecEncodeSettings();

        static {
            Covode.recordClassIndex(3005);
        }

        public final a a(int i2) {
            int i3 = 1;
            switch (i2) {
                case 201:
                    i3 = 2;
                    break;
                case 202:
                    i3 = 8;
                    break;
            }
            this.f6207a.mEncodeProfile = i3;
            return this;
        }
    }
}
