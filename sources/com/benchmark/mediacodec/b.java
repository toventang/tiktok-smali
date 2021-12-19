package com.benchmark.mediacodec;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static String f6221a = "BXHwDecoder";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f6222b = true;

    /* renamed from: c  reason: collision with root package name */
    public static String f6223c;

    /* renamed from: f  reason: collision with root package name */
    private static String f6224f = "video/avc";
    private int A;

    /* renamed from: d  reason: collision with root package name */
    public Object f6225d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6226e;

    /* renamed from: g  reason: collision with root package name */
    private int f6227g;

    /* renamed from: h  reason: collision with root package name */
    private int f6228h;

    /* renamed from: i  reason: collision with root package name */
    private MediaFormat f6229i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f6230j;

    /* renamed from: k  reason: collision with root package name */
    private int[] f6231k;

    /* renamed from: l  reason: collision with root package name */
    private SurfaceTexture f6232l;

    /* renamed from: m  reason: collision with root package name */
    private Surface f6233m;
    private a n;
    private MediaCodec.BufferInfo o;
    private ByteBuffer[] p;
    private MediaCodec q;
    private HandlerThread r;
    private Handler s;
    private int t;
    private int u;
    private SurfaceTexture.OnFrameAvailableListener v;
    private boolean w;
    private long x;
    private long y;
    private int z;

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        FloatBuffer f6235a;

        /* renamed from: b  reason: collision with root package name */
        float[] f6236b = new float[16];

        /* renamed from: c  reason: collision with root package name */
        float[] f6237c = new float[16];

        /* renamed from: d  reason: collision with root package name */
        int f6238d;

        /* renamed from: e  reason: collision with root package name */
        int f6239e;

        /* renamed from: f  reason: collision with root package name */
        int f6240f;

        /* renamed from: g  reason: collision with root package name */
        int f6241g;

        /* renamed from: h  reason: collision with root package name */
        int f6242h;

        /* renamed from: i  reason: collision with root package name */
        int[] f6243i = new int[1];

        /* renamed from: j  reason: collision with root package name */
        int f6244j;

        /* renamed from: k  reason: collision with root package name */
        private final float[] f6245k;

        static {
            Covode.recordClassIndex(3009);
        }

        public static void a() {
            do {
            } while (GLES20.glGetError() != 0);
        }

        public a(SurfaceTexture surfaceTexture) {
            float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
            this.f6245k = fArr;
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f6235a = asFloatBuffer;
            asFloatBuffer.put(fArr).position(0);
            if (surfaceTexture != null) {
                surfaceTexture.getTransformMatrix(this.f6237c);
            } else {
                Matrix.setIdentityM(this.f6237c, 0);
            }
        }

        static int a(int i2, String str) {
            int glCreateShader = GLES20.glCreateShader(i2);
            do {
            } while (GLES20.glGetError() != 0);
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 0) {
                return glCreateShader;
            }
            GLES20.glGetShaderInfoLog(glCreateShader);
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
    }

    static {
        Covode.recordClassIndex(3007);
    }

    public b() {
        this.f6230j = true;
        this.f6231k = new int[1];
        this.o = new MediaCodec.BufferInfo();
        this.t = 30;
        this.u = 0;
        this.f6225d = new Object();
        this.f6226e = false;
        this.v = new SurfaceTexture.OnFrameAvailableListener() {
            /* class com.benchmark.mediacodec.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(3008);
            }

            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                MethodCollector.i(10233);
                synchronized (b.this.f6225d) {
                    try {
                        b.this.f6226e = true;
                        b.this.f6225d.notify();
                    } finally {
                        MethodCollector.o(10233);
                    }
                }
            }
        };
        this.w = false;
        this.x = 10000;
        this.y = 10000;
        this.z = 0;
        this.A = 0;
        HandlerThread handlerThread = new HandlerThread(f6221a);
        this.r = handlerThread;
        handlerThread.start();
        this.s = new Handler(this.r.getLooper());
    }

    public final int a() {
        try {
            this.q.stop();
        } catch (Exception unused) {
        }
        this.q.release();
        this.r.quit();
        if (this.f6230j) {
            a aVar = this.n;
            if (aVar.f6238d != 0) {
                GLES20.glDeleteProgram(aVar.f6238d);
                aVar.f6238d = 0;
            }
            if (aVar.f6243i[0] != 0) {
                GLES20.glDeleteFramebuffers(1, aVar.f6243i, 0);
            }
            this.f6233m.release();
            this.f6232l.release();
            int[] iArr = this.f6231k;
            if (iArr[0] != 0) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.f6231k[0] = 0;
            }
        }
        return a.f6210c;
    }

    private static MediaCodecInfo a(String str) {
        String[] supportedTypes;
        int codecCount = MediaCodecList.getCodecCount();
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (!codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    for (String str2 : codecInfoAt.getSupportedTypes()) {
                        if (str2.equalsIgnoreCase(str)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public b(boolean z2, String str, String str2) {
        this();
        f6222b = z2;
        f6223c = str;
        f6224f = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (a(com.benchmark.mediacodec.b.f6224f) == null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a(byte[] r9, int r10, byte[] r11, int r12, int r13, int r14) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.mediacodec.b.a(byte[], int, byte[], int, int, int):int");
    }

    public final int a(byte[] bArr, int i2, long j2, byte[] bArr2, int i3, int i4, int i5) {
        ByteBuffer byteBuffer;
        MethodCollector.i(9654);
        int i6 = a.f6210c;
        if (!this.w) {
            try {
                int dequeueInputBuffer = this.q.dequeueInputBuffer(this.x);
                if (dequeueInputBuffer < 0) {
                    i6 = a.f6219l;
                } else if (i2 <= 0) {
                    this.q.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                    this.w = true;
                } else {
                    try {
                        if (Build.VERSION.SDK_INT >= 21) {
                            byteBuffer = this.q.getInputBuffer(dequeueInputBuffer);
                        } else {
                            byteBuffer = this.q.getInputBuffers()[dequeueInputBuffer];
                        }
                        byteBuffer.clear();
                        byteBuffer.position(0);
                        byteBuffer.put(bArr, 0, i2);
                        this.q.queueInputBuffer(dequeueInputBuffer, 0, i2, j2, 0);
                        this.A++;
                    } catch (Exception e2) {
                        e2.getMessage();
                        int i7 = a.p;
                        MethodCollector.o(9654);
                        return i7;
                    }
                }
            } catch (Exception e3) {
                e3.getMessage();
                int i8 = a.p;
                MethodCollector.o(9654);
                return i8;
            }
        } else {
            if (this.u > 1) {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e4) {
                    e4.printStackTrace();
                }
            }
            this.u++;
        }
        int dequeueOutputBuffer = this.q.dequeueOutputBuffer(this.o, this.y);
        if (dequeueOutputBuffer == -3) {
            this.p = this.q.getOutputBuffers();
        } else if (!(dequeueOutputBuffer == -2 || dequeueOutputBuffer == -1)) {
            if ((this.o.flags & 4) != 0) {
                int i9 = a.f6211d;
                MethodCollector.o(9654);
                return i9;
            }
            if (this.w) {
                this.u = 0;
            }
            this.z++;
            if (i6 != a.f6219l) {
                i6 = a.f6212e;
            }
            if (this.f6230j) {
                try {
                    this.q.releaseOutputBuffer(dequeueOutputBuffer, true);
                    synchronized (this.f6225d) {
                        try {
                            if (!this.f6226e) {
                                try {
                                    this.f6225d.wait();
                                } catch (InterruptedException e5) {
                                    e5.printStackTrace();
                                }
                                this.f6226e = false;
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(9654);
                            throw th;
                        }
                    }
                    this.f6232l.updateTexImage();
                    a aVar = this.n;
                    int i10 = this.f6231k[0];
                    GLES20.glViewport(0, 0, i4, i5);
                    GLES20.glBindTexture(3553, i3);
                    do {
                    } while (GLES20.glGetError() != 0);
                    GLES20.glBindFramebuffer(36160, aVar.f6243i[0]);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, i3, 0);
                    do {
                    } while (GLES20.glGetError() != 0);
                    do {
                    } while (GLES20.glGetError() != 0);
                    GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
                    GLES20.glClear(16640);
                    GLES20.glUseProgram(aVar.f6238d);
                    do {
                    } while (GLES20.glGetError() != 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, i10);
                    do {
                    } while (GLES20.glGetError() != 0);
                    aVar.f6235a.position(0);
                    GLES20.glVertexAttribPointer(aVar.f6241g, 3, 5126, false, 20, (Buffer) aVar.f6235a);
                    do {
                    } while (GLES20.glGetError() != 0);
                    GLES20.glEnableVertexAttribArray(aVar.f6241g);
                    do {
                    } while (GLES20.glGetError() != 0);
                    aVar.f6235a.position(3);
                    GLES20.glVertexAttribPointer(aVar.f6242h, 2, 5126, false, 20, (Buffer) aVar.f6235a);
                    do {
                    } while (GLES20.glGetError() != 0);
                    GLES20.glEnableVertexAttribArray(aVar.f6242h);
                    do {
                    } while (GLES20.glGetError() != 0);
                    Matrix.setIdentityM(aVar.f6236b, 0);
                    GLES20.glUniformMatrix4fv(aVar.f6239e, 1, false, aVar.f6236b, 0);
                    GLES20.glUniformMatrix4fv(aVar.f6240f, 1, false, aVar.f6237c, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    do {
                    } while (GLES20.glGetError() != 0);
                    GLES20.glDisableVertexAttribArray(aVar.f6241g);
                    GLES20.glDisableVertexAttribArray(aVar.f6242h);
                    GLES20.glBindTexture(36197, 0);
                    GLES20.glBindTexture(3553, 0);
                    if (f6222b && !TextUtils.isEmpty(f6223c)) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(3686400);
                        allocateDirect.order(ByteOrder.nativeOrder());
                        allocateDirect.position(0);
                        GLES20.glReadPixels(0, 0, 720, 1280, 6408, 5121, allocateDirect);
                        Bitmap createBitmap = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);
                        createBitmap.copyPixelsFromBuffer(allocateDirect);
                        aVar.f6244j++;
                        try {
                            File file = new File(f6223c + "decode" + aVar.f6244j + ".jpg");
                            if (!file.exists()) {
                                file.getParentFile().mkdirs();
                                file.createNewFile();
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        } catch (Throwable th2) {
                            createBitmap.recycle();
                            MethodCollector.o(9654);
                            throw th2;
                        }
                        createBitmap.recycle();
                    }
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glFinish();
                } catch (Exception e7) {
                    e7.getMessage();
                    if (i6 != a.f6219l) {
                        int i11 = a.p;
                        MethodCollector.o(9654);
                        return i11;
                    }
                }
            } else {
                if (this.p == null) {
                    this.p = this.q.getOutputBuffers();
                }
                ByteBuffer byteBuffer2 = this.p[dequeueOutputBuffer];
                int length = bArr2.length;
                byteBuffer2.remaining();
                byteBuffer2.get(bArr2, 0, Math.min(bArr2.length, byteBuffer2.remaining()));
                this.q.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
        }
        if (!this.w || this.u != this.t) {
            MethodCollector.o(9654);
            return i6;
        } else if (this.z >= this.A) {
            int i12 = a.f6209b;
            MethodCollector.o(9654);
            return i12;
        } else {
            int i13 = a.f6208a;
            MethodCollector.o(9654);
            return i13;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c A[Catch:{ Exception -> 0x0189 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fb A[Catch:{ Exception -> 0x0189 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0172 A[Catch:{ Exception -> 0x0189 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(byte[] r11, int r12, byte[] r13, int r14, int r15, int r16, boolean r17) {
        /*
        // Method dump skipped, instructions count: 424
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.mediacodec.b.a(byte[], int, byte[], int, int, int, boolean):int");
    }
}
