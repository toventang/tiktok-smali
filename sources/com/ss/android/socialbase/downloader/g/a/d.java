package com.ss.android.socialbase.downloader.g.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.g.i;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public final class d implements i {

    /* renamed from: a  reason: collision with root package name */
    protected final Object f60514a;

    /* renamed from: b  reason: collision with root package name */
    public final List<HttpHeader> f60515b;

    /* renamed from: c  reason: collision with root package name */
    long f60516c;

    /* renamed from: d  reason: collision with root package name */
    private i f60517d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f60518e;

    /* renamed from: f  reason: collision with root package name */
    private InputStream f60519f;

    static {
        Covode.recordClassIndex(37396);
    }

    @Override // com.ss.android.socialbase.downloader.g.g
    public final void b() {
        i iVar = this.f60517d;
        if (iVar != null) {
            iVar.b();
        }
    }

    @Override // com.ss.android.socialbase.downloader.g.i
    public final InputStream c() {
        InputStream inputStream = this.f60519f;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.g.i
    public final void d() {
        i iVar = this.f60517d;
        if (iVar != null) {
            iVar.d();
        }
    }

    @Override // com.ss.android.socialbase.downloader.g.g
    public final int a() {
        i iVar = this.f60517d;
        if (iVar != null) {
            return iVar.a();
        }
        return 0;
    }

    public final void e() {
        MethodCollector.i(12693);
        synchronized (this.f60514a) {
            try {
                if (this.f60518e && this.f60517d == null) {
                    this.f60514a.wait();
                }
            } finally {
                MethodCollector.o(12693);
            }
        }
    }

    public final boolean f() {
        int a2;
        try {
            i iVar = this.f60517d;
            if (iVar == null || (a2 = iVar.a()) < 200 || a2 >= 300) {
                return false;
            }
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.g.g
    public final String a(String str) {
        i iVar = this.f60517d;
        if (iVar != null) {
            return iVar.a(str);
        }
        return null;
    }
}
