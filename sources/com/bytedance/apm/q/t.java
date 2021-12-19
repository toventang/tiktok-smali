package com.bytedance.apm.q;

import com.bytedance.covode.number.Covode;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class t {
    static {
        Covode.recordClassIndex(14720);
    }

    public static String a() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
    }
}
