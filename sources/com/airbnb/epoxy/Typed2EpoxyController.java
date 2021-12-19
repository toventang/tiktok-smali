package com.airbnb.epoxy;

import android.os.Handler;
import com.bytedance.covode.number.Covode;

public abstract class Typed2EpoxyController<T, U> extends n {
    private boolean allowModelBuildRequests;
    private T data1;
    private U data2;

    static {
        Covode.recordClassIndex(2075);
    }

    /* access modifiers changed from: protected */
    public abstract void buildModels(T t, U u);

    public Typed2EpoxyController() {
    }

    @Override // com.airbnb.epoxy.n
    public final void requestModelBuild() {
        if (this.allowModelBuildRequests) {
            super.requestModelBuild();
            return;
        }
        throw new IllegalStateException("You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data.");
    }

    /* access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.n
    public final void buildModels() {
        if (isBuildingModels()) {
            buildModels(this.data1, this.data2);
            return;
        }
        throw new IllegalStateException("You cannot call `buildModels` directly. Call `setData` instead to trigger a model refresh with new data.");
    }

    @Override // com.airbnb.epoxy.n
    public void requestDelayedModelBuild(int i2) {
        if (this.allowModelBuildRequests) {
            super.requestDelayedModelBuild(i2);
            return;
        }
        throw new IllegalStateException("You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data.");
    }

    public Typed2EpoxyController(Handler handler, Handler handler2) {
        super(handler, handler2);
    }

    @Override // com.airbnb.epoxy.n
    public void moveModel(int i2, int i3) {
        this.allowModelBuildRequests = true;
        super.moveModel(i2, i3);
        this.allowModelBuildRequests = false;
    }

    public void setData(T t, U u) {
        this.data1 = t;
        this.data2 = u;
        this.allowModelBuildRequests = true;
        requestModelBuild();
        this.allowModelBuildRequests = false;
    }
}
