package androidx.i.a;

import com.bytedance.covode.number.Covode;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    private final String f3193a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f3194b;

    static {
        Covode.recordClassIndex(1141);
    }

    @Override // androidx.i.a.e
    public final String b() {
        return this.f3193a;
    }

    private a(String str) {
        this.f3193a = str;
        this.f3194b = null;
    }

    @Override // androidx.i.a.e
    public final void a(d dVar) {
        long j2;
        Object[] objArr = this.f3194b;
        if (objArr != null) {
            int length = objArr.length;
            int i2 = 0;
            while (i2 < length) {
                Object obj = objArr[i2];
                i2++;
                if (obj == null) {
                    dVar.a(i2);
                } else if (obj instanceof byte[]) {
                    dVar.a(i2, (byte[]) obj);
                } else if (obj instanceof Float) {
                    dVar.a(i2, (double) ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    dVar.a(i2, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    dVar.a(i2, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    dVar.a(i2, (long) ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    dVar.a(i2, (long) ((Short) obj).shortValue());
                } else if (obj instanceof Byte) {
                    dVar.a(i2, (long) ((Byte) obj).byteValue());
                } else if (obj instanceof String) {
                    dVar.a(i2, (String) obj);
                } else if (obj instanceof Boolean) {
                    if (((Boolean) obj).booleanValue()) {
                        j2 = 1;
                    } else {
                        j2 = 0;
                    }
                    dVar.a(i2, j2);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i2 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                }
            }
        }
    }

    public a(String str, byte b2) {
        this(str);
    }
}
