package com.ss.ttvideoengine;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.ss.ttm.player.AudioProcessor;
import com.ss.ttm.player.IMediaDataSource;
import com.ss.ttm.player.LoadControl;
import com.ss.ttm.player.MaskInfo;
import com.ss.ttm.player.SubInfo;
import com.ss.ttm.player.f;
import com.ss.ttm.player.m;
import com.ss.ttm.player.n;
import com.ss.ttm.player.o;
import com.ss.ttm.player.p;
import com.ss.ttvideoengine.s.i;
import java.io.FileDescriptor;
import java.lang.reflect.Method;
import java.util.Map;

public class m implements com.ss.ttm.player.m {

    /* renamed from: e  reason: collision with root package name */
    private static boolean f153084e;

    /* renamed from: a  reason: collision with root package name */
    public n f153085a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f153086b;

    /* renamed from: d  reason: collision with root package name */
    public String f153087d = "";

    static {
        Covode.recordClassIndex(101716);
    }

    @Override // com.ss.ttm.player.m
    public final boolean a() {
        return this.f153085a instanceof o;
    }

    @Override // com.ss.ttm.player.m
    public final void a(SurfaceHolder surfaceHolder) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.b(surfaceHolder);
        }
    }

    @Override // com.ss.ttm.player.m
    public final void a(Surface surface) {
        n nVar;
        if ((surface == null || surface.isValid()) && (nVar = this.f153085a) != null) {
            nVar.a(surface);
        }
    }

    @Override // com.ss.ttm.player.m
    public final void a(Context context, Uri uri, Map<String, String> map) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(context, uri, map);
        }
    }

    @Override // com.ss.ttm.player.m
    public final void a(FileDescriptor fileDescriptor, long j2, long j3) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(fileDescriptor, j2, j3);
        }
    }

    @Override // com.ss.ttm.player.m
    public final void a(IMediaDataSource iMediaDataSource) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(iMediaDataSource);
        }
    }

    @Override // com.ss.ttm.player.m
    public final void a(boolean z) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(z);
        }
    }

    @Override // com.ss.ttm.player.m
    public final void a(m.a aVar) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(aVar);
        }
    }

    @Override // com.ss.ttm.player.m
    public final void a(m.b bVar) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(bVar);
        }
    }

    @Override // com.ss.ttm.player.m
    public final void a(m.c cVar) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(cVar);
        }
    }

    @Override // com.ss.ttm.player.m
    public final void a(m.e eVar) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(eVar);
        }
    }

    @Override // com.ss.ttm.player.m
    public final void a(m.d dVar) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(dVar);
        }
    }

    @Override // com.ss.ttm.player.m
    public final void a(m.k kVar) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(kVar);
        }
    }

    @Override // com.ss.ttm.player.m
    public final void a(m.g gVar) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(gVar);
        }
    }

    @Override // com.ss.ttm.player.m
    public final void a(m.i iVar) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(iVar);
        }
    }

    @Override // com.ss.ttm.player.m
    public final void a(m.j jVar) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(jVar);
        }
    }

    public final void a(f fVar) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(fVar);
        }
    }

    @Override // com.ss.ttm.player.m
    public final void a(String str) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(str);
        }
    }

    @Override // com.ss.ttm.player.m
    public final void a(p pVar) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(pVar);
        }
    }

    public final void a(AudioProcessor audioProcessor) {
        if (this.f153085a != null) {
            try {
                Method method = i.a(200, "com.ss.ttm.player.TTPlayerClient").getMethod("setAudioProcessor", AudioProcessor.class);
                method.setAccessible(true);
                method.invoke(this.f153085a, audioProcessor);
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(LoadControl loadControl) {
        if (this.f153085a != null) {
            try {
                Method method = i.a(200, "com.ss.ttm.player.TTPlayerClient").getMethod("setLoadControl", LoadControl.class);
                method.setAccessible(true);
                method.invoke(this.f153085a, loadControl);
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(MaskInfo maskInfo) {
        if (this.f153085a != null) {
            try {
                Method method = i.a(200, "com.ss.ttm.player.TTPlayerClient").getMethod("setMaskInfo", MaskInfo.class);
                method.setAccessible(true);
                method.invoke(this.f153085a, maskInfo);
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(SubInfo subInfo) {
        if (this.f153085a != null) {
            try {
                Method method = i.a(200, "com.ss.ttm.player.TTPlayerClient").getMethod("setSubInfo", SubInfo.class);
                method.setAccessible(true);
                method.invoke(this.f153085a, subInfo);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.m
    public final void c() {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.i();
        }
    }

    @Override // com.ss.ttm.player.m
    public final void d() {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.d();
        }
    }

    @Override // com.ss.ttm.player.m
    public final void e() {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.j();
        }
    }

    @Override // com.ss.ttm.player.m
    public final void f() {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override // com.ss.ttm.player.m
    public final void g() {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.f();
        }
    }

    @Override // com.ss.ttm.player.m
    public final void h() {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.g();
        }
    }

    @Override // com.ss.ttm.player.m
    public final void i() {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.h();
        }
    }

    @Override // com.ss.ttm.player.m
    public final void j() {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.k();
        }
    }

    @Override // com.ss.ttm.player.m
    public final void q() {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.q();
        }
    }

    @Override // com.ss.ttm.player.m
    public final int k() {
        n nVar = this.f153085a;
        if (nVar != null) {
            return nVar.l();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.m
    public final int l() {
        n nVar = this.f153085a;
        if (nVar != null) {
            return nVar.m();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.m
    public final int m() {
        n nVar = this.f153085a;
        if (nVar != null) {
            return nVar.n();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.m
    public final int n() {
        n nVar = this.f153085a;
        if (nVar != null) {
            return nVar.o();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.m
    public final int o() {
        n nVar = this.f153085a;
        if (nVar != null) {
            return nVar.r();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.m
    public final boolean p() {
        n nVar = this.f153085a;
        if (nVar != null) {
            return nVar.p();
        }
        return false;
    }

    @Override // com.ss.ttm.player.m
    public final boolean r() {
        n nVar = this.f153085a;
        if (nVar != null) {
            return nVar.s();
        }
        return false;
    }

    public static boolean s() {
        if (f153084e) {
            return true;
        }
        try {
            i.a(200, "com.ss.ttm.player.TTPlayerClient");
            f153084e = true;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String t() {
        try {
            return i.a(201, "com.ss.ttmplugin.player.TTVersion").getField("VERSION_NAME").get(null).toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.ss.ttm.player.m
    public final int b() {
        n nVar = this.f153085a;
        if (nVar != null) {
            return nVar.c();
        }
        return 0;
    }

    public final Object u() {
        if (this.f153085a == null) {
            return null;
        }
        try {
            Method method = i.a(200, "com.ss.ttm.player.TTPlayerClient").getMethod("getObjectOption", Integer.TYPE);
            method.setAccessible(true);
            return method.invoke(this.f153085a, 521);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ss.ttm.player.m
    public final void b(boolean z) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.b(z);
        }
    }

    @Override // com.ss.ttm.player.m
    public final float b(int i2) {
        n nVar = this.f153085a;
        if (nVar != null) {
            return nVar.c(i2);
        }
        return 0.0f;
    }

    @Override // com.ss.ttm.player.m
    public final String c(int i2) {
        n nVar = this.f153085a;
        if (nVar != null) {
            return nVar.b(i2);
        }
        return null;
    }

    @Override // com.ss.ttm.player.m
    public final void a(int i2) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(i2);
        }
    }

    @Override // com.ss.ttm.player.m
    public final void a(float f2, float f3) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(f2, f3);
        }
    }

    @Override // com.ss.ttm.player.m
    public final int a(int i2, float f2) {
        n nVar = this.f153085a;
        if (nVar == null) {
            return 0;
        }
        nVar.a(i2, f2);
        return 0;
    }

    @Override // com.ss.ttm.player.m
    public final long a(int i2, long j2) {
        n nVar = this.f153085a;
        if (nVar != null) {
            return nVar.b(i2, j2);
        }
        return j2;
    }

    @Override // com.ss.ttm.player.m
    public final void c(int i2, int i3) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(i2, i3);
        }
    }

    @Override // com.ss.ttm.player.m
    public final int b(int i2, int i3) {
        n nVar = this.f153085a;
        if (nVar != null) {
            return nVar.c(i2, i3);
        }
        return i3;
    }

    private static boolean a(Context context, m mVar) {
        boolean z = false;
        try {
            Class<?> cls = Class.forName("com.ss.ttexo.ExoPlayerClient");
            Method declaredMethod = cls.getDeclaredMethod("create", com.ss.ttm.player.m.class, Context.class);
            declaredMethod.setAccessible(true);
            mVar.f153085a = (n) declaredMethod.invoke(cls, mVar, context);
            z = true;
            return true;
        } catch (Throwable th) {
            mVar.f153086b = true;
            mVar.f153087d += th.toString();
            return z;
        }
    }

    @Override // com.ss.ttm.player.m
    public final long b(int i2, long j2) {
        n nVar = this.f153085a;
        if (nVar != null) {
            return (long) nVar.a(i2, j2);
        }
        return -1;
    }

    @Override // com.ss.ttm.player.m
    public final void a(int i2, int i3) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.b(i2, i3);
        }
    }

    @Override // com.ss.ttm.player.m
    public final void a(int i2, String str) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(i2, str);
        }
    }

    @Override // com.ss.ttm.player.m
    public final void a(Context context, Uri uri) {
        n nVar = this.f153085a;
        if (nVar != null) {
            nVar.a(context, uri);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (a(r13, r1) != false) goto L_0x0271;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0275  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.ttm.player.m a(android.content.Context r13, int r14, java.util.HashMap<java.lang.Integer, java.lang.Integer> r15) {
        /*
        // Method dump skipped, instructions count: 722
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.m.a(android.content.Context, int, java.util.HashMap):com.ss.ttm.player.m");
    }
}
