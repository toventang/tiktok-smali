package com.bytedance.apm;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p.b;
import com.bytedance.apm.p.c;
import com.bytedance.apm.q.g;
import com.bytedance.apm.q.t;
import com.bytedance.b.a.a;
import com.bytedance.b.k.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    static AtomicLong f24354a = new AtomicLong(0);

    /* renamed from: b  reason: collision with root package name */
    private static File f24355b;

    /* renamed from: c  reason: collision with root package name */
    private static long f24356c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static MappedByteBuffer f24357d;

    public static void a(final String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject a2 = a(jSONObject3);
        d(a2);
        a.a(str, g.d(jSONObject), g.d(jSONObject2), a2);
        if (c.f24687c) {
            final JSONObject c2 = g.c(jSONObject);
            final JSONObject c3 = g.c(jSONObject2);
            final JSONObject c4 = g.c(a2);
            c.a().a(new Runnable() {
                /* class com.bytedance.apm.b.AnonymousClass19 */

                static {
                    Covode.recordClassIndex(14409);
                }

                public final void run() {
                    JSONObject a2 = new com.bytedance.apm.c.b.c(str, 0, (JSONObject) null, c2, c3, c4).a();
                    if (a2 != null) {
                        b.a("monitorEvent", a2.toString());
                    }
                }
            });
        }
    }

    public static void a(final String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject c2 = c(jSONObject2);
        d(c2);
        a.a(new com.bytedance.b.a.b.a(str, 0, e.b(jSONObject), null, null, c2));
        if (c.f24687c) {
            final JSONObject c3 = g.c(jSONObject);
            final JSONObject c4 = g.c(c2);
            c.a().a(new Runnable() {
                /* class com.bytedance.apm.b.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(14413);
                }

                public final void run() {
                    JSONObject a2 = new com.bytedance.apm.c.b.c(str, 0, c3, (JSONObject) null, (JSONObject) null, c4).a();
                    if (a2 != null) {
                        b.a("monitorDuration", a2.toString());
                    }
                }
            });
        }
    }

    public static void a(String str, String str2) {
        try {
            synchronized (b.class) {
                String a2 = c.a();
                long id = Thread.currentThread().getId();
                long currentTimeMillis = System.currentTimeMillis();
                String a3 = t.a();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str).append("#").append(id).append("#").append(currentTimeMillis).append("#").append(a3).append("\n").append(str2).append("\n");
                byte[] bytes = stringBuffer.toString().getBytes("UTF-8");
                String absolutePath = a(c.f24685a).getAbsolutePath();
                if (f24357d == null) {
                    File file = new File(absolutePath + "/logs");
                    f24355b = new File(absolutePath + "/logs/proc: " + a2);
                    File file2 = new File(absolutePath + "/logs/proc: " + a2 + "/" + a3);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    if (!f24355b.exists()) {
                        f24355b.mkdirs();
                    }
                    file2.createNewFile();
                    f24357d = new RandomAccessFile(file2, "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0, c.b() ? 2097152 : 262144);
                }
                if (f24357d.remaining() < bytes.length) {
                    f24357d.force();
                    f24357d = new RandomAccessFile(new File(absolutePath + "/logs/proc: " + a2 + "/" + a3), "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0, c.b() ? 2097152 : 262144);
                }
                f24357d.put(bytes);
                if (f24356c == -1 || System.currentTimeMillis() - f24356c > 3600000) {
                    if (com.bytedance.apm.q.e.a(f24355b) > 1073741824 || com.bytedance.apm.q.e.a(c.f24685a).getFreeSpace() < 1073741824) {
                        a();
                    }
                    f24356c = System.currentTimeMillis();
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean a(File file) {
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    public static void a(final String str, JSONObject jSONObject) {
        final JSONObject a2 = a(jSONObject);
        d(a2);
        b.a.f25210a.a(new Runnable() {
            /* class com.bytedance.apm.b.AnonymousClass10 */

            static {
                Covode.recordClassIndex(14400);
            }

            public final void run() {
                String str = str;
                JSONObject jSONObject = a2;
                if (!TextUtils.isEmpty(str)) {
                    a.a(new com.bytedance.b.a.b.b(str, jSONObject));
                }
            }
        });
        if (c.f24687c) {
            final JSONObject c2 = g.c(a2);
            c.a().a(new Runnable() {
                /* class com.bytedance.apm.b.AnonymousClass11 */

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ boolean f24369c = false;

                static {
                    Covode.recordClassIndex(14401);
                }

                public final void run() {
                    JSONObject a2 = new com.bytedance.apm.c.b.b(str, c2, this.f24369c).a();
                    if (a2 != null) {
                        b.a("monitorCommonLog", a2.toString());
                    }
                }
            });
        }
    }

    static {
        Covode.recordClassIndex(14398);
    }

    private static void a() {
        if (c.b() && f24355b.exists()) {
            File[] listFiles = f24355b.listFiles();
            Arrays.sort(listFiles, new Comparator<File>() {
                /* class com.bytedance.apm.b.AnonymousClass17 */

                static {
                    Covode.recordClassIndex(14407);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(File file, File file2) {
                    int i2 = Build.VERSION.SDK_INT;
                    return Long.compare(file.lastModified(), file2.lastModified());
                }
            });
            int i2 = 60;
            if (listFiles.length <= 60) {
                i2 = listFiles.length;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                a(listFiles[i3]);
            }
        }
    }

    public static boolean a(String str) {
        return ApmDelegate.a.f25042a.b(str);
    }

    private static File a(Context context) {
        if (!TextUtils.isEmpty(null)) {
            return context.getExternalFilesDir(null);
        }
        if (d.f107196d != null && d.f107197e) {
            return d.f107196d;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        d.f107196d = externalFilesDir;
        return externalFilesDir;
    }

    private static JSONObject b(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject.isNull("timestamp")) {
            try {
                jSONObject.put("timestamp", System.currentTimeMillis());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    private static JSONObject c(JSONObject jSONObject) {
        try {
            JSONObject b2 = com.bytedance.b.k.e.b(jSONObject);
            if (b2 == null) {
                b2 = new JSONObject();
            }
            if (b2.isNull("timestamp")) {
                b2.put("timestamp", System.currentTimeMillis());
            }
            return b2;
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = null;
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                if (keys != null) {
                    jSONObject2 = new JSONObject();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                }
            } catch (Exception unused) {
                return jSONObject;
            }
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject2.isNull("timestamp")) {
            jSONObject2.put("timestamp", System.currentTimeMillis());
        }
        return jSONObject2;
    }

    private static void d(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("_debug_uuid", c.d() + "_" + f24354a.getAndAdd(1));
                jSONObject.put("_debug_self", jSONObject2);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(final com.bytedance.apm.config.d dVar) {
        if (dVar != null) {
            final JSONObject b2 = b(dVar.f24825e);
            d(b2);
            b.a.f25210a.a(new Runnable() {
                /* class com.bytedance.apm.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(14410);
                }

                public final void run() {
                    a.a(dVar.f24821a, dVar.f24822b, dVar.f24823c, dVar.f24824d, b2);
                }
            });
            if (c.f24687c) {
                final JSONObject c2 = g.c(dVar.f24823c);
                final JSONObject c3 = g.c(dVar.f24824d);
                final JSONObject c4 = g.c(b2);
                c.a().a(new Runnable() {
                    /* class com.bytedance.apm.b.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(14411);
                    }

                    public final void run() {
                        JSONObject a2 = new com.bytedance.apm.c.b.c(dVar.f24821a, dVar.f24822b, c2, c3, c4, dVar.f24826f).a();
                        if (a2 != null) {
                            b.a("monitorEvent", a2.toString());
                        }
                    }
                });
            }
        }
    }

    public static void a(final String str, final int i2, JSONObject jSONObject) {
        JSONObject a2 = a(jSONObject);
        d(a2);
        a.b(str, i2, null, null, a2);
        if (c.f24687c) {
            final JSONObject c2 = g.c(a2);
            c.a().a(new Runnable() {
                /* class com.bytedance.apm.b.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(14412);
                }

                public final void run() {
                    JSONObject a2 = new com.bytedance.apm.c.b.c(str, i2, (JSONObject) null, (JSONObject) null, (JSONObject) null, c2).a();
                    if (a2 != null) {
                        b.a("monitorStatusRate", a2.toString());
                    }
                }
            });
        }
    }

    public static void a(final String str, final int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject a2 = a(jSONObject2);
        d(a2);
        a.a(new com.bytedance.b.a.b.a(str, i2, g.d(jSONObject), null, null, g.d(a2)));
        if (c.f24687c) {
            final JSONObject c2 = g.c(jSONObject);
            final JSONObject c3 = g.c(a2);
            c.a().a(new Runnable() {
                /* class com.bytedance.apm.b.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(14414);
                }

                public final void run() {
                    JSONObject a2 = new com.bytedance.apm.c.b.c(str, i2, c2, (JSONObject) null, (JSONObject) null, c3).a();
                    if (a2 != null) {
                        b.a("monitorStatusAndDuration", a2.toString());
                    }
                }
            });
        }
    }

    public static void a(String str, long j2, long j3, String str2, com.bytedance.apm.a.e eVar, com.bytedance.apm.a.d dVar) {
        ApmDelegate apmDelegate = ApmDelegate.a.f25042a;
        if (apmDelegate.n) {
            b.a.f25210a.b(new Runnable(str, j2, j3, str2, eVar, dVar) {
                /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass8 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f25033a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ long f25034b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ long f25035c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ String f25036d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ com.bytedance.apm.a.e f25037e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ com.bytedance.apm.a.d f25038f;

                static {
                    Covode.recordClassIndex(14624);
                }

                public final void run() {
                    String str;
                    int i2;
                    String str2 = this.f25033a;
                    long j2 = this.f25034b;
                    long j3 = this.f25035c;
                    String str3 = this.f25036d;
                    com.bytedance.apm.a.e eVar = this.f25037e;
                    com.bytedance.apm.a.d dVar = this.f25038f;
                    long currentTimeMillis = System.currentTimeMillis();
                    com.bytedance.apm.b.a("apm_event_stats_alog", 0, (JSONObject) null);
                    com.bytedance.apm.a.b.a("begin upload alog:" + str2 + " startTime:" + j2 + " endTime:" + j3 + " scene:" + str3);
                    boolean z = true;
                    if (com.bytedance.apm.c.f24685a == null) {
                        str = "apm context is null";
                        i2 = 0;
                    } else {
                        if (TextUtils.isEmpty(str2)) {
                            if (TextUtils.isEmpty(com.bytedance.apm.c.r)) {
                                str = "alog file dir is null";
                                i2 = 1;
                            } else {
                                str2 = com.bytedance.apm.c.r;
                            }
                        }
                        if (!new File(str2).exists()) {
                            str = "alog file dir do not exist";
                            i2 = 2;
                        } else {
                            if (eVar != null) {
                                eVar.a();
                                com.bytedance.apm.a.b.a("flush alog data to file");
                            } else {
                                com.bytedance.apm.b.a("apm_event_stats_alog_fail", 3, (JSONObject) null);
                            }
                            com.bytedance.apm.a.a.a(str2, j2, j3, str3, dVar);
                            str = "";
                            i2 = -1;
                            z = false;
                        }
                    }
                    JSONObject a2 = com.bytedance.apm.a.b.a(!z, i2, null, null);
                    if (z) {
                        if (dVar != null) {
                            dVar.a(false, a2);
                        }
                        com.bytedance.apm.b.a("apm_event_stats_alog_fail", i2, a2);
                    }
                    com.bytedance.apm.a.b.a("upload end. ".concat(str));
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("time", System.currentTimeMillis() - currentTimeMillis);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    com.bytedance.apm.b.a("apm_event_stats_alog_time", (JSONObject) null, jSONObject, (JSONObject) null);
                }

                {
                    this.f25033a = r2;
                    this.f25034b = r3;
                    this.f25035c = r5;
                    this.f25036d = r7;
                    this.f25037e = r8;
                    this.f25038f = r9;
                }
            });
        }
    }
}
