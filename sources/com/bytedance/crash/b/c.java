package com.bytedance.crash.b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.crash.f;
import com.bytedance.crash.util.ab;
import com.bytedance.crash.util.b;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static String f27448a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f27449b;

    /* renamed from: c  reason: collision with root package name */
    private static long f27450c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static FileObserver f27451d;

    /* renamed from: e  reason: collision with root package name */
    private static ActivityManager.ProcessErrorStateInfo f27452e;

    static {
        Covode.recordClassIndex(16145);
    }

    public static JSONObject a() {
        try {
            return a(ab.a(Looper.getMainLooper().getThread().getStackTrace()));
        } catch (Throwable th) {
            d.a("NPTH_CATCH", th);
            return null;
        }
    }

    public static JSONObject a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", str);
            return jSONObject;
        } catch (Throwable th) {
            d.a("NPTH_CATCH", th);
            return null;
        }
    }

    public static void a(final String str, final f fVar) {
        FileObserver fileObserver = f27451d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        AnonymousClass1 r0 = new FileObserver(str) {
            /* class com.bytedance.crash.b.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16146);
            }

            public final void onEvent(int i2, String str) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        c.f27448a = fVar.a(str, str);
                    } catch (Throwable th) {
                        d.a("NPTH_CATCH", th);
                    }
                }
            }
        };
        f27451d = r0;
        r0.startWatching();
    }

    static String a(Context context, int[] iArr) {
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo;
        boolean z;
        if (SystemClock.uptimeMillis() - f27450c < 5000) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) b.a(context, "activity");
            if (activityManager != null) {
                Process.myPid();
                List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState != null) {
                    Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        processErrorStateInfo = it.next();
                        if (processErrorStateInfo.condition == 2) {
                            break;
                        }
                    }
                }
            }
            processErrorStateInfo = null;
            if (processErrorStateInfo != null && (Process.myPid() == processErrorStateInfo.pid || (iArr != null && processErrorStateInfo.processName.contains(context.getPackageName())))) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo2 = f27452e;
                if (processErrorStateInfo2 != null) {
                    if (!String.valueOf(processErrorStateInfo2.condition).equals(String.valueOf(processErrorStateInfo.condition)) || !String.valueOf(processErrorStateInfo2.processName).equals(String.valueOf(processErrorStateInfo.processName)) || !String.valueOf(processErrorStateInfo2.pid).equals(String.valueOf(processErrorStateInfo.pid)) || !String.valueOf(processErrorStateInfo2.uid).equals(String.valueOf(processErrorStateInfo.uid)) || !String.valueOf(processErrorStateInfo2.tag).equals(String.valueOf(processErrorStateInfo.tag)) || !String.valueOf(processErrorStateInfo2.shortMsg).equals(String.valueOf(processErrorStateInfo.shortMsg)) || !String.valueOf(processErrorStateInfo2.longMsg).equals(String.valueOf(processErrorStateInfo.longMsg))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        f27450c = SystemClock.uptimeMillis();
                        return null;
                    }
                }
                f27452e = processErrorStateInfo;
                f27448a = null;
                f27450c = SystemClock.uptimeMillis();
                f27449b = false;
                if (iArr != null) {
                    iArr[0] = processErrorStateInfo.pid;
                }
                return "|------------- processErrorStateInfo--------------|\ncondition: " + processErrorStateInfo.condition + "\nprocessName: " + processErrorStateInfo.processName + "\npid: " + processErrorStateInfo.pid + "\nuid: " + processErrorStateInfo.uid + "\ntag: " + processErrorStateInfo.tag + "\nshortMsg : " + processErrorStateInfo.shortMsg + "\nlongMsg : " + processErrorStateInfo.longMsg + "\n-----------------------end----------------------------";
            }
        } catch (Throwable unused) {
        }
        String str = f27448a;
        if (str == null) {
            return null;
        }
        f27449b = true;
        f27448a = null;
        f27450c = SystemClock.uptimeMillis();
        return str;
    }
}
