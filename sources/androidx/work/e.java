package androidx.work;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f4499a = new a().a();

    /* renamed from: c  reason: collision with root package name */
    private static final String f4500c = g.a("Data");

    /* renamed from: b  reason: collision with root package name */
    public Map<String, Object> f4501b;

    e() {
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Map<String, Object> f4502a = new HashMap();

        static {
            Covode.recordClassIndex(1751);
        }

        public final e a() {
            e eVar = new e(this.f4502a);
            e.a(eVar);
            return eVar;
        }

        public final a a(Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    this.f4502a.put(key, null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == Boolean.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                        this.f4502a.put(key, value);
                    } else {
                        int i2 = 0;
                        if (cls == boolean[].class) {
                            Map<String, Object> map2 = this.f4502a;
                            boolean[] zArr = (boolean[]) value;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i2 < zArr.length) {
                                boolArr[i2] = Boolean.valueOf(zArr[i2]);
                                i2++;
                            }
                            map2.put(key, boolArr);
                        } else if (cls == int[].class) {
                            Map<String, Object> map3 = this.f4502a;
                            int[] iArr = (int[]) value;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i2 < iArr.length) {
                                numArr[i2] = Integer.valueOf(iArr[i2]);
                                i2++;
                            }
                            map3.put(key, numArr);
                        } else if (cls == long[].class) {
                            Map<String, Object> map4 = this.f4502a;
                            long[] jArr = (long[]) value;
                            Long[] lArr = new Long[jArr.length];
                            while (i2 < jArr.length) {
                                lArr[i2] = Long.valueOf(jArr[i2]);
                                i2++;
                            }
                            map4.put(key, lArr);
                        } else if (cls == float[].class) {
                            Map<String, Object> map5 = this.f4502a;
                            float[] fArr = (float[]) value;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i2 < fArr.length) {
                                fArr2[i2] = Float.valueOf(fArr[i2]);
                                i2++;
                            }
                            map5.put(key, fArr2);
                        } else if (cls == double[].class) {
                            Map<String, Object> map6 = this.f4502a;
                            double[] dArr = (double[]) value;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i2 < dArr.length) {
                                dArr2[i2] = Double.valueOf(dArr[i2]);
                                i2++;
                            }
                            map6.put(key, dArr2);
                        } else {
                            throw new IllegalArgumentException(com.a.a("Key %s has invalid type %s", new Object[]{key, cls}));
                        }
                    }
                }
            }
            return this;
        }
    }

    public final int hashCode() {
        return this.f4501b.hashCode() * 31;
    }

    static {
        Covode.recordClassIndex(1750);
    }

    e(Map<String, ?> map) {
        this.f4501b = new HashMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f4501b.equals(((e) obj).f4501b);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:11|12|13|17|18|19) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|(7:3|4|5|6|(1:8)|9|10)|24|25|26|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (0 == 0) goto L_0x003e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.e a(byte[] r6) {
        /*
            int r1 = r6.length
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r0) goto L_0x0047
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            r4.<init>(r6)
            r1 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x0039, all -> 0x0034 }
            r3.<init>(r4)     // Catch:{ IOException | ClassNotFoundException -> 0x0039, all -> 0x0034 }
            int r2 = r3.readInt()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x002d }
        L_0x0019:
            if (r2 <= 0) goto L_0x0029
            java.lang.String r1 = r3.readUTF()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x002d }
            java.lang.Object r0 = r3.readObject()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x002d }
            r5.put(r1, r0)     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x002d }
            int r2 = r2 + -1
            goto L_0x0019
        L_0x0029:
            r3.close()     // Catch:{ IOException -> 0x003e }
            goto L_0x003e
        L_0x002d:
            r0 = move-exception
            r3.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0035
        L_0x0032:
            r1 = r3
            goto L_0x003b
        L_0x0034:
            r0 = move-exception
        L_0x0035:
            r4.close()     // Catch:{ IOException -> 0x0038 }
        L_0x0038:
            throw r0
        L_0x0039:
            if (r1 == 0) goto L_0x003e
        L_0x003b:
            r1.close()
        L_0x003e:
            r4.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            androidx.work.e r0 = new androidx.work.e
            r0.<init>(r5)
            return r0
        L_0x0047:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.e.a(byte[]):androidx.work.e");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:32|(2:34|35)|36|37|38) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:23|24|(0)|28|29|30) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:3|4|(2:7|5)|8|9|10|11|12|(2:15|16)(2:17|18)) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0063 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x006d */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060 A[SYNTHETIC, Splitter:B:26:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a A[SYNTHETIC, Splitter:B:34:0x006a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(androidx.work.e r5) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.e.a(androidx.work.e):byte[]");
    }
}
