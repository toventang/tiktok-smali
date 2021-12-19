package com.airbnb.epoxy;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class z extends RuntimeException {
    static {
        Covode.recordClassIndex(2172);
    }

    z(s sVar, int i2) {
        this(sVar, "", i2);
    }

    z(s sVar, String str, int i2) {
        super(str + " Position: " + i2 + " Model: " + sVar.toString() + "\n\nEpoxy attribute fields on a model cannot be changed once the model is added to a controller. Check that these fields are not updated, or that the assigned objects are not mutated, outside of the buildModels method. The only exception is if the change is made inside an Interceptor callback. Consider using an interceptor if you need to change a model after it is added to the controller and before it is set on the adapter. If the model is already set on the adapter then you must call `requestModelBuild` instead to recreate all models.");
    }
}
