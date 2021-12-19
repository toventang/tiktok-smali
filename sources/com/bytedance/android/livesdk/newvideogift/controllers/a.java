package com.bytedance.android.livesdk.newvideogift.controllers;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.os.SystemClock;
import android.view.Surface;
import com.bytedance.android.live.base.model.user.b;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.live.alphaplayer.c.a;
import com.ss.android.ugc.aweme.live.alphaplayer.c.c;
import com.ss.android.ugc.aweme.live.alphaplayer.e;
import com.ss.android.ugc.aweme.live.alphaplayer.e.a;
import com.ss.android.ugc.aweme.live.alphaplayer.f.d;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class a implements com.ss.android.ugc.aweme.live.alphaplayer.e.a {

    /* renamed from: a  reason: collision with root package name */
    public static int f19975a = 36197;
    private com.ss.android.ugc.aweme.live.alphaplayer.b.a A;
    private Map<String, Map<String, a.c>> B;
    private c C = new c();
    private long D = 0;
    private int E = 0;

    /* renamed from: b  reason: collision with root package name */
    private float[] f19976b = new float[8];

    /* renamed from: c  reason: collision with root package name */
    private float[] f19977c = new float[8];

    /* renamed from: d  reason: collision with root package name */
    private float[] f19978d = new float[8];

    /* renamed from: e  reason: collision with root package name */
    private FloatBuffer f19979e;

    /* renamed from: f  reason: collision with root package name */
    private FloatBuffer f19980f;

    /* renamed from: g  reason: collision with root package name */
    private FloatBuffer f19981g;

    /* renamed from: h  reason: collision with root package name */
    private int f19982h;

    /* renamed from: i  reason: collision with root package name */
    private int f19983i;

    /* renamed from: j  reason: collision with root package name */
    private int f19984j;

    /* renamed from: k  reason: collision with root package name */
    private int f19985k;

    /* renamed from: l  reason: collision with root package name */
    private int f19986l;

    /* renamed from: m  reason: collision with root package name */
    private SurfaceTexture f19987m;
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
        Covode.recordClassIndex(11803);
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
        this.D = SystemClock.currentThreadTimeMillis();
        this.E = 0;
        this.r.requestRender();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e.a
    public final void b() {
        String str;
        b a2;
        this.o.compareAndSet(true, false);
        float currentThreadTimeMillis = ((float) this.E) / ((((float) SystemClock.currentThreadTimeMillis()) - ((float) this.D)) / 100.0f);
        HashMap hashMap = new HashMap();
        hashMap.put("average", String.valueOf(currentThreadTimeMillis));
        hashMap.put("tag", "ttlive_sdk");
        f b2 = u.a().b();
        if (b2 == null || (a2 = b2.a()) == null || (str = String.valueOf(a2.getId())) == null) {
            str = "0";
        }
        hashMap.put("user_id", str);
        com.bytedance.android.live.core.d.c.a("ttlive_gift_video_fps", 0, (long) currentThreadTimeMillis, hashMap);
        b.a.a("ttlive_gift_video_fps").a((Map<String, String>) hashMap).a().b();
        this.r.requestRender();
        c();
        this.B = null;
    }

    /* renamed from: com.bytedance.android.livesdk.newvideogift.controllers.a$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f19988a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 138
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.newvideogift.controllers.a.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.e.a
    public final void a(a.AbstractC2778a aVar) {
        this.q = aVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.n.compareAndSet(false, true);
        this.E++;
        this.r.requestRender();
    }

    public a(e eVar) {
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
                this.f19987m.updateTexImage();
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
        if (!(this.f19979e == null || this.f19980f == null || this.f19981g == null)) {
            GLES20.glUseProgram(this.f19983i);
            this.f19979e.position(0);
            GLES20.glVertexAttribPointer(this.f19984j, 2, 5126, false, 0, (Buffer) this.f19979e);
            GLES20.glEnableVertexAttribArray(this.f19984j);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(f19975a, this.f19982h);
            this.f19980f.position(0);
            GLES20.glVertexAttribPointer(this.f19985k, 2, 5126, false, 0, (Buffer) this.f19980f);
            GLES20.glEnableVertexAttribArray(this.f19985k);
            this.f19981g.position(0);
            GLES20.glVertexAttribPointer(this.f19986l, 2, 5126, false, 0, (Buffer) this.f19981g);
            GLES20.glEnableVertexAttribArray(this.f19986l);
            GLES20.glDrawArrays(5, 0, 4);
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
                        aVar.a(this.f19982h, this.w, this.x, this.y, this.z, this.C, entry.getKey(), entry.getValue());
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
        com.ss.android.ugc.aweme.live.alphaplayer.f.b.a(this.f19976b, this.v.f108162a, this.v.f108163b, this.v.f108164c, this.v.f108165d);
        FloatBuffer put = ByteBuffer.allocateDirect(this.f19976b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f19976b);
        this.f19979e = put;
        put.position(0);
        com.ss.android.ugc.aweme.live.alphaplayer.f.b.a(this.f19977c, this.u.f108162a, this.u.f108163b, this.u.f108164c, this.u.f108165d);
        FloatBuffer put2 = ByteBuffer.allocateDirect(this.f19977c.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f19977c);
        this.f19980f = put2;
        put2.position(0);
        com.ss.android.ugc.aweme.live.alphaplayer.f.b.a(this.f19978d, this.t.f108162a, this.t.f108163b, this.t.f108164c, this.t.f108165d);
        FloatBuffer put3 = ByteBuffer.allocateDirect(this.f19978d.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f19978d);
        this.f19981g = put3;
        put3.position(0);
        this.C.b();
        c();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.m
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int a2 = d.a(d.a("video/video_vertex.sh", this.r.getResources()), d.a("video/video_frag.sh", this.r.getResources()));
        this.f19983i = a2;
        if (a2 != 0) {
            int glGetAttribLocation = GLES20.glGetAttribLocation(a2, "aPosition");
            this.f19984j = glGetAttribLocation;
            if (glGetAttribLocation != -1) {
                int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f19983i, "aTextureCoord");
                this.f19985k = glGetAttribLocation2;
                if (glGetAttribLocation2 != -1) {
                    int glGetAttribLocation3 = GLES20.glGetAttribLocation(this.f19983i, "aAlphaTextureCoord");
                    this.f19986l = glGetAttribLocation3;
                    if (glGetAttribLocation3 == -1) {
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
        this.f19982h = i2;
        GLES20.glBindTexture(f19975a, i2);
        GLES20.glTexParameterf(f19975a, 10241, 9728.0f);
        GLES20.glTexParameterf(f19975a, 10240, 9729.0f);
        this.f19987m = new SurfaceTexture(this.f19982h);
        int i3 = Build.VERSION.SDK_INT;
        this.f19987m.setDefaultBufferSize(this.r.getMeasuredWidth(), this.r.getMeasuredHeight());
        this.f19987m.setOnFrameAvailableListener(this);
        Surface surface = new Surface(this.f19987m);
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
        if (this.f19979e != null) {
            this.C.a(f2, f3, f4, f5);
            com.ss.android.ugc.aweme.live.alphaplayer.f.b.a(this.f19976b, this.v.f108162a + (f2 * 2.0f), this.v.f108163b - (f3 * 2.0f), this.v.f108164c - (f4 * 2.0f), this.v.f108165d + (f5 * 2.0f));
            this.f19979e.position(0);
            this.f19979e.put(this.f19976b);
        }
    }

    private void c(float f2, float f3, float f4, float f5) {
        if (this.f19980f != null && this.u != null && this.f19981g != null && this.t != null) {
            float f6 = (1.0f - f4) - f2;
            float f7 = (1.0f - f3) - f5;
            this.C.a((-f2) / f6, (-f3) / f7, (-f4) / f6, (-f5) / f7);
            com.ss.android.ugc.aweme.live.alphaplayer.f.b.a(this.f19977c, this.u.f108162a + (this.u.a() * f2), this.u.f108163b + (this.u.b() * f3), this.u.f108164c - (this.u.a() * f4), this.u.f108165d - (this.u.b() * f5));
            this.f19980f.position(0);
            this.f19980f.put(this.f19977c);
            com.ss.android.ugc.aweme.live.alphaplayer.f.b.a(this.f19978d, this.t.f108162a + (f2 * this.t.a()), this.t.f108163b + (f3 * this.t.b()), this.t.f108164c - (f4 * this.t.a()), this.t.f108165d - (f5 * this.t.b()));
            this.f19981g.position(0);
            this.f19981g.put(this.f19978d);
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
            switch (AnonymousClass1.f19988a[this.s.ordinal()]) {
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
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    c(f6, f7 * 2.0f, f6, 0.0f);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    c(0.0f, f7, f6 * 2.0f, f7);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    c(f6 * 2.0f, f7, 0.0f, f7);
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    b(0.0f, 0.0f, 0.0f, ((1.0f - ((f2 / f11) / f3)) / 2.0f) * 2.0f);
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    b(0.0f, ((1.0f - ((f2 / f11) / f3)) / 2.0f) * 2.0f, 0.0f, 0.0f);
                    return;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                    b(0.0f, 0.0f, ((1.0f - ((f3 * f11) / f2)) / 2.0f) * 2.0f, 0.0f);
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                    b(((1.0f - ((f3 * f11) / f2)) / 2.0f) * 2.0f, 0.0f, 0.0f, 0.0f);
                    return;
                default:
                    return;
            }
        }
    }
}
