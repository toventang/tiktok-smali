package com.airbnb.epoxy;

import android.os.Handler;
import com.bytedance.covode.number.Covode;

public abstract class TypedEpoxyController<T> extends n {
    private boolean allowModelBuildRequests;
    private T currentData;

    static {
        Covode.recordClassIndex(2078);
    }

    /* access modifiers changed from: protected */
    public abstract void buildModels(T t);

    public TypedEpoxyController() {
    }

    public final T getCurrentData() {
        return this.currentData;
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
            buildModels(this.currentData);
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

    public final void setData(T t) {
        this.currentData = t;
        this.allowModelBuildRequests = true;
        requestModelBuild();
        this.allowModelBuildRequests = false;
    }

    public TypedEpoxyController(Handler handler, Handler handler2) {
        super(handler, handler2);
    }

    @Override // com.airbnb.epoxy.n
    public void moveModel(int i2, int i3) {
        this.allowModelBuildRequests = true;
        super.moveModel(i2, i3);
        this.allowModelBuildRequests = false;
    }
}
