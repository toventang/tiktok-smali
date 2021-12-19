package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.twitter.sdk.android.core.internal.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class s implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Context f156106a;

    /* renamed from: b  reason: collision with root package name */
    private final File f156107b;

    /* renamed from: c  reason: collision with root package name */
    private final String f156108c;

    /* renamed from: d  reason: collision with root package name */
    private final File f156109d;

    /* renamed from: e  reason: collision with root package name */
    private r f156110e;

    /* renamed from: f  reason: collision with root package name */
    private File f156111f;

    static {
        Covode.recordClassIndex(103698);
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.m
    public final int a() {
        return this.f156110e.a();
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.m
    public final boolean b() {
        return this.f156110e.b();
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.m
    public final List<File> d() {
        return Arrays.asList(this.f156111f.listFiles());
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.m
    public final List<File> c() {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f156111f.listFiles()) {
            arrayList.add(file);
            if (arrayList.size() > 0) {
                break;
            }
        }
        return arrayList;
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.m
    public final void a(byte[] bArr) {
        this.f156110e.a(bArr, bArr.length);
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.m
    public final boolean a(int i2) {
        if (this.f156110e.a() + 4 + i2 <= 8000) {
            return true;
        }
        return false;
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.m
    public final void a(List<File> list) {
        for (File file : list) {
            g.a(this.f156106a, a.a("deleting sent analytics file %s", new Object[]{file.getName()}));
            a(file);
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(13063);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(13063);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(13063);
        return delete;
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.m
    public final void a(String str) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        MethodCollector.i(12970);
        this.f156110e.close();
        File file = this.f156109d;
        File file2 = new File(this.f156111f, str);
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                g.b(fileInputStream);
                g.b(fileOutputStream);
                a(file);
                MethodCollector.o(12970);
                throw th;
            }
            try {
                g.a(fileInputStream, fileOutputStream, new byte[1024]);
                g.b(fileInputStream);
                g.b(fileOutputStream);
                a(file);
                this.f156110e = new r(this.f156109d);
                MethodCollector.o(12970);
            } catch (Throwable th3) {
                th = th3;
                g.b(fileInputStream);
                g.b(fileOutputStream);
                a(file);
                MethodCollector.o(12970);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            fileOutputStream = null;
            g.b(fileInputStream);
            g.b(fileOutputStream);
            a(file);
            MethodCollector.o(12970);
            throw th;
        }
    }

    public s(Context context, File file, String str, String str2) {
        this.f156106a = context;
        this.f156107b = file;
        this.f156108c = str2;
        File file2 = new File(file, str);
        this.f156109d = file2;
        this.f156110e = new r(file2);
        File file3 = new File(file, str2);
        this.f156111f = file3;
        if (!file3.exists()) {
            this.f156111f.mkdirs();
        }
    }
}
