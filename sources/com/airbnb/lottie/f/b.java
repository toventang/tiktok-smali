package com.airbnb.lottie.f;

import android.content.Context;
import androidx.core.g.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

/* access modifiers changed from: package-private */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    final Context f5548a;

    /* renamed from: b  reason: collision with root package name */
    final String f5549b;

    static {
        Covode.recordClassIndex(2314);
    }

    /* access modifiers changed from: package-private */
    public final e<a, InputStream> a() {
        a aVar;
        MethodCollector.i(6545);
        try {
            String str = this.f5549b;
            File file = new File(a(this.f5548a), a(str, a.Json, false));
            if (!file.exists()) {
                file = new File(a(this.f5548a), a(str, a.Zip, false));
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                MethodCollector.o(6545);
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                if (file.getAbsolutePath().endsWith(".zip")) {
                    aVar = a.Zip;
                } else {
                    aVar = a.Json;
                }
                file.getAbsolutePath();
                e<a, InputStream> eVar = new e<>(aVar, fileInputStream);
                MethodCollector.o(6545);
                return eVar;
            } catch (FileNotFoundException unused) {
                MethodCollector.o(6545);
                return null;
            }
        } catch (FileNotFoundException unused2) {
            MethodCollector.o(6545);
            return null;
        }
    }

    public static File a(Context context) {
        if (d.f107194b != null && d.f107197e) {
            return d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        d.f107194b = cacheDir;
        return cacheDir;
    }

    b(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f5548a = applicationContext;
        this.f5549b = str;
    }

    /* access modifiers changed from: package-private */
    public final File a(InputStream inputStream, a aVar) {
        MethodCollector.i(6555);
        File file = new File(a(this.f5548a), a(this.f5549b, aVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                MethodCollector.o(6555);
                throw th;
            }
        } finally {
            inputStream.close();
            MethodCollector.o(6555);
        }
    }

    static String a(String str, a aVar, boolean z) {
        String str2;
        StringBuilder append = new StringBuilder("lottie_cache_").append(str.replaceAll("\\W+", ""));
        if (z) {
            str2 = aVar.tempExtension();
        } else {
            str2 = aVar.extension;
        }
        return append.append(str2).toString();
    }
}
