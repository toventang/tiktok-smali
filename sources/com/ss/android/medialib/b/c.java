package com.ss.android.medialib.b;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.an;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f59691a = GLES20.glCreateProgram();

    /* renamed from: b  reason: collision with root package name */
    private a f59692b;

    /* renamed from: c  reason: collision with root package name */
    private a f59693c;

    static {
        Covode.recordClassIndex(36867);
    }

    public static class a {

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ boolean f59694b = true;

        /* renamed from: a  reason: collision with root package name */
        public int f59695a;

        /* renamed from: c  reason: collision with root package name */
        private int f59696c;

        public a() {
        }

        static {
            Covode.recordClassIndex(36868);
        }

        public final void a() {
            int i2 = this.f59695a;
            if (i2 != 0) {
                GLES20.glDeleteShader(i2);
                this.f59695a = 0;
            }
        }

        public a(String str, int i2) {
            this.f59696c = i2;
            int glCreateShader = GLES20.glCreateShader(i2);
            if (glCreateShader != 0) {
                GLES20.glShaderSource(glCreateShader, str);
                GLES20.glCompileShader(glCreateShader);
                int[] iArr = {0};
                GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                if (iArr[0] != 1) {
                    an.d("ProgramObject", GLES20.glGetShaderInfoLog(glCreateShader));
                    GLES20.glDeleteShader(glCreateShader);
                    glCreateShader = 0;
                }
            }
            this.f59695a = glCreateShader;
            if (!f59694b) {
                if (glCreateShader == 0) {
                    throw new AssertionError("Shader Create Failed!");
                }
            } else if (glCreateShader == 0) {
                an.d("ProgramObject", "glCreateShader Failed!...");
            }
        }
    }

    public final void a() {
        int i2 = this.f59691a;
        if (i2 != 0) {
            GLES20.glDeleteProgram(i2);
            this.f59691a = 0;
        }
    }

    public final void b(String str) {
        GLES20.glBindAttribLocation(this.f59691a, 0, str);
    }

    public final int a(String str) {
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f59691a, str);
        if (glGetUniformLocation < 0) {
            an.d("ProgramObject", com.a.a("uniform name %s does not exist", new Object[]{str}));
        }
        return glGetUniformLocation;
    }

    public final boolean a(String str, String str2) {
        return a(str, str2, this.f59691a);
    }

    private boolean a(String str, String str2, int i2) {
        if (i2 == 0) {
            i2 = GLES20.glCreateProgram();
        }
        if (i2 == 0) {
            an.d("ProgramObject", "Invalid Program ID! Check if the context is binded!");
        }
        a aVar = this.f59692b;
        if (aVar != null) {
            aVar.a();
        }
        a aVar2 = this.f59693c;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.f59692b = new a(str, 35633);
        this.f59693c = new a(str2, 35632);
        GLES20.glAttachShader(i2, this.f59692b.f59695a);
        GLES20.glAttachShader(i2, this.f59693c.f59695a);
        a.a("AttachShaders...");
        GLES20.glLinkProgram(i2);
        int[] iArr = {0};
        GLES20.glGetProgramiv(i2, 35714, iArr, 0);
        this.f59692b.a();
        this.f59693c.a();
        this.f59692b = null;
        this.f59693c = null;
        if (iArr[0] != 1) {
            an.d("ProgramObject", GLES20.glGetProgramInfoLog(i2));
            return false;
        }
        int i3 = this.f59691a;
        if (!(i3 == i2 || i3 == 0)) {
            GLES20.glDeleteProgram(i3);
        }
        this.f59691a = i2;
        return true;
    }
}
