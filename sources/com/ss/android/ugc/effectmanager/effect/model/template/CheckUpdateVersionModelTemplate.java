package com.ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.CheckUpdateVersionModel;
import h.f.b.g;

public class CheckUpdateVersionModelTemplate extends CheckUpdateVersionModel {
    private final transient CheckUpdateVersionModel kUpdateModel;

    static {
        Covode.recordClassIndex(95440);
    }

    public CheckUpdateVersionModelTemplate() {
        this(null, 1, null);
    }

    public CheckUpdateVersionModel getKUpdateModel() {
        return this.kUpdateModel;
    }

    public CheckUpdateVersionModelTemplate(CheckUpdateVersionModel checkUpdateVersionModel) {
        super(null, null, null, 7, null);
        this.kUpdateModel = checkUpdateVersionModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckUpdateVersionModelTemplate(CheckUpdateVersionModel checkUpdateVersionModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : checkUpdateVersionModel);
    }
}
