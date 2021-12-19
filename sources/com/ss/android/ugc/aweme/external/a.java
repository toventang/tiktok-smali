package com.ss.android.ugc.aweme.external;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.performance.ICrashEffectIdInfoListener;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.utils.q;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public final class a implements ICrashReportService {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<ICrashEffectIdInfoListener> f90283a = new ArrayList<>();

    static {
        Covode.recordClassIndex(56632);
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a$a  reason: collision with other inner class name */
    static final class C2167a extends m implements b<Integer, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2167a f90284a = new C2167a();

        static {
            Covode.recordClassIndex(56633);
        }

        C2167a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }

        public static String a(int i2) {
            if (i2 == 1) {
                return "oom_detected";
            }
            if (i2 == 2) {
                return "native_crash_detected";
            }
            if (i2 == 3) {
                return "java_crash_detected";
            }
            throw new Exception("Unknown error type");
        }
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICrashReportService
    public final void addCrashEffectIdInfoListener(ICrashEffectIdInfoListener iCrashEffectIdInfoListener) {
        l.d(iCrashEffectIdInfoListener, "");
        this.f90283a.add(iCrashEffectIdInfoListener);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICrashReportService
    public final void report(int i2) {
        String obj;
        HashMap<String, Object> hashMap = dmt.av.video.a.f156749a.get(i2);
        if (hashMap != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                Object value = entry.getValue();
                if (!(value == null || (obj = value.toString()) == null || obj.length() <= 0)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Objects.requireNonNull(linkedHashMap, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            if (linkedHashMap2 != null) {
                q.b(C2167a.a(i2) + ": " + linkedHashMap2);
                d.a(C2167a.a(i2), new com.ss.android.ugc.tools.f.b().a(linkedHashMap2).f149193a);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICrashReportService
    public final void setEffectIdInfo(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        Iterator<T> it = this.f90283a.iterator();
        while (it.hasNext()) {
            it.next().setEffectIdInfo(str, str2);
        }
    }
}
