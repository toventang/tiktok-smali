package com.ss.ttvideoengine.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import com.bytedance.vcloud.abrmodule.ISegmentItem;
import com.ss.ttvideoengine.s.i;
import java.lang.reflect.Method;

public final class c implements ISegmentItem {

    /* renamed from: c  reason: collision with root package name */
    private static boolean f152152c;

    /* renamed from: d  reason: collision with root package name */
    private static Class<?> f152153d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f152154e;

    /* renamed from: f  reason: collision with root package name */
    private static Method f152155f;

    /* renamed from: g  reason: collision with root package name */
    private static Method f152156g;

    /* renamed from: h  reason: collision with root package name */
    private static Method f152157h;

    /* renamed from: i  reason: collision with root package name */
    private static Method f152158i;

    /* renamed from: a  reason: collision with root package name */
    private Object f152159a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f152160b;

    /* renamed from: j  reason: collision with root package name */
    private Integer f152161j;

    /* renamed from: k  reason: collision with root package name */
    private Long f152162k;

    /* renamed from: l  reason: collision with root package name */
    private Long f152163l;

    /* renamed from: m  reason: collision with root package name */
    private Long f152164m;
    private Long n;

    static {
        Covode.recordClassIndex(101442);
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_ttvideoengine_abr_SegmentItem_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_ttvideoengine_abr_SegmentItem_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentItem
    public final long getDuration() {
        Method method;
        Long l2 = this.f152164m;
        if (l2 != null) {
            return l2.longValue();
        }
        long j2 = -1;
        if (!this.f152160b || (method = f152157h) == null) {
            return -1;
        }
        try {
            Long l3 = (Long) a(method, this.f152159a, new Object[0]);
            this.f152164m = l3;
            j2 = l3.longValue();
            return j2;
        } catch (Exception unused) {
            this.f152164m = Long.valueOf(j2);
            return j2;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentItem
    public final int getIndex() {
        Method method;
        Integer num = this.f152161j;
        if (num != null) {
            return num.intValue();
        }
        int i2 = -1;
        if (!this.f152160b || (method = f152154e) == null) {
            return -1;
        }
        try {
            Integer num2 = (Integer) a(method, this.f152159a, new Object[0]);
            this.f152161j = num2;
            i2 = num2.intValue();
            return i2;
        } catch (Exception unused) {
            this.f152161j = Integer.valueOf(i2);
            return i2;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentItem
    public final long getOffset() {
        Method method;
        Long l2 = this.f152162k;
        if (l2 != null) {
            return l2.longValue();
        }
        long j2 = -1;
        if (!this.f152160b || (method = f152155f) == null) {
            return -1;
        }
        try {
            Long l3 = (Long) a(method, this.f152159a, new Object[0]);
            this.f152162k = l3;
            j2 = l3.longValue();
            return j2;
        } catch (Exception unused) {
            this.f152162k = Long.valueOf(j2);
            return j2;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentItem
    public final long getSize() {
        Method method;
        Long l2 = this.n;
        if (l2 != null) {
            return l2.longValue();
        }
        long j2 = -1;
        if (!this.f152160b || (method = f152158i) == null) {
            return -1;
        }
        try {
            Long l3 = (Long) a(method, this.f152159a, new Object[0]);
            this.n = l3;
            j2 = l3.longValue();
            return j2;
        } catch (Exception unused) {
            this.n = Long.valueOf(j2);
            return j2;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentItem
    public final long getTimestamp() {
        Method method;
        Long l2 = this.f152163l;
        if (l2 != null) {
            return l2.longValue();
        }
        long j2 = -1;
        if (!this.f152160b || (method = f152156g) == null) {
            return -1;
        }
        try {
            Long l3 = (Long) a(method, this.f152159a, new Object[0]);
            this.f152163l = l3;
            j2 = l3.longValue();
            return j2;
        } catch (Exception unused) {
            this.f152163l = Long.valueOf(j2);
            return j2;
        }
    }

    public c(Object obj) {
        this.f152159a = obj;
        if (f152153d == null) {
            if (!f152152c) {
                try {
                    Class<?> a2 = i.a(200, "com.ss.ttm.player.SidxListObject$SidxItem");
                    f152153d = a2;
                    f152154e = a2.getMethod("getIndex", new Class[0]);
                    f152155f = f152153d.getMethod("getOffset", new Class[0]);
                    f152156g = f152153d.getMethod("getTimestamp", new Class[0]);
                    f152157h = f152153d.getMethod("getDuration", new Class[0]);
                    f152158i = f152153d.getMethod("getSize", new Class[0]);
                } catch (Exception unused) {
                    this.f152159a = null;
                    f152152c = true;
                }
            } else {
                this.f152159a = null;
            }
        }
        Object obj2 = this.f152159a;
        if (obj2 != null && obj2.getClass().equals(f152153d)) {
            this.f152160b = true;
        }
    }
}
