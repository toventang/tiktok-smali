package com.bytedance.b.b.a;

import com.bytedance.b.k.b.b;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private MappedByteBuffer f25905a;

    /* renamed from: b  reason: collision with root package name */
    private long f25906b;

    static {
        Covode.recordClassIndex(15113);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f25907a = new d();

        static {
            Covode.recordClassIndex(15114);
        }
    }

    public final long a() {
        if (this.f25905a == null) {
            try {
                File file = new File(b.a(), com.bytedance.b.e.a.a.d().replace(".", "_").replace(":", "-") + "_seq_num.txt");
                boolean exists = file.exists();
                if (!exists) {
                    file.createNewFile();
                }
                MappedByteBuffer map = new RandomAccessFile(file, "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0, 8);
                this.f25905a = map;
                if (!exists) {
                    map.putLong(0, 0);
                    return 0;
                }
            } catch (Throwable th) {
                b.a(a.f25847a, "prepare seq_number fail.", th);
            }
        }
        MappedByteBuffer mappedByteBuffer = this.f25905a;
        if (mappedByteBuffer != null) {
            long j2 = mappedByteBuffer.getLong(0) + 1;
            this.f25906b = j2;
            this.f25905a.putLong(0, j2);
            return this.f25906b;
        }
        long j3 = this.f25906b;
        this.f25906b = 1 + j3;
        return j3;
    }
}
