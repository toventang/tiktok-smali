package com.bytedance.ugc.glue.app;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.ugcwidget.UGCSafeList;
import com.bytedance.ugc.ugcwidget.UGCServiceManager;

public abstract class UGCRouter {

    public static class Manager {
        static {
            Covode.recordClassIndex(27946);
        }

        /* access modifiers changed from: protected */
        public boolean openUrl(String str, Bundle bundle) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(27945);
    }

    public abstract boolean openUri(Uri uri, Bundle bundle);

    public static class UGCRoutersHolder {
        protected final UGCSafeList<UGCRouter> routers = new UGCSafeList<>();

        static {
            Covode.recordClassIndex(27947);
        }

        public UGCSafeList<UGCRouter> getRouters() {
            return this.routers;
        }
    }

    public static void register(UGCRouter uGCRouter) {
        ((UGCRoutersHolder) UGCServiceManager.getService(UGCRoutersHolder.class)).routers.add(uGCRouter);
    }

    public static boolean handleUrl(String str, Bundle bundle) {
        return ((Manager) UGCServiceManager.getService(Manager.class)).openUrl(str, bundle);
    }

    public static boolean handleUri(Uri uri, Bundle bundle) {
        return ((Manager) UGCServiceManager.getService(Manager.class)).openUrl(uri.toString(), bundle);
    }
}
