package org.webrtc;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public class RXScreenCaptureService extends Service {
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    int mLargeIcon = -1;
    String mLaunchActivity;
    int mSmallIcon = -1;

    static {
        Covode.recordClassIndex(106637);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    static final /* synthetic */ void lambda$dispose$4$RXScreenCaptureService() {
        ScreenCaptureAndroidManager.INSTANCE().dispose();
    }

    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("RXScreenCaptureService");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mHandlerThread.getLooper());
    }

    private void createNotificationChannel() {
        MethodCollector.i(8209);
        try {
            Class<?> cls = Class.forName(this.mLaunchActivity);
            if (cls == null) {
                MethodCollector.o(8209);
                return;
            }
            Notification.Builder builder = new Notification.Builder(org_webrtc_RXScreenCaptureService_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(this));
            builder.setContentIntent(PendingIntent.getActivity(this, 0, new Intent(this, cls), 0)).setLargeIcon(BitmapFactory.decodeResource(getResources(), this.mLargeIcon)).setSmallIcon(this.mSmallIcon).setContentText("screen capture is running...").setWhen(System.currentTimeMillis());
            if (Build.VERSION.SDK_INT >= 26) {
                builder.setChannelId("notification_id");
            }
            if (Build.VERSION.SDK_INT >= 26) {
                ((NotificationManager) org_webrtc_RXScreenCaptureService_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(this, "notification")).createNotificationChannel(new NotificationChannel("notification_id", "notification_name", 2));
            }
            Notification build = builder.build();
            build.defaults = 1;
            startForeground(110, build);
            MethodCollector.o(8209);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    private void dispose(Intent intent) {
        this.mHandler.post(RXScreenCaptureService$$Lambda$4.$instance);
    }

    static final /* synthetic */ void lambda$onFrame$3$RXScreenCaptureService(VideoFrame videoFrame) {
        ScreenCaptureAndroidManager.INSTANCE().onFrame(videoFrame);
    }

    private static int getCommand(Intent intent) {
        if (intent == null) {
            return -1;
        }
        return intent.getIntExtra("ACTION", -1);
    }

    private static Intent getData(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Intent) intent.getParcelableExtra("DATA");
    }

    public static Context org_webrtc_RXScreenCaptureService_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(RXScreenCaptureService rXScreenCaptureService) {
        Context applicationContext = rXScreenCaptureService.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public final /* synthetic */ void lambda$stopCapture$1$RXScreenCaptureService(int i2) {
        ScreenCaptureAndroidManager.INSTANCE().stopCapture(i2);
        stopForeground(true);
    }

    private void stopCapture(Intent intent) {
        Intent data = getData(intent);
        if (data != null) {
            this.mHandler.post(new RXScreenCaptureService$$Lambda$1(this, data.getIntExtra("hc", 0)));
        }
    }

    private void changeCaptureFormat(Intent intent) {
        Intent data = getData(intent);
        if (data != null) {
            this.mHandler.post(new RXScreenCaptureService$$Lambda$2(data.getIntExtra("w", 0), data.getIntExtra("h", 0), data.getIntExtra("if", 0)));
        }
    }

    private void onFrame(Intent intent) {
        int intExtra;
        VideoFrame removeFrame;
        Intent data = getData(intent);
        if (data != null && (intExtra = data.getIntExtra("i", -1)) != -1 && (removeFrame = ScreenCaptureAndroidManager.INSTANCE().removeFrame(intExtra)) != null) {
            this.mHandler.post(new RXScreenCaptureService$$Lambda$3(removeFrame));
        }
    }

    private void startCapture(Intent intent) {
        Intent data = getData(intent);
        if (data != null) {
            this.mHandler.post(new RXScreenCaptureService$$Lambda$0(data.getIntExtra("w", 0), data.getIntExtra("h", 0), data.getIntExtra("if", 0), data.getIntExtra("minfr", 0)));
        }
    }

    private void startLaunch(Intent intent) {
        Intent data = getData(intent);
        if (data != null) {
            this.mLargeIcon = data.getIntExtra("largei", -1);
            this.mSmallIcon = data.getIntExtra("largei", -1);
            String org_webrtc_RXScreenCaptureService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = org_webrtc_RXScreenCaptureService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(data, "activity");
            this.mLaunchActivity = org_webrtc_RXScreenCaptureService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
            if (!TextUtils.isEmpty(org_webrtc_RXScreenCaptureService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
                int i2 = this.mLargeIcon;
                if (i2 != -1 || this.mSmallIcon != -1) {
                    if (this.mSmallIcon == -1) {
                        this.mSmallIcon = i2;
                    }
                    if (i2 == -1) {
                        this.mLargeIcon = this.mSmallIcon;
                    }
                    createNotificationChannel();
                }
            }
        }
    }

    public static String org_webrtc_RXScreenCaptureService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object org_webrtc_RXScreenCaptureService_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(RXScreenCaptureService rXScreenCaptureService, String str) {
        Object obj;
        MethodCollector.i(8310);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = rXScreenCaptureService.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = rXScreenCaptureService.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = rXScreenCaptureService.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(8310);
                }
            }
        } else {
            obj = rXScreenCaptureService.getSystemService(str);
        }
        return obj;
    }

    static final /* synthetic */ void lambda$changeCaptureFormat$2$RXScreenCaptureService(int i2, int i3, int i4) {
        ScreenCaptureAndroidManager.INSTANCE().changeCaptureFormat(i2, i3, i4);
    }

    public static Intent getServiceIntent(Context context, int i2, Intent intent) {
        Intent intent2 = new Intent(context, RXScreenCaptureService.class);
        intent2.putExtra("ACTION", i2);
        if (intent != null) {
            intent2.putExtra("DATA", intent);
        }
        return intent2;
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        int command = getCommand(intent);
        if (command == 0) {
            startLaunch(intent);
        } else if (command == 1) {
            startCapture(intent);
        } else if (command == 2) {
            stopCapture(intent);
        } else if (command == 3) {
            changeCaptureFormat(intent);
        } else if (command == 4) {
            onFrame(intent);
        } else if (command == 5) {
            dispose(intent);
        }
        return super.onStartCommand(intent, i2, i3);
    }
}
