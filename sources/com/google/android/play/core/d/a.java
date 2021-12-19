package com.google.android.play.core.d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.b.ac;
import com.google.android.play.core.b.ad;
import com.google.android.play.core.b.ae;
import com.google.android.play.core.b.ai;
import com.google.android.play.core.b.al;
import com.google.android.play.core.b.bf;
import com.google.android.play.core.b.o;
import com.google.android.play.core.b.p;
import com.google.android.play.core.b.q;
import com.google.android.play.core.b.r;
import com.google.android.play.core.b.x;
import com.google.android.play.core.b.y;
import com.google.android.play.core.e.ah;
import com.google.android.play.core.e.ak;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<a> f53189a = new AtomicReference<>(null);

    /* renamed from: b  reason: collision with root package name */
    final d f53190b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f53191c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private final b f53192d;

    static {
        Covode.recordClassIndex(32875);
    }

    private a(Context context) {
        try {
            d dVar = new d(context);
            this.f53190b = dVar;
            this.f53192d = new b(dVar);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new al(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final Set<String> a() {
        HashSet hashSet;
        MethodCollector.i(8783);
        synchronized (this.f53191c) {
            try {
                hashSet = new HashSet(this.f53191c);
            } finally {
                MethodCollector.o(8783);
            }
        }
        return hashSet;
    }

    public static boolean a(Context context, boolean z) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        AtomicReference<a> atomicReference = f53189a;
        boolean compareAndSet = atomicReference.compareAndSet(null, new a(context));
        a aVar = atomicReference.get();
        if (compareAndSet) {
            ah.f53232a.b(new o(context, q.a(), new p(context, aVar.f53190b, new r()), aVar.f53190b, new q()));
            ak.f53234a.compareAndSet(null, new m(aVar));
            q.a().execute(new n(context));
        }
        try {
            aVar.b(context, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private final synchronized void b(Context context, boolean z) {
        q xVar;
        IOException e2;
        MethodCollector.i(8811);
        if (z) {
            this.f53190b.a();
        } else {
            q.a().execute(new o(this));
        }
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            List<String> arrayList = packageInfo.splitNames == null ? new ArrayList() : Arrays.asList(packageInfo.splitNames);
            Set<r> f2 = this.f53190b.f();
            HashSet hashSet = new HashSet();
            Iterator<r> it = f2.iterator();
            while (it.hasNext()) {
                String str = it.next().f53219b;
                if (arrayList.contains(str)) {
                    if (z) {
                        this.f53190b.e(str);
                    } else {
                        hashSet.add(str);
                    }
                    it.remove();
                }
            }
            if (!hashSet.isEmpty()) {
                q.a().execute(new p(this, hashSet));
            }
            HashSet hashSet2 = new HashSet();
            for (r rVar : f2) {
                String str2 = rVar.f53219b;
                if (!com.google.android.play.core.e.al.a(str2)) {
                    hashSet2.add(str2);
                }
            }
            for (String str3 : arrayList) {
                if (!com.google.android.play.core.e.al.a(str3)) {
                    hashSet2.add(str3);
                }
            }
            HashSet<r> hashSet3 = new HashSet(f2.size());
            for (r rVar2 : f2) {
                if (!rVar2.f53219b.startsWith("config.")) {
                    String str4 = rVar2.f53219b;
                    if (!hashSet2.contains(str4.startsWith("config.") ? "" : str4.split("\\.config\\.", 2)[0])) {
                    }
                }
                hashSet3.add(rVar2);
            }
            l lVar = new l(this.f53190b);
            if (Build.VERSION.SDK_INT >= 21) {
                switch (Build.VERSION.SDK_INT) {
                    case 21:
                        xVar = new x();
                        break;
                    case 22:
                        xVar = new y();
                        break;
                    case 23:
                        xVar = new ac();
                        break;
                    case 24:
                        xVar = new ad();
                        break;
                    case 25:
                        xVar = new ae();
                        break;
                    case 26:
                        xVar = new com.google.android.play.core.b.ah();
                        break;
                    case 27:
                        if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                            xVar = new ai();
                            break;
                        }
                    default:
                        xVar = new com.google.android.play.core.b.ak();
                        break;
                }
                ClassLoader classLoader = context.getClassLoader();
                if (z) {
                    xVar.a(classLoader, lVar.a());
                } else {
                    Iterator it2 = hashSet3.iterator();
                    while (it2.hasNext()) {
                        r rVar3 = (r) it2.next();
                        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                        HashSet hashSet4 = new HashSet();
                        l.a(rVar3, new f(lVar, rVar3, hashSet4, atomicBoolean));
                        if (atomicBoolean.get()) {
                            xVar.a(classLoader, hashSet4);
                        } else {
                            it2.remove();
                        }
                    }
                }
                HashSet hashSet5 = new HashSet();
                for (r rVar4 : hashSet3) {
                    try {
                        ZipFile zipFile = new ZipFile(rVar4.f53218a);
                        try {
                            ZipEntry entry = zipFile.getEntry("classes.dex");
                            zipFile.close();
                            if (entry != null) {
                                d dVar = this.f53190b;
                                String str5 = rVar4.f53219b;
                                File file = new File(dVar.d(), "dex");
                                d.b(file);
                                File a2 = d.a(file, str5);
                                d.b(a2);
                                if (!xVar.a(classLoader, a2, rVar4.f53218a, z)) {
                                    String.valueOf(String.valueOf(rVar4.f53218a)).length();
                                }
                            }
                            hashSet5.add(rVar4.f53218a);
                        } catch (IOException e3) {
                            e2 = e3;
                            try {
                                zipFile.close();
                            } catch (IOException e4) {
                                bf.a(e2, e4);
                            }
                            MethodCollector.o(8811);
                            throw e2;
                        }
                    } catch (IOException e5) {
                        e2 = e5;
                        MethodCollector.o(8811);
                        throw e2;
                    }
                }
                this.f53192d.a(context, hashSet5);
                HashSet hashSet6 = new HashSet();
                for (r rVar5 : hashSet3) {
                    if (hashSet5.contains(rVar5.f53218a)) {
                        rVar5.f53219b.length();
                        hashSet6.add(rVar5.f53219b);
                    } else {
                        rVar5.f53219b.length();
                    }
                }
                synchronized (this.f53191c) {
                    try {
                        this.f53191c.addAll(hashSet6);
                    } finally {
                        MethodCollector.o(8811);
                    }
                }
            } else {
                AssertionError assertionError = new AssertionError("Unsupported Android Version");
                MethodCollector.o(8811);
                throw assertionError;
            }
        } catch (PackageManager.NameNotFoundException e6) {
            IOException iOException = new IOException(com.a.a("Cannot load data for application '%s'", new Object[]{packageName}), e6);
            MethodCollector.o(8811);
            throw iOException;
        }
    }
}
