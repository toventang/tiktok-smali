package com.ss.texturerender;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.texturerender.a.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public final class m {

    /* renamed from: e  reason: collision with root package name */
    private static m f151837e;

    /* renamed from: a  reason: collision with root package name */
    public List<n> f151838a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public ReentrantLock f151839b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    public String f151840c = null;

    /* renamed from: d  reason: collision with root package name */
    public Context f151841d;

    static {
        Covode.recordClassIndex(101261);
    }

    private m() {
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            MethodCollector.i(10870);
            if (f151837e == null) {
                f151837e = new m();
            }
            mVar = f151837e;
            MethodCollector.o(10870);
        }
        return mVar;
    }

    public final synchronized boolean c() {
        MethodCollector.i(11046);
        boolean z = false;
        if (this.f151838a.size() == 0) {
            MethodCollector.o(11046);
            return false;
        }
        this.f151839b.lock();
        Iterator<n> it = this.f151838a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            n next = it.next();
            if (next.q.f151792a && next.p == 0 && (next.p & 4) == 0) {
                z = true;
                break;
            }
        }
        this.f151839b.unlock();
        MethodCollector.o(11046);
        return z;
    }

    public final synchronized void b() {
        MethodCollector.i(10872);
        if (this.f151838a.size() != 0) {
            this.f151839b.lock();
            Iterator<n> it = this.f151838a.iterator();
            while (it.hasNext()) {
                n next = it.next();
                l.a("TextureRenderManager", "render = " + next + ", call release");
                next.g();
                it.remove();
                l.a("TextureRenderManager", "release : remove render =" + next + "size = " + this.f151838a.size());
            }
            this.f151839b.unlock();
        }
        f151837e = null;
        MethodCollector.o(10872);
    }

    public final synchronized boolean a(d dVar) {
        MethodCollector.i(11207);
        boolean z = false;
        if (this.f151838a.size() == 0) {
            MethodCollector.o(11207);
            return false;
        }
        this.f151839b.lock();
        Iterator<n> it = this.f151838a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            n next = it.next();
            if (next.q.a(dVar) && next.p == 1 && (next.p & 4) == 0) {
                z = true;
                break;
            }
        }
        this.f151839b.unlock();
        MethodCollector.o(11207);
        return z;
    }

    public final synchronized VideoSurface a(boolean z, int i2) {
        VideoSurface a2;
        MethodCollector.i(11044);
        d dVar = new d();
        dVar.a(z);
        a2 = a(dVar, i2);
        MethodCollector.o(11044);
        return a2;
    }

    private VideoSurface b(d dVar, int i2) {
        n a2 = e.a(dVar, i2);
        l.a("TextureRenderManager", "new TextureRenderer use:".concat(String.valueOf(a2)));
        if (a2.f151849h != -1) {
            VideoSurface f2 = a2.f();
            if (f2 == null) {
                this.f151840c = a2.f151850i;
                a2.g();
                return null;
            }
            this.f151839b.lock();
            this.f151838a.add(a2);
            l.a("TextureRenderManager", "add render = " + a2 + ", effectconfig= " + dVar + ", texType =" + i2 + ",size = " + this.f151838a.size());
            this.f151839b.unlock();
            return f2;
        }
        this.f151840c = a2.f151850i;
        a2.g();
        return null;
    }

    public final synchronized VideoSurface a(d dVar, int i2) {
        MethodCollector.i(10875);
        if (this.f151838a.size() == 0) {
            VideoSurface b2 = b(dVar, i2);
            MethodCollector.o(10875);
            return b2;
        }
        this.f151839b.lock();
        Iterator<n> it = this.f151838a.iterator();
        while (it.hasNext()) {
            n next = it.next();
            d dVar2 = next.q;
            if (!dVar2.a(dVar)) {
                l.a("TextureRenderManager", "render type is mis match = " + dVar2 + ", " + dVar);
            } else if ((dVar2.f151792a || dVar2.f151793b) && next.p != i2) {
                l.a("TextureRenderManager", "sr/sharpen but tex type is mis match = " + next.p + ", " + i2);
            } else if ((i2 & 4) == (next.p & 4)) {
                l.a("TextureRenderManager", "TextureRenderer use:".concat(String.valueOf(next)));
                VideoSurface f2 = next.f();
                if (f2 != null) {
                    this.f151839b.unlock();
                    MethodCollector.o(10875);
                    return f2;
                } else if (next.f151849h <= 0) {
                    l.a("TextureRenderManager", "remove render =" + next + " state = " + next.f151849h);
                    next.g();
                    it.remove();
                }
            } else {
                continue;
            }
        }
        this.f151839b.unlock();
        VideoSurface b3 = b(dVar, i2);
        MethodCollector.o(10875);
        return b3;
    }
}
