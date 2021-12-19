package com.ss.android.ugc.aweme.ufr;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import f.a.t;
import f.a.x;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    boolean f141698a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f141699b = true;

    static {
        Covode.recordClassIndex(92611);
    }

    public static boolean c(Map<g, Boolean> map) {
        return l.a((Object) map.get(g.CHECK_ACTUAL_PERMISSION), (Object) false);
    }

    /* access modifiers changed from: package-private */
    public static final class e<T, R> implements f.a.d.g<T, x<? extends R>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f141707a = new e();

        static {
            Covode.recordClassIndex(92616);
        }

        e() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            e eVar = (e) obj;
            l.c(eVar, "");
            return t.b(new d(g.SYNC_STATUS, eVar));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T, R> implements f.a.d.g<T, x<? extends R>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f141708a = new f();

        static {
            Covode.recordClassIndex(92617);
        }

        f() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            e eVar = (e) obj;
            l.c(eVar, "");
            return t.b(new d(g.UPLOAD, eVar));
        }
    }

    static final class a<T, R> implements f.a.d.g<T, x<? extends R>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f141700a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f141701b;

        static {
            Covode.recordClassIndex(92612);
        }

        a(h hVar, a aVar) {
            this.f141700a = hVar;
            this.f141701b = aVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            t<d> a2;
            e eVar = (e) obj;
            l.c(eVar, "");
            g gVar = g.REQUEST_ACTUAL_PERMISSION;
            eVar.f141692b = 1;
            t<d> a3 = h.a(gVar, eVar);
            if (eVar.f141691a) {
                a aVar = this.f141701b;
                a2 = h.a(aVar, eVar, this.f141700a.a(aVar));
            } else {
                a2 = h.a(this.f141701b, eVar);
            }
            return t.a(a3, a2);
        }
    }

    static final class b<T, R> implements f.a.d.g<T, x<? extends R>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f141702a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f141703b;

        static {
            Covode.recordClassIndex(92613);
        }

        b(h hVar, a aVar) {
            this.f141702a = hVar;
            this.f141703b = aVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            t<d> a2;
            e eVar = (e) obj;
            l.c(eVar, "");
            g gVar = g.REQUEST_UID_PERMISSION;
            eVar.f141692b = 2;
            t<d> a3 = h.a(gVar, eVar);
            if (eVar.f141691a) {
                a aVar = this.f141703b;
                a2 = h.a(aVar, eVar, this.f141702a.a(aVar));
            } else {
                a2 = h.a(this.f141703b, eVar);
            }
            return t.a(a3, a2);
        }
    }

    private final t<d> b(a aVar) {
        t<d> a2 = t.a(aVar.e(), aVar.f(), new c(this)).a(f.a.a.b.a.a()).a((f.a.d.g) new d(this, aVar), false);
        l.a((Object) a2, "");
        return a2;
    }

    private final t<d> c(a aVar) {
        t<d> a2 = t.a(aVar.e(), aVar.f(), new g(this)).a(f.a.a.b.a.a()).a((f.a.d.g) new C3768h(this, aVar), false);
        l.a((Object) a2, "");
        return a2;
    }

    public static boolean b(Map<g, Boolean> map) {
        if (!l.a((Object) map.get(g.CHECK_UID_PERMISSION), (Object) false) || !l.a((Object) map.get(g.CHECK_ACTUAL_PERMISSION), (Object) true)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class d<T, R> implements f.a.d.g<T, x<? extends R>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f141705a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f141706b;

        static {
            Covode.recordClassIndex(92615);
        }

        d(h hVar, a aVar) {
            this.f141705a = hVar;
            this.f141706b = aVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Map map = (Map) obj;
            l.c(map, "");
            if (h.a(map)) {
                return t.a(h.a(g.CHECK_UID_PERMISSION, new e(true, 0, 0, null, 14)), h.a(g.CHECK_ACTUAL_PERMISSION, new e(true, 0, 0, null, 14)), this.f141705a.a(this.f141706b));
            }
            if (h.b(map)) {
                g gVar = g.CHECK_UID_PERMISSION;
                Boolean bool = (Boolean) map.get(g.CHECK_UID_PERMISSION);
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    z3 = false;
                }
                t<d> a2 = h.a(gVar, new e(z3, 0, 0, null, 14));
                g gVar2 = g.CHECK_ACTUAL_PERMISSION;
                Boolean bool2 = (Boolean) map.get(g.CHECK_ACTUAL_PERMISSION);
                if (bool2 != null) {
                    z4 = bool2.booleanValue();
                } else {
                    z4 = false;
                }
                return t.a(a2, h.a(gVar2, new e(z4, 0, 0, null, 14)));
            } else if (!h.c(map)) {
                return t.b(new d(g.UNKNOW, new e(false, 0, 0, null, 14)));
            } else {
                g gVar3 = g.CHECK_UID_PERMISSION;
                Boolean bool3 = (Boolean) map.get(g.CHECK_UID_PERMISSION);
                if (bool3 != null) {
                    z = bool3.booleanValue();
                } else {
                    z = false;
                }
                t<d> a3 = h.a(gVar3, new e(z, 0, 0, null, 14));
                g gVar4 = g.CHECK_ACTUAL_PERMISSION;
                Boolean bool4 = (Boolean) map.get(g.CHECK_ACTUAL_PERMISSION);
                if (bool4 != null) {
                    z2 = bool4.booleanValue();
                } else {
                    z2 = false;
                }
                return t.a(a3, h.a(gVar4, new e(z2, 0, 0, null, 14)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ufr.h$h  reason: collision with other inner class name */
    public static final class C3768h<T, R> implements f.a.d.g<T, x<? extends R>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f141710a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f141711b;

        static {
            Covode.recordClassIndex(92619);
        }

        C3768h(h hVar, a aVar) {
            this.f141710a = hVar;
            this.f141711b = aVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            t<R> a2;
            Map map = (Map) obj;
            l.c(map, "");
            if (h.a(map)) {
                return t.a(h.a(g.CHECK_UID_PERMISSION, new e(true, 0, 0, null, 14)), h.a(g.CHECK_ACTUAL_PERMISSION, new e(true, 0, 0, null, 14)), this.f141710a.a(this.f141711b));
            }
            if (h.b(map)) {
                g gVar = g.CHECK_UID_PERMISSION;
                Boolean bool = (Boolean) map.get(g.CHECK_UID_PERMISSION);
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    z3 = false;
                }
                t<d> a3 = h.a(gVar, new e(z3, 0, 0, null, 14));
                g gVar2 = g.CHECK_ACTUAL_PERMISSION;
                Boolean bool2 = (Boolean) map.get(g.CHECK_ACTUAL_PERMISSION);
                if (bool2 != null) {
                    z4 = bool2.booleanValue();
                } else {
                    z4 = false;
                }
                t<d> a4 = h.a(gVar2, new e(z4, 0, 0, null, 14));
                h hVar = this.f141710a;
                a aVar = this.f141711b;
                if (hVar.f141698a) {
                    a2 = t.a(h.a(g.REQUEST_UID_PERMISSION, new e(true, 0, 0, null, 14)), h.a(aVar, new e(true, 0, 0, null, 14), hVar.a(aVar)));
                    l.a((Object) a2, "");
                } else {
                    a2 = aVar.g().a(f.a.a.b.a.a()).a((f.a.d.g<? super e, ? extends x<? extends R>>) new b(hVar, aVar), false);
                    l.a((Object) a2, "");
                }
                return t.a(a3, a4, a2);
            } else if (!h.c(map)) {
                return t.b(new d(g.UNKNOW, new e(false, 0, 0, null, 14)));
            } else {
                g gVar3 = g.CHECK_UID_PERMISSION;
                Boolean bool3 = (Boolean) map.get(g.CHECK_UID_PERMISSION);
                if (bool3 != null) {
                    z = bool3.booleanValue();
                } else {
                    z = false;
                }
                t<d> a5 = h.a(gVar3, new e(z, 0, 0, null, 14));
                g gVar4 = g.CHECK_ACTUAL_PERMISSION;
                Boolean bool4 = (Boolean) map.get(g.CHECK_ACTUAL_PERMISSION);
                if (bool4 != null) {
                    z2 = bool4.booleanValue();
                } else {
                    z2 = false;
                }
                t<d> a6 = h.a(gVar4, new e(z2, 0, 0, null, 14));
                h hVar2 = this.f141710a;
                a aVar2 = this.f141711b;
                t<R> a7 = aVar2.h().a(f.a.a.b.a.a()).a((f.a.d.g<? super e, ? extends x<? extends R>>) new a(hVar2, aVar2), false);
                l.a((Object) a7, "");
                return t.a(a5, a6, a7);
            }
        }
    }

    public static boolean a(Map<g, Boolean> map) {
        if (!l.a((Object) map.get(g.CHECK_UID_PERMISSION), (Object) true) || !l.a((Object) map.get(g.CHECK_ACTUAL_PERMISSION), (Object) true)) {
            return false;
        }
        return true;
    }

    public final t<d> a(a aVar) {
        if (this.f141699b) {
            t<d> a2 = t.a(aVar.i().a(f.a.a.b.a.a()).a((f.a.d.g<? super e, ? extends x<? extends R>>) f.f141708a, false), t.b(new d(g.AUTHORIZED, new e(true, 0, 0, null, 14))));
            l.a((Object) a2, "");
            return a2;
        }
        t<d> b2 = t.b(new d(g.AUTHORIZED, new e(true, 0, 0, null, 14)));
        l.a((Object) b2, "");
        return b2;
    }

    /* access modifiers changed from: package-private */
    public static final class c<T1, T2, R> implements f.a.d.c<e, e, Map<g, ? extends Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f141704a;

        static {
            Covode.recordClassIndex(92614);
        }

        c(h hVar) {
            this.f141704a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // f.a.d.c
        public final /* synthetic */ Map<g, ? extends Boolean> a(e eVar, e eVar2) {
            e eVar3 = eVar;
            e eVar4 = eVar2;
            l.c(eVar3, "");
            l.c(eVar4, "");
            return h.a(eVar3.f141691a, eVar4.f141691a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T1, T2, R> implements f.a.d.c<e, e, Map<g, ? extends Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f141709a;

        static {
            Covode.recordClassIndex(92618);
        }

        g(h hVar) {
            this.f141709a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // f.a.d.c
        public final /* synthetic */ Map<g, ? extends Boolean> a(e eVar, e eVar2) {
            e eVar3 = eVar;
            e eVar4 = eVar2;
            l.c(eVar3, "");
            l.c(eVar4, "");
            return h.a(eVar3.f141691a, eVar4.f141691a);
        }
    }

    public static t<d> a(a aVar, e eVar) {
        t<R> a2 = aVar.a(eVar.f141691a, eVar.f141692b).a((f.a.d.g<? super e, ? extends x<? extends R>>) e.f141707a, false);
        l.a((Object) a2, "");
        return a2;
    }

    public static t<d> a(g gVar, e eVar) {
        t<d> b2 = t.b(new d(gVar, eVar));
        l.a((Object) b2, "");
        return b2;
    }

    public static Map<g, Boolean> a(boolean z, boolean z2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z && z2) {
            linkedHashMap.put(g.CHECK_UID_PERMISSION, true);
            linkedHashMap.put(g.CHECK_ACTUAL_PERMISSION, true);
        } else if (z) {
            if (!z2) {
                linkedHashMap.put(g.CHECK_UID_PERMISSION, true);
                linkedHashMap.put(g.CHECK_ACTUAL_PERMISSION, false);
            }
        } else if (z2) {
            linkedHashMap.put(g.CHECK_UID_PERMISSION, false);
            linkedHashMap.put(g.CHECK_ACTUAL_PERMISSION, true);
        } else {
            linkedHashMap.put(g.CHECK_UID_PERMISSION, false);
            linkedHashMap.put(g.CHECK_ACTUAL_PERMISSION, false);
        }
        return linkedHashMap;
    }

    public static t<d> a(a aVar, e eVar, t<d> tVar) {
        t<d> a2 = t.a(a(aVar, eVar), tVar);
        l.a((Object) a2, "");
        return a2;
    }

    public static t<d> a(Context context, Class<? extends a> cls, String str, String str2, String str3) {
        l.c(context, "");
        l.c(cls, "");
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        a aVar = (a) cls.newInstance();
        aVar.a(context, str, str2, str3, false, true, null);
        l.a((Object) aVar, "");
        return a(aVar, new e(false, 3, 0, null, 12));
    }

    public final t<d> a(Context context, Class<? extends a> cls, String str, String str2, String str3, boolean z, boolean z2, boolean z3, Map<String, String> map) {
        l.c(context, "");
        l.c(cls, "");
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        this.f141699b = z3;
        a aVar = (a) cls.newInstance();
        aVar.a(context, str, str2, str3, z2, z3, map);
        if (!z) {
            l.a((Object) aVar, "");
            return b(aVar);
        }
        this.f141698a = z2;
        l.a((Object) aVar, "");
        return c(aVar);
    }
}
