package com.ss.android.ttve.common;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.an;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f61079a = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: b  reason: collision with root package name */
    protected d f61080b;

    /* renamed from: c  reason: collision with root package name */
    private int f61081c;

    /* renamed from: d  reason: collision with root package name */
    private int f61082d;

    /* renamed from: e  reason: collision with root package name */
    private int f61083e;

    /* renamed from: f  reason: collision with root package name */
    private int f61084f;

    protected h() {
    }

    public final void b() {
        this.f61080b.a();
        GLES20.glDeleteBuffers(1, new int[]{this.f61081c}, 0);
        this.f61080b = null;
        this.f61081c = 0;
    }

    static {
        Covode.recordClassIndex(37614);
    }

    public final void c() {
        float cos = (float) Math.cos(0.0d);
        float sin = (float) Math.sin(0.0d);
        GLES20.glUseProgram(this.f61080b.f61060a);
        GLES20.glUniformMatrix2fv(this.f61082d, 1, false, new float[]{cos, sin, -sin, cos}, 0);
    }

    public static h a() {
        h hVar = new h();
        d dVar = new d();
        hVar.f61080b = dVar;
        if (!dVar.a("attribute vec2 vPosition;\nvarying vec2 texCoord;\nuniform mat2 rotation;\nuniform vec2 flipScale;\nvoid main()\n{\n   gl_Position = vec4(vPosition, 0.0, 1.0);\n   texCoord = flipScale * (vPosition / 2.0 * rotation) + 0.5;\n}", "precision mediump float;\nvarying vec2 texCoord;\nuniform sampler2D inputImageTexture;\nuniform int debug;\nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, texCoord);\n   if (debug != 0) gl_FragColor.rg = texCoord;\n}")) {
            hVar.f61080b.a();
            hVar.f61080b = null;
            an.d("TETextureDrawer", "TETextureDrawer create failed!");
            hVar.b();
            return null;
        }
        GLES20.glUseProgram(hVar.f61080b.f61060a);
        hVar.f61082d = hVar.f61080b.a("rotation");
        hVar.f61083e = hVar.f61080b.a("flipScale");
        hVar.f61084f = hVar.f61080b.a("debug");
        hVar.f61080b.a("vPosition", 0);
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        int i2 = iArr[0];
        hVar.f61081c = i2;
        GLES20.glBindBuffer(34962, i2);
        float[] fArr = f61079a;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr).position(0);
        GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
        hVar.c();
        hVar.a(1.0f);
        GLES20.glUseProgram(hVar.f61080b.f61060a);
        GLES20.glUniform1i(hVar.f61084f, 0);
        an.a("TETextureDrawer", "init: success.");
        return hVar;
    }

    public final void a(float f2) {
        GLES20.glUseProgram(this.f61080b.f61060a);
        GLES20.glUniform2f(this.f61083e, 1.0f, 1.0f / f2);
    }

    public final void a(int i2) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i2);
        GLES20.glBindBuffer(34962, this.f61081c);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        GLES20.glUseProgram(this.f61080b.f61060a);
        GLES20.glDrawArrays(5, 0, 4);
    }
}
