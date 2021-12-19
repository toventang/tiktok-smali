package com.ttnet.org.chromium.base;

import android.content.res.AssetFileDescriptor;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;

public class ApkAssets {
    static {
        Covode.recordClassIndex(103239);
    }

    public static long[] open(String str) {
        MethodCollector.i(13856);
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = c.f155223a.getAssets().openNonAssetFd(str);
            long[] jArr = {(long) assetFileDescriptor.getParcelFileDescriptor().detachFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength()};
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
            MethodCollector.o(13856);
            return jArr;
        } catch (IOException e2) {
            if (!e2.getMessage().equals("")) {
                e2.getMessage().equals(str);
            }
            long[] jArr2 = {-1, -1, -1};
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused2) {
                }
            }
            MethodCollector.o(13856);
            return jArr2;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            MethodCollector.o(13856);
            throw th;
        }
    }
}
