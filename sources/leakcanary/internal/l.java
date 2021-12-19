package leakcanary.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import m.a;

public final class l extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final b f159479a = new b((byte) 0);

    public enum a {
        DUMP_HEAP,
        CANCEL_NOTIFICATION;

        static {
            Covode.recordClassIndex(105875);
        }
    }

    static {
        Covode.recordClassIndex(105874);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(105876);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final void onReceive(Context context, Intent intent) {
        a.AbstractC4200a aVar;
        h.f.b.l.c(context, "");
        h.f.b.l.c(intent, "");
        String action = intent.getAction();
        if (h.f.b.l.a((Object) action, (Object) a.DUMP_HEAP.name())) {
            InternalLeakCanary.INSTANCE.onDumpHeapReceived();
        } else if (!h.f.b.l.a((Object) action, (Object) a.CANCEL_NOTIFICATION.name()) && (aVar = m.a.f159491a) != null) {
            aVar.a("NotificationReceiver received unknown intent action for ".concat(String.valueOf(intent)));
        }
    }
}
