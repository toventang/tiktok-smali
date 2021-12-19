package com.ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.commercialize.model.t;
import com.ss.android.ugc.aweme.request_combine.a;
import h.f.b.l;

public final class CommerceSettingCombineModel extends a {
    @c(a = "body")
    private t combineModel;

    static {
        Covode.recordClassIndex(78544);
    }

    public static /* synthetic */ CommerceSettingCombineModel copy$default(CommerceSettingCombineModel commerceSettingCombineModel, t tVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            tVar = commerceSettingCombineModel.combineModel;
        }
        return commerceSettingCombineModel.copy(tVar);
    }

    public final t component1() {
        return this.combineModel;
    }

    public final CommerceSettingCombineModel copy(t tVar) {
        l.d(tVar, "");
        return new CommerceSettingCombineModel(tVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CommerceSettingCombineModel) && l.a(this.combineModel, ((CommerceSettingCombineModel) obj).combineModel);
        }
        return true;
    }

    public final int hashCode() {
        t tVar = this.combineModel;
        if (tVar != null) {
            return tVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CommerceSettingCombineModel(combineModel=" + this.combineModel + ")";
    }

    public final t getCombineModel() {
        return this.combineModel;
    }

    public final void setCombineModel(t tVar) {
        l.d(tVar, "");
        this.combineModel = tVar;
    }

    public CommerceSettingCombineModel(t tVar) {
        l.d(tVar, "");
        this.combineModel = tVar;
    }
}
