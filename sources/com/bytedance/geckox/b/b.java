package com.bytedance.geckox.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.h.a;
import com.bytedance.geckox.h.c;
import com.bytedance.geckox.utils.d;
import com.bytedance.geckox.utils.e;
import com.bytedance.geckox.utils.g;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b {
    static {
        Covode.recordClassIndex(17266);
    }

    public static void a(final File file) {
        g.a().execute(new Runnable() {
            /* class com.bytedance.geckox.b.b.AnonymousClass3 */

            static {
                Covode.recordClassIndex(17269);
            }

            public final void run() {
                e.a(file);
            }
        });
    }

    /* JADX INFO: finally extract failed */
    public static boolean a(String str) {
        try {
            a a2 = a.a(str + File.separator + "update.lock");
            if (a2 == null) {
                return true;
            }
            try {
                com.bytedance.geckox.h.b a3 = com.bytedance.geckox.h.b.a(str + File.separator + "select.lock");
                try {
                    e.a(new File(str));
                    a3.a();
                    return true;
                } catch (Throwable th) {
                    a3.a();
                    throw th;
                }
            } finally {
                a2.a();
            }
        } catch (Throwable th2) {
            d.a(new RuntimeException("delete old channel version failed，path：".concat(String.valueOf(str)), th2));
            return false;
        }
    }

    private static List<File> a(String str, long j2, List<File> list) {
        File[] listFiles = new File(str).listFiles(new FileFilter() {
            /* class com.bytedance.geckox.b.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(17268);
            }

            public final boolean accept(File file) {
                return file.isDirectory();
            }
        });
        if (listFiles == null || listFiles.length == 0 || listFiles.length == 1) {
            return null;
        }
        return a(listFiles, j2, list);
    }

    private static List<File> a(File[] fileArr, long j2, List<File> list) {
        ArrayList<File> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        File file = null;
        long j3 = j2;
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (name.endsWith("--updating")) {
                arrayList.add(file2);
            } else if (name.endsWith("--pending-delete")) {
                a(file2);
                list.add(file2);
            } else {
                try {
                    long parseLong = Long.parseLong(name);
                    if (j3 != 0) {
                        if (parseLong != j2) {
                            arrayList2.add(file2);
                        }
                    } else if (parseLong > j3) {
                        if (file != null) {
                            try {
                                arrayList2.add(file);
                            } catch (Exception unused) {
                                j3 = parseLong;
                                a(file2);
                                list.add(file2);
                            }
                        }
                        file = file2;
                        j3 = parseLong;
                    } else {
                        arrayList2.add(file2);
                    }
                } catch (Exception unused2) {
                    a(file2);
                    list.add(file2);
                }
            }
        }
        for (File file3 : arrayList) {
            String name2 = file3.getName();
            int indexOf = name2.indexOf("--updating");
            if (indexOf == -1) {
                a(file3);
                list.add(file3);
            } else {
                String substring = name2.substring(0, indexOf);
                long j4 = -1;
                try {
                    j4 = Long.parseLong(substring);
                } catch (NumberFormatException e2) {
                    e2.printStackTrace();
                }
                if (j4 <= j3) {
                    a(file3);
                    list.add(file3);
                }
            }
        }
        return arrayList2;
    }

    public static void a(String str, Long l2, boolean z, int i2) {
        long j2 = 0;
        if (l2 != null) {
            try {
                j2 = l2.longValue();
            } catch (Throwable th) {
                d.a(new RuntimeException("delete old channel version failed，path：".concat(String.valueOf(str)), th));
                return;
            }
        }
        a(str, j2, z, i2);
    }

    /* JADX INFO: finally extract failed */
    public static void a(String str, long j2, boolean z, int i2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            a a2 = a.a(str + File.separator + "update.lock");
            if (a2 == null) {
                a(i2, str, arrayList, arrayList2, "get lock failed");
                return;
            }
            try {
                com.bytedance.geckox.h.b a3 = com.bytedance.geckox.h.b.a(str + File.separator + "select.lock");
                try {
                    List<File> a4 = a(str, j2, arrayList);
                    if (a4 == null || a4.isEmpty()) {
                        a(i2, str, arrayList, arrayList2, "versions is empty");
                        a3.a();
                        return;
                    }
                    com.bytedance.geckox.i.a.a("delete after update", str, Long.valueOf(j2), a4);
                    for (File file : a4) {
                        if (c.a(file.getAbsolutePath() + File.separator + "using.lock")) {
                            arrayList.add(file);
                        } else {
                            arrayList2.add(file);
                        }
                    }
                    a(i2, str, arrayList, arrayList2, "");
                    a3.a();
                    a2.a();
                } catch (Throwable th) {
                    a3.a();
                    throw th;
                }
            } finally {
                a2.a();
            }
        } else {
            List<File> a5 = a(str, j2, arrayList);
            if (a5 == null || a5.isEmpty()) {
                a(i2, str, arrayList, arrayList2, "versions is empty");
                return;
            }
            com.bytedance.geckox.i.a.a("delete after update", str, Long.valueOf(j2), a5);
            for (File file2 : a5) {
                if (c.a(file2.getAbsolutePath() + File.separator + "using.lock")) {
                    arrayList.add(file2);
                } else {
                    arrayList2.add(file2);
                }
            }
            a(i2, str, arrayList, arrayList2, "");
        }
    }

    private static void a(int i2, String str, List<File> list, List<File> list2, String str2) {
        if (i2 == 41) {
            if (list2.isEmpty()) {
                return;
            }
        } else if (i2 == 40 && list.isEmpty() && list2.isEmpty()) {
            return;
        }
        if (list.size() > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = str2 + ";";
            }
            str2 = str2 + "deleteVersion:";
            Iterator<File> it = list.iterator();
            while (it.hasNext()) {
                str2 = str2 + "[" + it.next().getName() + "]";
            }
        }
        if (list2.size() > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = str2 + ";";
            }
            str2 = str2 + "notDeleteVersion:";
            Iterator<File> it2 = list2.iterator();
            while (it2.hasNext()) {
                str2 = str2 + "[" + it2.next().getName() + "]";
            }
        }
        com.bytedance.geckox.statistic.c.a(4, i2, str2, new File(str).getName());
    }
}
