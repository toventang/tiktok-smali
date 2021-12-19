package com.lynx.tasm.behavior;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.ShadowNode;

public class u {

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<ShadowNode> f56059a = new SparseArray<>();

    static {
        Covode.recordClassIndex(35020);
    }

    public final ShadowNode a(int i2) {
        return this.f56059a.get(i2);
    }
}
