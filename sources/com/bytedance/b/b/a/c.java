package com.bytedance.b.b.a;

import com.bytedance.b.b.a.c.a;
import com.bytedance.b.b.a.d.d;
import com.bytedance.b.b.a.e.d;
import com.bytedance.b.k.d.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    volatile long f25883a = 1048576;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.b.k.a.a<a> f25884b = new com.bytedance.b.k.a.a<>(10);

    /* renamed from: c  reason: collision with root package name */
    public volatile com.bytedance.b.b.a.c.c f25885c;

    /* renamed from: d  reason: collision with root package name */
    private volatile long f25886d = 60000;

    /* renamed from: e  reason: collision with root package name */
    private volatile com.bytedance.b.k.d.a f25887e;

    static {
        Covode.recordClassIndex(15102);
    }

    @Override // com.bytedance.b.b.a.e.d
    public final String c() {
        return "first_log_dir";
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f25892a = new c();

        static {
            Covode.recordClassIndex(15107);
        }
    }

    public final synchronized void a() {
        this.f25887e = new com.bytedance.b.k.d.a(this.f25886d) {
            /* class com.bytedance.b.b.a.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(15104);
            }

            public final void run() {
                c.this.b();
            }
        };
        b.a(com.bytedance.b.k.d.c.IO).a(this.f25887e);
        if (com.bytedance.b.e.a.a.c()) {
            b.a(com.bytedance.b.k.d.c.IO).a(new com.bytedance.b.k.d.a() {
                /* class com.bytedance.b.b.a.c.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(15105);
                }

                public final void run() {
                    File[] listFiles;
                    File file = new File(b.a(), "child_process_persistent");
                    if (file.exists() && (listFiles = file.listFiles()) != null) {
                        for (File file2 : listFiles) {
                            if (file2 != null && file2.exists() && file2.length() > 0) {
                                try {
                                    if (Long.parseLong(file2.getName().split("_")[0]) < com.bytedance.b.e.a.a.b()) {
                                        FileChannel fileChannel = null;
                                        try {
                                            fileChannel = new RandomAccessFile(file2, "rw").getChannel();
                                            FileLock tryLock = fileChannel.tryLock(0, Long.MAX_VALUE, false);
                                            if (tryLock != null && tryLock.isValid()) {
                                                File file3 = new File(b.c(), System.currentTimeMillis() + "_" + UUID.randomUUID().toString() + ".log");
                                                String absolutePath = file2.getAbsolutePath();
                                                String absolutePath2 = file3.getAbsolutePath();
                                                File file4 = new File(absolutePath);
                                                File file5 = new File(absolutePath2);
                                                if (file4.exists()) {
                                                    file4.renameTo(file5);
                                                }
                                                if (com.bytedance.b.e.a.a.r()) {
                                                    file2.getAbsolutePath();
                                                    file3.getAbsolutePath();
                                                }
                                                tryLock.release();
                                            }
                                        } catch (Throwable unused) {
                                        }
                                        com.bytedance.b.k.d.a(fileChannel);
                                    }
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // com.bytedance.b.b.a.e.d
    public final long d() {
        String[] b2 = this.f25885c.b();
        long j2 = 0;
        if (!(b2 == null || b2.length == 0)) {
            for (String str : b2) {
                j2 += new File(b.c(), str).length();
            }
        }
        return j2;
    }

    public final void b() {
        System.currentTimeMillis();
        try {
            if (this.f25885c != null) {
                this.f25885c.a();
            }
        } catch (Throwable th) {
            com.bytedance.b.k.b.b.a(a.f25847a, "flushBuffer", th);
        }
        if (!this.f25884b.f26314a.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (!this.f25884b.f26314a.isEmpty()) {
                arrayList.add(this.f25884b.f26314a.poll());
                T poll = this.f25884b.f26314a.poll();
                if (poll != null) {
                    int i3 = poll.f25895c;
                    if (i2 == 0 || ((long) (i2 + i3)) < this.f25883a) {
                        i2 += i3;
                        arrayList.add(poll);
                    } else {
                        d.a.f25948a.a(arrayList, 0);
                        arrayList.clear();
                        arrayList.add(poll);
                        i2 = i3;
                    }
                }
            }
            d.a.f25948a.a(arrayList, 0);
        }
        if (com.bytedance.b.e.a.a.c()) {
            e();
        }
        if (com.bytedance.b.e.a.a.r()) {
            System.currentTimeMillis();
        }
    }

    private void e() {
        if (this.f25885c != null) {
            String[] b2 = this.f25885c.b();
            if (!(b2 == null || b2.length == 0)) {
                List asList = Arrays.asList(b2);
                Collections.sort(asList, new Comparator<String>() {
                    /* class com.bytedance.b.b.a.c.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(15106);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // java.util.Comparator
                    public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
                        return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
                    }
                });
                if (com.bytedance.b.e.a.a.r()) {
                    asList.size();
                }
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                for (int i3 = 0; i3 < asList.size(); i3++) {
                    File file = new File(b.c(), (String) asList.get(i3));
                    if (file.exists()) {
                        a a2 = a.a(file);
                        if (a2 == null) {
                            a(file);
                        } else {
                            int i4 = a2.f25895c;
                            if (i2 == 0 || ((long) (i2 + i4)) < this.f25883a) {
                                i2 += i4;
                                arrayList.add(a2);
                            } else {
                                d.a.f25948a.a(arrayList, asList.size() - arrayList.size());
                                return;
                            }
                        }
                    }
                }
                d.a.f25948a.a(arrayList, 0);
                return;
            }
            return;
        }
        com.bytedance.b.k.b.b.a(a.f25847a, "persistentBuffer is null");
    }

    private static long b(File file) {
        String name = file.getName();
        int indexOf = name.indexOf("_");
        if (indexOf == -1) {
            return -1;
        }
        try {
            return Long.parseLong(name.substring(0, indexOf));
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.bytedance.b.b.a.e.d
    public final void b(long j2) {
        String[] b2;
        if (!(this.f25885c == null || (b2 = this.f25885c.b()) == null || b2.length == 0)) {
            for (String str : b2) {
                File file = new File(b.c(), str);
                long b3 = b(file);
                if (b3 == -1) {
                    com.bytedance.b.k.c.b(file);
                } else if (b3 <= j2) {
                    com.bytedance.b.k.c.b(file);
                }
            }
        }
    }

    private static boolean a(File file) {
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    public final synchronized void a(long j2) {
        com.bytedance.b.e.a.a.r();
        if (j2 > 0) {
            if (this.f25886d != j2) {
                this.f25886d = j2;
                if (this.f25887e != null) {
                    b.a(com.bytedance.b.k.d.c.IO).b(this.f25887e);
                    this.f25887e = new com.bytedance.b.k.d.a(this.f25886d, this.f25886d) {
                        /* class com.bytedance.b.b.a.c.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(15103);
                        }

                        public final void run() {
                            c.this.b();
                        }
                    };
                    b.a(com.bytedance.b.k.d.c.IO).a(this.f25887e);
                }
            }
        }
    }
}
