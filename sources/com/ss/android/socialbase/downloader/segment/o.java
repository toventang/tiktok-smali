package com.ss.android.socialbase.downloader.segment;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* access modifiers changed from: package-private */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    final String f60969a;

    /* renamed from: b  reason: collision with root package name */
    final String f60970b;

    /* renamed from: c  reason: collision with root package name */
    final String f60971c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f60972d;

    /* renamed from: e  reason: collision with root package name */
    final AtomicLong f60973e = new AtomicLong();

    /* renamed from: f  reason: collision with root package name */
    private final List<l> f60974f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private int f60975g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f60976h;

    /* renamed from: i  reason: collision with root package name */
    private int f60977i;

    /* renamed from: j  reason: collision with root package name */
    private String f60978j;

    static {
        Covode.recordClassIndex(37572);
    }

    public final synchronized boolean d() {
        boolean z;
        MethodCollector.i(14145);
        z = this.f60976h;
        MethodCollector.o(14145);
        return z;
    }

    public final synchronized void b() {
        MethodCollector.i(14079);
        this.f60975g++;
        this.f60976h = true;
        MethodCollector.o(14079);
    }

    public final synchronized void c() {
        MethodCollector.i(14114);
        this.f60976h = false;
        MethodCollector.o(14114);
    }

    public final int hashCode() {
        if (this.f60977i == 0) {
            this.f60977i = e().hashCode();
        }
        return this.f60977i;
    }

    private String e() {
        if (this.f60978j == null) {
            StringBuilder append = new StringBuilder().append(this.f60969a).append("_");
            String str = this.f60970b;
            if (str == null) {
                str = "";
            }
            this.f60978j = append.append(str).append("_").append(this.f60972d).toString();
        }
        return this.f60978j;
    }

    public final synchronized int a() {
        int size;
        MethodCollector.i(14078);
        size = this.f60974f.size();
        MethodCollector.o(14078);
        return size;
    }

    public final String toString() {
        return "UrlRecord{url='" + this.f60969a + '\'' + ", ip='" + this.f60970b + '\'' + ", ipFamily='" + this.f60971c + '\'' + ", isMainUrl=" + this.f60972d + ", failedTimes=" + this.f60975g + ", isCurrentFailed=" + this.f60976h + '}';
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            int lastIndexOf = str.lastIndexOf(".");
            if (lastIndexOf <= 0 || lastIndexOf >= str.length()) {
                return null;
            }
            return str.substring(0, lastIndexOf);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return e().equals(((o) obj).e());
    }

    public final synchronized void b(l lVar) {
        MethodCollector.i(14077);
        try {
            this.f60974f.remove(lVar);
            MethodCollector.o(14077);
        } catch (Throwable unused) {
            MethodCollector.o(14077);
        }
    }

    public final synchronized void a(l lVar) {
        MethodCollector.i(14028);
        this.f60974f.add(lVar);
        MethodCollector.o(14028);
    }

    public o(String str, String str2) {
        this.f60969a = str;
        this.f60972d = false;
        this.f60970b = str2;
        this.f60971c = a(str2);
    }

    public o(String str, boolean z) {
        this.f60969a = str;
        this.f60972d = z;
        this.f60970b = null;
        this.f60971c = null;
    }
}
