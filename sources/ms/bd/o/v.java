package ms.bd.o;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ms.bd.o.t;

public class v extends t.b {

    /* renamed from: g  reason: collision with root package name */
    private final w f159559g;

    static {
        Covode.recordClassIndex(105964);
    }

    @Override // ms.bd.o.t.b
    public final t.a a(long j2, int i2) {
        return new s(this.f159559g, this, j2, i2);
    }

    @Override // ms.bd.o.t.b
    public final t.c a(long j2) {
        return new y(this.f159559g, this, j2);
    }

    @Override // ms.bd.o.t.b
    public final t.d a() {
        return new a0(this.f159559g, this);
    }

    public v(boolean z, w wVar) {
        ByteOrder byteOrder;
        this.f159544a = z;
        this.f159559g = wVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        wVar.a(allocate, 16, 2);
        allocate.getShort();
        wVar.a(allocate, 32, 8);
        this.f159545b = allocate.getLong();
        wVar.a(allocate, 40, 8);
        this.f159546c = allocate.getLong();
        wVar.a(allocate, 54, 2);
        this.f159547d = allocate.getShort() & 65535;
        wVar.a(allocate, 56, 2);
        this.f159548e = allocate.getShort() & 65535;
        wVar.a(allocate, 58, 2);
        this.f159549f = allocate.getShort() & 65535;
        wVar.a(allocate, 60, 2);
        allocate.getShort();
        wVar.a(allocate, 62, 2);
        allocate.getShort();
    }
}
