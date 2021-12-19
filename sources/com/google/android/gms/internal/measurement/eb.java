package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class eb<K, V> extends dp<K, V> {

    /* renamed from: a  reason: collision with root package name */
    static final dp<Object, Object> f50798a = new eb(null, new Object[0], 0);

    /* renamed from: b  reason: collision with root package name */
    private final transient Object f50799b;

    /* renamed from: c  reason: collision with root package name */
    private final transient Object[] f50800c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f50801d;

    public final int size() {
        return this.f50801d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dp
    public final dt<Map.Entry<K, V>> a() {
        return new ee(this, this.f50800c, this.f50801d);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dp
    public final dt<K> b() {
        return new eg(this, new ef(this.f50800c, 0, this.f50801d));
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dp
    public final dm<V> c() {
        return new ef(this.f50800c, 1, this.f50801d);
    }

    static {
        Covode.recordClassIndex(31749);
    }

    @Override // java.util.Map, com.google.android.gms.internal.measurement.dp
    public final V get(Object obj) {
        Object obj2 = this.f50799b;
        Object[] objArr = this.f50800c;
        int i2 = this.f50801d;
        if (obj == null) {
            return null;
        }
        if (i2 == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
            return null;
        } else if (obj2 == null) {
            return null;
        } else {
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length - 1;
                int a2 = dj.a(obj.hashCode());
                while (true) {
                    int i3 = a2 & length;
                    int i4 = bArr[i3] & 255;
                    if (i4 == 255) {
                        return null;
                    }
                    if (objArr[i4].equals(obj)) {
                        return (V) objArr[i4 ^ 1];
                    }
                    a2 = i3 + 1;
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr = (short[]) obj2;
                int length2 = sArr.length - 1;
                int a3 = dj.a(obj.hashCode());
                while (true) {
                    int i5 = a3 & length2;
                    int i6 = sArr[i5] & 65535;
                    if (i6 == 65535) {
                        return null;
                    }
                    if (objArr[i6].equals(obj)) {
                        return (V) objArr[i6 ^ 1];
                    }
                    a3 = i5 + 1;
                }
            } else {
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length - 1;
                int a4 = dj.a(obj.hashCode());
                while (true) {
                    int i7 = a4 & length3;
                    int i8 = iArr[i7];
                    if (i8 == -1) {
                        return null;
                    }
                    if (objArr[i8].equals(obj)) {
                        return (V) objArr[i8 ^ 1];
                    }
                    a4 = i7 + 1;
                }
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:55:0x002b */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: short[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: byte[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int[]] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        r6[r2] = (byte) r5;
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        r6[r2] = (short) r5;
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        r6[r2] = r5;
        r7 = r7 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> com.google.android.gms.internal.measurement.eb<K, V> a(int r10, java.lang.Object[] r11) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.eb.a(int, java.lang.Object[]):com.google.android.gms.internal.measurement.eb");
    }

    private eb(Object obj, Object[] objArr, int i2) {
        this.f50799b = obj;
        this.f50800c = objArr;
        this.f50801d = i2;
    }

    private static IllegalArgumentException a(Object obj, Object obj2, Object[] objArr, int i2) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i2]);
        String valueOf4 = String.valueOf(objArr[i2 ^ 1]);
        return new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length()).append("Multiple entries with same key: ").append(valueOf).append("=").append(valueOf2).append(" and ").append(valueOf3).append("=").append(valueOf4).toString());
    }
}
