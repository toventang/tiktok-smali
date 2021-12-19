package com.ss.android.ugc.aweme.live.alphaplayer.f;

import android.content.res.Resources;
import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public final class d {
    static {
        Covode.recordClassIndex(69396);
    }

    public static void a() {
        do {
        } while (GLES20.glGetError() != 0);
    }

    private static int a(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static int a(String str, String str2) {
        int a2;
        int a3 = a(35633, str);
        if (a3 == 0 || (a2 = a(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, a3);
            do {
            } while (GLES20.glGetError() != 0);
            GLES20.glAttachShader(glCreateProgram, a2);
            do {
            } while (GLES20.glGetError() != 0);
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                GLES20.glGetProgramInfoLog(glCreateProgram);
                GLES20.glDeleteProgram(glCreateProgram);
                return 0;
            }
        }
        return glCreateProgram;
    }

    public static String a(String str, Resources resources) {
        Exception e2;
        MethodCollector.i(3579);
        String str2 = null;
        try {
            InputStream open = resources.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = open.read();
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            open.close();
            String str3 = new String(byteArray, "UTF-8");
            try {
                str2 = str3.replaceAll("\\r\\n", "\n");
            } catch (Exception e3) {
                e2 = e3;
                str2 = str3;
            }
        } catch (Exception e4) {
            e2 = e4;
            e2.printStackTrace();
            MethodCollector.o(3579);
            return str2;
        }
        MethodCollector.o(3579);
        return str2;
    }
}
