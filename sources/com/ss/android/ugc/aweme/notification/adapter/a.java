package com.ss.android.ugc.aweme.notification.adapter;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.common.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2888a f113133a = new C2888a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final a f113134b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f113135c = i.a((h.f.a.a) c.f113140a);

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.a$a  reason: collision with other inner class name */
    public static final class C2888a {
        @com.google.gson.a.c(a = "enable")

        /* renamed from: a  reason: collision with root package name */
        public final boolean f113136a;
        @com.google.gson.a.c(a = "enable_monitor")

        /* renamed from: b  reason: collision with root package name */
        public final boolean f113137b;

        static {
            Covode.recordClassIndex(72739);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2888a)) {
                return false;
            }
            C2888a aVar = (C2888a) obj;
            return this.f113136a == aVar.f113136a && this.f113137b == aVar.f113137b;
        }

        public final int hashCode() {
            boolean z = this.f113136a;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = i3 * 31;
            if (!this.f113137b) {
                i2 = 0;
            }
            return i6 + i2;
        }

        public final String toString() {
            return "Meta(enable=" + this.f113136a + ", enableMonitor=" + this.f113137b + ")";
        }

        private C2888a() {
            this.f113136a = false;
            this.f113137b = true;
        }

        public /* synthetic */ C2888a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<C2888a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f113140a = new c();

        static {
            Covode.recordClassIndex(72741);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ C2888a invoke() {
            Object a2 = SettingsManager.a().a("inbox_adapter_fixer", C2888a.class, a.f113133a);
            if (a2 == null) {
                return a.f113133a;
            }
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(72738);
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f113138a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f113139b;

        static {
            Covode.recordClassIndex(72740);
        }

        b(List list, Throwable th) {
            this.f113138a = list;
            this.f113139b = th;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.LinkedHashMap */
        /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: java.util.LinkedHashMap */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = this.f113138a.size();
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MusNotice musNotice = (MusNotice) this.f113138a.get(i2);
                int hashCode = musNotice.hashCode();
                if (linkedHashMap.get(Integer.valueOf(hashCode)) == null) {
                    linkedHashMap.put(Integer.valueOf(hashCode), Integer.valueOf(i2));
                    i2++;
                } else {
                    int i3 = musNotice.type;
                    Object obj = linkedHashMap.get(Integer.valueOf(hashCode));
                    if (obj == null) {
                        l.b();
                    }
                    int intValue = ((Number) obj).intValue();
                    if (this.f113138a.get(intValue) == musNotice) {
                        z = true;
                    }
                    if (intValue >= 0) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.put("notice_type", String.valueOf(i3));
                        linkedHashMap2.put("first_index", String.valueOf(intValue));
                        linkedHashMap2.put("second_index", String.valueOf(i2));
                        if (z) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        linkedHashMap2.put("real_equal", str);
                        List<MusNotice> list = this.f113138a;
                        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                        for (MusNotice musNotice2 : list) {
                            arrayList.add(Integer.valueOf(musNotice2.type));
                        }
                        linkedHashMap2.put("notice_list", arrayList.toString());
                        r.a("inbox_adapter_dup_ele", linkedHashMap2);
                        f.c("AdapterStableIdFixer", "asyncCheckData, duplicate params: ".concat(String.valueOf(linkedHashMap2)));
                        f.c("AdapterStableIdFixer", "asyncCheckData, stack: " + Log.getStackTraceString(this.f113139b));
                    }
                }
            }
            return z.f158842a;
        }
    }

    public static void a(List<? extends MusNotice> list) {
        l.d(list, "");
        if (((C2888a) f113135c.getValue()).f113137b) {
            b.i.b(new b(list, new Throwable()), b.i.f4824a);
        }
    }
}
