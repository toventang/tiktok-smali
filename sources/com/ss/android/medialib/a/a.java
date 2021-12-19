package com.ss.android.medialib.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.vesdk.an;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.libsdl.app.AudioRecorderInterface;

public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public volatile b f59667a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f59668b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public boolean f59669c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f59670d;

    /* renamed from: e  reason: collision with root package name */
    public AbstractC1300a f59671e;

    /* renamed from: f  reason: collision with root package name */
    AudioRecorderInterface f59672f;

    /* renamed from: g  reason: collision with root package name */
    public AtomicInteger f59673g = new AtomicInteger(0);

    /* renamed from: h  reason: collision with root package name */
    public ConcurrentLinkedQueue<Long> f59674h = new ConcurrentLinkedQueue<>();

    /* renamed from: i  reason: collision with root package name */
    public boolean f59675i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f59676j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f59677k = false;

    /* renamed from: l  reason: collision with root package name */
    public final Object f59678l;

    /* renamed from: com.ss.android.medialib.a.a$a  reason: collision with other inner class name */
    public interface AbstractC1300a {
        static {
            Covode.recordClassIndex(36857);
        }

        int onProcessData(byte[] bArr, int i2, long j2);
    }

    static {
        Covode.recordClassIndex(36856);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        if (r4.f59670d == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        if (r4.f59676j != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0024, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0026, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(5783);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0029, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r1 = r4.f59678l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r4 = this;
            r3 = 5783(0x1697, float:8.104E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            java.lang.Object r1 = r4.f59668b
            monitor-enter(r1)
            boolean r0 = r4.f59669c     // Catch:{ all -> 0x002a }
            r2 = 0
            if (r0 != 0) goto L_0x0012
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return r2
        L_0x0012:
            monitor-exit(r1)
            java.lang.Object r1 = r4.f59678l
            monitor-enter(r1)
            boolean r0 = r4.f59670d     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x001f
            boolean r0 = r4.f59676j     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001f
            r2 = 1
        L_0x001f:
            monitor-exit(r1)     // Catch:{ all -> 0x0024 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return r2
        L_0x0024:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.a.a.a():boolean");
    }

    public final boolean b() {
        boolean z;
        MethodCollector.i(5787);
        synchronized (this.f59668b) {
            try {
                if (!this.f59669c) {
                    return false;
                }
                synchronized (this.f59678l) {
                    try {
                        z = this.f59677k;
                    } finally {
                        MethodCollector.o(5787);
                    }
                }
                return z;
            } finally {
                MethodCollector.o(5787);
            }
        }
    }

    public final void c() {
        MethodCollector.i(5798);
        synchronized (this.f59668b) {
            try {
                if (this.f59669c) {
                    this.f59667a.sendMessage(this.f59667a.obtainMessage(2));
                    an.b("AudioDataProcessThread", "stop()");
                    MethodCollector.o(5798);
                }
            } finally {
                MethodCollector.o(5798);
            }
        }
    }

    public final void d() {
        MethodCollector.i(5847);
        synchronized (this.f59678l) {
            try {
                an.a("AudioDataProcessThread", "handleStopFeeding() called");
                if (!this.f59676j) {
                    AudioRecorderInterface audioRecorderInterface = this.f59672f;
                    if (audioRecorderInterface != null) {
                        audioRecorderInterface.closeWavFile(this.f59675i);
                    } else {
                        an.d("AudioDataProcessThread", "handleStop: Discard wav file");
                    }
                    this.f59676j = true;
                    this.f59675i = false;
                    this.f59678l.notify();
                    MethodCollector.o(5847);
                }
            } finally {
                MethodCollector.o(5847);
            }
        }
    }

    public void run() {
        MethodCollector.i(5802);
        Looper.prepare();
        synchronized (this.f59668b) {
            try {
                this.f59667a = new b(this);
                this.f59669c = true;
                this.f59668b.notify();
            } finally {
                MethodCollector.o(5802);
            }
        }
        Looper.loop();
        an.b("AudioDataProcessThread", "Encoder thread exiting");
        synchronized (this.f59668b) {
            try {
                this.f59670d = false;
                this.f59669c = false;
                this.f59667a = null;
            } finally {
                MethodCollector.o(5802);
            }
        }
    }

    public static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<a> f59679a;

        static {
            Covode.recordClassIndex(36858);
        }

        public b(a aVar) {
            this.f59679a = new WeakReference<>(aVar);
        }

        public final void handleMessage(Message message) {
            int i2 = message.what;
            a aVar = this.f59679a.get();
            if (aVar == null) {
                an.d("AudioDataProcessThread", "EncoderHandler.handleMessage: encoder is null");
            } else if (i2 == 0) {
                int i3 = message.arg1;
                int i4 = message.arg2;
                double doubleValue = ((Double) message.obj).doubleValue();
                if (aVar.f59672f != null) {
                    an.a("AudioDataProcessThread", "handleStartFeeding() called with: sampleRateInHz = [" + i3 + "], channels = [" + i4 + "], speed = [" + doubleValue + "]");
                    if (aVar.f59672f.initWavFile(i3, i4, doubleValue) != 0) {
                        an.d("AudioDataProcessThread", "init wav file failed");
                    } else {
                        aVar.f59676j = false;
                    }
                }
            } else if (i2 == 1) {
                aVar.f59674h.clear();
                aVar.d();
            } else if (i2 == 2) {
                an.a("AudioDataProcessThread", "Exit loop");
                aVar.d();
                removeMessages(3);
                Looper.myLooper().quit();
            } else if (i2 == 3) {
                if (aVar.f59676j) {
                    an.c("AudioDataProcessThread", "Cannot feed() after stopFeeding.");
                    return;
                }
                byte[] bArr = (byte[]) message.obj;
                int i5 = message.arg1;
                int decrementAndGet = aVar.f59673g.decrementAndGet();
                if (aVar.f59671e != null) {
                    aVar.f59671e.onProcessData(bArr, i5, aVar.f59674h.poll().longValue());
                    an.b("AudioDataProcessThread", "Buffer processed, size=" + i5 + ", " + decrementAndGet + " buffers remaining");
                }
            }
        }
    }

    public a(AudioRecorderInterface audioRecorderInterface, AbstractC1300a aVar) {
        Object obj;
        if (audioRecorderInterface != null) {
            obj = audioRecorderInterface;
        } else {
            obj = new Object();
        }
        this.f59678l = obj;
        this.f59672f = audioRecorderInterface;
        this.f59671e = aVar;
    }

    public final void a(byte[] bArr, int i2) {
        MethodCollector.i(5795);
        synchronized (this.f59668b) {
            try {
                if (this.f59669c) {
                    this.f59673g.incrementAndGet();
                    this.f59674h.offer(0L);
                    this.f59667a.sendMessage(this.f59667a.obtainMessage(3, i2, 0, Arrays.copyOf(bArr, i2)));
                    an.b("AudioDataProcessThread", "feed audioData");
                    MethodCollector.o(5795);
                }
            } finally {
                MethodCollector.o(5795);
            }
        }
    }

    public final void a(int i2, int i3, double d2) {
        MethodCollector.i(5779);
        an.c("AudioDataProcessThread", "startFeeding");
        synchronized (this.f59668b) {
            try {
                if (!this.f59669c) {
                    an.c("AudioDataProcessThread", "startFeeding not ready");
                    return;
                }
                this.f59673g.set(0);
                this.f59674h.clear();
                this.f59667a.sendMessage(this.f59667a.obtainMessage(0, i2, i3, Double.valueOf(d2)));
                this.f59677k = false;
                MethodCollector.o(5779);
            } finally {
                MethodCollector.o(5779);
            }
        }
    }
}
