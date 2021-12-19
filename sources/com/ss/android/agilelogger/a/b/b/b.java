package com.ss.android.agilelogger.a.b.b;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.agilelogger.c.c;

public final class b implements c<Intent> {
    static {
        Covode.recordClassIndex(36539);
    }

    @Override // com.ss.android.agilelogger.a.b
    public final /* bridge */ /* synthetic */ String a(Object obj) {
        return a((Intent) obj);
    }

    public static String a(Intent intent) {
        if (intent == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Intent { ");
        c.a(intent, sb);
        sb.append(" }");
        return sb.toString();
    }
}
