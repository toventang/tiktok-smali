package com.ss.android.ugc.aweme.homepage.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.by;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;

public final class b extends com.ss.android.ugc.aweme.base.ui.b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f99502e = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public SparseArray<Fragment> f99503c = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f99504d;

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.ies.uikit.a.b f99505f;

    /* renamed from: g  reason: collision with root package name */
    private final e f99506g;

    /* renamed from: h  reason: collision with root package name */
    private final List<by> f99507h;

    /* renamed from: i  reason: collision with root package name */
    private WeakReference<Fragment> f99508i;

    /* renamed from: j  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.homepage.ui.a.a f99509j;

    static {
        Covode.recordClassIndex(63465);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63466);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f99507h.size();
    }

    public final Fragment a() {
        WeakReference<Fragment> weakReference = this.f99508i;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i2) {
        return this.f99507h.get(i2).U_();
    }

    public final int b(int i2) {
        if (i2 < 0 || i2 >= this.f99507h.size()) {
            return -1;
        }
        return this.f99507h.get(i2).a();
    }

    public final int c(int i2) {
        if (this.f99507h.size() <= 0) {
            return -1;
        }
        int size = this.f99507h.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f99507h.get(i3).a() == i2) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b8  */
    @Override // com.ss.android.ugc.aweme.base.ui.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.Fragment a(int r11) {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.b.a(int):androidx.fragment.app.Fragment");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.util.SparseArray<androidx.fragment.app.Fragment> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.base.ui.b
    public final Object instantiateItem(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        Object instantiateItem = super.instantiateItem(viewGroup, i2);
        l.b(instantiateItem, "");
        SparseArray<Fragment> sparseArray = this.f99503c;
        Objects.requireNonNull(instantiateItem, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        sparseArray.put(i2, instantiateItem);
        com.ss.android.ugc.aweme.homepage.ui.a.a aVar = this.f99509j;
        if (aVar != null) {
            aVar.a(this.f99503c);
        }
        return instantiateItem;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(com.bytedance.ies.uikit.a.b bVar, com.ss.android.ugc.aweme.homepage.ui.a.a aVar) {
        super(bVar.getChildFragmentManager());
        l.d(bVar, "");
        this.f99509j = aVar;
        this.f99505f = bVar;
        Context context = bVar.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        e eVar = (e) context;
        this.f99506g = eVar;
        this.f99507h = HomeTabViewModel.a.a(eVar).b();
        SharePrefCache inst = SharePrefCache.inst();
        l.b(inst, "");
        aj<Boolean> showTimeLineTab = inst.getShowTimeLineTab();
        l.b(showTimeLineTab, "");
        Boolean c2 = showTimeLineTab.c();
        l.b(c2, "");
        this.f99504d = c2.booleanValue();
        if (aVar != null) {
            aVar.a(this.f99503c);
        }
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
                this.f99503c.remove(i2);
                com.ss.android.ugc.aweme.homepage.ui.a.a aVar = this.f99509j;
                if (aVar != null) {
                    aVar.a(this.f99503c);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.base.ui.b
    public final void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment;
        l.d(viewGroup, "");
        l.d(obj, "");
        super.setPrimaryItem(viewGroup, i2, obj);
        WeakReference<Fragment> weakReference = this.f99508i;
        if (weakReference != null) {
            fragment = weakReference.get();
        } else {
            fragment = null;
        }
        if (fragment != obj) {
            WeakReference<Fragment> weakReference2 = new WeakReference<>(obj);
            this.f99508i = weakReference2;
            com.ss.android.ugc.aweme.homepage.ui.a.a aVar = this.f99509j;
            if (aVar != null) {
                aVar.a(weakReference2);
            }
        }
    }
}
