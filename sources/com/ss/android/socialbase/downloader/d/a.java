package com.ss.android.socialbase.downloader.d;

import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.d.b;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.k.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public e f60368a;

    static {
        Covode.recordClassIndex(37258);
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final long a() {
        return this.f60368a.a();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final boolean b() {
        return this.f60368a.b();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final boolean c() {
        return this.f60368a.c();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final boolean d() {
        return this.f60368a.d();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final String e() {
        return this.f60368a.e();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final boolean f() {
        return this.f60368a.f();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final File g() {
        return this.f60368a.g();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final long h() {
        return this.f60368a.h();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final FileInputStream i() {
        return this.f60368a.i();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final FileOutputStream j() {
        return this.f60368a.j();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final File k() {
        return this.f60368a.k();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final String l() {
        return this.f60368a.l();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final int m() {
        return this.f60368a.m();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final String o() {
        return this.f60368a.o();
    }

    public final boolean n() {
        if (this.f60368a.m() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final boolean a(long j2) {
        return this.f60368a.a(j2);
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final boolean a(a aVar) {
        return this.f60368a.a(aVar);
    }

    public a(String str, String str2) {
        this(str, str2, true, true);
    }

    public a(String str, String str2, boolean z, boolean z2) {
        MethodCollector.i(13966);
        int a2 = b.a(str);
        if (a2 == 1) {
            this.f60368a = new d(str, str2, z);
            MethodCollector.o(13966);
            return;
        }
        try {
            Uri parse = Uri.parse(str);
            b.a aVar = b.f60369a.get(a2);
            if (aVar != null) {
                try {
                    Cursor query = c.B().getContentResolver().query(aVar.f60370a, null, aVar.f60372c + " = ?", new String[]{parse.getLastPathSegment()}, null);
                    if (query == null || !query.moveToFirst()) {
                        Throwable th = new Throwable("Fail to check Uri with cursor.");
                        MethodCollector.o(13966);
                        throw th;
                    }
                    g.a(query);
                    this.f60368a = new f(parse, a2, z2);
                    MethodCollector.o(13966);
                } catch (Throwable th2) {
                    g.a(null);
                    MethodCollector.o(13966);
                    throw th2;
                }
            } else {
                Throwable th3 = new Throwable("Fail to check Uri, type error :".concat(String.valueOf(a2)));
                MethodCollector.o(13966);
                throw th3;
            }
        } catch (Throwable th4) {
            this.f60368a = new c(th4.toString());
            MethodCollector.o(13966);
        }
    }
}
