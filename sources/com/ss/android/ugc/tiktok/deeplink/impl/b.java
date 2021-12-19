package com.ss.android.ugc.tiktok.deeplink.impl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.framework.a.a;
import h.e.c;
import h.e.q;
import h.f.b.l;
import h.m.d;
import h.m.p;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final String f148986a = "use_gecko_config";

    /* renamed from: b  reason: collision with root package name */
    static a f148987b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f148988c = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(98111);
    }

    static a a(Context context) {
        Throwable th;
        MethodCollector.i(3945);
        if (context != null) {
            try {
                InputStream open = context.getAssets().open("roma_schema_config.json");
                try {
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = open.read(bArr, 0, 1024);
                        if (read < 0) {
                            break;
                        }
                        sb.append(new String(bArr, 0, read, d.f158808a));
                    }
                    String sb2 = sb.toString();
                    l.b(sb2, "");
                    if (!TextUtils.isEmpty(sb2)) {
                        JSONObject jSONObject = new JSONObject(sb2);
                        a aVar = new a(jSONObject.optJSONObject("payload"), Long.valueOf(jSONObject.optLong("version", -1)));
                        open.close();
                        MethodCollector.o(3945);
                        return aVar;
                    }
                    open.close();
                } catch (Exception unused) {
                    if (open != null) {
                        open.close();
                    }
                    MethodCollector.o(3945);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (open != null) {
                        open.close();
                    }
                    MethodCollector.o(3945);
                    throw th;
                }
            } catch (Exception unused2) {
                MethodCollector.o(3945);
                return null;
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.o(3945);
                throw th;
            }
        }
        MethodCollector.o(3945);
        return null;
    }

    static String a(String str) {
        boolean z;
        MethodCollector.i(3947);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(3947);
            return null;
        }
        File file = new File(str);
        if (file.exists() && file.listFiles() != null) {
            File[] listFiles = file.listFiles();
            l.b(listFiles, "");
            if (listFiles.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                File[] listFiles2 = file.listFiles();
                for (File file2 : listFiles2) {
                    l.b(file2, "");
                    if (p.a("roma_schema_config.json", file2.getName(), true)) {
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2.getAbsolutePath()), d.f158808a), 8192);
                            try {
                                String a2 = q.a((Reader) bufferedReader);
                                c.a(bufferedReader, null);
                                MethodCollector.o(3947);
                                return a2;
                            } catch (Throwable th) {
                                c.a(bufferedReader, th);
                                MethodCollector.o(3947);
                                throw th;
                            }
                        } catch (Exception e2) {
                            a.a((Throwable) e2);
                        }
                    }
                }
                MethodCollector.o(3947);
                return null;
            }
        }
        MethodCollector.o(3947);
        return null;
    }
}
