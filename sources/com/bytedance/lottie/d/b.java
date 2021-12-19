package com.bytedance.lottie.d;

import android.content.Context;
import androidx.core.g.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    final Context f40657a;

    /* renamed from: b  reason: collision with root package name */
    final String f40658b;

    static {
        Covode.recordClassIndex(24936);
    }

    /* access modifiers changed from: package-private */
    public final e<a, InputStream> a() {
        a aVar;
        MethodCollector.i(1334);
        try {
            String str = this.f40658b;
            File file = new File(a(this.f40657a), a(str, a.Json, false));
            if (!file.exists()) {
                file = new File(a(this.f40657a), a(str, a.Zip, false));
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                MethodCollector.o(1334);
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
                MethodCollector.o(1334);
                return eVar;
            } catch (FileNotFoundException unused) {
                MethodCollector.o(1334);
                return null;
            }
        } catch (FileNotFoundException unused2) {
            MethodCollector.o(1334);
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
        this.f40657a = applicationContext;
        this.f40658b = str;
    }

    public static String a(String str, a aVar, boolean z) {
        String tempExtension;
        StringBuilder append = new StringBuilder("lottie_cache_").append(str.replaceAll("\\W+", ""));
        if (z) {
            tempExtension = aVar.extension;
        } else {
            tempExtension = aVar.tempExtension();
        }
        return append.append(tempExtension).toString();
    }
}
