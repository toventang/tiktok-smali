package com.ss.texturerender.a;

import android.opengl.GLES20;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.texturerender.l;

public final class k extends j {
    private final String M = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float gaussianWeights[44];\nuniform int radius;\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\nuniform float gaussianAlpha;\nvoid main() {\n    vec4 sum = texture2D(sTexture, vTextureCoord) * gaussianWeights[0];\n    for (int i = 1; i <= radius; i++) {\n        vec2 stepOffset = vec2(texelWidthOffset * float(i), texelHeightOffset * float(i));\n        sum += texture2D(sTexture, vTextureCoord + stepOffset) * gaussianWeights[i];\n        sum += texture2D(sTexture, vTextureCoord - stepOffset) * gaussianWeights[i];\n    }\n    gl_FragColor = vec4(sum.rgb, gaussianAlpha);\n}\n";
    private int N;
    private float O = 2.0f;
    private boolean P;
    private int Q = -1;
    private int R = -1;
    private int S = -1;
    private int T = -1;
    private int U = -1;
    private float V;
    private float W;
    private float[] X;
    private float Y = 1.0f;

    static {
        Covode.recordClassIndex(101236);
    }

    @Override // com.ss.texturerender.a.j
    public final int c() {
        GLES20.glDisable(3042);
        return 0;
    }

    public k() {
        super(10);
        this.f151775c = 6;
        l.a("TR_GLGaussianBlurFilter", "new GLGaussianBlurFilter,this:".concat(String.valueOf(this)));
    }

    @Override // com.ss.texturerender.a.j
    public final int b() {
        if (!this.P) {
            GLES20.glUniform1fv(this.Q, this.N + 1, this.X, 0);
            this.P = true;
        }
        GLES20.glUniform1i(this.T, this.N);
        GLES20.glUniform1f(this.R, this.V);
        GLES20.glUniform1f(this.S, this.W);
        GLES20.glUniform1f(this.U, this.Y);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        return 0;
    }

    @Override // com.ss.texturerender.a.j, com.ss.texturerender.a.a
    public final String b(int i2) {
        if (i2 != 11001) {
            return super.b(i2);
        }
        return "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float gaussianWeights[44];\nuniform int radius;\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\nuniform float gaussianAlpha;\nvoid main() {\n    vec4 sum = texture2D(sTexture, vTextureCoord) * gaussianWeights[0];\n    for (int i = 1; i <= radius; i++) {\n        vec2 stepOffset = vec2(texelWidthOffset * float(i), texelHeightOffset * float(i));\n        sum += texture2D(sTexture, vTextureCoord + stepOffset) * gaussianWeights[i];\n        sum += texture2D(sTexture, vTextureCoord - stepOffset) * gaussianWeights[i];\n    }\n    gl_FragColor = vec4(sum.rgb, gaussianAlpha);\n}\n";
    }

    @Override // com.ss.texturerender.a.j, com.ss.texturerender.a.a
    public final int a(Bundle bundle) {
        super.a(bundle);
        this.Q = GLES20.glGetUniformLocation(this.p, "gaussianWeights");
        this.R = GLES20.glGetUniformLocation(this.p, "texelWidthOffset");
        this.S = GLES20.glGetUniformLocation(this.p, "texelHeightOffset");
        this.T = GLES20.glGetUniformLocation(this.p, "radius");
        this.U = GLES20.glGetUniformLocation(this.p, "gaussianAlpha");
        float f2 = bundle.getFloat("strength", -1.0f);
        if (f2 > 1.0f) {
            a(f2);
        } else {
            a(2.0f);
        }
        this.Y = bundle.getFloat("alpha", 1.0f);
        l.a("TR_GLGaussianBlurFilter", "GLGaussianBlurFilter init,this:".concat(String.valueOf(this)));
        return 0;
    }

    @Override // com.ss.texturerender.a.j, com.ss.texturerender.a.a
    public final void b(Bundle bundle) {
        if (bundle != null && this.f151773a == bundle.getInt("effect_type")) {
            l.a("TR_GLGaussianBlurFilter", "setOption:" + bundle.toString() + ",this:" + this);
            if (bundle.getInt("action") == 20) {
                float f2 = bundle.getFloat("float_value", -1.0f);
                if (f2 != this.O && f2 > 0.0f) {
                    a(f2);
                    l.a("TR_GLGaussianBlurFilter", "set strength:" + this.O + ",this:" + this);
                }
            }
        }
    }

    private void a(float f2) {
        float max = Math.max(Math.min(f2, 26.0f), 1.0f);
        this.O = max;
        this.N = (int) Math.floor(Math.sqrt(Math.pow((double) max, 2.0d) * -2.0d * Math.log(Math.sqrt(Math.pow((double) this.O, 2.0d) * 6.283185307179586d) * 0.00390625d)));
        l.a("TR_GLGaussianBlurFilter", "updateGaussianWeights sigma:" + this.O + ",mBlurRadius:" + this.N);
        this.X = new float[(this.N + 1)];
        for (int i2 = 0; i2 <= this.N; i2++) {
            this.X[i2] = (float) a(this.O, i2);
        }
        float f3 = this.X[0];
        for (int i3 = 1; i3 <= this.N; i3++) {
            f3 += this.X[i3] * 2.0f;
        }
        for (int i4 = 0; i4 <= this.N; i4++) {
            float[] fArr = this.X;
            fArr[i4] = fArr[i4] / f3;
        }
        this.P = false;
    }

    private static double a(float f2, int i2) {
        double d2 = (double) f2;
        return (1.0d / Math.sqrt(Math.pow(d2, 2.0d) * 6.283185307179586d)) * Math.exp((-Math.pow((double) i2, 2.0d)) / (Math.pow(d2, 2.0d) * 2.0d));
    }

    @Override // com.ss.texturerender.a.j, com.ss.texturerender.a.a
    public final f a(f fVar, i iVar) {
        if (this.O == 1.0f) {
            return fVar;
        }
        double texWidth = (double) this.f151776d.getTexWidth();
        Double.isNaN(texWidth);
        this.V = (float) (1.0d / texWidth);
        this.W = 0.0f;
        f a2 = super.a(fVar, iVar);
        this.V = 0.0f;
        double texHeight = (double) this.f151776d.getTexHeight();
        Double.isNaN(texHeight);
        this.W = (float) (1.0d / texHeight);
        return super.a(a2, iVar);
    }

    @Override // com.ss.texturerender.a.j, com.ss.texturerender.a.a
    public final void a(int i2, float f2) {
        if (i2 == 20 && f2 != this.O) {
            a(f2);
            l.a("TR_GLGaussianBlurFilter", "set strength:" + this.O + ",this:" + this);
        }
    }
}
