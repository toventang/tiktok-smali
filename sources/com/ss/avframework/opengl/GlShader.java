package com.ss.avframework.opengl;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.utils.AVLog;
import java.nio.Buffer;
import java.nio.FloatBuffer;

public class GlShader {
    private int program;

    static {
        Covode.recordClassIndex(100534);
    }

    public void release() {
        AVLog.d("GlShader", "Deleting shader.");
        int i2 = this.program;
        if (i2 != -1) {
            GLES20.glDeleteProgram(i2);
            this.program = -1;
        }
    }

    public void useProgram() {
        int i2 = this.program;
        if (i2 != -1) {
            GLES20.glUseProgram(i2);
            GlUtil.checkNoGLES2Error("glUseProgram");
            return;
        }
        throw new RuntimeException("The program has been released");
    }

    public int getAttribLocation(String str) {
        int i2 = this.program;
        if (i2 != -1) {
            int glGetAttribLocation = GLES20.glGetAttribLocation(i2, str);
            if (glGetAttribLocation >= 0) {
                return glGetAttribLocation;
            }
            throw new RuntimeException("Could not locate '" + str + "' in program");
        }
        throw new RuntimeException("The program has been released");
    }

    public int getUniformLocation(String str) {
        int i2 = this.program;
        if (i2 != -1) {
            int glGetUniformLocation = GLES20.glGetUniformLocation(i2, str);
            if (glGetUniformLocation >= 0) {
                return glGetUniformLocation;
            }
            throw new RuntimeException("Could not locate uniform '" + str + "' in program");
        }
        throw new RuntimeException("The program has been released");
    }

    private static int compileShader(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 1) {
                GlUtil.checkNoGLES2Error("compileShader");
                return glCreateShader;
            }
            AVLog.e("GlShader", "Could not compile shader " + i2 + ":" + GLES20.glGetShaderInfoLog(glCreateShader));
            throw new RuntimeException(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        throw new RuntimeException("glCreateShader() failed. GLES20 error: " + GLES20.glGetError());
    }

    public GlShader(String str, String str2) {
        int compileShader = compileShader(35633, str);
        int compileShader2 = compileShader(35632, str2);
        int glCreateProgram = GLES20.glCreateProgram();
        this.program = glCreateProgram;
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, compileShader);
            GLES20.glAttachShader(this.program, compileShader2);
            GLES20.glLinkProgram(this.program);
            int[] iArr = {0};
            GLES20.glGetProgramiv(this.program, 35714, iArr, 0);
            if (iArr[0] == 1) {
                GLES20.glDeleteShader(compileShader);
                GLES20.glDeleteShader(compileShader2);
                GlUtil.checkNoGLES2Error("Creating GlShader");
                return;
            }
            AVLog.e("GlShader", "Could not link program: " + GLES20.glGetProgramInfoLog(this.program));
            throw new RuntimeException(GLES20.glGetProgramInfoLog(this.program));
        }
        throw new RuntimeException("glCreateProgram() failed. GLES20 error: " + GLES20.glGetError());
    }

    public void setVertexAttribArray(String str, int i2, FloatBuffer floatBuffer) {
        setVertexAttribArray(str, i2, 0, floatBuffer);
    }

    public void setVertexAttribArray(String str, int i2, int i3, FloatBuffer floatBuffer) {
        if (this.program != -1) {
            int attribLocation = getAttribLocation(str);
            GLES20.glEnableVertexAttribArray(attribLocation);
            GLES20.glVertexAttribPointer(attribLocation, i2, 5126, false, i3, (Buffer) floatBuffer);
            GlUtil.checkNoGLES2Error("setVertexAttribArray");
            return;
        }
        throw new RuntimeException("The program has been released");
    }
}
