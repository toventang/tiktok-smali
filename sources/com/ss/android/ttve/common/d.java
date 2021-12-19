package com.ss.android.ttve.common;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.an;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int f61060a = GLES20.glCreateProgram();

    /* renamed from: b  reason: collision with root package name */
    private a f61061b;

    /* renamed from: c  reason: collision with root package name */
    private a f61062c;

    static {
        Covode.recordClassIndex(37608);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f61063a;

        /* renamed from: b  reason: collision with root package name */
        private int f61064b;

        static {
            Covode.recordClassIndex(37609);
        }

        public a() {
        }

        public final void a() {
            int i2 = this.f61063a;
            if (i2 != 0) {
                GLES20.glDeleteShader(i2);
                this.f61063a = 0;
            }
        }

        public a(String str, int i2) {
            this.f61064b = i2;
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                an.d("TEProgramObject", "before glCreateShader, glError: ".concat(String.valueOf(glGetError)));
            }
            int glCreateShader = GLES20.glCreateShader(i2);
            int glGetError2 = GLES20.glGetError();
            if (glGetError2 != 0) {
                an.d("TEProgramObject", "after glCreateShader, glError: ".concat(String.valueOf(glGetError2)));
            }
            if (glCreateShader != 0) {
                GLES20.glShaderSource(glCreateShader, str);
                GLES20.glCompileShader(glCreateShader);
                int glGetError3 = GLES20.glGetError();
                if (glGetError3 != 0) {
                    an.d("TEProgramObject", "after glCompileShader, glError: ".concat(String.valueOf(glGetError3)));
                }
                int[] iArr = {0};
                GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                if (iArr[0] != 1) {
                    an.d("TEProgramObject", GLES20.glGetShaderInfoLog(glCreateShader));
                    GLES20.glDeleteShader(glCreateShader);
                    glCreateShader = 0;
                }
            }
            this.f61063a = glCreateShader;
            if (glCreateShader == 0) {
                an.d("TEProgramObject", "glCreateShader Failed!...");
            }
        }
    }

    public final void a() {
        int i2 = this.f61060a;
        if (i2 != 0) {
            GLES20.glDeleteProgram(i2);
            this.f61060a = 0;
        }
    }

    public final int a(String str) {
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f61060a, str);
        if (glGetUniformLocation < 0) {
            com.a.a("uniform name %s does not exist", new Object[]{str});
        }
        return glGetUniformLocation;
    }

    public final void a(String str, int i2) {
        GLES20.glBindAttribLocation(this.f61060a, i2, str);
    }

    public final boolean a(String str, String str2) {
        String str3;
        int i2 = this.f61060a;
        if (i2 == 0) {
            i2 = GLES20.glCreateProgram();
        }
        a aVar = this.f61061b;
        if (aVar != null) {
            aVar.a();
        }
        a aVar2 = this.f61062c;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.f61061b = new a(str, 35633);
        this.f61062c = new a(str2, 35632);
        GLES20.glAttachShader(i2, this.f61061b.f61063a);
        GLES20.glAttachShader(i2, this.f61062c.f61063a);
        int glGetError = GLES20.glGetError();
        for (int i3 = 0; i3 < 32 && glGetError != 0; i3++) {
            switch (glGetError) {
                case 1280:
                    str3 = "invalid enum";
                    break;
                case 1281:
                    str3 = "invalid value";
                    break;
                case 1282:
                    str3 = "invalid operation";
                    break;
                case 1283:
                case 1284:
                default:
                    str3 = "unknown error";
                    break;
                case 1285:
                    str3 = "out of memory";
                    break;
                case 1286:
                    str3 = "invalid framebuffer operation";
                    break;
            }
            com.a.a("After tag \"%s\" glGetError %s(0x%x) ", new Object[]{"AttachShaders...", str3, Integer.valueOf(glGetError)});
            glGetError = GLES20.glGetError();
        }
        GLES20.glLinkProgram(i2);
        int[] iArr = {0};
        GLES20.glGetProgramiv(i2, 35714, iArr, 0);
        this.f61061b.a();
        this.f61062c.a();
        this.f61061b = null;
        this.f61062c = null;
        if (iArr[0] != 1) {
            GLES20.glGetProgramInfoLog(i2);
            return false;
        }
        int i4 = this.f61060a;
        if (!(i4 == i2 || i4 == 0)) {
            GLES20.glDeleteProgram(i4);
        }
        this.f61060a = i2;
        return true;
    }
}
