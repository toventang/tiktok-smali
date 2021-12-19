package ms.bd.o;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ms.bd.o.t;

public class u extends t.b {

    /* renamed from: g  reason: collision with root package name */
    private final w f159557g;

    static {
        Covode.recordClassIndex(105961);
    }

    @Override // ms.bd.o.t.b
    public final t.a a(long j2, int i2) {
        return new r(this.f159557g, this, j2, i2);
    }

    @Override // ms.bd.o.t.b
    public final t.c a(long j2) {
        return new x(this.f159557g, this, j2);
    }

    @Override // ms.bd.o.t.b
    public final t.d a() {
        return new z(this.f159557g, this);
    }

    public u(boolean z, w wVar) {
        ByteOrder byteOrder;
        this.f159544a = z;
        this.f159557g = wVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        wVar.a(allocate, 16, 2);
        allocate.getShort();
        wVar.a(allocate, 28, 4);
        this.f159545b = ((long) allocate.getInt()) & 4294967295L;
        wVar.a(allocate, 32, 4);
        this.f159546c = ((long) allocate.getInt()) & 4294967295L;
        wVar.a(allocate, 42, 2);
        this.f159547d = allocate.getShort() & 65535;
        wVar.a(allocate, 44, 2);
        this.f159548e = allocate.getShort() & 65535;
        wVar.a(allocate, 46, 2);
        this.f159549f = allocate.getShort() & 65535;
        wVar.a(allocate, 48, 2);
        allocate.getShort();
        wVar.a(allocate, 50, 2);
        allocate.getShort();
    }
}
