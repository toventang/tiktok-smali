package com.ss.android.ugc.aweme.request_combine;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.o;
import h.f.b.g;
import h.f.b.l;

public final class PortraitCombineModel extends a {
    @c(a = "body")
    private o portraitData;

    static {
        Covode.recordClassIndex(78523);
    }

    public PortraitCombineModel() {
        this(null, 1, null);
    }

    public static /* synthetic */ PortraitCombineModel copy$default(PortraitCombineModel portraitCombineModel, o oVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            oVar = portraitCombineModel.portraitData;
        }
        return portraitCombineModel.copy(oVar);
    }

    public final o component1() {
        return this.portraitData;
    }

    public final PortraitCombineModel copy(o oVar) {
        return new PortraitCombineModel(oVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PortraitCombineModel) && l.a(this.portraitData, ((PortraitCombineModel) obj).portraitData);
        }
        return true;
    }

    public final int hashCode() {
        o oVar = this.portraitData;
        if (oVar != null) {
            return oVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PortraitCombineModel(portraitData=" + this.portraitData + ")";
    }

    public final o getPortraitData() {
        return this.portraitData;
    }

    public final void setPortraitData(o oVar) {
        this.portraitData = oVar;
    }

    public PortraitCombineModel(o oVar) {
        this.portraitData = oVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PortraitCombineModel(o oVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : oVar);
    }
}
