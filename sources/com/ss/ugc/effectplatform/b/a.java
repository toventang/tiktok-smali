package com.ss.ugc.effectplatform.b;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.algorithm.c;
import com.ss.ugc.effectplatform.algorithm.f;
import com.ss.ugc.effectplatform.b.a.a;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.model.g;
import com.ss.ugc.effectplatform.util.n;
import d.a.d.a.h;
import d.a.e.b;
import h.f.b.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a extends c {

    /* renamed from: c  reason: collision with root package name */
    private final f f153481c;

    static {
        Covode.recordClassIndex(102350);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.b.c
    public final void a() {
        super.a();
        c.a();
    }

    public final Map<String, g> b() {
        h hVar;
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        try {
            List<String> c2 = this.f153481c.c("model");
            if (c2 != null) {
                Iterator<T> it = c2.iterator();
                while (it.hasNext()) {
                    List<String> c3 = this.f153481c.c("model/".concat(String.valueOf(it.next())));
                    if (c3 != null) {
                        for (T t : c3) {
                            try {
                                str2 = n.a(t);
                            } catch (Exception unused) {
                                str2 = "";
                            }
                            if (!l.a((Object) str2, (Object) "")) {
                                String b2 = n.b(t);
                                g a2 = g.a.a("");
                                a2.a(str2);
                                a2.b(b2);
                                a2.f153663c = true;
                                hashMap.put(str2, a2);
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            b.a("DiskLruCacheImpl", "getLocalModelInfoList built in error", e2);
        }
        try {
            com.ss.ugc.effectplatform.b.a.a c4 = c();
            Set<String> a3 = c4 != null ? c4.a() : null;
            if (a3 != null) {
                for (T t2 : a3) {
                    String a4 = n.a(t2);
                    com.ss.ugc.effectplatform.b.a.a c5 = c();
                    a.d d2 = c5 != null ? c5.d(t2) : null;
                    if (!(d2 == null || (hVar = d2.f153506a[0]) == null || (str = hVar.f156633a) == null)) {
                        g a5 = g.a.a(str);
                        a5.f153663c = false;
                        hashMap.put(a4, a5);
                    }
                }
            }
            return hashMap;
        } catch (Exception e3) {
            b.a("DiskLruCacheImpl", "error while getLocalModelInfoList", e3);
            return hashMap;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006b, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006f, code lost:
        r2.a();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006b A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.ugc.effectplatform.model.g a(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.b.a.a(java.lang.String):com.ss.ugc.effectplatform.model.g");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(String str, int i2, f fVar) {
        super(str, i2, 0, Long.MAX_VALUE, null, 20);
        l.c(str, "");
        l.c(fVar, "");
        this.f153481c = fVar;
    }

    public final String a(com.ss.ugc.effectplatform.model.algorithm.b bVar, ModelInfo modelInfo, d.a.d.a.c cVar) {
        Set<String> a2;
        l.c(bVar, "");
        l.c(modelInfo, "");
        l.c(cVar, "");
        String name = modelInfo.getName();
        if (name != null) {
            String a3 = a.C4084a.a(name);
            com.ss.ugc.effectplatform.b.a.a c2 = c();
            if (!(c2 == null || (a2 = c2.a()) == null)) {
                for (T t : a2) {
                    if (l.a((Object) n.a(t), (Object) a3)) {
                        d(t);
                    }
                }
            }
        }
        l.c(modelInfo, "");
        String a4 = a.C4084a.a(modelInfo.getName() + "_v" + modelInfo.getVersion() + "_size" + modelInfo.getType() + "_md5" + com.ss.ugc.effectplatform.model.algorithm.c.a(modelInfo) + ".model");
        int i2 = b.f153524a[bVar.ordinal()];
        String str = null;
        if (i2 == 1) {
            ExtendedUrlModel file_url = modelInfo.getFile_url();
            if (file_url != null) {
                str = file_url.getUri();
            }
            return (String) c.a(this, a4, cVar, str).getFirst();
        } else if (i2 == 2) {
            ExtendedUrlModel file_url2 = modelInfo.getFile_url();
            if (file_url2 != null) {
                str = file_url2.getUri();
            }
            return (String) c.b(this, a4, cVar, str).getFirst();
        } else {
            throw new h.n();
        }
    }
}
