package com.facebook.soloader;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.soloader.l;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class e extends l {

    /* renamed from: d  reason: collision with root package name */
    protected final File f49201d;

    /* renamed from: e  reason: collision with root package name */
    protected final String f49202e;

    static {
        Covode.recordClassIndex(30761);
    }

    /* access modifiers changed from: protected */
    public class b extends l.e {

        /* renamed from: a  reason: collision with root package name */
        private final l f49205a;

        /* renamed from: b  reason: collision with root package name */
        public a[] f49206b;

        /* renamed from: c  reason: collision with root package name */
        public final ZipFile f49207c;

        static {
            Covode.recordClassIndex(30763);
        }

        /* access modifiers changed from: protected */
        public boolean a(ZipEntry zipEntry, String str) {
            return true;
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.soloader.l.e
        public final l.d c() {
            return new a(this, (byte) 0);
        }

        @Override // java.io.Closeable, com.facebook.soloader.l.e, java.lang.AutoCloseable
        public void close() {
            this.f49207c.close();
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.soloader.l.e
        public final l.b b() {
            return new l.b(a());
        }

        final class a extends l.d {

            /* renamed from: b  reason: collision with root package name */
            private int f49210b;

            static {
                Covode.recordClassIndex(30764);
            }

            @Override // com.facebook.soloader.l.d
            public final boolean a() {
                b.this.a();
                if (this.f49210b < b.this.f49206b.length) {
                    return true;
                }
                return false;
            }

            @Override // com.facebook.soloader.l.d
            public final l.c b() {
                MethodCollector.i(6076);
                b.this.a();
                a[] aVarArr = b.this.f49206b;
                int i2 = this.f49210b;
                this.f49210b = i2 + 1;
                a aVar = aVarArr[i2];
                InputStream inputStream = b.this.f49207c.getInputStream(aVar.f49203a);
                try {
                    l.c cVar = new l.c(aVar, inputStream);
                    MethodCollector.o(6076);
                    return cVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    MethodCollector.o(6076);
                    throw th;
                }
            }

            private a() {
            }

            /* synthetic */ a(b bVar, byte b2) {
                this();
            }
        }

        /* access modifiers changed from: package-private */
        public final a[] a() {
            if (this.f49206b == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(e.this.f49202e);
                String[] a2 = j.a();
                Enumeration<? extends ZipEntry> entries = this.f49207c.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    Matcher matcher = compile.matcher(zipEntry.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int a3 = j.a(a2, group);
                        if (a3 >= 0) {
                            linkedHashSet.add(group);
                            a aVar = (a) hashMap.get(group2);
                            if (aVar == null || a3 < aVar.f49204b) {
                                hashMap.put(group2, new a(group2, zipEntry, a3));
                            }
                        }
                    }
                }
                this.f49205a.f49216h = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                a[] aVarArr = (a[]) hashMap.values().toArray(new a[hashMap.size()]);
                Arrays.sort(aVarArr);
                int i2 = 0;
                for (int i3 = 0; i3 < aVarArr.length; i3++) {
                    a aVar2 = aVarArr[i3];
                    if (a(aVar2.f49203a, aVar2.f49223c)) {
                        i2++;
                    } else {
                        aVarArr[i3] = null;
                    }
                }
                a[] aVarArr2 = new a[i2];
                int i4 = 0;
                for (a aVar3 : aVarArr) {
                    if (aVar3 != null) {
                        aVarArr2[i4] = aVar3;
                        i4++;
                    }
                }
                this.f49206b = aVarArr2;
            }
            return this.f49206b;
        }

        b(l lVar) {
            MethodCollector.i(6313);
            this.f49207c = new ZipFile(e.this.f49201d);
            this.f49205a = lVar;
            MethodCollector.o(6313);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.soloader.l
    public l.e a() {
        return new b(this);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends l.a implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        final ZipEntry f49203a;

        /* renamed from: b  reason: collision with root package name */
        final int f49204b;

        static {
            Covode.recordClassIndex(30762);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f49223c.compareTo(((a) obj).f49223c);
        }

        a(String str, ZipEntry zipEntry, int i2) {
            super(str, com.a.a("pseudo-zip-hash-1-%s-%s-%s-%s", new Object[]{zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())}));
            this.f49203a = zipEntry;
            this.f49204b = i2;
        }
    }

    public e(Context context, String str, File file, String str2) {
        super(context, str);
        this.f49201d = file;
        this.f49202e = str2;
    }
}
