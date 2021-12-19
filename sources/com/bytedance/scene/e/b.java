package com.bytedance.scene.e;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;

public final class b extends c {
    static {
        Covode.recordClassIndex(26275);
    }

    public b(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }
}
