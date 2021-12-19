package com.ss.ugc.effectplatform.task.a;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.ugc.effectplatform.a;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import com.ss.ugc.effectplatform.util.i;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.v;
import java.util.Map;

public final class b extends com.ss.ugc.effectplatform.task.b {

    /* renamed from: a  reason: collision with root package name */
    private final a f153705a;

    /* renamed from: b  reason: collision with root package name */
    private final String f153706b;

    /* renamed from: c  reason: collision with root package name */
    private final int f153707c;

    /* renamed from: d  reason: collision with root package name */
    private final String f153708d = null;

    /* renamed from: f  reason: collision with root package name */
    private final String f153709f = null;

    static {
        Covode.recordClassIndex(102540);
    }

    @Override // com.ss.ugc.effectplatform.task.b
    public final void b() {
    }

    @Override // com.ss.ugc.effectplatform.task.b
    public final void a() {
        c();
    }

    public final SingleAlgorithmModelResponse c() {
        Integer num;
        SingleAlgorithmModelResponse singleAlgorithmModelResponse;
        p[] pVarArr = new p[5];
        String str = this.f153705a.f153403c;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        pVarArr[0] = v.a("sdk_version", str);
        String str3 = this.f153705a.f153408h;
        if (str3 != null) {
            str2 = str3;
        }
        pVarArr[1] = v.a("device_type", str2);
        pVarArr[2] = v.a("device_platform", "android");
        a.c cVar = this.f153705a.F;
        if (cVar != null) {
            num = Integer.valueOf(cVar.ordinal());
        } else {
            num = null;
        }
        pVarArr[3] = v.a("status", String.valueOf(num));
        pVarArr[4] = v.a(StringSet.name, this.f153706b);
        Map b2 = ag.b(pVarArr);
        int i2 = this.f153707c;
        if (i2 > 0) {
            b2.put("busi_id", String.valueOf(i2));
        }
        b2.putAll(i.a(this.f153705a, false));
        String str4 = this.f153708d;
        if (str4 != null && (!h.m.p.a((CharSequence) str4))) {
            b2.put("big_version", str4);
        }
        e eVar = new e(com.ss.ugc.effectplatform.util.p.a(b2, this.f153705a.A + "/model/api/model"), c.GET, null, null, false, 60);
        V v = this.f153705a.r.f156544a;
        if (v == null) {
            a(new com.ss.ugc.effectplatform.model.e(10011));
            return null;
        }
        try {
            String a2 = com.ss.ugc.effectplatform.g.c.a(v.fetchFromNetwork(eVar).f153441b);
            if (a2.length() == 0) {
                a(new com.ss.ugc.effectplatform.model.e(10002));
                return null;
            }
            com.ss.ugc.effectplatform.a.b.b bVar = this.f153705a.q;
            if (bVar != null && (singleAlgorithmModelResponse = (SingleAlgorithmModelResponse) bVar.f153430a.convertJsonToObj(a2, SingleAlgorithmModelResponse.class)) != null) {
                return singleAlgorithmModelResponse;
            }
            a(new com.ss.ugc.effectplatform.model.e(10008));
            return null;
        } catch (Exception e2) {
            d.a.e.b.a("FetchModelInfoByNameTask", "fetch single model info failed!", e2);
            a(new com.ss.ugc.effectplatform.model.e(e2));
            return null;
        }
    }

    private static void a(com.ss.ugc.effectplatform.model.e eVar) {
        d.a.e.b.a("FetchModelInfoByNameTask", "fetch single model info failed!, " + eVar.f153652b, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str, int i2) {
        super(null, aVar.K);
        l.c(aVar, "");
        l.c(str, "");
        this.f153705a = aVar;
        this.f153706b = str;
        this.f153707c = i2;
    }
}
