package com.ss.android.ugc.aweme.live.alphaplayer.e;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.live.alphaplayer.b.a;
import com.ss.android.ugc.aweme.live.alphaplayer.c.a;
import com.ss.android.ugc.aweme.live.alphaplayer.c.c;
import com.ss.android.ugc.aweme.live.alphaplayer.e;
import com.ss.android.ugc.aweme.live.alphaplayer.e.a;
import com.ss.android.ugc.aweme.live.alphaplayer.f.d;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static int f108304a = 36197;
    private a A;
    private Map<String, Map<String, a.c>> B;
    private c C = new c();

    /* renamed from: b  reason: collision with root package name */
    private float[] f108305b = new float[8];

    /* renamed from: c  reason: collision with root package name */
    private float[] f108306c = new float[8];

    /* renamed from: d  reason: collision with root package name */
    private float[] f108307d = new float[8];

    /* renamed from: e  reason: collision with root package name */
    private FloatBuffer f108308e;

    /* renamed from: f  reason: collision with root package name */
    private FloatBuffer f108309f;

    /* renamed from: g  reason: collision with root package name */
    private FloatBuffer f108310g;

    /* renamed from: h  reason: collision with root package name */
    private int f108311h;

    /* renamed from: i  reason: collision with root package name */
    private int f108312i;

    /* renamed from: j  reason: collision with root package name */
    private int f108313j;

    /* renamed from: k  reason: collision with root package name */
    private int f108314k;

    /* renamed from: l  reason: collision with root package name */
    private int f108315l;

    /* renamed from: m  reason: collision with root package name */
    private SurfaceTexture f108316m;
    private AtomicBoolean n = new AtomicBoolean(false);
    private AtomicBoolean o = new AtomicBoolean(false);
    private AtomicInteger p = new AtomicInteger(0);
    private a.AbstractC2778a q;
    private e r;
    private a.d s = a.d.ScaleAspectFill;
    private a.C2775a t;
    private a.C2775a u;
    private a.C2775a v;
    private int w;
    private int x;
    private int y;
    private int z;

    static {
        Covode.recordClassIndex(69389);
    }

    private void c() {
        com.ss.android.ugc.aweme.live.alphaplayer.b.a aVar = this.A;
        if (aVar != null) {
            aVar.b();
            this.A = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e.a
    public final void a() {
        this.p.set(0);
        this.o.compareAndSet(false, true);
        this.o.get();
        this.r.requestRender();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e.a
    public final void b() {
        this.o.compareAndSet(true, false);
        this.o.get();
        this.r.requestRender();
        c();
        this.B = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.e.b$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f108317a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 139
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.alphaplayer.e.b.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e.a
    public final void a(a.AbstractC2778a aVar) {
        this.q = aVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.n.compareAndSet(false, true);
        this.r.requestRender();
    }

    public b(e eVar) {
        this.r = eVar;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e.a
    public final void a(List<com.ss.android.ugc.aweme.live.alphaplayer.c.b> list) {
        if (this.B != null && list != null && !list.isEmpty()) {
            this.A = new com.ss.android.ugc.aweme.live.alphaplayer.b.a(this.r.getContext(), list);
            if (this.r.c()) {
                this.A.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.m
    public final void onDrawFrame(GL10 gl10) {
        Map<String, a.c> map;
        if (this.n.compareAndSet(true, false)) {
            try {
                this.f108316m.updateTexImage();
            } catch (Exception unused) {
            }
        }
        GLES20.glClear(16640);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        if (!this.o.get()) {
            GLES20.glFinish();
            return;
        }
        this.p.addAndGet(1);
        if (!(this.f108308e == null || this.f108309f == null || this.f108310g == null)) {
            GLES20.glUseProgram(this.f108312i);
            GLES20.glGetError();
            this.f108308e.position(0);
            GLES20.glVertexAttribPointer(this.f108313j, 2, 5126, false, 0, (Buffer) this.f108308e);
            GLES20.glGetError();
            GLES20.glEnableVertexAttribArray(this.f108313j);
            GLES20.glGetError();
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(f108304a, this.f108311h);
            this.f108309f.position(0);
            GLES20.glVertexAttribPointer(this.f108314k, 2, 5126, false, 0, (Buffer) this.f108309f);
            GLES20.glGetError();
            GLES20.glEnableVertexAttribArray(this.f108314k);
            GLES20.glGetError();
            this.f108310g.position(0);
            GLES20.glVertexAttribPointer(this.f108315l, 2, 5126, false, 0, (Buffer) this.f108310g);
            GLES20.glGetError();
            GLES20.glEnableVertexAttribArray(this.f108315l);
            GLES20.glGetError();
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glGetError();
        }
        if (this.A != null) {
            int i2 = this.p.get();
            int b2 = this.q.b();
            if (b2 > i2 + 2) {
                this.p.set(b2);
                i2 = b2;
            }
            Map<String, Map<String, a.c>> map2 = this.B;
            if (!(map2 == null || (map = map2.get(String.valueOf(i2))) == null)) {
                for (Map.Entry<String, a.c> entry : map.entrySet()) {
                    com.ss.android.ugc.aweme.live.alphaplayer.b.a aVar = this.A;
                    if (aVar != null) {
                        aVar.a(this.f108311h, this.w, this.x, this.y, this.z, this.C, entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        GLES20.glFinish();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e.a
    public final void a(a.b bVar) {
        this.s = bVar.f108167b;
        this.w = bVar.f108171f;
        this.x = bVar.f108172g;
        this.y = bVar.f108173h;
        this.z = bVar.f108174i;
        if (bVar.a()) {
            this.u = bVar.f108170e.a((float) bVar.f108171f, (float) bVar.f108172g);
            this.t = bVar.f108169d.a((float) bVar.f108171f, (float) bVar.f108172g);
        } else {
            this.u = new a.C2775a(0.5f, 0.0f, 1.0f, 1.0f);
            this.t = new a.C2775a(0.0f, 0.0f, 0.5f, 1.0f);
        }
        this.v = new a.C2775a(0.0f, 0.0f, 1.0f, 1.0f);
        if (bVar.b()) {
            this.B = bVar.f108176k;
        } else {
            this.B = null;
        }
        com.ss.android.ugc.aweme.live.alphaplayer.f.b.a(this.v);
        com.ss.android.ugc.aweme.live.alphaplayer.f.b.a(this.f108305b, this.v.f108162a, this.v.f108163b, this.v.f108164c, this.v.f108165d);
        FloatBuffer put = ByteBuffer.allocateDirect(this.f108305b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f108305b);
        this.f108308e = put;
        put.position(0);
        com.ss.android.ugc.aweme.live.alphaplayer.f.b.a(this.f108306c, this.u.f108162a, this.u.f108163b, this.u.f108164c, this.u.f108165d);
        FloatBuffer put2 = ByteBuffer.allocateDirect(this.f108306c.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f108306c);
        this.f108309f = put2;
        put2.position(0);
        com.ss.android.ugc.aweme.live.alphaplayer.f.b.a(this.f108307d, this.t.f108162a, this.t.f108163b, this.t.f108164c, this.t.f108165d);
        FloatBuffer put3 = ByteBuffer.allocateDirect(this.f108307d.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f108307d);
        this.f108310g = put3;
        put3.position(0);
        this.C.b();
        c();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.m
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int a2 = d.a(d.a("video/video_vertex.sh", this.r.getResources()), d.a("video/video_frag.sh", this.r.getResources()));
        this.f108312i = a2;
        if (a2 != 0) {
            this.f108313j = GLES20.glGetAttribLocation(a2, "aPosition");
            GLES20.glGetError();
            if (this.f108313j != -1) {
                this.f108314k = GLES20.glGetAttribLocation(this.f108312i, "aTextureCoord");
                GLES20.glGetError();
                if (this.f108314k != -1) {
                    this.f108315l = GLES20.glGetAttribLocation(this.f108312i, "aAlphaTextureCoord");
                    GLES20.glGetError();
                    if (this.f108315l == -1) {
                        throw new RuntimeException("Could not get attrib location for aAlphaTextureCoord");
                    }
                } else {
                    throw new RuntimeException("Could not get attrib location for aTextureCoord");
                }
            } else {
                throw new RuntimeException("Could not get attrib location for aPosition");
            }
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        this.f108311h = i2;
        GLES20.glBindTexture(f108304a, i2);
        GLES20.glGetError();
        GLES20.glTexParameterf(f108304a, 10241, 9728.0f);
        GLES20.glTexParameterf(f108304a, 10240, 9729.0f);
        this.f108316m = new SurfaceTexture(this.f108311h);
        int i3 = Build.VERSION.SDK_INT;
        this.f108316m.setDefaultBufferSize(this.r.getMeasuredWidth(), this.r.getMeasuredHeight());
        this.f108316m.setOnFrameAvailableListener(this);
        Surface surface = new Surface(this.f108316m);
        a.AbstractC2778a aVar = this.q;
        if (aVar != null) {
            aVar.a(surface);
        }
        this.n.compareAndSet(true, false);
        com.ss.android.ugc.aweme.live.alphaplayer.b.a aVar2 = this.A;
        if (aVar2 != null) {
            aVar2.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.m
    public final void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        GLES20.glViewport(0, 0, i2, i3);
    }

    private void b(float f2, float f3, float f4, float f5) {
        if (this.f108308e != null) {
            this.C.a(f2, f3, f4, f5);
            com.ss.android.ugc.aweme.live.alphaplayer.f.b.a(this.f108305b, this.v.f108162a + (f2 * 2.0f), this.v.f108163b - (f3 * 2.0f), this.v.f108164c - (f4 * 2.0f), this.v.f108165d + (f5 * 2.0f));
            this.f108308e.position(0);
            this.f108308e.put(this.f108305b);
        }
    }

    private void c(float f2, float f3, float f4, float f5) {
        if (this.f108309f != null && this.u != null && this.f108310g != null && this.t != null) {
            float f6 = (1.0f - f4) - f2;
            float f7 = (1.0f - f3) - f5;
            this.C.a((-f2) / f6, (-f3) / f7, (-f4) / f6, (-f5) / f7);
            com.ss.android.ugc.aweme.live.alphaplayer.f.b.a(this.f108306c, this.u.f108162a + (this.u.a() * f2), this.u.f108163b + (this.u.b() * f3), this.u.f108164c - (this.u.a() * f4), this.u.f108165d - (this.u.b() * f5));
            this.f108309f.position(0);
            this.f108309f.put(this.f108306c);
            com.ss.android.ugc.aweme.live.alphaplayer.f.b.a(this.f108307d, this.t.f108162a + (f2 * this.t.a()), this.t.f108163b + (f3 * this.t.b()), this.t.f108164c - (f4 * this.t.a()), this.t.f108165d - (f5 * this.t.b()));
            this.f108310g.position(0);
            this.f108310g.put(this.f108307d);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e.a
    public final void a(float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        float f9 = 0.0f;
        if (f2 > 0.0f && f3 > 0.0f && f4 > 0.0f && f5 > 0.0f) {
            float f10 = f2 / f3;
            float f11 = f4 / f5;
            if (f10 > f11) {
                f7 = (1.0f - (f3 / (f2 / f11))) / 2.0f;
                f6 = 0.0f;
            } else {
                f6 = (1.0f - (f2 / (f3 * f11))) / 2.0f;
                f7 = 0.0f;
            }
            switch (AnonymousClass1.f108317a[this.s.ordinal()]) {
                case 1:
                    c(0.0f, 0.0f, 0.0f, 0.0f);
                    return;
                case 2:
                    if (f10 > f11) {
                        f9 = (1.0f - ((f3 * f11) / f2)) / 2.0f;
                        f8 = 0.0f;
                    } else {
                        f8 = (1.0f - ((f2 / f11) / f3)) / 2.0f;
                    }
                    b(f9, f8, f9, f8);
                    return;
                case 3:
                    c(f6, f7, f6, f7);
                    return;
                case 4:
                    c(f6, 0.0f, f6, f7 * 2.0f);
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    c(f6, f7 * 2.0f, f6, 0.0f);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    c(0.0f, f7, f6 * 2.0f, f7);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    c(f6 * 2.0f, f7, 0.0f, f7);
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    b(0.0f, 0.0f, 0.0f, ((1.0f - ((f2 / f11) / f3)) / 2.0f) * 2.0f);
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    b(0.0f, ((1.0f - ((f2 / f11) / f3)) / 2.0f) * 2.0f, 0.0f, 0.0f);
                    return;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    b(0.0f, 0.0f, ((1.0f - ((f3 * f11) / f2)) / 2.0f) * 2.0f, 0.0f);
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    b(((1.0f - ((f3 * f11) / f2)) / 2.0f) * 2.0f, 0.0f, 0.0f, 0.0f);
                    return;
                default:
                    return;
            }
        }
    }
}
