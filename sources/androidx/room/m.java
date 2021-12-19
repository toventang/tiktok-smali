package androidx.room;

import androidx.i.a.d;
import androidx.i.a.e;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public final class m implements d, e {

    /* renamed from: h  reason: collision with root package name */
    static final TreeMap<Integer, m> f4351h = new TreeMap<>();

    /* renamed from: a  reason: collision with root package name */
    final long[] f4352a;

    /* renamed from: b  reason: collision with root package name */
    final double[] f4353b;

    /* renamed from: c  reason: collision with root package name */
    final String[] f4354c;

    /* renamed from: d  reason: collision with root package name */
    final byte[][] f4355d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f4356e;

    /* renamed from: f  reason: collision with root package name */
    final int f4357f;

    /* renamed from: g  reason: collision with root package name */
    int f4358g;

    /* renamed from: i  reason: collision with root package name */
    private volatile String f4359i;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.i.a.e
    public final String b() {
        return this.f4359i;
    }

    static {
        Covode.recordClassIndex(1680);
    }

    public final void a() {
        TreeMap<Integer, m> treeMap = f4351h;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f4357f), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
        }
    }

    @Override // androidx.i.a.d
    public final void a(int i2) {
        this.f4356e[i2] = 1;
    }

    private m(int i2) {
        this.f4357f = i2;
        int i3 = i2 + 1;
        this.f4356e = new int[i3];
        this.f4352a = new long[i3];
        this.f4353b = new double[i3];
        this.f4354c = new String[i3];
        this.f4355d = new byte[i3][];
    }

    @Override // androidx.i.a.e
    public final void a(d dVar) {
        for (int i2 = 1; i2 <= this.f4358g; i2++) {
            int i3 = this.f4356e[i2];
            if (i3 == 1) {
                dVar.a(i2);
            } else if (i3 == 2) {
                dVar.a(i2, this.f4352a[i2]);
            } else if (i3 == 3) {
                dVar.a(i2, this.f4353b[i2]);
            } else if (i3 == 4) {
                dVar.a(i2, this.f4354c[i2]);
            } else if (i3 == 5) {
                dVar.a(i2, this.f4355d[i2]);
            }
        }
    }

    private void b(String str, int i2) {
        this.f4359i = str;
        this.f4358g = i2;
    }

    @Override // androidx.i.a.d
    public final void a(int i2, double d2) {
        this.f4356e[i2] = 3;
        this.f4353b[i2] = d2;
    }

    @Override // androidx.i.a.d
    public final void a(int i2, long j2) {
        this.f4356e[i2] = 2;
        this.f4352a[i2] = j2;
    }

    public static m a(String str, int i2) {
        TreeMap<Integer, m> treeMap = f4351h;
        synchronized (treeMap) {
            Map.Entry<Integer, m> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                m value = ceilingEntry.getValue();
                value.b(str, i2);
                return value;
            }
            m mVar = new m(i2);
            mVar.b(str, i2);
            return mVar;
        }
    }

    @Override // androidx.i.a.d
    public final void a(int i2, String str) {
        this.f4356e[i2] = 4;
        this.f4354c[i2] = str;
    }

    @Override // androidx.i.a.d
    public final void a(int i2, byte[] bArr) {
        this.f4356e[i2] = 5;
        this.f4355d[i2] = bArr;
    }
}
