package c.b;

import c.a.a;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class a extends File {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a.a f4881a = a.C0068a.f4876a;

    static {
        Covode.recordClassIndex(1922);
    }

    public a getAbsoluteFile() {
        try {
            return new a(getAbsolutePath());
        } catch (c.b.a.a unused) {
            return null;
        }
    }

    public a getParentFile() {
        String parent = super.getParent();
        if (parent == null) {
            return null;
        }
        try {
            return new a(parent);
        } catch (c.b.a.a unused) {
            return null;
        }
    }

    public String getParent() {
        String parent = super.getParent();
        if (parent == null) {
            return null;
        }
        try {
            return new a(parent).getPath();
        } catch (c.b.a.a unused) {
            return null;
        }
    }

    public a[] listFiles() {
        String[] list = list();
        if (list == null) {
            return null;
        }
        int length = list.length;
        a[] aVarArr = new a[length];
        for (int i2 = 0; i2 < length; i2++) {
            try {
                aVarArr[i2] = new a(getPath(), list[i2]);
            } catch (c.b.a.a unused) {
            }
        }
        return aVarArr;
    }

    public a(String str) {
        super(f4881a.a(str));
    }

    @Override // java.io.File
    public a[] listFiles(FileFilter fileFilter) {
        a aVar;
        String[] list = list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                aVar = new a(getPath(), str);
            } catch (c.b.a.a unused) {
                aVar = null;
            }
            if (fileFilter == null || fileFilter.accept(aVar)) {
                arrayList.add(aVar);
            }
        }
        return (a[]) arrayList.toArray(new a[arrayList.size()]);
    }

    @Override // java.io.File
    public a[] listFiles(FilenameFilter filenameFilter) {
        String[] list = list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (filenameFilter == null || filenameFilter.accept(this, str)) {
                try {
                    arrayList.add(new a(getPath(), str));
                } catch (c.b.a.a unused) {
                }
            }
        }
        return (a[]) arrayList.toArray(new a[arrayList.size()]);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.net.URI r6) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.a.<init>(java.net.URI):void");
    }

    public a(String str, String str2) {
        super(f4881a.a(str, str2));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.io.File r4, java.lang.String r5) {
        /*
            r3 = this;
            c.a.a r2 = c.b.a.f4881a
            if (r5 != 0) goto L_0x0008
        L_0x0004:
            r3.<init>(r5)
            return
        L_0x0008:
            if (r4 == 0) goto L_0x0026
            java.lang.String r1 = r4.getPath()
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = "/"
            java.lang.String r5 = r2.a(r0, r5)
            goto L_0x0004
        L_0x001d:
            java.lang.String r0 = r4.getPath()
            java.lang.String r5 = r2.a(r0, r5)
            goto L_0x0004
        L_0x0026:
            java.lang.String r5 = r2.a(r5)
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.a.<init>(java.io.File, java.lang.String):void");
    }
}
