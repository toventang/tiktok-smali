package com.facebook.soloader;

import android.os.StrictMode;
import android.os.Trace;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class c extends i {

    /* renamed from: b  reason: collision with root package name */
    protected final File f49199b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f49200c;

    static {
        Covode.recordClassIndex(30759);
    }

    @Override // com.facebook.soloader.i
    public String toString() {
        String str;
        try {
            str = String.valueOf(this.f49199b.getCanonicalPath());
        } catch (IOException unused) {
            str = this.f49199b.getName();
        }
        return getClass().getName() + "[root = " + str + " flags = " + this.f49200c + ']';
    }

    private static String[] a(File file) {
        if (SoLoader.f49175a) {
            Trace.beginSection("SoLoader.getElfDependencies[" + file.getName() + "]");
        }
        try {
            return g.a(file);
        } finally {
            if (SoLoader.f49175a) {
                Trace.endSection();
            }
        }
    }

    public c(File file, int i2) {
        this.f49199b = file;
        this.f49200c = i2;
    }

    @Override // com.facebook.soloader.i
    public int a(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        return a(str, i2, this.f49199b, threadPolicy);
    }

    private static void a(File file, int i2, StrictMode.ThreadPolicy threadPolicy) {
        String[] a2 = a(file);
        Arrays.toString(a2);
        for (String str : a2) {
            if (!str.startsWith("/")) {
                SoLoader.a(str, null, i2 | 1, threadPolicy);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int a(String str, int i2, File file, StrictMode.ThreadPolicy threadPolicy) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file.getCanonicalPath();
            return 0;
        }
        file.getCanonicalPath();
        if ((i2 & 1) != 0 && (this.f49200c & 2) != 0) {
            return 2;
        }
        if ((this.f49200c & 1) != 0) {
            a(file2, i2, threadPolicy);
        }
        try {
            SoLoader.f49176b.a(file2.getAbsolutePath(), i2);
            return 1;
        } catch (UnsatisfiedLinkError e2) {
            if (e2.getMessage().contains("bad ELF magic")) {
                return 3;
            }
            throw e2;
        }
    }
}
