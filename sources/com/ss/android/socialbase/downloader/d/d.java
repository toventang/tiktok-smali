package com.ss.android.socialbase.downloader.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

final class d implements e {

    /* renamed from: a  reason: collision with root package name */
    private File f60374a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f60375b = true;

    static {
        Covode.recordClassIndex(37262);
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final int m() {
        return 1;
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final String o() {
        return "";
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final File g() {
        return this.f60374a;
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final long a() {
        return this.f60374a.length();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final boolean b() {
        return this.f60374a.exists();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final boolean c() {
        return this.f60374a.isDirectory();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final String e() {
        return this.f60374a.getPath();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final boolean f() {
        return this.f60374a.canWrite();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final long h() {
        return this.f60374a.lastModified();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final File k() {
        return this.f60374a.getParentFile();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final String l() {
        return this.f60374a.getCanonicalPath();
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final boolean d() {
        if (!this.f60375b) {
            return true;
        }
        return a(this.f60374a);
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final FileOutputStream j() {
        MethodCollector.i(14436);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f60374a);
        MethodCollector.o(14436);
        return fileOutputStream;
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final FileInputStream i() {
        MethodCollector.i(14404);
        if (this.f60374a.isFile()) {
            FileInputStream fileInputStream = new FileInputStream(this.f60374a);
            MethodCollector.o(14404);
            return fileInputStream;
        }
        IOException iOException = new IOException("Fail to obtain InputStream, file type error");
        MethodCollector.o(14404);
        throw iOException;
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final boolean a(long j2) {
        return this.f60374a.setLastModified(j2);
    }

    @Override // com.ss.android.socialbase.downloader.d.e
    public final boolean a(a aVar) {
        MethodCollector.i(14468);
        if (aVar.n()) {
            boolean renameTo = this.f60374a.renameTo(aVar.g());
            MethodCollector.o(14468);
            return renameTo;
        }
        MethodCollector.o(14468);
        return false;
    }

    private static boolean a(File file) {
        MethodCollector.i(14244);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(14244);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(14244);
        return delete;
    }

    public d(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str2)) {
            this.f60374a = new File(str, str2);
        } else {
            this.f60374a = new File(str);
        }
        if (z) {
            this.f60375b = com.ss.android.socialbase.downloader.k.g.e(str);
        }
    }
}
