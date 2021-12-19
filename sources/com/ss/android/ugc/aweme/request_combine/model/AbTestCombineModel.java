package com.ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.l;
import com.ss.android.ugc.aweme.request_combine.a;

public final class AbTestCombineModel extends a {
    @c(a = "body")
    private l abTestResponse;

    static {
        Covode.recordClassIndex(78541);
    }

    public static /* synthetic */ AbTestCombineModel copy$default(AbTestCombineModel abTestCombineModel, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = abTestCombineModel.abTestResponse;
        }
        return abTestCombineModel.copy(lVar);
    }

    public final l component1() {
        return this.abTestResponse;
    }

    public final AbTestCombineModel copy(l lVar) {
        h.f.b.l.d(lVar, "");
        return new AbTestCombineModel(lVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AbTestCombineModel) && h.f.b.l.a(this.abTestResponse, ((AbTestCombineModel) obj).abTestResponse);
        }
        return true;
    }

    public final int hashCode() {
        l lVar = this.abTestResponse;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "AbTestCombineModel(abTestResponse=" + this.abTestResponse + ")";
    }

    public final l getAbTestResponse() {
        return this.abTestResponse;
    }

    public final void setAbTestResponse(l lVar) {
        h.f.b.l.d(lVar, "");
        this.abTestResponse = lVar;
    }

    public AbTestCombineModel(l lVar) {
        h.f.b.l.d(lVar, "");
        this.abTestResponse = lVar;
    }
}
