package com.ss.android.ugc.aweme.dsp;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.base.ui.b;
import com.ss.android.ugc.aweme.dsp.TTDspViewModel;
import com.ss.android.ugc.aweme.dsp.library.g;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class c extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f83270c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private SparseArray<Fragment> f83271d;

    /* renamed from: e  reason: collision with root package name */
    private final e f83272e;

    /* renamed from: f  reason: collision with root package name */
    private final List<com.ss.android.ugc.aweme.dsp.ui.a.a.a> f83273f;

    /* renamed from: g  reason: collision with root package name */
    private WeakReference<Fragment> f83274g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f83275h;

    /* renamed from: i  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.homepage.ui.a.a f83276i = null;

    /* renamed from: j  reason: collision with root package name */
    private final a f83277j;

    static {
        Covode.recordClassIndex(51919);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51920);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f83273f.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i2) {
        return this.f83273f.get(i2).d();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.b
    public final Fragment a(int i2) {
        T t;
        Class<? extends Fragment> cls;
        String a2 = this.f83273f.get(i2).a();
        Fragment fragment = null;
        try {
            TTDspViewModel a3 = TTDspViewModel.a.a(this.f83272e);
            l.d(a2, "");
            Iterator<T> it = a3.f83233b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (l.a((Object) a2, (Object) t.a())) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                cls = t2.b();
            } else {
                cls = null;
            }
            if (cls != null) {
                Object newInstance = cls.newInstance();
                if (newInstance != null) {
                    fragment = (Fragment) newInstance;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (fragment == null) {
            if (a2.hashCode() == 804389781 && a2.equals("Daily Mix")) {
                fragment = new com.ss.android.ugc.aweme.dsp.playpage.mainpage.a();
            } else {
                fragment = new g();
            }
        }
        Bundle b2 = TTDspViewModel.a.a(this.f83272e).b(a2);
        if (b2 != null) {
            b2.putString("enter_from", this.f83277j.a());
            b2.putString("enter_method", this.f83277j.c());
            fragment.setArguments(b2);
        }
        return fragment;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.util.SparseArray<androidx.fragment.app.Fragment> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.base.ui.b
    public final Object instantiateItem(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        Object instantiateItem = super.instantiateItem(viewGroup, i2);
        l.b(instantiateItem, "");
        SparseArray<Fragment> sparseArray = this.f83271d;
        Objects.requireNonNull(instantiateItem, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        sparseArray.put(i2, instantiateItem);
        com.ss.android.ugc.aweme.homepage.ui.a.a aVar = this.f83276i;
        if (aVar != null) {
            aVar.a(this.f83271d);
        }
        return instantiateItem;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.bytedance.ies.foundation.fragment.a aVar, a aVar2) {
        super(aVar.getChildFragmentManager());
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f83277j = aVar2;
        this.f83271d = new SparseArray<>();
        Context context = aVar.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f83272e = (e) context;
        e activity = aVar.getActivity();
        if (activity == null) {
            l.b();
        }
        l.b(activity, "");
        this.f83273f = TTDspViewModel.a.a(activity).f83233b;
        SharePrefCache inst = SharePrefCache.inst();
        l.b(inst, "");
        aj<Boolean> showTimeLineTab = inst.getShowTimeLineTab();
        l.b(showTimeLineTab, "");
        Boolean c2 = showTimeLineTab.c();
        l.b(c2, "");
        this.f83275h = c2.booleanValue();
    }

    @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.base.ui.b
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        l.d(viewGroup, "");
        l.d(obj, "");
        super.destroyItem(viewGroup, i2, obj);
        if (obj instanceof Fragment) {
            try {
                if (this.f68359b != null) {
                    this.f68359b.a((Fragment) obj);
                }
                this.f83271d.remove(i2);
                com.ss.android.ugc.aweme.homepage.ui.a.a aVar = this.f83276i;
                if (aVar != null) {
                    aVar.a(this.f83271d);
                }
            } catch (Exception e2) {
                String.valueOf("destroyItem remove fragment exception: ".concat(String.valueOf(e2)));
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.base.ui.b
    public final void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment;
        l.d(viewGroup, "");
        l.d(obj, "");
        super.setPrimaryItem(viewGroup, i2, obj);
        WeakReference<Fragment> weakReference = this.f83274g;
        if (weakReference != null) {
            fragment = weakReference.get();
        } else {
            fragment = null;
        }
        if (fragment != obj) {
            WeakReference<Fragment> weakReference2 = new WeakReference<>(obj);
            this.f83274g = weakReference2;
            com.ss.android.ugc.aweme.homepage.ui.a.a aVar = this.f83276i;
            if (aVar != null) {
                aVar.a(weakReference2);
            }
        }
    }
}
