package ms.bd.o;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ms.bd.o.t;

public class y extends t.c {
    static {
        Covode.recordClassIndex(105973);
    }

    public y(w wVar, t.b bVar, long j2) {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (bVar.f159544a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j3 = (j2 * ((long) bVar.f159547d)) + bVar.f159545b;
        wVar.a(allocate, j3, 4);
        this.f159550a = ((long) allocate.getInt()) & 4294967295L;
        wVar.a(allocate, 8 + j3, 8);
        this.f159551b = allocate.getLong();
        wVar.a(allocate, 16 + j3, 8);
        this.f159552c = allocate.getLong();
        wVar.a(allocate, j3 + 40, 8);
        this.f159553d = allocate.getLong();
    }
}
