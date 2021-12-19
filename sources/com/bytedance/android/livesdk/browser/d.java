package com.bytedance.android.livesdk.browser;

import com.bytedance.android.live.b.j;
import com.bytedance.android.livesdk.container.e;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class d implements j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14327a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private Map<String, List<com.bytedance.android.live.core.widget.a>> f14328b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map<String, com.bytedance.android.live.core.widget.a> f14329c = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(7935);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(7936);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final d f14346a = new d();

        /* renamed from: b  reason: collision with root package name */
        public static final b f14347b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(7937);
        }
    }

    @Override // com.bytedance.android.live.b.j
    public final void a() {
        this.f14329c.clear();
        for (Map.Entry<String, List<com.bytedance.android.live.core.widget.a>> entry : this.f14328b.entrySet()) {
            for (T t : entry.getValue()) {
                if (t.isAdded()) {
                    t.dismissAllowingStateLoss();
                }
            }
        }
    }

    @Override // com.bytedance.android.live.b.j
    public final List<e> b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, com.bytedance.android.live.core.widget.a> entry : this.f14329c.entrySet()) {
            com.bytedance.android.live.core.widget.a value = entry.getValue();
            if (value instanceof e) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.live.b.j
    public final com.bytedance.android.live.core.widget.a b(String str) {
        l.d(str, "");
        return this.f14329c.get(str);
    }

    @Override // com.bytedance.android.live.b.j
    public final void a(com.bytedance.android.live.core.widget.a aVar) {
        l.d(aVar, "");
        this.f14329c.remove(aVar.j_());
        for (Map.Entry<String, List<com.bytedance.android.live.core.widget.a>> entry : this.f14328b.entrySet()) {
            List<com.bytedance.android.live.core.widget.a> value = entry.getValue();
            if (value.contains(aVar)) {
                value.remove(aVar);
                if (value.isEmpty()) {
                    this.f14328b.remove(entry.getKey());
                }
            }
        }
    }

    @Override // com.bytedance.android.live.b.j
    public final void a(String str) {
        l.d(str, "");
        List<com.bytedance.android.live.core.widget.a> list = this.f14328b.get(str);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().dismissAllowingStateLoss();
            }
        }
    }

    @Override // com.bytedance.android.live.b.j
    public final void a(String str, com.bytedance.android.live.core.widget.a aVar) {
        l.d(str, "");
        l.d(aVar, "");
        List<com.bytedance.android.live.core.widget.a> list = this.f14328b.get(str);
        Map<String, com.bytedance.android.live.core.widget.a> map = this.f14329c;
        String j_ = aVar.j_();
        l.b(j_, "");
        map.put(j_, aVar);
        if (list == null) {
            list = new ArrayList<>();
            this.f14328b.put(str, list);
        }
        list.add(aVar);
    }
}
