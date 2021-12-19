package com.google.android.play.core.d;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.b.bf;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipFile;

final class h implements j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Set f53205a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r f53206b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ZipFile f53207c;

    static {
        Covode.recordClassIndex(32882);
    }

    h(Set set, r rVar, ZipFile zipFile) {
        this.f53205a = set;
        this.f53206b = rVar;
        this.f53207c = zipFile;
    }

    @Override // com.google.android.play.core.d.j
    public final void a(k kVar, File file, boolean z) {
        MethodCollector.i(7861);
        this.f53205a.add(file);
        if (!z) {
            a.a("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", new Object[]{this.f53206b.f53219b, kVar.f53208a, this.f53206b.f53218a.getAbsolutePath(), kVar.f53209b.getName(), file.getAbsolutePath()});
            byte[] bArr = new byte[4096];
            InputStream inputStream = this.f53207c.getInputStream(kVar.f53209b);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            fileOutputStream.close();
                            inputStream.close();
                            MethodCollector.o(7861);
                            return;
                        }
                    } catch (Throwable th) {
                        bf.a(th, th);
                    }
                }
            } catch (Throwable th2) {
                bf.a(th, th2);
            }
        } else {
            MethodCollector.o(7861);
            return;
        }
        MethodCollector.o(7861);
        throw th;
        MethodCollector.o(7861);
        throw th;
    }
}
