package com.bytedance.android.livesdk.chatroom.g;

import android.content.Context;
import android.os.Environment;
import com.bytedance.android.live.core.a.a.a;
import com.bytedance.common.utility.d.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import f.a.d.f;
import f.a.d.g;
import f.a.t;
import f.a.x;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Map;

public class n {

    /* renamed from: a  reason: collision with root package name */
    private static volatile n f15554a;

    /* renamed from: b  reason: collision with root package name */
    private a f15555b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Object> f15556c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15557d = 100;

    static {
        Covode.recordClassIndex(8599);
    }

    private static File b(Context context) {
        if (d.f107193a != null && d.f107197e) {
            return d.f107193a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        d.f107193a = externalCacheDir;
        return externalCacheDir;
    }

    public final t<Long> a(String str) {
        return t.b(str).a((g) new g<String, x<Long>>() {
            /* class com.bytedance.android.livesdk.chatroom.g.n.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8600);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.g
            public final /* synthetic */ x<Long> apply(String str) {
                return t.b(Long.valueOf(n.this.b(str)));
            }
        }, false).b(f.a.h.a.b(f.a.k.a.f158006c));
    }

    public static n a(Context context) {
        MethodCollector.i(11437);
        if (f15554a == null) {
            synchronized (n.class) {
                try {
                    if (f15554a == null) {
                        f15554a = new n(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11437);
                    throw th;
                }
            }
        }
        n nVar = f15554a;
        MethodCollector.o(11437);
        return nVar;
    }

    public final synchronized long b(String str) {
        Throwable th;
        MethodCollector.i(11619);
        long j2 = 0;
        if (this.f15555b == null) {
            MethodCollector.o(11619);
            return 0;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedInputStream bufferedInputStream = null;
        try {
            a.c a2 = this.f15555b.a(str);
            if (a2 == null) {
                b.a((Closeable) null);
                b.a(byteArrayOutputStream);
                MethodCollector.o(11619);
                return 0;
            }
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(a2.f8884a[0]);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.put(byteArray);
                allocate.flip();
                j2 = allocate.getLong();
                b.a(bufferedInputStream2);
            } catch (Exception unused) {
                bufferedInputStream = bufferedInputStream2;
                b.a(bufferedInputStream);
                b.a(byteArrayOutputStream);
                MethodCollector.o(11619);
                return j2;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                b.a(bufferedInputStream);
                b.a(byteArrayOutputStream);
                MethodCollector.o(11619);
                throw th;
            }
            b.a(byteArrayOutputStream);
            MethodCollector.o(11619);
            return j2;
        } catch (Exception unused2) {
            b.a(bufferedInputStream);
            b.a(byteArrayOutputStream);
            MethodCollector.o(11619);
            return j2;
        } catch (Throwable th3) {
            th = th3;
            b.a(bufferedInputStream);
            b.a(byteArrayOutputStream);
            MethodCollector.o(11619);
            throw th;
        }
    }

    private n(Context context) {
        File file;
        try {
            a aVar = this.f15555b;
            if (aVar != null) {
                aVar.close();
                this.f15555b = null;
            }
            if (("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) && b(context) != null) {
                file = b(context);
            } else {
                if (d.f107194b == null || !d.f107197e) {
                    d.f107194b = context.getCacheDir();
                }
                file = d.f107194b;
            }
            a a2 = a.a(new File(file.getPath() + File.separator + "shareClikedCache"));
            this.f15555b = a2;
            Map<String, Object> map = (Map) com.bytedance.common.utility.reflect.a.a(a2, "lruEntries");
            this.f15556c = map;
            if (map != null) {
                com.bytedance.android.live.core.c.a.a(6, "yyy", "entries: " + this.f15556c.size());
            }
        } catch (IOException unused) {
        }
    }

    public final void a(final String str, final long j2) {
        t.b(Long.valueOf(j2)).a((g) new g<Long, t<byte[]>>() {
            /* class com.bytedance.android.livesdk.chatroom.g.n.AnonymousClass3 */

            static {
                Covode.recordClassIndex(8602);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.g
            public final /* synthetic */ t<byte[]> apply(Long l2) {
                long longValue = l2.longValue();
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.putLong(longValue);
                return t.a(allocate.array());
            }
        }, false).b((f) new o(this, str)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new f<byte[]>() {
            /* class com.bytedance.android.livesdk.chatroom.g.n.AnonymousClass2 */

            static {
                Covode.recordClassIndex(8601);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(byte[] bArr) {
                com.bytedance.android.live.core.c.a.a("entries key = " + str + ",value = " + j2);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str, byte[] bArr) {
        MethodCollector.i(11440);
        a aVar = this.f15555b;
        if (aVar == null) {
            MethodCollector.o(11440);
            return;
        }
        OutputStream outputStream = null;
        try {
            a.C0132a b2 = aVar.b(str);
            OutputStream a2 = b2.a();
            a2.write(bArr);
            a2.flush();
            if (b2.f8874c) {
                a.this.a(b2, false);
                a.this.c(b2.f8872a.f8878a);
            } else {
                a.this.a(b2, true);
            }
            b2.f8875d = true;
            try {
                a2.close();
                MethodCollector.o(11440);
            } catch (IOException unused) {
                MethodCollector.o(11440);
            }
        } catch (Exception unused2) {
            if (0 != 0) {
                try {
                    outputStream.close();
                } catch (IOException unused3) {
                    MethodCollector.o(11440);
                    return;
                }
            }
            MethodCollector.o(11440);
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    outputStream.close();
                } catch (IOException unused4) {
                }
            }
            MethodCollector.o(11440);
            throw th;
        }
    }
}
