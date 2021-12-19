package com.ss.android.socialbase.downloader.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.g.g;
import com.ss.android.socialbase.downloader.k.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f60860a;

    /* renamed from: b  reason: collision with root package name */
    public final g f60861b;

    /* renamed from: c  reason: collision with root package name */
    public final int f60862c;

    /* renamed from: d  reason: collision with root package name */
    private long f60863d;

    /* renamed from: e  reason: collision with root package name */
    private long f60864e;

    static {
        Covode.recordClassIndex(37545);
    }

    public final boolean a() {
        int i2 = this.f60862c;
        if (i2 == 200 || i2 == 201 || i2 == 0) {
            return true;
        }
        return false;
    }

    public final String c() {
        return this.f60861b.a("Etag");
    }

    public final String d() {
        return this.f60861b.a("Content-Type");
    }

    public final String e() {
        return com.ss.android.socialbase.downloader.k.g.b(this.f60861b, "Content-Range");
    }

    public final String g() {
        return com.ss.android.socialbase.downloader.k.g.b(this.f60861b, "Cache-Control");
    }

    public final String f() {
        String b2 = com.ss.android.socialbase.downloader.k.g.b(this.f60861b, "last-modified");
        if (TextUtils.isEmpty(b2)) {
            return com.ss.android.socialbase.downloader.k.g.b(this.f60861b, "Last-Modified");
        }
        return b2;
    }

    public final long h() {
        if (this.f60863d <= 0) {
            this.f60863d = com.ss.android.socialbase.downloader.k.g.a(this.f60861b);
        }
        return this.f60863d;
    }

    public final boolean b() {
        int i2 = this.f60862c;
        String a2 = this.f60861b.a("Accept-Ranges");
        if (a.a(16777216)) {
            if (i2 == 206 || i2 == 1) {
                return true;
            }
            return false;
        } else if (i2 >= 400 || (i2 != 206 && i2 != 1 && !"bytes".equals(a2))) {
            return false;
        } else {
            return true;
        }
    }

    public final long j() {
        if (this.f60864e <= 0) {
            if (!i()) {
                String e2 = e();
                if (!TextUtils.isEmpty(e2)) {
                    this.f60864e = com.ss.android.socialbase.downloader.k.g.a(e2);
                }
            } else {
                this.f60864e = -1;
            }
        }
        return this.f60864e;
    }

    public final boolean i() {
        if (!a.a(8)) {
            return com.ss.android.socialbase.downloader.k.g.a(h());
        }
        g gVar = this.f60861b;
        if (gVar != null) {
            if (a.a(8)) {
                if ("chunked".equals(gVar.a("Transfer-Encoding")) || com.ss.android.socialbase.downloader.k.g.a(gVar) == -1) {
                    return true;
                }
                return false;
            } else if (com.ss.android.socialbase.downloader.k.g.a(gVar) == -1) {
                return true;
            }
        }
        return false;
    }

    public b(String str, g gVar) {
        this.f60860a = str;
        this.f60862c = gVar.a();
        this.f60861b = gVar;
    }
}
