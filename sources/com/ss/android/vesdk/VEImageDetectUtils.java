package com.ss.android.vesdk;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.ttve.nativePort.d;
import com.ss.android.vesdk.runtime.VEEffectConfig;
import com.ss.android.vesdk.runtime.VERuntime;
import java.io.File;
import java.util.List;

public class VEImageDetectUtils {
    public static final String TAG = VEImageDetectUtils.class.getSimpleName();
    private IDetectImageEnigmaResultListener mDetectEnigmaResultListener;
    private IDetectImageResultListener mDetectResultListener;
    private IDetectImageResultWithNumListener mDetectResultWithNumListener;
    private boolean mInterruptDetectImageContent = true;
    private long mNativeHandler;

    public interface IDetectImageEnigmaResultListener {
        static {
            Covode.recordClassIndex(99139);
        }

        void onDetectResult(EnigmaResult enigmaResult);
    }

    public interface IDetectImageResultListener {
        static {
            Covode.recordClassIndex(99140);
        }

        void onDetectResult(String str, String str2, String str3, boolean z);
    }

    public interface IDetectImageResultWithNumListener {
        static {
            Covode.recordClassIndex(99141);
        }

        void onDetectResult(String str, String str2, String str3, int i2);
    }

    private native int nativeDestroy(long j2);

    private native int nativeDetectImageContent(long j2, String str, String str2, String[] strArr, int i2, int i3);

    private native int nativeDetectImageEnigma(long j2, String str, int i2, int i3);

    private native long nativeInit(int i2, int i3, String str, String str2, boolean z, String str3);

    static {
        Covode.recordClassIndex(99138);
        d.a();
    }

    public synchronized void stopDetectImagesContentIfNeed() {
        MethodCollector.i(13313);
        this.mInterruptDetectImageContent = true;
        MethodCollector.o(13313);
    }

    public int destroy() {
        MethodCollector.i(13068);
        long j2 = this.mNativeHandler;
        if (j2 == 0) {
            an.c(TAG, "invoke destroy() encounter handler == 0. Consider destroy() has been called already?");
            MethodCollector.o(13068);
            return -1;
        }
        int nativeDestroy = nativeDestroy(j2);
        if (nativeDestroy == 0) {
            this.mNativeHandler = 0;
            an.a(TAG, "NativeHandler destroy succeed.");
        }
        this.mDetectResultListener = null;
        MethodCollector.o(13068);
        return nativeDestroy;
    }

    public int init() {
        MethodCollector.i(12981);
        long nativeInit = nativeInit(0, 0, VERuntime.a.INSTANCE.veRuntime.f151399d.a(), Build.DEVICE, false, VEEffectConfig.getCacheDir());
        if (nativeInit == 0) {
            MethodCollector.o(12981);
            return -1;
        }
        this.mNativeHandler = nativeInit;
        MethodCollector.o(12981);
        return 0;
    }

    public void setDetectImageContentListener(IDetectImageResultListener iDetectImageResultListener) {
        this.mDetectResultListener = iDetectImageResultListener;
    }

    public void setDetectImageContentWithNumListener(IDetectImageResultWithNumListener iDetectImageResultWithNumListener) {
        this.mDetectResultWithNumListener = iDetectImageResultWithNumListener;
    }

    public void setDetectImageEnigmaListener(IDetectImageEnigmaResultListener iDetectImageEnigmaResultListener) {
        this.mDetectEnigmaResultListener = iDetectImageEnigmaResultListener;
    }

    public void onNativeCallback_onDetectImageEnigma(EnigmaResult enigmaResult) {
        IDetectImageEnigmaResultListener iDetectImageEnigmaResultListener = this.mDetectEnigmaResultListener;
        if (iDetectImageEnigmaResultListener == null) {
            an.c(TAG, "Native callback onDetectImageEnigma encounter no listener handle?");
        } else {
            iDetectImageEnigmaResultListener.onDetectResult(enigmaResult);
        }
    }

    public int detectImageEnigma(String str, int i2, int i3) {
        MethodCollector.i(13312);
        if (str.startsWith("content") || new File(str).exists()) {
            an.a(TAG, "detectImageEnigma..., imagePath=" + str + ", maxWidth=" + i2 + ", maxHeight=" + i2);
            int nativeDetectImageEnigma = nativeDetectImageEnigma(this.mNativeHandler, str, i2, i3);
            MethodCollector.o(13312);
            return nativeDetectImageEnigma;
        }
        an.d(TAG, "Illegal argument. file: \"" + str + "\" is not exist.");
        MethodCollector.o(13312);
        return -100;
    }

    public void detectImagesContent(String str, List<String> list, List<String> list2) {
        int i2;
        MethodCollector.i(13244);
        synchronized (this) {
            try {
                this.mInterruptDetectImageContent = false;
            } finally {
                MethodCollector.o(13244);
            }
        }
        if (list2.isEmpty()) {
            an.c(TAG, "Unexpected argument. scanAlgorithmList is empty?");
            MethodCollector.o(13244);
            return;
        }
        String[] strArr = new String[list2.size()];
        list2.toArray(strArr);
        int size = list.size();
        for (i2 = 0; i2 < size && !this.mInterruptDetectImageContent; i2++) {
            String str2 = list.get(i2);
            if (str2.startsWith("content") || new File(str2).exists()) {
                nativeDetectImageContent(this.mNativeHandler, str, list.get(i2), strArr, -1, -1);
            } else {
                an.d(TAG, "Illegal argument. file: \"" + str2 + "\" is not exist.");
            }
        }
    }

    public void onNativeCallback_onDetectImageContent(String str, String str2, String str3, boolean z, int i2) {
        IDetectImageResultListener iDetectImageResultListener = this.mDetectResultListener;
        if (iDetectImageResultListener != null) {
            iDetectImageResultListener.onDetectResult(str, str2, str3, z);
        } else if (this.mDetectResultWithNumListener == null) {
            an.c(TAG, "Native callback onDetectImageContent encounter no listener handle?");
            return;
        }
        IDetectImageResultWithNumListener iDetectImageResultWithNumListener = this.mDetectResultWithNumListener;
        if (iDetectImageResultWithNumListener != null) {
            iDetectImageResultWithNumListener.onDetectResult(str, str2, str3, i2);
        }
    }

    public int detectImageContent(String str, String str2, List<String> list, int i2, int i3) {
        MethodCollector.i(13070);
        if (!str2.startsWith("content") && !new File(str2).exists()) {
            an.d(TAG, "Illegal argument. file: \"" + str2 + "\" is not exist.");
            MethodCollector.o(13070);
            return -100;
        } else if (list.isEmpty()) {
            an.c(TAG, "Unexpected argument. scanAlgorithmList is empty?");
            MethodCollector.o(13070);
            return -100;
        } else {
            an.c(TAG, "detectImageContent... stickerId:" + str + ", imagePath=" + str2 + ", maxWidth=" + i2 + ", maxHeight=" + i2);
            String[] strArr = new String[list.size()];
            list.toArray(strArr);
            int nativeDetectImageContent = nativeDetectImageContent(this.mNativeHandler, str, str2, strArr, i2, i3);
            MethodCollector.o(13070);
            return nativeDetectImageContent;
        }
    }

    public void detectImagesContentWithSize(String str, List<String> list, List<String> list2, int i2, int i3) {
        MethodCollector.i(13164);
        synchronized (this) {
            try {
                this.mInterruptDetectImageContent = false;
            } finally {
                MethodCollector.o(13164);
            }
        }
        if (list2.isEmpty()) {
            an.c(TAG, "Unexpected argument. scanAlgorithmList is empty?");
            MethodCollector.o(13164);
            return;
        }
        String[] strArr = new String[list2.size()];
        list2.toArray(strArr);
        int size = list.size();
        for (int i4 = 0; i4 < size && !this.mInterruptDetectImageContent; i4++) {
            String str2 = list.get(i4);
            if (str2.startsWith("content") || new File(str2).exists()) {
                nativeDetectImageContent(this.mNativeHandler, str, list.get(i4), strArr, i2, i3);
            } else {
                an.d(TAG, "Illegal argument. file: \"" + str2 + "\" is not exist.");
            }
        }
    }
}
