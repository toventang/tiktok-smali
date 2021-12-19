package com.bytedance.android.livesdkapi.depend.model.report;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class a implements b<ReportCommitData> {
    static {
        Covode.recordClassIndex(13740);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ReportCommitData a(f fVar) {
        ReportCommitData reportCommitData = new ReportCommitData();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return reportCommitData;
            } else if (b2 == 1) {
                reportCommitData.status = fVar.f();
            } else if (b2 == 2) {
                reportCommitData.desc = fVar.d();
            } else if (b2 == 3) {
                reportCommitData.reportId = fVar.f();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                reportCommitData.recordId = fVar.f();
            }
        }
    }
}
