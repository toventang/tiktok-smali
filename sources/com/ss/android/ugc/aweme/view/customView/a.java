package com.ss.android.ugc.aweme.view.customView;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.bef.effectsdk.BEFEffectNative;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.io.ByteArrayOutputStream;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public final class a {
    static final float[] V = {-1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f};
    static final float[] W = {-1.0f, 1.0f, 0.0f, 0.0f, 1.0f, -1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};
    static final short[] X = {0, 1, 2, 0, 2, 3};
    public static final C3842a Y = new C3842a((byte) 0);
    int A;
    int B;
    int C;
    int D;
    int E;
    int F;
    int[] G;
    int[] H;
    int[] I;
    FloatBuffer J;
    FloatBuffer K;
    ShortBuffer L;
    int[] M;
    int[] N;
    public int[] O;
    int[] P;
    int[] Q;
    int[] R;
    int[] S;
    int[] T;
    int[] U;
    private int[] Z;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f144172a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    long f144173b;

    /* renamed from: c  reason: collision with root package name */
    ResourceFinder f144174c;

    /* renamed from: d  reason: collision with root package name */
    String f144175d;

    /* renamed from: e  reason: collision with root package name */
    public int f144176e;

    /* renamed from: f  reason: collision with root package name */
    public int f144177f;

    /* renamed from: g  reason: collision with root package name */
    int f144178g;

    /* renamed from: h  reason: collision with root package name */
    int f144179h;

    /* renamed from: i  reason: collision with root package name */
    final int f144180i = 480;

    /* renamed from: j  reason: collision with root package name */
    final int f144181j = 270;

    /* renamed from: k  reason: collision with root package name */
    public float f144182k;

    /* renamed from: l  reason: collision with root package name */
    public float f144183l;

    /* renamed from: m  reason: collision with root package name */
    public float f144184m;
    public float n;
    public boolean o = true;
    public boolean p;
    public boolean q;
    public int r = 30;
    public int s = 30;
    public boolean t;
    public final int u = 256;
    public final int v = 256;
    public List<ByteArrayOutputStream> w;
    int x;
    int y;
    int z;

    /* renamed from: com.ss.android.ugc.aweme.view.customView.a$a  reason: collision with other inner class name */
    public static final class C3842a {
        static {
            Covode.recordClassIndex(94353);
        }

        private C3842a() {
        }

        public /* synthetic */ C3842a(byte b2) {
            this();
        }
    }

    public final void a() {
        ResourceFinder resourceFinder = this.f144174c;
        if (resourceFinder != null) {
            BEFEffectNative.releaseResourceFinder(this.f144173b, resourceFinder);
            this.f144174c = null;
        }
    }

    public final void b() {
        long j2 = this.f144173b;
        if (j2 != 0) {
            BEFEffectNative.destroyHandle(j2);
            this.f144173b = 0;
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        a();
        b();
        e();
        c();
    }

    public final void c() {
        int i2 = this.C;
        if (i2 != 0) {
            GLES20.glDeleteProgram(i2);
        }
        int i3 = this.x;
        if (i3 != 0) {
            GLES20.glDeleteProgram(i3);
        }
        int[] iArr = this.G;
        if (iArr != null) {
            GLES20.glDeleteBuffers(1, iArr, 0);
        }
        int[] iArr2 = this.H;
        if (iArr2 != null) {
            GLES20.glDeleteBuffers(1, iArr2, 0);
        }
        int[] iArr3 = this.I;
        if (iArr3 != null) {
            GLES20.glDeleteBuffers(1, iArr3, 0);
        }
    }

    public final void e() {
        int[] iArr = this.M;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
        }
        int[] iArr2 = this.N;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
        }
        int[] iArr3 = this.O;
        if (iArr3 != null) {
            GLES20.glDeleteFramebuffers(1, iArr3, 0);
        }
        int[] iArr4 = this.P;
        if (iArr4 != null) {
            GLES20.glDeleteTextures(1, iArr4, 0);
        }
        int[] iArr5 = this.Q;
        if (iArr5 != null) {
            GLES20.glDeleteFramebuffers(1, iArr5, 0);
        }
        int[] iArr6 = this.R;
        if (iArr6 != null) {
            GLES20.glDeleteTextures(1, iArr6, 0);
        }
        int[] iArr7 = this.T;
        if (iArr7 != null) {
            GLES20.glDeleteFramebuffers(1, iArr7, 0);
        }
        int[] iArr8 = this.U;
        if (iArr8 != null) {
            GLES20.glDeleteTextures(1, iArr8, 0);
        }
        int[] iArr9 = this.S;
        if (iArr9 != null) {
            GLES20.glDeleteFramebuffers(1, iArr9, 0);
        }
        int[] iArr10 = this.Z;
        if (iArr10 != null) {
            GLES20.glDeleteTextures(1, iArr10, 0);
        }
    }

    static {
        Covode.recordClassIndex(94352);
    }

    public final void d() {
        e();
        int i2 = this.f144176e;
        int i3 = this.f144177f;
        int[] iArr = new int[1];
        this.M = iArr;
        this.N = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int[] iArr2 = this.M;
        if (iArr2 == null) {
            l.b();
        }
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        GLES20.glGenTextures(1, this.N, 0);
        int[] iArr3 = this.N;
        if (iArr3 == null) {
            l.b();
        }
        GLES20.glBindTexture(3553, iArr3[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
        int[] iArr4 = this.N;
        if (iArr4 == null) {
            l.b();
        }
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr4[0], 0);
        int[] iArr5 = new int[1];
        this.O = iArr5;
        this.P = new int[1];
        GLES20.glGenFramebuffers(1, iArr5, 0);
        int[] iArr6 = this.O;
        if (iArr6 == null) {
            l.b();
        }
        GLES20.glBindFramebuffer(36160, iArr6[0]);
        GLES20.glGenTextures(1, this.P, 0);
        int[] iArr7 = this.P;
        if (iArr7 == null) {
            l.b();
        }
        GLES20.glBindTexture(3553, iArr7[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
        int[] iArr8 = this.P;
        if (iArr8 == null) {
            l.b();
        }
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr8[0], 0);
        int[] iArr9 = new int[1];
        this.Q = iArr9;
        this.R = new int[1];
        GLES20.glGenFramebuffers(1, iArr9, 0);
        int[] iArr10 = this.Q;
        if (iArr10 == null) {
            l.b();
        }
        GLES20.glBindFramebuffer(36160, iArr10[0]);
        GLES20.glGenTextures(1, this.R, 0);
        int[] iArr11 = this.R;
        if (iArr11 == null) {
            l.b();
        }
        GLES20.glBindTexture(3553, iArr11[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
        int[] iArr12 = this.R;
        if (iArr12 == null) {
            l.b();
        }
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr12[0], 0);
        int[] iArr13 = new int[1];
        this.T = iArr13;
        this.U = new int[1];
        this.f144178g = (this.f144181j * i3) / this.f144180i;
        this.f144179h = i3;
        GLES20.glGenFramebuffers(1, iArr13, 0);
        int[] iArr14 = this.T;
        if (iArr14 == null) {
            l.b();
        }
        GLES20.glBindFramebuffer(36160, iArr14[0]);
        GLES20.glGenTextures(1, this.U, 0);
        int[] iArr15 = this.U;
        if (iArr15 == null) {
            l.b();
        }
        GLES20.glBindTexture(3553, iArr15[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, this.f144178g, this.f144179h, 0, 6408, 5121, null);
        int[] iArr16 = this.U;
        if (iArr16 == null) {
            l.b();
        }
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr16[0], 0);
        int[] iArr17 = new int[1];
        this.S = iArr17;
        this.Z = new int[1];
        GLES20.glGenFramebuffers(1, iArr17, 0);
        int[] iArr18 = this.S;
        if (iArr18 == null) {
            l.b();
        }
        GLES20.glBindFramebuffer(36160, iArr18[0]);
        GLES20.glGenTextures(1, this.Z, 0);
        int[] iArr19 = this.Z;
        if (iArr19 == null) {
            l.b();
        }
        GLES20.glBindTexture(3553, iArr19[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, this.u, this.v, 0, 6408, 5121, null);
        int[] iArr20 = this.Z;
        if (iArr20 == null) {
            l.b();
        }
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr20[0], 0);
    }

    public final void a(String str) {
        this.f144175d = str;
        BEFEffectNative.setStickerPath(this.f144173b, str);
    }

    public final void b(int[] iArr, float[] fArr, float[] fArr2) {
        BEFEffectNative.touchMoveEvent(this.f144173b, iArr, fArr, fArr2);
    }

    public final void c(int[] iArr, float[] fArr, float[] fArr2) {
        BEFEffectNative.touchEndEvent(this.f144173b, iArr, fArr, fArr2);
    }

    public final void a(int[] iArr, float[] fArr, float[] fArr2) {
        BEFEffectNative.touchBeginEvent(this.f144173b, iArr, fArr, fArr2);
    }

    public static Bitmap a(int i2, int i3, boolean z2) {
        int i4;
        MethodCollector.i(3534);
        int i5 = i2 * i3;
        int[] iArr = new int[i5];
        int[] iArr2 = new int[i5];
        IntBuffer wrap = IntBuffer.wrap(iArr);
        wrap.position(0);
        GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, wrap);
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = i6 * i2;
            if (z2) {
                i4 = ((i3 - i6) - 1) * i2;
            } else {
                i4 = i7;
            }
            for (int i8 = 0; i8 < i2; i8++) {
                int i9 = iArr[i7 + i8];
                int i10 = i4 + i8;
                iArr2[i10] = (i9 & -16711936) | ((i9 << 16) & 16711680) | ((i9 >> 16) & 255);
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr2, i2, i3, Bitmap.Config.ARGB_8888);
        l.b(createBitmap, "");
        MethodCollector.o(3534);
        return createBitmap;
    }

    public final void a(int i2, int i3, float f2) {
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        GLES20.glBindFramebuffer(36160, i3);
        if (f2 > 0.0f) {
            z2 = true;
            i4 = this.x;
            i5 = 36197;
            i6 = this.y;
            i7 = this.A;
            i8 = this.z;
            int[] iArr = this.H;
            if (iArr == null) {
                l.b();
            }
            i9 = iArr[0];
        } else {
            z2 = false;
            i4 = this.C;
            i5 = 3553;
            i6 = this.F;
            i7 = this.D;
            i8 = this.E;
            int[] iArr2 = this.G;
            if (iArr2 == null) {
                l.b();
            }
            i9 = iArr2[0];
        }
        GLES20.glUseProgram(i4);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(i5, i2);
        GLES20.glUniform1i(i6, 0);
        if (z2) {
            GLES20.glUniform1f(this.B, f2);
        }
        GLES20.glBindBuffer(34962, i9);
        GLES20.glVertexAttribPointer(i8, 2, 5126, false, 20, 0);
        GLES20.glEnableVertexAttribArray(i8);
        GLES20.glVertexAttribPointer(i7, 2, 5126, false, 20, 12);
        GLES20.glEnableVertexAttribArray(i7);
        int[] iArr3 = this.I;
        if (iArr3 == null) {
            l.b();
        }
        GLES20.glBindBuffer(34963, iArr3[0]);
        GLES20.glDrawElements(4, 6, 5123, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public final void a(int i2, int i3, int i4, String str) {
        BEFEffectNative.sendMessage(this.f144173b, (long) i2, (long) i3, (long) i4, str);
    }
}
