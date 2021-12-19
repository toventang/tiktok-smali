package com.bytedance.jedi.ext.adapter.internal;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class c extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    public static final String f39729c = c.class.getCanonicalName();

    /* renamed from: d  reason: collision with root package name */
    public static final a f39730d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Fragment f39731a;

    /* renamed from: b  reason: collision with root package name */
    final Set<h.f.a.a<z>> f39732b = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    private final Map<i, d> f39733e = new WeakHashMap();

    /* renamed from: f  reason: collision with root package name */
    private HashMap f39734f;

    public static final class a {
        static {
            Covode.recordClassIndex(24477);
        }

        private a() {
        }

        /* renamed from: com.bytedance.jedi.ext.adapter.internal.c$a$a  reason: collision with other inner class name */
        public static final class C0973a extends i.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f39735a;

            static {
                Covode.recordClassIndex(24478);
            }

            C0973a(c cVar) {
                this.f39735a = cVar;
            }

            @Override // androidx.fragment.app.i.b
            public final void onFragmentViewDestroyed(androidx.fragment.app.i iVar, Fragment fragment) {
                l.c(iVar, "");
                l.c(fragment, "");
                if (fragment == this.f39735a.f39731a) {
                    iVar.a(this);
                    fragment.getChildFragmentManager().a().a(this.f39735a).e();
                    c cVar = this.f39735a;
                    Iterator<T> it = cVar.f39732b.iterator();
                    while (it.hasNext()) {
                        it.next().invoke();
                    }
                    cVar.f39732b.clear();
                }
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static c a(e eVar, Fragment fragment) {
            androidx.fragment.app.i iVar;
            androidx.fragment.app.i fragmentManager;
            if (eVar == null || (iVar = eVar.getSupportFragmentManager()) == null) {
                if (fragment == null) {
                    l.a();
                }
                iVar = fragment.getChildFragmentManager();
                l.a((Object) iVar, "");
            }
            Fragment a2 = iVar.a(c.f39729c);
            if (!(a2 instanceof c)) {
                a2 = null;
            }
            c cVar = (c) a2;
            if (cVar == null) {
                cVar = new c();
                cVar.f39731a = fragment;
                if (!(fragment == null || (fragmentManager = fragment.getFragmentManager()) == null)) {
                    fragmentManager.a((i.b) new C0973a(cVar), false);
                }
                iVar.a().a(cVar, c.f39729c).e();
            }
            return cVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f39734f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static {
        Covode.recordClassIndex(24476);
    }

    public final d a(androidx.lifecycle.i iVar) {
        l.c(iVar, "");
        return this.f39733e.get(iVar);
    }

    public final void a(androidx.lifecycle.i iVar, d dVar) {
        l.c(iVar, "");
        l.c(dVar, "");
        this.f39733e.put(iVar, dVar);
    }
}
