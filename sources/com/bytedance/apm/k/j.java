package com.bytedance.apm.k;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.apm.c;
import com.bytedance.apm.c.a.a;
import com.bytedance.apm.c.b.f;
import com.bytedance.apm.p.b;
import com.bytedance.covode.number.Covode;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public final class j extends a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f25157a = false;

    /* renamed from: b  reason: collision with root package name */
    public static int f25158b = 300;

    /* renamed from: c  reason: collision with root package name */
    private static final int f25159c = Runtime.getRuntime().availableProcessors();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f25160e = false;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f25161f = false;

    /* renamed from: d  reason: collision with root package name */
    private long f25162d = 600000;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.k.a
    public final boolean b() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.k.a
    public final long c() {
        return this.f25162d;
    }

    @Override // com.bytedance.apm.k.a, com.bytedance.services.slardar.config.a
    public final void d() {
        super.d();
        f25157a = true;
    }

    public j() {
        this.p = "thread";
    }

    static {
        Covode.recordClassIndex(14667);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.k.a
    public final void e() {
        super.e();
        if (f25160e && f25161f && System.currentTimeMillis() - c.i() > 1200000) {
            f();
        }
    }

    private static int f() {
        try {
            final int length = new File("/proc/self/task/").list().length;
            if (length == 0) {
                return 0;
            }
            final ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
            while (threadGroup.getParent() != null) {
                threadGroup = threadGroup.getParent();
            }
            final int[] iArr = {threadGroup.activeCount()};
            b.a.f25210a.a(new Runnable() {
                /* class com.bytedance.apm.k.j.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ boolean f25163a = false;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ String f25165c;

                static {
                    Covode.recordClassIndex(14668);
                }

                public final void run() {
                    if (this.f25163a || iArr[0] < j.f25158b || !j.f25157a) {
                        try {
                            a.b().a(new f("thread", j.a(this.f25165c, length, iArr[0], null)));
                        } catch (Exception unused) {
                        }
                    } else {
                        int[] iArr = iArr;
                        Thread[] threadArr = new Thread[(iArr[0] + (iArr[0] / 2))];
                        iArr[0] = threadGroup.enumerate(threadArr);
                        StringBuilder sb = new StringBuilder();
                        int i2 = 0;
                        while (true) {
                            int[] iArr2 = iArr;
                            if (i2 < iArr2[0]) {
                                String name = threadArr[i2].getName();
                                if (!TextUtils.isEmpty(name)) {
                                    sb.append(name);
                                    sb.append(",");
                                }
                                i2++;
                            } else {
                                try {
                                    a.b().a(new f("thread", j.a(this.f25165c, length, iArr2[0], sb.toString())));
                                    return;
                                } catch (Throwable unused2) {
                                    return;
                                }
                            }
                        }
                    }
                }

                {
                    this.f25165c = null;
                }
            });
            return (length << 16) + iArr[0];
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.k.a
    public final void a(JSONObject jSONObject) {
        boolean z;
        super.a(jSONObject);
        boolean z2 = false;
        if (jSONObject.optInt("enable_thread_collect", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        f25160e = z;
        if (jSONObject.optInt("enable_upload", 0) == 1) {
            z2 = true;
        }
        f25161f = z2;
        f25158b = jSONObject.optInt("thread_count_threshold", 300);
        this.f25162d = jSONObject.optLong("collect_interval", 10) * 60000;
    }

    public static JSONObject a(String str, int i2, int i3, String str2) {
        JSONObject jSONObject = new JSONObject();
        if (i2 > 0) {
            try {
                jSONObject.put("total_thread_count", i2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        jSONObject.put("java_thread_count", i3);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("scene", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("thread_detail", str2);
        }
        jSONObject.put("is_main_process", c.b());
        jSONObject.put("cpu_count", f25159c);
        jSONObject.put("process_name", c.a());
        return jSONObject;
    }
}
