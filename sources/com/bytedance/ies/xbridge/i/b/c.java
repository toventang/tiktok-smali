package com.bytedance.ies.xbridge.i.b;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.d.d;
import com.bytedance.ies.xbridge.base.runtime.d.f;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostPermissionDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionGrantCallback;
import com.bytedance.ies.xbridge.i.a.c;
import com.bytedance.ies.xbridge.i.c.e;
import com.bytedance.ies.xbridge.i.c.g;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.n;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.v;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public final class c extends com.bytedance.ies.xbridge.i.a.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f36078a = "XUploadImageMethod";

    static {
        Covode.recordClassIndex(21582);
    }

    public static final class a implements OnPermissionGrantCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f36079a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f36080b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f36081c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c.a f36082d;

        static {
            Covode.recordClassIndex(21583);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionGrantCallback
        public final void onAllGranted() {
            this.f36079a.a(this.f36080b, this.f36081c, this.f36082d);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionGrantCallback
        public final void onNotGranted() {
            this.f36082d.a(0, "request permission denied");
        }

        a(c cVar, Context context, e eVar, c.a aVar) {
            this.f36079a = cVar;
            this.f36080b = context;
            this.f36081c = eVar;
            this.f36082d = aVar;
        }
    }

    private final IHostPermissionDepend g() {
        IHostPermissionDepend iHostPermissionDepend;
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar = (com.bytedance.ies.xbridge.base.runtime.depend.b) a(com.bytedance.ies.xbridge.base.runtime.depend.b.class);
        if (bVar != null && (iHostPermissionDepend = bVar.f35881j) != null) {
            return iHostPermissionDepend;
        }
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar2 = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l;
        if (bVar2 != null) {
            return bVar2.f35881j;
        }
        return null;
    }

    private final ExecutorService a() {
        IHostThreadPoolExecutorDepend iHostThreadPoolExecutorDepend;
        ExecutorService normalThreadExecutor;
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar;
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar2 = (com.bytedance.ies.xbridge.base.runtime.depend.b) a(com.bytedance.ies.xbridge.base.runtime.depend.b.class);
        if (((bVar2 != null && (iHostThreadPoolExecutorDepend = bVar2.f35882k) != null) || ((bVar = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l) != null && (iHostThreadPoolExecutorDepend = bVar.f35882k) != null)) && (normalThreadExecutor = iHostThreadPoolExecutorDepend.getNormalThreadExecutor()) != null) {
            return normalThreadExecutor;
        }
        ExecutorService a2 = com.bytedance.common.utility.b.c.a();
        l.a((Object) a2, "");
        return a2;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f36083a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f36084b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c.a f36085c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LinkedHashMap f36086d;

        static {
            Covode.recordClassIndex(21584);
        }

        b(c cVar, e eVar, c.a aVar, LinkedHashMap linkedHashMap) {
            this.f36083a = cVar;
            this.f36084b = eVar;
            this.f36085c = aVar;
            this.f36086d = linkedHashMap;
        }

        public final void run() {
            IHostNetworkDepend iHostNetworkDepend;
            com.bytedance.ies.xbridge.base.runtime.depend.b bVar;
            LinkedHashMap<String, String> a2 = d.a(this.f36084b.f36121d);
            n nVar = this.f36084b.f36120c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (nVar != null) {
                com.bytedance.ies.xbridge.l a3 = nVar.a();
                while (a3.a()) {
                    String b2 = a3.b();
                    k i2 = nVar.i(b2);
                    int i3 = com.bytedance.ies.xbridge.base.runtime.d.e.f35845a[i2.a().ordinal()];
                    if (i3 == 1) {
                        linkedHashMap.put(b2, String.valueOf(i2.d()));
                    } else if (i3 == 2) {
                        linkedHashMap.put(b2, String.valueOf(i2.b()));
                    } else if (i3 == 3) {
                        linkedHashMap.put(b2, String.valueOf(i2.c()));
                    } else if (i3 == 4) {
                        linkedHashMap.put(b2, i2.e());
                    }
                }
            }
            a aVar = new a(this);
            String str = this.f36084b.f36118a;
            if (str == null) {
                l.a("url");
            }
            LinkedHashMap<String, File> linkedHashMap2 = this.f36086d;
            com.bytedance.ies.xbridge.base.runtime.depend.b bVar2 = (com.bytedance.ies.xbridge.base.runtime.depend.b) this.f36083a.a(com.bytedance.ies.xbridge.base.runtime.depend.b.class);
            if ((bVar2 == null || (iHostNetworkDepend = bVar2.f35880i) == null) && ((bVar = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l) == null || (iHostNetworkDepend = bVar.f35880i) == null)) {
                iHostNetworkDepend = new f();
            }
            l.c(str, "");
            l.c(a2, "");
            l.c(linkedHashMap2, "");
            l.c(linkedHashMap, "");
            l.c(aVar, "");
            l.c(iHostNetworkDepend, "");
            com.bytedance.ies.xbridge.base.runtime.b.c a4 = new com.bytedance.ies.xbridge.base.runtime.b.c(str).a(a2);
            l.c(linkedHashMap2, "");
            a4.f35822j = linkedHashMap2;
            com.bytedance.ies.xbridge.base.runtime.b.c a5 = a4.a((Map<String, String>) linkedHashMap);
            a5.f35814b = true;
            d.a(a5.a(iHostNetworkDepend), aVar);
        }

        public static final class a implements com.bytedance.ies.xbridge.base.runtime.d.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f36087a;

            static {
                Covode.recordClassIndex(21585);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(b bVar) {
                this.f36087a = bVar;
            }

            @Override // com.bytedance.ies.xbridge.base.runtime.d.a
            public final void a(Integer num, Throwable th) {
                String str = "";
                l.c(th, str);
                c.a aVar = this.f36087a.f36085c;
                String message = th.getMessage();
                if (message != null) {
                    str = message;
                }
                aVar.a(0, str);
            }

            @Override // com.bytedance.ies.xbridge.base.runtime.d.a
            public final void a(JSONObject jSONObject, LinkedHashMap<String, String> linkedHashMap, Integer num) {
                String str;
                List<String> list;
                l.c(jSONObject, "");
                l.c(linkedHashMap, "");
                try {
                    String jSONObject2 = jSONObject.toString();
                    l.a((Object) jSONObject2, "");
                    com.bytedance.ies.xbridge.i.d.b bVar = ((com.bytedance.ies.xbridge.i.d.e) com.bytedance.ies.xbridge.base.runtime.d.c.a(jSONObject2, com.bytedance.ies.xbridge.i.d.e.class)).f36136a;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator<String> keys = jSONObject.keys();
                    l.a((Object) keys, "");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        l.a((Object) next, "");
                        Object obj = jSONObject.get(next);
                        l.a(obj, "");
                        linkedHashMap2.put(next, obj);
                    }
                    String str2 = null;
                    if (bVar == null || (list = bVar.f36133b) == null || !(!list.isEmpty())) {
                        str = null;
                    } else {
                        str = (String) h.a.n.h((List) list);
                    }
                    c.a aVar = this.f36087a.f36085c;
                    g gVar = new g();
                    gVar.f36127a = str;
                    if (bVar != null) {
                        str2 = bVar.f36132a;
                    }
                    gVar.f36128b = str2;
                    gVar.f36129c = linkedHashMap2;
                    aVar.a(gVar, "");
                } catch (Throwable unused) {
                }
            }

            @Override // com.bytedance.ies.xbridge.base.runtime.d.a
            public final z a(JSONObject jSONObject, LinkedHashMap<String, String> linkedHashMap, String str, Throwable th, Integer num) {
                l.c(jSONObject, "");
                l.c(linkedHashMap, "");
                l.c(str, "");
                l.c(th, "");
                l.c(jSONObject, "");
                l.c(linkedHashMap, "");
                l.c(str, "");
                l.c(th, "");
                return null;
            }
        }
    }

    public final void a(Context context, e eVar, c.a aVar) {
        LinkedHashMap<String, File> b2 = b(context, eVar, aVar);
        if (b2 != null) {
            a().execute(new b(this, eVar, aVar, b2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.util.LinkedHashMap<java.lang.String, java.io.File> */
    /* JADX WARN: Multi-variable type inference failed */
    private static LinkedHashMap<String, File> b(Context context, e eVar, c.a aVar) {
        if (eVar.f36122e != null) {
            List<e.b> list = eVar.f36122e;
            if (list == null) {
                l.a();
            }
            ArrayList<p> arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
            for (T t : list) {
                File a2 = a(context, t.f36124b, aVar, t.f36123a);
                if (a2 == null) {
                    return null;
                }
                arrayList.add(new p(t.f36123a, a2));
            }
            LinkedHashMap<String, File> linkedHashMap = new LinkedHashMap<>();
            for (p pVar : arrayList) {
                linkedHashMap.put(pVar.getFirst(), pVar.getSecond());
            }
            return linkedHashMap;
        } else if (eVar.a().length() > 0) {
            File a3 = a(context, eVar.a(), aVar, "filePath");
            if (a3 == null) {
                return null;
            }
            return ag.d(v.a("file", a3));
        } else {
            aVar.a(-3, "filePath or formDataBody can not be null.");
            return null;
        }
    }

    @Override // com.bytedance.ies.xbridge.i.a.c
    public final void a(e eVar, c.a aVar, com.bytedance.ies.xbridge.e eVar2) {
        l.c(eVar, "");
        l.c(aVar, "");
        l.c(eVar2, "");
        Context context = (Context) a(Context.class);
        if (context == null) {
            aVar.a(0, "Context not provided in host");
            return;
        }
        Activity a2 = com.bytedance.ies.xbridge.o.a.a(context);
        if (a2 == null) {
            aVar.a(0, "context can not convert to activity");
            return;
        }
        IHostPermissionDepend g2 = g();
        if (g2 == null || !g2.hasPermission(a2, "android.permission.READ_EXTERNAL_STORAGE")) {
            IHostPermissionDepend g3 = g();
            if (g3 != null) {
                g3.requestPermission(a2, new a(this, context, eVar, aVar), "android.permission.READ_EXTERNAL_STORAGE");
            } else {
                aVar.a(0, "uploadImageDepend is null");
            }
        } else {
            a(context, eVar, aVar);
        }
    }

    private static File a(Context context, String str, c.a aVar, String str2) {
        boolean z;
        boolean z2 = false;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aVar.a(-3, "The file path should not be empty.The key is ".concat(String.valueOf(str2)));
            return null;
        }
        String a2 = com.bytedance.ies.xbridge.i.d.a.a(context, str);
        if (a2 == null || a2.length() == 0) {
            z2 = true;
        }
        if (z2) {
            aVar.a(-9, "File is not exist.The key is ".concat(String.valueOf(str2)));
            return null;
        }
        File file = new File(a2);
        if (!file.exists()) {
            aVar.a(-9, "File is not exist.The key is ".concat(String.valueOf(str2)));
            return null;
        } else if (file.isFile()) {
            return file;
        } else {
            aVar.a(-9, "File is not file.The key is ".concat(String.valueOf(str2)));
            return null;
        }
    }
}
