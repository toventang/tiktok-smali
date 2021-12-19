package com.google.android.play.core.d;

import android.os.Build;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.b.bf;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f53210a = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: b  reason: collision with root package name */
    private final d f53211b;

    static {
        Covode.recordClassIndex(32886);
    }

    l(d dVar) {
        this.f53211b = dVar;
    }

    static void a(r rVar, i iVar) {
        IOException e2;
        MethodCollector.i(8036);
        try {
            ZipFile zipFile = new ZipFile(rVar.f53218a);
            try {
                String str = rVar.f53219b;
                HashMap hashMap = new HashMap();
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    Matcher matcher = f53210a.matcher(zipEntry.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        a.a("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", new Object[]{str, group2, group});
                        Set set = (Set) hashMap.get(group);
                        if (set == null) {
                            set = new HashSet();
                            hashMap.put(group, set);
                        }
                        set.add(new k(zipEntry, group2));
                    }
                }
                HashMap hashMap2 = new HashMap();
                String[] strArr = Build.SUPPORTED_ABIS;
                for (String str2 : strArr) {
                    if (hashMap.containsKey(str2)) {
                        a.a("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", new Object[]{str2});
                        for (k kVar : (Set) hashMap.get(str2)) {
                            if (hashMap2.containsKey(kVar.f53208a)) {
                                a.a("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", new Object[]{kVar.f53208a, str2});
                            } else {
                                hashMap2.put(kVar.f53208a, kVar);
                                a.a("NativeLibraryExtractor: using library %s for ABI %s", new Object[]{kVar.f53208a, str2});
                            }
                        }
                    } else {
                        a.a("NativeLibraryExtractor: there are no native libraries for supported ABI %s", new Object[]{str2});
                    }
                }
                iVar.a(zipFile, new HashSet(hashMap2.values()));
                zipFile.close();
                MethodCollector.o(8036);
            } catch (IOException e3) {
                e2 = e3;
                try {
                    zipFile.close();
                } catch (IOException e4) {
                    bf.a(e2, e4);
                }
                MethodCollector.o(8036);
                throw e2;
            }
        } catch (IOException e5) {
            e2 = e5;
            MethodCollector.o(8036);
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(r rVar, Set<k> set, j jVar) {
        for (k kVar : set) {
            File a2 = this.f53211b.a(rVar.f53219b, kVar.f53208a);
            boolean z = false;
            if (a2.exists() && a2.length() == kVar.f53209b.getSize()) {
                z = true;
            }
            jVar.a(kVar, a2, z);
        }
    }

    /* access modifiers changed from: package-private */
    public final Set<File> a() {
        Set<r> f2 = this.f53211b.f();
        d dVar = this.f53211b;
        ArrayList<String> arrayList = new ArrayList();
        File[] listFiles = dVar.e().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        for (String str : arrayList) {
            Iterator<r> it = f2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f53219b.equals(str)) {
                        break;
                    }
                } else {
                    a.a("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", new Object[]{str});
                    this.f53211b.b(str);
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (r rVar : f2) {
            HashSet hashSet2 = new HashSet();
            a(rVar, new g(this, hashSet2, rVar));
            for (File file2 : this.f53211b.c(rVar.f53219b)) {
                if (!hashSet2.contains(file2)) {
                    a.a("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", new Object[]{file2.getAbsolutePath(), rVar.f53219b, rVar.f53218a.getAbsolutePath()});
                    this.f53211b.a(file2);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }
}
