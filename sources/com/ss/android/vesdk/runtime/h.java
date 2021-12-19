package com.ss.android.vesdk.runtime;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.clipparam.VEClipParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VERepeatFilterParam;
import com.ss.android.vesdk.filterparam.VESlowMotionFilterParam;
import java.util.ArrayList;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static String f151456a = "VETimeEffectManager";

    /* renamed from: b  reason: collision with root package name */
    public static int f151457b;

    /* renamed from: c  reason: collision with root package name */
    public static int f151458c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static int f151459d = 2;

    /* renamed from: e  reason: collision with root package name */
    public b f151460e;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public List<a> f151471a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f151472b;

        /* renamed from: c  reason: collision with root package name */
        public List<a> f151473c;

        /* renamed from: d  reason: collision with root package name */
        public List<a> f151474d;

        /* renamed from: e  reason: collision with root package name */
        int f151475e;

        /* renamed from: f  reason: collision with root package name */
        public int f151476f;

        /* renamed from: g  reason: collision with root package name */
        public VEBaseFilterParam f151477g;

        static {
            Covode.recordClassIndex(99585);
        }
    }

    static {
        Covode.recordClassIndex(99583);
    }

    public h() {
        b bVar = new b();
        this.f151460e = bVar;
        bVar.f151471a = new ArrayList();
        this.f151460e.f151472b = new ArrayList();
        this.f151460e.f151473c = new ArrayList();
        this.f151460e.f151474d = new ArrayList();
        this.f151460e.f151477g = null;
        this.f151460e.f151475e = -1;
        this.f151460e.f151476f = -1;
    }

    public final void a() {
        this.f151460e.f151471a.clear();
        this.f151460e.f151472b.clear();
        this.f151460e.f151473c.clear();
        this.f151460e.f151474d.clear();
        this.f151460e.f151477g = null;
        this.f151460e.f151475e = -1;
        this.f151460e.f151476f = -1;
    }

    public final int b() {
        if (this.f151460e.f151477g == null) {
            return f151457b;
        }
        if (this.f151460e.f151477g instanceof VERepeatFilterParam) {
            return f151458c;
        }
        if (this.f151460e.f151477g instanceof VESlowMotionFilterParam) {
            return f151459d;
        }
        return f151457b;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f151461a;

        /* renamed from: b  reason: collision with root package name */
        int f151462b;

        /* renamed from: c  reason: collision with root package name */
        String f151463c;

        /* renamed from: d  reason: collision with root package name */
        int f151464d;

        /* renamed from: e  reason: collision with root package name */
        int f151465e;

        /* renamed from: f  reason: collision with root package name */
        int f151466f;

        /* renamed from: g  reason: collision with root package name */
        int f151467g;

        /* renamed from: h  reason: collision with root package name */
        int f151468h;

        /* renamed from: i  reason: collision with root package name */
        double f151469i;

        /* renamed from: j  reason: collision with root package name */
        int f151470j;

        static {
            Covode.recordClassIndex(99584);
        }

        public final String toString() {
            return "Clip: clipType" + this.f151462b + " path=" + this.f151463c + " seqin=" + this.f151465e + " seqout=" + this.f151466f + " trimIn=" + this.f151467g + " trimOut=" + this.f151468h + " speed=" + this.f151469i + " clipRotate=" + this.f151470j;
        }

        public a(int i2, int i3, String str, int i4, int i5, int i6, int i7, int i8, double d2, int i9) {
            this.f151461a = i2;
            this.f151462b = i3;
            this.f151464d = i4;
            this.f151465e = i5;
            this.f151466f = i6;
            this.f151467g = i7;
            this.f151468h = i8;
            this.f151469i = d2;
            this.f151463c = str;
            this.f151470j = i9;
        }
    }

    private static List<a> a(VEBaseFilterParam vEBaseFilterParam, List<a> list) {
        ArrayList arrayList = new ArrayList();
        if (vEBaseFilterParam instanceof VERepeatFilterParam) {
            VERepeatFilterParam vERepeatFilterParam = (VERepeatFilterParam) vEBaseFilterParam;
            int i2 = vERepeatFilterParam.seqIn;
            int i3 = vERepeatFilterParam.seqIn + vERepeatFilterParam.repeatDuration;
            float f2 = (float) vERepeatFilterParam.repeatTime;
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            for (a aVar : list) {
                if (aVar.f151465e >= i3 || aVar.f151466f <= i2) {
                    arrayList2.add(new a(f151457b, aVar.f151462b, aVar.f151463c, i4, aVar.f151465e, aVar.f151466f, aVar.f151467g, aVar.f151468h, aVar.f151469i, aVar.f151470j));
                } else if (aVar.f151465e >= i2 && aVar.f151466f <= i3) {
                    arrayList2.add(new a(f151458c, aVar.f151462b, aVar.f151463c, i4, aVar.f151465e, aVar.f151466f, aVar.f151467g, aVar.f151468h, aVar.f151469i, aVar.f151470j));
                } else if (aVar.f151465e < i2 && aVar.f151466f > i3) {
                    int i5 = aVar.f151467g;
                    double d2 = (double) (i2 - aVar.f151465e);
                    double d3 = aVar.f151469i;
                    Double.isNaN(d2);
                    int i6 = i5 + ((int) (d2 * d3));
                    int i7 = aVar.f151467g;
                    double d4 = (double) (i3 - aVar.f151465e);
                    double d5 = aVar.f151469i;
                    Double.isNaN(d4);
                    int i8 = i7 + ((int) (d4 * d5));
                    arrayList2.add(new a(f151457b, aVar.f151462b, aVar.f151463c, i4, aVar.f151465e, aVar.f151466f, aVar.f151467g, i6, aVar.f151469i, aVar.f151470j));
                    arrayList2.add(new a(f151458c, aVar.f151462b, aVar.f151463c, i4, aVar.f151465e, aVar.f151466f, i6, i8, aVar.f151469i, aVar.f151470j));
                    arrayList2.add(new a(f151457b, aVar.f151462b, aVar.f151463c, i4, aVar.f151465e, aVar.f151466f, i8, aVar.f151468h, aVar.f151469i, aVar.f151470j));
                } else if (aVar.f151465e == i2 && aVar.f151466f > i3) {
                    int i9 = aVar.f151467g;
                    double d6 = (double) (i3 - aVar.f151465e);
                    double d7 = aVar.f151469i;
                    Double.isNaN(d6);
                    int i10 = i9 + ((int) (d6 * d7));
                    arrayList2.add(new a(f151458c, aVar.f151462b, aVar.f151463c, i4, aVar.f151465e, aVar.f151466f, aVar.f151467g, i10, aVar.f151469i, aVar.f151470j));
                    arrayList2.add(new a(f151457b, aVar.f151462b, aVar.f151463c, i4, aVar.f151465e, aVar.f151466f, i10, aVar.f151468h, aVar.f151469i, aVar.f151470j));
                } else if (aVar.f151465e < i2 && aVar.f151466f == i3) {
                    int i11 = aVar.f151467g;
                    double d8 = (double) (i2 - aVar.f151465e);
                    double d9 = aVar.f151469i;
                    Double.isNaN(d8);
                    int i12 = i11 + ((int) (d8 * d9));
                    arrayList2.add(new a(f151457b, aVar.f151462b, aVar.f151463c, i4, aVar.f151465e, aVar.f151466f, aVar.f151467g, i12, aVar.f151469i, aVar.f151470j));
                    arrayList2.add(new a(f151458c, aVar.f151462b, aVar.f151463c, i4, aVar.f151465e, aVar.f151466f, i12, aVar.f151468h, aVar.f151469i, aVar.f151470j));
                } else if (aVar.f151465e < i2 && aVar.f151466f > i2 && aVar.f151466f < i3) {
                    int i13 = aVar.f151467g;
                    double d10 = (double) (i2 - aVar.f151465e);
                    double d11 = aVar.f151469i;
                    Double.isNaN(d10);
                    int i14 = i13 + ((int) (d10 * d11));
                    arrayList2.add(new a(f151457b, aVar.f151462b, aVar.f151463c, i4, aVar.f151465e, aVar.f151466f, aVar.f151467g, i14, aVar.f151469i, aVar.f151470j));
                    arrayList2.add(new a(f151458c, aVar.f151462b, aVar.f151463c, i4, aVar.f151465e, aVar.f151466f, i14, aVar.f151468h, aVar.f151469i, aVar.f151470j));
                } else if (aVar.f151465e < i3 && aVar.f151466f > i3 && aVar.f151465e > i2) {
                    int i15 = aVar.f151467g;
                    double d12 = (double) (i3 - aVar.f151465e);
                    double d13 = aVar.f151469i;
                    Double.isNaN(d12);
                    int i16 = i15 + ((int) (d12 * d13));
                    arrayList2.add(new a(f151458c, aVar.f151462b, aVar.f151463c, i4, aVar.f151465e, aVar.f151466f, aVar.f151467g, i16, aVar.f151469i, aVar.f151470j));
                    arrayList2.add(new a(f151457b, aVar.f151462b, aVar.f151463c, i4, aVar.f151465e, aVar.f151466f, i16, aVar.f151468h, aVar.f151469i, aVar.f151470j));
                }
                i4++;
            }
            ArrayList arrayList3 = new ArrayList();
            boolean z = false;
            int i17 = 0;
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                if (((a) arrayList2.get(i18)).f151461a == f151458c) {
                    arrayList3.add(arrayList2.get(i18));
                    if (!z) {
                        z = true;
                        i17 = i18;
                    }
                }
            }
            for (int i19 = 0; ((float) i19) < f2 - 1.0f; i19++) {
                arrayList2.addAll(i17, arrayList3);
            }
            arrayList.addAll(arrayList2);
        } else if (vEBaseFilterParam instanceof VESlowMotionFilterParam) {
            VESlowMotionFilterParam vESlowMotionFilterParam = (VESlowMotionFilterParam) vEBaseFilterParam;
            int i20 = vESlowMotionFilterParam.seqIn;
            int i21 = vESlowMotionFilterParam.seqIn + vESlowMotionFilterParam.slowMotionDuration;
            float f3 = vESlowMotionFilterParam.slowMotionSpeed;
            ArrayList arrayList4 = new ArrayList();
            int i22 = 0;
            for (a aVar2 : list) {
                if (aVar2.f151465e >= i21 || aVar2.f151466f <= i20) {
                    arrayList4.add(new a(f151457b, aVar2.f151462b, aVar2.f151463c, i22, aVar2.f151465e, aVar2.f151466f, aVar2.f151467g, aVar2.f151468h, aVar2.f151469i, aVar2.f151470j));
                } else if (aVar2.f151465e >= i20 && aVar2.f151466f <= i21) {
                    int i23 = f151459d;
                    int i24 = aVar2.f151462b;
                    String str = aVar2.f151463c;
                    int i25 = aVar2.f151465e;
                    int i26 = aVar2.f151466f;
                    int i27 = aVar2.f151467g;
                    int i28 = aVar2.f151468h;
                    double d14 = aVar2.f151469i;
                    double d15 = (double) f3;
                    Double.isNaN(d15);
                    arrayList4.add(new a(i23, i24, str, i22, i25, i26, i27, i28, d15 * d14, aVar2.f151470j));
                } else if (aVar2.f151465e < i20 && aVar2.f151466f > i21) {
                    int i29 = aVar2.f151467g;
                    double d16 = (double) (i20 - aVar2.f151465e);
                    double d17 = aVar2.f151469i;
                    Double.isNaN(d16);
                    int i30 = i29 + ((int) (d16 * d17));
                    int i31 = aVar2.f151467g;
                    double d18 = (double) (i21 - aVar2.f151465e);
                    double d19 = aVar2.f151469i;
                    Double.isNaN(d18);
                    int i32 = i31 + ((int) (d18 * d19));
                    arrayList4.add(new a(f151457b, aVar2.f151462b, aVar2.f151463c, i22, aVar2.f151465e, aVar2.f151466f, aVar2.f151467g, i30, aVar2.f151469i, aVar2.f151470j));
                    int i33 = f151459d;
                    int i34 = aVar2.f151462b;
                    String str2 = aVar2.f151463c;
                    int i35 = aVar2.f151465e;
                    int i36 = aVar2.f151466f;
                    double d20 = aVar2.f151469i;
                    double d21 = (double) f3;
                    Double.isNaN(d21);
                    arrayList4.add(new a(i33, i34, str2, i22, i35, i36, i30, i32, d20 * d21, aVar2.f151470j));
                    arrayList4.add(new a(f151457b, aVar2.f151462b, aVar2.f151463c, i22, aVar2.f151465e, aVar2.f151466f, i32, aVar2.f151468h, aVar2.f151469i, aVar2.f151470j));
                } else if (aVar2.f151465e == i20 && aVar2.f151466f > i21) {
                    int i37 = aVar2.f151467g;
                    double d22 = (double) (i21 - aVar2.f151465e);
                    double d23 = aVar2.f151469i;
                    Double.isNaN(d22);
                    int i38 = i37 + ((int) (d22 * d23));
                    int i39 = f151459d;
                    int i40 = aVar2.f151462b;
                    String str3 = aVar2.f151463c;
                    int i41 = aVar2.f151465e;
                    int i42 = aVar2.f151466f;
                    int i43 = aVar2.f151467g;
                    double d24 = aVar2.f151469i;
                    double d25 = (double) f3;
                    Double.isNaN(d25);
                    arrayList4.add(new a(i39, i40, str3, i22, i41, i42, i43, i38, d25 * d24, aVar2.f151470j));
                    arrayList4.add(new a(f151457b, aVar2.f151462b, aVar2.f151463c, i22, aVar2.f151465e, aVar2.f151466f, i38, aVar2.f151468h, aVar2.f151469i, aVar2.f151470j));
                } else if (aVar2.f151465e < i20 && aVar2.f151466f == i21) {
                    int i44 = aVar2.f151467g;
                    double d26 = (double) (i20 - aVar2.f151465e);
                    double d27 = aVar2.f151469i;
                    Double.isNaN(d26);
                    int i45 = i44 + ((int) (d26 * d27));
                    arrayList4.add(new a(f151457b, aVar2.f151462b, aVar2.f151463c, i22, aVar2.f151465e, aVar2.f151466f, aVar2.f151467g, i45, aVar2.f151469i, aVar2.f151470j));
                    int i46 = f151459d;
                    int i47 = aVar2.f151462b;
                    String str4 = aVar2.f151463c;
                    int i48 = aVar2.f151465e;
                    int i49 = aVar2.f151466f;
                    int i50 = aVar2.f151468h;
                    double d28 = aVar2.f151469i;
                    double d29 = (double) f3;
                    Double.isNaN(d29);
                    arrayList4.add(new a(i46, i47, str4, i22, i48, i49, i45, i50, d28 * d29, aVar2.f151470j));
                } else if (aVar2.f151465e < i20 && aVar2.f151466f > i20 && aVar2.f151466f < i21) {
                    int i51 = aVar2.f151467g;
                    double d30 = (double) (i20 - aVar2.f151465e);
                    double d31 = aVar2.f151469i;
                    Double.isNaN(d30);
                    int i52 = i51 + ((int) (d30 * d31));
                    arrayList4.add(new a(f151457b, aVar2.f151462b, aVar2.f151463c, i22, aVar2.f151465e, aVar2.f151466f, aVar2.f151467g, i52, aVar2.f151469i, aVar2.f151470j));
                    int i53 = f151459d;
                    int i54 = aVar2.f151462b;
                    String str5 = aVar2.f151463c;
                    int i55 = aVar2.f151465e;
                    int i56 = aVar2.f151466f;
                    int i57 = aVar2.f151468h;
                    double d32 = aVar2.f151469i;
                    double d33 = (double) f3;
                    Double.isNaN(d33);
                    arrayList4.add(new a(i53, i54, str5, i22, i55, i56, i52, i57, d32 * d33, aVar2.f151470j));
                } else if (aVar2.f151465e < i21 && aVar2.f151466f > i21 && aVar2.f151465e > i20) {
                    int i58 = aVar2.f151467g;
                    double d34 = (double) (i21 - aVar2.f151465e);
                    double d35 = aVar2.f151469i;
                    Double.isNaN(d34);
                    int i59 = i58 + ((int) (d34 * d35));
                    int i60 = f151459d;
                    int i61 = aVar2.f151462b;
                    String str6 = aVar2.f151463c;
                    int i62 = aVar2.f151465e;
                    int i63 = aVar2.f151466f;
                    int i64 = aVar2.f151467g;
                    double d36 = aVar2.f151469i;
                    double d37 = (double) f3;
                    Double.isNaN(d37);
                    arrayList4.add(new a(i60, i61, str6, i22, i62, i63, i64, i59, d37 * d36, aVar2.f151470j));
                    arrayList4.add(new a(f151457b, aVar2.f151462b, aVar2.f151463c, i22, aVar2.f151465e, aVar2.f151466f, i59, aVar2.f151468h, aVar2.f151469i, aVar2.f151470j));
                }
                i22++;
            }
            arrayList.addAll(arrayList4);
        }
        return arrayList;
    }

    private static void b(List<a> list, List<a> list2, List<VEClipParam> list3, List<VEClipParam> list4) {
        if (list.size() > 0 && list2.size() > 0) {
            boolean[] zArr = new boolean[list.size()];
            for (int i2 = 0; i2 < list2.size(); i2++) {
                a aVar = list2.get(i2);
                if (!zArr[aVar.f151464d]) {
                    zArr[aVar.f151464d] = true;
                } else {
                    VEClipParam vEClipParam = new VEClipParam();
                    vEClipParam.clipType = aVar.f151462b;
                    vEClipParam.path = aVar.f151463c;
                    vEClipParam.trimIn = aVar.f151467g;
                    vEClipParam.trimOut = aVar.f151468h;
                    vEClipParam.speed = aVar.f151469i;
                    vEClipParam.clipRotate = aVar.f151470j;
                    vEClipParam.clipIndex = i2;
                    list3.add(vEClipParam);
                }
                VEClipParam vEClipParam2 = new VEClipParam();
                vEClipParam2.clipType = aVar.f151462b;
                vEClipParam2.path = aVar.f151463c;
                vEClipParam2.trimIn = aVar.f151467g;
                vEClipParam2.trimOut = aVar.f151468h;
                vEClipParam2.speed = aVar.f151469i;
                vEClipParam2.clipRotate = aVar.f151470j;
                vEClipParam2.clipIndex = i2;
                list4.add(vEClipParam2);
            }
        }
    }

    public static void a(List<a> list, List<a> list2, List<VEClipParam> list3, List<VEClipParam> list4) {
        boolean[] zArr = new boolean[list.size()];
        int i2 = 0;
        for (int i3 = 0; i3 < list2.size(); i3++) {
            a aVar = list2.get(i3);
            if (!zArr[aVar.f151464d]) {
                zArr[aVar.f151464d] = true;
            } else {
                VEClipParam vEClipParam = new VEClipParam();
                vEClipParam.path = aVar.f151463c;
                vEClipParam.trimIn = aVar.f151467g;
                vEClipParam.trimOut = aVar.f151468h;
                vEClipParam.speed = aVar.f151469i;
                vEClipParam.clipRotate = aVar.f151470j;
                vEClipParam.clipIndex = i3 - i2;
                i2++;
                list3.add(vEClipParam);
            }
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            VEClipParam vEClipParam2 = new VEClipParam();
            vEClipParam2.path = list.get(i4).f151463c;
            vEClipParam2.trimIn = list.get(i4).f151467g;
            vEClipParam2.trimOut = list.get(i4).f151468h;
            vEClipParam2.speed = list.get(i4).f151469i;
            vEClipParam2.clipRotate = list.get(i4).f151470j;
            vEClipParam2.clipIndex = i4;
            list4.add(vEClipParam2);
        }
    }

    public final void a(int i2, int i3, List<VEClipParam> list, List<VEClipParam> list2, VEBaseFilterParam vEBaseFilterParam, List<VEClipParam> list3, List<VEClipParam> list4, List<VEClipParam> list5, List<VEClipParam> list6) {
        a();
        if (list == null || list.size() == 0) {
            an.d(f151456a, "addTimeEffect init param error");
            return;
        }
        this.f151460e.f151475e = i2;
        this.f151460e.f151476f = i3;
        for (int i4 = 0; i4 < list.size(); i4++) {
            VEClipParam vEClipParam = list.get(i4);
            this.f151460e.f151471a.add(new a(f151457b, vEClipParam.clipType, vEClipParam.path, i4, vEClipParam.seqIn, vEClipParam.seqOut, vEClipParam.trimIn, vEClipParam.trimOut, vEClipParam.speed, vEClipParam.clipRotate));
        }
        for (int i5 = 0; i5 < list2.size(); i5++) {
            VEClipParam vEClipParam2 = list2.get(i5);
            this.f151460e.f151472b.add(new a(f151457b, vEClipParam2.clipType, vEClipParam2.path, i5, vEClipParam2.seqIn, vEClipParam2.seqOut, vEClipParam2.trimIn, vEClipParam2.trimOut, vEClipParam2.speed, vEClipParam2.clipRotate));
        }
        this.f151460e.f151477g = vEBaseFilterParam;
        this.f151460e.f151473c.clear();
        this.f151460e.f151473c.addAll(a(vEBaseFilterParam, this.f151460e.f151471a));
        an.d(f151456a, "addTimeEffect  mTrack.videoClips=" + this.f151460e.f151471a.size() + " mTrack.timeEffectClips=" + this.f151460e.f151473c.size());
        b(this.f151460e.f151471a, this.f151460e.f151473c, list3, list4);
        this.f151460e.f151474d.clear();
        if (this.f151460e.f151472b.size() > 0) {
            this.f151460e.f151474d.addAll(a(vEBaseFilterParam, this.f151460e.f151472b));
            an.d(f151456a, "addTimeEffect  mTrack.audioClips=" + this.f151460e.f151472b.size() + " mTrack.audioTimeEffectClips=" + this.f151460e.f151474d.size());
            b(this.f151460e.f151472b, this.f151460e.f151474d, list5, list6);
        }
    }
}
