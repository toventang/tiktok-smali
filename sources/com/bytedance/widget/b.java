package com.bytedance.widget;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class b extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    public static final String f46132d = b.class.getCanonicalName();

    /* renamed from: e  reason: collision with root package name */
    public static final a f46133e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Fragment f46134a;

    /* renamed from: b  reason: collision with root package name */
    final List<Object> f46135b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    final Set<h.f.a.a<z>> f46136c = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<Integer, Widget> f46137f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private final Map<i, c> f46138g = new WeakHashMap();

    /* renamed from: h  reason: collision with root package name */
    private HashMap f46139h;

    public static final class a {
        static {
            Covode.recordClassIndex(28189);
        }

        private a() {
        }

        /* renamed from: com.bytedance.widget.b$a$a  reason: collision with other inner class name */
        public static final class C1147a extends i.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f46140a;

            static {
                Covode.recordClassIndex(28190);
            }

            C1147a(b bVar) {
                this.f46140a = bVar;
            }

            @Override // androidx.fragment.app.i.b
            public final void onFragmentViewDestroyed(androidx.fragment.app.i iVar, Fragment fragment) {
                l.c(iVar, "");
                l.c(fragment, "");
                if (fragment == this.f46140a.f46134a) {
                    iVar.a(this);
                    fragment.getChildFragmentManager().a().a(this.f46140a).e();
                    b bVar = this.f46140a;
                    Iterator<T> it = bVar.f46136c.iterator();
                    while (it.hasNext()) {
                        it.next().invoke();
                    }
                    bVar.f46136c.clear();
                }
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final Context a() {
        Context requireContext = requireContext();
        l.a((Object) requireContext, "");
        return requireContext;
    }

    public final Object b() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        Object requireHost = requireHost();
        l.a(requireHost, "");
        return requireHost;
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f46139h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static {
        Covode.recordClassIndex(28188);
    }

    public final c a(androidx.lifecycle.i iVar) {
        l.c(iVar, "");
        return this.f46138g.get(iVar);
    }

    public final void a(Widget widget) {
        l.c(widget, "");
        Iterator<T> it = this.f46135b.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (widget.f46128f) {
            widget.f46128f = false;
        }
    }

    public final void a(androidx.lifecycle.i iVar, c cVar) {
        l.c(iVar, "");
        l.c(cVar, "");
        this.f46138g.put(iVar, cVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        this.f46137f.get(Integer.valueOf(i2));
        this.f46137f.remove(Integer.valueOf(i2));
    }
}
