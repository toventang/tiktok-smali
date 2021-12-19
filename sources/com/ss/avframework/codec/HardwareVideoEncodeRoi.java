package com.ss.avframework.codec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.buffer.RoiInfo;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.TEBundle;

class HardwareVideoEncodeRoi {
    protected String TAG = "HardwareVideoEncodeRoi";
    private float mRoiBitrateRatio = 1.0f;
    protected int mRoiOn;
    protected int mRoiQP = -6;
    protected boolean mStretchRoi;

    static {
        Covode.recordClassIndex(99754);
    }

    /* access modifiers changed from: package-private */
    public void configureRoi(MediaFormat mediaFormat) {
    }

    /* access modifiers changed from: package-private */
    public void encodeWithRoi(MediaCodec mediaCodec, VideoFrame videoFrame, int i2) {
    }

    /* access modifiers changed from: package-private */
    public float getRoiSettingBitrateRatio() {
        int i2 = this.mRoiOn;
        if (i2 == 1 || i2 == 0) {
            return this.mRoiBitrateRatio;
        }
        return 1.0f;
    }

    static class HisiRoi extends HardwareVideoEncodeRoi {
        private Bundle mBundle;

        static {
            Covode.recordClassIndex(99755);
        }

        HisiRoi(TEBundle tEBundle) {
            super(tEBundle);
        }

        @Override // com.ss.avframework.codec.HardwareVideoEncodeRoi
        public void configureRoi(MediaFormat mediaFormat) {
            HardwareVideoEncodeRoi.super.configureRoi(mediaFormat);
            if (this.mRoiOn == 1) {
                mediaFormat.setInteger("vendor.hisi.hisi-ext-codec-vendor-configure", 1);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.avframework.codec.HardwareVideoEncodeRoi
        public boolean checkSupportRoi(MediaCodec mediaCodec, TEBundle tEBundle) {
            if (!HardwareVideoEncodeRoi.super.checkSupportRoi(mediaCodec, tEBundle)) {
                return false;
            }
            MediaFormat outputFormat = mediaCodec.getOutputFormat();
            if (!outputFormat.containsKey("vendor.hisi.hisi-ext-codec-roi-supported") || outputFormat.getInteger("vendor.hisi.hisi-ext-codec-roi-supported") != 1) {
                this.mRoiOn = -101;
                TEBundle bundle = tEBundle.getBundle("roi_settings");
                if (bundle != null) {
                    bundle.setInt("roi_on", this.mRoiOn);
                    tEBundle.setBundle("roi_settings", bundle);
                }
            }
            if (this.mRoiOn == 1) {
                return true;
            }
            return false;
        }

        @Override // com.ss.avframework.codec.HardwareVideoEncodeRoi
        public void encodeWithRoi(MediaCodec mediaCodec, VideoFrame videoFrame, int i2) {
            int[] stretchedRoi;
            if (this.mRoiOn == 1 && mediaCodec != null && videoFrame != null && videoFrame.getBuffer() != null) {
                if (this.mBundle == null) {
                    Bundle bundle = new Bundle();
                    this.mBundle = bundle;
                    bundle.putInt("vendor.hisi.hisi-ext-codec-roi-0-qp-mode", 0);
                    this.mBundle.putInt("vendor.hisi.hisi-ext-codec-roi-0-qp", this.mRoiQP);
                }
                VideoFrame.Buffer buffer = videoFrame.getBuffer();
                RoiInfo rOIInfo = buffer.getROIInfo();
                int width = buffer.getWidth();
                int height = buffer.getHeight();
                if (rOIInfo == null) {
                    this.mBundle.putLong("vendor.hisi.hisi-ext-codec-roi-0-params", 0);
                    mediaCodec.setParameters(this.mBundle);
                    return;
                }
                int centerPosX = rOIInfo.getCenterPosX() - (rOIInfo.getRoiWidth() / 2);
                int centerPosY = rOIInfo.getCenterPosY() - (rOIInfo.getRoiHeight() / 2);
                int roiWidth = rOIInfo.getRoiWidth() + centerPosX;
                int roiHeight = rOIInfo.getRoiHeight() + centerPosY;
                if (this.mStretchRoi && (stretchedRoi = rOIInfo.getStretchedRoi()) != null && stretchedRoi.length >= 4) {
                    centerPosX = stretchedRoi[0];
                    centerPosY = stretchedRoi[1];
                    roiWidth = stretchedRoi[2];
                    roiHeight = stretchedRoi[3];
                }
                int min = Math.min(Math.max(0, centerPosX), width - 1);
                int min2 = Math.min(Math.max(0, centerPosY), height - 1);
                int min3 = Math.min(roiWidth - min, width - min);
                int min4 = Math.min(roiHeight - min2, height - min2);
                int i3 = width * height;
                if (min3 * min4 > i3 / 5) {
                    double d2 = (double) i3;
                    double d3 = (double) min3;
                    Double.isNaN(d3);
                    double d4 = (double) min4;
                    Double.isNaN(d4);
                    Double.isNaN(d2);
                    double d5 = d2 / ((5.0d * d3) * d4);
                    double sqrt = Math.sqrt(d5);
                    Double.isNaN(d3);
                    int i4 = (int) (sqrt * d3);
                    double sqrt2 = Math.sqrt(d5);
                    Double.isNaN(d4);
                    int i5 = (int) (sqrt2 * d4);
                    min += (min3 - i4) / 2;
                    min2 += (min4 - i5) / 2;
                    min4 = i5;
                    min3 = i4;
                }
                this.mBundle.putLong("vendor.hisi.hisi-ext-codec-roi-0-params", ((long) min) | (((long) min2) << 16) | (((long) min3) << 32) | (((long) min4) << 48));
                mediaCodec.setParameters(this.mBundle);
            }
        }
    }

    static class QcomRoi extends HardwareVideoEncodeRoi {
        private Bundle mBundle;

        static {
            Covode.recordClassIndex(99756);
        }

        public static int com_ss_avframework_codec_HardwareVideoEncodeRoi$QcomRoi_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
            return 0;
        }

        QcomRoi(TEBundle tEBundle) {
            super(tEBundle);
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.avframework.codec.HardwareVideoEncodeRoi
        public void configureRoi(MediaFormat mediaFormat) {
            HardwareVideoEncodeRoi.super.configureRoi(mediaFormat);
            if (this.mRoiOn == 1) {
                mediaFormat.setInteger("bitrate-mode", 1);
                com_ss_avframework_codec_HardwareVideoEncodeRoi$QcomRoi_com_ss_android_ugc_aweme_lancet_LogLancet_i(this.TAG, "Set bitrate mode: VBR");
                mediaFormat.setString("vendor.qti-ext-extradata-enable.types", "roiinfo");
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.avframework.codec.HardwareVideoEncodeRoi
        public boolean checkSupportRoi(MediaCodec mediaCodec, TEBundle tEBundle) {
            boolean z;
            boolean z2;
            if (!HardwareVideoEncodeRoi.super.checkSupportRoi(mediaCodec, tEBundle)) {
                return false;
            }
            MediaFormat outputFormat = mediaCodec.getOutputFormat();
            if ((!outputFormat.containsKey("vendor.qti-ext-enc-roiinfo-rect-mode.enable") || outputFormat.getInteger("vendor.qti-ext-enc-roiinfo-rect-mode.enable") != 0) && (!outputFormat.containsKey("roi-on") || outputFormat.getInteger("roi-on") != 0)) {
                z = false;
            } else {
                z = true;
            }
            if (outputFormat.getString("vendor.qti-ext-extradata-enable.types") == null || !outputFormat.getString("vendor.qti-ext-extradata-enable.types").equals("roiinfo")) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z || !z2) {
                AVLog.logKibana(5, this.TAG, "Roi unsupported: ".concat(String.valueOf(outputFormat)), null);
                this.mRoiOn = -101;
                TEBundle bundle = tEBundle.getBundle("roi_settings");
                if (bundle != null) {
                    bundle.setInt("roi_on", this.mRoiOn);
                    tEBundle.setBundle("roi_settings", bundle);
                }
            }
            if (this.mRoiOn == 1) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.avframework.codec.HardwareVideoEncodeRoi
        public void encodeWithRoi(MediaCodec mediaCodec, VideoFrame videoFrame, int i2) {
            int[] stretchedRoi;
            if (this.mRoiOn == 1 && mediaCodec != null && videoFrame != null && videoFrame.getBuffer() != null) {
                if (this.mBundle == null) {
                    Bundle bundle = new Bundle();
                    this.mBundle = bundle;
                    bundle.putString("vendor.qti-ext-enc-roiinfo.type", "rect");
                }
                this.mBundle.putLong("vendor.qti-ext-enc-roiinfo.timestamp", videoFrame.getTimestampNs() / 1000);
                String str = "0,0-0,0=-6;";
                VideoFrame.Buffer buffer = videoFrame.getBuffer();
                RoiInfo rOIInfo = buffer.getROIInfo();
                int width = buffer.getWidth();
                int height = buffer.getHeight();
                if (rOIInfo == null) {
                    this.mBundle.putString("vendor.qti-ext-enc-roiinfo.rect-payload", str);
                    mediaCodec.setParameters(this.mBundle);
                    return;
                }
                int centerPosX = rOIInfo.getCenterPosX() - (rOIInfo.getRoiWidth() / 2);
                int roiWidth = rOIInfo.getRoiWidth() + centerPosX;
                int centerPosY = rOIInfo.getCenterPosY() - (rOIInfo.getRoiHeight() / 2);
                int roiHeight = rOIInfo.getRoiHeight() + centerPosY;
                if (this.mStretchRoi && (stretchedRoi = rOIInfo.getStretchedRoi()) != null && stretchedRoi.length >= 4) {
                    centerPosX = stretchedRoi[0];
                    centerPosY = stretchedRoi[1];
                    roiWidth = stretchedRoi[2];
                    roiHeight = stretchedRoi[3];
                }
                if (centerPosX + roiWidth + centerPosY + roiHeight > 0) {
                    str = Math.max(0, centerPosY) + "," + Math.max(0, centerPosX) + "-" + Math.min(height - 1, roiHeight) + "," + Math.min(width - 1, roiWidth) + "=" + this.mRoiQP + ";";
                }
                this.mBundle.putString("vendor.qti-ext-enc-roiinfo.rect-payload", str);
                mediaCodec.setParameters(this.mBundle);
            }
        }
    }

    static float getRoiSettingBitrateRatio(TEBundle tEBundle) {
        TEBundle bundle = tEBundle.getBundle("roi_settings");
        if (bundle == null || !bundle.contains("roi_bitrate_ratio")) {
            return 1.0f;
        }
        int i2 = bundle.getInt("roi_on");
        if (i2 == 1 || i2 == 0) {
            return (float) bundle.getDouble("roi_bitrate_ratio");
        }
        return 1.0f;
    }

    HardwareVideoEncodeRoi(TEBundle tEBundle) {
        this.mRoiOn = tEBundle.getInt("roi_on");
        boolean bool = tEBundle.getBool("video_lossless_encode");
        if (this.mRoiOn == 1 && bool) {
            this.mRoiOn = -103;
            tEBundle.setInt("roi_on", -103);
        }
        if (tEBundle.contains("roi_qp") && tEBundle.getInt("roi_qp") != -100) {
            this.mRoiQP = tEBundle.getInt("roi_qp");
        }
        if (tEBundle.contains("roi_bitrate_ratio")) {
            this.mRoiBitrateRatio = (float) tEBundle.getDouble("roi_bitrate_ratio");
        }
        if (tEBundle.contains("roi_stretch")) {
            this.mStretchRoi = tEBundle.getBool("roi_stretch");
        }
        AVLog.ioi(this.TAG, "roi enabled: " + this.mRoiOn + ", roi qp: " + this.mRoiQP + ", bitrate ratio: " + this.mRoiBitrateRatio + ", stretch roi: " + this.mStretchRoi);
    }

    /* access modifiers changed from: package-private */
    public boolean checkSupportRoi(MediaCodec mediaCodec, TEBundle tEBundle) {
        if (this.mRoiOn == 1) {
            return true;
        }
        return false;
    }

    static HardwareVideoEncodeRoi createRoiProcessor(String str, TEBundle tEBundle) {
        HardwareVideoEncodeRoi hardwareVideoEncodeRoi;
        TEBundle bundle = tEBundle.getBundle("roi_settings");
        if (bundle == null || bundle.getInt("roi_on") != 1) {
            return null;
        }
        if (str.startsWith("OMX.qcom.")) {
            hardwareVideoEncodeRoi = new QcomRoi(bundle);
        } else if (str.startsWith("OMX.hisi.")) {
            hardwareVideoEncodeRoi = new HisiRoi(bundle);
        } else {
            bundle.setInt("roi_on", -102);
            hardwareVideoEncodeRoi = null;
        }
        if (bundle.getInt("roi_on") == 1) {
            return hardwareVideoEncodeRoi;
        }
        tEBundle.setBundle("roi_settings", bundle);
        return null;
    }
}
