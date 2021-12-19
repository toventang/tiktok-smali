package com.lynx.jsbridge;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;

public class LynxContextModule extends LynxModule {
    protected j mLynxContext;

    static {
        Covode.recordClassIndex(34735);
    }

    public LynxContextModule(j jVar) {
        super(jVar);
        this.mLynxContext = jVar;
    }

    public LynxContextModule(j jVar, Object obj) {
        super(jVar, obj);
        this.mLynxContext = jVar;
    }
}
