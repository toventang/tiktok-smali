package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a;
import com.ss.ugc.effectplatform.a.b.b;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.algorithm.f;
import com.ss.ugc.effectplatform.h.h;
import com.ss.ugc.effectplatform.model.TagInfo;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.model.i;
import com.ss.ugc.effectplatform.model.net.DownloadableModelResponse;
import com.ss.ugc.effectplatform.util.p;
import com.ss.ugc.effectplatform.util.u;
import d.a.g.d;
import h.f.b.l;
import h.q;
import h.r;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class s extends b {

    /* renamed from: a  reason: collision with root package name */
    final d.a.b.c.a f153896a = new d.a.b.c.a(false);

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.a f153897b;

    /* renamed from: c  reason: collision with root package name */
    private final f f153898c;

    /* renamed from: d  reason: collision with root package name */
    private final int f153899d;

    /* renamed from: f  reason: collision with root package name */
    private final a f153900f;

    public interface a {
        static {
            Covode.recordClassIndex(102642);
        }

        void a(i iVar);

        void a(Exception exc);
    }

    static {
        Covode.recordClassIndex(102641);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.b
    public final void b() {
    }

    private final e c() {
        Object obj;
        Object obj2;
        TagInfo tagInfo;
        HashMap hashMap = new HashMap();
        String str = this.f153897b.f153403c;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        hashMap.put("sdk_version", str);
        String str3 = this.f153897b.f153408h;
        if (str3 != null) {
            str2 = str3;
        }
        hashMap.put("device_type", str2);
        a.c cVar = this.f153897b.F;
        if (cVar == null) {
            cVar = a.c.ONLINE;
        }
        hashMap.put("status", String.valueOf(cVar.ordinal()));
        int i2 = this.f153899d;
        if (i2 > 0) {
            hashMap.put("busi_id", String.valueOf(i2));
        }
        try {
            obj = q.m223constructorimpl(this.f153898c.b("model/effect_local_config.json"));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        TagInfo tagInfo2 = null;
        if (q.m228isFailureimpl(obj)) {
            obj = null;
        }
        String str4 = (String) obj;
        if (str4 != null) {
            try {
                b bVar = this.f153897b.q;
                if (bVar != null) {
                    tagInfo = (TagInfo) bVar.f153430a.convertJsonToObj(str4, TagInfo.class);
                } else {
                    tagInfo = null;
                }
                obj2 = q.m223constructorimpl(tagInfo);
            } catch (Throwable th2) {
                obj2 = q.m223constructorimpl(r.a(th2));
            }
            if (!q.m228isFailureimpl(obj2)) {
                tagInfo2 = obj2;
            }
            TagInfo tagInfo3 = tagInfo2;
            if (tagInfo3 != null) {
                hashMap.put("tag", tagInfo3.getTag());
            }
        }
        hashMap.putAll(com.ss.ugc.effectplatform.util.i.a(this.f153897b, false));
        return new e(p.a(hashMap, l.a(this.f153897b.A, (Object) "/model/api/arithmetics")), c.GET, null, null, false, 60);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.b
    public final void a() {
        com.ss.ugc.effectplatform.a.c.f fVar;
        com.ss.ugc.effectplatform.a.c.a aVar;
        String a2;
        DownloadableModelResponse downloadableModelResponse;
        Map<String, List<ModelInfo>> arithmetics;
        d a3 = d.a.a();
        try {
            if (!this.f153790e) {
                e c2 = c();
                V v = this.f153897b.r.f156544a;
                String str = null;
                if (v != null) {
                    fVar = v.fetchFromNetwork(c2);
                    if (!(fVar == null || (aVar = fVar.f153441b) == null || (a2 = com.ss.ugc.effectplatform.g.c.a(aVar)) == null)) {
                        if (!u.a(a2)) {
                            b bVar = this.f153897b.q;
                            if (bVar == null || (downloadableModelResponse = (DownloadableModelResponse) bVar.f153430a.convertJsonToObj(a2, DownloadableModelResponse.class)) == null) {
                                a aVar2 = this.f153900f;
                                if (aVar2 != null) {
                                    aVar2.a(new RuntimeException("result return null when parseResponse"));
                                    return;
                                }
                                return;
                            }
                            d.a.g.b bVar2 = new d.a.g.b();
                            int status_code = downloadableModelResponse.getStatus_code();
                            if (status_code == 0) {
                                DownloadableModelResponse.Data data = downloadableModelResponse.getData();
                                if (data == null || (arithmetics = data.getArithmetics()) == null) {
                                    throw new IllegalStateException("status_code == 0 but data == null, indicates there may be an internal server error");
                                }
                                for (Map.Entry<String, List<ModelInfo>> entry : arithmetics.entrySet()) {
                                    String key = entry.getKey();
                                    entry.getValue();
                                    List<ModelInfo> list = arithmetics.get(key);
                                    if (list != null) {
                                        for (ModelInfo modelInfo : list) {
                                            bVar2.a(key, modelInfo);
                                        }
                                    } else {
                                        throw new IllegalStateException("modelInfo list is null".toString());
                                    }
                                }
                                i iVar = new i(bVar2);
                                a aVar3 = this.f153900f;
                                if (aVar3 != null) {
                                    aVar3.a(iVar);
                                }
                                h hVar = this.f153897b.G;
                                if (hVar != null) {
                                    hVar.onFetchModelList(true, null, a3.a(), this.f153897b.f153403c);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("status code == " + status_code + " , indicates there is no model config from server, sdk version is " + this.f153897b.f153403c);
                        }
                        a aVar4 = this.f153900f;
                        if (aVar4 != null) {
                            StringBuilder sb = new StringBuilder("responseString is empty when convertToString, errorMsg: ");
                            if (fVar != null) {
                                str = fVar.f153443d;
                            }
                            aVar4.a(new RuntimeException(sb.append(str).toString()));
                            return;
                        }
                        return;
                    }
                } else {
                    fVar = null;
                }
                a aVar5 = this.f153900f;
                if (aVar5 != null) {
                    StringBuilder sb2 = new StringBuilder("responseString return null when convertToString, errorMsg: ");
                    if (fVar != null) {
                        str = fVar.f153443d;
                    }
                    aVar5.a(new RuntimeException(sb2.append(str).toString()));
                }
            }
        } catch (Exception e2) {
            h hVar2 = this.f153897b.G;
            if (hVar2 != null) {
                hVar2.onFetchModelList(false, e2.getMessage(), a3.a(), this.f153897b.f153403c);
            }
            a aVar6 = this.f153900f;
            if (aVar6 != null) {
                aVar6.a(e2);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(com.ss.ugc.effectplatform.a aVar, f fVar, int i2, a aVar2) {
        super(null);
        l.c(aVar, "");
        l.c(fVar, "");
        this.f153897b = aVar;
        this.f153898c = fVar;
        this.f153899d = i2;
        this.f153900f = aVar2;
    }
}
