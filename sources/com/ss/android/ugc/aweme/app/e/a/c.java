package com.ss.android.ugc.aweme.app.e.a;

import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.u;
import com.ss.android.newmedia.d;
import com.ss.android.socialbase.downloader.g.i;
import com.ss.android.socialbase.downloader.g.j;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.ttnet.IDownloadApi;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

public final class c implements j {

    /* renamed from: a  reason: collision with root package name */
    IDownloadApi f66693a;

    static {
        Covode.recordClassIndex(41062);
    }

    private static String a(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                sb.append(a.a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    @Override // com.ss.android.socialbase.downloader.g.j
    public final i a(String str, List<HttpHeader> list) {
        final InputStream inputStream;
        String str2;
        MethodCollector.i(5563);
        final long currentTimeMillis = System.currentTimeMillis();
        if (!d.a(str)) {
            MethodCollector.o(5563);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        final String str3 = "";
        boolean z = false;
        if (list != null && list.size() > 0) {
            for (HttpHeader httpHeader : list) {
                if (TextUtils.equals(httpHeader.f60856a, "downloader_scene")) {
                    str3 = httpHeader.f60857b;
                } else if ("extra_ttnet_common_param".equalsIgnoreCase(httpHeader.f60856a)) {
                    z = true;
                } else {
                    String str4 = httpHeader.f60856a;
                    if (TextUtils.equals(httpHeader.f60856a, "User-Agent")) {
                        str2 = a(httpHeader.f60857b);
                    } else {
                        str2 = httpHeader.f60857b;
                    }
                    arrayList.add(new b(str4, str2));
                }
            }
        }
        if (this.f66693a == null) {
            this.f66693a = (IDownloadApi) RetrofitFactory.a().b(str).d().a(IDownloadApi.class);
        }
        final com.bytedance.retrofit2.b<TypedInput> bVar = this.f66693a.get(z, str, arrayList, null);
        try {
            final u<TypedInput> execute = bVar.execute();
            if (execute.f42630b != null) {
                InputStream in = execute.f42630b.in();
                List<b> list2 = execute.f42629a.f42476d;
                if (list2 != null) {
                    String str5 = null;
                    for (b bVar2 : list2) {
                        if (bVar2.f42471a.equals("Content-Encoding")) {
                            str5 = bVar2.f42472b;
                        }
                    }
                    if (str5 != null && "gzip".equalsIgnoreCase(str5) && !(in instanceof GZIPInputStream)) {
                        inputStream = new GZIPInputStream(in);
                        AnonymousClass1 r12 = new com.ss.android.socialbase.downloader.g.a() {
                            /* class com.ss.android.ugc.aweme.app.e.a.c.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(41063);
                            }

                            @Override // com.ss.android.socialbase.downloader.g.i
                            public final InputStream c() {
                                return inputStream;
                            }

                            @Override // com.ss.android.socialbase.downloader.g.g
                            public final int a() {
                                return execute.f42629a.f42474b;
                            }

                            @Override // com.ss.android.socialbase.downloader.g.g
                            public final void b() {
                                com.ss.android.ugc.aweme.app.e.c.a.a("ttnet", currentTimeMillis, 2, str3, bVar, execute);
                                try {
                                    com.bytedance.retrofit2.b bVar = bVar;
                                    if (bVar != null && !bVar.isCanceled()) {
                                        bVar.cancel();
                                    }
                                } catch (Throwable unused) {
                                }
                            }

                            @Override // com.ss.android.socialbase.downloader.g.i
                            public final void d() {
                                try {
                                    com.bytedance.retrofit2.b bVar = bVar;
                                    if (bVar != null && !bVar.isCanceled()) {
                                        com.ss.android.ugc.aweme.app.e.c.a.a("ttnet", currentTimeMillis, 0, str3, bVar, execute);
                                        bVar.cancel();
                                    }
                                } catch (Throwable unused) {
                                }
                            }

                            @Override // com.ss.android.socialbase.downloader.g.g
                            public final String a(String str) {
                                List<b> list = execute.f42629a.f42476d;
                                if (list == null) {
                                    return null;
                                }
                                for (b bVar : list) {
                                    if (bVar.f42471a.equals(str)) {
                                        return bVar.f42472b;
                                    }
                                }
                                return null;
                            }

                            @Override // com.ss.android.socialbase.downloader.g.a
                            public final void a(Throwable th) {
                                String str;
                                super.a(th);
                                if (execute != null || !(th instanceof com.bytedance.frameworks.baselib.network.http.cronet.b.c)) {
                                    str = null;
                                } else {
                                    str = ((com.bytedance.frameworks.baselib.network.http.cronet.b.c) th).getRequestLog();
                                }
                                if (TextUtils.isEmpty(str)) {
                                    com.ss.android.ugc.aweme.app.e.c.a.a("ttnet", currentTimeMillis, 1, str3, bVar, execute, th.getMessage());
                                } else {
                                    com.ss.android.ugc.aweme.app.e.c.a.a("ttnet", currentTimeMillis, 1, str3, str, th.getMessage());
                                }
                            }
                        };
                        MethodCollector.o(5563);
                        return r12;
                    }
                }
                inputStream = in;
                AnonymousClass1 r122 = new com.ss.android.socialbase.downloader.g.a() {
                    /* class com.ss.android.ugc.aweme.app.e.a.c.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(41063);
                    }

                    @Override // com.ss.android.socialbase.downloader.g.i
                    public final InputStream c() {
                        return inputStream;
                    }

                    @Override // com.ss.android.socialbase.downloader.g.g
                    public final int a() {
                        return execute.f42629a.f42474b;
                    }

                    @Override // com.ss.android.socialbase.downloader.g.g
                    public final void b() {
                        com.ss.android.ugc.aweme.app.e.c.a.a("ttnet", currentTimeMillis, 2, str3, bVar, execute);
                        try {
                            com.bytedance.retrofit2.b bVar = bVar;
                            if (bVar != null && !bVar.isCanceled()) {
                                bVar.cancel();
                            }
                        } catch (Throwable unused) {
                        }
                    }

                    @Override // com.ss.android.socialbase.downloader.g.i
                    public final void d() {
                        try {
                            com.bytedance.retrofit2.b bVar = bVar;
                            if (bVar != null && !bVar.isCanceled()) {
                                com.ss.android.ugc.aweme.app.e.c.a.a("ttnet", currentTimeMillis, 0, str3, bVar, execute);
                                bVar.cancel();
                            }
                        } catch (Throwable unused) {
                        }
                    }

                    @Override // com.ss.android.socialbase.downloader.g.g
                    public final String a(String str) {
                        List<b> list = execute.f42629a.f42476d;
                        if (list == null) {
                            return null;
                        }
                        for (b bVar : list) {
                            if (bVar.f42471a.equals(str)) {
                                return bVar.f42472b;
                            }
                        }
                        return null;
                    }

                    @Override // com.ss.android.socialbase.downloader.g.a
                    public final void a(Throwable th) {
                        String str;
                        super.a(th);
                        if (execute != null || !(th instanceof com.bytedance.frameworks.baselib.network.http.cronet.b.c)) {
                            str = null;
                        } else {
                            str = ((com.bytedance.frameworks.baselib.network.http.cronet.b.c) th).getRequestLog();
                        }
                        if (TextUtils.isEmpty(str)) {
                            com.ss.android.ugc.aweme.app.e.c.a.a("ttnet", currentTimeMillis, 1, str3, bVar, execute, th.getMessage());
                        } else {
                            com.ss.android.ugc.aweme.app.e.c.a.a("ttnet", currentTimeMillis, 1, str3, str, th.getMessage());
                        }
                    }
                };
                MethodCollector.o(5563);
                return r122;
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.app.e.c.a.a("ttnet", currentTimeMillis, 1, str3, e2 instanceof com.bytedance.frameworks.baselib.network.http.cronet.b.c ? ((com.bytedance.frameworks.baselib.network.http.cronet.b.c) e2).getRequestLog() : null, e2.getMessage());
        }
        MethodCollector.o(5563);
        return null;
    }
}
