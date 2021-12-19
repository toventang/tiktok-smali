package ms.bd.o;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ms.bd.o.t;

public class r extends t.a {
    static {
        Covode.recordClassIndex(105946);
    }

    public r(w wVar, t.b bVar, long j2, int i2) {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (bVar.f159544a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j3 = j2 + ((long) (i2 * 8));
        wVar.a(allocate, j3, 4);
        this.f159542a = ((long) allocate.getInt()) & 4294967295L;
        wVar.a(allocate, j3 + 4, 4);
        this.f159543b = ((long) allocate.getInt()) & 4294967295L;
    }
}
