package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.g;
import androidx.work.impl.a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class b implements a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f4634d = g.a("CommandHandler");

    /* renamed from: a  reason: collision with root package name */
    final Context f4635a;

    /* renamed from: b  reason: collision with root package name */
    final Map<String, a> f4636b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Object f4637c = new Object();

    static {
        Covode.recordClassIndex(1828);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        boolean z;
        synchronized (this.f4637c) {
            if (!this.f4636b.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    b(Context context) {
        this.f4635a = context;
    }

    static Intent a(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    static boolean a(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        int i2 = 0;
        while (a(bundle, strArr[0]) != null) {
            i2++;
            if (i2 > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.work.impl.a
    public final void a(String str, boolean z) {
        synchronized (this.f4637c) {
            a remove = this.f4636b.remove(str);
            if (remove != null) {
                remove.a(str, z);
            }
        }
    }
}
