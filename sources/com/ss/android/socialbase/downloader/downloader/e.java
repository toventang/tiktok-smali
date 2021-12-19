package com.ss.android.socialbase.downloader.downloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.e.a;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationService;

public class e extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f60446a = e.class.getSimpleName();

    static {
        Covode.recordClassIndex(37347);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.e.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    public void onReceive(final Context context, Intent intent) {
        if (context != null && intent != null) {
            final String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    if (a.a()) {
                        a.a(f60446a, "Received broadcast intent for android.net.conn.CONNECTIVITY_CHANGE");
                    }
                    if (c.f60434i) {
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                            /* class com.ss.android.socialbase.downloader.downloader.e.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(37348);
                            }

                            public final void run() {
                                try {
                                    Intent intent = new Intent(context, DownloadNotificationService.class);
                                    intent.setAction(action);
                                    a(context, intent);
                                } catch (Throwable unused) {
                                }
                            }

                            /* JADX WARNING: Failed to process nested try/catch */
                            /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
                                /*
                                // Method dump skipped, instructions count: 114
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.e.AnonymousClass1.a(android.content.Context, android.content.Intent):android.content.ComponentName");
                            }
                        }, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                    }
                } else if (action.equals("android.intent.action.MEDIA_UNMOUNTED") || action.equals("android.intent.action.MEDIA_REMOVED") || action.equals("android.intent.action.MEDIA_BAD_REMOVAL") || action.equals("android.intent.action.MEDIA_EJECT")) {
                    try {
                        Intent intent2 = new Intent(context, DownloadNotificationService.class);
                        intent2.setAction(action);
                        a(context, intent2);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}
