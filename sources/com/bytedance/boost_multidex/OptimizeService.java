package com.bytedance.boost_multidex;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import java.io.File;
import java.io.IOException;

public class OptimizeService extends IntentService {
    static volatile boolean sAlreadyOpt;
    File mDexDir;
    File mOptDexDir;
    File mRootDir;
    File mZipDir;

    static {
        Covode.recordClassIndex(15654);
    }

    public OptimizeService() {
        super("OptimizeService");
        if (Monitor.get() == null) {
            Monitor.init(null);
        }
        Monitor.get().logDebug("Starting OptimizeService");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0230 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void handleOptimize() {
        /*
        // Method dump skipped, instructions count: 685
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.boost_multidex.OptimizeService.handleOptimize():void");
    }

    public static void startOptimizeService(Context context) {
        com_bytedance_boost_multidex_OptimizeService_com_ss_android_ugc_aweme_lancet_StartServiceLancet_startService(context, new Intent(context, OptimizeService.class));
    }

    public void onCreate() {
        super.onCreate();
        try {
            File filesDir = getFilesDir();
            if (!filesDir.exists()) {
                Utility.mkdirChecked(filesDir);
            }
            File ensureDirCreated = Utility.ensureDirCreated(filesDir, "boost_multidex");
            this.mRootDir = ensureDirCreated;
            this.mDexDir = Utility.ensureDirCreated(ensureDirCreated, "dex_cache");
            this.mOptDexDir = Utility.ensureDirCreated(this.mRootDir, "odex_cache");
            this.mZipDir = Utility.ensureDirCreated(this.mRootDir, "zip_cache");
        } catch (IOException e2) {
            Monitor.get().logError("fail to create files", e2);
            sAlreadyOpt = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            try {
                handleOptimize();
            } catch (IOException e2) {
                Monitor.get().logError("fail to handle opt", e2);
            }
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName com_bytedance_boost_multidex_OptimizeService_com_ss_android_ugc_aweme_lancet_StartServiceLancet_startService(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.boost_multidex.OptimizeService.com_bytedance_boost_multidex_OptimizeService_com_ss_android_ugc_aweme_lancet_StartServiceLancet_startService(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
