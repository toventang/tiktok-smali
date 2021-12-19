package com.lynx.tasm.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.jsbridge.b;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.provider.CanvasProvider;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class JSProxy {

    /* renamed from: a  reason: collision with root package name */
    public long f56538a;

    /* renamed from: b  reason: collision with root package name */
    public long f56539b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<j> f56540c;

    /* renamed from: d  reason: collision with root package name */
    public final ReadWriteLock f56541d = new ReentrantReadWriteLock();

    static {
        Covode.recordClassIndex(35268);
    }

    private native void nativeCallIntersectionObserver(long j2, int i2, int i3, JavaOnlyMap javaOnlyMap);

    private native long nativeCreate(long j2);

    private static native void nativeCreateCanvasAsyncCallback(long j2, int i2, long j3);

    private native void nativeDestroy(long j2);

    static native void nativeEvaluateScript(long j2, String str, byte[] bArr, int i2);

    public static native JSProxy nativeGetProxyById(long j2);

    private static native void nativeRejectDynamicComponentLoad(long j2, String str, int i2, int i3, String str2);

    public native void nativeCallJSFunction(long j2, String str, String str2, JavaOnlyArray javaOnlyArray);

    public final void a() {
        MethodCollector.i(13908);
        CanvasProvider canvasProvider = LynxEnv.b().q;
        if (canvasProvider != null) {
            canvasProvider.onLynxRuntimeDestroy(Long.valueOf(this.f56539b));
        }
        this.f56541d.writeLock().lock();
        nativeDestroy(this.f56538a);
        this.f56538a = 0;
        this.f56541d.writeLock().unlock();
        MethodCollector.o(13908);
    }

    private void setRuntimeId(long j2) {
        this.f56539b = j2;
    }

    public final b a(String str) {
        return new b(str, this);
    }

    public JSProxy(long j2, WeakReference<j> weakReference) {
        MethodCollector.i(13805);
        this.f56540c = weakReference;
        this.f56538a = nativeCreate(j2);
        MethodCollector.o(13805);
    }

    private static boolean ensureHeliumLoaded(long j2, boolean z) {
        CanvasProvider canvasProvider = LynxEnv.b().q;
        if (canvasProvider == null || !canvasProvider.autoLoadNativeCanvasProvider(z)) {
            return false;
        }
        canvasProvider.onEnsureHeliumLoaded(new Long(j2));
        return true;
    }

    public final void a(int i2, long j2) {
        MethodCollector.i(13965);
        this.f56541d.readLock().lock();
        long j3 = this.f56538a;
        if (j3 != 0) {
            nativeCreateCanvasAsyncCallback(j3, i2, j2);
        }
        this.f56541d.readLock().unlock();
        MethodCollector.o(13965);
    }

    public final void a(int i2, int i3, JavaOnlyMap javaOnlyMap) {
        MethodCollector.i(13961);
        this.f56541d.readLock().lock();
        long j2 = this.f56538a;
        if (j2 != 0) {
            nativeCallIntersectionObserver(j2, i2, i3, javaOnlyMap);
        }
        this.f56541d.readLock().unlock();
        MethodCollector.o(13961);
    }

    private static long createCanvas(String str, long j2, boolean z, int i2) {
        MethodCollector.i(13964);
        JSProxy nativeGetProxyById = nativeGetProxyById(j2);
        if (nativeGetProxyById == null) {
            MethodCollector.o(13964);
            return 0;
        }
        CanvasProvider canvasProvider = LynxEnv.b().q;
        if (canvasProvider != null) {
            long createCanvasOnJSThread = canvasProvider.createCanvasOnJSThread(str, new Long(j2), z, nativeGetProxyById, i2);
            MethodCollector.o(13964);
            return createCanvasOnJSThread;
        }
        MethodCollector.o(13964);
        return 0;
    }

    public final void a(String str, int i2, int i3, String str2) {
        MethodCollector.i(13962);
        this.f56541d.readLock().lock();
        long j2 = this.f56538a;
        if (j2 != 0) {
            nativeRejectDynamicComponentLoad(j2, str, i2, i3, str2);
        }
        this.f56541d.readLock().unlock();
        MethodCollector.o(13962);
    }
}
