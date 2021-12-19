package com.ss.ugc.live.a.a.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.ugc.live.a.a.a;
import com.ss.ugc.live.a.a.b.b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

public final class c implements d<String> {

    /* renamed from: a  reason: collision with root package name */
    public a<String> f154014a;

    /* renamed from: b  reason: collision with root package name */
    private b f154015b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.ugc.live.a.a.a.b f154016c;

    static {
        Covode.recordClassIndex(102712);
    }

    public final String a(com.ss.ugc.live.a.a.c cVar) {
        String a2 = com.ss.ugc.live.a.a.e.b.a(this.f154016c.a(cVar));
        File file = new File(a2);
        if (file.exists() || file.mkdirs()) {
            return a2 + com.ss.ugc.live.a.a.e.a.a(cVar.f154006c[0]);
        }
        throw new IOException("mkdirs return false, dir=".concat(String.valueOf(file)));
    }

    public c(b bVar, com.ss.ugc.live.a.a.a.b bVar2) {
        this.f154015b = bVar;
        this.f154016c = bVar2;
    }

    @Override // com.ss.ugc.live.a.a.d.d
    public final void a(final com.ss.ugc.live.a.a.c cVar, a<String> aVar) {
        this.f154014a = aVar;
        final com.ss.ugc.live.a.a.b.a aVar2 = new com.ss.ugc.live.a.a.b.a(cVar.a());
        try {
            File b2 = com.ss.ugc.live.a.a.e.b.b(a(cVar));
            if (b2.exists()) {
                aVar2.f153999b = b2.length();
            }
        } catch (Exception unused) {
        }
        this.f154015b.a(aVar2, new b.a() {
            /* class com.ss.ugc.live.a.a.d.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(102713);
            }

            private static boolean a(File file) {
                MethodCollector.i(6458);
                try {
                    e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                    if (e.a(file.getAbsolutePath(), cVar)) {
                        e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                    }
                    if (e.c(file.getAbsolutePath(), cVar)) {
                        e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                        MethodCollector.o(6458);
                        return false;
                    }
                } catch (Throwable unused) {
                }
                boolean delete = file.delete();
                MethodCollector.o(6458);
                return delete;
            }

            @Override // com.ss.ugc.live.a.a.b.b.a
            public final void a(Throwable th, int i2) {
                if (i2 == 416) {
                    try {
                        File b2 = com.ss.ugc.live.a.a.e.b.b(c.this.a(cVar));
                        if (b2.exists()) {
                            a(b2);
                        }
                    } catch (Exception unused) {
                    }
                }
                c.this.f154014a.a(cVar, new com.ss.ugc.live.a.a.c.c("download failed", th, cVar, i2, aVar2));
            }

            @Override // com.ss.ugc.live.a.a.b.b.a
            public final void a(InputStream inputStream, long j2) {
                Throwable th;
                int i2;
                MethodCollector.i(6450);
                try {
                    String a2 = c.this.a(cVar);
                    File b2 = com.ss.ugc.live.a.a.e.b.b(a2);
                    c cVar = c.this;
                    com.ss.ugc.live.a.a.c cVar2 = cVar;
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(b2, "rw");
                        try {
                            long length = randomAccessFile.length();
                            if (length > 0) {
                                randomAccessFile.seek(length);
                            }
                            byte[] bArr = new byte[2048];
                            long j3 = length + j2;
                            int i3 = 0;
                            int i4 = 0;
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read >= 0) {
                                    randomAccessFile.write(bArr, i3, read);
                                    length += (long) read;
                                    if (j3 > 0) {
                                        i2 = (int) ((100 * length) / j3);
                                    } else {
                                        double d2 = (double) (-length);
                                        Double.isNaN(d2);
                                        i2 = (int) (100.0d * (1.0d - Math.exp(d2 / 50000.0d)));
                                    }
                                    if (i2 != i4) {
                                        cVar.f154014a.a(cVar2, i2);
                                        i4 = i2;
                                    }
                                    i3 = 0;
                                } else {
                                    try {
                                        break;
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                            }
                            randomAccessFile.close();
                            inputStream.close();
                            if (b2.renameTo(new File(a2))) {
                                c.this.f154014a.a(cVar, a2);
                                MethodCollector.o(6450);
                                return;
                            }
                            a(b2);
                            Exception exc = new Exception("rename file failed");
                            MethodCollector.o(6450);
                            throw exc;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                randomAccessFile.close();
                                inputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                            MethodCollector.o(6450);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        MethodCollector.o(6450);
                        throw th;
                    }
                } catch (Exception e4) {
                    c.this.f154014a.a(cVar, new com.ss.ugc.live.a.a.c.e("write storage failed.", e4, cVar));
                    MethodCollector.o(6450);
                }
            }
        });
    }
}
