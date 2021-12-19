package com.benchmark.collection;

import android.os.RemoteException;
import android.text.TextUtils;
import com.benchmark.collection.c;
import com.benchmark.collection.e;
import com.benchmark.netUtils.BytebenchAPI;
import com.benchmark.netUtils.BytebenchFaasAPI;
import com.benchmark.tools.k;
import com.benchmark.tools.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.b.c;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.u;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d extends c {

    /* renamed from: b  reason: collision with root package name */
    public com.benchmark.collection.service.a f6119b;

    /* renamed from: c  reason: collision with root package name */
    public long f6120c;

    /* renamed from: d  reason: collision with root package name */
    public a f6121d = a.INVALID;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.retrofit2.d<TypedInput> f6122e = new com.bytedance.retrofit2.d<TypedInput>() {
        /* class com.benchmark.collection.d.AnonymousClass2 */

        static {
            Covode.recordClassIndex(2970);
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(final b<TypedInput> bVar, final u<TypedInput> uVar) {
            l.a(new Callable<Void>() {
                /* class com.benchmark.collection.d.AnonymousClass2.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(2971);
                }

                /* access modifiers changed from: private */
                /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
                    if (r2 == null) goto L_0x0058;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Void call() {
                    /*
                    // Method dump skipped, instructions count: 109
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.benchmark.collection.d.AnonymousClass2.AnonymousClass1.call():java.lang.Void");
                }
            }, l.f6393a);
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(b<TypedInput> bVar, Throwable th) {
            if (th instanceof c) {
                c cVar = (c) th;
                cVar.getStatusCode();
                cVar.getMessage();
            }
            if (th != null) {
                th.printStackTrace(new PrintWriter(new StringWriter()));
            }
            d.this.f6118a.a(103, -1, th.getMessage());
        }
    };

    static {
        Covode.recordClassIndex(2967);
    }

    @Override // com.benchmark.collection.f
    public final int b() {
        if (this.f6121d != a.RUN) {
            return -4;
        }
        this.f6121d = a.STOPPING;
        l.a(new Callable<Void>() {
            /* class com.benchmark.collection.d.AnonymousClass8 */

            static {
                Covode.recordClassIndex(2977);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                com.benchmark.collection.service.a aVar = d.this.f6119b;
                if (!b.f6115a.f6116b.f6112e) {
                    aVar.f6176f.stopByteBench();
                    if (aVar.f6175e == null) {
                        return null;
                    }
                    aVar.f6175e.a(102, "stop");
                    return null;
                } else if (aVar.f6177g && aVar.f6171a != null) {
                    try {
                        aVar.f6171a.a();
                        return null;
                    } catch (RemoteException e2) {
                        com.benchmark.a.c.a(e2);
                        return null;
                    }
                } else if (aVar.f6175e == null) {
                    return null;
                } else {
                    aVar.f6175e.a(102, -1, "stop failed");
                    return null;
                }
            }
        }, l.f6393a);
        return 0;
    }

    public final void d() {
        com.benchmark.collection.service.a aVar = this.f6119b;
        if (b.f6115a.f6116b.f6112e) {
            try {
                if (aVar.f6177g) {
                    aVar.f6172b.unbindService(aVar.f6173c);
                    aVar.f6171a = null;
                    aVar.f6177g = false;
                    aVar.f6173c = null;
                }
            } catch (Throwable th) {
                com.benchmark.a.c.a(th);
            }
        } else {
            aVar.f6176f.release();
        }
    }

    public enum a {
        INVALID,
        INIT,
        LOADING,
        LOAD,
        START,
        RUN,
        STOPPING,
        STOP,
        QUITTING;

        static {
            Covode.recordClassIndex(2981);
        }
    }

    public final int c() {
        String str;
        String[] result = this.f6119b.f6176f.getResult();
        if (result != null) {
            String str2 = null;
            if (result.length > 0) {
                str = result[0];
            } else {
                str = null;
            }
            if (result.length > 1) {
                str2 = result[1];
            }
            try {
                if (!(this.f6118a == null || str == null)) {
                    final JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("sdk_version", "2.6.0-mt_2");
                    com.benchmark.a.a.a("bytebench_task", jSONObject);
                    if (b.f6115a.f6116b.f6111d == e.b.FAAS_API) {
                        l.a(new Callable<Void>() {
                            /* class com.benchmark.collection.d.AnonymousClass10 */

                            static {
                                Covode.recordClassIndex(2969);
                            }

                            /* access modifiers changed from: private */
                            /* renamed from: a */
                            public Void call() {
                                MethodCollector.i(7188);
                                String jSONObject = jSONObject.toString();
                                u<TypedInput> execute = ((BytebenchFaasAPI) RetrofitUtils.b("").a(BytebenchFaasAPI.class)).reportResult(com.benchmark.netUtils.a.a().b(), RequestBody.create(MediaType.parse("application/json"), jSONObject)).execute();
                                try {
                                    byte[] bArr = new byte[4096];
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    InputStream in = execute.f42630b.in();
                                    while (true) {
                                        int read = in.read(bArr, 0, 4096);
                                        if (read <= 0) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, read);
                                    }
                                    JSONObject jSONObject2 = new JSONObject(jSONObject);
                                    jSONObject2.optInt("status_code");
                                    jSONObject2.optString("message");
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                                MethodCollector.o(7188);
                                return null;
                            }
                        }, l.f6393a);
                    }
                }
            } catch (Exception e2) {
                com.benchmark.a.c.a(e2);
            }
            if (str2 != null) {
                k.a().a(com.benchmark.c.b.f6095l.f6096a, "benchmark", str2);
                if (this.f6121d == a.QUITTING) {
                    this.f6121d = a.LOAD;
                }
            } else {
                this.f6121d = a.INVALID;
            }
        }
        return 0;
    }

    @Override // com.benchmark.collection.f
    public final void a() {
        Map<String, String> a2;
        if (this.f6121d == a.INIT) {
            this.f6120c = System.currentTimeMillis();
            this.f6121d = a.LOADING;
            HashMap hashMap = new HashMap();
            if (com.benchmark.a.b.f6027a == null || (a2 = com.benchmark.a.b.f6027a.a()) == null) {
                hashMap.put("", "");
            } else {
                hashMap.putAll(a2);
            }
            BytebenchAPI bytebenchAPI = (BytebenchAPI) com.benchmark.netUtils.a.a().a(BytebenchAPI.class);
            HashMap hashMap2 = new HashMap(com.benchmark.netUtils.a.a().b());
            if (b.f6115a.f6116b.f6108a) {
                hashMap2.put("aid", "123123");
                hashMap2.put("task_group_id", String.valueOf(b.f6115a.f6116b.f6109b));
            }
            b<TypedInput> defaultBenchmark = bytebenchAPI.getDefaultBenchmark(hashMap, hashMap2);
            defaultBenchmark.request().getUrl();
            defaultBenchmark.enqueue(this.f6122e);
        }
    }

    public final void b(final String str) {
        l.a(new Callable<Void>() {
            /* class com.benchmark.collection.d.AnonymousClass6 */

            static {
                Covode.recordClassIndex(2975);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() {
                int loadByteBench;
                com.benchmark.collection.service.a aVar = d.this.f6119b;
                String str = str;
                if (aVar.f6176f == null) {
                    loadByteBench = -100;
                } else {
                    loadByteBench = aVar.f6176f.loadByteBench(str);
                }
                if (loadByteBench == 0) {
                    d.this.f6118a.a(103, "load Task success");
                    return null;
                }
                d.this.f6118a.a(103, loadByteBench, "loadBytebenchToNative failed");
                return null;
            }
        }, l.f6393a);
    }

    @Override // com.benchmark.collection.f
    public final int a(final int i2) {
        if (this.f6121d != a.LOAD && this.f6121d != a.STOP) {
            return -4;
        }
        this.f6121d = a.START;
        if (i2 == -1) {
            return -1;
        }
        l.a(new Callable<Void>() {
            /* class com.benchmark.collection.d.AnonymousClass7 */

            static {
                Covode.recordClassIndex(2976);
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x0081 A[Catch:{ all -> 0x0082 }] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Void call() {
                /*
                // Method dump skipped, instructions count: 191
                */
                throw new UnsupportedOperationException("Method not decompiled: com.benchmark.collection.d.AnonymousClass7.call():java.lang.Void");
            }
        }, l.f6393a);
        return 0;
    }

    @Override // com.benchmark.collection.f
    public final int a(e eVar) {
        if (!com.benchmark.c.b.f6095l.a()) {
            return -105;
        }
        long currentTimeMillis = System.currentTimeMillis();
        a aVar = b.f6115a.f6116b;
        aVar.f6108a = eVar.f6146a;
        aVar.f6109b = eVar.f6147b;
        aVar.f6111d = eVar.f6148c;
        aVar.f6112e = eVar.f6149d;
        this.f6118a = new c.a() {
            /* class com.benchmark.collection.d.AnonymousClass9 */

            static {
                Covode.recordClassIndex(2978);
            }

            @Override // com.benchmark.collection.c.a
            public final void a(int i2, String str) {
                switch (i2) {
                    case com.bytedance.nita.c.a.f41622a:
                        d.this.f6121d = a.INIT;
                        return;
                    case 101:
                        d.this.f6121d = a.RUN;
                        return;
                    case 102:
                        d.this.f6121d = a.STOP;
                        return;
                    case 103:
                        d.this.f6121d = a.LOAD;
                        long currentTimeMillis = System.currentTimeMillis() - d.this.f6120c;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("cost_time", currentTimeMillis);
                            jSONObject.put("result", 0);
                            jSONObject.put("message", str);
                            com.benchmark.a.a.a("bytebench_collection_load_task", jSONObject);
                            return;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                    case 104:
                        d.this.f6121d = a.QUITTING;
                        d.this.d();
                        return;
                    case 105:
                        l.a(new Callable<Boolean>() {
                            /* class com.benchmark.collection.d.AnonymousClass9.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(2980);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Boolean call() {
                                d.this.c();
                                return true;
                            }
                        }, l.f6393a).a(new l.a<Boolean, Void>() {
                            /* class com.benchmark.collection.d.AnonymousClass9.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(2979);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.benchmark.tools.l] */
                            @Override // com.benchmark.tools.l.a
                            public final /* synthetic */ Void a(l<Boolean> lVar) {
                                lVar.b();
                                return null;
                            }
                        }, l.f6394b);
                        return;
                    default:
                        return;
                }
            }

            @Override // com.benchmark.collection.c.a
            public final void a(int i2, int i3, String str) {
                switch (i2) {
                    case com.bytedance.nita.c.a.f41622a:
                        d.this.f6121d = a.INVALID;
                        return;
                    case 101:
                        d.this.f6121d = a.LOAD;
                        return;
                    case 102:
                        d.this.f6121d = a.INIT;
                        return;
                    case 103:
                        d.this.f6121d = a.INIT;
                        long currentTimeMillis = System.currentTimeMillis() - d.this.f6120c;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("cost_time", currentTimeMillis);
                            jSONObject.put("result", i3);
                            jSONObject.put("message", str);
                            com.benchmark.a.a.a("bytebench_collection_load_task", jSONObject);
                            return;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                    case 104:
                        d.this.d();
                        d.this.f6121d = a.INVALID;
                        return;
                    default:
                        return;
                }
            }
        };
        b.f6115a.f6116b.f6110c = com.benchmark.c.b.f6095l.f6106k + "/bytebench_collection";
        com.benchmark.collection.service.a a2 = com.benchmark.collection.service.a.a();
        this.f6119b = a2;
        a2.a(this.f6118a);
        this.f6118a.a(100, "bytebench init");
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost_time", currentTimeMillis2);
            com.benchmark.a.a.a("bytebench_collection_init", jSONObject);
            return 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public final void a(final String str) {
        if (str != null) {
            k.a().a(com.benchmark.c.b.f6095l.f6096a, "benchmark", str);
        } else {
            str = k.a().a(com.benchmark.c.b.f6095l.f6096a, "benchmark");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("status_code");
            if (optInt != 0) {
                jSONObject.optString("message");
                this.f6118a.a(103, -optInt, "loadBytebench with invalid status_code");
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("resource_list");
            if (jSONArray == null) {
                b(str);
                return;
            }
            final ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.getString(i2));
            }
            final AnonymousClass1 r4 = new Runnable() {
                /* class com.benchmark.collection.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(2968);
                }

                public final void run() {
                    d.this.b(str);
                }
            };
            final AnonymousClass3 r3 = new Runnable() {
                /* class com.benchmark.collection.d.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(2972);
                }

                public final void run() {
                    d.this.f6118a.a(103, -1, "check resource failed");
                }
            };
            l.a(new Callable<Boolean>() {
                /* class com.benchmark.collection.d.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(2974);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Boolean call() {
                    int indexOf;
                    for (String str : arrayList) {
                        String[] split = str.split("/");
                        String str2 = split[split.length - 1];
                        String str3 = b.f6115a.f6116b.f6110c + "/" + str2;
                        if (!TextUtils.isEmpty(str)) {
                            if (!TextUtils.isEmpty(str3)) {
                                File file = new File(str3);
                                if (file.exists() && (indexOf = str.indexOf("?")) != -1) {
                                    String substring = str.substring(indexOf + 1);
                                    if (!TextUtils.isEmpty(substring) && substring.equalsIgnoreCase(com.benchmark.tools.b.a(file))) {
                                    }
                                }
                            }
                            com.benchmark.netUtils.a.a();
                            com.benchmark.netUtils.a.a(str, b.f6115a.f6116b.f6110c, str2);
                        }
                    }
                    return true;
                }
            }, l.f6393a).a(new l.a<Boolean, Void>() {
                /* class com.benchmark.collection.d.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(2973);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.benchmark.tools.l] */
                @Override // com.benchmark.tools.l.a
                public final /* synthetic */ Void a(l<Boolean> lVar) {
                    if (!lVar.b()) {
                        return null;
                    }
                    if (lVar.a().booleanValue()) {
                        Runnable runnable = r4;
                        if (runnable == null) {
                            return null;
                        }
                        runnable.run();
                        return null;
                    }
                    Runnable runnable2 = r3;
                    if (runnable2 == null) {
                        return null;
                    }
                    runnable2.run();
                    return null;
                }
            }, l.f6394b);
        } catch (Exception e2) {
            this.f6118a.a(103, -1, e2.getMessage());
            com.benchmark.a.c.a(e2);
        }
    }
}
