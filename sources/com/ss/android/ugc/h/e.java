package com.ss.android.ugc.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.m;
import com.ss.android.ugc.h.f;
import com.ss.android.ugc.h.g;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public final class e implements g.a {

    /* renamed from: a  reason: collision with root package name */
    private volatile double f148501a = -1.0d;

    /* renamed from: b  reason: collision with root package name */
    private a f148502b;

    public interface a {
        static {
            Covode.recordClassIndex(97894);
        }

        Map<String, Object> a();
    }

    static {
        Covode.recordClassIndex(97893);
    }

    public static class b extends Exception {
        private int code;
        private String msg;

        static {
            Covode.recordClassIndex(97895);
        }

        public final int getCode() {
            return this.code;
        }

        public final String getMsg() {
            return this.msg;
        }

        public b(int i2, String str) {
            this.code = i2;
            this.msg = str;
        }
    }

    public e(a aVar) {
        this.f148502b = aVar;
    }

    @Override // com.ss.android.ugc.h.g.a
    public final double b(Queue<i> queue, i[] iVarArr) {
        return this.f148501a;
    }

    @Override // com.ss.android.ugc.h.g.a
    public final double a(Queue<i> queue, i[] iVarArr) {
        int i2;
        String str;
        m mVar = f.a.f148504a.f148503a;
        if (mVar == null || !mVar.c() || !mVar.b()) {
            this.f148501a = -1.0d;
            if (mVar == null) {
                i2 = 0;
                str = "component is null";
            } else {
                i2 = 3;
                str = "component is not initialized ready";
            }
            throw new b(i2, str);
        }
        queue.toArray(iVarArr);
        HashMap hashMap = new HashMap();
        int min = Math.min(iVarArr.length, queue.size());
        int i3 = min - 1;
        for (int i4 = i3; i4 >= 0; i4--) {
            int i5 = min - i4;
            hashMap.put("f".concat(String.valueOf(i5)), Float.valueOf((float) iVarArr[i4].f148520c));
            hashMap.put("s".concat(String.valueOf(i5)), Float.valueOf(((float) iVarArr[i4].f148519b) / 8000.0f));
            hashMap.put("i".concat(String.valueOf(i5)), Float.valueOf(((float) iVarArr[i3].f148522e) - ((float) iVarArr[i4].f148522e)));
        }
        hashMap.putAll(this.f148502b.a());
        this.f148501a = (double) mVar.f59875b.a(hashMap, mVar.a(), mVar.f59877d.output, mVar.f59877d.feature_list);
        if (this.f148501a != -1.0d) {
            return this.f148501a;
        }
        if (!mVar.f59875b.a()) {
            throw new b(4, "evaluator is not initialized");
        }
        throw new b(5, "evaluator calculate error");
    }
}
