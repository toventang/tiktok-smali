package com.bytedance.ies.xbridge.base.runtime.d;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.g.h;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.ies.xbridge.base.runtime.b.c;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.ttnet.d.d;
import h.f.b.z;
import h.u;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f35849a = new g();

    public static final class a extends com.bytedance.ies.xbridge.base.runtime.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkedHashMap f35850a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f35851b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f35852c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f35853d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.e f35854e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ z.e f35855f;

        static {
            Covode.recordClassIndex(21405);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.b.a
        public final LinkedHashMap<String, String> b() {
            return this.f35850a;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.b.a
        public final InputStream a() {
            return this.f35852c.element;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.b.a
        public final int c() {
            return this.f35851b.element;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.b.a
        public final String d() {
            return this.f35853d.element;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.b.a
        public final Throwable e() {
            return this.f35854e.element;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|(1:3)|4|5|(1:16)(2:9|(2:11|13)(1:17))) */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000b */
        @Override // com.bytedance.ies.xbridge.base.runtime.b.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void f() {
            /*
                r2 = this;
                h.f.b.z$e r0 = r2.f35852c     // Catch:{ all -> 0x000b }
                T r0 = r0.element     // Catch:{ all -> 0x000b }
                java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ all -> 0x000b }
                if (r0 == 0) goto L_0x000b
                r0.close()     // Catch:{ all -> 0x000b }
            L_0x000b:
                h.f.b.z$e r0 = r2.f35855f     // Catch:{ all -> 0x0029 }
                T r0 = r0.element     // Catch:{ all -> 0x0029 }
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x0029 }
                if (r0 == 0) goto L_0x0029
                java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0029 }
                com.bytedance.retrofit2.b r1 = (com.bytedance.retrofit2.b) r1     // Catch:{ all -> 0x0029 }
                if (r1 == 0) goto L_0x0029
                java.lang.String r0 = ""
                h.f.b.l.a(r1, r0)     // Catch:{ all -> 0x0029 }
                boolean r0 = r1.isCanceled()     // Catch:{ all -> 0x0029 }
                if (r0 != 0) goto L_0x0029
                r1.cancel()     // Catch:{ all -> 0x0029 }
            L_0x0029:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.base.runtime.d.g.a.f():void");
        }

        a(LinkedHashMap linkedHashMap, z.c cVar, z.e eVar, z.e eVar2, z.e eVar3, z.e eVar4) {
            this.f35850a = linkedHashMap;
            this.f35851b = cVar;
            this.f35852c = eVar;
            this.f35853d = eVar2;
            this.f35854e = eVar3;
            this.f35855f = eVar4;
        }
    }

    public static final class b extends com.bytedance.ies.xbridge.base.runtime.b.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkedHashMap f35856a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f35857b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f35858c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f35859d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.e f35860e;

        static {
            Covode.recordClassIndex(21406);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.b.b
        public final LinkedHashMap<String, String> b() {
            return this.f35856a;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.b.b
        public final String a() {
            return this.f35858c.element;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.b.b
        public final String d() {
            return this.f35859d.element;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.b.b
        public final Throwable e() {
            return this.f35860e.element;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.b.b
        public final Integer c() {
            return Integer.valueOf(this.f35857b.element);
        }

        b(LinkedHashMap linkedHashMap, z.c cVar, z.e eVar, z.e eVar2, z.e eVar3) {
            this.f35856a = linkedHashMap;
            this.f35857b = cVar;
            this.f35858c = eVar;
            this.f35859d = eVar2;
            this.f35860e = eVar3;
        }
    }

    private g() {
    }

    static {
        Covode.recordClassIndex(21404);
    }

    private static u<String, String, LinkedHashMap<String, String>> a(c cVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> a2 = i.a(new h(cVar.f35823k).a(), linkedHashMap);
        return new u<>(a2.first, a2.second, linkedHashMap);
    }

    private static d c(c cVar) {
        d dVar = new d();
        dVar.f28942c = cVar.f35819g;
        dVar.f28943d = cVar.f35820h;
        dVar.f28944e = cVar.f35821i;
        return dVar;
    }

    private static List<com.bytedance.retrofit2.client.b> b(c cVar) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap<String, String> linkedHashMap = cVar.f35813a;
        if (linkedHashMap != null) {
            for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
                arrayList.add(new com.bytedance.retrofit2.client.b(entry.getKey(), entry.getValue()));
            }
        }
        String str = cVar.f35817e;
        if (str != null) {
            arrayList.add(new com.bytedance.retrofit2.client.b("Content-Encoding", str));
        }
        String str2 = cVar.f35818f;
        if (str2 != null) {
            arrayList.add(new com.bytedance.retrofit2.client.b("Content-Type", str2));
        }
        return arrayList;
    }

    private static TypedOutput d(c cVar) {
        LinkedHashMap<String, File> linkedHashMap = cVar.f35822j;
        if (linkedHashMap != null && (!linkedHashMap.isEmpty())) {
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            Map<String, String> map = cVar.f35815c;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    multipartTypedOutput.addPart(entry.getKey(), new TypedString(entry.getValue()));
                }
            }
            for (Map.Entry<String, File> entry2 : linkedHashMap.entrySet()) {
                multipartTypedOutput.addPart(entry2.getKey(), new TypedFile(null, entry2.getValue()));
            }
            return multipartTypedOutput;
        } else if (cVar.f35816d != null) {
            return new TypedByteArray(cVar.f35818f, cVar.f35816d, new String[0]);
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b9, code lost:
        if (r11 == null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e2, code lost:
        if (r11 != null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e4, code lost:
        r2.element = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r6 = r11.execute();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00eb, code lost:
        if (r6 == null) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ed, code lost:
        r2.element = r6.a();
        r9.element = r6.f42630b;
        r5 = r6.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fd, code lost:
        if (r5 == null) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ff, code lost:
        r7 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0107, code lost:
        if (r7.hasNext() == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0109, code lost:
        r5 = r7.next();
        h.f.b.l.a((java.lang.Object) r5, "");
        r6 = r5.f42471a;
        h.f.b.l.a((java.lang.Object) r6, "");
        r5 = r5.f42472b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0119, code lost:
        if (r5 != null) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011b, code lost:
        r5 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011c, code lost:
        r10.put(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0120, code lost:
        r3 = h.z.f158842a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0124, code lost:
        r5 = move-exception;
        r5 = (T) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0125, code lost:
        r1.element = (T) (r5.getClass().toString() + ":" + r5.getMessage() + "," + r5.getStatusCode());
        r2.element = r5.getStatusCode();
        r0.element = r5;
        r3 = h.z.f158842a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x015f, code lost:
        r5 = move-exception;
        r5 = (T) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0160, code lost:
        r1.element = (T) (r5.getClass().toString() + ":" + r5.getMessage() + ',' + -1001);
        r2.element = -1001;
        r0.element = r5;
        r3 = h.z.f158842a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0196, code lost:
        r5 = move-exception;
        r5 = (T) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0197, code lost:
        r1.element = (T) (r5.getClass().toString() + ":" + r5.getMessage() + "," + r5.getStatusCode());
        r2.element = r5.getStatusCode();
        r0.element = r5;
        r3 = h.z.f158842a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01d0, code lost:
        if (r3 == null) goto L_0x01d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.ies.xbridge.base.runtime.b.b a(com.bytedance.ies.xbridge.base.runtime.b.f r19, com.bytedance.ies.xbridge.base.runtime.b.c r20, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend r21) {
        /*
        // Method dump skipped, instructions count: 506
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.base.runtime.d.g.a(com.bytedance.ies.xbridge.base.runtime.b.f, com.bytedance.ies.xbridge.base.runtime.b.c, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend):com.bytedance.ies.xbridge.base.runtime.b.b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0167, code lost:
        if (r0 != null) goto L_0x0186;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.ies.xbridge.base.runtime.b.a b(com.bytedance.ies.xbridge.base.runtime.b.f r20, com.bytedance.ies.xbridge.base.runtime.b.c r21, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend r22) {
        /*
        // Method dump skipped, instructions count: 402
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.base.runtime.d.g.b(com.bytedance.ies.xbridge.base.runtime.b.f, com.bytedance.ies.xbridge.base.runtime.b.c, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend):com.bytedance.ies.xbridge.base.runtime.b.a");
    }
}
