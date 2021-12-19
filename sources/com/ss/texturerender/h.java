package com.ss.texturerender;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.locks.ReentrantLock;

public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    int f151829a;

    /* renamed from: b  reason: collision with root package name */
    ReentrantLock f151830b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    private a f151831c = new d((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private a f151832d;

    /* renamed from: e  reason: collision with root package name */
    private int f151833e;

    public interface a {
        static {
            Covode.recordClassIndex(101255);
        }

        void a(b bVar);
    }

    static {
        Covode.recordClassIndex(101254);
    }

    @Override // com.ss.texturerender.b
    public final int e() {
        return this.f151833e;
    }

    @Override // com.ss.texturerender.b
    public final void d() {
        this.f151830b.unlock();
    }

    @Override // com.ss.texturerender.b
    public final int c() {
        if (!this.f151830b.isHeldByCurrentThread()) {
            this.f151830b.lock();
            return this.f151829a;
        }
        throw new AndroidRuntimeException("Dead lock!!");
    }

    @Override // com.ss.texturerender.a
    public final int a() {
        int a2 = this.f151831c.a();
        l.a("ITexture", this + " add ref " + a2);
        return a2;
    }

    @Override // com.ss.texturerender.a
    public final int b() {
        int b2 = this.f151831c.b();
        l.a("ITexture", this + " dec ref " + b2);
        if (b2 == 1) {
            this.f151832d.a(this);
            return 0;
        } else if (b2 > 0) {
            return 0;
        } else {
            throw new RuntimeException(new Exception("reference idx " + (b2 - 1) + " app abort!!"));
        }
    }

    public h(int i2, int i3, a aVar) {
        l.a("ITexture", "new texture = ".concat(String.valueOf(i2)));
        this.f151829a = i2;
        this.f151832d = aVar;
        this.f151833e = i3;
    }
}
