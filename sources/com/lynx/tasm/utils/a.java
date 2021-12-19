package com.lynx.tasm.utils;

import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;

public final class a {
    static {
        Covode.recordClassIndex(35470);
    }

    public static j a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof j) {
                return (j) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
