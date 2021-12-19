package com.ss.android.ugc.aweme.live.alphaplayer.b;

import android.content.Context;
import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.alphaplayer.c.a;
import com.ss.android.ugc.aweme.live.alphaplayer.c.b;
import com.ss.android.ugc.aweme.live.alphaplayer.c.c;
import com.ss.android.ugc.aweme.live.alphaplayer.f.d;
import com.ss.android.ugc.aweme.live.alphaplayer.f.e;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    a.C2775a f108139a = new a.C2775a();

    /* renamed from: b  reason: collision with root package name */
    private Context f108140b;

    /* renamed from: c  reason: collision with root package name */
    private float[] f108141c = new float[8];

    /* renamed from: d  reason: collision with root package name */
    private float[] f108142d = new float[8];

    /* renamed from: e  reason: collision with root package name */
    private float[] f108143e = new float[8];

    /* renamed from: f  reason: collision with root package name */
    private FloatBuffer f108144f;

    /* renamed from: g  reason: collision with root package name */
    private FloatBuffer f108145g;

    /* renamed from: h  reason: collision with root package name */
    private FloatBuffer f108146h;

    /* renamed from: i  reason: collision with root package name */
    private int f108147i = 0;

    /* renamed from: j  reason: collision with root package name */
    private int f108148j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f108149k = 0;

    /* renamed from: l  reason: collision with root package name */
    private int f108150l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f108151m = 0;
    private int n = 0;
    private Map<String, b> o = new HashMap();
    private Map<String, Integer> p = new HashMap();
    private List<b> q;

    static {
        Covode.recordClassIndex(69335);
    }

    public final void a() {
        c();
        d();
        e();
    }

    private void c() {
        FloatBuffer put = ByteBuffer.allocateDirect(this.f108141c.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f108141c);
        this.f108144f = put;
        put.position(0);
        FloatBuffer put2 = ByteBuffer.allocateDirect(this.f108142d.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f108142d);
        this.f108145g = put2;
        put2.position(0);
        FloatBuffer put3 = ByteBuffer.allocateDirect(this.f108143e.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f108143e);
        this.f108146h = put3;
        put3.position(0);
    }

    private void e() {
        List<b> list = this.q;
        if (!(list == null || list.isEmpty())) {
            this.p.clear();
            this.o.clear();
            for (int i2 = 0; i2 < this.q.size(); i2++) {
                b bVar = this.q.get(i2);
                this.o.put(bVar.f108182a, bVar);
                this.p.put(bVar.f108182a, Integer.valueOf(e.a(bVar.f108190i)));
            }
        }
    }

    public final void b() {
        for (Map.Entry<String, Integer> entry : this.p.entrySet()) {
            e.a(entry.getValue().intValue());
        }
        for (Map.Entry<String, b> entry2 : this.o.entrySet()) {
            entry2.getValue();
        }
        this.o.clear();
        this.p.clear();
        this.q.clear();
    }

    private void d() {
        int a2 = d.a(d.a("mask/mask_vertex.sh", this.f108140b.getResources()), d.a("mask/mask_frag.sh", this.f108140b.getResources()));
        this.f108147i = a2;
        if (a2 != 0) {
            this.f108148j = GLES20.glGetAttribLocation(a2, "aPosition");
            do {
            } while (GLES20.glGetError() != 0);
            if (this.f108148j != -1) {
                this.f108149k = GLES20.glGetAttribLocation(this.f108147i, "aTextureCoord");
                d.a();
                if (this.f108149k != -1) {
                    this.f108150l = GLES20.glGetAttribLocation(this.f108147i, "aMaskTextureCoord");
                    d.a();
                    if (this.f108150l != -1) {
                        this.f108151m = GLES20.glGetUniformLocation(this.f108147i, "sTexture");
                        d.a();
                        if (this.f108151m != -1) {
                            this.n = GLES20.glGetUniformLocation(this.f108147i, "sMaskTexture");
                            d.a();
                            if (this.n == -1) {
                                throw new RuntimeException("Could not get attrib location for sMaskTexture");
                            }
                            return;
                        }
                        throw new RuntimeException("Could not get attrib location for sTexture");
                    }
                    throw new RuntimeException("Could not get attrib location for aMaskTextureCoord");
                }
                throw new RuntimeException("Could not get attrib location for aTextureCoord");
            }
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
    }

    public a(Context context, List<b> list) {
        this.f108140b = context;
        this.q = new ArrayList(list);
    }

    private static void a(a.c cVar, a.C2775a aVar, float f2, float f3) {
        if (cVar.f108178b != 1) {
            a.C2775a a2 = aVar.a(cVar.f108180d);
            aVar.a(0.0f, 0.0f, a2.a(), a2.b(), a2.a(), a2.b());
            return;
        }
        aVar.a(cVar.f108180d);
        float a3 = aVar.a();
        float b2 = aVar.b();
        if (cVar.f108177a == 0) {
            aVar.a(0.0f, 0.0f, f2, f3, f2, f3);
        } else {
            a(a3, b2, f2, f3, aVar);
        }
    }

    private static void a(float f2, float f3, float f4, float f5, a.C2775a aVar) {
        if (f2 > f4 || f3 > f5) {
            float f6 = f2 / f3;
            if (f6 > f4 / f5) {
                float f7 = f4 / f6;
                float f8 = (f5 - f7) / 2.0f;
                aVar.a(0.0f, f8, f4, f8 + f7, f4, f5);
                return;
            }
            float f9 = f6 * f5;
            float f10 = (f4 - f9) / 2.0f;
            aVar.a(f10, 0.0f, f9 + f10, f5, f4, f5);
            return;
        }
        float f11 = (f4 - f2) / 2.0f;
        float f12 = (f5 - f3) / 2.0f;
        aVar.a(f11, f12, f2 + f11, f3 + f12, f4, f5);
    }

    private static void a(a.c cVar, float f2, float f3, float f4, float f5, a.C2775a aVar) {
        int[] iArr = cVar.f108180d;
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            int i3 = iArr[1];
            float f6 = ((float) i2) + ((((float) iArr[2]) - f2) / 2.0f);
            float f7 = ((float) i3) + ((((float) iArr[3]) - f3) / 2.0f);
            aVar.a(f6, f7, f2 + f6, f3 + f7, f4, f5);
        }
    }

    private void a(float f2, float f3, float f4, float f5, float f6, float f7, c cVar, a.c cVar2) {
        if (cVar2.f108177a == 0) {
            a(cVar2, f6, f7, f4, f5, this.f108139a);
        } else {
            this.f108139a.a(cVar2.f108180d, f4, f5);
        }
        com.ss.android.ugc.aweme.live.alphaplayer.f.b.a(this.f108139a, cVar);
        com.ss.android.ugc.aweme.live.alphaplayer.f.b.a(this.f108139a);
        com.ss.android.ugc.aweme.live.alphaplayer.f.b.a(this.f108141c, this.f108139a.f108162a, this.f108139a.f108163b, this.f108139a.f108164c, this.f108139a.f108165d);
        this.f108144f.position(0);
        this.f108144f.put(this.f108141c);
        a(cVar2, this.f108139a, f6, f7);
        com.ss.android.ugc.aweme.live.alphaplayer.f.b.a(this.f108142d, this.f108139a.f108162a, this.f108139a.f108163b, this.f108139a.f108164c, this.f108139a.f108165d);
        this.f108145g.position(0);
        this.f108145g.put(this.f108142d);
        this.f108139a.a(cVar2.f108179c, f2, f3);
        com.ss.android.ugc.aweme.live.alphaplayer.f.b.a(this.f108143e, this.f108139a.f108162a, this.f108139a.f108163b, this.f108139a.f108164c, this.f108139a.f108165d);
        this.f108146h.position(0);
        this.f108146h.put(this.f108143e);
    }

    public final void a(int i2, int i3, int i4, int i5, int i6, c cVar, String str, a.c cVar2) {
        if (cVar2.a()) {
            GLES20.glUseProgram(this.f108147i);
            do {
            } while (GLES20.glGetError() != 0);
            b bVar = this.o.get(str);
            if (bVar != null) {
                a((float) i3, (float) i4, (float) i5, (float) i6, (float) bVar.f108184c, (float) bVar.f108185d, cVar, cVar2);
                this.f108144f.position(0);
                GLES20.glVertexAttribPointer(this.f108148j, 2, 5126, false, 0, (Buffer) this.f108144f);
                do {
                } while (GLES20.glGetError() != 0);
                GLES20.glEnableVertexAttribArray(this.f108148j);
                do {
                } while (GLES20.glGetError() != 0);
                this.f108145g.position(0);
                GLES20.glVertexAttribPointer(this.f108149k, 2, 5126, false, 0, (Buffer) this.f108145g);
                do {
                } while (GLES20.glGetError() != 0);
                GLES20.glEnableVertexAttribArray(this.f108149k);
                do {
                } while (GLES20.glGetError() != 0);
                GLES20.glActiveTexture(33984);
                Integer num = this.p.get(str);
                if (num != null && num.intValue() != 0) {
                    GLES20.glBindTexture(3553, num.intValue());
                    GLES20.glUniform1i(this.f108151m, 0);
                    this.f108146h.position(0);
                    GLES20.glVertexAttribPointer(this.f108150l, 2, 5126, false, 0, (Buffer) this.f108146h);
                    do {
                    } while (GLES20.glGetError() != 0);
                    GLES20.glEnableVertexAttribArray(this.f108150l);
                    do {
                    } while (GLES20.glGetError() != 0);
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(com.ss.android.ugc.aweme.live.alphaplayer.e.b.f108304a, i2);
                    GLES20.glUniform1i(this.n, 1);
                    GLES20.glEnable(3042);
                    GLES20.glBlendFunc(770, 771);
                    GLES20.glDrawArrays(5, 0, 4);
                    do {
                    } while (GLES20.glGetError() != 0);
                    GLES20.glDisable(3042);
                }
            }
        }
    }
}
