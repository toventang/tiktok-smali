package com.lynx.jsbridge;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public abstract class LynxModule {
    protected Context mContext;
    protected Object mParam;

    static {
        Covode.recordClassIndex(34742);
    }

    public LynxModule(Context context) {
        this(context, null);
    }

    public LynxModule(Context context, Object obj) {
        this.mContext = context;
        this.mParam = obj;
    }
}
