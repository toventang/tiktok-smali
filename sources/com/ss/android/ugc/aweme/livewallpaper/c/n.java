package com.ss.android.ugc.aweme.livewallpaper.c;

import android.opengl.GLES20;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.locks.ReentrantLock;

public class n implements h {

    /* renamed from: a  reason: collision with root package name */
    protected b f108832a;

    /* renamed from: b  reason: collision with root package name */
    private int f108833b;

    /* renamed from: c  reason: collision with root package name */
    private int f108834c;

    /* renamed from: d  reason: collision with root package name */
    private int f108835d;

    /* renamed from: e  reason: collision with root package name */
    private int f108836e;

    /* renamed from: f  reason: collision with root package name */
    private g f108837f = new m();

    /* renamed from: g  reason: collision with root package name */
    private ReentrantLock f108838g = new ReentrantLock();

    public interface b {
        static {
            Covode.recordClassIndex(69709);
        }

        void a(h hVar);
    }

    static {
        Covode.recordClassIndex(69707);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.g
    public final int a() {
        return this.f108837f.a();
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.h
    public final void d() {
        this.f108838g.unlock();
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.h
    public final int c() {
        if (!this.f108838g.isHeldByCurrentThread()) {
            this.f108838g.lock();
            return this.f108833b;
        }
        throw new AndroidRuntimeException("Dead lock!!");
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.g
    public final int b() {
        int b2 = this.f108837f.b();
        if (b2 == 1) {
            this.f108832a.a(this);
            return 0;
        } else if (b2 > 0) {
            return 0;
        } else {
            throw new RuntimeException(new Exception("reference idx " + (b2 - 1) + " app abort!!"));
        }
    }

    /* access modifiers changed from: protected */
    public void e() {
        c();
        int i2 = this.f108833b;
        if (i2 > 0) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        }
        int i3 = this.f108834c;
        if (i3 > 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        }
        this.f108834c = 0;
        this.f108833b = 0;
        this.f108832a = new a(this, (byte) 0);
        this.f108838g.unlock();
    }

    class a implements b {
        static {
            Covode.recordClassIndex(69708);
        }

        private a() {
        }

        @Override // com.ss.android.ugc.aweme.livewallpaper.c.n.b
        public final void a(h hVar) {
            n.this.f108832a = null;
        }

        /* synthetic */ a(n nVar, byte b2) {
            this();
        }
    }

    public n(int i2, int i3, int i4, b bVar) {
        this.f108833b = i2;
        this.f108835d = i3;
        this.f108836e = i4;
        this.f108832a = bVar == null ? new a(this, (byte) 0) : bVar;
    }
}
