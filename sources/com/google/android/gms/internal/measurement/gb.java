package com.google.android.gms.internal.measurement;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.internal.measurement.gd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class gb<T extends gd<T>> {

    /* renamed from: d  reason: collision with root package name */
    static final gb f50901d = new gb((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final io<T, Object> f50902a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f50903b;

    /* renamed from: c  reason: collision with root package name */
    boolean f50904c;

    public final void a(gb<T> gbVar) {
        for (int i2 = 0; i2 < gbVar.f50902a.b(); i2++) {
            c(gbVar.f50902a.b(i2));
        }
        for (Map.Entry<T, Object> entry : gbVar.f50902a.c()) {
            c(entry);
        }
    }

    public final int hashCode() {
        return this.f50902a.hashCode();
    }

    static {
        Covode.recordClassIndex(31809);
    }

    private gb() {
        this.f50902a = io.a(16);
    }

    public final void a() {
        if (!this.f50903b) {
            this.f50902a.a();
            this.f50903b = true;
        }
    }

    public final Iterator<Map.Entry<T, Object>> b() {
        if (this.f50904c) {
            return new gz(this.f50902a.entrySet().iterator());
        }
        return this.f50902a.entrySet().iterator();
    }

    public final boolean c() {
        for (int i2 = 0; i2 < this.f50902a.b(); i2++) {
            if (!b(this.f50902a.b(i2))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.f50902a.c()) {
            if (!b(entry)) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() {
        gb gbVar = new gb();
        for (int i2 = 0; i2 < this.f50902a.b(); i2++) {
            Map.Entry<T, Object> b2 = this.f50902a.b(i2);
            gbVar.b(b2.getKey(), b2.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f50902a.c()) {
            gbVar.b(entry.getKey(), entry.getValue());
        }
        gbVar.f50904c = this.f50904c;
        return gbVar;
    }

    private gb(byte b2) {
        this(io.a(0));
        a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        return this.f50902a.equals(((gb) obj).f50902a);
    }

    private gb(io<T, Object> ioVar) {
        this.f50902a = ioVar;
        a();
    }

    private final Object a(T t) {
        Object obj = this.f50902a.get(t);
        if (!(obj instanceof gy)) {
            return obj;
        }
        throw new NoSuchMethodError();
    }

    static int a(Map.Entry<T, Object> entry) {
        int m2;
        int m3;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.c() != jx.MESSAGE || key.d() || key.e()) {
            return a((gd<?>) key, value);
        }
        if (value instanceof gy) {
            m2 = (ft.m(8) << 1) + ft.g(2, entry.getKey().a());
            m3 = ft.a(3, (hc) value);
        } else {
            m2 = (ft.m(8) << 1) + ft.g(2, entry.getKey().a());
            m3 = ft.m(24) + ft.b((ht) value);
        }
        return m2 + m3;
    }

    private static <T extends gd<T>> boolean b(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.c() == jx.MESSAGE) {
            if (key.d()) {
                for (ht htVar : (List) entry.getValue()) {
                    if (!htVar.G_()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof ht) {
                    if (!((ht) value).G_()) {
                        return false;
                    }
                } else if (value instanceof gy) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private final void c(Map.Entry<T, Object> entry) {
        ht w;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof gy) {
            throw new NoSuchMethodError();
        } else if (key.d()) {
            Object a2 = a((gd) key);
            if (a2 == null) {
                a2 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) a2).add(a(obj));
            }
            this.f50902a.put(key, a2);
        } else if (key.c() == jx.MESSAGE) {
            Object a3 = a((gd) key);
            if (a3 == null) {
                this.f50902a.put(key, a(value));
                return;
            }
            if (a3 instanceof ic) {
                w = key.g();
            } else {
                ((ht) a3).n();
                w = key.f().w();
            }
            this.f50902a.put(key, w);
        } else {
            this.f50902a.put(key, a(value));
        }
    }

    private static Object a(Object obj) {
        if (obj instanceof ic) {
            return ((ic) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int a(gd<?> gdVar, Object obj) {
        jr b2 = gdVar.b();
        int a2 = gdVar.a();
        if (!gdVar.d()) {
            return a(b2, a2, obj);
        }
        int i2 = 0;
        if (gdVar.e()) {
            for (Object obj2 : (List) obj) {
                i2 += b(b2, obj2);
            }
            return ft.m(a2 << 3) + i2 + ft.m(i2);
        }
        for (Object obj3 : (List) obj) {
            i2 += a(b2, a2, obj3);
        }
        return i2;
    }

    private final void b(T t, Object obj) {
        if (!t.d()) {
            a(t.b(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((Collection) obj);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                a(t.b(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof gy) {
            this.f50904c = true;
        }
        this.f50902a.put(t, obj);
    }

    private static int b(jr jrVar, Object obj) {
        switch (ge.f50908b[jrVar.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                return 8;
            case 2:
                ((Float) obj).floatValue();
                return 4;
            case 3:
                return ft.d(((Long) obj).longValue());
            case 4:
                return ft.d(((Long) obj).longValue());
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return ft.l(((Integer) obj).intValue());
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                ((Long) obj).longValue();
                return 8;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                ((Integer) obj).intValue();
                return 4;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                ((Boolean) obj).booleanValue();
                return 1;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return ((ht) obj).m();
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                if (obj instanceof gy) {
                    return ft.a((hc) obj);
                }
                return ft.b((ht) obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                if (obj instanceof fe) {
                    return ft.b((fe) obj);
                }
                return ft.b((String) obj);
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                if (obj instanceof fe) {
                    return ft.b((fe) obj);
                }
                return ft.b((byte[]) obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return ft.m(((Integer) obj).intValue());
            case ABRConfig.ABR_SELECT_SCENE:
                ((Integer) obj).intValue();
                return 4;
            case 15:
                ((Long) obj).longValue();
                return 8;
            case 16:
                return ft.m(ft.n(((Integer) obj).intValue()));
            case 17:
                return ft.d(ft.e(((Long) obj).longValue()));
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                if (obj instanceof go) {
                    return ft.l(((go) obj).zza());
                }
                return ft.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.google.android.gms.internal.measurement.jr r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.gp.a(r3)
            int[] r1 = com.google.android.gms.internal.measurement.ge.f50907a
            com.google.android.gms.internal.measurement.jx r0 = r2.zza()
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            r0 = 0
            switch(r1) {
                case 1: goto L_0x0046;
                case 2: goto L_0x0043;
                case 3: goto L_0x0040;
                case 4: goto L_0x003d;
                case 5: goto L_0x003a;
                case 6: goto L_0x0037;
                case 7: goto L_0x002e;
                case 8: goto L_0x0025;
                case 9: goto L_0x001c;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Wrong object type used with protocol message reflection."
            r1.<init>(r0)
            throw r1
        L_0x001c:
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.ht
            if (r0 != 0) goto L_0x004a
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.gy
            if (r0 == 0) goto L_0x0014
            goto L_0x004a
        L_0x0025:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x004a
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.go
            if (r0 == 0) goto L_0x0014
            goto L_0x004a
        L_0x002e:
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.fe
            if (r0 != 0) goto L_0x004a
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L_0x0014
            goto L_0x004a
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0048
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0048
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0048
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0048
        L_0x0043:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0048
        L_0x0046:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0048:
            if (r0 == 0) goto L_0x0014
        L_0x004a:
            return
            switch-data {1->0x0046, 2->0x0043, 3->0x0040, 4->0x003d, 5->0x003a, 6->0x0037, 7->0x002e, 8->0x0025, 9->0x001c, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.gb.a(com.google.android.gms.internal.measurement.jr, java.lang.Object):void");
    }

    static int a(jr jrVar, int i2, Object obj) {
        int m2 = ft.m(i2 << 3);
        if (jrVar == jr.GROUP) {
            m2 <<= 1;
        }
        return m2 + b(jrVar, obj);
    }

    static void a(ft ftVar, jr jrVar, int i2, Object obj) {
        if (jrVar == jr.GROUP) {
            ftVar.a(i2, 3);
            ((ht) obj).a(ftVar);
            ftVar.a(i2, 4);
            return;
        }
        ftVar.a(i2, jrVar.zzb());
        switch (ge.f50908b[jrVar.ordinal()]) {
            case 1:
                ftVar.a(((Double) obj).doubleValue());
                return;
            case 2:
                ftVar.a(((Float) obj).floatValue());
                return;
            case 3:
                ftVar.a(((Long) obj).longValue());
                return;
            case 4:
                ftVar.a(((Long) obj).longValue());
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                ftVar.a(((Integer) obj).intValue());
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                ftVar.c(((Long) obj).longValue());
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                ftVar.d(((Integer) obj).intValue());
                return;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                ftVar.a(((Boolean) obj).booleanValue());
                return;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                ((ht) obj).a(ftVar);
                return;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                ftVar.a((ht) obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                if (obj instanceof fe) {
                    ftVar.a((fe) obj);
                    return;
                } else {
                    ftVar.a((String) obj);
                    return;
                }
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                if (obj instanceof fe) {
                    ftVar.a((fe) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                ftVar.a(bArr, bArr.length);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                ftVar.b(((Integer) obj).intValue());
                return;
            case ABRConfig.ABR_SELECT_SCENE:
                ftVar.d(((Integer) obj).intValue());
                return;
            case 15:
                ftVar.c(((Long) obj).longValue());
                return;
            case 16:
                ftVar.c(((Integer) obj).intValue());
                return;
            case 17:
                ftVar.b(((Long) obj).longValue());
                return;
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                if (obj instanceof go) {
                    ftVar.a(((go) obj).zza());
                    return;
                } else {
                    ftVar.a(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }
}
