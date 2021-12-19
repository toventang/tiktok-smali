package com.ss.android.medialib.b;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f59689a = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: com.ss.android.medialib.b.a$a  reason: collision with other inner class name */
    public interface AbstractC1301a {
        static {
            Covode.recordClassIndex(36863);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(36864);
        }

        void a();

        int b();

        void c();
    }

    public interface c {
        static {
            Covode.recordClassIndex(36865);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(36862);
    }

    public static void a(String str) {
        String str2;
        int glGetError = GLES20.glGetError();
        int i2 = 0;
        while (glGetError != 0) {
            switch (glGetError) {
                case 1280:
                    str2 = "invalid enum";
                    break;
                case 1281:
                    str2 = "invalid value";
                    break;
                case 1282:
                    str2 = "invalid operation";
                    break;
                case 1283:
                case 1284:
                default:
                    str2 = "unknown error";
                    break;
                case 1285:
                    str2 = "out of memory";
                    break;
                case 1286:
                    str2 = "invalid framebuffer operation";
                    break;
            }
            com.a.a("After tag \"%s\" glGetError %s(0x%x) ", new Object[]{str, str2, Integer.valueOf(glGetError)});
            glGetError = GLES20.glGetError();
            i2++;
            if (i2 >= 32) {
                return;
            }
        }
    }
}
