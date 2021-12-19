package ms.bd.o;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ms.bd.o.t;

public class z extends t.d {
    static {
        Covode.recordClassIndex(105976);
    }

    public z(w wVar, t.b bVar) {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (bVar.f159544a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        wVar.a(allocate, bVar.f159546c + ((long) (bVar.f159549f * 0)) + 28, 4);
        this.f159554a = ((long) allocate.getInt()) & 4294967295L;
    }
}
