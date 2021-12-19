package com.ss.android.ugc.aweme.draft;

import android.app.Application;
import com.bytedance.common.utility.d.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.tools.utils.h;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import java.io.File;
import java.nio.channels.FileChannel;

public final class h {
    static {
        Covode.recordClassIndex(51840);
    }

    private static final long a() {
        File file = new File(dj.f126463f);
        b(file);
        return b.d(file.getAbsolutePath());
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<File, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f83136a = new a();

        static {
            Covode.recordClassIndex(51841);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(File file) {
            l.d(file, "");
            return true;
        }
    }

    private static final boolean b(File file) {
        if (!file.exists()) {
            return file.mkdirs();
        }
        return true;
    }

    public static final long d(String str) {
        l.d(str, "");
        return com.ss.android.ugc.tools.utils.h.i(str);
    }

    public static final boolean b(String str) {
        l.d(str, "");
        if (com.ss.android.ugc.tools.utils.h.b(str)) {
            return com.ss.android.ugc.tools.utils.h.a(str, (h.b) null);
        }
        return new File(str).exists();
    }

    public static final String a(String str) {
        l.d(str, "");
        String str2 = File.separator;
        l.b(str2, "");
        if (p.c(str, str2, false)) {
            return str;
        }
        return str + File.separator;
    }

    public static final boolean c(String str) {
        boolean z;
        l.d(str, "");
        try {
            Application application = i.f115645a;
            l.b(application, "");
            File externalCacheDir = application.getExternalCacheDir();
            if (externalCacheDir != null) {
                l.b(externalCacheDir, "");
                String absolutePath = externalCacheDir.getAbsolutePath();
                l.b(absolutePath, "");
                z = p.a((CharSequence) absolutePath, (CharSequence) str, false);
                String str2 = dj.f126461d;
                l.b(str2, "");
                if (p.a(str, str2, false) && !z) {
                    return false;
                }
            }
        } catch (Throwable unused) {
        }
        z = false;
        String str22 = dj.f126461d;
        l.b(str22, "");
        return p.a(str, str22, false) ? true : true;
    }

    private static final void a(FileChannel fileChannel) {
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(10667);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(10667);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(10667);
        return delete;
    }

    private static DraftFileSaveException a(String str, String str2, h.f.a.b<? super File, Boolean> bVar) {
        boolean z;
        DraftFileSaveException draftFileSaveException;
        l.d(str, "");
        l.d(str2, "");
        l.d(bVar, "");
        if (l.a((Object) str2, (Object) str)) {
            return new DraftFileSaveException(0, null, 3, null);
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            draftFileSaveException = new DraftFileSaveException(-500, null, 2, null);
        } else {
            File file = new File(str);
            if (!file.exists()) {
                draftFileSaveException = new DraftFileSaveException(-502, new RuntimeException("path : ".concat(String.valueOf(str))));
            } else if (!file.isDirectory()) {
                draftFileSaveException = new DraftFileSaveException(-500, new RuntimeException("path : ".concat(String.valueOf(str))));
            } else if (str2.length() == 0) {
                draftFileSaveException = new DraftFileSaveException(-505, null, 2, null);
            } else {
                draftFileSaveException = new DraftFileSaveException(0, null, 3, null);
            }
        }
        if (!draftFileSaveException.isSuc()) {
            return draftFileSaveException;
        }
        long d2 = d(str);
        long a2 = a();
        String str3 = "dstPath : " + str2 + " ; availableBytes : " + a2 + " ; srcFileLength : " + d2;
        if (a2 < d2) {
            return new DraftFileSaveException(-553, new c(str3));
        }
        String a3 = a(str2);
        if (!b(new File(a3))) {
            return new DraftFileSaveException(-506, new RuntimeException("path : ".concat(String.valueOf(str2))));
        }
        DraftFileSaveException draftFileSaveException2 = new DraftFileSaveException(0, null, 3, null);
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                l.b(file2, "");
                if (bVar.invoke(file2).booleanValue()) {
                    if (file2.isDirectory()) {
                        String path = file2.getPath();
                        l.b(path, "");
                        draftFileSaveException2 = a(path, a3 + file2.getName(), null, 4);
                    } else {
                        String path2 = file2.getPath();
                        l.b(path2, "");
                        draftFileSaveException2 = a(path2, a3 + file2.getName(), false);
                    }
                    if (!draftFileSaveException2.isSuc()) {
                        break;
                    }
                }
            }
        }
        return draftFileSaveException2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.ss.android.ugc.aweme.draft.model.DraftFileSaveException a(java.lang.String r19, java.lang.String r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 501
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.draft.h.a(java.lang.String, java.lang.String, boolean):com.ss.android.ugc.aweme.draft.model.DraftFileSaveException");
    }

    public static /* synthetic */ DraftFileSaveException a(String str, String str2, h.f.a.b bVar, int i2) {
        if ((i2 & 4) != 0) {
            bVar = a.f83136a;
        }
        return a(str, str2, bVar);
    }
}
