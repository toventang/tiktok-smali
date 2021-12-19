package com.ss.avframework.codec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.utils.AVLog;
import java.util.Arrays;
import java.util.List;

class MediaCodecUtils {
    static final String ByteVC1Mime = "video/hevc";
    static final int[] DECODER_COLOR_FORMATS = {19, 21, 2141391872, 2141391873, 2141391874, 2141391875, 2141391876};
    static final int[] ENCODER_COLOR_FORMATS = {19, 21, 2141391872, 2141391876};
    private static final List<String> H264_HW_EXCEPTION_MODELS = Arrays.asList("SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4");
    static final int[] TEXTURE_COLOR_FORMATS = {2130708361};

    private MediaCodecUtils() {
    }

    static {
        Covode.recordClassIndex(99765);
    }

    public static MediaCodecInfo findCodecForType(String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            return getMediaCodecInfo21(str);
        }
        return getMediaCodecInfo(str);
    }

    private static MediaCodecInfo getMediaCodecInfo(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (checkMediaCodecInfo(str, codecInfoAt)) {
                return codecInfoAt;
            }
        }
        return null;
    }

    private static MediaCodecInfo getMediaCodecInfo21(String str) {
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        if (!(codecInfos == null || codecInfos.length == 0)) {
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (checkMediaCodecInfo(str, mediaCodecInfo)) {
                    return mediaCodecInfo;
                }
            }
        }
        return null;
    }

    private static boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        if (H264_HW_EXCEPTION_MODELS.contains(Build.MODEL)) {
            return false;
        }
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.")) {
            int i2 = Build.VERSION.SDK_INT;
            return true;
        } else if (name.startsWith("OMX.Exynos.") && Build.VERSION.SDK_INT >= 21) {
            return true;
        } else {
            if (name.startsWith("OMX.MTK.")) {
                int i3 = Build.VERSION.SDK_INT;
                return true;
            } else if (name.startsWith("OMX.hisi.") && Build.VERSION.SDK_INT >= 21) {
                return true;
            } else {
                if (name.startsWith("OMX.rk.")) {
                    int i4 = Build.VERSION.SDK_INT;
                    return true;
                } else if (name.startsWith("c2.qti.") && Build.VERSION.SDK_INT >= 29) {
                    return true;
                } else {
                    if (!name.startsWith("c2.mtk.") || Build.VERSION.SDK_INT < 29) {
                        return false;
                    }
                    return true;
                }
            }
        }
    }

    static boolean codecSupportsType(MediaCodecInfo mediaCodecInfo, String str) {
        for (String str2 : mediaCodecInfo.getSupportedTypes()) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, String str) {
        if (str.equalsIgnoreCase("video/avc") || str.equalsIgnoreCase(ByteVC1Mime)) {
            return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
        }
        return false;
    }

    private static boolean checkMediaCodecInfo(String str, MediaCodecInfo mediaCodecInfo) {
        if (mediaCodecInfo != null && mediaCodecInfo.isEncoder()) {
            String name = mediaCodecInfo.getName();
            AVLog.d("MediaCodecUtils", "MediaCodecInfo name = ".concat(String.valueOf(name)));
            if (name.startsWith("OMX.google.") || name.startsWith("OMX.Nvidia.") || name.equals("OMX.TI.DUCATI1.VIDEO.H264E") || !codecSupportsType(mediaCodecInfo, str)) {
                return false;
            }
            if (!isHardwareSupportedInCurrentSdk(mediaCodecInfo, str)) {
                AVLog.ioi("MediaCodecUtils", "skip codec " + name + " | " + str);
                return false;
            }
            AVLog.ioi("MediaCodecUtils", "find codec " + name + " | " + str);
            return true;
        }
        return false;
    }

    static Integer selectColorFormat(int[] iArr, MediaCodecInfo.CodecCapabilities codecCapabilities, String str) {
        if (iArr == ENCODER_COLOR_FORMATS && str.startsWith("OMX.hisi.")) {
            return 21;
        }
        for (int i2 : iArr) {
            int[] iArr2 = codecCapabilities.colorFormats;
            for (int i3 : iArr2) {
                if (i3 == i2) {
                    return Integer.valueOf(i3);
                }
            }
        }
        return null;
    }
}
