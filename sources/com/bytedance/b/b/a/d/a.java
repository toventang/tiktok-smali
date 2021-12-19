package com.bytedance.b.b.a.d;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.b.k.c;
import com.bytedance.b.k.f;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f25908a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f25909b;

    /* renamed from: c  reason: collision with root package name */
    private File f25910c;

    /* renamed from: d  reason: collision with root package name */
    private ConcurrentHashMap<String, b> f25911d;

    /* renamed from: e  reason: collision with root package name */
    private long f25912e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f25913f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<String> f25914g;

    static {
        Covode.recordClassIndex(15115);
    }

    /* access modifiers changed from: package-private */
    public final File a() {
        c();
        return this.f25910c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.b.b.a.d.a$a  reason: collision with other inner class name */
    public static class C0553a {

        /* renamed from: a  reason: collision with root package name */
        public static a f25916a = new a((byte) 0);

        static {
            Covode.recordClassIndex(15117);
        }
    }

    /* access modifiers changed from: package-private */
    public final File[] b() {
        c();
        File file = this.f25910c;
        if (file == null) {
            return null;
        }
        return file.listFiles();
    }

    private a() {
        this.f25911d = new ConcurrentHashMap<>();
        this.f25912e = 0;
        this.f25913f = false;
        this.f25914g = new ArrayList<>();
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f25917a;

        /* renamed from: b  reason: collision with root package name */
        public long f25918b;

        static {
            Covode.recordClassIndex(15118);
        }

        public final String a() {
            return this.f25917a + "_" + this.f25918b;
        }

        public static b a(String str) {
            try {
                String[] split = str.split("_");
                return new b(Integer.parseInt(split[0]), Long.parseLong(split[1]));
            } catch (Exception unused) {
                return null;
            }
        }

        public b(int i2, long j2) {
            this.f25917a = i2;
            this.f25918b = j2;
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, long j2) {
            this.f25917a = i2;
            this.f25918b = j2;
        }
    }

    private synchronized void c() {
        if (!this.f25909b) {
            File file = new File(com.bytedance.b.b.a.b.a(), "log");
            if (!file.exists()) {
                file.mkdirs();
            }
            this.f25910c = file;
            this.f25908a = d.a(com.bytedance.b.k.a.f26313g, "log_report_message", 0);
            this.f25909b = true;
        }
    }

    private synchronized void d() {
        int i2 = 0;
        if (!this.f25913f) {
            String[] list = C0553a.f25916a.a().list();
            int length = list.length;
            while (i2 < length) {
                String str = list[i2];
                if (!this.f25914g.contains(str)) {
                    b(str);
                }
                i2++;
            }
            this.f25913f = true;
            return;
        }
        if (this.f25912e > 0 && this.f25914g.size() == 0) {
            String[] list2 = C0553a.f25916a.a().list();
            int length2 = list2.length;
            while (i2 < length2) {
                String str2 = list2[i2];
                if (!this.f25914g.contains(str2)) {
                    b(str2);
                }
                i2++;
            }
            this.f25912e -= (long) this.f25914g.size();
        }
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    private void b(String str) {
        if (((long) this.f25914g.size()) > 5000) {
            this.f25912e++;
        } else {
            this.f25914g.add(str);
        }
    }

    static long c(File file) {
        try {
            String[] split = file.getName().split("_");
            if (split.length != 2) {
                return -1;
            }
            return Long.parseLong(split[0]);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(File file) {
        if (file != null) {
            this.f25914g.remove(file.getName());
            c();
            c.b(file);
            this.f25911d.remove(file.getName());
            SharedPreferences.Editor edit = this.f25908a.edit();
            edit.remove(file.getName());
            edit.commit();
        }
    }

    /* access modifiers changed from: package-private */
    public final b b(File file) {
        b bVar = null;
        if (file == null) {
            return null;
        }
        c();
        String name = file.getName();
        if (this.f25911d.containsKey(name)) {
            return this.f25911d.get(name);
        }
        if (this.f25908a.contains(name)) {
            String string = this.f25908a.getString(name, "");
            if (!TextUtils.isEmpty(string) && (bVar = b.a(string)) != null) {
                this.f25911d.put(name, bVar);
            }
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public final synchronized File a(String str) {
        File file;
        String concat = ".".concat(String.valueOf(str));
        d();
        File file2 = null;
        if (this.f25914g.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f25914g.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.endsWith(concat)) {
                arrayList.add(next);
            }
        }
        if (f.a(arrayList)) {
            return null;
        }
        Collections.sort(arrayList, new Comparator<String>() {
            /* class com.bytedance.b.b.a.d.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15116);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
                return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
            }
        });
        Iterator it2 = arrayList.iterator();
        b bVar = null;
        while (true) {
            if (it2.hasNext()) {
                file = new File(C0553a.f25916a.a(), (String) it2.next());
                b b2 = b(file);
                if (b2 == null) {
                    break;
                }
                if (com.bytedance.b.e.a.a.r()) {
                    file.getName();
                    System.currentTimeMillis();
                }
                if (b2.f25917a == 0 || b2.f25918b < System.currentTimeMillis()) {
                    break;
                } else if (bVar == null || bVar.f25918b > b2.f25918b) {
                    bVar = b2;
                    file2 = file;
                }
            } else {
                break;
            }
        }
        file2 = file;
        return file2;
    }

    /* access modifiers changed from: package-private */
    public final void a(File file, int i2, long j2) {
        b bVar;
        if (file != null) {
            try {
                c();
                SharedPreferences.Editor edit = this.f25908a.edit();
                String name = file.getName();
                if (this.f25911d.containsKey(name)) {
                    bVar = this.f25911d.get(name);
                } else {
                    bVar = new b(i2, j2);
                    this.f25911d.put(name, bVar);
                }
                bVar.a(i2, j2);
                edit.putString(name, bVar.a());
                edit.commit();
            } catch (Throwable th) {
                com.bytedance.b.k.b.b.a(com.bytedance.b.b.a.a.f25847a, "updateRetryMessage", th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean a(byte[] bArr, String str, int i2, long j2) {
        c();
        if (this.f25910c == null) {
            return false;
        }
        String a2 = com.a.a("%d%s%s%s%s", new Object[]{Long.valueOf(System.currentTimeMillis()), "_", UUID.randomUUID().toString(), ".", str});
        File file = new File(this.f25910c, a2);
        FileChannel fileChannel = null;
        try {
            a(file, i2, j2);
            fileChannel = new FileOutputStream(file).getChannel();
            fileChannel.write(ByteBuffer.wrap(bArr));
            if (!this.f25914g.contains(a2)) {
                b(a2);
            }
            if (com.bytedance.b.e.a.a.r()) {
                file.getName();
            }
            return true;
        } catch (Throwable th) {
            com.bytedance.b.k.b.b.a(com.bytedance.b.b.a.a.f25847a, "saveFile", th);
            return false;
        } finally {
            com.bytedance.b.k.d.a(fileChannel);
        }
    }
}
