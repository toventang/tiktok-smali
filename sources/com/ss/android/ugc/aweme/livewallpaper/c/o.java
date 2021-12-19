package com.ss.android.ugc.aweme.livewallpaper.c;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import java.nio.FloatBuffer;

public class o {

    /* renamed from: a  reason: collision with root package name */
    protected int f108840a;

    /* renamed from: b  reason: collision with root package name */
    protected int f108841b;

    /* renamed from: c  reason: collision with root package name */
    private int f108842c;

    /* renamed from: d  reason: collision with root package name */
    private int f108843d;

    /* renamed from: e  reason: collision with root package name */
    private int f108844e;

    /* renamed from: f  reason: collision with root package name */
    private int f108845f;

    /* renamed from: g  reason: collision with root package name */
    private int f108846g;

    /* renamed from: h  reason: collision with root package name */
    private int f108847h;

    /* renamed from: i  reason: collision with root package name */
    private FloatBuffer[] f108848i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f108849j;

    static {
        Covode.recordClassIndex(69710);
    }

    /* access modifiers changed from: protected */
    public int a() {
        return 3553;
    }

    /* access modifiers changed from: protected */
    public float[] d() {
        return p.f108854e;
    }

    /* access modifiers changed from: protected */
    public String[] b() {
        return new String[]{"attribute vec2 a_pos;\nattribute vec2 a_tex;\nvarying vec2 v_tex;\nuniform mat4 u_mvp;\nuniform mat4 u_tex_trans;\nvoid main() {\n   gl_Position = u_mvp * vec4(a_pos, 0.0, 1.0);\n   v_tex = (u_tex_trans * vec4(a_tex, 0.0, 1.0)).st;\n}\n", "precision mediump float;\nuniform sampler2D u_tex;\nuniform bool fmt_changed; \nvarying vec2 v_tex;\nvoid main() {\n   if (fmt_changed) {\n       gl_FragColor = vec4(texture2D(u_tex, v_tex).bgr, 1.0);\n   } else { \n       gl_FragColor = texture2D(u_tex, v_tex);\n   }\n}\n"};
    }

    private void e() {
        GLES20.glBindBuffer(34962, this.f108843d);
        GLES20.glBufferData(34962, 32, this.f108848i[0].rewind(), 35044);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.f108844e);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, 0);
    }

    public void c() {
        int i2 = this.f108842c;
        if (i2 != 0) {
            GLES20.glDeleteProgram(i2);
            this.f108842c = 0;
        }
        int i3 = this.f108843d;
        if (i3 != 0) {
            GLES20.glDeleteBuffers(1, new int[]{i3}, 0);
            this.f108843d = 0;
        }
        int i4 = this.f108844e;
        if (i4 != 0) {
            GLES20.glDeleteBuffers(1, new int[]{i4}, 0);
            this.f108844e = 0;
        }
        this.f108849j = false;
    }

    public final void a(int i2, float[] fArr) {
        if (this.f108849j) {
            GLES20.glClear(16640);
            GLES20.glUseProgram(this.f108842c);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(a(), i2);
            e();
            GLES20.glUniformMatrix4fv(this.f108845f, 1, false, i.f108813b, 0);
            if (fArr == null) {
                fArr = i.f108813b;
            }
            GLES20.glUniformMatrix4fv(this.f108846g, 1, false, fArr, 0);
            GLES20.glUniform1i(this.f108847h, 0);
            GLES20.glViewport(0, 0, this.f108840a * 2, this.f108841b * 2);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(0);
            GLES20.glDisableVertexAttribArray(1);
            GLES20.glBindBuffer(34962, 0);
            GLES20.glBindTexture(a(), 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0171 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 370
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livewallpaper.c.o.a(int, int):boolean");
    }

    public final void a(int i2, float[] fArr, float[] fArr2) {
        if (this.f108849j) {
            GLES20.glClear(16640);
            GLES20.glUseProgram(this.f108842c);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(a(), i2);
            e();
            GLES20.glUniformMatrix4fv(this.f108845f, 1, false, fArr2, 0);
            if (fArr == null) {
                fArr = i.f108813b;
            }
            GLES20.glUniformMatrix4fv(this.f108846g, 1, false, fArr, 0);
            GLES20.glUniform1i(this.f108847h, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(0);
            GLES20.glDisableVertexAttribArray(1);
            GLES20.glBindBuffer(34962, 0);
            GLES20.glBindTexture(a(), 0);
        }
    }
}
