package com.ss.texturerender.a;

import android.opengl.GLES20;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public final class l extends j {
    protected final float[] M = {1.660497f, -0.1245471f, -0.01815368f, -0.5876567f, 1.132895f, -0.1005973f, -0.07283995f, -0.008347984f, 1.118751f};
    private final String N = "precision highp float;\nuniform mat3 uCMSmatrix;\nuniform int hdrType;\nvec3 eotf_pq(vec3 color) {\n    color = max(color, 0.0);\n    color = pow(color, vec3(1.0/78.843750));\n    color = max(color - vec3(0.835938), 0.0) / (vec3(18.851562) - vec3(18.687500) * color);\n    color = pow(color, vec3(1.0/0.159302));\n    return color;\n}\nvec3 eotf_hlg(vec3 color) {\n    float HLG_A = 0.17883277;\n    float HLG_B = 0.28466892;\n    float HLG_C = 0.55991073;\n    vec3 mask = step(vec3(0.5), color);\n    color = mask * exp((color - vec3(HLG_C)) * vec3(1.0/HLG_A) + HLG_B) + (1.0 - mask) * vec3(4.0) * color * color;\n    color *= vec3(1.0/12.0);\n    color = clamp(color, 0.0, 1.0);\n    float lum = 0.2627 * color.r + 0.677998 * color.g + 0.059302 * color.b;\n    color = vec3(pow(lum, 0.2)) * color;\n    return color;\n}float _hable_3_0(float x) {\n    return ((x * (0.150000*x + 0.050000)+0.004000)/(x * (0.150000*x + 0.500000) + 0.060000)) - 0.066667;\n}\nvec3 toneMap(vec3 color, float peakLum) {\n    color = color * vec3(peakLum);\n    float sig = max(max(color.r, color.g), color.b);\n    float sig_peak = peakLum;\n    float luma = 0.2126368 * color.r + 0.715183 * color.g + 0.07218021 * color.b;\n    float coeff = max(sig - 0.18, 1e-6) / max(sig, 1e-6);\n    coeff = pow(coeff, 20.0);\n    sig = mix(sig, luma, coeff);\n    float sig_orig = max(sig, 1e-6);\n    sig = _hable_3_0(sig) / _hable_3_0(sig_peak);\n    sig = min(sig, 1.0);\n    color *= sig / sig_orig;\n    return color;\n}\nvec4 colorMapping(vec4 color) {\n    float peakLum = 0.0;    if (hdrType == 1) {\n        color.rgb = eotf_pq(color.rgb);\n        peakLum = 110.0;\n    } else {\n        color.rgb = eotf_hlg(color.rgb);\n        peakLum = 12.0;\n    } \n    color.rgb = uCMSmatrix * color.rgb;\n    color.rgb = toneMap(color.rgb, peakLum);\n    color.rgb = pow(color.rgb, vec3(1.0/2.2));\n    color.rgb = clamp(color.rgb, 0.0, 1.0);\n    return color;\n}\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main(void) {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = colorMapping(gl_FragColor);\n}\n";
    private int O;
    private int P;
    private int Q;

    static {
        Covode.recordClassIndex(101237);
    }

    @Override // com.ss.texturerender.a.j
    public final int b() {
        GLES20.glUniform1i(this.P, this.Q);
        return 0;
    }

    public l() {
        super(4);
        this.f151775c = 20;
    }

    @Override // com.ss.texturerender.a.j, com.ss.texturerender.a.a
    public final String b(int i2) {
        if (i2 != 11001) {
            return super.b(i2);
        }
        return "precision highp float;\nuniform mat3 uCMSmatrix;\nuniform int hdrType;\nvec3 eotf_pq(vec3 color) {\n    color = max(color, 0.0);\n    color = pow(color, vec3(1.0/78.843750));\n    color = max(color - vec3(0.835938), 0.0) / (vec3(18.851562) - vec3(18.687500) * color);\n    color = pow(color, vec3(1.0/0.159302));\n    return color;\n}\nvec3 eotf_hlg(vec3 color) {\n    float HLG_A = 0.17883277;\n    float HLG_B = 0.28466892;\n    float HLG_C = 0.55991073;\n    vec3 mask = step(vec3(0.5), color);\n    color = mask * exp((color - vec3(HLG_C)) * vec3(1.0/HLG_A) + HLG_B) + (1.0 - mask) * vec3(4.0) * color * color;\n    color *= vec3(1.0/12.0);\n    color = clamp(color, 0.0, 1.0);\n    float lum = 0.2627 * color.r + 0.677998 * color.g + 0.059302 * color.b;\n    color = vec3(pow(lum, 0.2)) * color;\n    return color;\n}float _hable_3_0(float x) {\n    return ((x * (0.150000*x + 0.050000)+0.004000)/(x * (0.150000*x + 0.500000) + 0.060000)) - 0.066667;\n}\nvec3 toneMap(vec3 color, float peakLum) {\n    color = color * vec3(peakLum);\n    float sig = max(max(color.r, color.g), color.b);\n    float sig_peak = peakLum;\n    float luma = 0.2126368 * color.r + 0.715183 * color.g + 0.07218021 * color.b;\n    float coeff = max(sig - 0.18, 1e-6) / max(sig, 1e-6);\n    coeff = pow(coeff, 20.0);\n    sig = mix(sig, luma, coeff);\n    float sig_orig = max(sig, 1e-6);\n    sig = _hable_3_0(sig) / _hable_3_0(sig_peak);\n    sig = min(sig, 1.0);\n    color *= sig / sig_orig;\n    return color;\n}\nvec4 colorMapping(vec4 color) {\n    float peakLum = 0.0;    if (hdrType == 1) {\n        color.rgb = eotf_pq(color.rgb);\n        peakLum = 110.0;\n    } else {\n        color.rgb = eotf_hlg(color.rgb);\n        peakLum = 12.0;\n    } \n    color.rgb = uCMSmatrix * color.rgb;\n    color.rgb = toneMap(color.rgb, peakLum);\n    color.rgb = pow(color.rgb, vec3(1.0/2.2));\n    color.rgb = clamp(color.rgb, 0.0, 1.0);\n    return color;\n}\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main(void) {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = colorMapping(gl_FragColor);\n}\n";
    }

    @Override // com.ss.texturerender.a.j, com.ss.texturerender.a.a
    public final int a(Bundle bundle) {
        super.a(bundle);
        GLES20.glUseProgram(this.p);
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.p, "uCMSmatrix");
        this.O = glGetUniformLocation;
        GLES20.glUniformMatrix3fv(glGetUniformLocation, 1, false, this.M, 0);
        this.P = GLES20.glGetUniformLocation(this.p, "hdrType");
        if (bundle != null) {
            this.Q = bundle.getInt("hdr_type");
        }
        com.ss.texturerender.l.a("TR_GLLutFilter", "init bundle:" + bundle.toString());
        return 0;
    }

    @Override // com.ss.texturerender.a.j, com.ss.texturerender.a.a
    public final void a(int i2, int i3) {
        if (i2 != 8) {
            super.a(i2, i3);
            return;
        }
        this.Q = i3;
        com.ss.texturerender.l.a("TR_GLLutFilter", "mHDRType:".concat(String.valueOf(i3)));
    }
}
