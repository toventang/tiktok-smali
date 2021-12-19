package com.ss.texturerender.a;

import android.opengl.GLES20;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.texturerender.l;

public final class o extends j {
    private final String M = "uniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    private final String N = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private float[] O = new float[16];
    private int P;

    static {
        Covode.recordClassIndex(101241);
    }

    @Override // com.ss.texturerender.a.j
    public final int b() {
        this.f151776d.getTransformMatrix(this.O);
        GLES20.glUniformMatrix4fv(this.P, 1, false, this.O, 0);
        return 0;
    }

    public o() {
        super(3);
        this.f151774b = 36197;
        this.f151775c = 100;
        l.a("TR_GLOesTo2DFilter", "new GLOesTo2DFilter");
    }

    @Override // com.ss.texturerender.a.j, com.ss.texturerender.a.a
    public final int a(Bundle bundle) {
        super.a(bundle);
        this.P = GLES20.glGetUniformLocation(this.p, "uSTMatrix");
        l.a("TR_GLOesTo2DFilter", "init");
        b(bundle);
        return 0;
    }

    @Override // com.ss.texturerender.a.j, com.ss.texturerender.a.a
    public final String b(int i2) {
        if (i2 == 11000) {
            return "uniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
        }
        if (i2 != 11001) {
            return super.b(i2);
        }
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    }
}
