package com.bytedance.android.live.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public final class aa extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private a f7460a;

    public interface a {
        static {
            Covode.recordClassIndex(3647);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(3646);
    }

    public aa(a aVar) {
        this.f7460a = aVar;
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.PHONE_STATE".equals(intent.getAction())) {
            this.f7460a.a(a(intent, "state"));
        }
    }
}
