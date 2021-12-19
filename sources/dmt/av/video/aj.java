package dmt.av.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.vesdk.VEUtils;

public final class aj {
    static {
        Covode.recordClassIndex(104121);
    }

    public static int[] a(String str) {
        int[] iArr = new int[10];
        if (VEUtils.getVideoFileInfo(str, iArr) == 0) {
            return iArr;
        }
        return null;
    }

    public static int c(String str) {
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
        if (videoFileInfo == null) {
            return 0;
        }
        return videoFileInfo.bitrate;
    }

    public static VideoFileInfo b(String str) {
        int[] a2 = a(str);
        if (a2 == null) {
            return null;
        }
        return new VideoFileInfo(a2[0], a2[1], (long) a2[3], a2[7], a2[6], a2[8], a2[9]);
    }
}
