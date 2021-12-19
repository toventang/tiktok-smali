package com.ss.android.ugc.aweme.livewallpaper.c;

import com.bytedance.covode.number.Covode;

public final class f extends q {
    static {
        Covode.recordClassIndex(69698);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.livewallpaper.c.o
    public final int a() {
        return 36197;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.livewallpaper.c.o
    public final String[] b() {
        return new String[]{"attribute vec2 a_pos;\nattribute vec2 a_tex;\nvarying vec2 v_tex;\nuniform mat4 u_mvp;\nuniform mat4 u_tex_trans;\nvoid main() {\n   gl_Position = u_mvp * vec4(a_pos, 0.0, 1.0);\n   v_tex = (u_tex_trans * vec4(a_tex, 0.0, 1.0)).st;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES u_tex;\nvarying vec2 v_tex;\nvoid main() {\n  gl_FragColor = texture2D(u_tex, v_tex);\n}\n"};
    }
}
