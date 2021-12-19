package com.ss.ugc.live.a.a.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.ugc.live.a.a.a;
import com.ss.ugc.live.a.a.c;
import com.ss.ugc.live.a.a.e.b;
import com.ss.ugc.live.a.a.e.d;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class f implements a<String>, d<String> {

    /* renamed from: a  reason: collision with root package name */
    private d<String> f154023a;

    /* renamed from: b  reason: collision with root package name */
    private a<String> f154024b;

    static {
        Covode.recordClassIndex(102716);
    }

    public f(d dVar) {
        this.f154023a = dVar;
    }

    private static boolean a(File file) {
        MethodCollector.i(7823);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(7823);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(7823);
        return delete;
    }

    @Override // com.ss.ugc.live.a.a.d.d
    public final void a(c cVar, a<String> aVar) {
        this.f154024b = aVar;
        this.f154023a.a(cVar, this);
    }

    @Override // com.ss.ugc.live.a.a.a
    public final void a(c cVar, int i2) {
        a<String> aVar = this.f154024b;
        if (aVar != null) {
            aVar.a(cVar, i2);
        }
    }

    @Override // com.ss.ugc.live.a.a.a
    public final void a(c cVar, com.ss.ugc.live.a.a.c.a aVar) {
        a<String> aVar2 = this.f154024b;
        if (aVar2 != null) {
            aVar2.a(cVar, aVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.a.a.c, java.lang.Object] */
    @Override // com.ss.ugc.live.a.a.a
    public final /* synthetic */ void a(c cVar, String str) {
        MethodCollector.i(7943);
        String str2 = str;
        try {
            String substring = str2.substring(0, str2.lastIndexOf("/"));
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str2)));
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                String name = nextEntry.getName();
                if (!name.contains("../")) {
                    if (nextEntry.isDirectory()) {
                        new File(substring + File.separator + name).mkdirs();
                    } else {
                        File file = new File(substring + File.separator + name);
                        if (file.exists()) {
                            d.a(file);
                        } else {
                            file.getParentFile().mkdirs();
                        }
                        file.createNewFile();
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                    }
                }
            }
            zipInputStream.close();
            a<String> aVar = this.f154024b;
            if (aVar != null) {
                aVar.a(cVar, substring);
            }
            a(new File(str2));
            MethodCollector.o(7943);
        } catch (Exception e2) {
            a(cVar, (com.ss.ugc.live.a.a.c.a) new com.ss.ugc.live.a.a.c.d("unzip exception", e2, cVar));
            if (0 != 0) {
                b.a(new File((String) null));
            }
            MethodCollector.o(7943);
        }
    }
}
