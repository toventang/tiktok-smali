package com.ss.avframework.transport;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Process;
import android.preference.PreferenceManager;
import com.bytedance.covode.number.Covode;

public class ContextUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static Context sApplicationContext;

    static {
        Covode.recordClassIndex(100567);
    }

    static class Holder {
        public static SharedPreferences sSharedPreferences = ContextUtils.fetchAppSharedPreferences();

        private Holder() {
        }

        static {
            Covode.recordClassIndex(100568);
        }
    }

    public static SharedPreferences getAppSharedPreferences() {
        return Holder.sSharedPreferences;
    }

    public static Context getApplicationContext() {
        return sApplicationContext;
    }

    public static SharedPreferences fetchAppSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(sApplicationContext);
    }

    public static boolean isIsolatedProcess() {
        return Process.isIsolated();
    }

    public static AssetManager getApplicationAssets() {
        Context applicationContext = getApplicationContext();
        while (applicationContext instanceof ContextWrapper) {
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        return applicationContext.getAssets();
    }

    public static void initApplicationContext(Context context) {
        initJavaSideApplicationContext(context);
    }

    public static void initApplicationContextForTests(Context context) {
        initJavaSideApplicationContext(context);
        Holder.sSharedPreferences = fetchAppSharedPreferences();
    }

    private static void initJavaSideApplicationContext(Context context) {
        if (context instanceof Application) {
            context = new ContextWrapper(context);
        }
        sApplicationContext = context;
    }
}
