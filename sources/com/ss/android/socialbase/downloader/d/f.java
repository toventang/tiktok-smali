package com.ss.android.socialbase.downloader.d;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.downloader.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private Uri f60376a;

    /* renamed from: b  reason: collision with root package name */
    private int f60377b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f60378c;

    static {
        Covode.recordClassIndex(37264);
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final boolean a(long j2) {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final boolean a(a aVar) {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final boolean c() {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final String e() {
        return "";
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final boolean f() {
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final File g() {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final long h() {
        return 0;
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final File k() {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final String l() {
        return "";
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final String o() {
        return "";
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final int m() {
        return this.f60377b;
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final long a() {
        return b.a(this.f60376a);
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final boolean b() {
        if (b.a(this.f60376a) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final boolean d() {
        MethodCollector.i(13849);
        try {
            if (this.f60378c) {
                boolean a2 = b.a(j());
                MethodCollector.o(13849);
                return a2;
            }
            c.B().getContentResolver().delete(this.f60376a, null, null);
            MethodCollector.o(13849);
            return false;
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final FileInputStream i() {
        MethodCollector.i(13748);
        if (this.f60376a != null) {
            FileInputStream fileInputStream = new FileInputStream(b.a(this.f60376a, "r"));
            MethodCollector.o(13748);
            return fileInputStream;
        }
        IOException iOException = new IOException("Fail to obtain InputStream, uri is null");
        MethodCollector.o(13748);
        throw iOException;
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final FileOutputStream j() {
        MethodCollector.i(13797);
        if (this.f60376a != null) {
            FileOutputStream fileOutputStream = new FileOutputStream(b.a(this.f60376a, "w"));
            MethodCollector.o(13797);
            return fileOutputStream;
        }
        IOException iOException = new IOException("Fail to obtain OutputStream, uri is null");
        MethodCollector.o(13797);
        throw iOException;
    }

    public f(Uri uri, int i2, boolean z) {
        this.f60376a = uri;
        this.f60377b = i2;
        this.f60378c = z;
    }
}
