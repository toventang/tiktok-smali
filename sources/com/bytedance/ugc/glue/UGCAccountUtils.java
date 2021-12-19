package com.bytedance.ugc.glue;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.ugcwidget.UGCServiceManager;

public class UGCAccountUtils {

    public static abstract class a {
        static {
            Covode.recordClassIndex(27930);
        }
    }

    public static class b {
        static {
            Covode.recordClassIndex(27931);
        }
    }

    static {
        Covode.recordClassIndex(27929);
    }

    public static long getUserId() {
        UGCServiceManager.getService(b.class);
        return 0;
    }

    public static boolean isLogin() {
        UGCServiceManager.getService(b.class);
        return false;
    }

    public static void register(a aVar) {
        UGCServiceManager.getService(b.class);
    }

    public static void unregister(a aVar) {
        UGCServiceManager.getService(b.class);
    }
}
