package com.lynx.tasm;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.b.a;
import com.lynx.tasm.b.b;
import com.lynx.tasm.base.LLog;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public final class TemplateData {

    /* renamed from: a  reason: collision with root package name */
    public long f55591a;

    /* renamed from: b  reason: collision with root package name */
    public String f55592b = null;

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f55593c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f55594d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, Object> f55595e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, Object> f55596f;

    static {
        Covode.recordClassIndex(34807);
    }

    static native long nativeClone(long j2);

    private static native ByteBuffer nativeGetData(long j2);

    private static native long nativeParseData(ByteBuffer byteBuffer, int i2);

    private static native long nativeParseStringData(String str);

    private static native void nativeReleaseData(long j2);

    private static native void nativeUpdateData(long j2, ByteBuffer byteBuffer, int i2);

    public static TemplateData a() {
        return new TemplateData(0, null);
    }

    public final void finalize() {
        MethodCollector.i(12393);
        if (LynxEnv.b().f()) {
            long j2 = this.f55591a;
            if (j2 != 0) {
                nativeReleaseData(j2);
            }
        }
        MethodCollector.o(12393);
    }

    public final void b() {
        MethodCollector.i(12392);
        if (this.f55591a == 0) {
            ByteBuffer a2 = a.f55742a.a(this.f55595e);
            if (a2 != null && a2.position() > 0) {
                this.f55591a = nativeParseData(a2, a2.position());
            }
            MethodCollector.o(12392);
            return;
        }
        Map<String, Object> map = this.f55596f;
        if (map == null || map.size() == 0 || this.f55595e == null) {
            MethodCollector.o(12392);
            return;
        }
        ByteBuffer a3 = a.f55742a.a(this.f55596f);
        this.f55595e.putAll(this.f55596f);
        this.f55596f.clear();
        long j2 = this.f55591a;
        if (j2 == 0) {
            LLog.a(6, "TemplateData", "mNative Data is null");
            MethodCollector.o(12392);
            return;
        }
        if (!(a3 == null || j2 == 0)) {
            nativeUpdateData(j2, a3, a3.position());
        }
        MethodCollector.o(12392);
    }

    public static TemplateData a(String str) {
        MethodCollector.i(12245);
        if (!LynxEnv.b().f() || TextUtils.isEmpty(str)) {
            TemplateData templateData = new TemplateData(0, null);
            MethodCollector.o(12245);
            return templateData;
        }
        TemplateData templateData2 = new TemplateData(nativeParseStringData(str), null);
        MethodCollector.o(12245);
        return templateData2;
    }

    public static TemplateData a(Map<String, Object> map) {
        ByteBuffer a2;
        MethodCollector.i(12089);
        if (!LynxEnv.b().f() || map == null || (a2 = a.f55742a.a(map)) == null || a2.position() <= 0) {
            TemplateData templateData = new TemplateData(0, null);
            MethodCollector.o(12089);
            return templateData;
        }
        TemplateData templateData2 = new TemplateData(nativeParseData(a2, a2.position()), map);
        MethodCollector.o(12089);
        return templateData2;
    }

    TemplateData(long j2, Map<String, Object> map) {
        LynxEnv.b();
        this.f55591a = j2;
        if (j2 != 0) {
            this.f55595e = map;
        }
    }

    public final void a(String str, Object obj) {
        if (this.f55594d) {
            LLog.a(5, "Lynx", "can not update readOnly TemplateData");
        } else {
            b(str, obj);
        }
    }

    private void b(String str, Object obj) {
        Map<String, Object> hashMap;
        Map<String, Object> hashMap2;
        if (this.f55594d) {
            LLog.a(5, "Lynx", "can not update readOnly TemplateData");
            return;
        }
        if (this.f55595e == null) {
            if (this.f55593c) {
                hashMap2 = new b<>();
            } else {
                hashMap2 = new HashMap<>();
            }
            this.f55595e = hashMap2;
        }
        if (this.f55596f == null) {
            if (this.f55593c) {
                hashMap = new b<>();
            } else {
                hashMap = new HashMap<>();
            }
            this.f55596f = hashMap;
        }
        if (this.f55591a == 0) {
            this.f55595e.put(str, obj);
            return;
        }
        Object obj2 = this.f55596f.get(str);
        if (obj2 == null) {
            obj2 = this.f55595e.get(str);
        }
        if (obj == null) {
            if (obj2 != null) {
                this.f55596f.put(str, null);
            }
        } else if (obj == obj2) {
        } else {
            if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
                this.f55596f.put(str, obj);
            } else {
                a(str, (Map) obj2, (Map) obj);
            }
        }
    }

    private void a(String str, Map<String, Object> map, Map<String, Object> map2) {
        HashMap hashMap = null;
        for (String str2 : map2.keySet()) {
            Object obj = map.get(str2);
            Object obj2 = map2.get(str2);
            if (obj != obj2) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                hashMap.put(str2, obj2);
            }
        }
        if (hashMap != null) {
            this.f55596f.put(str, hashMap);
        }
    }
}
