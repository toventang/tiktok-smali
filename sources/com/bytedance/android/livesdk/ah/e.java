package com.bytedance.android.livesdk.ah;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    Map<String, List<Object>> f13725a = new HashMap();

    static {
        Covode.recordClassIndex(7634);
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f13726a = new e();

        static {
            Covode.recordClassIndex(7635);
        }
    }

    public final List<Object> a(String str) {
        List<Object> list = this.f13725a.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.f13725a.put(str, arrayList);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final void b(String[] strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                Iterator<Object> it = a(str).iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(String[] strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                Iterator<Object> it = a(str).iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String[] strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                Iterator<Object> it = a(str).iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
