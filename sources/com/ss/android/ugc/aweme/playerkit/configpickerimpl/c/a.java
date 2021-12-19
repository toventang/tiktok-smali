package com.ss.android.ugc.aweme.playerkit.configpickerimpl.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.playerkit.exp.PlayerSettingService;

public final class a {

    /* renamed from: com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.a$a  reason: collision with other inner class name */
    public interface AbstractC2950a<T> {
        static {
            Covode.recordClassIndex(74149);
        }

        T a();
    }

    static {
        Covode.recordClassIndex(74148);
    }

    private static boolean a() {
        if (PlayerSettingService.isDebug()) {
            return true;
        }
        return false;
    }

    public static <T> T a(AbstractC2950a<T> aVar) {
        System.currentTimeMillis();
        T a2 = aVar.a();
        System.currentTimeMillis();
        return a2;
    }

    public static void a(String str) {
        if (a()) {
            throw new RuntimeException(str);
        }
    }
}
