package com.ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tiktok.security.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f145439a = new ArrayList();

    static {
        Covode.recordClassIndex(95098);
    }

    public static void a(Intent intent) {
        if (intent != null) {
            intent.putExtra("from_notification", true);
            String uuid = UUID.randomUUID().toString();
            f145439a.add(uuid);
            intent.putExtra("from_notification_uuid", uuid);
        }
    }

    static boolean a(int i2, Context context, Intent intent) {
        if (i2 == 0) {
            try {
                a.a(intent, context);
                context.startActivity(intent);
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }
}
