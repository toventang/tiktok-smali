package com.google.android.play.core.assetpacks;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.android.play.core.b.b;
import com.google.android.play.core.b.bf;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* access modifiers changed from: package-private */
public final class cm {

    /* renamed from: a  reason: collision with root package name */
    private static final b f52986a = new b("SliceMetadataManager");

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f52987b = new byte[8192];

    /* renamed from: c  reason: collision with root package name */
    private final ac f52988c;

    /* renamed from: d  reason: collision with root package name */
    private final String f52989d;

    /* renamed from: e  reason: collision with root package name */
    private final int f52990e;

    /* renamed from: f  reason: collision with root package name */
    private final long f52991f;

    /* renamed from: g  reason: collision with root package name */
    private final String f52992g;

    /* renamed from: h  reason: collision with root package name */
    private int f52993h;

    static {
        Covode.recordClassIndex(32732);
    }

    cm(ac acVar, String str, int i2, long j2, String str2) {
        this.f52988c = acVar;
        this.f52989d = str;
        this.f52990e = i2;
        this.f52991f = j2;
        this.f52992g = str2;
        this.f52993h = -1;
    }

    private final File e() {
        File e2 = this.f52988c.e(this.f52989d, this.f52990e, this.f52991f, this.f52992g);
        if (!e2.exists()) {
            e2.mkdirs();
        }
        return e2;
    }

    private final File f() {
        File c2 = this.f52988c.c(this.f52989d, this.f52990e, this.f52991f, this.f52992g);
        c2.getParentFile().mkdirs();
        c2.createNewFile();
        return c2;
    }

    /* access modifiers changed from: package-private */
    public final cl a() {
        MethodCollector.i(7217);
        File c2 = this.f52988c.c(this.f52989d, this.f52990e, this.f52991f, this.f52992g);
        if (c2.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(c2);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    au auVar = new au("Slice checkpoint file corrupt.");
                    MethodCollector.o(7217);
                    throw auVar;
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f52993h = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    cl clVar = new cl(parseInt, property, parseLong, parseLong2, parseInt2);
                    MethodCollector.o(7217);
                    return clVar;
                } catch (NumberFormatException e2) {
                    au auVar2 = new au("Slice checkpoint file corrupt.", e2);
                    MethodCollector.o(7217);
                    throw auVar2;
                }
            } catch (Throwable th) {
                bf.a(th, th);
            }
        } else {
            au auVar3 = new au("Slice checkpoint file does not exist.");
            MethodCollector.o(7217);
            throw auVar3;
        }
        MethodCollector.o(7217);
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        MethodCollector.i(7103);
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(b().length()));
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f52993h));
        FileOutputStream fileOutputStream = new FileOutputStream(f());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            MethodCollector.o(7103);
            return;
        } catch (Throwable th) {
            bf.a(th, th);
        }
        MethodCollector.o(7103);
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(b(), "rw");
        try {
            randomAccessFile.seek(j2);
            randomAccessFile.write(bArr, i2, i3);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            bf.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void a(InputStream inputStream, long j2) {
        int read;
        MethodCollector.i(7224);
        RandomAccessFile randomAccessFile = new RandomAccessFile(b(), "rw");
        try {
            randomAccessFile.seek(j2);
            do {
                read = inputStream.read(this.f52987b);
                if (read <= 0) {
                    break;
                }
                randomAccessFile.write(this.f52987b, 0, read);
            } while (read == 8192);
            randomAccessFile.close();
            MethodCollector.o(7224);
            return;
        } catch (Throwable th) {
            bf.a(th, th);
        }
        MethodCollector.o(7224);
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, long j2, long j3, int i2) {
        MethodCollector.i(6979);
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j2));
        properties.put("remainingBytes", String.valueOf(j3));
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f52993h));
        FileOutputStream fileOutputStream = new FileOutputStream(f());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            MethodCollector.o(6979);
            return;
        } catch (Throwable th) {
            bf.a(th, th);
        }
        MethodCollector.o(6979);
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void a(byte[] bArr) {
        MethodCollector.i(7235);
        this.f52993h++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(e(), a.a("%s-LFH.dat", new Object[]{Integer.valueOf(this.f52993h)})));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                MethodCollector.o(7235);
                return;
            } catch (Throwable th) {
                bf.a(th, th);
            }
            MethodCollector.o(7235);
            throw th;
        } catch (IOException e2) {
            au auVar = new au("Could not write metadata file.", e2);
            MethodCollector.o(7235);
            throw auVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(byte[] bArr, int i2) {
        MethodCollector.i(7037);
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f52993h));
        FileOutputStream fileOutputStream = new FileOutputStream(f());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File d2 = this.f52988c.d(this.f52989d, this.f52990e, this.f52991f, this.f52992g);
            if (d2.exists()) {
                a(d2);
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(d2);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                MethodCollector.o(7037);
                return;
            } catch (Throwable th) {
                bf.a(th, th);
            }
            MethodCollector.o(7037);
            throw th;
            MethodCollector.o(7037);
            throw th;
        } catch (Throwable th2) {
            bf.a(th, th2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(byte[] bArr, InputStream inputStream) {
        MethodCollector.i(7241);
        this.f52993h++;
        FileOutputStream fileOutputStream = new FileOutputStream(b());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f52987b);
            while (read > 0) {
                fileOutputStream.write(this.f52987b, 0, read);
                read = inputStream.read(this.f52987b);
            }
            fileOutputStream.close();
            MethodCollector.o(7241);
            return;
        } catch (Throwable th) {
            bf.a(th, th);
        }
        MethodCollector.o(7241);
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final File b() {
        return new File(e(), a.a("%s-NAM.dat", new Object[]{Integer.valueOf(this.f52993h)}));
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        MethodCollector.i(7196);
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f52993h));
        FileOutputStream fileOutputStream = new FileOutputStream(f());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            MethodCollector.o(7196);
            return;
        } catch (Throwable th) {
            bf.a(th, th);
        }
        MethodCollector.o(7196);
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void b(byte[] bArr, int i2) {
        MethodCollector.i(7366);
        this.f52993h++;
        FileOutputStream fileOutputStream = new FileOutputStream(b());
        try {
            fileOutputStream.write(bArr, 0, i2);
            fileOutputStream.close();
            MethodCollector.o(7366);
            return;
        } catch (Throwable th) {
            bf.a(th, th);
        }
        MethodCollector.o(7366);
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final int c() {
        int parseInt;
        MethodCollector.i(7261);
        File c2 = this.f52988c.c(this.f52989d, this.f52990e, this.f52991f, this.f52992g);
        if (!c2.exists()) {
            parseInt = 0;
        } else {
            FileInputStream fileInputStream = new FileInputStream(c2);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                    parseInt = -1;
                } else if (properties.getProperty("previousChunk") != null) {
                    parseInt = Integer.parseInt(properties.getProperty("previousChunk")) + 1;
                } else {
                    au auVar = new au("Slice checkpoint file corrupt.");
                    MethodCollector.o(7261);
                    throw auVar;
                }
            } catch (Throwable th) {
                bf.a(th, th);
            }
        }
        MethodCollector.o(7261);
        return parseInt;
        MethodCollector.o(7261);
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        MethodCollector.i(7351);
        File c2 = this.f52988c.c(this.f52989d, this.f52990e, this.f52991f, this.f52992g);
        if (!c2.exists()) {
            MethodCollector.o(7351);
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(c2);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null) {
                    f52986a.b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                    MethodCollector.o(7351);
                    return false;
                }
                int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                MethodCollector.o(7351);
                return parseInt == 4;
            } catch (Throwable th) {
                bf.a(th, th);
            }
        } catch (IOException e2) {
            f52986a.b("Could not read checkpoint while checking if extraction finished. %s", e2);
        }
        MethodCollector.o(7351);
        throw th;
    }

    private static boolean a(File file) {
        MethodCollector.i(7085);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(7085);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(7085);
        return delete;
    }
}
