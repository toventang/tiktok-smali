package com.bytedance.geckox.b;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.j.b;
import com.bytedance.geckox.model.CleanPolicyModel;
import com.bytedance.geckox.statistic.c;
import com.bytedance.geckox.utils.e;
import com.bytedance.geckox.utils.g;
import com.bytedance.geckox.utils.m;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a {
    static {
        Covode.recordClassIndex(17256);
    }

    public static void a(final int i2, Map<String, CleanPolicyModel> map, Map<String, String> map2, final com.bytedance.geckox.f.a aVar) {
        CleanPolicyModel value;
        List<Long> b2;
        List<Long> b3;
        ConcurrentHashMap<String, com.bytedance.geckox.j.a> concurrentHashMap;
        MethodCollector.i(8045);
        if (map == null || map.isEmpty()) {
            MethodCollector.o(8045);
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, CleanPolicyModel> entry : map.entrySet()) {
                String key = entry.getKey();
                String str = map2.get(key);
                if (!TextUtils.isEmpty(str)) {
                    File file = new File(str, key);
                    if (file.isDirectory() && (value = entry.getValue()) != null && value.specifiedClean != null && !value.specifiedClean.isEmpty()) {
                        for (CleanPolicyModel.a aVar2 : value.specifiedClean) {
                            String str2 = aVar2.f29939a;
                            int i3 = aVar2.f29940b;
                            List<Long> list = aVar2.f29941c;
                            File file2 = new File(file, str2);
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    if (i3 == 3) {
                                        File file3 = new File(file, str2);
                                        File file4 = new File(file, str2 + "--pending-delete");
                                        file3.renameTo(file4);
                                        arrayList.add(new C0629a(key, str2, 3, 0, file4));
                                        l.c(key, "");
                                        l.c(str2, "");
                                        if (b.f29912d && (concurrentHashMap = b.f29909a.get(key)) != null) {
                                            concurrentHashMap.remove(str2);
                                            b.f29911c.put(key, true);
                                        }
                                    }
                                } else if (!(list == null || (b3 = m.b(file2)) == null || b3.isEmpty())) {
                                    for (Long l2 : b3) {
                                        if (list.get(0).longValue() > l2.longValue()) {
                                            File file5 = new File(file2, l2 + "--pending-delete");
                                            new File(file2, String.valueOf(l2)).renameTo(file5);
                                            arrayList.add(new C0629a(key, str2, 2, l2.longValue(), file5));
                                        }
                                    }
                                }
                            } else if (!(list == null || (b2 = m.b(file2)) == null || b2.isEmpty())) {
                                for (Long l3 : b2) {
                                    if (list.contains(l3)) {
                                        File file6 = new File(file2, l3 + "--pending-delete");
                                        new File(file2, String.valueOf(l3)).renameTo(file6);
                                        arrayList.add(new C0629a(key, str2, 1, l3.longValue(), file6));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            g.a().execute(new Runnable() {
                /* class com.bytedance.geckox.b.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(17257);
                }

                public final void run() {
                    try {
                        int i2 = i2;
                        List<C0629a> list = arrayList;
                        com.bytedance.geckox.f.a aVar = aVar;
                        if (list == null) {
                            return;
                        }
                        if (!list.isEmpty()) {
                            for (C0629a aVar2 : list) {
                                File file = aVar2.f29727e;
                                long uptimeMillis = SystemClock.uptimeMillis();
                                boolean a2 = e.a(file);
                                long uptimeMillis2 = SystemClock.uptimeMillis();
                                int i3 = 200;
                                if (!a2) {
                                    i3 = 201;
                                }
                                c.a(new com.bytedance.geckox.statistic.model.b(aVar2.f29723a, aVar2.f29724b, aVar2.f29725c, i3, aVar2.f29726d, uptimeMillis2 - uptimeMillis, i2));
                            }
                        }
                    } catch (Exception unused) {
                        com.bytedance.geckox.i.a.a();
                    }
                }
            });
            MethodCollector.o(8045);
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(8045);
        }
    }

    /* renamed from: com.bytedance.geckox.b.a$a  reason: collision with other inner class name */
    static class C0629a {

        /* renamed from: a  reason: collision with root package name */
        String f29723a;

        /* renamed from: b  reason: collision with root package name */
        String f29724b;

        /* renamed from: c  reason: collision with root package name */
        int f29725c;

        /* renamed from: d  reason: collision with root package name */
        long f29726d;

        /* renamed from: e  reason: collision with root package name */
        File f29727e;

        static {
            Covode.recordClassIndex(17258);
        }

        C0629a(String str, String str2, int i2, long j2, File file) {
            this.f29723a = str;
            this.f29724b = str2;
            this.f29725c = i2;
            this.f29726d = j2;
            this.f29727e = file;
        }
    }
}
