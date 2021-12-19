package com.ss.ugc.effectplatform.task.a;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a;
import com.ss.ugc.effectplatform.algorithm.f;
import com.ss.ugc.effectplatform.h.h;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.model.e;
import com.ss.ugc.effectplatform.model.f;
import com.ss.ugc.effectplatform.model.g;
import com.ss.ugc.effectplatform.task.aa;
import com.ss.ugc.effectplatform.task.b;
import com.ss.ugc.effectplatform.util.n;
import com.ss.ugc.effectplatform.util.o;
import com.ss.ugc.effectplatform.util.q;
import com.ss.ugc.effectplatform.util.s;
import d.a.g.d;
import h.a.ag;
import h.a.i;
import h.f.b.ab;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    private final a f153710a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f153711b;

    /* renamed from: c  reason: collision with root package name */
    private final f f153712c;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.b.a f153713d;

    /* renamed from: f  reason: collision with root package name */
    private final String[] f153714f;

    /* renamed from: g  reason: collision with root package name */
    private final int f153715g;

    /* renamed from: h  reason: collision with root package name */
    private final String f153716h;

    static {
        Covode.recordClassIndex(102541);
    }

    @Override // com.ss.ugc.effectplatform.task.b
    public final void b() {
    }

    @Override // com.ss.ugc.effectplatform.task.b
    public final void a() {
        com.ss.ugc.effectplatform.model.f a2;
        String[] strArr = this.f153714f;
        if (strArr != null) {
            d.a.b.c.f fVar = d.f153717a;
            fVar.f156552a.lock();
            try {
                int i2 = this.f153715g;
                aa aaVar = this.f153711b;
                if (aaVar == null || (a2 = aaVar.a(i2, true)) == null) {
                    throw new RuntimeException("model list with " + i2 + " not found!");
                }
                a(a(i2, strArr, a2));
                fVar.f156552a.unlock();
            } catch (Exception e2) {
                d.a.e.b.a("effect_platform", "fetchModels: " + i.j(strArr) + " exception happens!", e2);
                if (!b(strArr)) {
                    throw e2;
                }
            } catch (Throwable th) {
                fVar.f156552a.unlock();
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        if (r16 == null) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<com.ss.ugc.effectplatform.model.algorithm.ModelInfo> a(int r22, java.lang.String[] r23, com.ss.ugc.effectplatform.model.f r24) {
        /*
        // Method dump skipped, instructions count: 490
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.task.a.c.a(int, java.lang.String[], com.ss.ugc.effectplatform.model.f):java.util.ArrayList");
    }

    public final List<g> a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            g a2 = this.f153713d.a(n.a(str));
            if (a2 != null) {
                arrayList.add(a2);
            } else if (a(str)) {
                String str2 = s.a("model") + str;
                l.c(str2, "");
                g a3 = g.a.a("file:///android_asset://".concat(String.valueOf(str2)));
                String b2 = n.b(str);
                int c2 = n.c(str);
                a3.b(b2);
                a3.f153662b = c2;
                arrayList.add(a3);
            }
        }
        return arrayList;
    }

    private final boolean b(String[] strArr) {
        if (strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (!a(str)) {
                return false;
            }
        }
        return true;
    }

    private static Effect a(ModelInfo modelInfo) {
        Effect effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0, null, null, 0, null, null, null, null, false, null, null, null, null, null, null, null, null, -1, 524287, null);
        effect.setName(modelInfo.getName());
        return effect;
    }

    private final void a(ArrayList<ModelInfo> arrayList) {
        Exception e2;
        long j2;
        if (o.a(this.f153710a.C) || !(!arrayList.isEmpty())) {
            Iterator<ModelInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                ModelInfo next = it.next();
                d.a.e.b.a("effect_platform", "download model: " + next.getName() + ", version: " + next.getVersion());
                d a2 = d.a.a();
                try {
                    h hVar = this.f153710a.G;
                    if (hVar != null) {
                        l.a((Object) next, "");
                        hVar.onModelDownloadStart(a(next), next);
                    }
                    long a3 = d.a.b.a.a.a();
                    l.a((Object) next, "");
                    com.ss.ugc.effectplatform.model.algorithm.b bVar = this.f153710a.D;
                    V v = this.f153710a.r.f156544a;
                    if (v == null) {
                        j2 = 0;
                    } else {
                        j2 = new com.ss.ugc.effectplatform.e.a(this.f153713d, v).a(next, bVar);
                        if (j2 > 0) {
                            Effect a4 = a(next);
                            long j3 = j2 / ((long) com.ss.ugc.effectplatform.c.a.f153563a);
                            d.a.e.b.a("effect_platform", "model::" + next.getName() + ",version = " + next.getVersion() + ",size = " + String.valueOf(next.getType()) + " download success!");
                            next.setTotalSize(j3 / ((long) com.ss.ugc.effectplatform.c.a.f153563a));
                            long a5 = d.a.b.a.a.a() - a3;
                            V v2 = this.f153710a.s.f156544a;
                            if (v2 != null) {
                                a aVar = this.f153710a;
                                String name = next.getName();
                                String version = next.getVersion();
                                String bVar2 = this.f153710a.D.toString();
                                p[] pVarArr = new p[2];
                                pVarArr[0] = v.a("size", Long.valueOf(j3));
                                try {
                                    pVarArr[1] = v.a("duration", Long.valueOf(a5));
                                    com.ss.ugc.effectplatform.i.b.a(v2, true, aVar, name, version, bVar2, ag.a(pVarArr), "");
                                } catch (Exception e3) {
                                    e2 = e3;
                                    l.a((Object) next, "");
                                    a(a(next), next, e2);
                                    a(next, e2);
                                }
                            }
                            h hVar2 = this.f153710a.G;
                            if (hVar2 != null) {
                                hVar2.onModelDownloadSuccess(a4, next, a2.a());
                            }
                            l.c(next, "");
                            if (q.ANDROID != q.PC) {
                                String name2 = next.getName();
                                g a6 = g.a.a("");
                                a6.a(name2);
                                String a7 = com.ss.ugc.effectplatform.model.algorithm.c.a(next);
                                if (a7 == null) {
                                    a7 = "";
                                }
                                l.c(a7, "");
                                a6.f153661a = a7;
                                a6.f153662b = next.getType();
                                a6.b(next.getVersion());
                                a6.f153663c = false;
                                com.ss.ugc.effectplatform.algorithm.h hVar3 = new com.ss.ugc.effectplatform.algorithm.h(a6, next);
                                d.a.b.c.f fVar = com.ss.ugc.effectplatform.algorithm.c.f153452a;
                                fVar.f156552a.lock();
                                try {
                                    d.a.e.b.a("AlgorithmModelInfoMemoryCache", "model: " + name2 + " write in cache!");
                                    com.ss.ugc.effectplatform.algorithm.c.f153453b.put(name2, hVar3);
                                } finally {
                                    fVar.f156552a.unlock();
                                }
                            }
                        }
                    }
                    RuntimeException runtimeException = new RuntimeException("download model fail, downloadFileSize = ".concat(String.valueOf(j2)));
                    a(a(next), next, runtimeException);
                    a(next, runtimeException);
                } catch (Exception e4) {
                    e2 = e4;
                    l.a((Object) next, "");
                    a(a(next), next, e2);
                    a(next, e2);
                }
            }
            return;
        }
        d.a.e.b.a("effect_platform", "download " + h.a.n.k(arrayList) + " failed!, network unavailable!", null);
        throw new com.ss.ugc.effectplatform.f.d(10011, "network unavailable");
    }

    private final boolean a(String str) {
        boolean a2 = this.f153712c.a(s.a("model") + str);
        if (a2) {
            d.a.e.b.a("effect_platform", "model: " + str + " is built in resource");
        }
        return a2;
    }

    private final ModelInfo a(String str, int i2) {
        com.ss.ugc.effectplatform.model.f a2;
        d.a.g.b<String, f.a> bVar;
        Collection<f.a> a3;
        try {
            aa aaVar = this.f153711b;
            if (!(aaVar == null || (a2 = aaVar.a(i2, false)) == null || (bVar = a2.f153657a) == null || (a3 = bVar.a()) == null)) {
                for (f.a aVar : a3) {
                    if (l.a((Object) aVar.f153659a.getName(), (Object) str)) {
                        return aVar.f153659a;
                    }
                }
            }
        } catch (Exception e2) {
            d.a.e.b.a("effect_platform", "exception happens in getLatestModelInfo", e2);
        }
        return null;
    }

    private final void a(ModelInfo modelInfo, Exception exc) {
        d.a.e.b.a("effect_platform", "model::" + modelInfo.getName() + ",info.getVersion() = " + modelInfo.getVersion() + ", size = " + String.valueOf(modelInfo.getType()) + " download failure", exc);
        g a2 = this.f153713d.a(modelInfo.getName());
        if (a2 != null) {
            String b2 = a2.b();
            if (b2 == null) {
                l.a();
            }
            if (!n.a(b2, modelInfo.getVersion())) {
                throw exc;
            }
            return;
        }
        throw exc;
    }

    private final void a(Effect effect, ModelInfo modelInfo, Exception exc) {
        String message;
        List<String> url_list;
        e eVar = new e(exc);
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        String str = null;
        boolean z = true;
        if (!(file_url == null || (url_list = file_url.getUrl_list()) == null || !(!url_list.isEmpty()))) {
            str = url_list.get(0);
        }
        V v = this.f153710a.s.f156544a;
        if (v != null) {
            a aVar = this.f153710a;
            String name = modelInfo.getName();
            String version = modelInfo.getVersion();
            String bVar = this.f153710a.D.toString();
            p[] pVarArr = new p[2];
            pVarArr[0] = v.a("error_code", Integer.valueOf(eVar.f153651a));
            if (str == null) {
                str = "";
            }
            pVarArr[1] = v.a("download_url", str);
            Map a2 = ag.a(pVarArr);
            String message2 = exc.getMessage();
            if (message2 != null && !h.m.p.a((CharSequence) message2)) {
                z = false;
            }
            if (z) {
                message = ab.a(exc.getClass()).c();
            } else {
                message = exc.getMessage();
            }
            com.ss.ugc.effectplatform.i.b.a(v, false, aVar, name, version, bVar, a2, message);
        }
        h hVar = this.f153710a.G;
        if (hVar != null) {
            hVar.onModelDownloadError(effect, modelInfo, exc);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(a aVar, aa aaVar, com.ss.ugc.effectplatform.algorithm.f fVar, com.ss.ugc.effectplatform.b.a aVar2, String[] strArr, int i2) {
        super(null, aVar.K);
        l.c(aVar, "");
        l.c(fVar, "");
        l.c(aVar2, "");
        this.f153710a = aVar;
        this.f153711b = aaVar;
        this.f153712c = fVar;
        this.f153713d = aVar2;
        this.f153714f = strArr;
        this.f153715g = i2;
        this.f153716h = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(a aVar, aa aaVar, com.ss.ugc.effectplatform.algorithm.f fVar, com.ss.ugc.effectplatform.b.a aVar2, String[] strArr, int i2, int i3) {
        this(aVar, aaVar, fVar, aVar2, (i3 & 16) != 0 ? null : strArr, (i3 & 32) != 0 ? 0 : i2);
    }
}
