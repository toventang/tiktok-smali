package h.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import h.f.a.b;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class n extends m {
    static {
        Covode.recordClassIndex(105167);
    }

    public static final String e(File file) {
        l.d(file, "");
        String name = file.getName();
        l.b(name, "");
        return p.c(name, '.', "");
    }

    public static final String f(File file) {
        l.d(file, "");
        String name = file.getName();
        l.b(name, "");
        return p.h(name, ".");
    }

    public static final boolean g(File file) {
        l.d(file, "");
        Iterator a2 = j.d(file).a();
        while (true) {
            boolean z = true;
            while (true) {
                if (!a2.hasNext()) {
                    return z;
                }
                File file2 = (File) a2.next();
                if (i(file2) || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }

    public static final File h(File file) {
        l.d(file, "");
        e b2 = j.b(file);
        File file2 = b2.f158681a;
        List<File> a2 = a(b2.f158682b);
        String str = File.separator;
        l.b(str, "");
        return j.a(file2, h.a.n.a(a2, str, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (b) null, 62));
    }

    private static boolean i(File file) {
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.b(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    private static final List<File> a(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != 46) {
                    if (hashCode == 1472 && name.equals("..")) {
                        if (arrayList.isEmpty() || !(!l.a((Object) ((File) h.a.n.i((List) arrayList)).getName(), (Object) ".."))) {
                            arrayList.add(file);
                        } else {
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                } else if (name.equals(".")) {
                }
            }
            arrayList.add(file);
        }
        return arrayList;
    }

    public static final File a(File file, String str) {
        l.d(file, "");
        l.d(str, "");
        return j.b(file, new File(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        h.e.c.a(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005a, code lost:
        h.e.c.a(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File a(java.io.File r5, java.io.File r6) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: h.e.n.a(java.io.File, java.io.File):java.io.File");
    }

    public static final File b(File file, File file2) {
        l.d(file, "");
        l.d(file2, "");
        if (j.a(file2)) {
            return file2;
        }
        String file3 = file.toString();
        l.b(file3, "");
        if (file3.length() != 0 && !p.a((CharSequence) file3, File.separatorChar)) {
            return new File(file3 + File.separatorChar + file2);
        }
        return new File(file3 + file2);
    }
}
