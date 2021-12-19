package ms.bd.o;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ms.bd.o.t;

public class w implements Closeable, t {

    /* renamed from: a  reason: collision with root package name */
    private final FileChannel f159561a;

    static {
        Covode.recordClassIndex(105967);
    }

    public w(File file) {
        MethodCollector.i(8625);
        if (file == null || !file.exists()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("File is null or does not exist");
            MethodCollector.o(8625);
            throw illegalArgumentException;
        }
        this.f159561a = new FileInputStream(file).getChannel();
        MethodCollector.o(8625);
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer, long j2, int i2) {
        byteBuffer.position(0);
        byteBuffer.limit(i2);
        long j3 = 0;
        while (j3 < ((long) i2)) {
            int read = this.f159561a.read(byteBuffer, j2 + j3);
            if (read != -1) {
                j3 += (long) read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f159561a.close();
    }

    public final List<String> a() {
        boolean z;
        t.b vVar;
        ByteOrder byteOrder;
        t.a a2;
        this.f159561a.position(0L);
        ArrayList arrayList = new ArrayList();
        this.f159561a.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        a(allocate, 0, 4);
        if ((((long) allocate.getInt()) & 4294967295L) == 1179403647) {
            a(allocate, 4, 1);
            short s = (short) (allocate.get() & 255);
            a(allocate, 5, 1);
            if (((short) (allocate.get() & 255)) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (s == 1) {
                vVar = new u(z, this);
            } else if (s == 2) {
                vVar = new v(z, this);
            } else {
                throw new IllegalStateException("Invalid class type!");
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(8);
            if (vVar.f159544a) {
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            allocate2.order(byteOrder);
            long j2 = (long) vVar.f159548e;
            if (j2 == 65535) {
                j2 = vVar.a().f159554a;
            }
            long j3 = 0;
            while (true) {
                if (j3 >= j2) {
                    break;
                }
                t.c a3 = vVar.a(j3);
                if (a3.f159550a == 2) {
                    long j4 = a3.f159551b;
                    if (j4 != 0) {
                        ArrayList<Long> arrayList2 = new ArrayList();
                        long j5 = 0;
                        int i2 = 0;
                        do {
                            a2 = vVar.a(j4, i2);
                            long j6 = a2.f159542a;
                            if (j6 == 1) {
                                arrayList2.add(Long.valueOf(a2.f159543b));
                            } else if (j6 == 5) {
                                j5 = a2.f159543b;
                            }
                            i2++;
                        } while (a2.f159542a != 0);
                        if (j5 != 0) {
                            for (long j7 = 0; j7 < j2; j7++) {
                                t.c a4 = vVar.a(j7);
                                if (a4.f159550a == 1) {
                                    long j8 = a4.f159552c;
                                    if (j8 <= j5 && j5 <= a4.f159553d + j8) {
                                        long j9 = (j5 - j8) + a4.f159551b;
                                        for (Long l2 : arrayList2) {
                                            long longValue = l2.longValue() + j9;
                                            StringBuilder sb = new StringBuilder();
                                            while (true) {
                                                long j10 = longValue + 1;
                                                a(allocate2, longValue, 1);
                                                short s2 = (short) (allocate2.get() & 255);
                                                if (s2 == 0) {
                                                    break;
                                                }
                                                sb.append((char) s2);
                                                longValue = j10;
                                            }
                                            arrayList.add(sb.toString());
                                        }
                                        return arrayList;
                                    }
                                }
                            }
                            throw new IllegalStateException("Could not map vma to file offset!");
                        }
                        throw new IllegalStateException("String table offset not found!");
                    }
                } else {
                    j3++;
                }
            }
            return Collections.unmodifiableList(arrayList);
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }
}
