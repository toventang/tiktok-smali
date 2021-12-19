package com.ss.android.ugc.aweme.geofencing;

import android.os.Build;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.geofencing.GeoFencingSettingItem;
import com.ss.android.ugc.aweme.port.in.g;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C2412a f99010d = new C2412a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final t<z> f99011a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public GeoFencingSettingItem f99012b;

    /* renamed from: c  reason: collision with root package name */
    public final t<List<com.ss.android.ugc.aweme.geofencing.c.a>> f99013c = new t<>();

    static {
        Covode.recordClassIndex(62952);
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.a$a  reason: collision with other inner class name */
    public static final class C2412a {
        static {
            Covode.recordClassIndex(62953);
        }

        private C2412a() {
        }

        public static boolean a() {
            com.ss.android.ugc.aweme.port.in.z A = g.a().A();
            if (!A.b() || !A.f() || Build.VERSION.SDK_INT < 21) {
                return true;
            }
            return false;
        }

        public /* synthetic */ C2412a(byte b2) {
            this();
        }
    }

    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ List $list;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(62956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(a aVar, List list) {
            super(0);
            this.this$0 = aVar;
            this.$list = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f99013c.postValue(com.ss.android.ugc.aweme.geofencing.b.a.a(this.$list));
            return z.f158842a;
        }
    }

    public final List<String> a() {
        List<com.ss.android.ugc.aweme.geofencing.c.a> value = this.f99013c.getValue();
        if (value == null) {
            return h.a.z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(n.a((Iterable) value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCode());
        }
        return arrayList;
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GeoFencingSettingItem f99024a;

        static {
            Covode.recordClassIndex(62954);
        }

        b(GeoFencingSettingItem geoFencingSettingItem) {
            this.f99024a = geoFencingSettingItem;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f99024a.b();
        }
    }

    public static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99034a;

        static {
            Covode.recordClassIndex(62955);
        }

        public c(a aVar) {
            this.f99034a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f99034a.f99011a.setValue(z.f158842a);
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f99035a;

        static {
            Covode.recordClassIndex(62957);
        }

        e(u uVar) {
            this.f99035a = uVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.u */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool;
            List list = (List) obj;
            u uVar = this.f99035a;
            if (list != null) {
                bool = Boolean.valueOf(list.isEmpty());
            } else {
                bool = null;
            }
            uVar.onChanged(bool);
        }
    }

    public final void a(androidx.lifecycle.m mVar, u<Boolean> uVar) {
        l.d(mVar, "");
        l.d(uVar, "");
        GeoFencingSettingItem geoFencingSettingItem = this.f99012b;
        if (geoFencingSettingItem != null) {
            l.d(mVar, "");
            l.d(uVar, "");
            geoFencingSettingItem.f98993a.observe(mVar, new GeoFencingSettingItem.f(uVar));
        }
        this.f99013c.observe(mVar, new e(uVar));
    }

    public final void a(androidx.lifecycle.m mVar, GeoFencingSettingItem geoFencingSettingItem) {
        l.d(mVar, "");
        l.d(geoFencingSettingItem, "");
        this.f99012b = geoFencingSettingItem;
        this.f99011a.removeObservers(mVar);
        this.f99011a.observe(mVar, new b(geoFencingSettingItem));
        geoFencingSettingItem.f98993a.setValue(this.f99013c.getValue());
    }
}
