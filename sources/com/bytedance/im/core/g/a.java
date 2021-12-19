package com.bytedance.im.core.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.am;
import com.bytedance.im.core.internal.b.a.w;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.proto.ClientMetric;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.ReportClientMetricsRequestBody;
import com.bytedance.im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.List;

public final class a extends w {
    static {
        Covode.recordClassIndex(22820);
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    public a() {
        super(IMCMD.REPORT_CLIENT_METRICS.getValue());
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar == null || kVar.f38725f == null || kVar.f38725f.body == null || kVar.f38725f.body.report_client_metrics_body == null) {
            return false;
        }
        return true;
    }

    public final void a(int i2, List<am> list) {
        if (!(list == null || list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (am amVar : list) {
                if (amVar != null) {
                    ClientMetric.Builder v = new ClientMetric.Builder().metric_type(amVar.f37813a).k(amVar.f37814b).v(Long.valueOf(amVar.f37815c));
                    if (amVar.f37816d != null) {
                        v.tags(amVar.f37816d);
                    }
                    arrayList.add(v.build());
                }
            }
            a(i2, new RequestBody.Builder().report_client_metrics_body(new ReportClientMetricsRequestBody.Builder().report_metrics_list(arrayList).build()).build(), null, new Object[0]);
        }
    }
}
