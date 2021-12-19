package h.e;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class k {
    static {
        Covode.recordClassIndex(105164);
    }

    public static final boolean a(File file) {
        l.d(file, "");
        String path = file.getPath();
        l.b(path, "");
        if (a(path) > 0) {
            return true;
        }
        return false;
    }

    private static final int a(String str) {
        int a2;
        int a3 = p.a((CharSequence) str, File.separatorChar, 0, false, 4);
        if (a3 != 0) {
            if (a3 > 0) {
                if (str.charAt(a3 - 1) == ':') {
                    return a3 + 1;
                }
            } else if (a3 == -1 && p.a((CharSequence) str, ':')) {
                return str.length();
            }
            return 0;
        } else if (str.length() <= 1 || str.charAt(1) != File.separatorChar || (a2 = p.a((CharSequence) str, File.separatorChar, 2, false, 4)) < 0) {
            return 1;
        } else {
            int a4 = p.a((CharSequence) str, File.separatorChar, a2 + 1, false, 4);
            if (a4 >= 0) {
                return a4 + 1;
            }
            return str.length();
        }
    }

    public static final e b(File file) {
        ArrayList arrayList;
        l.d(file, "");
        String path = file.getPath();
        l.b(path, "");
        int a2 = a(path);
        String substring = path.substring(0, a2);
        l.b(substring, "");
        String substring2 = path.substring(a2);
        l.b(substring2, "");
        if (substring2.length() == 0) {
            arrayList = z.INSTANCE;
        } else {
            List<String> a3 = p.a((CharSequence) substring2, new char[]{File.separatorChar});
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) a3, 10));
            Iterator<T> it = a3.iterator();
            while (it.hasNext()) {
                arrayList2.add(new File((String) it.next()));
            }
            arrayList = arrayList2;
        }
        return new e(new File(substring), arrayList);
    }
}
