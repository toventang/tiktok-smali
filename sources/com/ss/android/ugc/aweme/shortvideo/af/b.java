package com.ss.android.ugc.aweme.shortvideo.af;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.io.InputStream;

public final class b {
    static {
        Covode.recordClassIndex(82077);
    }

    public static boolean a(String str) {
        File externalFilesDir = i.f115645a.getExternalFilesDir(null);
        File filesDir = i.f115645a.getFilesDir();
        if (externalFilesDir != null && str.startsWith(externalFilesDir.getAbsolutePath())) {
            return true;
        }
        if (filesDir == null || !str.startsWith(filesDir.getAbsolutePath())) {
            return false;
        }
        return true;
    }

    public static int[] b(String str) {
        int[] iArr = new int[6];
        if (str == null) {
            iArr[0] = 1;
            return iArr;
        }
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
        if (videoFileInfo == null) {
            iArr[0] = 1;
        } else {
            iArr[0] = 0;
            iArr[1] = videoFileInfo.duration;
            if (videoFileInfo.rotation == 90 || videoFileInfo.rotation == 270) {
                iArr[2] = videoFileInfo.height;
                iArr[3] = videoFileInfo.width;
            } else {
                iArr[2] = videoFileInfo.width;
                iArr[3] = videoFileInfo.height;
            }
            iArr[4] = 80;
            iArr[5] = (videoFileInfo.height * iArr[4]) / videoFileInfo.width;
        }
        return iArr;
    }

    public static boolean a(String str, Context context) {
        if (str == null || a(str)) {
            return e.b(str);
        }
        return a(context, Uri.parse(str));
    }

    public static boolean a(Context context, Uri uri) {
        MethodCollector.i(11305);
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                openInputStream.close();
                MethodCollector.o(11305);
                return true;
            }
            MethodCollector.o(11305);
            return false;
        } catch (Exception e2) {
            q.b("media uri legal error: " + e2.toString());
            MethodCollector.o(11305);
            return false;
        }
    }
}
