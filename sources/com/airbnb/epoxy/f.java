package com.airbnb.epoxy;

import com.airbnb.epoxy.n;
import com.bytedance.covode.number.Covode;
import java.util.List;

public abstract class f<T extends n> {
    static {
        Covode.recordClassIndex(2126);
    }

    public abstract void resetAutoModels();

    /* access modifiers changed from: protected */
    public void validateModelHashCodesHaveNotChanged(T t) {
        List<? extends s<?>> list = t.getAdapter().f5061f.f5017f;
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((s) list.get(i2)).a("Model has changed since it was added to the controller.", i2);
        }
    }

    /* access modifiers changed from: protected */
    public void setControllerToStageTo(s<?> sVar, T t) {
        sVar.f5080d = t;
    }
}
