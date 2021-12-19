package com.ss.texturerender.a;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.ss.texturerender.l;
import java.util.Iterator;
import java.util.LinkedList;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public LinkedList<f> f151800a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    private int f151801b = 4;

    static {
        Covode.recordClassIndex(101232);
    }

    public final void a(f fVar) {
        this.f151800a.offer(fVar);
        while (this.f151800a.size() > this.f151801b) {
            f poll = this.f151800a.poll();
            com.ss.texturerender.g.b(poll.f151795a);
            l.a("TR_EffectTextureManager", "onTextureReturn delTex:".concat(String.valueOf(poll)));
        }
    }

    public final f a(int i2, int i3) {
        int i4;
        Iterator<f> it = this.f151800a.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (i2 == next.f151797c && i3 == next.f151798d) {
                it.remove();
                return next;
            }
        }
        f poll = this.f151800a.poll();
        if (poll == null) {
            i4 = com.ss.texturerender.g.a();
        } else {
            i4 = poll.f151795a;
        }
        GLES20.glBindTexture(3553, i4);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
        f fVar = new f(this, i4, i2, i3, 3553);
        l.a("TR_EffectTextureManager", "genTexture:" + fVar.toString());
        return fVar;
    }
}
