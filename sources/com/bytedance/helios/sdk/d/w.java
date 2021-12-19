package com.bytedance.helios.sdk.d;

import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.a.b;
import com.bytedance.helios.api.config.AnchorInfoModel;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.c;
import com.bytedance.helios.sdk.f;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class w extends n {

    /* renamed from: b  reason: collision with root package name */
    public static final List<Integer> f30940b = n.b(2002, 2006, 2003);

    /* renamed from: f  reason: collision with root package name */
    public static final a f30941f = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    private final List<r> f30942g;

    public static final class a {
        static {
            Covode.recordClassIndex(17949);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.helios.sdk.d.b
    public final int[] a() {
        return v.f30934a;
    }

    @Override // com.bytedance.helios.sdk.d.n
    public final String b() {
        return v.f30935b;
    }

    public w() {
        ArrayList arrayList = new ArrayList();
        this.f30942g = arrayList;
        a(v.f30936c);
        b a2 = b.a.a();
        if (a2 instanceof r) {
            l.c(a2, "");
            arrayList.add(a2);
        }
    }

    static {
        Covode.recordClassIndex(17948);
    }

    @Override // com.bytedance.helios.sdk.d.n
    public final List<Integer> b(int i2) {
        if (i2 != 102801) {
            return z.INSTANCE;
        }
        return n.a((Object) 102800);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.helios.sdk.d.b
    public final void a(d dVar, Throwable th) {
        l.c(dVar, "");
        l.c(th, "");
        e eVar = (e) this.f30855a.get(dVar.f30865d);
        l.a((Object) eVar, "");
        a(eVar, dVar, th);
    }

    @Override // com.bytedance.helios.sdk.d.n
    public final void c(e eVar, d dVar, Throwable th) {
        Object obj;
        l.c(eVar, "");
        l.c(dVar, "");
        try {
            Object[] objArr = dVar.f30864c;
            if (objArr == null || (obj = objArr[0]) == null) {
                throw new h.w("null cannot be cast to non-null type");
            }
            View view = (View) obj;
            List<com.bytedance.helios.api.b.n> list = this.f30909c;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                Object obj2 = t2.n.get("key_view_id");
                Object obj3 = t2.n.get("key_view_hash_code");
                if (l.a(obj2, Integer.valueOf(view.getId())) && l.a(obj3, Integer.valueOf(view.hashCode()))) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            this.f30909c.removeAll(arrayList2);
            if (!arrayList2.isEmpty()) {
                Iterator<T> it = this.f30942g.iterator();
                while (it.hasNext()) {
                    it.next().onWindowViewAction(dVar.f30865d, arrayList2);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.helios.sdk.d.n
    public final void b(e eVar, d dVar, Throwable th) {
        WindowManager.LayoutParams layoutParams;
        l.c(eVar, "");
        l.c(dVar, "");
        try {
            Object[] objArr = dVar.f30864c;
            if (objArr != null) {
                layoutParams = objArr[1];
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                WindowManager.LayoutParams layoutParams2 = layoutParams;
                if ((Build.VERSION.SDK_INT >= 26 && layoutParams2.type == 2038) || (Build.VERSION.SDK_INT < 26 && f30940b.contains(Integer.valueOf(layoutParams2.type)))) {
                    f a2 = f.a();
                    l.a((Object) a2, "");
                    String e2 = a2.e();
                    List<AnchorInfoModel> anchorConfigList = HeliosEnvImpl.INSTANCE.getAnchorConfigList();
                    ArrayList arrayList = new ArrayList();
                    for (T t : anchorConfigList) {
                        if (t.getSkipAnchorActions().contains("floating_window_view")) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<AnchorInfoModel> arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
                    for (AnchorInfoModel anchorInfoModel : arrayList2) {
                        arrayList3.add(anchorInfoModel.getDetectionPage());
                    }
                    ArrayList arrayList4 = arrayList3;
                    f a3 = f.a();
                    l.a((Object) a3, "");
                    com.bytedance.helios.sdk.b bVar = a3.f30950c;
                    l.a((Object) bVar, "");
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : bVar) {
                        if (arrayList4.contains(((c) obj).f30802c)) {
                            arrayList5.add(obj);
                        }
                    }
                    ArrayList arrayList6 = arrayList5;
                    if (true ^ arrayList6.isEmpty()) {
                        Object obj2 = dVar.f30864c[0];
                        if (obj2 != null) {
                            View view = (View) obj2;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("key_view_id", Integer.valueOf(view.getId()));
                            linkedHashMap.put("key_view_hash_code", Integer.valueOf(view.hashCode()));
                            l.a((Object) e2, "");
                            f a4 = f.a();
                            l.a((Object) a4, "");
                            com.bytedance.helios.api.b.n nVar = new com.bytedance.helios.api.b.n(null, 102800, null, null, null, null, null, e2, a4.f(), dVar.f30866e, linkedHashMap, null, null, null, 0, null, null, null, null, null, -11779);
                            nVar.n.put("floating_view_activities", arrayList6);
                            this.f30909c.add(nVar);
                            Iterator<T> it = this.f30942g.iterator();
                            while (it.hasNext()) {
                                it.next().onWindowViewAction(dVar.f30865d, n.a(nVar));
                            }
                            return;
                        }
                        throw new h.w("null cannot be cast to non-null type");
                    }
                    return;
                }
                return;
            }
            throw new h.w("null cannot be cast to non-null type");
        } catch (Exception unused) {
        }
    }
}
