package ms.bd.o;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ms.bd.o.t;

public class s extends t.a {
    static {
        Covode.recordClassIndex(105950);
    }

    public s(w wVar, t.b bVar, long j2, int i2) {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (bVar.f159544a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j3 = j2 + ((long) (i2 * 16));
        wVar.a(allocate, j3, 8);
        this.f159542a = allocate.getLong();
        wVar.a(allocate, j3 + 8, 8);
        this.f159543b = allocate.getLong();
    }
}
