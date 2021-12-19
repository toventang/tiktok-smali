package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.internal.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class g<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f156073a;

    /* renamed from: b  reason: collision with root package name */
    protected final f<T> f156074b;

    /* renamed from: c  reason: collision with root package name */
    protected final h f156075c;

    /* renamed from: d  reason: collision with root package name */
    protected final m f156076d;

    /* renamed from: e  reason: collision with root package name */
    public final int f156077e;

    /* renamed from: f  reason: collision with root package name */
    public volatile long f156078f;

    /* renamed from: g  reason: collision with root package name */
    protected final List<n> f156079g = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(103681);
    }

    /* access modifiers changed from: protected */
    public abstract String b();

    public final List<File> c() {
        return this.f156076d.c();
    }

    private void e() {
        for (n nVar : this.f156079g) {
            try {
                nVar.a();
            } catch (Exception unused) {
                com.twitter.sdk.android.core.internal.g.b(this.f156073a, "One of the roll over listeners threw an exception");
            }
        }
    }

    public final boolean a() {
        boolean z = true;
        if (!this.f156076d.b()) {
            String b2 = b();
            this.f156076d.a(b2);
            Context context = this.f156073a;
            com.a.a(Locale.US, "generated new file %s", new Object[]{b2});
            com.twitter.sdk.android.core.internal.g.a(context);
            this.f156078f = this.f156075c.a();
        } else {
            z = false;
        }
        e();
        return z;
    }

    public final void d() {
        List<File> d2 = this.f156076d.d();
        int i2 = this.f156077e;
        if (d2.size() > i2) {
            int size = d2.size() - i2;
            com.twitter.sdk.android.core.internal.g.a(this.f156073a, com.a.a(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[]{Integer.valueOf(d2.size()), Integer.valueOf(i2), Integer.valueOf(size)}));
            TreeSet treeSet = new TreeSet(h.f156082a);
            for (File file : d2) {
                treeSet.add(new a(file, a(file.getName())));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((a) it.next()).f156080a);
                if (arrayList.size() == size) {
                    break;
                }
            }
            this.f156076d.a(arrayList);
        }
    }

    public final void a(n nVar) {
        this.f156079g.add(nVar);
    }

    public final void a(List<File> list) {
        this.f156076d.a(list);
    }

    private static long a(String str) {
        String[] split = str.split("_");
        if (split.length != 3) {
            return 0;
        }
        try {
            return Long.valueOf(split[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final void a(T t) {
        byte[] a2 = this.f156074b.a(t);
        int length = a2.length;
        if (!this.f156076d.a(length)) {
            com.a.a(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(this.f156076d.a()), Integer.valueOf(length), 8000});
            com.twitter.sdk.android.core.internal.g.a(this.f156073a);
            a();
        }
        this.f156076d.a(a2);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final File f156080a;

        /* renamed from: b  reason: collision with root package name */
        final long f156081b;

        static {
            Covode.recordClassIndex(103682);
        }

        a(File file, long j2) {
            this.f156080a = file;
            this.f156081b = j2;
        }
    }

    g(Context context, f<T> fVar, h hVar, m mVar, int i2) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f156073a = applicationContext;
        this.f156074b = fVar;
        this.f156076d = mVar;
        this.f156075c = hVar;
        this.f156078f = hVar.a();
        this.f156077e = i2;
    }
}
