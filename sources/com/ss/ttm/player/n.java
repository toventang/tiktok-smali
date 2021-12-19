package com.ss.ttm.player;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.ss.ttm.player.m;
import java.io.FileDescriptor;
import java.util.Map;

public abstract class n {
    static {
        Covode.recordClassIndex(101355);
    }

    public int a(int i2, float f2) {
        return -1;
    }

    public int a(int i2, long j2) {
        return -1;
    }

    public int a(int i2, String str) {
        return -1;
    }

    public abstract void a(float f2, float f3);

    public abstract void a(int i2);

    public abstract void a(int i2, int i3);

    public abstract void a(Context context, Uri uri);

    public abstract void a(Context context, Uri uri, Map<String, String> map);

    public abstract void a(Surface surface);

    public abstract void a(IMediaDataSource iMediaDataSource);

    public abstract void a(f fVar);

    public abstract void a(m.a aVar);

    public abstract void a(m.b bVar);

    public abstract void a(m.c cVar);

    public abstract void a(m.d dVar);

    public abstract void a(m.e eVar);

    public abstract void a(m.g gVar);

    public abstract void a(m.i iVar);

    public abstract void a(m.j jVar);

    public abstract void a(m.k kVar);

    public abstract void a(p pVar);

    public abstract void a(FileDescriptor fileDescriptor, long j2, long j3);

    public void a(String str) {
    }

    public abstract void a(boolean z);

    public int b(int i2, int i3) {
        return -1;
    }

    public long b(int i2, long j2) {
        return j2;
    }

    public String b(int i2) {
        return null;
    }

    public abstract void b(SurfaceHolder surfaceHolder);

    public void b(boolean z) {
    }

    public float c(int i2) {
        return 0.0f;
    }

    public abstract int c();

    public int c(int i2, int i3) {
        return i3;
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract boolean p();

    public abstract void q();

    public int r() {
        return 0;
    }

    public boolean s() {
        return false;
    }
}
