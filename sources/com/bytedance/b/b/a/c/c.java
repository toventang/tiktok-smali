package com.bytedance.b.b.a.c;

import com.bytedance.apm.d.b;
import com.bytedance.b.b.a.a;
import com.bytedance.b.b.a.b;
import com.bytedance.b.b.a.c;
import com.bytedance.b.k.d;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final File f25899a;

    /* renamed from: b  reason: collision with root package name */
    private final long f25900b;

    /* renamed from: c  reason: collision with root package name */
    private ByteBuffer f25901c;

    /* renamed from: d  reason: collision with root package name */
    private FileLock f25902d;

    static {
        Covode.recordClassIndex(15110);
    }

    private int d() {
        return this.f25901c.getInt(10);
    }

    private int e() {
        return this.f25901c.getInt(14);
    }

    private void c() {
        this.f25901c.clear();
        this.f25901c.putShort(2082);
        this.f25901c.putLong(this.f25900b);
        this.f25901c.putInt(0);
        this.f25901c.putInt(0);
    }

    public final synchronized String[] b() {
        File[] listFiles = b.c().listFiles(new FileFilter() {
            /* class com.bytedance.b.b.a.c.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15111);
            }

            public final boolean accept(File file) {
                String name = file.getName();
                if (name.endsWith(".log")) {
                    return true;
                }
                if (name.endsWith(".txt")) {
                    return false;
                }
                com.bytedance.b.k.c.b(file);
                return false;
            }
        });
        if (listFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            arrayList.add(file.getName());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final synchronized void a() {
        boolean z = false;
        short s = this.f25901c.getShort(0);
        this.f25901c.getLong(2);
        int d2 = d();
        int e2 = e();
        if (s == 2082 && e2 > 0) {
            if (d2 > 0) {
                System.nanoTime();
                FileChannel fileChannel = null;
                try {
                    String str = System.currentTimeMillis() + "_" + UUID.randomUUID().toString();
                    try {
                        if (!this.f25899a.exists()) {
                            File parentFile = this.f25899a.getParentFile();
                            if (!parentFile.exists()) {
                                parentFile.mkdirs();
                            }
                            this.f25899a.mkdirs();
                        }
                    } catch (Throwable th) {
                        com.bytedance.b.k.b.b.a(a.f25847a, "flushDir create error.", th);
                    }
                    File file = new File(this.f25899a, str + ".txt");
                    if (file.exists()) {
                        com.bytedance.b.k.b.b.a(a.f25847a, "file is exist:" + file.getName());
                    }
                    fileChannel = new FileOutputStream(file, false).getChannel();
                    this.f25901c.position(e2 + 18);
                    this.f25901c.flip();
                    fileChannel.write(this.f25901c);
                    if (file.renameTo(new File(this.f25899a, str + ".log"))) {
                        z = true;
                    } else {
                        com.bytedance.b.k.b.b.a(a.f25847a, "rename error" + file.getAbsolutePath());
                    }
                    if (com.bytedance.b.e.a.a.r()) {
                        file.getAbsolutePath();
                    }
                } catch (Throwable unused) {
                }
                d.a(fileChannel);
                if (!z) {
                    this.f25901c.position(e() + 18);
                    this.f25901c.flip();
                    a a2 = a.a(this.f25901c);
                    com.bytedance.b.b.a.c cVar = c.a.f25892a;
                    if (a2 != null) {
                        cVar.f25884b.a(a2);
                    }
                }
                c();
                if (com.bytedance.b.e.a.a.r()) {
                    System.nanoTime();
                }
                return;
            }
        }
        c();
    }

    public final synchronized void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            String jSONObject2 = jSONObject.toString();
            if (com.bytedance.b.e.a.a.r()) {
                try {
                    b.a.f24903a.a("DATA_SAVE_TO_DB", new JSONObject(jSONObject.toString()));
                } catch (Exception unused) {
                }
            }
            byte[] bytes = jSONObject2.getBytes();
            int length = bytes.length + 4;
            if (length > 262144) {
                com.bytedance.b.h.a.a(new com.bytedance.b.h.b() {
                    /* class com.bytedance.b.b.a.c.c.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(15112);
                    }

                    @Override // com.bytedance.b.h.b
                    public final String a() {
                        return "service_monitor";
                    }

                    @Override // com.bytedance.b.h.b
                    public final boolean b() {
                        return true;
                    }

                    @Override // com.bytedance.b.h.b
                    public final JSONObject c() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("log_type", "service_monitor");
                            jSONObject.put("service", "apm_error");
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(StringSet.type, "large_data");
                            jSONObject.put("category", jSONObject2);
                            return jSONObject;
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                });
                return;
            }
            if (length > this.f25901c.remaining()) {
                a();
            }
            this.f25901c.putInt(bytes.length);
            this.f25901c.put(bytes);
            this.f25901c.putInt(10, d() + 1);
            this.f25901c.putInt(14, e() + length);
            if (com.bytedance.b.e.a.a.r()) {
                com.a.a("push success: totalCount=%s, totalBytes=%s, logItem=%s", new Object[]{Integer.valueOf(d()), Integer.valueOf(e()), jSONObject2});
            }
            if (this.f25901c.position() >= 262134 || d() >= 256) {
                a();
            }
        }
    }

    public c(long j2, File file, File file2) {
        this.f25899a = file2;
        this.f25900b = j2;
        try {
            FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
            this.f25902d = channel.tryLock();
            this.f25901c = channel.map(FileChannel.MapMode.READ_WRITE, 0, 262162);
            a();
        } catch (Throwable th) {
            com.bytedance.b.k.b.b.a(a.f25847a, "create MappedByteBuffer failed. will fallback into HeapByteBuffer", th);
        }
        if (this.f25901c == null) {
            this.f25901c = ByteBuffer.allocate(262162);
        }
        c();
    }
}
