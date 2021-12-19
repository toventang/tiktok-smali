package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteFullException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.g;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.b.h;
import androidx.work.impl.d;
import androidx.work.impl.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.az;
import com.ss.android.ugc.aweme.bb;
import com.ss.android.ugc.aweme.db;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.File;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class ForceStopRunnable implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4736a = g.a("ForceStopRunnable");

    /* renamed from: b  reason: collision with root package name */
    private static final long f4737b = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: c  reason: collision with root package name */
    private final Context f4738c;

    /* renamed from: d  reason: collision with root package name */
    private final f f4739d;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private static final String f4740a = g.a("ForceStopRunnable$Rcvr");

        static {
            Covode.recordClassIndex(1859);
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                g.a();
                ForceStopRunnable.a(context);
            }
        }
    }

    private boolean c() {
        return this.f4739d.f4705g.a();
    }

    static {
        Covode.recordClassIndex(1858);
    }

    private boolean b() {
        if (a(this.f4738c, 536870912) != null) {
            return false;
        }
        a(this.f4738c);
        return true;
    }

    /* JADX INFO: finally extract failed */
    private void a() {
        if (c()) {
            g.a();
            this.f4739d.c();
            this.f4739d.f4705g.a(false);
        } else if (b()) {
            g.a();
            this.f4739d.c();
        } else {
            WorkDatabase workDatabase = this.f4739d.f4701c;
            h i2 = workDatabase.i();
            try {
                workDatabase.e();
                List<androidx.work.impl.b.g> d2 = i2.d();
                if (!d2.isEmpty()) {
                    g.a();
                    for (androidx.work.impl.b.g gVar : d2) {
                        i2.b(gVar.f4578a, -1);
                    }
                    d.a(this.f4739d.f4700b, workDatabase, this.f4739d.f4703e);
                }
                workDatabase.g();
                workDatabase.f();
                g.a();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        this.f4739d.d();
    }

    public final void run() {
        File file;
        File file2;
        try {
            a();
            return;
        } catch (SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteFullException e2) {
            if (db.f79356a) {
                db.f79356a = false;
                Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
                if (SettingsManager.a().a("tt_disk_usage_monitor", true)) {
                    if (com.ss.android.ugc.aweme.lancet.d.f107195c == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                        com.ss.android.ugc.aweme.lancet.d.f107195c = a2.getFilesDir();
                    }
                    File file3 = com.ss.android.ugc.aweme.lancet.d.f107195c;
                    if (file3 == null) {
                        file = null;
                    } else {
                        file = file3.getParentFile();
                    }
                    bb.a(file, "internal");
                    if (!TextUtils.isEmpty("")) {
                        file2 = a2.getExternalFilesDir("");
                    } else {
                        if (com.ss.android.ugc.aweme.lancet.d.f107196d == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                            com.ss.android.ugc.aweme.lancet.d.f107196d = a2.getExternalFilesDir("");
                        }
                        file2 = com.ss.android.ugc.aweme.lancet.d.f107196d;
                    }
                    bb.a(file2, "outside");
                }
            }
        } catch (Throwable unused) {
        }
        if (az.b()) {
            a();
            return;
        }
        throw e2;
    }

    private static Intent b(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    static void a(Context context) {
        AlarmManager alarmManager = (AlarmManager) a(context, "alarm");
        PendingIntent a2 = a(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f4737b;
        if (alarmManager != null) {
            int i2 = Build.VERSION.SDK_INT;
            alarmManager.setExact(0, currentTimeMillis, a2);
        }
    }

    private static PendingIntent a(Context context, int i2) {
        return PendingIntent.getBroadcast(context, -1, b(context), i2);
    }

    public ForceStopRunnable(Context context, f fVar) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f4738c = applicationContext;
        this.f4739d = fVar;
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }
}
