package com.bytedance.ies.powerpermissions.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public interface a {
    static {
        Covode.recordClassIndex(20593);
    }

    Intent a(Context context);

    String a();

    boolean a(Activity activity);

    boolean b(Activity activity);

    /* renamed from: com.bytedance.ies.powerpermissions.d.a$a  reason: collision with other inner class name */
    public static final class C0769a {
        static {
            Covode.recordClassIndex(20594);
        }

        public static boolean a(a aVar, Activity activity) {
            l.c(activity, "");
            if (activity.checkSelfPermission(aVar.a()) != -1 || activity.shouldShowRequestPermissionRationale(aVar.a())) {
                return false;
            }
            return true;
        }
    }
}
