package com.bef.effectsdk.view;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import java.util.Arrays;
import java.util.List;

public class ViewControllerInterface {
    private static final List<String> list;

    public interface NativeMessageListener {
        static {
            Covode.recordClassIndex(2923);
        }

        int nativeOnMsgReceived(long j2, long j3, long j4, String str);
    }

    private static native int nativeAddMessageListener(long j2, NativeMessageListener nativeMessageListener);

    private static native int nativeAttachEffect(long j2, long j3);

    private static native void nativeCreateHandle(long[] jArr);

    private static native void nativeCreateHandle(long[] jArr, int i2);

    private static native int nativeCreateTexture(int i2, int i3, int i4, int i5, int i6);

    private static native int nativeDeleteTexture(int i2);

    private static native int nativeDestroy(long j2);

    private static native int nativeInit(long j2, int i2, int i3);

    private static native int nativePostMessage(long j2, long j3, long j4, long j5, String str);

    private static native int nativeProcess(long j2, int i2, int i3, int i4, float[] fArr, float[] fArr2, double d2);

    private static native int nativeRemoveMessageListener(long j2, NativeMessageListener nativeMessageListener);

    private static native int nativeSetRenderCacheData(long j2, String str, String str2);

    private static native int nativeSetRenderCacheTexture(long j2, String str, String str2);

    private static native int nativeSetRenderCacheTextureWithBuffer(long j2, String str, byte[] bArr, int i2, int i3);

    private static native int nativeSetResourceFinder(long j2, long j3, long j4);

    private static native int nativeSetStickerPath(long j2, String str);

    private static native int nativeTouchEvent(long j2, int i2, int[] iArr, float[] fArr, float[] fArr2, int i3);

    static {
        Covode.recordClassIndex(2922);
        List<String> asList = Arrays.asList("effect");
        list = asList;
        try {
            for (String str : asList) {
                com_bef_effectsdk_view_ViewControllerInterface_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
            }
        } catch (Throwable unused) {
        }
    }

    public static void com_bef_effectsdk_view_ViewControllerInterface_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public static void createHandle(long[] jArr) {
        MethodCollector.i(1234);
        nativeCreateHandle(jArr, 0);
        MethodCollector.o(1234);
    }

    public static int deleteTexture(int i2) {
        MethodCollector.i(1252);
        int nativeDeleteTexture = nativeDeleteTexture(i2);
        MethodCollector.o(1252);
        return nativeDeleteTexture;
    }

    public static int destroy(long j2) {
        MethodCollector.i(1240);
        int nativeDestroy = nativeDestroy(j2);
        MethodCollector.o(1240);
        return nativeDestroy;
    }

    public static int addMessageListener(long j2, NativeMessageListener nativeMessageListener) {
        MethodCollector.i(1249);
        int nativeAddMessageListener = nativeAddMessageListener(j2, nativeMessageListener);
        MethodCollector.o(1249);
        return nativeAddMessageListener;
    }

    public static int attachEffect(long j2, long j3) {
        MethodCollector.i(1237);
        int nativeAttachEffect = nativeAttachEffect(j2, j3);
        MethodCollector.o(1237);
        return nativeAttachEffect;
    }

    public static int removeMessageListener(long j2, NativeMessageListener nativeMessageListener) {
        MethodCollector.i(1250);
        int nativeRemoveMessageListener = nativeRemoveMessageListener(j2, nativeMessageListener);
        MethodCollector.o(1250);
        return nativeRemoveMessageListener;
    }

    public static int setStickerPath(long j2, String str) {
        MethodCollector.i(1238);
        int nativeSetStickerPath = nativeSetStickerPath(j2, str);
        MethodCollector.o(1238);
        return nativeSetStickerPath;
    }

    public static void createHandle(long[] jArr, int i2) {
        MethodCollector.i(1235);
        nativeCreateHandle(jArr, i2);
        MethodCollector.o(1235);
    }

    public static int init(long j2, int i2, int i3) {
        MethodCollector.i(1236);
        int nativeInit = nativeInit(j2, i2, i3);
        MethodCollector.o(1236);
        return nativeInit;
    }

    public static int setRenderCacheData(long j2, String str, String str2) {
        MethodCollector.i(1254);
        int nativeSetRenderCacheData = nativeSetRenderCacheData(j2, str, str2);
        MethodCollector.o(1254);
        return nativeSetRenderCacheData;
    }

    public static int setRenderCacheTexture(long j2, String str, String str2) {
        MethodCollector.i(1255);
        int nativeSetRenderCacheTexture = nativeSetRenderCacheTexture(j2, str, str2);
        MethodCollector.o(1255);
        return nativeSetRenderCacheTexture;
    }

    public static int setResourceFinder(long j2, long j3, long j4) {
        MethodCollector.i(1257);
        int nativeSetResourceFinder = nativeSetResourceFinder(j2, j3, j4);
        MethodCollector.o(1257);
        return nativeSetResourceFinder;
    }

    public static int touchBeginEvent(long j2, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.i(1241);
        int nativeTouchEvent = nativeTouchEvent(j2, 0, iArr, fArr, fArr2, iArr.length);
        MethodCollector.o(1241);
        return nativeTouchEvent;
    }

    public static int touchEndEvent(long j2, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.i(1243);
        int nativeTouchEvent = nativeTouchEvent(j2, 1, iArr, fArr, fArr2, iArr.length);
        MethodCollector.o(1243);
        return nativeTouchEvent;
    }

    public static int touchMoveEvent(long j2, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.i(1242);
        int nativeTouchEvent = nativeTouchEvent(j2, 2, iArr, fArr, fArr2, iArr.length);
        MethodCollector.o(1242);
        return nativeTouchEvent;
    }

    public static int createTexture(int i2, int i3, int i4, int i5, int i6) {
        MethodCollector.i(1251);
        int nativeCreateTexture = nativeCreateTexture(i2, i3, i4, i5, i6);
        MethodCollector.o(1251);
        return nativeCreateTexture;
    }

    public static int postMessage(long j2, long j3, long j4, long j5, String str) {
        MethodCollector.i(1248);
        int nativePostMessage = nativePostMessage(j2, j3, j4, j5, str);
        MethodCollector.o(1248);
        return nativePostMessage;
    }

    public static int setRenderCacheTextureWithBuffer(long j2, String str, byte[] bArr, int i2, int i3) {
        MethodCollector.i(1256);
        int nativeSetRenderCacheTextureWithBuffer = nativeSetRenderCacheTextureWithBuffer(j2, str, bArr, i2, i3);
        MethodCollector.o(1256);
        return nativeSetRenderCacheTextureWithBuffer;
    }

    public static int touchBeginEvent(long j2, int[] iArr, float[] fArr, float[] fArr2, int i2) {
        MethodCollector.i(1244);
        int nativeTouchEvent = nativeTouchEvent(j2, 0, iArr, fArr, fArr2, i2);
        MethodCollector.o(1244);
        return nativeTouchEvent;
    }

    public static int touchEndEvent(long j2, int[] iArr, float[] fArr, float[] fArr2, int i2) {
        MethodCollector.i(1247);
        int nativeTouchEvent = nativeTouchEvent(j2, 1, iArr, fArr, fArr2, i2);
        MethodCollector.o(1247);
        return nativeTouchEvent;
    }

    public static int touchMoveEvent(long j2, int[] iArr, float[] fArr, float[] fArr2, int i2) {
        MethodCollector.i(1245);
        int nativeTouchEvent = nativeTouchEvent(j2, 2, iArr, fArr, fArr2, i2);
        MethodCollector.o(1245);
        return nativeTouchEvent;
    }

    public static int processFrame(long j2, int i2, int i3, int i4, float[] fArr, float[] fArr2, double d2) {
        MethodCollector.i(1239);
        int nativeProcess = nativeProcess(j2, i2, i3, i4, fArr, fArr2, d2);
        MethodCollector.o(1239);
        return nativeProcess;
    }
}
