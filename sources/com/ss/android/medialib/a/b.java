package com.ss.android.medialib.a;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.vesdk.an;
import org.libsdl.app.AudioRecorderInterface;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static final String f59680b = b.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public AudioRecorderInterface f59681a;

    /* renamed from: c  reason: collision with root package name */
    private HandlerThread f59682c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f59683d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f59684e;

    static {
        Covode.recordClassIndex(36859);
    }

    public final synchronized boolean b() {
        boolean z;
        MethodCollector.i(5165);
        z = this.f59684e;
        MethodCollector.o(5165);
        return z;
    }

    public final int a() {
        MethodCollector.i(5159);
        synchronized (this) {
            try {
                this.f59684e = false;
                HandlerThread handlerThread = this.f59682c;
                if (handlerThread != null) {
                    try {
                        handlerThread.join(20);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                    this.f59682c = null;
                    this.f59683d = null;
                }
            } finally {
                MethodCollector.o(5159);
            }
        }
        AudioRecorderInterface audioRecorderInterface = this.f59681a;
        if (audioRecorderInterface != null) {
            int closeWavFile = audioRecorderInterface.closeWavFile(false);
            if (closeWavFile != 0) {
                an.d(f59680b, "close wav file failed");
            }
            return closeWavFile;
        }
        MethodCollector.o(5159);
        return 0;
    }

    public b(AudioRecorderInterface audioRecorderInterface) {
        this.f59681a = audioRecorderInterface;
    }

    public final int a(int i2, int i3, double d2) {
        MethodCollector.i(5151);
        synchronized (this) {
            try {
                HandlerThread handlerThread = new HandlerThread(f59680b);
                this.f59682c = handlerThread;
                handlerThread.start();
                this.f59683d = new Handler(this.f59682c.getLooper());
            } catch (Exception unused) {
                this.f59683d = null;
                this.f59682c = null;
            } catch (Throwable th) {
                MethodCollector.o(5151);
                throw th;
            }
            this.f59684e = true;
        }
        AudioRecorderInterface audioRecorderInterface = this.f59681a;
        if (audioRecorderInterface != null) {
            int initWavFile = audioRecorderInterface.initWavFile(i2, i3, d2);
            if (initWavFile != 0) {
                an.d(f59680b, "init wav file failed");
            }
            MethodCollector.o(5151);
            return initWavFile;
        }
        MethodCollector.o(5151);
        return 0;
    }

    public final int a(final byte[] bArr, final int i2, final long j2) {
        MethodCollector.i(5163);
        synchronized (this) {
            try {
                if (!this.f59684e) {
                    return -108;
                }
                Handler handler = this.f59683d;
                if (handler != null) {
                    handler.post(new Runnable() {
                        /* class com.ss.android.medialib.a.b.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(36860);
                        }

                        public final void run() {
                            if (b.this.f59681a != null) {
                                b.this.f59681a.addPCMData(bArr, i2, j2);
                            }
                        }
                    });
                } else {
                    AudioRecorderInterface audioRecorderInterface = this.f59681a;
                    if (audioRecorderInterface != null) {
                        audioRecorderInterface.addPCMData(bArr, i2, j2);
                    }
                }
                MethodCollector.o(5163);
                return 0;
            } finally {
                MethodCollector.o(5163);
            }
        }
    }
}
