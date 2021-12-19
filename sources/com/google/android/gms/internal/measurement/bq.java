package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public final class bq {
    static {
        Covode.recordClassIndex(31683);
    }

    static cm<File> a(Context context) {
        cm<File> cmVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            try {
                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                if (file.exists()) {
                    cmVar = cm.zza(file);
                } else {
                    cmVar = cm.zzc();
                }
                return cmVar;
            } catch (RuntimeException unused) {
                cm<File> zzc = cm.zzc();
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return zzc;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static bn a(File file) {
        MethodCollector.i(6812);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                HashMap hashMap = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        String[] split = readLine.split(" ", 3);
                        if (split.length != 3) {
                            String valueOf = String.valueOf(readLine);
                            if (valueOf.length() != 0) {
                                "Invalid: ".concat(valueOf);
                            } else {
                                new String("Invalid: ");
                            }
                        } else {
                            String str = split[0];
                            String decode = Uri.decode(split[1]);
                            String decode2 = Uri.decode(split[2]);
                            if (!hashMap.containsKey(str)) {
                                hashMap.put(str, new HashMap());
                            }
                            ((Map) hashMap.get(str)).put(decode, decode2);
                        }
                    } else {
                        String.valueOf(String.valueOf(file)).length();
                        bn bnVar = new bn(hashMap);
                        bufferedReader.close();
                        MethodCollector.o(6812);
                        return bnVar;
                    }
                }
            } catch (Throwable th) {
                ep.f50822a.a(th, th);
            }
            MethodCollector.o(6812);
            throw th;
        } catch (IOException e2) {
            RuntimeException runtimeException = new RuntimeException(e2);
            MethodCollector.o(6812);
            throw runtimeException;
        }
    }
}
