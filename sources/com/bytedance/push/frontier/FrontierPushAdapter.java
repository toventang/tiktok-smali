package com.bytedance.push.frontier;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.settings.h;
import com.bytedance.push.third.b;
import com.bytedance.push.third.f;
import com.ss.android.message.a;

public class FrontierPushAdapter implements b {
    private static int FRONTIER_PUSH = -1;

    @Override // com.bytedance.push.third.b
    public boolean checkThirdPushConfig(String str, Context context) {
        return true;
    }

    public boolean requestNotificationPermission(int i2) {
        return false;
    }

    @Override // com.bytedance.push.third.b
    public void setAlias(Context context, String str, int i2) {
    }

    @Override // com.bytedance.push.third.b
    public void trackPush(Context context, int i2, Object obj) {
    }

    static {
        Covode.recordClassIndex(25747);
    }

    public static int getFrontierPush() {
        if (FRONTIER_PUSH == -1) {
            FRONTIER_PUSH = f.a(a.f59817a).a(FrontierPushAdapter.class.getName());
        }
        return FRONTIER_PUSH;
    }

    @Override // com.bytedance.push.third.b
    public void unregisterPush(Context context, int i2) {
        b a2 = b.a(context);
        a2.f42140g = false;
        if (a2.f42136c.get() != null) {
            a2.f42136c.get().a();
        }
    }

    @Override // com.bytedance.push.third.b
    public boolean isPushAvailable(Context context, int i2) {
        if (i2 == getFrontierPush()) {
            b a2 = b.a(context);
            PushOnlineSettings pushOnlineSettings = (PushOnlineSettings) h.a(a2.f42137d, PushOnlineSettings.class);
            if (pushOnlineSettings != null) {
                a2.f42138e = pushOnlineSettings.m();
            }
            if (a2.f42138e == 0 || ((a2.f42138e != 1 || a2.f42136c.get() == null) && a2.f42138e != 2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.bytedance.push.third.b
    public void registerPush(Context context, int i2) {
        b a2 = b.a(context);
        if (a2.f42138e == 2) {
            a2.f42136c.set(com.bytedance.push.frontier.b.a.a(a2.f42137d, a2.f42139f));
        }
        com.bytedance.push.frontier.a.b bVar = a2.f42136c.get();
        if (bVar != null) {
            a2.f42140g = true;
            bVar.a(a2);
        }
    }
}
