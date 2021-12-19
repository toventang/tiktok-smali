package com.twitter.sdk.android.core.internal.scribe;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class r implements Closeable {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f156090c = Logger.getLogger(r.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final RandomAccessFile f156091a;

    /* renamed from: b  reason: collision with root package name */
    int f156092b;

    /* renamed from: d  reason: collision with root package name */
    private int f156093d;

    /* renamed from: e  reason: collision with root package name */
    private a f156094e;

    /* renamed from: f  reason: collision with root package name */
    private a f156095f;

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f156096g;

    public interface c {
        static {
            Covode.recordClassIndex(103697);
        }

        void a(InputStream inputStream, int i2);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final a f156100a = new a(0, 0);

        /* renamed from: b  reason: collision with root package name */
        final int f156101b;

        /* renamed from: c  reason: collision with root package name */
        final int f156102c;

        static {
            Covode.recordClassIndex(103695);
        }

        public final String toString() {
            return getClass().getSimpleName() + "[position = " + this.f156101b + ", length = " + this.f156102c + "]";
        }

        a(int i2, int i3) {
            this.f156101b = i2;
            this.f156102c = i3;
        }
    }

    static {
        Covode.recordClassIndex(103693);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        MethodCollector.i(13735);
        this.f156091a.close();
        MethodCollector.o(13735);
    }

    /* access modifiers changed from: package-private */
    public final class b extends InputStream {

        /* renamed from: b  reason: collision with root package name */
        private int f156104b;

        /* renamed from: c  reason: collision with root package name */
        private int f156105c;

        static {
            Covode.recordClassIndex(103696);
        }

        @Override // java.io.InputStream
        public final int read() {
            if (this.f156105c == 0) {
                return -1;
            }
            r.this.f156091a.seek((long) this.f156104b);
            int read = r.this.f156091a.read();
            this.f156104b = r.this.a(this.f156104b + 1);
            this.f156105c--;
            return read;
        }

        private b(a aVar) {
            MethodCollector.i(13204);
            this.f156104b = r.this.a(aVar.f156101b + 4);
            this.f156105c = aVar.f156102c;
            MethodCollector.o(13204);
        }

        /* synthetic */ b(r rVar, a aVar, byte b2) {
            this(aVar);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i2, int i3) {
            r.a(bArr, "buffer");
            if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i4 = this.f156105c;
            if (i4 <= 0) {
                return -1;
            }
            if (i3 > i4) {
                i3 = i4;
            }
            r rVar = r.this;
            int a2 = rVar.a(this.f156104b);
            if (a2 + i3 <= rVar.f156092b) {
                rVar.f156091a.seek((long) a2);
                rVar.f156091a.readFully(bArr, i2, i3);
            } else {
                int i5 = rVar.f156092b - a2;
                rVar.f156091a.seek((long) a2);
                rVar.f156091a.readFully(bArr, i2, i5);
                rVar.f156091a.seek(16);
                rVar.f156091a.readFully(bArr, i2 + i5, i3 - i5);
            }
            this.f156104b = r.this.a(this.f156104b + i3);
            this.f156105c -= i3;
            return i3;
        }
    }

    public final synchronized boolean b() {
        MethodCollector.i(13595);
        if (this.f156093d == 0) {
            MethodCollector.o(13595);
            return true;
        }
        MethodCollector.o(13595);
        return false;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName()).append('[');
        sb.append("fileLength=").append(this.f156092b);
        sb.append(", size=").append(this.f156093d);
        sb.append(", first=").append(this.f156094e);
        sb.append(", last=").append(this.f156095f);
        sb.append(", element lengths=[");
        try {
            a(new c() {
                /* class com.twitter.sdk.android.core.internal.scribe.r.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                boolean f156097a = true;

                static {
                    Covode.recordClassIndex(103694);
                }

                @Override // com.twitter.sdk.android.core.internal.scribe.r.c
                public final void a(InputStream inputStream, int i2) {
                    if (this.f156097a) {
                        this.f156097a = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i2);
                }
            });
        } catch (IOException e2) {
            f156090c.log(Level.WARNING, "read error", (Throwable) e2);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final int a() {
        if (this.f156093d == 0) {
            return 16;
        }
        if (this.f156095f.f156101b >= this.f156094e.f156101b) {
            return (this.f156095f.f156101b - this.f156094e.f156101b) + 4 + this.f156095f.f156102c + 16;
        }
        return (((this.f156095f.f156101b + 4) + this.f156095f.f156102c) + this.f156092b) - this.f156094e.f156101b;
    }

    private static RandomAccessFile a(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private a b(int i2) {
        if (i2 == 0) {
            return a.f156100a;
        }
        this.f156091a.seek((long) i2);
        return new a(i2, this.f156091a.readInt());
    }

    public r(File file) {
        MethodCollector.i(13531);
        byte[] bArr = new byte[16];
        this.f156096g = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile a2 = a(file2);
            try {
                a2.setLength(4096);
                a2.seek(0);
                byte[] bArr2 = new byte[16];
                a(bArr2, 4096, 0, 0, 0);
                a2.write(bArr2);
                a2.close();
                if (!file2.renameTo(file)) {
                    IOException iOException = new IOException("Rename failed!");
                    MethodCollector.o(13531);
                    throw iOException;
                }
            } catch (Throwable th) {
                a2.close();
                MethodCollector.o(13531);
                throw th;
            }
        }
        RandomAccessFile a3 = a(file);
        this.f156091a = a3;
        a3.seek(0);
        a3.readFully(bArr);
        int b2 = b(bArr, 0);
        this.f156092b = b2;
        if (((long) b2) <= a3.length()) {
            this.f156093d = b(bArr, 4);
            int b3 = b(bArr, 8);
            int b4 = b(bArr, 12);
            this.f156094e = b(b3);
            this.f156095f = b(b4);
            MethodCollector.o(13531);
            return;
        }
        IOException iOException2 = new IOException("File is truncated. Expected length: " + this.f156092b + ", Actual length: " + a3.length());
        MethodCollector.o(13531);
        throw iOException2;
    }

    private void c(int i2) {
        int i3 = i2 + 4;
        int a2 = this.f156092b - a();
        if (a2 < i3) {
            int i4 = this.f156092b;
            do {
                a2 += i4;
                i4 <<= 1;
            } while (a2 < i3);
            this.f156091a.setLength((long) i4);
            this.f156091a.getChannel().force(true);
            int a3 = a(this.f156095f.f156101b + 4 + this.f156095f.f156102c);
            if (a3 < this.f156094e.f156101b) {
                FileChannel channel = this.f156091a.getChannel();
                channel.position((long) this.f156092b);
                long j2 = (long) (a3 - 4);
                if (channel.transferTo(16, j2, channel) != j2) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            if (this.f156095f.f156101b < this.f156094e.f156101b) {
                int i5 = (this.f156092b + this.f156095f.f156101b) - 16;
                a(i4, this.f156093d, this.f156094e.f156101b, i5);
                this.f156095f = new a(i5, this.f156095f.f156102c);
            } else {
                a(i4, this.f156093d, this.f156094e.f156101b, this.f156095f.f156101b);
            }
            this.f156092b = i4;
        }
    }

    public final int a(int i2) {
        int i3 = this.f156092b;
        if (i2 < i3) {
            return i2;
        }
        return (i2 + 16) - i3;
    }

    public final synchronized void a(c cVar) {
        MethodCollector.i(13669);
        int i2 = this.f156094e.f156101b;
        for (int i3 = 0; i3 < this.f156093d; i3++) {
            a b2 = b(i2);
            cVar.a(new b(this, b2, (byte) 0), b2.f156102c);
            i2 = a(b2.f156101b + 4 + b2.f156102c);
        }
        MethodCollector.o(13669);
    }

    public static <T> T a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    private static void a(byte[] bArr, int... iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            a(bArr, i2, iArr[i3]);
            i2 += 4;
        }
    }

    private static int b(byte[] bArr, int i2) {
        return ((bArr[i2] & 255) << 24) + ((bArr[i2 + 1] & 255) << 16) + ((bArr[i2 + 2] & 255) << 8) + (bArr[i2 + 3] & 255);
    }

    public final synchronized void a(byte[] bArr, int i2) {
        int i3;
        int i4;
        MethodCollector.i(13594);
        a(bArr, "buffer");
        if ((i2 | 0) < 0 || i2 > bArr.length - 0) {
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
            MethodCollector.o(13594);
            throw indexOutOfBoundsException;
        }
        c(i2);
        boolean b2 = b();
        if (b2) {
            i3 = 16;
        } else {
            i3 = a(this.f156095f.f156101b + 4 + this.f156095f.f156102c);
        }
        a aVar = new a(i3, i2);
        a(this.f156096g, 0, i2);
        a(aVar.f156101b, this.f156096g, 4);
        a(aVar.f156101b + 4, bArr, i2);
        if (b2) {
            i4 = aVar.f156101b;
        } else {
            i4 = this.f156094e.f156101b;
        }
        a(this.f156092b, this.f156093d + 1, i4, aVar.f156101b);
        this.f156095f = aVar;
        this.f156093d++;
        if (b2) {
            this.f156094e = aVar;
        }
        MethodCollector.o(13594);
    }

    private static void a(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    private void a(int i2, byte[] bArr, int i3) {
        int a2 = a(i2);
        int i4 = a2 + i3;
        int i5 = this.f156092b;
        if (i4 <= i5) {
            this.f156091a.seek((long) a2);
            this.f156091a.write(bArr, 0, i3);
            return;
        }
        int i6 = i5 - a2;
        this.f156091a.seek((long) a2);
        this.f156091a.write(bArr, 0, i6);
        this.f156091a.seek(16);
        this.f156091a.write(bArr, i6 + 0, i3 - i6);
    }

    private void a(int i2, int i3, int i4, int i5) {
        a(this.f156096g, i2, i3, i4, i5);
        this.f156091a.seek(0);
        this.f156091a.write(this.f156096g);
    }
}
