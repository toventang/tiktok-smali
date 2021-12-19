package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class h implements androidx.core.a.a.a {
    private static final int[] n = {1, 4, 5, 3, 2, 0};
    private boolean A;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1211a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f1212b;

    /* renamed from: c  reason: collision with root package name */
    public a f1213c;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<j> f1214d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<j> f1215e;

    /* renamed from: f  reason: collision with root package name */
    public int f1216f;

    /* renamed from: g  reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f1217g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f1218h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f1219i;

    /* renamed from: j  reason: collision with root package name */
    public View f1220j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1221k;

    /* renamed from: l  reason: collision with root package name */
    public j f1222l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1223m;
    private boolean o;
    private boolean p;
    private ArrayList<j> q;
    private boolean r;
    private ArrayList<j> s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private ArrayList<j> y = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<o>> z = new CopyOnWriteArrayList<>();

    public interface a {
        static {
            Covode.recordClassIndex(340);
        }

        void a(h hVar);

        boolean a(h hVar, MenuItem menuItem);
    }

    public interface b {
        static {
            Covode.recordClassIndex(341);
        }

        boolean a(j jVar);
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "android:menu:actionviewstates";
    }

    public h l() {
        return this;
    }

    public boolean b() {
        return this.A;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.o;
    }

    public boolean d() {
        return this.p;
    }

    public final void a(o oVar) {
        a(oVar, this.f1211a);
    }

    public final void a(o oVar, Context context) {
        this.z.add(new WeakReference<>(oVar));
        oVar.a(context, this);
        this.t = true;
    }

    /* access modifiers changed from: package-private */
    public boolean a(h hVar, MenuItem menuItem) {
        a aVar = this.f1213c;
        return aVar != null && aVar.a(hVar, menuItem);
    }

    public final boolean a(MenuItem menuItem, o oVar, int i2) {
        j jVar = (j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        boolean b2 = jVar.b();
        androidx.core.h.b bVar = jVar.f1233f;
        boolean z2 = bVar != null && bVar.c();
        if (jVar.j()) {
            b2 |= jVar.expandActionView();
            if (b2) {
                a(true);
            }
        } else if (jVar.hasSubMenu() || z2) {
            if ((i2 & 4) == 0) {
                a(false);
            }
            if (!jVar.hasSubMenu()) {
                jVar.a(new u(this.f1211a, this, jVar));
            }
            u uVar = (u) jVar.getSubMenu();
            if (z2) {
                bVar.a(uVar);
            }
            b2 |= a(uVar, oVar);
            if (!b2) {
                a(true);
            }
        } else if ((i2 & 1) == 0) {
            a(true);
        }
        return b2;
    }

    public final void a(boolean z2) {
        if (!this.x) {
            this.x = true;
            Iterator<WeakReference<o>> it = this.z.iterator();
            while (it.hasNext()) {
                WeakReference<o> next = it.next();
                o oVar = next.get();
                if (oVar == null) {
                    this.z.remove(next);
                } else {
                    oVar.a(this, z2);
                }
            }
            this.x = false;
        }
    }

    /* access modifiers changed from: protected */
    public final h a(CharSequence charSequence) {
        a(0, charSequence, 0, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    public final h a(Drawable drawable) {
        a(0, null, 0, drawable, null);
        return this;
    }

    /* access modifiers changed from: protected */
    public final h a(View view) {
        a(0, null, 0, null, view);
        return this;
    }

    public boolean a(j jVar) {
        boolean z2 = false;
        if (this.z.isEmpty()) {
            return false;
        }
        e();
        Iterator<WeakReference<o>> it = this.z.iterator();
        while (it.hasNext()) {
            WeakReference<o> next = it.next();
            o oVar = next.get();
            if (oVar == null) {
                this.z.remove(next);
            } else {
                z2 = oVar.b(jVar);
                if (z2) {
                    break;
                }
            }
        }
        f();
        if (z2) {
            this.f1222l = jVar;
        }
        return z2;
    }

    public final void a(Bundle bundle) {
        Parcelable f2;
        if (!this.z.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator<WeakReference<o>> it = this.z.iterator();
            while (it.hasNext()) {
                WeakReference<o> next = it.next();
                o oVar = next.get();
                if (oVar == null) {
                    this.z.remove(next);
                } else {
                    int b2 = oVar.b();
                    if (b2 > 0 && (f2 = oVar.f()) != null) {
                        sparseArray.put(b2, f2);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    public void close() {
        a(true);
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        this.r = true;
        b(true);
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        this.t = true;
        b(true);
    }

    public final ArrayList<j> k() {
        j();
        return this.s;
    }

    public int size() {
        return this.f1214d.size();
    }

    public void clearHeader() {
        this.f1219i = null;
        this.f1218h = null;
        this.f1220j = null;
        b(false);
    }

    public final void e() {
        if (!this.u) {
            this.u = true;
            this.v = false;
            this.w = false;
        }
    }

    public final void f() {
        this.u = false;
        if (this.v) {
            this.v = false;
            b(this.w);
        }
    }

    static {
        Covode.recordClassIndex(339);
    }

    public void clear() {
        j jVar = this.f1222l;
        if (jVar != null) {
            b(jVar);
        }
        this.f1214d.clear();
        b(true);
    }

    public boolean hasVisibleItems() {
        if (this.f1223m) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1214d.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList<j> i() {
        if (!this.r) {
            return this.q;
        }
        this.q.clear();
        int size = this.f1214d.size();
        for (int i2 = 0; i2 < size; i2++) {
            j jVar = this.f1214d.get(i2);
            if (jVar.isVisible()) {
                this.q.add(jVar);
            }
        }
        this.r = false;
        this.t = true;
        return this.q;
    }

    public final void j() {
        ArrayList<j> i2 = i();
        if (this.t) {
            Iterator<WeakReference<o>> it = this.z.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference<o> next = it.next();
                o oVar = next.get();
                if (oVar == null) {
                    this.z.remove(next);
                } else {
                    z2 |= oVar.a();
                }
            }
            if (z2) {
                this.f1215e.clear();
                this.s.clear();
                int size = i2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    j jVar = i2.get(i3);
                    if (jVar.f()) {
                        this.f1215e.add(jVar);
                    } else {
                        this.s.add(jVar);
                    }
                }
            } else {
                this.f1215e.clear();
                this.s.clear();
                this.s.addAll(i());
            }
            this.t = false;
        }
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.A = z2;
    }

    public void a(a aVar) {
        this.f1213c = aVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void setQwertyMode(boolean z2) {
        this.o = z2;
        b(false);
    }

    /* access modifiers changed from: protected */
    public final h a(int i2) {
        a(i2, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return a(0, 0, 0, this.f1212b.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f1212b.getString(i2));
    }

    /* access modifiers changed from: protected */
    public final h b(int i2) {
        a(0, null, i2, null, null);
        return this;
    }

    public MenuItem getItem(int i2) {
        return this.f1214d.get(i2);
    }

    public void removeItem(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.f1214d.get(i3).getItemId() == i2) {
                break;
            } else {
                i3++;
            }
        }
        a(i3, true);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public final void b(o oVar) {
        Iterator<WeakReference<o>> it = this.z.iterator();
        while (it.hasNext()) {
            WeakReference<o> next = it.next();
            o oVar2 = next.get();
            if (oVar2 == null || oVar2 == oVar) {
                this.z.remove(next);
            }
        }
    }

    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = this.f1214d.get(i3);
            if (jVar.getItemId() == i2) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.getSubMenu().findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public void removeGroup(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f1214d.get(i3).getGroupId() == i2) {
                if (i3 >= 0) {
                    int size2 = this.f1214d.size() - i3;
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        if (i4 >= size2 || this.f1214d.get(i3).getGroupId() != i2) {
                            b(true);
                        } else {
                            a(i3, false);
                            i4 = i5;
                        }
                    }
                    b(true);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public h(Context context) {
        Resources resources;
        int identifier;
        boolean z2 = false;
        this.A = false;
        this.f1211a = context;
        Resources resources2 = context.getResources();
        this.f1212b = resources2;
        this.f1214d = new ArrayList<>();
        this.q = new ArrayList<>();
        this.r = true;
        this.f1215e = new ArrayList<>();
        this.s = new ArrayList<>();
        this.t = true;
        if (resources2.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT < 28 ? !((identifier = (resources = context.getResources()).getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android")) == 0 || !resources.getBoolean(identifier)) : viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent()) {
                z2 = true;
            }
        }
        this.p = z2;
    }

    public final void b(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.z.isEmpty()) {
            Iterator<WeakReference<o>> it = this.z.iterator();
            while (it.hasNext()) {
                WeakReference<o> next = it.next();
                o oVar = next.get();
                if (oVar == null) {
                    this.z.remove(next);
                } else {
                    int b2 = oVar.b();
                    if (b2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(b2)) != null) {
                        oVar.a(parcelable);
                    }
                }
            }
        }
    }

    public final void c(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((h) item.getSubMenu()).c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(a(), sparseArray);
        }
    }

    public final void d(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(a());
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((h) item.getSubMenu()).d(bundle);
                }
            }
            int i3 = bundle.getInt("android:menu:expandedactionview");
            if (i3 > 0 && (findItem = findItem(i3)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void b(boolean z2) {
        if (!this.u) {
            if (z2) {
                this.r = true;
                this.t = true;
            }
            if (!this.z.isEmpty()) {
                e();
                Iterator<WeakReference<o>> it = this.z.iterator();
                while (it.hasNext()) {
                    WeakReference<o> next = it.next();
                    o oVar = next.get();
                    if (oVar == null) {
                        this.z.remove(next);
                    } else {
                        oVar.a(z2);
                    }
                }
                f();
                return;
            }
            return;
        }
        this.v = true;
        if (z2) {
            this.w = true;
        }
    }

    public boolean b(j jVar) {
        boolean z2 = false;
        if (!this.z.isEmpty() && this.f1222l == jVar) {
            e();
            Iterator<WeakReference<o>> it = this.z.iterator();
            while (it.hasNext()) {
                WeakReference<o> next = it.next();
                o oVar = next.get();
                if (oVar == null) {
                    this.z.remove(next);
                } else {
                    z2 = oVar.c(jVar);
                    if (z2) {
                        break;
                    }
                }
            }
            f();
            if (z2) {
                this.f1222l = null;
            }
        }
        return z2;
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        if (a(i2, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return a(findItem(i2), (o) null, i3);
    }

    private static int a(ArrayList<j> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f1228a <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    public void setGroupEnabled(int i2, boolean z2) {
        int size = this.f1214d.size();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = this.f1214d.get(i3);
            if (jVar.getGroupId() == i2) {
                jVar.setEnabled(z2);
            }
        }
    }

    public void setGroupVisible(int i2, boolean z2) {
        int size = this.f1214d.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = this.f1214d.get(i3);
            if (jVar.getGroupId() == i2 && jVar.b(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            b(true);
        }
    }

    private j a(int i2, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<j> arrayList = this.y;
        arrayList.clear();
        a(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean c2 = c();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = arrayList.get(i3);
            if (c2) {
                numericShortcut = jVar.getAlphabeticShortcut();
            } else {
                numericShortcut = jVar.getNumericShortcut();
            }
            if ((numericShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((numericShortcut == keyData.meta[2] && (metaState & 2) != 0) || (c2 && numericShortcut == '\b' && i2 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    private void a(int i2, boolean z2) {
        if (i2 >= 0 && i2 < this.f1214d.size()) {
            this.f1214d.remove(i2);
            if (z2) {
                b(true);
            }
        }
    }

    private boolean a(u uVar, o oVar) {
        boolean z2 = false;
        if (this.z.isEmpty()) {
            return false;
        }
        if (oVar != null) {
            z2 = oVar.a(uVar);
        }
        Iterator<WeakReference<o>> it = this.z.iterator();
        while (it.hasNext()) {
            WeakReference<o> next = it.next();
            o oVar2 = next.get();
            if (oVar2 == null) {
                this.z.remove(next);
            } else if (!z2) {
                z2 = oVar2.a(uVar);
            }
        }
        return z2;
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        boolean z2;
        j a2 = a(i2, keyEvent);
        if (a2 != null) {
            z2 = a(a2, (o) null, i3);
        } else {
            z2 = false;
        }
        if ((i3 & 2) != 0) {
            a(true);
        }
        return z2;
    }

    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int size = this.f1214d.size();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = this.f1214d.get(i3);
            if (jVar.getGroupId() == i2) {
                jVar.a(z3);
                jVar.setCheckable(z2);
            }
        }
    }

    private void a(List<j> list, int i2, KeyEvent keyEvent) {
        char numericShortcut;
        int numericModifiers;
        boolean c2 = c();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f1214d.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar = this.f1214d.get(i3);
                if (jVar.hasSubMenu()) {
                    ((h) jVar.getSubMenu()).a(list, i2, keyEvent);
                }
                if (c2) {
                    numericShortcut = jVar.getAlphabeticShortcut();
                    numericModifiers = jVar.getAlphabeticModifiers();
                } else {
                    numericShortcut = jVar.getNumericShortcut();
                    numericModifiers = jVar.getNumericModifiers();
                }
                if ((modifiers & 69647) == (numericModifiers & 69647) && numericShortcut != 0 && ((numericShortcut == keyData.meta[0] || numericShortcut == keyData.meta[2] || (c2 && numericShortcut == '\b' && i2 == 67)) && jVar.isEnabled())) {
                    list.add(jVar);
                }
            }
        }
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f1212b.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f1212b.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        j jVar = (j) a(i2, i3, i4, charSequence);
        u uVar = new u(this.f1211a, this, jVar);
        jVar.a(uVar);
        return uVar;
    }

    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5 = (-65536 & i4) >> 16;
        if (i5 >= 0) {
            int[] iArr = n;
            if (i5 < iArr.length) {
                int i6 = (iArr[i5] << 16) | (65535 & i4);
                j jVar = new j(this, i2, i3, i4, i6, charSequence, this.f1216f);
                ContextMenu.ContextMenuInfo contextMenuInfo = this.f1217g;
                if (contextMenuInfo != null) {
                    jVar.f1234g = contextMenuInfo;
                }
                ArrayList<j> arrayList = this.f1214d;
                arrayList.add(a(arrayList, i6), jVar);
                b(true);
                return jVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void a(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resources = this.f1212b;
        if (view != null) {
            this.f1220j = view;
            this.f1218h = null;
            this.f1219i = null;
        } else {
            if (i2 > 0) {
                this.f1218h = resources.getText(i2);
            } else if (charSequence != null) {
                this.f1218h = charSequence;
            }
            if (i3 > 0) {
                this.f1219i = androidx.core.content.b.a(this.f1211a, i3);
            } else if (drawable != null) {
                this.f1219i = drawable;
            }
            this.f1220j = null;
        }
        b(false);
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        Intent intent2;
        PackageManager packageManager = this.f1211a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i6 = queryIntentActivityOptions.size();
        } else {
            i6 = 0;
        }
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < i6; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[resolveInfo.specificIndex];
            }
            Intent intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent4 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent4;
            }
        }
        return i6;
    }
}
