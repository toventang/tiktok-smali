package com.lynx.tasm.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.provider.d;
import com.lynx.tasm.provider.e;
import com.lynx.tasm.provider.f;
import com.lynx.tasm.provider.k;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static b f56548a;

    /* renamed from: b  reason: collision with root package name */
    private LruCache<String, Integer> f56549b = new LruCache<>(100);

    static {
        Covode.recordClassIndex(35275);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(14064);
        if (f56548a == null) {
            synchronized (b.class) {
                try {
                    if (f56548a == null) {
                        f56548a = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(14064);
                    throw th;
                }
            }
        }
        b bVar = f56548a;
        MethodCollector.o(14064);
        return bVar;
    }

    public final Integer a(Context context, String str) {
        String str2;
        MethodCollector.i(14066);
        if (str == null || str.isEmpty()) {
            MethodCollector.o(14066);
            return null;
        }
        try {
            Integer valueOf = Integer.valueOf(Integer.parseInt(str));
            MethodCollector.o(14066);
            return valueOf;
        } catch (NumberFormatException unused) {
            String replace = str.toLowerCase().replace("-", "_");
            Integer num = this.f56549b.get(replace);
            if (num != null) {
                MethodCollector.o(14066);
                return num;
            }
            int indexOf = replace.indexOf(".");
            if (indexOf <= 0 || indexOf >= replace.length()) {
                str2 = null;
            } else {
                str2 = replace.substring(0, indexOf);
            }
            if (TextUtils.isEmpty(str2)) {
                MethodCollector.o(14066);
                return null;
            }
            synchronized (this) {
                Integer valueOf2 = Integer.valueOf(context.getResources().getIdentifier(replace, str2, context.getPackageName()));
                if (valueOf2.intValue() > 0) {
                    this.f56549b.put(replace, valueOf2);
                }
                MethodCollector.o(14066);
                return valueOf2;
            }
        } catch (Throwable th) {
            MethodCollector.o(14066);
            throw th;
        }
    }

    public final void a(final e eVar, final d dVar) {
        final f fVar = new f();
        final String str = eVar.f56811a;
        if (TextUtils.isEmpty(str)) {
            fVar.f56818b = "url is empty!";
            dVar.onFailed(fVar);
            LLog.c("lynx_ResManager", "url:" + str + " is empty!");
            return;
        }
        a.a().execute(new Runnable() {
            /* class com.lynx.tasm.core.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35276);
            }

            public final void run() {
                MethodCollector.i(12037);
                if ((str.startsWith("http://") || str.startsWith("https://")) && str.length() > 8) {
                    e eVar = eVar;
                    d dVar = dVar;
                    k kVar = LynxEnv.b().f55533c;
                    if (kVar == null) {
                        f fVar = new f();
                        fVar.f56818b = "don't have ResProvider.Can't Get Resource.";
                        dVar.onFailed(fVar);
                        MethodCollector.o(12037);
                        return;
                    }
                    kVar.a(eVar, dVar);
                    MethodCollector.o(12037);
                } else if (str.startsWith("asset:///") && str.length() > 9) {
                    String str = str;
                    d dVar2 = dVar;
                    InputStream inputStream = null;
                    f fVar2 = new f();
                    try {
                        InputStream open = LynxEnv.b().f55531a.getAssets().open(str.substring(9));
                        StringBuilder sb = new StringBuilder(open.available());
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = open.read(bArr);
                            if (read != -1) {
                                sb.append(new String(bArr, 0, read));
                            } else {
                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(sb.toString().getBytes());
                                fVar2.f56820d = byteArrayInputStream;
                                dVar2.onSuccess(fVar2);
                                byteArrayInputStream.close();
                                try {
                                    open.close();
                                    MethodCollector.o(12037);
                                    return;
                                } catch (IOException unused) {
                                    MethodCollector.o(12037);
                                    return;
                                }
                            }
                        }
                    } catch (IOException e2) {
                        fVar2.f56818b = e2.toString();
                        dVar2.onFailed(fVar2);
                        if (0 != 0) {
                            try {
                                inputStream.close();
                                MethodCollector.o(12037);
                            } catch (IOException unused2) {
                                MethodCollector.o(12037);
                            }
                        } else {
                            MethodCollector.o(12037);
                        }
                    } catch (Throwable th) {
                        if (0 != 0) {
                            try {
                                inputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        MethodCollector.o(12037);
                        throw th;
                    }
                } else if (!str.startsWith("res:///") || str.length() <= 7) {
                    new RuntimeException("illegal url:" + str);
                    fVar.f56818b = "url is illegal:" + str;
                    dVar.onFailed(fVar);
                    MethodCollector.o(12037);
                } else {
                    b bVar = b.this;
                    String str2 = str;
                    d dVar3 = dVar;
                    Integer a2 = bVar.a(LynxEnv.b().f55531a, str2.substring(7));
                    f fVar3 = new f();
                    if (a2 != null) {
                        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(new byte[]{a2.byteValue()});
                        fVar3.f56820d = byteArrayInputStream2;
                        dVar3.onSuccess(fVar3);
                        try {
                            byteArrayInputStream2.close();
                            MethodCollector.o(12037);
                        } catch (IOException unused4) {
                            MethodCollector.o(12037);
                        }
                    } else {
                        fVar3.f56818b = "resource not found!";
                        dVar3.onFailed(fVar3);
                        MethodCollector.o(12037);
                    }
                }
            }
        });
    }
}
