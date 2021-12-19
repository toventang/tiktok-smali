package com.ss.android.ugc.aweme.utils;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

public final class gt {

    /* renamed from: b  reason: collision with root package name */
    public static gt f143028b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f143029c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<? extends Object> f143030a;

    static {
        Covode.recordClassIndex(93607);
    }

    public static final synchronized gt b() {
        gt a2;
        synchronized (gt.class) {
            MethodCollector.i(6119);
            a2 = f143029c.a();
            MethodCollector.o(6119);
        }
        return a2;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(93608);
        }

        private a() {
        }

        public final synchronized gt a() {
            gt gtVar;
            MethodCollector.i(7990);
            if (gt.f143028b == null) {
                gt.f143028b = new gt((byte) 0);
            }
            gtVar = gt.f143028b;
            if (gtVar == null) {
                l.b();
            }
            MethodCollector.o(7990);
            return gtVar;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private gt() {
    }

    public final String a() {
        JSONArray jSONArray = new JSONArray();
        List<? extends Object> list = this.f143030a;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toString());
            }
        }
        String encode = Uri.encode(jSONArray.toString());
        l.b(encode, "");
        return encode;
    }

    public /* synthetic */ gt(byte b2) {
        this();
    }

    public final void a(List<? extends Object> list) {
        l.d(list, "");
        this.f143030a = list;
    }
}
