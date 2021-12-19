package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.p;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public final class f implements AdapterView.OnItemClickListener, o {

    /* renamed from: a  reason: collision with root package name */
    Context f1193a;

    /* renamed from: b  reason: collision with root package name */
    LayoutInflater f1194b;

    /* renamed from: c  reason: collision with root package name */
    h f1195c;

    /* renamed from: d  reason: collision with root package name */
    ExpandedMenuView f1196d;

    /* renamed from: e  reason: collision with root package name */
    public int f1197e;

    /* renamed from: f  reason: collision with root package name */
    int f1198f;

    /* renamed from: g  reason: collision with root package name */
    int f1199g;

    /* renamed from: h  reason: collision with root package name */
    public o.a f1200h;

    /* renamed from: i  reason: collision with root package name */
    a f1201i;

    /* renamed from: j  reason: collision with root package name */
    public int f1202j;

    static {
        Covode.recordClassIndex(336);
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean b(j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean c(j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final int b() {
        return this.f1202j;
    }

    /* access modifiers changed from: package-private */
    public class a extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private int f1204b = -1;

        static {
            Covode.recordClassIndex(337);
        }

        public final long getItemId(int i2) {
            return (long) i2;
        }

        public final void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }

        public final int getCount() {
            int size = f.this.f1195c.k().size() - f.this.f1197e;
            if (this.f1204b < 0) {
                return size;
            }
            return size - 1;
        }

        private void a() {
            j jVar = f.this.f1195c.f1222l;
            if (jVar != null) {
                ArrayList<j> k2 = f.this.f1195c.k();
                int size = k2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (k2.get(i2) == jVar) {
                        this.f1204b = i2;
                        return;
                    }
                }
            }
            this.f1204b = -1;
        }

        public a() {
            a();
        }

        /* renamed from: a */
        public final j getItem(int i2) {
            ArrayList<j> k2 = f.this.f1195c.k();
            int i3 = i2 + f.this.f1197e;
            int i4 = this.f1204b;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return k2.get(i3);
        }

        public final View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = com.a.a(f.this.f1194b, f.this.f1199g, viewGroup, false);
            }
            ((p.a) view).a(getItem(i2));
            return view;
        }
    }

    private f() {
        this.f1199g = R.layout.ah;
        this.f1198f = 0;
    }

    public final ListAdapter c() {
        if (this.f1201i == null) {
            this.f1201i = new a();
        }
        return this.f1201i;
    }

    @Override // androidx.appcompat.view.menu.o
    public final Parcelable f() {
        if (this.f1196d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f1196d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(o.a aVar) {
        this.f1200h = aVar;
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f1196d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public f(Context context) {
        this();
        this.f1193a = context;
        this.f1194b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(boolean z) {
        a aVar = this.f1201i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public final p a(ViewGroup viewGroup) {
        if (this.f1196d == null) {
            this.f1196d = (ExpandedMenuView) com.a.a(this.f1194b, R.layout.ae, viewGroup, false);
            if (this.f1201i == null) {
                this.f1201i = new a();
            }
            this.f1196d.setAdapter((ListAdapter) this.f1201i);
            this.f1196d.setOnItemClickListener(this);
        }
        return this.f1196d;
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean a(u uVar) {
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        i iVar = new i(uVar);
        h hVar = iVar.f1224a;
        c.a aVar = new c.a(hVar.f1211a);
        iVar.f1226c = new f(aVar.f903a.f865a);
        iVar.f1226c.f1200h = iVar;
        iVar.f1224a.a(iVar.f1226c);
        aVar.a(iVar.f1226c.c(), iVar);
        View view = hVar.f1220j;
        if (view != null) {
            aVar.f903a.f871g = view;
        } else {
            aVar.f903a.f868d = hVar.f1219i;
            aVar.a(hVar.f1218h);
        }
        aVar.f903a.u = iVar;
        iVar.f1225b = aVar.a();
        iVar.f1225b.setOnDismissListener(iVar);
        WindowManager.LayoutParams attributes = iVar.f1225b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        iVar.f1225b.show();
        o.a aVar2 = this.f1200h;
        if (aVar2 == null) {
            return true;
        }
        aVar2.a(uVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(h hVar, boolean z) {
        o.a aVar = this.f1200h;
        if (aVar != null) {
            aVar.a(hVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(Context context, h hVar) {
        if (this.f1198f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1198f);
            this.f1193a = contextThemeWrapper;
            this.f1194b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1193a != null) {
            this.f1193a = context;
            if (this.f1194b == null) {
                this.f1194b = LayoutInflater.from(context);
            }
        }
        this.f1195c = hVar;
        a aVar = this.f1201i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f1195c.a(this.f1201i.getItem(i2), this, 0);
    }
}
