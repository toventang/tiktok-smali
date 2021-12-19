package com.ss.android.ugc.aweme.commercialize.depend;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.ies.android.base.runtime.depend.INetworkDepend;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.ttnet.d.d;
import com.ss.android.common.util.g;
import h.f.b.l;
import h.f.b.z;
import h.u;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class v implements INetworkDepend {

    /* renamed from: a  reason: collision with root package name */
    public static final a f73789a = new a((byte) 0);

    static {
        Covode.recordClassIndex(45436);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45437);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c extends com.bytedance.ies.android.base.runtime.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkedHashMap f73797a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f73798b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f73799c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f73800d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.e f73801e;

        static {
            Covode.recordClassIndex(45439);
        }

        @Override // com.bytedance.ies.android.base.runtime.a.b
        public final LinkedHashMap<String, String> a() {
            return this.f73797a;
        }

        @Override // com.bytedance.ies.android.base.runtime.a.b
        public final String c() {
            return this.f73800d.element;
        }

        @Override // com.bytedance.ies.android.base.runtime.a.b
        public final Throwable d() {
            return this.f73801e.element;
        }

        @Override // com.bytedance.ies.android.base.runtime.a.b
        public final Integer b() {
            return Integer.valueOf(this.f73798b.element);
        }

        c(LinkedHashMap linkedHashMap, z.c cVar, z.e eVar, z.e eVar2, z.e eVar3) {
            this.f73797a = linkedHashMap;
            this.f73798b = cVar;
            this.f73799c = eVar;
            this.f73800d = eVar2;
            this.f73801e = eVar3;
        }
    }

    private static d c(com.bytedance.ies.android.base.runtime.a.c cVar) {
        d dVar = new d();
        dVar.f28942c = cVar.f31892g;
        dVar.f28943d = cVar.f31893h;
        dVar.f28944e = cVar.f31894i;
        return dVar;
    }

    private static u<String, String, LinkedHashMap<String, String>> d(com.bytedance.ies.android.base.runtime.a.c cVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> a2 = i.a(new g(cVar.f31896k).a(), linkedHashMap);
        return new u<>(a2.first, a2.second, linkedHashMap);
    }

    private static List<com.bytedance.retrofit2.client.b> a(com.bytedance.ies.android.base.runtime.a.c cVar) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap<String, String> linkedHashMap = cVar.f31886a;
        if (linkedHashMap != null) {
            for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
                arrayList.add(new com.bytedance.retrofit2.client.b(entry.getKey(), entry.getValue()));
            }
        }
        String str = cVar.f31890e;
        if (str != null) {
            arrayList.add(new com.bytedance.retrofit2.client.b("Content-Encoding", str));
        }
        String str2 = cVar.f31891f;
        if (str2 != null) {
            arrayList.add(new com.bytedance.retrofit2.client.b("Content-Type", str2));
        }
        return arrayList;
    }

    private static TypedOutput b(com.bytedance.ies.android.base.runtime.a.c cVar) {
        LinkedHashMap<String, File> linkedHashMap = cVar.f31895j;
        if (linkedHashMap != null && (!linkedHashMap.isEmpty())) {
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            Map<String, String> map = cVar.f31888c;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    multipartTypedOutput.addPart(entry.getKey(), new TypedString(entry.getValue()));
                }
            }
            for (Map.Entry<String, File> entry2 : linkedHashMap.entrySet()) {
                multipartTypedOutput.addPart(entry2.getKey(), new TypedFile(null, entry2.getValue()));
            }
            return multipartTypedOutput;
        } else if (cVar.f31889d != null) {
            return new TypedByteArray(cVar.f31891f, cVar.f31889d, new String[0]);
        } else {
            return null;
        }
    }

    private static void a(InputStream inputStream, WeakReference<com.bytedance.retrofit2.b<TypedInput>> weakReference) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
        if (weakReference != null) {
            try {
                com.bytedance.retrofit2.b<TypedInput> bVar = weakReference.get();
                if (bVar != null) {
                    l.b(bVar, "");
                    if (!bVar.isCanceled()) {
                        bVar.cancel();
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c6, code lost:
        if (r11 == null) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01b0, code lost:
        if (r4 != null) goto L_0x01cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0097 A[Catch:{ all -> 0x01c8 }] */
    @Override // com.bytedance.ies.android.base.runtime.depend.INetworkDepend
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.ies.android.base.runtime.a.a requestForStream(com.bytedance.ies.android.base.runtime.a.e r24, com.bytedance.ies.android.base.runtime.a.c r25) {
        /*
        // Method dump skipped, instructions count: 478
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.depend.v.requestForStream(com.bytedance.ies.android.base.runtime.a.e, com.bytedance.ies.android.base.runtime.a.c):com.bytedance.ies.android.base.runtime.a.a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bf, code lost:
        if (r11 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0184, code lost:
        if (r1 != null) goto L_0x01a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0094 A[Catch:{ all -> 0x019c }] */
    @Override // com.bytedance.ies.android.base.runtime.depend.INetworkDepend
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.ies.android.base.runtime.a.b requestForString(com.bytedance.ies.android.base.runtime.a.e r23, com.bytedance.ies.android.base.runtime.a.c r24) {
        /*
        // Method dump skipped, instructions count: 430
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.depend.v.requestForString(com.bytedance.ies.android.base.runtime.a.e, com.bytedance.ies.android.base.runtime.a.c):com.bytedance.ies.android.base.runtime.a.b");
    }

    public static final class b extends com.bytedance.ies.android.base.runtime.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f73790a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinkedHashMap f73791b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.c f73792c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f73793d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.e f73794e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ z.e f73795f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ z.e f73796g;

        static {
            Covode.recordClassIndex(45438);
        }

        b(v vVar, LinkedHashMap linkedHashMap, z.c cVar, z.e eVar, z.e eVar2, z.e eVar3, z.e eVar4) {
            this.f73790a = vVar;
            this.f73791b = linkedHashMap;
            this.f73792c = cVar;
            this.f73793d = eVar;
            this.f73794e = eVar2;
            this.f73795f = eVar3;
            this.f73796g = eVar4;
        }
    }
}
