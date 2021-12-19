package com.ss.texturerender.a;

import android.opengl.GLES20;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.texturerender.f;
import com.ss.texturerender.l;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class j extends a {
    public static float[] n = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    public static float[] o = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    protected int A;
    protected int B;
    protected int C;
    protected float D;
    protected float E;
    protected float F;
    protected float G;
    protected float H;
    protected float[] I;
    protected int J;
    protected boolean K;
    protected boolean L;
    private final String M;
    private final String N;

    /* renamed from: i  reason: collision with root package name */
    int f151803i;

    /* renamed from: j  reason: collision with root package name */
    int f151804j;

    /* renamed from: k  reason: collision with root package name */
    int f151805k;

    /* renamed from: l  reason: collision with root package name */
    int f151806l;

    /* renamed from: m  reason: collision with root package name */
    int f151807m;
    protected int p;
    protected int q;
    protected int r;
    protected FloatBuffer s;
    protected FloatBuffer t;
    protected int u;
    protected int v;
    protected int w;
    protected int x;
    protected boolean y;
    protected int z;

    public int b() {
        return 0;
    }

    public int c() {
        return 0;
    }

    public j() {
        this(7);
    }

    @Override // com.ss.texturerender.a.a
    public a a() {
        int i2 = this.p;
        if (i2 > 0) {
            GLES20.glDeleteProgram(i2);
        }
        return super.a();
    }

    private void d() {
        int i2 = this.J;
        if (i2 != 0) {
            a(this.t, i2);
        }
        if (this.K) {
            a(30, this.t);
        }
        if (this.L) {
            a(31, this.t);
        }
    }

    static {
        Covode.recordClassIndex(101235);
    }

    @Override // com.ss.texturerender.a.a
    public String b(int i2) {
        if (i2 == 11000) {
            return "attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position =  aPosition;\n  vTextureCoord = aTextureCoord.xy;\n}\n";
        }
        if (i2 != 11001) {
            return super.b(i2);
        }
        return "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    }

    public j(int i2) {
        super(i2);
        this.M = "attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position =  aPosition;\n  vTextureCoord = aTextureCoord.xy;\n}\n";
        this.N = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        this.f151803i = 12;
        this.f151804j = 8;
        this.f151807m = 4;
        this.u = -1;
        this.v = -1;
        this.y = true;
        this.C = 1;
        this.D = 0.5f;
        this.G = 1.0f;
        this.H = 1.0f;
        this.f151774b = 3553;
    }

    @Override // com.ss.texturerender.a.a
    public void b(Bundle bundle) {
        if (bundle != null) {
            int i2 = bundle.getInt("action", -1);
            if (bundle.getInt("effect_type", -1) != 11) {
                return;
            }
            if (i2 == 21 || i2 == 28) {
                float f2 = bundle.getFloat("width", 1.0f);
                float f3 = bundle.getFloat("height", 1.0f);
                float f4 = 0.0f;
                float f5 = bundle.getFloat("x", 0.0f);
                float f6 = bundle.getFloat("y", 0.0f);
                if (f5 <= 1.0f && f5 >= 0.0f && f6 <= 1.0f && f6 >= 0.0f && f2 > 0.0f && f3 > 0.0f) {
                    if (f6 != this.F || f5 != this.E || f2 != this.G || f3 != this.H) {
                        this.G = f2;
                        this.H = f3;
                        this.E = f5;
                        this.F = f6;
                        if (f5 < 0.0f) {
                            f5 = 0.0f;
                        }
                        this.E = f5;
                        if (f6 >= 0.0f) {
                            f4 = f6;
                        }
                        this.F = f4;
                        if (f5 + f2 > 1.0f) {
                            f2 = 1.0f - f5;
                        }
                        this.G = f2;
                        if (f4 + f3 > 1.0f) {
                            f3 = 1.0f - f4;
                        }
                        this.H = f3;
                        this.I = new float[]{f5, f4, f5 + f2, f4, f5, f4 + f3, f5 + f2, f4 + f3};
                        l.a("TR_GLDefaultFilter", "param set success, bundle:".concat(String.valueOf(bundle)));
                    }
                }
            }
        }
    }

    @Override // com.ss.texturerender.a.a
    public int a(Bundle bundle) {
        int a2 = f.a(35633, b(11000));
        int a3 = f.a(35632, b(11001));
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, a2);
            GLES20.glAttachShader(glCreateProgram, a3);
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 0) {
                l.a("ShaderHelper", "Error compiling program: " + GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
            } else {
                this.p = glCreateProgram;
                this.z = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
                FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(o.length * this.f151807m).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.t = asFloatBuffer;
                asFloatBuffer.put(o).position(0);
                FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(n.length * this.f151807m).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.s = asFloatBuffer2;
                asFloatBuffer2.put(n).position(0);
                this.q = GLES20.glGetAttribLocation(this.p, "aPosition");
                this.r = GLES20.glGetAttribLocation(this.p, "aTextureCoord");
                return 0;
            }
        }
        throw new RuntimeException("Error creating program.");
    }

    @Override // com.ss.texturerender.a.a
    public void a(int i2, float f2) {
        if (i2 == 27) {
            this.D = f2;
        }
    }

    @Override // com.ss.texturerender.a.a
    public final void a(int i2, float[] fArr) {
        if (i2 != 13000) {
            super.a(i2, fArr);
        } else if (fArr != null) {
            this.t.position(this.f151806l);
            this.t.put(fArr);
        }
    }

    private void a(int i2, FloatBuffer floatBuffer) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(o.length * this.f151807m).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBuffer.rewind();
        asFloatBuffer.put(floatBuffer);
        floatBuffer.rewind();
        asFloatBuffer.flip();
        if (i2 == 30) {
            this.t.put(0, asFloatBuffer.get(2));
            this.t.put(1, asFloatBuffer.get(3));
            this.t.put(2, asFloatBuffer.get(0));
            this.t.put(3, asFloatBuffer.get(1));
            this.t.put(4, asFloatBuffer.get(6));
            this.t.put(5, asFloatBuffer.get(7));
            this.t.put(6, asFloatBuffer.get(4));
            this.t.put(7, asFloatBuffer.get(5));
        } else if (i2 == 31) {
            this.t.put(0, asFloatBuffer.get(4));
            this.t.put(1, asFloatBuffer.get(5));
            this.t.put(2, asFloatBuffer.get(6));
            this.t.put(3, asFloatBuffer.get(7));
            this.t.put(4, asFloatBuffer.get(0));
            this.t.put(5, asFloatBuffer.get(1));
            this.t.put(6, asFloatBuffer.get(2));
            this.t.put(7, asFloatBuffer.get(3));
        } else {
            this.t.put(asFloatBuffer).position(this.f151806l);
        }
        asFloatBuffer.clear();
    }

    private void a(FloatBuffer floatBuffer, int i2) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(o.length * this.f151807m).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBuffer.rewind();
        asFloatBuffer.put(floatBuffer);
        floatBuffer.rewind();
        asFloatBuffer.flip();
        if (i2 < 0) {
            i2 += 360;
        }
        if (i2 == 90) {
            this.t.put(0, asFloatBuffer.get(2));
            this.t.put(1, asFloatBuffer.get(3));
            this.t.put(2, asFloatBuffer.get(6));
            this.t.put(3, asFloatBuffer.get(7));
            this.t.put(4, asFloatBuffer.get(0));
            this.t.put(5, asFloatBuffer.get(1));
            this.t.put(6, asFloatBuffer.get(4));
            this.t.put(7, asFloatBuffer.get(5));
        } else if (i2 == 180) {
            this.t.put(0, asFloatBuffer.get(6));
            this.t.put(1, asFloatBuffer.get(7));
            this.t.put(2, asFloatBuffer.get(4));
            this.t.put(3, asFloatBuffer.get(5));
            this.t.put(4, asFloatBuffer.get(2));
            this.t.put(5, asFloatBuffer.get(3));
            this.t.put(6, asFloatBuffer.get(0));
            this.t.put(7, asFloatBuffer.get(1));
        } else if (i2 == 270) {
            this.t.put(0, asFloatBuffer.get(4));
            this.t.put(1, asFloatBuffer.get(5));
            this.t.put(2, asFloatBuffer.get(0));
            this.t.put(3, asFloatBuffer.get(1));
            this.t.put(4, asFloatBuffer.get(6));
            this.t.put(5, asFloatBuffer.get(7));
            this.t.put(6, asFloatBuffer.get(2));
            this.t.put(7, asFloatBuffer.get(3));
        } else {
            this.t.put(asFloatBuffer).position(this.f151806l);
        }
        asFloatBuffer.clear();
    }

    @Override // com.ss.texturerender.a.a
    public f a(f fVar, i iVar) {
        f fVar2;
        if (fVar.f151799e != this.f151774b) {
            l.a(getClass().getSimpleName(), "error, texture miss match, accept:" + this.f151774b + ",in:" + fVar.f151799e);
            return fVar;
        }
        int round = Math.round(((float) fVar.f151797c) * this.G);
        int round2 = Math.round(((float) fVar.f151798d) * this.H);
        if (iVar != null) {
            this.A = round;
            this.B = round2;
            this.u = round;
            this.v = round2;
            this.x = 0;
            this.w = 0;
            a(13000, this.I);
        } else {
            int i2 = this.u;
            int i3 = this.v;
            float f2 = (float) round2;
            float f3 = (float) round;
            float f4 = (f2 * 1.0f) / f3;
            float f5 = ((float) i3) * 1.0f;
            float f6 = (float) i2;
            float f7 = f5 / f6;
            int i4 = this.C;
            if (i4 == 0) {
                if (f7 > f4) {
                    int i5 = this.J;
                    if (i5 == 90 || i5 == 270) {
                        int min = Math.min((int) (f5 * f4), i2);
                        this.u = min;
                        int i6 = (int) ((((float) min) * 1.0f) / f4);
                        this.v = i6;
                        float f8 = (float) (i2 - min);
                        float f9 = this.D;
                        this.w = (int) (f8 * f9);
                        this.x = (int) (((float) (i3 - i6)) * f9);
                    } else {
                        this.u = i2;
                        int i7 = (int) (f6 * 1.0f * f4);
                        this.v = i7;
                        this.w = 0;
                        this.x = (int) (((float) (i3 - i7)) * this.D);
                    }
                } else {
                    int i8 = this.J;
                    if (i8 == 90 || i8 == 270) {
                        int min2 = Math.min((int) ((f6 * 1.0f) / f4), i3);
                        this.v = min2;
                        int i9 = (int) (((float) min2) * 1.0f * f4);
                        this.u = i9;
                        float f10 = (float) (i2 - i9);
                        float f11 = this.D;
                        this.w = (int) (f10 * f11);
                        this.x = (int) (((float) (i3 - min2)) * f11);
                    } else {
                        int i10 = (int) (f5 / f4);
                        this.u = i10;
                        this.v = i3;
                        this.w = (int) (((float) (i2 - i10)) * this.D);
                        this.x = 0;
                    }
                }
                a(13000, this.I);
            } else if (i4 == 2) {
                this.u = i2;
                this.v = i3;
                this.x = 0;
                this.w = 0;
                int i11 = this.J;
                if (i11 == 90 || i11 == 270) {
                    float f12 = (f3 * 1.0f) / f2;
                    if (f7 > f12) {
                        float f13 = 1.0f - (f12 / f7);
                        this.t.put(0, this.E);
                        this.t.put(1, this.F + (this.H * f13 * this.D));
                        this.t.put(2, this.E + this.G);
                        this.t.put(5, this.F + (this.H * (1.0f - (f13 * (1.0f - this.D)))));
                    } else {
                        float f14 = 1.0f - (f7 / f12);
                        this.t.put(0, this.E + (this.G * f14 * this.D));
                        this.t.put(1, this.F);
                        this.t.put(2, this.E + (this.G * (1.0f - (f14 * this.D))));
                        this.t.put(5, this.F + this.H);
                    }
                } else if (f7 > f4) {
                    float f15 = 1.0f - (f4 / f7);
                    this.t.put(0, this.E + (this.G * f15 * this.D));
                    this.t.put(1, this.F);
                    this.t.put(2, this.E + (this.G * (1.0f - (f15 * (1.0f - this.D)))));
                    this.t.put(5, this.F + this.H);
                } else {
                    float f16 = 1.0f - (f7 / f4);
                    this.t.put(0, this.E);
                    this.t.put(1, this.F + (this.H * f16 * this.D));
                    this.t.put(2, this.E + this.G);
                    this.t.put(5, this.F + (this.H * (1.0f - (f16 * (1.0f - this.D)))));
                }
                FloatBuffer floatBuffer = this.t;
                floatBuffer.put(3, floatBuffer.get(1));
                FloatBuffer floatBuffer2 = this.t;
                floatBuffer2.put(4, floatBuffer2.get(0));
                FloatBuffer floatBuffer3 = this.t;
                floatBuffer3.put(6, floatBuffer3.get(2));
                FloatBuffer floatBuffer4 = this.t;
                floatBuffer4.put(7, floatBuffer4.get(5));
                d();
            } else {
                this.u = i2;
                this.v = i3;
                this.x = 0;
                this.w = 0;
                a(13000, this.I);
            }
        }
        if (iVar != null) {
            if (this.A == 0 || this.B == 0) {
                l.a("TR_GLDefaultFilter", "error width or height, w:" + this.A + " h:" + this.B);
            }
            fVar2 = this.f151778f.f151854m.a(this.A, this.B);
            iVar.a(fVar2.f151795a);
        } else {
            fVar2 = null;
        }
        GLES20.glUseProgram(this.p);
        if (this.y) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glViewport(this.w, this.x, this.u, this.v);
        this.s.position(this.f151805k);
        GLES20.glVertexAttribPointer(this.q, 3, 5126, false, this.f151803i, (Buffer) this.s);
        GLES20.glEnableVertexAttribArray(this.q);
        this.t.position(this.f151806l);
        GLES20.glVertexAttribPointer(this.r, 2, 5126, false, this.f151804j, (Buffer) this.t);
        GLES20.glEnableVertexAttribArray(this.r);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.f151774b, fVar.f151795a);
        GLES20.glUniform1i(this.z, 0);
        b();
        GLES20.glDrawArrays(5, 0, 4);
        c();
        GLES20.glBindTexture(this.f151774b, 0);
        GLES20.glDisableVertexAttribArray(this.q);
        GLES20.glDisableVertexAttribArray(this.r);
        this.f151776d.setOption(19, this.f151773a, 1);
        fVar.a();
        if (iVar == null) {
            return null;
        }
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        GLES20.glBindFramebuffer(36160, 0);
        return fVar2;
    }

    @Override // com.ss.texturerender.a.a
    public void a(int i2, int i3) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (i2 != 26) {
            switch (i2) {
                case 29:
                    int i4 = this.J;
                    if (i4 != i3) {
                        a(this.t, i3 - i4);
                        this.J = i3;
                        return;
                    }
                    return;
                case 30:
                    boolean z5 = this.K;
                    if (i3 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z5 != z2) {
                        if (i3 > 0) {
                            z4 = true;
                        }
                        this.K = z4;
                        a(30, this.t);
                        return;
                    }
                    return;
                case 31:
                    boolean z6 = this.L;
                    if (i3 > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z6 != z3) {
                        if (i3 > 0) {
                            z4 = true;
                        }
                        this.L = z4;
                        a(31, this.t);
                        return;
                    }
                    return;
                default:
                    switch (i2) {
                        case 10006:
                            this.u = i3;
                            return;
                        case 10007:
                            this.v = i3;
                            return;
                        case 10008:
                            this.w = i3;
                            return;
                        case 10009:
                            this.x = i3;
                            return;
                        case 10010:
                            if (i3 == 1) {
                                z4 = true;
                            }
                            this.y = z4;
                            return;
                        default:
                            super.a(i2, i3);
                            return;
                    }
            }
        } else if (this.C != i3) {
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(o.length * this.f151807m).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.t = asFloatBuffer;
            asFloatBuffer.put(o).position(0);
            this.C = i3;
            d();
        }
    }
}
