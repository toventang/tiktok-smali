package com.ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;

public class TEEffectUtils {

    public interface ImageListener {
        static {
            Covode.recordClassIndex(37717);
        }

        void onData(int[] iArr, int i2, int i3, int i4);
    }

    public interface QrImageListener {
        static {
            Covode.recordClassIndex(37718);
        }

        void onData(int[] iArr, int i2, int i3, int i4);
    }

    public static native String getAudioAECModelName();

    public static native String getEffectVersion();

    public static String getTaintSceneDetectModelName() {
        return "lens_taint_scene_detect";
    }

    private static native int nativeGetQREncodedData(String str, int[] iArr, ImageListener imageListener);

    private static native int nativeGetQREncodedDataWithWH(String str, int i2, int i3, int[] iArr, QrImageListener qrImageListener);

    static {
        Covode.recordClassIndex(37716);
        d.a();
    }

    public static int getQREncodedData(String str, Map<Integer, Integer> map, ImageListener imageListener) {
        int[] iArr;
        MethodCollector.i(972);
        if (map != null) {
            iArr = new int[(map.size() * 2)];
            int i2 = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                iArr[i2] = entry.getKey().intValue();
                iArr[i2 + 1] = entry.getValue().intValue();
                i2 += 2;
            }
        } else {
            iArr = null;
        }
        int nativeGetQREncodedData = nativeGetQREncodedData(str, iArr, imageListener);
        MethodCollector.o(972);
        return nativeGetQREncodedData;
    }

    public static int getQREncodedData(String str, int i2, int i3, Map<Integer, Integer> map, QrImageListener qrImageListener) {
        int[] iArr;
        MethodCollector.i(999);
        if (map != null) {
            iArr = new int[(map.size() * 2)];
            int i4 = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                iArr[i4] = entry.getKey().intValue();
                iArr[i4 + 1] = entry.getValue().intValue();
                i4 += 2;
            }
        } else {
            iArr = null;
        }
        int nativeGetQREncodedDataWithWH = nativeGetQREncodedDataWithWH(str, i2, i3, iArr, qrImageListener);
        MethodCollector.o(999);
        return nativeGetQREncodedDataWithWH;
    }
}
