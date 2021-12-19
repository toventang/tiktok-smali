package com.ss.ttvideoengine.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import com.bytedance.vcloud.abrmodule.ISegmentInfo;
import com.bytedance.vcloud.abrmodule.ISegmentItem;
import com.ss.ttvideoengine.s.i;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class b implements ISegmentInfo {

    /* renamed from: c  reason: collision with root package name */
    private static boolean f152139c;

    /* renamed from: d  reason: collision with root package name */
    private static Class<?> f152140d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f152141e;

    /* renamed from: f  reason: collision with root package name */
    private static Method f152142f;

    /* renamed from: g  reason: collision with root package name */
    private static Method f152143g;

    /* renamed from: h  reason: collision with root package name */
    private static Method f152144h;

    /* renamed from: i  reason: collision with root package name */
    private static Method f152145i;

    /* renamed from: j  reason: collision with root package name */
    private static Method f152146j;

    /* renamed from: k  reason: collision with root package name */
    private static Method f152147k;

    /* renamed from: a  reason: collision with root package name */
    private Object f152148a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f152149b;

    /* renamed from: l  reason: collision with root package name */
    private Integer f152150l;

    /* renamed from: m  reason: collision with root package name */
    private Integer f152151m;
    private Integer n;
    private Integer o;
    private Long p;
    private String q;

    static {
        Covode.recordClassIndex(101441);
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_ttvideoengine_abr_SegmentInfo_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_ttvideoengine_abr_SegmentInfo_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final long getBitrate() {
        Method method;
        Long l2 = this.p;
        if (l2 != null) {
            return l2.longValue();
        }
        long j2 = -1;
        if (!this.f152149b || (method = f152145i) == null) {
            return -1;
        }
        try {
            Long l3 = (Long) a(method, this.f152148a, new Object[0]);
            this.p = l3;
            j2 = l3.longValue();
            return j2;
        } catch (Exception unused) {
            this.p = Long.valueOf(j2);
            return j2;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final int getEndIndex() {
        Method method;
        Integer num = this.o;
        if (num != null) {
            return num.intValue();
        }
        if (!this.f152149b || (method = f152144h) == null) {
            return 0;
        }
        try {
            Integer num2 = (Integer) a(method, this.f152148a, new Object[0]);
            this.o = num2;
            return num2.intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final String getFileId() {
        Method method;
        String str = this.q;
        if (str != null) {
            return str;
        }
        if (this.f152149b && (method = f152146j) != null) {
            try {
                this.q = (String) a(method, this.f152148a, new Object[0]);
            } catch (Exception unused) {
                this.q = null;
            }
        }
        return this.q;
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final List<? extends ISegmentItem> getItems() {
        ArrayList arrayList = new ArrayList();
        if (!this.f152149b || f152147k == null) {
            return arrayList;
        }
        for (int i2 = 0; getStartIndex() + i2 <= getEndIndex(); i2++) {
            try {
                arrayList.add(new c(a(f152147k, this.f152148a, new Object[]{Integer.valueOf(i2)})));
            } catch (Exception unused) {
                return null;
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final int getMediaType() {
        Method method;
        Integer num = this.f152150l;
        if (num != null) {
            return num.intValue();
        }
        int i2 = -1;
        if (!this.f152149b || (method = f152141e) == null) {
            return -1;
        }
        try {
            Integer num2 = (Integer) a(method, this.f152148a, new Object[0]);
            this.f152150l = num2;
            i2 = num2.intValue();
            return i2;
        } catch (Exception unused) {
            this.f152150l = Integer.valueOf(i2);
            return i2;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final int getStartIndex() {
        Method method;
        Integer num = this.n;
        if (num != null) {
            return num.intValue();
        }
        if (!this.f152149b || (method = f152143g) == null) {
            return 0;
        }
        try {
            Integer num2 = (Integer) a(method, this.f152148a, new Object[0]);
            this.n = num2;
            return num2.intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.ISegmentInfo
    public final int getTotalNum() {
        Method method;
        Integer num = this.f152151m;
        if (num != null) {
            return num.intValue();
        }
        int i2 = -1;
        if (!this.f152149b || (method = f152142f) == null) {
            return -1;
        }
        try {
            Integer num2 = (Integer) a(method, this.f152148a, new Object[0]);
            this.f152151m = num2;
            i2 = num2.intValue();
            return i2;
        } catch (Exception unused) {
            this.f152151m = Integer.valueOf(i2);
            return i2;
        }
    }

    public b(Object obj) {
        this.f152148a = obj;
        if (f152140d == null) {
            if (!f152139c) {
                try {
                    Class<?> a2 = i.a(200, "com.ss.ttm.player.SidxListObject");
                    f152140d = a2;
                    f152141e = a2.getMethod("getMediaType", new Class[0]);
                    f152142f = f152140d.getMethod("getTotalNum", new Class[0]);
                    f152143g = f152140d.getMethod("getStartIndex", new Class[0]);
                    f152144h = f152140d.getMethod("getEndIndex", new Class[0]);
                    f152145i = f152140d.getMethod("getBitrate", new Class[0]);
                    f152146j = f152140d.getMethod("getFileId", new Class[0]);
                    f152147k = f152140d.getMethod("getItem", Integer.TYPE);
                } catch (Exception unused) {
                    this.f152148a = null;
                    f152139c = true;
                }
            } else {
                this.f152148a = null;
            }
        }
        Object obj2 = this.f152148a;
        if (obj2 != null && obj2.getClass().equals(f152140d)) {
            this.f152149b = true;
        }
    }
}
