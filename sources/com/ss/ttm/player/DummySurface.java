package com.ss.ttm.player;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class DummySurface extends Surface {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f151944a;

    /* renamed from: b  reason: collision with root package name */
    private final a f151945b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f151946c;

    static {
        Covode.recordClassIndex(101299);
    }

    static class a extends HandlerThread implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        Handler f151947a;

        /* renamed from: b  reason: collision with root package name */
        private e f151948b;

        /* renamed from: c  reason: collision with root package name */
        private Error f151949c;

        /* renamed from: d  reason: collision with root package name */
        private RuntimeException f151950d;

        /* renamed from: e  reason: collision with root package name */
        private DummySurface f151951e;

        static {
            Covode.recordClassIndex(101300);
        }

        public a() {
            super("dummySurface");
        }

        public final DummySurface a() {
            boolean z;
            MethodCollector.i(2711);
            start();
            this.f151947a = new Handler(getLooper(), this);
            this.f151948b = new e(this.f151947a);
            synchronized (this) {
                try {
                    z = false;
                    this.f151947a.obtainMessage(1, 0, 0).sendToTarget();
                    while (this.f151951e == null && this.f151950d == null && this.f151949c == null) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            z = true;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2711);
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f151950d;
            if (runtimeException == null) {
                Error error = this.f151949c;
                if (error == null) {
                    DummySurface dummySurface = this.f151951e;
                    if (dummySurface != null) {
                        MethodCollector.o(2711);
                        return dummySurface;
                    }
                    NullPointerException nullPointerException = new NullPointerException();
                    MethodCollector.o(2711);
                    throw nullPointerException;
                }
                MethodCollector.o(2711);
                throw error;
            }
            MethodCollector.o(2711);
            throw runtimeException;
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0245, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
            r19.f151949c = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x0248, code lost:
            monitor-enter(r19);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
            notify();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x024e, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x0250, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(2732);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x0255, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x0256, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x0257, code lost:
            r19.f151950d = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x0259, code lost:
            monitor-enter(r19);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
            notify();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x0264, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x0268, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(2732);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x026b, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x026c, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x026d, code lost:
            r18 = 2732;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
            notify();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x0277, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x0278, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x027a, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x027d, code lost:
            throw r0;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0245 A[ExcHandler: Error (r0v6 'e' java.lang.Error A[CUSTOM_DECLARE]), Splitter:B:48:0x00ce] */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x0256 A[ExcHandler: RuntimeException (r0v4 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:48:0x00ce] */
        /* JADX WARNING: Removed duplicated region for block: B:145:0x0270 A[SYNTHETIC, Splitter:B:145:0x0270] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean handleMessage(android.os.Message r20) {
            /*
            // Method dump skipped, instructions count: 638
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.DummySurface.a.handleMessage(android.os.Message):boolean");
        }
    }

    public final void release() {
        MethodCollector.i(2349);
        super.release();
        synchronized (this.f151945b) {
            try {
                if (!this.f151946c) {
                    a aVar = this.f151945b;
                    if (aVar.f151947a != null) {
                        aVar.f151947a.sendEmptyMessage(2);
                        this.f151946c = true;
                    } else {
                        NullPointerException nullPointerException = new NullPointerException();
                        MethodCollector.o(2349);
                        throw nullPointerException;
                    }
                }
            } finally {
                MethodCollector.o(2349);
            }
        }
    }

    private DummySurface(a aVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f151945b = aVar;
        this.f151944a = z;
    }

    /* synthetic */ DummySurface(a aVar, SurfaceTexture surfaceTexture, boolean z, byte b2) {
        this(aVar, surfaceTexture, z);
    }
}
