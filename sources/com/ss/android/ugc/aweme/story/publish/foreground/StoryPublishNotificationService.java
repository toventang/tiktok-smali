package com.ss.android.ugc.aweme.story.publish.foreground;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.core.app.i;
import androidx.core.app.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.publish.o;
import com.ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.ss.android.ugc.aweme.shortvideo.publish.d;
import com.ss.android.ugc.aweme.shortvideo.publish.k;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.p;
import h.v;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class StoryPublishNotificationService extends Service {

    /* renamed from: f  reason: collision with root package name */
    public static int f138126f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final a f138127g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Float> f138128a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f138129b;

    /* renamed from: c  reason: collision with root package name */
    public int f138130c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f138131d = new AtomicInteger(0);

    /* renamed from: e  reason: collision with root package name */
    ArrayList<ScheduleInfo> f138132e;

    /* renamed from: h  reason: collision with root package name */
    private final List<p<String, k>> f138133h = new ArrayList();

    public static final class a {
        static {
            Covode.recordClassIndex(90334);
        }

        private a() {
        }

        public static void a() {
            a("clear story publish foreground notification");
            Context a2 = com.ss.android.ugc.aweme.df.b.a();
            a(a2);
            l.a(a2).a((String) null, 1);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(String str) {
            q.a("StoryPublishNotificationService:".concat(String.valueOf(str)));
        }

        public static void a(Context context) {
            if (Build.VERSION.SDK_INT >= 26) {
                Object a2 = a(context, "notification");
                Objects.requireNonNull(a2, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) a2).createNotificationChannel(new NotificationChannel("com.ss.android.ugc.aweme.story.publish", "com.ss.android.ugc.aweme.story.publish", 2));
            }
        }

        public static boolean a(List<ScheduleInfo> list) {
            h.f.b.l.d(list, "");
            a("try show story publish foreground notification");
            Context a2 = com.ss.android.ugc.aweme.df.b.a();
            if (o.a(a2, StoryPublishNotificationService.class)) {
                a("StoryPublishNotificationService is running,directly return");
                return false;
            }
            Intent intent = new Intent(a2, StoryPublishNotificationService.class);
            intent.putExtra("extra_schedule_list", new ArrayList(list));
            if (Build.VERSION.SDK_INT >= 26) {
                a2.startForegroundService(intent);
                return true;
            }
            a(a2, intent);
            return true;
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.publish.foreground.StoryPublishNotificationService.a.a(android.content.Context, android.content.Intent):android.content.ComponentName");
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(1827);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        i.f107220b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (i.f107219a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
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
                        MethodCollector.o(1827);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    public final void onCreate() {
        super.onCreate();
        startForeground(1, a(this, null));
    }

    static {
        Covode.recordClassIndex(90333);
    }

    public final void onDestroy() {
        a.a("onDestroy");
        for (T t : this.f138133h) {
            com.ss.android.ugc.aweme.story.publish.a.a.a((k) t.getSecond(), (String) t.getFirst());
        }
        this.f138133h.clear();
        super.onDestroy();
    }

    public final IBinder onBind(Intent intent) {
        h.f.b.l.d(intent, "");
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private final void a(List<ScheduleInfo> list) {
        for (T t : list) {
            this.f138128a.put(t.getScheduleId(), Float.valueOf(0.0f));
            b bVar = new b(t, this);
            this.f138133h.add(v.a(t.getScheduleId(), bVar));
            com.ss.android.ugc.aweme.story.publish.a.a.a(bVar, t.getScheduleId(), true);
        }
    }

    public static final class b extends k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScheduleInfo f138134a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryPublishNotificationService f138135b;

        static {
            Covode.recordClassIndex(90335);
        }

        b(ScheduleInfo scheduleInfo, StoryPublishNotificationService storyPublishNotificationService) {
            this.f138134a = scheduleInfo;
            this.f138135b = storyPublishNotificationService;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
        public final void onProgress(int i2, Object obj) {
            this.f138135b.f138128a.put(this.f138134a.getScheduleId(), Float.valueOf(((float) i2) / 100.0f));
            StoryPublishNotificationService storyPublishNotificationService = this.f138135b;
            l.a(this.f138135b).a(1, storyPublishNotificationService.a(storyPublishNotificationService, storyPublishNotificationService.f138129b));
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
        public final void onFinish(com.ss.android.ugc.aweme.shortvideo.publish.d dVar, Object obj) {
            Bitmap bitmap;
            h.f.b.l.d(dVar, "");
            if (dVar instanceof d.c) {
                int incrementAndGet = this.f138135b.f138131d.incrementAndGet();
                a.a("publishSuccess:" + this.f138134a.getScheduleId() + ",currentFinishCount:" + incrementAndGet + ",totalCount:" + this.f138135b.f138130c);
                if (incrementAndGet == this.f138135b.f138130c) {
                    this.f138135b.stopSelf();
                    StoryPublishNotificationService storyPublishNotificationService = this.f138135b;
                    Bitmap bitmap2 = storyPublishNotificationService.f138129b;
                    String string = storyPublishNotificationService.getString(R.string.h7c);
                    h.f.b.l.b(string, "");
                    String string2 = storyPublishNotificationService.getString(R.string.h7b);
                    h.f.b.l.b(string2, "");
                    Notification d2 = StoryPublishNotificationService.a(storyPublishNotificationService, storyPublishNotificationService, string, string2, bitmap2).b(true).d();
                    h.f.b.l.b(d2, "");
                    l.a(this.f138135b).a(StoryPublishNotificationService.f138126f, d2);
                    StoryPublishNotificationService.f138126f++;
                }
            } else if (dVar instanceof d.b) {
                a.a("publish failed:" + this.f138134a.getScheduleId());
                this.f138135b.stopSelf();
                com.ss.android.ugc.aweme.shortvideo.publish.q c2 = com.ss.android.ugc.aweme.story.publish.a.a.c(this.f138134a.getScheduleId());
                if (c2 != null) {
                    bitmap = com.ss.android.ugc.aweme.story.publish.a.a.a(c2);
                } else {
                    bitmap = null;
                }
                StoryPublishNotificationService storyPublishNotificationService2 = this.f138135b;
                ScheduleInfo scheduleInfo = this.f138134a;
                ArrayList<ScheduleInfo> arrayList = storyPublishNotificationService2.f138132e;
                if (arrayList == null) {
                    arrayList = n.d(scheduleInfo);
                }
                h.f.b.l.d(storyPublishNotificationService2, "");
                h.f.b.l.d(arrayList, "");
                Intent intent = new Intent(storyPublishNotificationService2, StoryPublishBroadcastReceiver.class);
                intent.putExtra("extra_retry_task_list", arrayList);
                String string3 = storyPublishNotificationService2.getString(R.string.h7f);
                h.f.b.l.b(string3, "");
                String string4 = storyPublishNotificationService2.getString(R.string.h7g);
                h.f.b.l.b(string4, "");
                i.e a2 = StoryPublishNotificationService.a(storyPublishNotificationService2, storyPublishNotificationService2, string3, string4, bitmap);
                a2.f2183f = PendingIntent.getBroadcast(storyPublishNotificationService2, 6, intent, 268435456);
                Notification d3 = a2.b(true).d();
                h.f.b.l.b(d3, "");
                l.a(this.f138135b).a(StoryPublishNotificationService.f138126f, d3);
                StoryPublishNotificationService.f138126f++;
            } else {
                this.f138135b.stopSelf();
            }
        }
    }

    public final void onStart(Intent intent, int i2) {
        super.onStart(intent, i2);
        startForeground(1, a(this, this.f138129b));
    }

    public final Notification a(Context context, Bitmap bitmap) {
        float f2 = 0.0f;
        if (!this.f138128a.isEmpty()) {
            for (Map.Entry<String, Float> entry : this.f138128a.entrySet()) {
                f2 += entry.getValue().floatValue() * (1.0f / ((float) this.f138128a.size()));
            }
        }
        int i2 = (int) (f2 * 100.0f);
        String string = context.getString(R.string.h7e);
        h.f.b.l.b(string, "");
        Notification d2 = a(this, context, string, new StringBuilder().append(i2).append('%').toString(), bitmap).b(Math.min(100, i2)).d();
        h.f.b.l.b(d2, "");
        return d2;
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        ArrayList<ScheduleInfo> arrayList;
        boolean z;
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        Bitmap bitmap = null;
        if (intent != null) {
            arrayList = intent.getParcelableArrayListExtra("extra_schedule_list");
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 2;
        }
        this.f138132e = arrayList;
        a.a("onStartCommand,taskSize:" + arrayList.size());
        this.f138130c = arrayList.size();
        this.f138131d.set(0);
        a.a(this);
        a(arrayList);
        com.ss.android.ugc.aweme.shortvideo.publish.q c2 = com.ss.android.ugc.aweme.story.publish.a.a.c(arrayList.get(0).getScheduleId());
        if (c2 != null) {
            bitmap = com.ss.android.ugc.aweme.story.publish.a.a.a(c2);
        }
        this.f138129b = bitmap;
        return 2;
    }

    static /* synthetic */ i.e a(StoryPublishNotificationService storyPublishNotificationService, Context context, String str, String str2, Bitmap bitmap) {
        i.e a2 = new i.e(context, "com.ss.android.ugc.aweme.story.publish").a((CharSequence) str).b(str2).a(System.currentTimeMillis());
        a2.f2183f = PendingIntent.getActivity(storyPublishNotificationService, 5, context.getPackageManager().getLaunchIntentForPackage(storyPublishNotificationService.getPackageName()), 0);
        i.e a3 = a2.a(2131232369).a(bitmap);
        h.f.b.l.b(a3, "");
        return a3;
    }
}
