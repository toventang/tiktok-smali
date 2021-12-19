package com.facebook.internal.a.a;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.GraphRequest;
import com.facebook.ab;
import com.facebook.internal.a.b;
import com.facebook.internal.a.d;
import com.facebook.internal.ad;
import com.facebook.r;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONException;

public class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private static final String f48488a = a.class.getCanonicalName();

    /* renamed from: b  reason: collision with root package name */
    private static a f48489b;

    /* renamed from: c  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f48490c;

    static {
        Covode.recordClassIndex(29243);
    }

    public static synchronized void a() {
        File[] fileArr;
        synchronized (a.class) {
            MethodCollector.i(643);
            if (ab.b() && !ad.g()) {
                File a2 = d.a();
                int i2 = 0;
                if (a2 == null || (fileArr = a2.listFiles(new FilenameFilter() {
                    /* class com.facebook.internal.a.d.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(29261);
                    }

                    public final boolean accept(File file, String str) {
                        return str.matches(a.a("^(%s|%s|%s)[0-9]+.json$", new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}));
                    }
                })) == null) {
                    fileArr = new File[0];
                }
                final ArrayList arrayList = new ArrayList();
                for (File file : fileArr) {
                    b a3 = b.a.a(file);
                    if (a3.a()) {
                        arrayList.add(a3);
                    }
                }
                Collections.sort(arrayList, new Comparator<b>() {
                    /* class com.facebook.internal.a.a.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(29244);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(b bVar, b bVar2) {
                        b bVar3 = bVar;
                        b bVar4 = bVar2;
                        if (bVar3.f48492a == null) {
                            return -1;
                        }
                        if (bVar4.f48492a == null) {
                            return 1;
                        }
                        return bVar4.f48492a.compareTo(bVar3.f48492a);
                    }
                });
                JSONArray jSONArray = new JSONArray();
                while (i2 < arrayList.size() && i2 < 5) {
                    jSONArray.put(arrayList.get(i2));
                    i2++;
                }
                d.a("crash_reports", jSONArray, new GraphRequest.b() {
                    /* class com.facebook.internal.a.a.a.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(29245);
                    }

                    @Override // com.facebook.GraphRequest.b
                    public final void a(r rVar) {
                        try {
                            if (rVar.f49019d == null && rVar.f49017b.getBoolean("success")) {
                                for (int i2 = 0; arrayList.size() > i2; i2++) {
                                    ((b) arrayList.get(i2)).c();
                                }
                            }
                        } catch (JSONException unused) {
                        }
                    }
                });
            }
            if (f48489b != null) {
                MethodCollector.o(643);
                return;
            }
            a aVar = new a(Thread.getDefaultUncaughtExceptionHandler());
            f48489b = aVar;
            Thread.setDefaultUncaughtExceptionHandler(aVar);
            MethodCollector.o(643);
        }
    }

    private a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f48490c = uncaughtExceptionHandler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        r5 = r5.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r5 == null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uncaughtException(java.lang.Thread r7, java.lang.Throwable r8) {
        /*
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L_0x0027
            r0 = 0
            r5 = r8
        L_0x0005:
            java.lang.StackTraceElement[] r4 = r5.getStackTrace()
            int r3 = r4.length
            r2 = 0
        L_0x000b:
            if (r2 >= r3) goto L_0x0032
            r0 = r4[r2]
            java.lang.String r1 = r0.getClassName()
            java.lang.String r0 = "com.facebook"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x002f
            com.facebook.internal.a.a.a(r8)
            com.facebook.internal.a.b$b r0 = com.facebook.internal.a.b.EnumC1185b.CrashReport
            com.facebook.internal.a.b r0 = com.facebook.internal.a.b.a.a(r8, r0)
            r0.b()
        L_0x0027:
            java.lang.Thread$UncaughtExceptionHandler r0 = r6.f48490c
            if (r0 == 0) goto L_0x002e
            r0.uncaughtException(r7, r8)
        L_0x002e:
            return
        L_0x002f:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x0032:
            java.lang.Throwable r1 = r5.getCause()
            r0 = r5
            r5 = r1
            if (r5 == 0) goto L_0x0027
            if (r5 == r0) goto L_0x0027
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.a.a.a.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
