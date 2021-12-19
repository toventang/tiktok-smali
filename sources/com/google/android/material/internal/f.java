package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.u;
import androidx.core.h.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public final class f implements o {

    /* renamed from: a  reason: collision with root package name */
    public NavigationMenuView f52531a;

    /* renamed from: b  reason: collision with root package name */
    public LinearLayout f52532b;

    /* renamed from: c  reason: collision with root package name */
    androidx.appcompat.view.menu.h f52533c;

    /* renamed from: d  reason: collision with root package name */
    public int f52534d;

    /* renamed from: e  reason: collision with root package name */
    public b f52535e;

    /* renamed from: f  reason: collision with root package name */
    public LayoutInflater f52536f;

    /* renamed from: g  reason: collision with root package name */
    int f52537g;

    /* renamed from: h  reason: collision with root package name */
    boolean f52538h;

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f52539i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f52540j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f52541k;

    /* renamed from: l  reason: collision with root package name */
    public int f52542l;

    /* renamed from: m  reason: collision with root package name */
    public int f52543m;
    public int n;
    int o;
    final View.OnClickListener p = new View.OnClickListener() {
        /* class com.google.android.material.internal.f.AnonymousClass1 */

        static {
            Covode.recordClassIndex(32546);
        }

        public final void onClick(View view) {
            f.this.b(true);
            androidx.appcompat.view.menu.j itemData = ((NavigationMenuItemView) view).getItemData();
            boolean a2 = f.this.f52533c.a(itemData, f.this, 0);
            if (itemData != null && itemData.isCheckable() && a2) {
                f.this.f52535e.a(itemData);
            }
            f.this.b(false);
            f.this.a(false);
        }
    };
    private o.a q;

    /* access modifiers changed from: package-private */
    public interface d {
        static {
            Covode.recordClassIndex(32550);
        }
    }

    static {
        Covode.recordClassIndex(32545);
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean a(u uVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean b(androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean c(androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public static class c implements d {
        static {
            Covode.recordClassIndex(32549);
        }

        c() {
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public final int b() {
        return this.f52534d;
    }

    public class b extends RecyclerView.a<j> {

        /* renamed from: a  reason: collision with root package name */
        final ArrayList<d> f52545a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public androidx.appcompat.view.menu.j f52546b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f52547c;

        static {
            Covode.recordClassIndex(32548);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final long getItemId(int i2) {
            return (long) i2;
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ j onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(this, viewGroup, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemCount() {
            return this.f52545a.size();
        }

        public final Bundle b() {
            androidx.appcompat.view.menu.j jVar;
            View actionView;
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.j jVar2 = this.f52546b;
            if (jVar2 != null) {
                bundle.putInt("android:menu:checked", jVar2.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f52545a.size();
            for (int i2 = 0; i2 < size; i2++) {
                d dVar = this.f52545a.get(i2);
                if (!(!(dVar instanceof C1222f) || (jVar = ((C1222f) dVar).f52551a) == null || (actionView = jVar.getActionView()) == null)) {
                    ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                    actionView.saveHierarchyState(parcelableSparseArray);
                    sparseArray.put(jVar.getItemId(), parcelableSparseArray);
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (!this.f52547c) {
                this.f52547c = true;
                this.f52545a.clear();
                this.f52545a.add(new c());
                int i2 = -1;
                int size = f.this.f52533c.i().size();
                boolean z = false;
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    androidx.appcompat.view.menu.j jVar = f.this.f52533c.i().get(i4);
                    if (jVar.isChecked()) {
                        a(jVar);
                    }
                    if (jVar.isCheckable()) {
                        jVar.a(false);
                    }
                    if (jVar.hasSubMenu()) {
                        SubMenu subMenu = jVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i4 != 0) {
                                this.f52545a.add(new e(f.this.o, 0));
                            }
                            this.f52545a.add(new C1222f(jVar));
                            int size2 = this.f52545a.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i5 = 0; i5 < size3; i5++) {
                                androidx.appcompat.view.menu.j jVar2 = (androidx.appcompat.view.menu.j) subMenu.getItem(i5);
                                if (jVar2.isVisible()) {
                                    if (!z2 && jVar2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (jVar2.isCheckable()) {
                                        jVar2.a(false);
                                    }
                                    if (jVar.isChecked()) {
                                        a(jVar);
                                    }
                                    this.f52545a.add(new C1222f(jVar2));
                                }
                            }
                            if (z2) {
                                a(size2, this.f52545a.size());
                            }
                        }
                    } else {
                        int groupId = jVar.getGroupId();
                        if (groupId != i2) {
                            i3 = this.f52545a.size();
                            if (jVar.getIcon() != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (i4 != 0) {
                                i3++;
                                this.f52545a.add(new e(f.this.o, f.this.o));
                            }
                        } else if (!z && jVar.getIcon() != null) {
                            a(i3, this.f52545a.size());
                            z = true;
                        }
                        C1222f fVar = new C1222f(jVar);
                        fVar.f52552b = z;
                        this.f52545a.add(fVar);
                        i2 = groupId;
                    }
                }
                this.f52547c = false;
            }
        }

        public b() {
            a();
        }

        public final void a(androidx.appcompat.view.menu.j jVar) {
            if (this.f52546b != jVar && jVar.isCheckable()) {
                androidx.appcompat.view.menu.j jVar2 = this.f52546b;
                if (jVar2 != null) {
                    jVar2.setChecked(false);
                }
                this.f52546b = jVar;
                jVar.setChecked(true);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemViewType(int i2) {
            d dVar = this.f52545a.get(i2);
            if (dVar instanceof e) {
                return 2;
            }
            if (dVar instanceof c) {
                return 3;
            }
            if (!(dVar instanceof C1222f)) {
                throw new RuntimeException("Unknown item type.");
            } else if (((C1222f) dVar).f52551a.hasSubMenu()) {
                return 1;
            } else {
                return 0;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onViewRecycled(j jVar) {
            MethodCollector.i(3555);
            j jVar2 = jVar;
            if (jVar2 instanceof g) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) jVar2.itemView;
                if (navigationMenuItemView.f52489e != null) {
                    navigationMenuItemView.f52489e.removeAllViews();
                }
                navigationMenuItemView.f52488d.setCompoundDrawables(null, null, null, null);
            }
            MethodCollector.o(3555);
        }

        private void a(int i2, int i3) {
            while (i2 < i3) {
                ((C1222f) this.f52545a.get(i2)).f52552b = true;
                i2++;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(j jVar, int i2) {
            Drawable drawable;
            j jVar2 = jVar;
            int itemViewType = getItemViewType(i2);
            if (itemViewType == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) jVar2.itemView;
                navigationMenuItemView.setIconTintList(f.this.f52540j);
                if (f.this.f52538h) {
                    navigationMenuItemView.setTextAppearance(f.this.f52537g);
                }
                if (f.this.f52539i != null) {
                    navigationMenuItemView.setTextColor(f.this.f52539i);
                }
                if (f.this.f52541k != null) {
                    drawable = f.this.f52541k.getConstantState().newDrawable();
                } else {
                    drawable = null;
                }
                v.a(navigationMenuItemView, drawable);
                C1222f fVar = (C1222f) this.f52545a.get(i2);
                navigationMenuItemView.setNeedsEmptyIcon(fVar.f52552b);
                navigationMenuItemView.setHorizontalPadding(f.this.f52542l);
                navigationMenuItemView.setIconPadding(f.this.f52543m);
                navigationMenuItemView.a(fVar.f52551a);
            } else if (itemViewType == 1) {
                ((TextView) jVar2.itemView).setText(((C1222f) this.f52545a.get(i2)).f52551a.getTitle());
            } else if (itemViewType == 2) {
                e eVar = (e) this.f52545a.get(i2);
                jVar2.itemView.setPadding(0, eVar.f52549a, 0, eVar.f52550b);
            }
        }

        private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
            RecyclerView.ViewHolder viewHolder;
            MethodCollector.i(3864);
            boolean z = true;
            if (i2 == 0) {
                viewHolder = new g(f.this.f52536f, viewGroup, f.this.p);
            } else if (i2 == 1) {
                viewHolder = new i(f.this.f52536f, viewGroup);
            } else if (i2 == 2) {
                viewHolder = new h(f.this.f52536f, viewGroup);
            } else if (i2 != 3) {
                viewHolder = null;
            } else {
                viewHolder = new a(f.this.f52532b);
            }
            try {
                if (viewHolder.itemView.getParent() != null) {
                    try {
                        z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewHolder.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = viewHolder.getClass().getName();
            MethodCollector.o(3864);
            return viewHolder;
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public final Parcelable f() {
        Bundle bundle = new Bundle();
        if (this.f52531a != null) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            this.f52531a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        b bVar = this.f52535e;
        if (bVar != null) {
            bundle.putBundle("android:menu:adapter", bVar.b());
        }
        if (this.f52532b != null) {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            this.f52532b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public static class a extends j {
        static {
            Covode.recordClassIndex(32547);
        }

        public a(View view) {
            super(view);
        }
    }

    static abstract class j extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(32556);
        }

        public j(View view) {
            super(view);
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(o.a aVar) {
        this.q = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.f$f  reason: collision with other inner class name */
    public static class C1222f implements d {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.appcompat.view.menu.j f52551a;

        /* renamed from: b  reason: collision with root package name */
        boolean f52552b;

        static {
            Covode.recordClassIndex(32552);
        }

        C1222f(androidx.appcompat.view.menu.j jVar) {
            this.f52551a = jVar;
        }
    }

    public final void a(ColorStateList colorStateList) {
        this.f52540j = colorStateList;
        a(false);
    }

    public final void b(int i2) {
        this.f52542l = i2;
        a(false);
    }

    public final void c(int i2) {
        this.f52543m = i2;
        a(false);
    }

    public final void a(int i2) {
        this.f52537g = i2;
        this.f52538h = true;
        a(false);
    }

    public final void b(ColorStateList colorStateList) {
        this.f52539i = colorStateList;
        a(false);
    }

    public final void b(boolean z) {
        b bVar = this.f52535e;
        if (bVar != null) {
            bVar.f52547c = z;
        }
    }

    public final void a(Drawable drawable) {
        this.f52541k = drawable;
        a(false);
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(Parcelable parcelable) {
        androidx.appcompat.view.menu.j jVar;
        View actionView;
        SparseArray<Parcelable> sparseArray;
        androidx.appcompat.view.menu.j jVar2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f52531a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                b bVar = this.f52535e;
                int i2 = bundle2.getInt("android:menu:checked", 0);
                if (i2 != 0) {
                    bVar.f52547c = true;
                    int size = bVar.f52545a.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        d dVar = bVar.f52545a.get(i3);
                        if ((dVar instanceof C1222f) && (jVar2 = ((C1222f) dVar).f52551a) != null && jVar2.getItemId() == i2) {
                            bVar.a(jVar2);
                            break;
                        }
                        i3++;
                    }
                    bVar.f52547c = false;
                    bVar.a();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = bVar.f52545a.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        d dVar2 = bVar.f52545a.get(i4);
                        if (!(!(dVar2 instanceof C1222f) || (jVar = ((C1222f) dVar2).f52551a) == null || (actionView = jVar.getActionView()) == null || (sparseArray = (SparseArray) sparseParcelableArray2.get(jVar.getItemId())) == null)) {
                            actionView.restoreHierarchyState(sparseArray);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f52532b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    public final void a(androidx.appcompat.view.menu.j jVar) {
        this.f52535e.a(jVar);
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(boolean z) {
        b bVar = this.f52535e;
        if (bVar != null) {
            bVar.a();
            bVar.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    public static class e implements d {

        /* renamed from: a  reason: collision with root package name */
        public final int f52549a;

        /* renamed from: b  reason: collision with root package name */
        public final int f52550b;

        static {
            Covode.recordClassIndex(32551);
        }

        public e(int i2, int i3) {
            this.f52549a = i2;
            this.f52550b = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public static class h extends j {
        static {
            Covode.recordClassIndex(32554);
        }

        public h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(com.a.a(layoutInflater, R.layout.vt, viewGroup, false));
        }
    }

    /* access modifiers changed from: package-private */
    public static class i extends j {
        static {
            Covode.recordClassIndex(32555);
        }

        public i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(com.a.a(layoutInflater, R.layout.vu, viewGroup, false));
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(Context context, androidx.appcompat.view.menu.h hVar) {
        this.f52536f = LayoutInflater.from(context);
        this.f52533c = hVar;
        this.o = context.getResources().getDimensionPixelOffset(R.dimen.hy);
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(androidx.appcompat.view.menu.h hVar, boolean z) {
        o.a aVar = this.q;
        if (aVar != null) {
            aVar.a(hVar, z);
        }
    }

    /* access modifiers changed from: package-private */
    public static class g extends j {
        static {
            Covode.recordClassIndex(32553);
        }

        public g(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(com.a.a(layoutInflater, R.layout.vr, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }
}
