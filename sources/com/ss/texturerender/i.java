package com.ss.texturerender;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.texturerender.h;
import java.util.ArrayList;
import java.util.Iterator;

public final class i implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<b> f151834a = new ArrayList<>();

    static {
        Covode.recordClassIndex(101256);
    }

    public final void a() {
        MethodCollector.i(10868);
        synchronized (this.f151834a) {
            try {
                Iterator<b> it = this.f151834a.iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    l.a("ITexture", hVar + "release = " + hVar.f151829a);
                    hVar.c();
                    GLES20.glDeleteTextures(1, new int[hVar.f151829a], 0);
                    hVar.f151830b.unlock();
                    l.a("ITexture", hVar + "release end = " + hVar.f151829a);
                    it.remove();
                }
            } finally {
                MethodCollector.o(10868);
            }
        }
    }

    @Override // com.ss.texturerender.h.a
    public final void a(b bVar) {
        MethodCollector.i(10864);
        synchronized (this.f151834a) {
            try {
                this.f151834a.add(bVar);
                this.f151834a.size();
            } finally {
                MethodCollector.o(10864);
            }
        }
    }

    public final b a(int i2) {
        b hVar;
        MethodCollector.i(10866);
        synchronized (this.f151834a) {
            try {
                if (this.f151834a.size() > 0) {
                    Iterator<b> it = this.f151834a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        hVar = it.next();
                        if (hVar.e() == i2) {
                            it.remove();
                            new StringBuilder("reuse texture:").append(hVar).append(" texTarget:").append(hVar.e());
                            break;
                        }
                    }
                }
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                if (iArr[0] != 0) {
                    if (iArr[0] != 0) {
                        GLES20.glBindTexture(i2, iArr[0]);
                        GLES20.glTexParameteri(i2, 10242, 33071);
                        GLES20.glTexParameteri(i2, 10243, 33071);
                        GLES20.glTexParameteri(i2, 10241, 9729);
                        GLES20.glTexParameteri(i2, 10240, 9729);
                    }
                    hVar = new h(iArr[0], i2, this);
                } else {
                    RuntimeException runtimeException = new RuntimeException("Error gen texture.");
                    MethodCollector.o(10866);
                    throw runtimeException;
                }
            } catch (Throwable th) {
                MethodCollector.o(10866);
                throw th;
            }
        }
        hVar.a();
        MethodCollector.o(10866);
        return hVar;
    }
}
