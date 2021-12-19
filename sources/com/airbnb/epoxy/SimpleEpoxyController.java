package com.airbnb.epoxy;

import com.bytedance.covode.number.Covode;
import java.util.List;

public class SimpleEpoxyController extends n {
    private List<? extends s<?>> currentModels;
    private boolean insideSetModels;

    static {
        Covode.recordClassIndex(2074);
    }

    @Override // com.airbnb.epoxy.n
    public final void requestModelBuild() {
        if (this.insideSetModels) {
            super.requestModelBuild();
            return;
        }
        throw new y("You cannot call `requestModelBuild` directly. Call `setModels` instead.");
    }

    /* access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.n
    public final void buildModels() {
        if (isBuildingModels()) {
            add(this.currentModels);
            return;
        }
        throw new y("You cannot call `buildModels` directly. Call `setModels` instead.");
    }

    public void setModels(List<? extends s<?>> list) {
        this.currentModels = list;
        this.insideSetModels = true;
        requestModelBuild();
        this.insideSetModels = false;
    }
}
