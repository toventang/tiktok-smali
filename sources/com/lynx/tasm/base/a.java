package com.lynx.tasm.base;

import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(34874);
    }

    public static long a() {
        try {
            return ((Long) Class.forName("com.ss.android.agilelogger.ALog").getMethod("getALogSimpleWriteFuncAddr", new Class[0]).invoke(null, new Object[0])).longValue();
        } catch (Exception e2) {
            e2.getMessage();
            return 0;
        }
    }
}
