package com.ss.android.ugc.aweme.livewallpaper.c;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;

public class r extends o {

    /* renamed from: c  reason: collision with root package name */
    private int f108859c;

    /* renamed from: d  reason: collision with root package name */
    private int f108860d;

    static {
        Covode.recordClassIndex(69713);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.o
    public final void c() {
        super.c();
        int i2 = this.f108859c;
        if (i2 != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i2}, 0);
            this.f108859c = 0;
        }
        int i3 = this.f108860d;
        if (i3 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i3}, 0);
            this.f108860d = 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.o
    public final boolean a(int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        this.f108859c = iArr[0];
        if (!super.a(i2, i3)) {
            return false;
        }
        this.f108860d = i.a(i2, i3);
        return true;
    }
}
