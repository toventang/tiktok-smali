package com.ss.android.ugc.aweme.draft;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftCheckResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileCheckResult;
import com.ss.android.ugc.aweme.draft.model.DraftVECheckResult;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.mvtheme.d;
import com.ss.android.vesdk.VEUtils;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;

public final class o implements d {

    /* renamed from: a  reason: collision with root package name */
    public final c f83225a;

    static {
        Covode.recordClassIndex(51886);
    }

    @Override // com.ss.android.ugc.aweme.draft.d
    public final DraftCheckResult a() {
        DraftCheckResult draftCheckResult;
        ArrayList<String> arrayList;
        d dVar = this.f83225a.W.M;
        if (dVar != null) {
            DraftFileCheckResult a2 = e.a(dVar.mvResUnzipPath);
            if (!a2.isSuc()) {
                draftCheckResult = new DraftCheckResult(1, n.d(a2), null, 0, 12, null);
            } else {
                int checkMVResourceIntegrity = VEUtils.checkMVResourceIntegrity(dVar.mvResUnzipPath);
                if (checkMVResourceIntegrity != 0) {
                    draftCheckResult = new DraftCheckResult(1, z.INSTANCE, n.d(new DraftVECheckResult(checkMVResourceIntegrity - 10000, e.b(dVar.mvResUnzipPath))), 0, 8, null);
                } else {
                    draftCheckResult = new DraftCheckResult(1, null, null, 0, 14, null);
                }
            }
        } else {
            draftCheckResult = new DraftCheckResult(0, null, null, 0, 14, null);
        }
        if (!draftCheckResult.isSuc()) {
            return draftCheckResult;
        }
        d dVar2 = this.f83225a.W.M;
        if (dVar2 != null) {
            arrayList = dVar2.selectMediaList;
        } else {
            arrayList = null;
        }
        return e.a(arrayList);
    }

    public o(c cVar) {
        l.d(cVar, "");
        this.f83225a = cVar;
    }
}
