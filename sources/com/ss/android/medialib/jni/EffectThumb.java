package com.ss.android.medialib.jni;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.medialib.model.CoverInfo;
import com.ss.android.medialib.player.EffectConfig;
import com.ss.android.ttve.nativePort.d;
import java.util.ArrayList;
import java.util.List;

public class EffectThumb {
    private long handle = nativeCreate();
    private List<CoverInfo> mCovers = new ArrayList();
    private int mMaxSize;
    private float mSpeed;
    private long mTrimIn;
    private long mTrimOut;
    boolean stopped;
    private a thumbListener;

    public interface a {
        static {
            Covode.recordClassIndex(36887);
        }
    }

    private native long nativeCreate();

    private native long nativeGetDuration(long j2);

    private native int nativeInit(long j2, String str);

    private native int nativeRenderVideo(long j2, long[] jArr, EffectConfig effectConfig, int i2, int i3);

    private native void nativeStop(long j2);

    public CoverInfo getThumb() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        stopRender();
        super.finalize();
    }

    static {
        Covode.recordClassIndex(36886);
        d.d();
    }

    public long getDuration() {
        return (long) (((float) (this.mTrimOut - this.mTrimIn)) / this.mSpeed);
    }

    public EffectThumb() {
        MethodCollector.i(4742);
        MethodCollector.o(4742);
    }

    public long getSourceVideoDuration() {
        MethodCollector.i(4759);
        long j2 = this.handle;
        if (j2 == 0) {
            MethodCollector.o(4759);
            return -1;
        }
        long nativeGetDuration = nativeGetDuration(j2);
        MethodCollector.o(4759);
        return nativeGetDuration;
    }

    public synchronized void stopRender() {
        MethodCollector.i(4902);
        long j2 = this.handle;
        if (j2 == 0) {
            MethodCollector.o(4902);
            return;
        }
        this.stopped = true;
        nativeStop(j2);
        this.handle = 0;
        MethodCollector.o(4902);
    }

    public void setThumbListener(a aVar) {
        this.thumbListener = aVar;
    }

    public int init(String str) {
        MethodCollector.i(4748);
        long j2 = this.handle;
        if (j2 == 0) {
            MethodCollector.o(4748);
            return -1;
        }
        int nativeInit = nativeInit(j2, str);
        if (nativeInit >= 0) {
            this.mTrimIn = 0;
            this.mTrimOut = getSourceVideoDuration();
            this.mSpeed = 1.0f;
        }
        MethodCollector.o(4748);
        return nativeInit;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        r2 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.medialib.model.CoverInfo getThumb(int r5) {
        /*
            r4 = this;
            r3 = 4908(0x132c, float:6.878E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            r2 = 0
            if (r5 < 0) goto L_0x0010
            int r0 = r4.mMaxSize
            if (r5 >= r0) goto L_0x0010
            java.util.List<com.ss.android.medialib.model.CoverInfo> r0 = r4.mCovers
            if (r0 != 0) goto L_0x0014
        L_0x0010:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return r2
        L_0x0014:
            boolean r0 = r4.stopped
            if (r0 != 0) goto L_0x004b
            monitor-enter(r4)
            java.util.List<com.ss.android.medialib.model.CoverInfo> r0 = r4.mCovers     // Catch:{ all -> 0x0044 }
            int r0 = r0.size()     // Catch:{ all -> 0x0044 }
            if (r0 > r5) goto L_0x002b
            r0 = 10
            r4.wait(r0)     // Catch:{ InterruptedException -> 0x0027 }
            goto L_0x002b
        L_0x0027:
            r0 = move-exception
            r0.printStackTrace()
        L_0x002b:
            java.util.List<com.ss.android.medialib.model.CoverInfo> r0 = r4.mCovers
            int r0 = r0.size()
            if (r0 > r5) goto L_0x0035
            monitor-exit(r4)
            goto L_0x0014
        L_0x0035:
            java.util.List<com.ss.android.medialib.model.CoverInfo> r0 = r4.mCovers
            java.lang.Object r1 = r0.get(r5)
            com.ss.android.medialib.model.CoverInfo r1 = (com.ss.android.medialib.model.CoverInfo) r1
            java.util.List<com.ss.android.medialib.model.CoverInfo> r0 = r4.mCovers
            r0.set(r5, r2)
            monitor-exit(r4)
            goto L_0x004a
        L_0x0044:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        L_0x004a:
            r2 = r1
        L_0x004b:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.jni.EffectThumb.getThumb(int):com.ss.android.medialib.model.CoverInfo");
    }

    public void onThumb(int[] iArr, int i2, int i3) {
        MethodCollector.i(5000);
        CoverInfo coverInfo = new CoverInfo(i2, i3, iArr);
        synchronized (this) {
            try {
                if (!this.stopped) {
                    this.mCovers.add(coverInfo);
                    notify();
                }
            } finally {
                MethodCollector.o(5000);
            }
        }
    }

    public int renderVideo(long j2, EffectConfig effectConfig, int i2, int i3) {
        MethodCollector.i(4848);
        long j3 = this.handle;
        if (j3 == 0) {
            MethodCollector.o(4848);
            return -1;
        }
        this.mMaxSize = 1;
        int nativeRenderVideo = nativeRenderVideo(j3, new long[]{((long) (((float) j2) * this.mSpeed)) + this.mTrimIn}, effectConfig, i2, i3);
        MethodCollector.o(4848);
        return nativeRenderVideo;
    }

    public int init(String str, long j2, long j3, float f2) {
        MethodCollector.i(4751);
        long j4 = this.handle;
        if (j4 == 0) {
            MethodCollector.o(4751);
            return -1;
        }
        int nativeInit = nativeInit(j4, str);
        if (nativeInit >= 0) {
            this.mTrimIn = j2;
            this.mTrimOut = j3;
            this.mSpeed = f2;
        }
        MethodCollector.o(4751);
        return nativeInit;
    }

    public int renderVideo(long[] jArr, EffectConfig effectConfig, int i2, int i3) {
        MethodCollector.i(4761);
        if (this.handle == 0) {
            MethodCollector.o(4761);
            return -1;
        }
        this.mMaxSize = jArr.length;
        for (int i4 = 0; i4 < jArr.length; i4++) {
            jArr[i4] = ((long) (((float) jArr[i4]) * this.mSpeed)) + this.mTrimIn;
        }
        int nativeRenderVideo = nativeRenderVideo(this.handle, jArr, effectConfig, i2, i3);
        MethodCollector.o(4761);
        return nativeRenderVideo;
    }
}
