package com.google.android.gms.internal.measurement;

import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.internal.measurement.gm;
import com.ss.android.ugc.aweme.kids.discovery.gallery.a;
import com.ss.android.ugc.playerkit.model.v;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
public final class hx<T> implements in<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f50990a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f50991b = jk.a();

    /* renamed from: c  reason: collision with root package name */
    private final int[] f50992c;

    /* renamed from: d  reason: collision with root package name */
    private final Object[] f50993d;

    /* renamed from: e  reason: collision with root package name */
    private final int f50994e;

    /* renamed from: f  reason: collision with root package name */
    private final int f50995f;

    /* renamed from: g  reason: collision with root package name */
    private final ht f50996g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f50997h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f50998i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f50999j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f51000k;

    /* renamed from: l  reason: collision with root package name */
    private final int[] f51001l;

    /* renamed from: m  reason: collision with root package name */
    private final int f51002m;
    private final int n;
    private final ib o;
    private final hd p;
    private final je<?, ?> q;
    private final ga<?> r;
    private final hq s;

    private static boolean f(int i2) {
        return (i2 & 536870912) != 0;
    }

    static <T> hx<T> a(hr hrVar, ib ibVar, hd hdVar, je<?, ?> jeVar, ga<?> gaVar, hq hqVar) {
        int i2;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int charAt5;
        int[] iArr;
        int i3;
        int i4;
        char charAt6;
        int i5;
        char charAt7;
        int i6;
        char charAt8;
        int i7;
        char charAt9;
        int i8;
        char charAt10;
        int i9;
        char charAt11;
        int i10;
        char charAt12;
        int i11;
        char charAt13;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Field a2;
        int i17;
        char charAt14;
        int i18;
        Field a3;
        Field a4;
        int i19;
        char charAt15;
        int i20;
        char charAt16;
        int i21;
        char charAt17;
        int i22;
        char charAt18;
        if (hrVar instanceof il) {
            il ilVar = (il) hrVar;
            int i23 = 0;
            boolean z = ilVar.a() == gm.e.f50949i;
            String str = ilVar.f51022b;
            int length = str.length();
            if (str.charAt(0) >= 55296) {
                int i24 = 1;
                while (true) {
                    i2 = i24 + 1;
                    if (str.charAt(i24) < 55296) {
                        break;
                    }
                    i24 = i2;
                }
            } else {
                i2 = 1;
            }
            int i25 = i2 + 1;
            int charAt19 = str.charAt(i2);
            if (charAt19 >= 55296) {
                int i26 = charAt19 & 8191;
                int i27 = 13;
                while (true) {
                    i22 = i25 + 1;
                    charAt18 = str.charAt(i25);
                    if (charAt18 < 55296) {
                        break;
                    }
                    i26 |= (charAt18 & 8191) << i27;
                    i27 += 13;
                    i25 = i22;
                }
                charAt19 = i26 | (charAt18 << i27);
                i25 = i22;
            }
            if (charAt19 == 0) {
                iArr = f50990a;
                charAt4 = 0;
                charAt = 0;
                charAt2 = 0;
                charAt3 = 0;
                i3 = 0;
                charAt5 = 0;
            } else {
                int i28 = i25 + 1;
                i23 = str.charAt(i25);
                if (i23 >= 55296) {
                    int i29 = i23 & 8191;
                    int i30 = 13;
                    while (true) {
                        i11 = i28 + 1;
                        charAt13 = str.charAt(i28);
                        if (charAt13 < 55296) {
                            break;
                        }
                        i29 |= (charAt13 & 8191) << i30;
                        i30 += 13;
                        i28 = i11;
                    }
                    i23 = i29 | (charAt13 << i30);
                    i28 = i11;
                }
                int i31 = i28 + 1;
                int charAt20 = str.charAt(i28);
                if (charAt20 >= 55296) {
                    int i32 = charAt20 & 8191;
                    int i33 = 13;
                    while (true) {
                        i10 = i31 + 1;
                        charAt12 = str.charAt(i31);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i32 |= (charAt12 & 8191) << i33;
                        i33 += 13;
                        i31 = i10;
                    }
                    charAt20 = i32 | (charAt12 << i33);
                    i31 = i10;
                }
                int i34 = i31 + 1;
                charAt = str.charAt(i31);
                if (charAt >= 55296) {
                    int i35 = charAt & 8191;
                    int i36 = 13;
                    while (true) {
                        i9 = i34 + 1;
                        charAt11 = str.charAt(i34);
                        if (charAt11 < 55296) {
                            break;
                        }
                        i35 |= (charAt11 & 8191) << i36;
                        i36 += 13;
                        i34 = i9;
                    }
                    charAt = i35 | (charAt11 << i36);
                    i34 = i9;
                }
                int i37 = i34 + 1;
                charAt2 = str.charAt(i34);
                if (charAt2 >= 55296) {
                    int i38 = charAt2 & 8191;
                    int i39 = 13;
                    while (true) {
                        i8 = i37 + 1;
                        charAt10 = str.charAt(i37);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i38 |= (charAt10 & 8191) << i39;
                        i39 += 13;
                        i37 = i8;
                    }
                    charAt2 = i38 | (charAt10 << i39);
                    i37 = i8;
                }
                int i40 = i37 + 1;
                charAt3 = str.charAt(i37);
                if (charAt3 >= 55296) {
                    int i41 = charAt3 & 8191;
                    int i42 = 13;
                    while (true) {
                        i7 = i40 + 1;
                        charAt9 = str.charAt(i40);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i41 |= (charAt9 & 8191) << i42;
                        i42 += 13;
                        i40 = i7;
                    }
                    charAt3 = i41 | (charAt9 << i42);
                    i40 = i7;
                }
                int i43 = i40 + 1;
                charAt4 = str.charAt(i40);
                if (charAt4 >= 55296) {
                    int i44 = charAt4 & 8191;
                    int i45 = 13;
                    while (true) {
                        i6 = i43 + 1;
                        charAt8 = str.charAt(i43);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i44 |= (charAt8 & 8191) << i45;
                        i45 += 13;
                        i43 = i6;
                    }
                    charAt4 = i44 | (charAt8 << i45);
                    i43 = i6;
                }
                int i46 = i43 + 1;
                int charAt21 = str.charAt(i43);
                if (charAt21 >= 55296) {
                    int i47 = charAt21 & 8191;
                    int i48 = 13;
                    while (true) {
                        i5 = i46 + 1;
                        charAt7 = str.charAt(i46);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i47 |= (charAt7 & 8191) << i48;
                        i48 += 13;
                        i46 = i5;
                    }
                    charAt21 = i47 | (charAt7 << i48);
                    i46 = i5;
                }
                i25 = i46 + 1;
                charAt5 = str.charAt(i46);
                if (charAt5 >= 55296) {
                    int i49 = charAt5 & 8191;
                    int i50 = 13;
                    while (true) {
                        i4 = i25 + 1;
                        charAt6 = str.charAt(i25);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i49 |= (charAt6 & 8191) << i50;
                        i50 += 13;
                        i25 = i4;
                    }
                    charAt5 = i49 | (charAt6 << i50);
                    i25 = i4;
                }
                iArr = new int[(charAt5 + charAt4 + charAt21)];
                i3 = (i23 << 1) + charAt20;
            }
            Unsafe unsafe = f50991b;
            Object[] objArr = ilVar.f51023c;
            Class<?> cls = ilVar.f51021a.getClass();
            int[] iArr2 = new int[(charAt3 * 3)];
            Object[] objArr2 = new Object[(charAt3 << 1)];
            int i51 = charAt5 + charAt4;
            int i52 = charAt5;
            int i53 = i51;
            int i54 = 0;
            int i55 = 0;
            while (i25 < length) {
                int i56 = i25 + 1;
                int charAt22 = str.charAt(i25);
                if (charAt22 >= 55296) {
                    int i57 = charAt22 & 8191;
                    int i58 = 13;
                    while (true) {
                        i21 = i56 + 1;
                        charAt17 = str.charAt(i56);
                        if (charAt17 < 55296) {
                            break;
                        }
                        i57 |= (charAt17 & 8191) << i58;
                        i58 += 13;
                        i56 = i21;
                    }
                    charAt22 = i57 | (charAt17 << i58);
                    i56 = i21;
                }
                i25 = i56 + 1;
                int charAt23 = str.charAt(i56);
                if (charAt23 >= 55296) {
                    int i59 = charAt23 & 8191;
                    int i60 = 13;
                    while (true) {
                        i20 = i25 + 1;
                        charAt16 = str.charAt(i25);
                        if (charAt16 < 55296) {
                            break;
                        }
                        i59 |= (charAt16 & 8191) << i60;
                        i60 += 13;
                        i25 = i20;
                    }
                    charAt23 = i59 | (charAt16 << i60);
                    i25 = i20;
                }
                int i61 = charAt23 & 255;
                if ((charAt23 & 1024) != 0) {
                    iArr[i54] = i55;
                    i54++;
                }
                if (i61 >= 51) {
                    int i62 = i25 + 1;
                    int charAt24 = str.charAt(i25);
                    char c2 = 55296;
                    if (charAt24 >= 55296) {
                        int i63 = charAt24 & 8191;
                        int i64 = 13;
                        while (true) {
                            i19 = i62 + 1;
                            charAt15 = str.charAt(i62);
                            if (charAt15 < c2) {
                                break;
                            }
                            i63 |= (charAt15 & 8191) << i64;
                            i64 += 13;
                            i62 = i19;
                            c2 = 55296;
                        }
                        charAt24 = i63 | (charAt15 << i64);
                        i62 = i19;
                    }
                    int i65 = i61 - 51;
                    if (i65 == 9 || i65 == 17) {
                        objArr2[((i55 / 3) << 1) + 1] = objArr[i3];
                        i3++;
                    } else if (i65 == 12 && !z) {
                        objArr2[((i55 / 3) << 1) + 1] = objArr[i3];
                        i3++;
                    }
                    int i66 = charAt24 << 1;
                    Object obj = objArr[i66];
                    if (obj instanceof Field) {
                        a3 = (Field) obj;
                    } else {
                        a3 = a(cls, (String) obj);
                        objArr[i66] = a3;
                    }
                    i12 = (int) unsafe.objectFieldOffset(a3);
                    int i67 = i66 + 1;
                    Object obj2 = objArr[i67];
                    if (obj2 instanceof Field) {
                        a4 = (Field) obj2;
                    } else {
                        a4 = a(cls, (String) obj2);
                        objArr[i67] = a4;
                    }
                    i15 = (int) unsafe.objectFieldOffset(a4);
                    i13 = i3;
                    i25 = i62;
                    i14 = 0;
                } else {
                    i13 = i3 + 1;
                    Field a5 = a(cls, (String) objArr[i3]);
                    if (i61 == 9 || i61 == 17) {
                        objArr2[((i55 / 3) << 1) + 1] = a5.getType();
                    } else {
                        if (i61 == 27 || i61 == 49) {
                            i18 = i13 + 1;
                            objArr2[((i55 / 3) << 1) + 1] = objArr[i13];
                        } else if (i61 == 12 || i61 == 30 || i61 == 44) {
                            if (!z) {
                                i18 = i13 + 1;
                                objArr2[((i55 / 3) << 1) + 1] = objArr[i13];
                            }
                        } else if (i61 == 50) {
                            int i68 = i52 + 1;
                            iArr[i52] = i55;
                            int i69 = (i55 / 3) << 1;
                            int i70 = i13 + 1;
                            objArr2[i69] = objArr[i13];
                            if ((charAt23 & 2048) != 0) {
                                i13 = i70 + 1;
                                objArr2[i69 + 1] = objArr[i70];
                                i52 = i68;
                            } else {
                                i52 = i68;
                                i13 = i70;
                            }
                        }
                        i13 = i18;
                    }
                    i12 = (int) unsafe.objectFieldOffset(a5);
                    if ((charAt23 & 4096) != 4096 || i61 > 17) {
                        i15 = 1048575;
                        i14 = 0;
                    } else {
                        int i71 = i25 + 1;
                        int charAt25 = str.charAt(i25);
                        if (charAt25 >= 55296) {
                            int i72 = charAt25 & 8191;
                            int i73 = 13;
                            while (true) {
                                i17 = i71 + 1;
                                charAt14 = str.charAt(i71);
                                if (charAt14 < 55296) {
                                    break;
                                }
                                i72 |= (charAt14 & 8191) << i73;
                                i73 += 13;
                                i71 = i17;
                            }
                            charAt25 = i72 | (charAt14 << i73);
                            i71 = i17;
                        }
                        int i74 = (i23 << 1) + (charAt25 / 32);
                        Object obj3 = objArr[i74];
                        if (obj3 instanceof Field) {
                            a2 = (Field) obj3;
                        } else {
                            a2 = a(cls, (String) obj3);
                            objArr[i74] = a2;
                        }
                        i15 = (int) unsafe.objectFieldOffset(a2);
                        i14 = charAt25 % 32;
                        i25 = i71;
                    }
                    if (i61 >= 18 && i61 <= 49) {
                        iArr[i53] = i12;
                        i53++;
                    }
                }
                int i75 = i55 + 1;
                iArr2[i55] = charAt22;
                int i76 = i75 + 1;
                if ((charAt23 & 512) != 0) {
                    i16 = 536870912;
                } else {
                    i16 = 0;
                }
                iArr2[i75] = i16 | ((charAt23 & 256) != 0 ? 268435456 : 0) | (i61 << 20) | i12;
                i55 = i76 + 1;
                iArr2[i76] = (i14 << 20) | i15;
                i3 = i13;
            }
            return new hx<>(iArr2, objArr2, charAt, charAt2, ilVar.f51021a, z, iArr, charAt5, i51, ibVar, hdVar, jeVar, gaVar, hqVar);
        }
        throw new NoSuchMethodError();
    }

    private static Field a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length()).append("Field ").append(str).append(" for ").append(name).append(" not found. Known fields are ").append(arrays).toString());
        }
    }

    @Override // com.google.android.gms.internal.measurement.in
    public final T a() {
        return (T) this.o.a(this.f50996g);
    }

    @Override // com.google.android.gms.internal.measurement.in
    public final boolean a(T t, T t2) {
        boolean z;
        int length = this.f50992c.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int d2 = d(i2);
            long j2 = (long) (d2 & 1048575);
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    if (c(t, t2, i2) && Double.doubleToLongBits(jk.e(t, j2)) == Double.doubleToLongBits(jk.e(t2, j2))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (c(t, t2, i2) && Float.floatToIntBits(jk.d(t, j2)) == Float.floatToIntBits(jk.d(t2, j2))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (c(t, t2, i2) && jk.b(t, j2) == jk.b(t2, j2)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (c(t, t2, i2) && jk.b(t, j2) == jk.b(t2, j2)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (c(t, t2, i2) && jk.a(t, j2) == jk.a(t2, j2)) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    if (c(t, t2, i2) && jk.b(t, j2) == jk.b(t2, j2)) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if (c(t, t2, i2) && jk.a(t, j2) == jk.a(t2, j2)) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    if (c(t, t2, i2) && jk.c(t, j2) == jk.c(t2, j2)) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    if (c(t, t2, i2) && ip.a(jk.f(t, j2), jk.f(t2, j2))) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    if (c(t, t2, i2) && ip.a(jk.f(t, j2), jk.f(t2, j2))) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    if (c(t, t2, i2) && ip.a(jk.f(t, j2), jk.f(t2, j2))) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    if (c(t, t2, i2) && jk.a(t, j2) == jk.a(t2, j2)) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    if (c(t, t2, i2) && jk.a(t, j2) == jk.a(t2, j2)) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    if (c(t, t2, i2) && jk.a(t, j2) == jk.a(t2, j2)) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_SELECT_SCENE:
                    if (c(t, t2, i2) && jk.b(t, j2) == jk.b(t2, j2)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (c(t, t2, i2) && jk.a(t, j2) == jk.a(t2, j2)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (c(t, t2, i2) && jk.b(t, j2) == jk.b(t2, j2)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (c(t, t2, i2) && ip.a(jk.f(t, j2), jk.f(t2, j2))) {
                        continue;
                    }
                    return false;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                case 19:
                case v.U /*{ENCODED_INT: 20}*/:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case BuildConfig.VERSION_CODE:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = ip.a(jk.f(t, j2), jk.f(t2, j2));
                    break;
                case 50:
                    z = ip.a(jk.f(t, j2), jk.f(t2, j2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case AudiencePingIntervalSetting.DEFAULT:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long e2 = (long) (e(i2) & 1048575);
                    if (jk.a(t, e2) == jk.a(t2, e2) && ip.a(jk.f(t, j2), jk.f(t2, j2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!z) {
                return false;
            }
        }
        if (!this.q.b(t).equals(this.q.b(t2))) {
            return false;
        }
        if (this.f50997h) {
            return this.r.a((Object) t).equals(this.r.a((Object) t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.in
    public final int a(T t) {
        int i2;
        long j2;
        int i3;
        int i4;
        int length = this.f50992c.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int d2 = d(i6);
            int i7 = this.f50992c[i6];
            long j3 = (long) (1048575 & d2);
            int i8 = 37;
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    i2 = i5 * 53;
                    j2 = Double.doubleToLongBits(jk.e(t, j3));
                    i5 = i2 + ((int) (j2 ^ (j2 >>> 32)));
                    break;
                case 1:
                    i3 = i5 * 53;
                    i4 = Float.floatToIntBits(jk.d(t, j3));
                    i5 = i3 + i4;
                    break;
                case 2:
                    i2 = i5 * 53;
                    j2 = jk.b(t, j3);
                    i5 = i2 + ((int) (j2 ^ (j2 >>> 32)));
                    break;
                case 3:
                    i2 = i5 * 53;
                    j2 = jk.b(t, j3);
                    i5 = i2 + ((int) (j2 ^ (j2 >>> 32)));
                    break;
                case 4:
                    i3 = i5 * 53;
                    i4 = jk.a(t, j3);
                    i5 = i3 + i4;
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    i2 = i5 * 53;
                    j2 = jk.b(t, j3);
                    i5 = i2 + ((int) (j2 ^ (j2 >>> 32)));
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    i3 = i5 * 53;
                    i4 = jk.a(t, j3);
                    i5 = i3 + i4;
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    i3 = i5 * 53;
                    i4 = gp.a(jk.c(t, j3));
                    i5 = i3 + i4;
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    i3 = i5 * 53;
                    i4 = ((String) jk.f(t, j3)).hashCode();
                    i5 = i3 + i4;
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    Object f2 = jk.f(t, j3);
                    if (f2 != null) {
                        i8 = f2.hashCode();
                    }
                    i5 = (i5 * 53) + i8;
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    i3 = i5 * 53;
                    i4 = jk.f(t, j3).hashCode();
                    i5 = i3 + i4;
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    i3 = i5 * 53;
                    i4 = jk.a(t, j3);
                    i5 = i3 + i4;
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    i3 = i5 * 53;
                    i4 = jk.a(t, j3);
                    i5 = i3 + i4;
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    i3 = i5 * 53;
                    i4 = jk.a(t, j3);
                    i5 = i3 + i4;
                    break;
                case ABRConfig.ABR_SELECT_SCENE:
                    i2 = i5 * 53;
                    j2 = jk.b(t, j3);
                    i5 = i2 + ((int) (j2 ^ (j2 >>> 32)));
                    break;
                case 15:
                    i3 = i5 * 53;
                    i4 = jk.a(t, j3);
                    i5 = i3 + i4;
                    break;
                case 16:
                    i2 = i5 * 53;
                    j2 = jk.b(t, j3);
                    i5 = i2 + ((int) (j2 ^ (j2 >>> 32)));
                    break;
                case 17:
                    Object f3 = jk.f(t, j3);
                    if (f3 != null) {
                        i8 = f3.hashCode();
                    }
                    i5 = (i5 * 53) + i8;
                    break;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                case 19:
                case v.U /*{ENCODED_INT: 20}*/:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case BuildConfig.VERSION_CODE:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i3 = i5 * 53;
                    i4 = jk.f(t, j3).hashCode();
                    i5 = i3 + i4;
                    break;
                case 50:
                    i3 = i5 * 53;
                    i4 = jk.f(t, j3).hashCode();
                    i5 = i3 + i4;
                    break;
                case 51:
                    if (a(t, i7, i6)) {
                        i2 = i5 * 53;
                        j2 = Double.doubleToLongBits(b(t, j3));
                        i5 = i2 + ((int) (j2 ^ (j2 >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (a(t, i7, i6)) {
                        i3 = i5 * 53;
                        i4 = Float.floatToIntBits(c(t, j3));
                        i5 = i3 + i4;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (a(t, i7, i6)) {
                        i2 = i5 * 53;
                        j2 = e(t, j3);
                        i5 = i2 + ((int) (j2 ^ (j2 >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (a(t, i7, i6)) {
                        i2 = i5 * 53;
                        j2 = e(t, j3);
                        i5 = i2 + ((int) (j2 ^ (j2 >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (a(t, i7, i6)) {
                        i3 = i5 * 53;
                        i4 = d(t, j3);
                        i5 = i3 + i4;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (a(t, i7, i6)) {
                        i2 = i5 * 53;
                        j2 = e(t, j3);
                        i5 = i2 + ((int) (j2 ^ (j2 >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (a(t, i7, i6)) {
                        i3 = i5 * 53;
                        i4 = d(t, j3);
                        i5 = i3 + i4;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (a(t, i7, i6)) {
                        i3 = i5 * 53;
                        i4 = gp.a(f(t, j3));
                        i5 = i3 + i4;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (a(t, i7, i6)) {
                        i3 = i5 * 53;
                        i4 = ((String) jk.f(t, j3)).hashCode();
                        i5 = i3 + i4;
                        break;
                    } else {
                        break;
                    }
                case AudiencePingIntervalSetting.DEFAULT:
                    if (a(t, i7, i6)) {
                        i3 = i5 * 53;
                        i4 = jk.f(t, j3).hashCode();
                        i5 = i3 + i4;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (a(t, i7, i6)) {
                        i3 = i5 * 53;
                        i4 = jk.f(t, j3).hashCode();
                        i5 = i3 + i4;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (a(t, i7, i6)) {
                        i3 = i5 * 53;
                        i4 = d(t, j3);
                        i5 = i3 + i4;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (a(t, i7, i6)) {
                        i3 = i5 * 53;
                        i4 = d(t, j3);
                        i5 = i3 + i4;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (a(t, i7, i6)) {
                        i3 = i5 * 53;
                        i4 = d(t, j3);
                        i5 = i3 + i4;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (a(t, i7, i6)) {
                        i2 = i5 * 53;
                        j2 = e(t, j3);
                        i5 = i2 + ((int) (j2 ^ (j2 >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (a(t, i7, i6)) {
                        i3 = i5 * 53;
                        i4 = d(t, j3);
                        i5 = i3 + i4;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (a(t, i7, i6)) {
                        i2 = i5 * 53;
                        j2 = e(t, j3);
                        i5 = i2 + ((int) (j2 ^ (j2 >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (a(t, i7, i6)) {
                        i3 = i5 * 53;
                        i4 = jk.f(t, j3).hashCode();
                        i5 = i3 + i4;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i5 * 53) + this.q.b(t).hashCode();
        return this.f50997h ? (hashCode * 53) + this.r.a((Object) t).hashCode() : hashCode;
    }

    private final void a(T t, T t2, int i2) {
        long d2 = (long) (d(i2) & 1048575);
        if (a((Object) t2, i2)) {
            Object f2 = jk.f(t, d2);
            Object f3 = jk.f(t2, d2);
            if (f2 != null) {
                if (f3 != null) {
                    jk.a(t, d2, gp.a(f2, f3));
                    b((Object) t, i2);
                }
            } else if (f3 != null) {
                jk.a(t, d2, f3);
                b((Object) t, i2);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.in
    public final int b(T t) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = 267386880;
        int i13 = 1048575;
        if (this.f50999j) {
            Unsafe unsafe = f50991b;
            int i14 = 0;
            for (int i15 = 0; i15 < this.f50992c.length; i15 += 3) {
                int d2 = d(i15);
                int i16 = (d2 & 267386880) >>> 20;
                int i17 = this.f50992c[i15];
                long j2 = (long) (d2 & 1048575);
                int i18 = (i16 < gg.DOUBLE_LIST_PACKED.zza() || i16 > gg.SINT64_LIST_PACKED.zza()) ? 0 : this.f50992c[i15 + 2] & 1048575;
                switch (i16) {
                    case 0:
                        if (a((Object) t, i15)) {
                            i8 = ft.j(i17);
                            break;
                        } else {
                            continue;
                        }
                    case 1:
                        if (a((Object) t, i15)) {
                            i8 = ft.i(i17);
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if (a((Object) t, i15)) {
                            i8 = ft.d(i17, jk.b(t, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if (a((Object) t, i15)) {
                            i8 = ft.e(i17, jk.b(t, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if (a((Object) t, i15)) {
                            i8 = ft.f(i17, jk.a(t, j2));
                            break;
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        if (a((Object) t, i15)) {
                            i8 = ft.g(i17);
                            break;
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        if (a((Object) t, i15)) {
                            i8 = ft.e(i17);
                            break;
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        if (a((Object) t, i15)) {
                            i8 = ft.k(i17);
                            break;
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        if (a((Object) t, i15)) {
                            Object f2 = jk.f(t, j2);
                            if (f2 instanceof fe) {
                                i8 = ft.c(i17, (fe) f2);
                                break;
                            } else {
                                i8 = ft.b(i17, (String) f2);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        if (a((Object) t, i15)) {
                            i8 = ip.a(i17, jk.f(t, j2), a(i15));
                            break;
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        if (a((Object) t, i15)) {
                            i8 = ft.c(i17, (fe) jk.f(t, j2));
                            break;
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        if (a((Object) t, i15)) {
                            i8 = ft.g(i17, jk.a(t, j2));
                            break;
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        if (a((Object) t, i15)) {
                            i8 = ft.i(i17, jk.a(t, j2));
                            break;
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        if (a((Object) t, i15)) {
                            i8 = ft.f(i17);
                            break;
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_SELECT_SCENE:
                        if (a((Object) t, i15)) {
                            i8 = ft.h(i17);
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if (a((Object) t, i15)) {
                            i8 = ft.h(i17, jk.a(t, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if (a((Object) t, i15)) {
                            i8 = ft.f(i17, jk.b(t, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if (a((Object) t, i15)) {
                            i8 = ft.c(i17, (ht) jk.f(t, j2), a(i15));
                            break;
                        } else {
                            continue;
                        }
                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                        i8 = ip.i(i17, a(t, j2));
                        break;
                    case 19:
                        i8 = ip.h(i17, a(t, j2));
                        break;
                    case v.U /*{ENCODED_INT: 20}*/:
                        i8 = ip.a(i17, (List<Long>) a(t, j2));
                        break;
                    case 21:
                        i8 = ip.b(i17, a(t, j2));
                        break;
                    case 22:
                        i8 = ip.e(i17, a(t, j2));
                        break;
                    case 23:
                        i8 = ip.i(i17, a(t, j2));
                        break;
                    case 24:
                        i8 = ip.h(i17, a(t, j2));
                        break;
                    case 25:
                        i8 = ip.j(i17, a(t, j2));
                        break;
                    case 26:
                        i8 = ip.k(i17, a(t, j2));
                        break;
                    case 27:
                        i8 = ip.a(i17, a(t, j2), a(i15));
                        break;
                    case 28:
                        i8 = ip.l(i17, a(t, j2));
                        break;
                    case 29:
                        i8 = ip.f(i17, a(t, j2));
                        break;
                    case 30:
                        i8 = ip.d(i17, a(t, j2));
                        break;
                    case 31:
                        i8 = ip.h(i17, a(t, j2));
                        break;
                    case 32:
                        i8 = ip.i(i17, a(t, j2));
                        break;
                    case 33:
                        i8 = ip.g(i17, a(t, j2));
                        break;
                    case 34:
                        i8 = ip.c(i17, a(t, j2));
                        break;
                    case 35:
                        i9 = ip.i((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.f51000k) {
                                unsafe.putInt(t, (long) i18, i9);
                            }
                            i10 = ft.m(i17 << 3);
                            i11 = ft.m(i9);
                            i8 = i10 + i11 + i9;
                            break;
                        } else {
                            continue;
                        }
                    case 36:
                        i9 = ip.h((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.f51000k) {
                                unsafe.putInt(t, (long) i18, i9);
                            }
                            i10 = ft.m(i17 << 3);
                            i11 = ft.m(i9);
                            i8 = i10 + i11 + i9;
                            break;
                        } else {
                            continue;
                        }
                    case 37:
                        i9 = ip.a((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.f51000k) {
                                unsafe.putInt(t, (long) i18, i9);
                            }
                            i10 = ft.m(i17 << 3);
                            i11 = ft.m(i9);
                            i8 = i10 + i11 + i9;
                            break;
                        } else {
                            continue;
                        }
                    case 38:
                        i9 = ip.b((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.f51000k) {
                                unsafe.putInt(t, (long) i18, i9);
                            }
                            i10 = ft.m(i17 << 3);
                            i11 = ft.m(i9);
                            i8 = i10 + i11 + i9;
                            break;
                        } else {
                            continue;
                        }
                    case 39:
                        i9 = ip.e((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.f51000k) {
                                unsafe.putInt(t, (long) i18, i9);
                            }
                            i10 = ft.m(i17 << 3);
                            i11 = ft.m(i9);
                            i8 = i10 + i11 + i9;
                            break;
                        } else {
                            continue;
                        }
                    case 40:
                        i9 = ip.i((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.f51000k) {
                                unsafe.putInt(t, (long) i18, i9);
                            }
                            i10 = ft.m(i17 << 3);
                            i11 = ft.m(i9);
                            i8 = i10 + i11 + i9;
                            break;
                        } else {
                            continue;
                        }
                    case 41:
                        i9 = ip.h((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.f51000k) {
                                unsafe.putInt(t, (long) i18, i9);
                            }
                            i10 = ft.m(i17 << 3);
                            i11 = ft.m(i9);
                            i8 = i10 + i11 + i9;
                            break;
                        } else {
                            continue;
                        }
                    case 42:
                        i9 = ((List) unsafe.getObject(t, j2)).size();
                        if (i9 > 0) {
                            if (this.f51000k) {
                                unsafe.putInt(t, (long) i18, i9);
                            }
                            i10 = ft.m(i17 << 3);
                            i11 = ft.m(i9);
                            i8 = i10 + i11 + i9;
                            break;
                        } else {
                            continue;
                        }
                    case 43:
                        i9 = ip.f((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.f51000k) {
                                unsafe.putInt(t, (long) i18, i9);
                            }
                            i10 = ft.m(i17 << 3);
                            i11 = ft.m(i9);
                            i8 = i10 + i11 + i9;
                            break;
                        } else {
                            continue;
                        }
                    case BuildConfig.VERSION_CODE:
                        i9 = ip.d((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.f51000k) {
                                unsafe.putInt(t, (long) i18, i9);
                            }
                            i10 = ft.m(i17 << 3);
                            i11 = ft.m(i9);
                            i8 = i10 + i11 + i9;
                            break;
                        } else {
                            continue;
                        }
                    case 45:
                        i9 = ip.h((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.f51000k) {
                                unsafe.putInt(t, (long) i18, i9);
                            }
                            i10 = ft.m(i17 << 3);
                            i11 = ft.m(i9);
                            i8 = i10 + i11 + i9;
                            break;
                        } else {
                            continue;
                        }
                    case 46:
                        i9 = ip.i((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.f51000k) {
                                unsafe.putInt(t, (long) i18, i9);
                            }
                            i10 = ft.m(i17 << 3);
                            i11 = ft.m(i9);
                            i8 = i10 + i11 + i9;
                            break;
                        } else {
                            continue;
                        }
                    case 47:
                        i9 = ip.g((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.f51000k) {
                                unsafe.putInt(t, (long) i18, i9);
                            }
                            i10 = ft.m(i17 << 3);
                            i11 = ft.m(i9);
                            i8 = i10 + i11 + i9;
                            break;
                        } else {
                            continue;
                        }
                    case 48:
                        i9 = ip.c((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.f51000k) {
                                unsafe.putInt(t, (long) i18, i9);
                            }
                            i10 = ft.m(i17 << 3);
                            i11 = ft.m(i9);
                            i8 = i10 + i11 + i9;
                            break;
                        } else {
                            continue;
                        }
                    case 49:
                        i8 = ip.b(i17, (List<ht>) a(t, j2), a(i15));
                        break;
                    case 50:
                        hq hqVar = this.s;
                        Object f3 = jk.f(t, j2);
                        b(i15);
                        i8 = hqVar.e(f3);
                        break;
                    case 51:
                        if (a(t, i17, i15)) {
                            i8 = ft.j(i17);
                            break;
                        } else {
                            continue;
                        }
                    case 52:
                        if (a(t, i17, i15)) {
                            i8 = ft.i(i17);
                            break;
                        } else {
                            continue;
                        }
                    case 53:
                        if (a(t, i17, i15)) {
                            i8 = ft.d(i17, e(t, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 54:
                        if (a(t, i17, i15)) {
                            i8 = ft.e(i17, e(t, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 55:
                        if (a(t, i17, i15)) {
                            i8 = ft.f(i17, d(t, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 56:
                        if (a(t, i17, i15)) {
                            i8 = ft.g(i17);
                            break;
                        } else {
                            continue;
                        }
                    case 57:
                        if (a(t, i17, i15)) {
                            i8 = ft.e(i17);
                            break;
                        } else {
                            continue;
                        }
                    case 58:
                        if (a(t, i17, i15)) {
                            i8 = ft.k(i17);
                            break;
                        } else {
                            continue;
                        }
                    case 59:
                        if (a(t, i17, i15)) {
                            Object f4 = jk.f(t, j2);
                            if (f4 instanceof fe) {
                                i8 = ft.c(i17, (fe) f4);
                                break;
                            } else {
                                i8 = ft.b(i17, (String) f4);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case AudiencePingIntervalSetting.DEFAULT:
                        if (a(t, i17, i15)) {
                            i8 = ip.a(i17, jk.f(t, j2), a(i15));
                            break;
                        } else {
                            continue;
                        }
                    case 61:
                        if (a(t, i17, i15)) {
                            i8 = ft.c(i17, (fe) jk.f(t, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 62:
                        if (a(t, i17, i15)) {
                            i8 = ft.g(i17, d(t, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 63:
                        if (a(t, i17, i15)) {
                            i8 = ft.i(i17, d(t, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 64:
                        if (a(t, i17, i15)) {
                            i8 = ft.f(i17);
                            break;
                        } else {
                            continue;
                        }
                    case 65:
                        if (a(t, i17, i15)) {
                            i8 = ft.h(i17);
                            break;
                        } else {
                            continue;
                        }
                    case 66:
                        if (a(t, i17, i15)) {
                            i8 = ft.h(i17, d(t, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 67:
                        if (a(t, i17, i15)) {
                            i8 = ft.f(i17, e(t, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 68:
                        if (a(t, i17, i15)) {
                            i8 = ft.c(i17, (ht) jk.f(t, j2), a(i15));
                            break;
                        } else {
                            continue;
                        }
                    default:
                }
                i14 += i8;
            }
            return i14 + a((je) this.q, (Object) t);
        }
        Unsafe unsafe2 = f50991b;
        int i19 = 0;
        int i20 = 0;
        int i21 = 1048575;
        int i22 = 0;
        while (i19 < this.f50992c.length) {
            int d3 = d(i19);
            int[] iArr = this.f50992c;
            int i23 = iArr[i19];
            int i24 = (d3 & i12) >>> 20;
            if (i24 <= 17) {
                i2 = iArr[i19 + 2];
                int i25 = i2 & i13;
                i3 = 1 << (i2 >>> 20);
                if (i25 != i21) {
                    i22 = unsafe2.getInt(t, (long) i25);
                    i21 = i25;
                }
            } else {
                i2 = (!this.f51000k || i24 < gg.DOUBLE_LIST_PACKED.zza() || i24 > gg.SINT64_LIST_PACKED.zza()) ? 0 : this.f50992c[i19 + 2] & i13;
                i3 = 0;
            }
            long j3 = (long) (d3 & i13);
            switch (i24) {
                case 0:
                    if ((i22 & i3) != 0) {
                        i4 = ft.j(i23);
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i22 & i3) != 0) {
                        i4 = ft.i(i23);
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i22 & i3) != 0) {
                        i4 = ft.d(i23, unsafe2.getLong(t, j3));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i22 & i3) != 0) {
                        i4 = ft.e(i23, unsafe2.getLong(t, j3));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i22 & i3) != 0) {
                        i4 = ft.f(i23, unsafe2.getInt(t, j3));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    if ((i22 & i3) != 0) {
                        i4 = ft.g(i23);
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if ((i22 & i3) != 0) {
                        i4 = ft.e(i23);
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    if ((i22 & i3) != 0) {
                        i4 = ft.k(i23);
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    if ((i22 & i3) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        i4 = object instanceof fe ? ft.c(i23, (fe) object) : ft.b(i23, (String) object);
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    if ((i22 & i3) != 0) {
                        i4 = ip.a(i23, unsafe2.getObject(t, j3), a(i19));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    if ((i22 & i3) != 0) {
                        i4 = ft.c(i23, (fe) unsafe2.getObject(t, j3));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    if ((i22 & i3) != 0) {
                        i4 = ft.g(i23, unsafe2.getInt(t, j3));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    if ((i22 & i3) != 0) {
                        i4 = ft.i(i23, unsafe2.getInt(t, j3));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    if ((i22 & i3) != 0) {
                        i4 = ft.f(i23);
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_SELECT_SCENE:
                    if ((i22 & i3) != 0) {
                        i4 = ft.h(i23);
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i22 & i3) != 0) {
                        i4 = ft.h(i23, unsafe2.getInt(t, j3));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i22 & i3) != 0) {
                        i4 = ft.f(i23, unsafe2.getLong(t, j3));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i22 & i3) != 0) {
                        i4 = ft.c(i23, (ht) unsafe2.getObject(t, j3), a(i19));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    i4 = ip.i(i23, (List) unsafe2.getObject(t, j3));
                    i20 += i4;
                    break;
                case 19:
                    i4 = ip.h(i23, (List) unsafe2.getObject(t, j3));
                    i20 += i4;
                    break;
                case v.U /*{ENCODED_INT: 20}*/:
                    i4 = ip.a(i23, (List) unsafe2.getObject(t, j3));
                    i20 += i4;
                    break;
                case 21:
                    i4 = ip.b(i23, (List) unsafe2.getObject(t, j3));
                    i20 += i4;
                    break;
                case 22:
                    i4 = ip.e(i23, (List) unsafe2.getObject(t, j3));
                    i20 += i4;
                    break;
                case 23:
                    i4 = ip.i(i23, (List) unsafe2.getObject(t, j3));
                    i20 += i4;
                    break;
                case 24:
                    i4 = ip.h(i23, (List) unsafe2.getObject(t, j3));
                    i20 += i4;
                    break;
                case 25:
                    i4 = ip.j(i23, (List) unsafe2.getObject(t, j3));
                    i20 += i4;
                    break;
                case 26:
                    i4 = ip.k(i23, (List) unsafe2.getObject(t, j3));
                    i20 += i4;
                    break;
                case 27:
                    i4 = ip.a(i23, (List<?>) ((List) unsafe2.getObject(t, j3)), a(i19));
                    i20 += i4;
                    break;
                case 28:
                    i4 = ip.l(i23, (List) unsafe2.getObject(t, j3));
                    i20 += i4;
                    break;
                case 29:
                    i4 = ip.f(i23, (List) unsafe2.getObject(t, j3));
                    i20 += i4;
                    break;
                case 30:
                    i4 = ip.d(i23, (List) unsafe2.getObject(t, j3));
                    i20 += i4;
                    break;
                case 31:
                    i4 = ip.h(i23, (List) unsafe2.getObject(t, j3));
                    i20 += i4;
                    break;
                case 32:
                    i4 = ip.i(i23, (List) unsafe2.getObject(t, j3));
                    i20 += i4;
                    break;
                case 33:
                    i4 = ip.g(i23, (List) unsafe2.getObject(t, j3));
                    i20 += i4;
                    break;
                case 34:
                    i4 = ip.c(i23, (List) unsafe2.getObject(t, j3));
                    i20 += i4;
                    break;
                case 35:
                    i5 = ip.i((List) unsafe2.getObject(t, j3));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f51000k) {
                            unsafe2.putInt(t, (long) i2, i5);
                        }
                        i6 = ft.m(i23 << 3);
                        i7 = ft.m(i5);
                        i20 += i6 + i7 + i5;
                        break;
                    }
                case 36:
                    i5 = ip.h((List) unsafe2.getObject(t, j3));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f51000k) {
                            unsafe2.putInt(t, (long) i2, i5);
                        }
                        i6 = ft.m(i23 << 3);
                        i7 = ft.m(i5);
                        i20 += i6 + i7 + i5;
                        break;
                    }
                case 37:
                    i5 = ip.a((List) unsafe2.getObject(t, j3));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f51000k) {
                            unsafe2.putInt(t, (long) i2, i5);
                        }
                        i6 = ft.m(i23 << 3);
                        i7 = ft.m(i5);
                        i20 += i6 + i7 + i5;
                        break;
                    }
                case 38:
                    i5 = ip.b((List) unsafe2.getObject(t, j3));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f51000k) {
                            unsafe2.putInt(t, (long) i2, i5);
                        }
                        i6 = ft.m(i23 << 3);
                        i7 = ft.m(i5);
                        i20 += i6 + i7 + i5;
                        break;
                    }
                case 39:
                    i5 = ip.e((List) unsafe2.getObject(t, j3));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f51000k) {
                            unsafe2.putInt(t, (long) i2, i5);
                        }
                        i6 = ft.m(i23 << 3);
                        i7 = ft.m(i5);
                        i20 += i6 + i7 + i5;
                        break;
                    }
                case 40:
                    i5 = ip.i((List) unsafe2.getObject(t, j3));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f51000k) {
                            unsafe2.putInt(t, (long) i2, i5);
                        }
                        i6 = ft.m(i23 << 3);
                        i7 = ft.m(i5);
                        i20 += i6 + i7 + i5;
                        break;
                    }
                case 41:
                    i5 = ip.h((List) unsafe2.getObject(t, j3));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f51000k) {
                            unsafe2.putInt(t, (long) i2, i5);
                        }
                        i6 = ft.m(i23 << 3);
                        i7 = ft.m(i5);
                        i20 += i6 + i7 + i5;
                        break;
                    }
                case 42:
                    i5 = ((List) unsafe2.getObject(t, j3)).size();
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f51000k) {
                            unsafe2.putInt(t, (long) i2, i5);
                        }
                        i6 = ft.m(i23 << 3);
                        i7 = ft.m(i5);
                        i20 += i6 + i7 + i5;
                        break;
                    }
                case 43:
                    i5 = ip.f((List) unsafe2.getObject(t, j3));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f51000k) {
                            unsafe2.putInt(t, (long) i2, i5);
                        }
                        i6 = ft.m(i23 << 3);
                        i7 = ft.m(i5);
                        i20 += i6 + i7 + i5;
                        break;
                    }
                case BuildConfig.VERSION_CODE:
                    i5 = ip.d((List) unsafe2.getObject(t, j3));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f51000k) {
                            unsafe2.putInt(t, (long) i2, i5);
                        }
                        i6 = ft.m(i23 << 3);
                        i7 = ft.m(i5);
                        i20 += i6 + i7 + i5;
                        break;
                    }
                case 45:
                    i5 = ip.h((List) unsafe2.getObject(t, j3));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f51000k) {
                            unsafe2.putInt(t, (long) i2, i5);
                        }
                        i6 = ft.m(i23 << 3);
                        i7 = ft.m(i5);
                        i20 += i6 + i7 + i5;
                        break;
                    }
                case 46:
                    i5 = ip.i((List) unsafe2.getObject(t, j3));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f51000k) {
                            unsafe2.putInt(t, (long) i2, i5);
                        }
                        i6 = ft.m(i23 << 3);
                        i7 = ft.m(i5);
                        i20 += i6 + i7 + i5;
                        break;
                    }
                case 47:
                    i5 = ip.g((List) unsafe2.getObject(t, j3));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f51000k) {
                            unsafe2.putInt(t, (long) i2, i5);
                        }
                        i6 = ft.m(i23 << 3);
                        i7 = ft.m(i5);
                        i20 += i6 + i7 + i5;
                        break;
                    }
                case 48:
                    i5 = ip.c((List) unsafe2.getObject(t, j3));
                    if (i5 <= 0) {
                        break;
                    } else {
                        if (this.f51000k) {
                            unsafe2.putInt(t, (long) i2, i5);
                        }
                        i6 = ft.m(i23 << 3);
                        i7 = ft.m(i5);
                        i20 += i6 + i7 + i5;
                        break;
                    }
                case 49:
                    i4 = ip.b(i23, (List) unsafe2.getObject(t, j3), a(i19));
                    i20 += i4;
                    break;
                case 50:
                    hq hqVar2 = this.s;
                    Object object2 = unsafe2.getObject(t, j3);
                    b(i19);
                    i4 = hqVar2.e(object2);
                    i20 += i4;
                    break;
                case 51:
                    if (a(t, i23, i19)) {
                        i4 = ft.j(i23);
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (a(t, i23, i19)) {
                        i4 = ft.i(i23);
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (a(t, i23, i19)) {
                        i4 = ft.d(i23, e(t, j3));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (a(t, i23, i19)) {
                        i4 = ft.e(i23, e(t, j3));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (a(t, i23, i19)) {
                        i4 = ft.f(i23, d(t, j3));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (a(t, i23, i19)) {
                        i4 = ft.g(i23);
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (a(t, i23, i19)) {
                        i4 = ft.e(i23);
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (a(t, i23, i19)) {
                        i4 = ft.k(i23);
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (a(t, i23, i19)) {
                        Object object3 = unsafe2.getObject(t, j3);
                        if (object3 instanceof fe) {
                            i4 = ft.c(i23, (fe) object3);
                        } else {
                            i4 = ft.b(i23, (String) object3);
                        }
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case AudiencePingIntervalSetting.DEFAULT:
                    if (a(t, i23, i19)) {
                        i4 = ip.a(i23, unsafe2.getObject(t, j3), a(i19));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (a(t, i23, i19)) {
                        i4 = ft.c(i23, (fe) unsafe2.getObject(t, j3));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (a(t, i23, i19)) {
                        i4 = ft.g(i23, d(t, j3));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (a(t, i23, i19)) {
                        i4 = ft.i(i23, d(t, j3));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (a(t, i23, i19)) {
                        i4 = ft.f(i23);
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (a(t, i23, i19)) {
                        i4 = ft.h(i23);
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (a(t, i23, i19)) {
                        i4 = ft.h(i23, d(t, j3));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (a(t, i23, i19)) {
                        i4 = ft.f(i23, e(t, j3));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (a(t, i23, i19)) {
                        i4 = ft.c(i23, (ht) unsafe2.getObject(t, j3), a(i19));
                        i20 += i4;
                        break;
                    } else {
                        break;
                    }
            }
            i19 += 3;
            i12 = 267386880;
            i13 = 1048575;
        }
        int a2 = i20 + a((je) this.q, (Object) t);
        if (!this.f50997h) {
            return a2;
        }
        gb<?> a3 = this.r.a((Object) t);
        int i26 = 0;
        for (int i27 = 0; i27 < a3.f50902a.b(); i27++) {
            Map.Entry<T, Object> b2 = a3.f50902a.b(i27);
            i26 += gb.a((gd<?>) b2.getKey(), b2.getValue());
        }
        for (Map.Entry<T, Object> entry : a3.f50902a.c()) {
            i26 += gb.a((gd<?>) entry.getKey(), entry.getValue());
        }
        return a2 + i26;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x052c  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0565  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0a3e  */
    @Override // com.google.android.gms.internal.measurement.in
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r13, com.google.android.gms.internal.measurement.jw r14) {
        /*
        // Method dump skipped, instructions count: 2934
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.hx.a(java.lang.Object, com.google.android.gms.internal.measurement.jw):void");
    }

    private final <K, V> void a(jw jwVar, int i2, Object obj, int i3) {
        if (obj != null) {
            hq hqVar = this.s;
            b(i3);
            jwVar.a(i2, hqVar.a(), this.s.b(obj));
        }
    }

    private static <UT, UB> void a(je<UT, UB> jeVar, T t, jw jwVar) {
        jeVar.a(jeVar.b(t), jwVar);
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.isSame(InsnNode.java:303)
        	at jadx.core.dex.instructions.IfNode.isSame(IfNode.java:122)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    @Override // com.google.android.gms.internal.measurement.in
    public final void a(T r12, com.google.android.gms.internal.measurement.ij r13, com.google.android.gms.internal.measurement.fy r14) {
        /*
        // Method dump skipped, instructions count: 1574
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.hx.a(java.lang.Object, com.google.android.gms.internal.measurement.ij, com.google.android.gms.internal.measurement.fy):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [int] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02f9, code lost:
        if (r7 == r4) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x031f, code lost:
        if (r7 == r4) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x036f, code lost:
        r10 = r46;
        r6 = r20;
        r1 = r18;
        r4 = r50;
        r14 = r51;
        r3 = r52;
        r19 = r36;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(T r47, byte[] r48, int r49, int r50, int r51, com.google.android.gms.internal.measurement.ez r52) {
        /*
        // Method dump skipped, instructions count: 1024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.hx.a(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.ez):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x025f, code lost:
        if (r5 == r11) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0286, code lost:
        if (r5 == r11) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x023e, code lost:
        if (r5 == r5) goto L_0x0044;
     */
    @Override // com.google.android.gms.internal.measurement.in
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r36, byte[] r37, int r38, int r39, com.google.android.gms.internal.measurement.ez r40) {
        /*
        // Method dump skipped, instructions count: 742
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.hx.a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.ez):void");
    }

    private final <UT, UB> UB a(Object obj, int i2, UB ub, je<UT, UB> jeVar) {
        gq c2;
        int i3 = this.f50992c[i2];
        Object f2 = jk.f(obj, (long) (d(i2) & 1048575));
        return (f2 == null || (c2 = c(i2)) == null) ? ub : (UB) a(i2, i3, (Map<K, V>) this.s.a(f2), c2, ub, jeVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.internal.measurement.in */
    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(Object obj, int i2, in inVar) {
        return inVar.d(jk.f(obj, (long) (i2 & 1048575)));
    }

    private static void a(int i2, Object obj, jw jwVar) {
        if (obj instanceof String) {
            jwVar.a(i2, (String) obj);
        } else {
            jwVar.a(i2, (fe) obj);
        }
    }

    private final void a(Object obj, int i2, ij ijVar) {
        if (f(i2)) {
            jk.a(obj, (long) (i2 & 1048575), ijVar.m());
        } else if (this.f50998i) {
            jk.a(obj, (long) (i2 & 1048575), ijVar.l());
        } else {
            jk.a(obj, (long) (i2 & 1048575), ijVar.n());
        }
    }

    private final boolean a(T t, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return a((Object) t, i2);
        }
        return (i4 & i5) != 0;
    }

    private final boolean a(T t, int i2) {
        int e2 = e(i2);
        long j2 = (long) (e2 & 1048575);
        if (j2 == 1048575) {
            int d2 = d(i2);
            long j3 = (long) (d2 & 1048575);
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    return jk.e(t, j3) != 0.0d;
                case 1:
                    return jk.d(t, j3) != 0.0f;
                case 2:
                    return jk.b(t, j3) != 0;
                case 3:
                    return jk.b(t, j3) != 0;
                case 4:
                    return jk.a(t, j3) != 0;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    return jk.b(t, j3) != 0;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return jk.a(t, j3) != 0;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    return jk.c(t, j3);
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    Object f2 = jk.f(t, j3);
                    if (f2 instanceof String) {
                        return !((String) f2).isEmpty();
                    }
                    if (f2 instanceof fe) {
                        return !fe.zza.equals(f2);
                    }
                    throw new IllegalArgumentException();
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return jk.f(t, j3) != null;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    return !fe.zza.equals(jk.f(t, j3));
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    return jk.a(t, j3) != 0;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    return jk.a(t, j3) != 0;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    return jk.a(t, j3) != 0;
                case ABRConfig.ABR_SELECT_SCENE:
                    return jk.b(t, j3) != 0;
                case 15:
                    return jk.a(t, j3) != 0;
                case 16:
                    return jk.b(t, j3) != 0;
                case 17:
                    return jk.f(t, j3) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (jk.a(t, j2) & (1 << (e2 >>> 20))) != 0;
        }
    }

    private final boolean a(T t, int i2, int i3) {
        return jk.a(t, (long) (e(i3) & 1048575)) == i2;
    }

    static {
        Covode.recordClassIndex(31863);
    }

    private final int d(int i2) {
        return this.f50992c[i2 + 1];
    }

    private final int e(int i2) {
        return this.f50992c[i2 + 2];
    }

    private final int g(int i2) {
        if (i2 < this.f50994e || i2 > this.f50995f) {
            return -1;
        }
        return b(i2, 0);
    }

    private final gq c(int i2) {
        return (gq) this.f50993d[((i2 / 3) << 1) + 1];
    }

    private static jd e(Object obj) {
        gm gmVar = (gm) obj;
        jd jdVar = gmVar.zzb;
        if (jdVar != jd.f51055a) {
            return jdVar;
        }
        jd jdVar2 = new jd();
        gmVar.zzb = jdVar2;
        return jdVar2;
    }

    private final in a(int i2) {
        int i3 = (i2 / 3) << 1;
        in inVar = (in) this.f50993d[i3];
        if (inVar != null) {
            return inVar;
        }
        in<T> a2 = ii.f51018a.a((Class) ((Class) this.f50993d[i3 + 1]));
        this.f50993d[i3] = a2;
        return a2;
    }

    private final Object b(int i2) {
        return this.f50993d[(i2 / 3) << 1];
    }

    @Override // com.google.android.gms.internal.measurement.in
    public final void c(T t) {
        int i2;
        int i3 = this.f51002m;
        while (true) {
            i2 = this.n;
            if (i3 >= i2) {
                break;
            }
            long d2 = (long) (d(this.f51001l[i3]) & 1048575);
            Object f2 = jk.f(t, d2);
            if (f2 != null) {
                jk.a(t, d2, this.s.d(f2));
            }
            i3++;
        }
        int length = this.f51001l.length;
        while (i2 < length) {
            this.p.b(t, (long) this.f51001l[i2]);
            i2++;
        }
        this.q.d(t);
        if (this.f50997h) {
            this.r.c(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.measurement.in] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.measurement.in] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.measurement.in
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(T r17) {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.hx.d(java.lang.Object):boolean");
    }

    private static List<?> a(Object obj, long j2) {
        return (List) jk.f(obj, j2);
    }

    private final int a(int i2, int i3) {
        if (i2 < this.f50994e || i2 > this.f50995f) {
            return -1;
        }
        return b(i2, i3);
    }

    private static <T> double b(T t, long j2) {
        return ((Double) jk.f(t, j2)).doubleValue();
    }

    private static <T> float c(T t, long j2) {
        return ((Float) jk.f(t, j2)).floatValue();
    }

    private static <T> int d(T t, long j2) {
        return ((Integer) jk.f(t, j2)).intValue();
    }

    private static <T> long e(T t, long j2) {
        return ((Long) jk.f(t, j2)).longValue();
    }

    private static <UT, UB> int a(je<UT, UB> jeVar, T t) {
        return jeVar.f(jeVar.b(t));
    }

    private final int b(int i2, int i3) {
        int length = (this.f50992c.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.f50992c[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private static <T> boolean f(T t, long j2) {
        return ((Boolean) jk.f(t, j2)).booleanValue();
    }

    private final void b(T t, int i2) {
        int e2 = e(i2);
        long j2 = (long) (1048575 & e2);
        if (j2 != 1048575) {
            jk.a((Object) t, j2, (1 << (e2 >>> 20)) | jk.a(t, j2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.in
    public final void b(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i2 = 0; i2 < this.f50992c.length; i2 += 3) {
            int d2 = d(i2);
            long j2 = (long) (1048575 & d2);
            int i3 = this.f50992c[i2];
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    if (a((Object) t2, i2)) {
                        jk.a(t, j2, jk.e(t2, j2));
                        b((Object) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (a((Object) t2, i2)) {
                        jk.a((Object) t, j2, jk.d(t2, j2));
                        b((Object) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (a((Object) t2, i2)) {
                        jk.a((Object) t, j2, jk.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (a((Object) t2, i2)) {
                        jk.a((Object) t, j2, jk.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (a((Object) t2, i2)) {
                        jk.a((Object) t, j2, jk.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    if (a((Object) t2, i2)) {
                        jk.a((Object) t, j2, jk.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if (a((Object) t2, i2)) {
                        jk.a((Object) t, j2, jk.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    if (a((Object) t2, i2)) {
                        jk.a(t, j2, jk.c(t2, j2));
                        b((Object) t, i2);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    if (a((Object) t2, i2)) {
                        jk.a(t, j2, jk.f(t2, j2));
                        b((Object) t, i2);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    a(t, t2, i2);
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    if (a((Object) t2, i2)) {
                        jk.a(t, j2, jk.f(t2, j2));
                        b((Object) t, i2);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    if (a((Object) t2, i2)) {
                        jk.a((Object) t, j2, jk.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    if (a((Object) t2, i2)) {
                        jk.a((Object) t, j2, jk.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    if (a((Object) t2, i2)) {
                        jk.a((Object) t, j2, jk.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_SELECT_SCENE:
                    if (a((Object) t2, i2)) {
                        jk.a((Object) t, j2, jk.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (a((Object) t2, i2)) {
                        jk.a((Object) t, j2, jk.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (a((Object) t2, i2)) {
                        jk.a((Object) t, j2, jk.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    a(t, t2, i2);
                    break;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                case 19:
                case v.U /*{ENCODED_INT: 20}*/:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case BuildConfig.VERSION_CODE:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.p.a(t, t2, j2);
                    break;
                case 50:
                    jk.a(t, j2, this.s.a(jk.f(t, j2), jk.f(t2, j2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (a(t2, i3, i2)) {
                        jk.a(t, j2, jk.f(t2, j2));
                        b(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case AudiencePingIntervalSetting.DEFAULT:
                    b(t, t2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (a(t2, i3, i2)) {
                        jk.a(t, j2, jk.f(t2, j2));
                        b(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    b(t, t2, i2);
                    break;
            }
        }
        ip.a(this.q, t, t2);
        if (this.f50997h) {
            ip.a(this.r, t, t2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(T r18, com.google.android.gms.internal.measurement.jw r19) {
        /*
        // Method dump skipped, instructions count: 1346
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.hx.b(java.lang.Object, com.google.android.gms.internal.measurement.jw):void");
    }

    private final boolean c(T t, T t2, int i2) {
        if (a((Object) t, i2) == a((Object) t2, i2)) {
            return true;
        }
        return false;
    }

    private final void b(T t, int i2, int i3) {
        jk.a((Object) t, (long) (e(i3) & 1048575), i2);
    }

    private final void b(T t, T t2, int i2) {
        int d2 = d(i2);
        int i3 = this.f50992c[i2];
        long j2 = (long) (d2 & 1048575);
        if (a(t2, i3, i2)) {
            Object f2 = jk.f(t, j2);
            Object f3 = jk.f(t2, j2);
            if (f2 != null) {
                if (f3 != null) {
                    jk.a(t, j2, gp.a(f2, f3));
                    b(t, i3, i2);
                }
            } else if (f3 != null) {
                jk.a(t, j2, f3);
                b(t, i3, i2);
            }
        }
    }

    private final <K, V, UT, UB> UB a(int i2, int i3, Map<K, V> map, gq gqVar, UB ub, je<UT, UB> jeVar) {
        hq hqVar = this.s;
        b(i2);
        ho<?, ?> a2 = hqVar.a();
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!gqVar.a(next.getValue().intValue())) {
                if (ub == null) {
                    ub = jeVar.a();
                }
                fn b2 = fe.b(hl.a(a2, next.getKey(), next.getValue()));
                try {
                    hl.a(b2.f50864a, a2, next.getKey(), next.getValue());
                    jeVar.a(ub, i3, b2.a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    private static int a(byte[] bArr, int i2, int i3, jr jrVar, Class<?> cls, ez ezVar) {
        boolean z;
        switch (ia.f51012a[jrVar.ordinal()]) {
            case 1:
                int b2 = fa.b(bArr, i2, ezVar);
                if (ezVar.f50833b != 0) {
                    z = true;
                } else {
                    z = false;
                }
                ezVar.f50834c = Boolean.valueOf(z);
                return b2;
            case 2:
                return fa.e(bArr, i2, ezVar);
            case 3:
                ezVar.f50834c = Double.valueOf(fa.c(bArr, i2));
                return i2 + 8;
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                ezVar.f50834c = Integer.valueOf(fa.a(bArr, i2));
                return i2 + 4;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                ezVar.f50834c = Long.valueOf(fa.b(bArr, i2));
                return i2 + 8;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                ezVar.f50834c = Float.valueOf(fa.d(bArr, i2));
                return i2 + 4;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                int a2 = fa.a(bArr, i2, ezVar);
                ezVar.f50834c = Integer.valueOf(ezVar.f50832a);
                return a2;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                int b3 = fa.b(bArr, i2, ezVar);
                ezVar.f50834c = Long.valueOf(ezVar.f50833b);
                return b3;
            case ABRConfig.ABR_SELECT_SCENE:
                return fa.a(ii.f51018a.a((Class) cls), bArr, i2, i3, ezVar);
            case 15:
                int a3 = fa.a(bArr, i2, ezVar);
                ezVar.f50834c = Integer.valueOf(fq.e(ezVar.f50832a));
                return a3;
            case 16:
                int b4 = fa.b(bArr, i2, ezVar);
                ezVar.f50834c = Long.valueOf(fq.a(ezVar.f50833b));
                return b4;
            case 17:
                return fa.d(bArr, i2, ezVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x004b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x004b */
    private final <K, V> int a(T t, byte[] bArr, int i2, int i3, int i4, long j2, ez ezVar) {
        Unsafe unsafe = f50991b;
        b(i4);
        Object object = unsafe.getObject(t, j2);
        if (this.s.c(object)) {
            Object b2 = this.s.b();
            this.s.a(b2, object);
            unsafe.putObject(t, j2, b2);
            object = b2;
        }
        ho<?, ?> a2 = this.s.a();
        Map<?, ?> a3 = this.s.a(object);
        int a4 = fa.a(bArr, i2, ezVar);
        int i5 = ezVar.f50832a;
        if (i5 < 0 || i5 > i3 - a4) {
            throw gu.a();
        }
        int i6 = i5 + a4;
        a.C2715a aVar = (K) a2.f50985b;
        a.C2715a aVar2 = (V) a2.f50987d;
        while (a4 < i6) {
            int i7 = a4 + 1;
            byte b3 = bArr[a4];
            int i8 = b3;
            if (b3 < 0) {
                i7 = fa.a(b3, bArr, i7, ezVar);
                i8 = ezVar.f50832a;
            }
            int i9 = (i8 == 1 ? 1 : 0) >>> 3;
            int i10 = (i8 == 1 ? 1 : 0) & 7;
            if (i9 != 1) {
                if (i9 == 2 && i10 == a2.f50986c.zzb()) {
                    a4 = a(bArr, i7, i3, a2.f50986c, a2.f50987d.getClass(), ezVar);
                    aVar2 = (V) ezVar.f50834c;
                }
            } else if (i10 == a2.f50984a.zzb()) {
                a4 = a(bArr, i7, i3, a2.f50984a, (Class<?>) null, ezVar);
                aVar = (K) ezVar.f50834c;
            }
            a4 = fa.a(i8, bArr, i7, i3, ezVar);
        }
        if (a4 == i6) {
            a3.put(aVar, aVar2);
            return i6;
        }
        throw gu.g();
    }

    private final int a(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, ez ezVar) {
        boolean z;
        Object object;
        Object object2;
        int i10 = i2;
        Unsafe unsafe = f50991b;
        long j3 = (long) (this.f50992c[i9 + 2] & 1048575);
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Double.valueOf(fa.c(bArr, i10)));
                    i10 += 8;
                    unsafe.putInt(t, j3, i5);
                    break;
                }
                break;
            case 52:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Float.valueOf(fa.d(bArr, i10)));
                    i10 += 4;
                    unsafe.putInt(t, j3, i5);
                    break;
                }
                break;
            case 53:
            case 54:
                if (i6 == 0) {
                    i10 = fa.b(bArr, i10, ezVar);
                    unsafe.putObject(t, j2, Long.valueOf(ezVar.f50833b));
                    unsafe.putInt(t, j3, i5);
                    break;
                }
                break;
            case 55:
            case 62:
                if (i6 == 0) {
                    i10 = fa.a(bArr, i10, ezVar);
                    unsafe.putObject(t, j2, Integer.valueOf(ezVar.f50832a));
                    unsafe.putInt(t, j3, i5);
                    break;
                }
                break;
            case 56:
            case 65:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Long.valueOf(fa.b(bArr, i10)));
                    i10 += 8;
                    unsafe.putInt(t, j3, i5);
                    break;
                }
                break;
            case 57:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Integer.valueOf(fa.a(bArr, i10)));
                    i10 += 4;
                    unsafe.putInt(t, j3, i5);
                    break;
                }
                break;
            case 58:
                if (i6 == 0) {
                    i10 = fa.b(bArr, i10, ezVar);
                    if (ezVar.f50833b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(t, j2, Boolean.valueOf(z));
                    unsafe.putInt(t, j3, i5);
                    break;
                }
                break;
            case 59:
                if (i6 == 2) {
                    i10 = fa.a(bArr, i10, ezVar);
                    int i11 = ezVar.f50832a;
                    if (i11 == 0) {
                        unsafe.putObject(t, j2, "");
                    } else if ((i7 & 536870912) == 0 || jm.a(bArr, i10, i10 + i11)) {
                        unsafe.putObject(t, j2, new String(bArr, i10, i11, gp.f50957a));
                        i10 += i11;
                    } else {
                        throw gu.h();
                    }
                    unsafe.putInt(t, j3, i5);
                    break;
                }
                break;
            case AudiencePingIntervalSetting.DEFAULT:
                if (i6 == 2) {
                    i10 = fa.a(a(i9), bArr, i10, i3, ezVar);
                    if (unsafe.getInt(t, j3) != i5 || (object = unsafe.getObject(t, j2)) == null) {
                        unsafe.putObject(t, j2, ezVar.f50834c);
                    } else {
                        unsafe.putObject(t, j2, gp.a(object, ezVar.f50834c));
                    }
                    unsafe.putInt(t, j3, i5);
                    break;
                }
                break;
            case 61:
                if (i6 == 2) {
                    i10 = fa.e(bArr, i10, ezVar);
                    unsafe.putObject(t, j2, ezVar.f50834c);
                    unsafe.putInt(t, j3, i5);
                    break;
                }
                break;
            case 63:
                if (i6 == 0) {
                    i10 = fa.a(bArr, i10, ezVar);
                    int i12 = ezVar.f50832a;
                    gq c2 = c(i9);
                    if (c2 != null && !c2.a(i12)) {
                        e(t).a(i4, Long.valueOf((long) i12));
                        break;
                    } else {
                        unsafe.putObject(t, j2, Integer.valueOf(i12));
                        unsafe.putInt(t, j3, i5);
                        break;
                    }
                }
                break;
            case 66:
                if (i6 == 0) {
                    i10 = fa.a(bArr, i10, ezVar);
                    unsafe.putObject(t, j2, Integer.valueOf(fq.e(ezVar.f50832a)));
                    unsafe.putInt(t, j3, i5);
                    break;
                }
                break;
            case 67:
                if (i6 == 0) {
                    i10 = fa.b(bArr, i10, ezVar);
                    unsafe.putObject(t, j2, Long.valueOf(fq.a(ezVar.f50833b)));
                    unsafe.putInt(t, j3, i5);
                    break;
                }
                break;
            case 68:
                if (i6 == 3) {
                    i10 = fa.a(a(i9), bArr, i10, i3, (i4 & -8) | 4, ezVar);
                    if (unsafe.getInt(t, j3) != i5 || (object2 = unsafe.getObject(t, j2)) == null) {
                        unsafe.putObject(t, j2, ezVar.f50834c);
                    } else {
                        unsafe.putObject(t, j2, gp.a(object2, ezVar.f50834c));
                    }
                    unsafe.putInt(t, j3, i5);
                    break;
                }
                break;
        }
        return i10;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0039 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x018f  */
    private final int a(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.ez r29) {
        /*
        // Method dump skipped, instructions count: 1072
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.hx.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.ez):int");
    }

    private hx(int[] iArr, Object[] objArr, int i2, int i3, ht htVar, boolean z, int[] iArr2, int i4, int i5, ib ibVar, hd hdVar, je<?, ?> jeVar, ga<?> gaVar, hq hqVar) {
        boolean z2;
        this.f50992c = iArr;
        this.f50993d = objArr;
        this.f50994e = i2;
        this.f50995f = i3;
        this.f50998i = htVar instanceof gm;
        this.f50999j = z;
        if (gaVar == null || !gaVar.a(htVar)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f50997h = z2;
        this.f51000k = false;
        this.f51001l = iArr2;
        this.f51002m = i4;
        this.n = i5;
        this.o = ibVar;
        this.p = hdVar;
        this.q = jeVar;
        this.r = gaVar;
        this.f50996g = htVar;
        this.s = hqVar;
    }
}
