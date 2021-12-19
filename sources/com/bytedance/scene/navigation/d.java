package com.bytedance.scene.navigation;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.c.e;
import androidx.core.h.v;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.scene.a.a.a;
import com.bytedance.scene.a.b.a;
import com.bytedance.scene.c.c;
import com.bytedance.scene.c.f;
import com.bytedance.scene.d.g;
import com.bytedance.scene.d.h;
import com.bytedance.scene.d.i;
import com.bytedance.scene.d.k;
import com.bytedance.scene.e.b;
import com.bytedance.scene.j;
import com.bytedance.scene.l;
import com.bytedance.scene.navigation.f;
import com.bytedance.scene.r;
import com.bytedance.scene.w;
import com.bytedance.scene.y;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class d extends j implements c, r, y {

    /* renamed from: a  reason: collision with root package name */
    public l f42953a;

    /* renamed from: b  reason: collision with root package name */
    g f42954b;

    /* renamed from: c  reason: collision with root package name */
    public f f42955c;

    /* renamed from: d  reason: collision with root package name */
    public FrameLayout f42956d;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f42957e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.scene.a.d f42958f = new a();

    /* renamed from: g  reason: collision with root package name */
    public final List<a.AbstractC1041a> f42959g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List<c> f42960h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private boolean f42961i = true;

    /* renamed from: j  reason: collision with root package name */
    private final e<Class, com.bytedance.scene.group.d> f42962j = new e<>(3);

    /* renamed from: k  reason: collision with root package name */
    private final List<com.bytedance.scene.d.e<c, Boolean>> f42963k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private a.AbstractC1041a f42964l = new a.AbstractC1041a() {
        /* class com.bytedance.scene.navigation.d.AnonymousClass2 */

        static {
            Covode.recordClassIndex(26347);
        }
    };

    static {
        Covode.recordClassIndex(26345);
    }

    @Override // com.bytedance.scene.r
    public final void cj_() {
        this.f42961i = false;
    }

    @Override // com.bytedance.scene.r
    public final boolean ck_() {
        return this.f42961i;
    }

    @Override // com.bytedance.scene.j
    public final void n() {
        super.n();
    }

    public final void a(h hVar) {
        com.bytedance.scene.d.j.a();
        this.f42955c.a(hVar);
    }

    public final void a(Class<? extends j> cls, Bundle bundle, f fVar) {
        com.bytedance.scene.group.d dVar;
        if (!com.bytedance.scene.group.d.class.isAssignableFrom(cls) || (dVar = this.f42962j.a(cls)) == null) {
            dVar = g.a(cls, bundle);
        } else if (bundle != null) {
            dVar.r = bundle;
        }
        b(dVar, fVar);
    }

    public final void a(boolean z) {
        ((com.bytedance.scene.e.c) this.n).setTouchEnabled(!z);
    }

    @Override // com.bytedance.scene.navigation.c
    public final void a(j jVar, j jVar2, boolean z) {
        for (c cVar : new ArrayList(this.f42960h)) {
            cVar.a(jVar, jVar2, z);
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(j jVar, boolean z) {
        if (jVar != this) {
            for (com.bytedance.scene.d.e eVar : new ArrayList(this.f42963k)) {
                if (!z) {
                    eVar.f42771b.booleanValue();
                }
            }
        }
        super.a(jVar, z);
    }

    public final void D() {
        j b2 = this.f42955c.b();
        if (b2 != null) {
            i.a(b2.n);
        }
    }

    @Override // com.bytedance.scene.j
    public final void cl_() {
        super.cl_();
        a(w.STARTED);
    }

    @Override // com.bytedance.scene.j
    public final void cm_() {
        super.cm_();
        a(w.RESUMED);
    }

    @Override // com.bytedance.scene.j
    public final void cn_() {
        a(w.STARTED);
        super.cn_();
    }

    @Override // com.bytedance.scene.j
    public final void co_() {
        a(w.ACTIVITY_CREATED);
        super.co_();
    }

    public final j d() {
        f fVar = this.f42955c;
        if (fVar == null) {
            return null;
        }
        return fVar.b();
    }

    @Override // com.bytedance.scene.j
    public final void y() {
        super.y();
        this.f42955c.d();
    }

    public final void F() {
        com.bytedance.scene.d.j.a();
        if (k.a(this.f42913m)) {
            D();
            this.f42955c.a();
        }
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        w wVar = w.NONE;
        f fVar = this.f42955c;
        String a2 = fVar.a("NavigationManager dispatchChildrenState");
        new f.h(fVar, wVar).a(f.f42967j);
        fVar.b(a2);
        super.n_();
    }

    public final List<j> C() {
        List<Record> c2 = this.f42955c.f42969b.c();
        ArrayList arrayList = new ArrayList();
        for (Record record : c2) {
            arrayList.add(record.f42944a);
        }
        return arrayList;
    }

    public final boolean E() {
        com.bytedance.scene.d.j.a();
        if (!k.a(this.f42913m)) {
            return false;
        }
        if (this.f42955c.c()) {
            return true;
        }
        if (!this.f42955c.f42969b.b()) {
            return false;
        }
        F();
        return true;
    }

    @Override // com.bytedance.scene.y
    public final String a(String str) {
        return this.f42955c.a(str);
    }

    @Override // com.bytedance.scene.y
    public final void b(String str) {
        this.f42955c.b(str);
    }

    /* access modifiers changed from: package-private */
    public final void a(com.bytedance.scene.group.d dVar) {
        this.f42962j.a(dVar.getClass(), dVar);
    }

    private void a(w wVar) {
        if (this.q.value >= w.VIEW_CREATED.value) {
            this.f42955c.a(wVar);
            return;
        }
        throw new IllegalArgumentException("dispatchCurrentChildState can only call when state is VIEW_CREATED, ACTIVITY_CREATED, STARTED, RESUMED");
    }

    public final void b(c cVar) {
        com.bytedance.scene.d.j.a();
        int size = this.f42963k.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f42963k.get(i2).f42770a == cVar) {
                com.bytedance.scene.d.e<c, Boolean> eVar = this.f42963k.get(i2);
                if (eVar != null) {
                    this.f42963k.remove(eVar);
                    return;
                }
                return;
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (!bundle.containsKey("bd-scene-navigation:support_restore")) {
            bundle.putBoolean("bd-scene-navigation:support_restore", this.f42961i);
            if (this.f42961i) {
                this.f42955c.a(bundle);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("outState already contains key bd-scene-navigation:support_restore");
    }

    public final void b(j jVar) {
        com.bytedance.scene.d.j.a();
        if (k.a(this.f42913m)) {
            if (this.f42955c.b() == jVar) {
                D();
            }
            f fVar = this.f42955c;
            fVar.a(new f.g(fVar, jVar, (byte) 0));
        }
    }

    @Override // com.bytedance.scene.j
    public final void c(Bundle bundle) {
        boolean z;
        boolean z2;
        super.c(bundle);
        f fVar = this.f42955c;
        if (fVar.f42971d.size() != 0 && fVar.e()) {
            if (System.currentTimeMillis() - fVar.f42972e > 800) {
                z = true;
            } else {
                z = false;
            }
            ArrayList arrayList = new ArrayList(fVar.f42971d);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                f.b bVar = (f.b) arrayList.get(i2);
                if (i2 < arrayList.size() - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                fVar.f42977k = z2 | z;
                String a2 = fVar.a("NavigationManager executePendingOperation");
                bVar.a(f.f42967j);
                fVar.b(a2);
                fVar.f42977k = false;
            }
            fVar.f42971d.removeAll(arrayList);
            if (fVar.f42971d.size() <= 0) {
                fVar.f42972e = -1;
                return;
            }
            throw new IllegalStateException("why mPendingActionList still have item?");
        }
    }

    @Override // com.bytedance.scene.j
    public final void e(Bundle bundle) {
        super.e(bundle);
        this.f42955c = new f(this);
        if (this.r != null) {
            Bundle bundle2 = this.r;
            String string = bundle2.getString("extra_rootScene");
            if (string != null) {
                g gVar = new g(string, bundle2.getBundle("extra_rootScene_arguments"));
                gVar.f43011c = bundle2.getBoolean("extra_drawWindowBackground");
                gVar.f43012d = bundle2.getBoolean("extra_fixSceneBackground_enabled");
                gVar.f43013e = bundle2.getInt("extra_sceneBackground");
                this.f42954b = gVar;
                if (bundle != null && !bundle.getBoolean("bd-scene-navigation:support_restore", this.f42961i)) {
                    this.f42961i = false;
                    return;
                }
                return;
            }
            throw new IllegalStateException("root scene class name cant be null");
        }
        throw new IllegalArgumentException("NavigationScene need NavigationSceneOptions bundle");
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        j a2;
        j a3;
        super.a(bundle);
        if (bundle == null || !this.f42961i) {
            String str = this.f42954b.f43009a;
            Bundle bundle2 = this.f42954b.f43010b;
            if (this.f42953a == null || (a2 = this.f42953a.instantiateScene(t().getClassLoader(), str, bundle2)) == null) {
                a2 = g.a(t(), str, bundle2);
            } else if (a2.o != null) {
                throw new IllegalArgumentException("SceneComponentFactory instantiateScene return Scene already has a parent");
            }
            this.f42955c.a(a2, new f.a().b());
        } else {
            f fVar = this.f42955c;
            Activity t = t();
            l lVar = this.f42953a;
            i iVar = fVar.f42969b;
            iVar.f43014a = new ArrayList(bundle.getParcelableArrayList("bd-scene-nav:record_stack"));
            for (int i2 = 0; i2 < iVar.f43014a.size(); i2++) {
                Record record = iVar.f43014a.get(i2);
                if (i2 != 0 || lVar == null || (a3 = lVar.instantiateScene(t.getClassLoader(), record.f42951h, null)) == null) {
                    a3 = g.a(t, record.f42951h, null);
                } else if (a3.o != null) {
                    throw new IllegalArgumentException("SceneComponentFactory instantiateScene return Scene already has a parent");
                }
                record.f42944a = a3;
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("bd-scene-nav:navigation_scene_manager");
            List<Record> c2 = fVar.f42969b.c();
            for (int i3 = 0; i3 <= c2.size() - 1; i3++) {
                f.a(fVar.f42968a, c2.get(i3).f42944a, w.ACTIVITY_CREATED, (Bundle) parcelableArrayList.get(i3), false, null);
            }
        }
        d a4 = e.a(this);
        if (a4 != null) {
            a4.a(this, new h() {
                /* class com.bytedance.scene.navigation.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(26346);
                }

                @Override // com.bytedance.scene.navigation.h
                public final boolean a() {
                    return d.this.E();
                }
            });
        }
    }

    public final void a(c cVar) {
        com.bytedance.scene.d.j.a();
        this.f42963k.add(com.bytedance.scene.d.e.a(cVar, false));
    }

    @Override // com.bytedance.scene.j
    public final void a(j jVar) {
        super.a(jVar);
        if (jVar == null) {
            return;
        }
        if (!(jVar instanceof r)) {
            throw new h("unknown parent Scene type " + jVar.getClass());
        } else if (!((r) jVar).ck_()) {
            this.f42961i = false;
        }
    }

    public final void a(j jVar, com.bytedance.scene.c.f fVar) {
        b(jVar, fVar);
    }

    public final void a(m mVar, c cVar) {
        com.bytedance.scene.d.j.a();
        if (mVar.getLifecycle().a() != i.b.DESTROYED) {
            this.f42960h.add(cVar);
            mVar.getLifecycle().a(new NavigationScene$1(this, mVar, cVar));
        }
    }

    @Override // com.bytedance.scene.j
    public final void e(j jVar, boolean z) {
        if (jVar != this) {
            for (com.bytedance.scene.d.e eVar : new ArrayList(this.f42963k)) {
                if (!z) {
                    eVar.f42771b.booleanValue();
                }
            }
        }
        super.e(jVar, z);
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.i(11692);
        b bVar = new b(s());
        if (Build.VERSION.SDK_INT >= 21) {
            bVar.setOnApplyWindowInsetsListener(new com.bytedance.scene.d.d());
        }
        bVar.setId(R.id.cu1);
        this.f42956d = new FrameLayout(s());
        if (Build.VERSION.SDK_INT >= 21) {
            this.f42956d.setOnApplyWindowInsetsListener(new com.bytedance.scene.d.d());
        }
        bVar.addView(this.f42956d, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.scene.e.a aVar = new com.bytedance.scene.e.a(s());
        if (Build.VERSION.SDK_INT >= 21) {
            aVar.setOnApplyWindowInsetsListener(new com.bytedance.scene.d.d());
        }
        this.f42957e = aVar;
        bVar.addView(aVar, new FrameLayout.LayoutParams(-1, -1));
        if (this.f42954b.f43011c) {
            v.a(bVar, k.a(s()));
        }
        MethodCollector.o(11692);
        return bVar;
    }

    @Override // com.bytedance.scene.j
    public final void d(j jVar, boolean z) {
        if (jVar != this) {
            for (com.bytedance.scene.d.e eVar : new ArrayList(this.f42963k)) {
                if (!z) {
                    eVar.f42771b.booleanValue();
                }
            }
        }
        super.d(jVar, z);
    }

    @Override // com.bytedance.scene.j
    public final void f(j jVar, boolean z) {
        if (jVar != this) {
            for (com.bytedance.scene.d.e eVar : new ArrayList(this.f42963k)) {
                if (z || eVar.f42771b.booleanValue()) {
                    eVar.f42770a.a(jVar);
                }
            }
        }
        super.f(jVar, z);
    }

    @Override // com.bytedance.scene.j
    public final void c(j jVar, boolean z) {
        if (jVar != this) {
            for (com.bytedance.scene.d.e eVar : new ArrayList(this.f42963k)) {
                if (!z) {
                    eVar.f42771b.booleanValue();
                }
            }
        }
        super.c(jVar, z);
    }

    public final void a(m mVar, h hVar) {
        com.bytedance.scene.d.j.a();
        if (mVar.getLifecycle().a() != i.b.DESTROYED) {
            this.f42955c.f42974g.add(com.bytedance.scene.d.e.a(mVar, hVar));
            mVar.getLifecycle().a(new NavigationScene$2(this, mVar, hVar));
        }
    }

    public final void b(j jVar, com.bytedance.scene.c.f fVar) {
        com.bytedance.scene.d.j.a();
        if (k.a(this.f42913m)) {
            if (jVar.o != null) {
                if (jVar.o == this) {
                    throw new IllegalArgumentException("Scene is already pushed");
                }
                throw new IllegalArgumentException("Scene already has a parent, parent " + jVar.o);
            } else if (!this.f42961i || g.a(jVar)) {
                if (fVar == null) {
                    fVar = new f.a().b();
                }
                D();
                this.f42955c.a(jVar, fVar);
            } else {
                throw new IllegalArgumentException("Scene " + jVar.getClass().getName() + " must be a public class or public static class, and have only one parameterless constructor to be properly recreated from instance state.");
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void b(j jVar, boolean z) {
        if (jVar != this) {
            for (com.bytedance.scene.d.e eVar : new ArrayList(this.f42963k)) {
                if (!z) {
                    eVar.f42771b.booleanValue();
                }
            }
        }
        super.b(jVar, z);
    }

    @Override // com.bytedance.scene.j
    public final void c(j jVar, Bundle bundle, boolean z) {
        if (jVar != this) {
            for (com.bytedance.scene.d.e eVar : new ArrayList(this.f42963k)) {
                if (!z) {
                    eVar.f42771b.booleanValue();
                }
            }
        }
        super.c(jVar, bundle, z);
    }

    @Override // com.bytedance.scene.j
    public final void d(j jVar, Bundle bundle, boolean z) {
        if (jVar != this) {
            for (com.bytedance.scene.d.e eVar : new ArrayList(this.f42963k)) {
                if (!z) {
                    eVar.f42771b.booleanValue();
                }
            }
        }
        super.d(jVar, bundle, z);
    }

    @Override // com.bytedance.scene.j
    public final void b(j jVar, Bundle bundle, boolean z) {
        if (jVar != this) {
            for (com.bytedance.scene.d.e eVar : new ArrayList(this.f42963k)) {
                if (!z) {
                    eVar.f42771b.booleanValue();
                }
            }
        }
        super.b(jVar, bundle, z);
    }

    @Override // com.bytedance.scene.j
    public final void a(j jVar, Bundle bundle, boolean z) {
        if (jVar != this) {
            for (com.bytedance.scene.d.e eVar : new ArrayList(this.f42963k)) {
                if (!z) {
                    eVar.f42771b.booleanValue();
                }
            }
        }
        super.a(jVar, bundle, z);
    }
}
