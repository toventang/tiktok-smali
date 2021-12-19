package com.ss.android.ugc.awemepushlib.d;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.common.push.account.c;
import com.bytedance.ies.uikit.a.d;
import com.ss.android.ugc.awemepushlib.di.ies.MessageHandler;

public final class a implements c.a {
    static {
        Covode.recordClassIndex(95060);
    }

    @Override // com.bytedance.ies.common.push.account.c.a
    public final void a(Context context) {
        try {
            if (d.f35380a == null) {
                a(context, new Intent(context, MessageHandler.class));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.d.a.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
