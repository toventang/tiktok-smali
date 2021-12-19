package com.ss.android.medialib.b;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.an;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f59697a = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: b  reason: collision with root package name */
    protected c f59698b;

    /* renamed from: c  reason: collision with root package name */
    private int f59699c;

    /* renamed from: d  reason: collision with root package name */
    private int f59700d;

    /* renamed from: e  reason: collision with root package name */
    private int f59701e;

    protected d() {
    }

    public final void b() {
        this.f59698b.a();
        GLES20.glDeleteBuffers(1, new int[]{this.f59699c}, 0);
        this.f59698b = null;
        this.f59699c = 0;
    }

    static {
        Covode.recordClassIndex(36869);
    }

    public static d a() {
        d dVar = new d();
        c cVar = new c();
        dVar.f59698b = cVar;
        if (!cVar.a("attribute vec2 vPosition;\nvarying vec2 texCoord;\nuniform mat2 rotation;\nuniform vec2 flipScale;\nvoid main()\n{\n   gl_Position = vec4(vPosition, 0.0, 1.0);\n   texCoord = flipScale * (vPosition / 2.0 * rotation) + 0.5;\n}", "precision mediump float;\nvarying vec2 texCoord;\nuniform sampler2D inputImageTexture;\nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, texCoord);\n}")) {
            dVar.f59698b.a();
            dVar.f59698b = null;
            an.d("TextureDrawer", "TextureDrawer create failed!");
            dVar.b();
            return null;
        }
        GLES20.glUseProgram(dVar.f59698b.f59691a);
        dVar.f59700d = dVar.f59698b.a("rotation");
        dVar.f59701e = dVar.f59698b.a("flipScale");
        dVar.f59698b.b("vPosition");
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        int i2 = iArr[0];
        dVar.f59699c = i2;
        GLES20.glBindBuffer(34962, i2);
        float[] fArr = f59697a;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr).position(0);
        GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
        dVar.a(0.0f);
        dVar.b(1.0f);
        an.b("TextureDrawer", "init: success.");
        return dVar;
    }

    public final void a(float f2) {
        double d2 = (double) f2;
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        GLES20.glUseProgram(this.f59698b.f59691a);
        GLES20.glUniformMatrix2fv(this.f59700d, 1, false, new float[]{cos, sin, -sin, cos}, 0);
    }

    public final void b(float f2) {
        GLES20.glUseProgram(this.f59698b.f59691a);
        GLES20.glUniform2f(this.f59701e, 1.0f, 1.0f / f2);
    }

    public final void a(int i2) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i2);
        GLES20.glBindBuffer(34962, this.f59699c);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        GLES20.glUseProgram(this.f59698b.f59691a);
        GLES20.glDrawArrays(6, 0, 4);
    }
}
