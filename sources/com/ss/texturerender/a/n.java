package com.ss.texturerender.a;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.ss.texturerender.l;

public final class n extends j {
    private final String M = "precision mediump float;\nuniform sampler2D sTexture;\nvarying vec2 vTextureCoord;\nvoid main() {\n    vec4 tmpFrag = texture2D(sTexture, vTextureCoord);\n    float rbAver = tmpFrag.r * 0.5 + tmpFrag.b * 0.5;\n    float delta = tmpFrag.g - rbAver;\n    tmpFrag.a = 1.0 - smoothstep(0.0, 0.25, delta);\n    tmpFrag.a = tmpFrag.a * tmpFrag.a * tmpFrag.a;\n    gl_FragColor = tmpFrag;\n}";

    static {
        Covode.recordClassIndex(101240);
    }

    @Override // com.ss.texturerender.a.j
    public final int b() {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        return 0;
    }

    public n() {
        super(9);
        this.f151775c = 25;
        l.a("TR_GLMattingFilter", "new GLMattingFilter,this:".concat(String.valueOf(this)));
    }

    @Override // com.ss.texturerender.a.j, com.ss.texturerender.a.a
    public final String b(int i2) {
        if (i2 != 11001) {
            return super.b(i2);
        }
        return "precision mediump float;\nuniform sampler2D sTexture;\nvarying vec2 vTextureCoord;\nvoid main() {\n    vec4 tmpFrag = texture2D(sTexture, vTextureCoord);\n    float rbAver = tmpFrag.r * 0.5 + tmpFrag.b * 0.5;\n    float delta = tmpFrag.g - rbAver;\n    tmpFrag.a = 1.0 - smoothstep(0.0, 0.25, delta);\n    tmpFrag.a = tmpFrag.a * tmpFrag.a * tmpFrag.a;\n    gl_FragColor = tmpFrag;\n}";
    }
}
