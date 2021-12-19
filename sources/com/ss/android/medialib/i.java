package com.ss.android.medialib;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.b.c;
import com.ss.android.vesdk.an;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f59726a = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: b  reason: collision with root package name */
    protected c f59727b;

    /* renamed from: c  reason: collision with root package name */
    private int f59728c;

    /* renamed from: d  reason: collision with root package name */
    private int f59729d;

    /* renamed from: e  reason: collision with root package name */
    private int f59730e;

    /* renamed from: f  reason: collision with root package name */
    private int f59731f;

    /* renamed from: g  reason: collision with root package name */
    private int f59732g;

    /* renamed from: h  reason: collision with root package name */
    private int f59733h;

    /* renamed from: i  reason: collision with root package name */
    private int f59734i;

    /* renamed from: j  reason: collision with root package name */
    private int f59735j;

    /* renamed from: k  reason: collision with root package name */
    private int f59736k;

    /* renamed from: l  reason: collision with root package name */
    private int f59737l;

    /* renamed from: m  reason: collision with root package name */
    private int f59738m;
    private int n;

    protected i() {
    }

    public final void a() {
        this.f59727b.a();
        GLES20.glDeleteBuffers(1, new int[]{this.f59728c}, 0);
        this.f59727b = null;
        this.f59728c = 0;
    }

    static {
        Covode.recordClassIndex(36884);
    }

    public final void b() {
        float cos = (float) Math.cos(0.0d);
        float sin = (float) Math.sin(0.0d);
        GLES20.glUseProgram(this.f59727b.f59691a);
        GLES20.glUniformMatrix2fv(this.f59729d, 1, false, new float[]{cos, sin, -sin, cos}, 0);
    }

    public final void b(float f2) {
        GLES20.glUseProgram(this.f59727b.f59691a);
        GLES20.glUniform1f(this.f59733h, f2);
    }

    public final void a(float f2) {
        GLES20.glUseProgram(this.f59727b.f59691a);
        GLES20.glUniform2f(this.f59730e, 1.0f, 1.0f / f2);
    }

    public static i a(float f2, float f3) {
        i iVar = new i();
        c cVar = new c();
        iVar.f59727b = cVar;
        if (!cVar.a("attribute highp vec2 vPosition;\nvarying vec2 texCoord;\nuniform mat2 rotation;\nuniform vec2 flipScale;\nvoid main()\n{\n   gl_Position = vec4(vPosition, 0.0, 1.0);\n   texCoord = flipScale * (vPosition / 2.0 * rotation) + 0.5;\n}", "precision mediump float;\nvarying vec2 texCoord;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nuniform float xPos;\nuniform float yPos;\nuniform float bottomPos;\nuniform float rightPos;\nuniform float markAlpha;\nuniform float xAdjust;\nuniform float yAdjust;\nvec4 normalBlend(vec4 c2, vec4 c1)\n{\n   vec4 outputColor;\n   outputColor.r = c1.r * markAlpha + c2.r * c2.a * (1.0 - c1.a);\n   outputColor.g = c1.g * markAlpha + c2.g * c2.a * (1.0 - c1.a);\n   outputColor.b = c1.b * markAlpha + c2.b * c2.a * (1.0 - c1.a);\n   outputColor.a = c1.a + c2.a * (1.0 - c1.a);\n   return outputColor;\n}\nvoid main()\n{\n   highp vec2 cord;\n   cord.x = texCoord.x * xAdjust- (xAdjust - 1.0) * 0.5;\n   cord.y = texCoord.y * yAdjust- (yAdjust - 1.0) * 0.5;\n   vec4 origin;\n   if(cord.x > 0.0 && cord.x < 1.0 && cord.y > 0.0 && cord.y < 1.0)\n   {\n       origin = texture2D(inputImageTexture, cord);\n   } else {\n       origin = vec4(1.0, 1.0, 1.0, 1.0);\n   }\n   vec4 markOverlay;\n   vec2 tmpCoordinate;\n   tmpCoordinate.x = cord.x;\n   tmpCoordinate.y = 1.0 - cord.y;\n   origin.a = origin.a * markAlpha;\n   if( cord.x > xPos && cord.x < bottomPos && cord.y > yPos && cord.y < rightPos )\n   {\n       tmpCoordinate.x = (cord.x - xPos) / (bottomPos - xPos);\n       tmpCoordinate.y = 1.0 - (cord.y - yPos) / (rightPos - yPos);\n       markOverlay = texture2D(inputImageTexture2, tmpCoordinate);\n       markOverlay.a = markOverlay.a * markAlpha;\n       origin = normalBlend(origin, markOverlay);\n   }\n   gl_FragColor = vec4(origin.r, origin.g, origin.b, origin.a);\n}")) {
            iVar.f59727b.a();
            iVar.f59727b = null;
            an.d("TextureDrawer", "TextureDrawer create failed!");
            iVar.a();
            return null;
        }
        GLES20.glUseProgram(iVar.f59727b.f59691a);
        iVar.f59729d = iVar.f59727b.a("rotation");
        iVar.f59730e = iVar.f59727b.a("flipScale");
        iVar.f59731f = iVar.f59727b.a("inputImageTexture");
        iVar.f59732g = iVar.f59727b.a("inputImageTexture2");
        iVar.f59733h = iVar.f59727b.a("markAlpha");
        iVar.f59734i = iVar.f59727b.a("xPos");
        iVar.f59735j = iVar.f59727b.a("yPos");
        iVar.f59736k = iVar.f59727b.a("bottomPos");
        iVar.f59737l = iVar.f59727b.a("rightPos");
        iVar.f59738m = iVar.f59727b.a("xAdjust");
        iVar.n = iVar.f59727b.a("yAdjust");
        iVar.f59727b.b("vPosition");
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        int i2 = iArr[0];
        iVar.f59728c = i2;
        GLES20.glBindBuffer(34962, i2);
        float[] fArr = f59726a;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr).position(0);
        GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
        iVar.b();
        iVar.a(1.0f);
        iVar.b(1.0f);
        GLES20.glUseProgram(iVar.f59727b.f59691a);
        GLES20.glUniform1f(iVar.f59738m, f2);
        GLES20.glUniform1f(iVar.n, f3);
        an.b("TextureDrawer", "init: success.");
        return iVar;
    }

    public final void a(int i2, int i3) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i2);
        GLES20.glUniform1i(this.f59731f, 0);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, i3);
        GLES20.glUniform1i(this.f59732g, 2);
        GLES20.glBindBuffer(34962, this.f59728c);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        GLES20.glUseProgram(this.f59727b.f59691a);
        GLES20.glDrawArrays(6, 0, 4);
    }

    public final void a(float f2, float f3, float f4, float f5) {
        GLES20.glUseProgram(this.f59727b.f59691a);
        GLES20.glUniform1f(this.f59734i, f2);
        GLES20.glUniform1f(this.f59735j, f3);
        GLES20.glUniform1f(this.f59736k, f4);
        GLES20.glUniform1f(this.f59737l, f5);
    }
}
