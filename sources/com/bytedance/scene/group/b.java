package com.bytedance.scene.group;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.a.c;
import com.bytedance.scene.d.e;
import com.bytedance.scene.d.g;
import com.bytedance.scene.d.h;
import com.bytedance.scene.d.k;
import com.bytedance.scene.group.c;
import com.bytedance.scene.j;
import com.bytedance.scene.l;
import com.bytedance.scene.r;
import com.bytedance.scene.w;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public abstract class b extends j implements r {

    /* renamed from: d  reason: collision with root package name */
    private static final c f42817d = new c() {
        /* class com.bytedance.scene.group.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(26287);
        }

        @Override // com.bytedance.scene.a.c
        public final com.bytedance.scene.a.b a() {
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final c f42818a = new c(this);

    /* renamed from: b  reason: collision with root package name */
    private final List<e<com.bytedance.scene.c.c, Boolean>> f42819b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f42820c = true;

    public void D() {
    }

    /* renamed from: b */
    public abstract ViewGroup a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Override // com.bytedance.scene.r
    public final void cj_() {
        this.f42820c = false;
    }

    @Override // com.bytedance.scene.r
    public final boolean ck_() {
        return this.f42820c;
    }

    @Override // com.bytedance.scene.j
    public final void k() {
        super.k();
    }

    @Override // com.bytedance.scene.j
    public final void l() {
        super.l();
    }

    @Override // com.bytedance.scene.j
    public final void m() {
        super.m();
    }

    static {
        Covode.recordClassIndex(26286);
    }

    @Override // com.bytedance.scene.j
    public final void cl_() {
        super.cl_();
        b(w.STARTED);
    }

    @Override // com.bytedance.scene.j
    public final void cm_() {
        super.cm_();
        b(w.RESUMED);
    }

    @Override // com.bytedance.scene.j
    public final void cn_() {
        b(w.STARTED);
        super.cn_();
    }

    @Override // com.bytedance.scene.j
    public final void co_() {
        b(w.ACTIVITY_CREATED);
        super.co_();
    }

    @Override // com.bytedance.scene.j
    public final void cp_() {
        a(w.NONE);
        super.cp_();
    }

    public final void ci_() {
        c cVar = this.f42818a;
        if (!cVar.f42828f) {
            cVar.f42828f = true;
            return;
        }
        throw new IllegalStateException("you must call commitTransaction before another beginTransaction");
    }

    public final void C() {
        c cVar = this.f42818a;
        if (cVar.f42828f) {
            if (cVar.f42829g.size() > 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (c.d dVar : cVar.f42829g) {
                    List list = (List) linkedHashMap.get(dVar.f42858i);
                    if (list == null) {
                        list = new ArrayList();
                        linkedHashMap.put(dVar.f42858i, list);
                    }
                    list.add(dVar);
                }
                for (j jVar : linkedHashMap.keySet()) {
                    List list2 = (List) linkedHashMap.get(jVar);
                    w wVar = jVar.q;
                    w wVar2 = ((c.d) list2.get(list2.size() - 1)).f42859j;
                    boolean z = ((c.d) list2.get(list2.size() - 1)).f42860k;
                    boolean z2 = ((c.d) list2.get(list2.size() - 1)).f42861l;
                    boolean z3 = ((c.d) list2.get(list2.size() - 1)).f42862m;
                    if (wVar != wVar2 || z || z2 || z3) {
                        if (wVar == w.NONE) {
                            c.a a2 = c.a(list2);
                            if (a2 == null) {
                                throw new IllegalStateException("you must add Scene first");
                            } else if (cVar.a(a2.f42840b) == null) {
                                new c.g(jVar, a2.f42839a, a2.f42840b, wVar2, z, z2, z3).a(c.f42824e);
                            } else {
                                throw new IllegalStateException("already have a Scene with tag " + a2.f42840b);
                            }
                        } else {
                            new c.g(jVar, -1, null, wVar2, z, z2, z3).a(c.f42824e);
                        }
                    }
                }
                cVar.f42829g.clear();
            }
            cVar.f42828f = false;
            return;
        }
        throw new IllegalStateException("you must call beginTransaction before commitTransaction");
    }

    private void E() {
        j jVar;
        ArrayList arrayList = new ArrayList();
        a(arrayList, (ViewGroup) p());
        if (arrayList.size() != 0) {
            if (!this.f42820c) {
                SparseArray sparseArray = new SparseArray();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    e eVar = (e) arrayList.get(i2);
                    ViewGroup viewGroup = (ViewGroup) eVar.getParent();
                    int id = viewGroup.getId();
                    if (id != -1) {
                        if (sparseArray.get(id) == null) {
                            sparseArray.put(id, viewGroup);
                        } else if (sparseArray.get(id) != viewGroup) {
                            throw new IllegalArgumentException("ScenePlaceHolderView' parent ViewGroup should have unique id, the duplicate id is " + k.a(s(), id));
                        }
                        ViewGroup.LayoutParams layoutParams = eVar.getLayoutParams();
                        String sceneName = eVar.getSceneName();
                        String sceneTag = eVar.getSceneTag();
                        Bundle arguments = eVar.getArguments();
                        l sceneComponentFactory = eVar.getSceneComponentFactory();
                        if (sceneComponentFactory == null || (jVar = sceneComponentFactory.instantiateScene(s().getClassLoader(), sceneName, arguments)) == null) {
                            jVar = g.a(s(), sceneName, arguments);
                        }
                        int indexOfChild = viewGroup.indexOfChild(eVar);
                        viewGroup.removeView(eVar);
                        if (eVar.getVisibility() == 0) {
                            a(id, jVar, sceneTag);
                        } else if (eVar.getVisibility() == 8) {
                            ci_();
                            a(id, jVar, sceneTag);
                            d(jVar);
                            C();
                        } else {
                            throw new IllegalStateException("ScenePlaceHolderView's visibility can't be View.INVISIBLE, use View.VISIBLE or View.GONE instead");
                        }
                        View p = jVar.p();
                        if (eVar.getId() != -1) {
                            if (p.getId() == -1) {
                                p.setId(eVar.getId());
                            } else if (eVar.getId() != p.getId()) {
                                throw new IllegalStateException(a.a("ScenePlaceHolderView's id %s is different from Scene root view's id %s", new Object[]{k.a(s(), eVar.getId()), k.a(s(), p.getId())}));
                            }
                        }
                        viewGroup.removeView(p);
                        viewGroup.addView(p, indexOfChild, layoutParams);
                    } else {
                        throw new IllegalArgumentException("ScenePlaceHolderView parent id can't be View.NO_ID");
                    }
                }
                return;
            }
            throw new IllegalStateException("ScenePlaceHolderView can only be used when support restore is disabled");
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Activity activity) {
        super.a(activity);
    }

    @Override // com.bytedance.scene.j
    public final void d(Bundle bundle) {
        super.d(bundle);
    }

    private void a(w wVar) {
        this.f42818a.a(wVar);
    }

    private void b(w wVar) {
        this.f42818a.b(wVar);
    }

    @Override // com.bytedance.scene.j
    public final void c(Bundle bundle) {
        super.c(bundle);
        a(w.ACTIVITY_CREATED);
        D();
    }

    public final boolean f(j jVar) {
        if (this.f42818a.d(jVar) != null) {
            return true;
        }
        return false;
    }

    public final <T extends j> T a(String str) {
        GroupRecord a2;
        com.bytedance.scene.d.j.a();
        if (str == null || (a2 = this.f42818a.a(str)) == null) {
            return null;
        }
        return (T) a2.f42807b;
    }

    public final String b(j jVar) {
        GroupRecord d2;
        com.bytedance.scene.d.j.a();
        if (jVar == null || (d2 = this.f42818a.d(jVar)) == null) {
            return null;
        }
        return d2.f42808c;
    }

    public final boolean g(j jVar) {
        GroupRecord d2 = this.f42818a.d(jVar);
        if (d2 != null && !d2.f42809d) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.scene.j
    public final void b(Bundle bundle) {
        super.b(bundle);
    }

    public final void c(j jVar) {
        com.bytedance.scene.a.c cVar = f42817d;
        com.bytedance.scene.d.j.a();
        c cVar2 = this.f42818a;
        cVar2.a(jVar);
        if (cVar2.f42828f || cVar2.f42827c.a(jVar) != null) {
            c.e eVar = new c.e(cVar2, jVar, cVar, (byte) 0);
            if (cVar2.f42828f) {
                cVar2.f42829g.add(eVar);
            } else {
                eVar.a(c.f42824e);
            }
        } else {
            throw new IllegalStateException("Target scene is not find");
        }
    }

    public final void d(j jVar) {
        com.bytedance.scene.a.c cVar = f42817d;
        com.bytedance.scene.d.j.a();
        c cVar2 = this.f42818a;
        cVar2.a(jVar);
        if (cVar2.f42828f || cVar2.f42827c.a(jVar) != null) {
            c.b bVar = new c.b(cVar2, jVar, cVar, (byte) 0);
            if (cVar2.f42828f) {
                cVar2.f42829g.add(bVar);
            } else {
                bVar.a(c.f42824e);
            }
        } else {
            throw new IllegalStateException("Target scene is not find");
        }
    }

    public final void e(j jVar) {
        com.bytedance.scene.a.c cVar = f42817d;
        com.bytedance.scene.d.j.a();
        c cVar2 = this.f42818a;
        cVar2.a(jVar);
        if (cVar2.f42828f || cVar2.f42827c.a(jVar) != null) {
            c.f fVar = new c.f(cVar2, jVar, cVar, (byte) 0);
            if (cVar2.f42828f) {
                cVar2.f42829g.add(fVar);
            } else {
                fVar.a(c.f42824e);
            }
        } else {
            throw new IllegalStateException("Target scene is not find");
        }
    }

    @Override // com.bytedance.scene.j
    public void f(Bundle bundle) {
        super.f(bundle);
        if (!bundle.containsKey("bd-scene-group:support_restore")) {
            bundle.putBoolean("bd-scene-group:support_restore", this.f42820c);
            if (this.f42820c) {
                this.f42818a.a(bundle);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("outState already contains key bd-scene-group:support_restore");
    }

    /* access modifiers changed from: package-private */
    public final ViewGroup d(int i2) {
        ViewGroup viewGroup = (ViewGroup) this.n.findViewById(i2);
        if (viewGroup != null) {
            ViewGroup viewGroup2 = viewGroup;
            while (viewGroup2 != null && viewGroup2 != this.n) {
                j jVar = (j) viewGroup2.getTag(R.id.a1f);
                if (jVar == null) {
                    viewGroup2 = (ViewGroup) viewGroup2.getParent();
                } else {
                    throw new IllegalArgumentException(a.a("cant add Scene to child Scene %s view hierarchy ", new Object[]{jVar.toString()}));
                }
            }
            return viewGroup;
        }
        try {
            throw new IllegalArgumentException(" " + t().getResources().getResourceName(i2) + " view not found");
        } catch (Resources.NotFoundException unused) {
            throw new IllegalArgumentException(" " + i2 + " view not found");
        }
    }

    @Override // com.bytedance.scene.j
    public void e(Bundle bundle) {
        super.e(bundle);
        if (bundle != null) {
            if (!bundle.getBoolean("bd-scene-group:support_restore", this.f42820c)) {
                this.f42820c = false;
            }
            if (this.f42820c) {
                c cVar = this.f42818a;
                Activity t = t();
                a aVar = cVar.f42827c;
                if (aVar.f42814a == null || aVar.f42814a.size() <= 0) {
                    aVar.f42814a = new ArrayList(bundle.getParcelableArrayList("bd-scene-nav:group_stack"));
                    for (GroupRecord groupRecord : aVar.f42814a) {
                        groupRecord.f42807b = g.a(t, groupRecord.f42811f, null);
                        aVar.f42815b.put(groupRecord.f42807b, groupRecord);
                        aVar.f42816c.put(groupRecord.f42808c, groupRecord);
                    }
                    List unmodifiableList = Collections.unmodifiableList(cVar.f42827c.f42814a);
                    if (unmodifiableList.size() != 0) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("bd-scene-nav:group_scene_manager");
                        for (int i2 = 0; i2 <= unmodifiableList.size() - 1; i2++) {
                            GroupRecord groupRecord2 = (GroupRecord) unmodifiableList.get(i2);
                            j jVar = groupRecord2.f42807b;
                            groupRecord2.f42812g = (Bundle) parcelableArrayList.get(i2);
                            if (cVar.g(jVar)) {
                                cVar.b(jVar);
                                c.a(cVar.f42825a, jVar, cVar.f42825a.q, false, 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00a2: INVOKE  
                                      (wrap: com.bytedance.scene.group.b : 0x0097: IGET  (r2v0 com.bytedance.scene.group.b) = (r6v0 'cVar' com.bytedance.scene.group.c) com.bytedance.scene.group.c.a com.bytedance.scene.group.b)
                                      (r3v1 'jVar' com.bytedance.scene.j)
                                      (wrap: com.bytedance.scene.w : 0x009b: IGET  (r1v5 com.bytedance.scene.w) = 
                                      (wrap: com.bytedance.scene.group.b : 0x0099: IGET  (r0v18 com.bytedance.scene.group.b) = (r6v0 'cVar' com.bytedance.scene.group.c) com.bytedance.scene.group.c.a com.bytedance.scene.group.b)
                                     com.bytedance.scene.j.q com.bytedance.scene.w)
                                      false
                                      (wrap: com.bytedance.scene.group.c$4 : 0x009f: CONSTRUCTOR  (r0v19 com.bytedance.scene.group.c$4) = (r6v0 'cVar' com.bytedance.scene.group.c), (r3v1 'jVar' com.bytedance.scene.j) call: com.bytedance.scene.group.c.4.<init>(com.bytedance.scene.group.c, com.bytedance.scene.j):void type: CONSTRUCTOR)
                                     type: STATIC call: com.bytedance.scene.group.c.a(com.bytedance.scene.group.b, com.bytedance.scene.j, com.bytedance.scene.w, boolean, java.lang.Runnable):void in method: com.bytedance.scene.group.b.e(android.os.Bundle):void, file: classes7.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:210)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009f: CONSTRUCTOR  (r0v19 com.bytedance.scene.group.c$4) = (r6v0 'cVar' com.bytedance.scene.group.c), (r3v1 'jVar' com.bytedance.scene.j) call: com.bytedance.scene.group.c.4.<init>(com.bytedance.scene.group.c, com.bytedance.scene.j):void type: CONSTRUCTOR in method: com.bytedance.scene.group.b.e(android.os.Bundle):void, file: classes7.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                    	... 52 more
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.scene.group.c, state: GENERATED_AND_UNLOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 58 more
                                    */
                                /*
                                // Method dump skipped, instructions count: 185
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.group.b.e(android.os.Bundle):void");
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
                                    this.f42820c = false;
                                }
                            }

                            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<com.bytedance.scene.group.e> */
                            /* JADX WARN: Multi-variable type inference failed */
                            private static void a(List<e> list, ViewGroup viewGroup) {
                                int childCount = viewGroup.getChildCount();
                                if (childCount != 0) {
                                    for (int i2 = 0; i2 < childCount; i2++) {
                                        View childAt = viewGroup.getChildAt(i2);
                                        if (childAt instanceof e) {
                                            list.add(childAt);
                                        } else if (childAt instanceof ViewGroup) {
                                            a(list, (ViewGroup) childAt);
                                        }
                                    }
                                }
                            }

                            @Override // com.bytedance.scene.j
                            public final void e(j jVar, boolean z) {
                                if (jVar != this) {
                                    for (e eVar : new ArrayList(this.f42819b)) {
                                        if (!z) {
                                            eVar.f42771b.booleanValue();
                                        }
                                    }
                                }
                                super.e(jVar, z);
                            }

                            @Override // com.bytedance.scene.j
                            public final void f(j jVar, boolean z) {
                                if (jVar != this) {
                                    for (e eVar : new ArrayList(this.f42819b)) {
                                        if (z || eVar.f42771b.booleanValue()) {
                                            eVar.f42770a.a(jVar);
                                        }
                                    }
                                }
                                super.f(jVar, z);
                            }

                            @Override // com.bytedance.scene.j
                            public final void b(j jVar, boolean z) {
                                if (jVar != this) {
                                    for (e eVar : new ArrayList(this.f42819b)) {
                                        if (!z) {
                                            eVar.f42771b.booleanValue();
                                        }
                                    }
                                }
                                super.b(jVar, z);
                            }

                            @Override // com.bytedance.scene.j
                            public final void c(j jVar, boolean z) {
                                if (jVar != this) {
                                    for (e eVar : new ArrayList(this.f42819b)) {
                                        if (!z) {
                                            eVar.f42771b.booleanValue();
                                        }
                                    }
                                }
                                super.c(jVar, z);
                            }

                            @Override // com.bytedance.scene.j
                            public final void a(Bundle bundle, ViewGroup viewGroup) {
                                super.a(bundle, viewGroup);
                                if (this.n instanceof ViewGroup) {
                                    this.f42818a.f42826b = (ViewGroup) this.n;
                                    a(w.VIEW_CREATED);
                                    E();
                                    return;
                                }
                                throw new IllegalArgumentException("GroupScene onCreateView view must be ViewGroup");
                            }

                            @Override // com.bytedance.scene.j
                            public final void d(j jVar, boolean z) {
                                if (jVar != this) {
                                    for (e eVar : new ArrayList(this.f42819b)) {
                                        if (!z) {
                                            eVar.f42771b.booleanValue();
                                        }
                                    }
                                }
                                super.d(jVar, z);
                            }

                            @Override // com.bytedance.scene.j
                            public final void a(j jVar, boolean z) {
                                if (jVar != this) {
                                    for (e eVar : new ArrayList(this.f42819b)) {
                                        if (!z) {
                                            eVar.f42771b.booleanValue();
                                        }
                                    }
                                }
                                super.a(jVar, z);
                            }

                            public final void b(int i2, j jVar, String str) {
                                a(i2, jVar, str, new com.bytedance.scene.a.c(0, jVar) {
                                    /* class com.bytedance.scene.group.b.AnonymousClass2 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ int f42821a = 0;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ j f42822b;

                                    static {
                                        Covode.recordClassIndex(26288);
                                    }

                                    @Override // com.bytedance.scene.a.c
                                    public final com.bytedance.scene.a.b a() {
                                        if (this.f42821a == 0) {
                                            return null;
                                        }
                                        return com.bytedance.scene.a.b.a(this.f42822b.t(), this.f42821a);
                                    }

                                    {
                                        this.f42822b = r3;
                                    }
                                });
                            }

                            public final void a(int i2, j jVar, String str) {
                                a(i2, jVar, str, f42817d);
                            }

                            @Override // com.bytedance.scene.j
                            public final void b(j jVar, Bundle bundle, boolean z) {
                                if (jVar != this) {
                                    for (e eVar : new ArrayList(this.f42819b)) {
                                        if (!z) {
                                            eVar.f42771b.booleanValue();
                                        }
                                    }
                                }
                                super.b(jVar, bundle, z);
                            }

                            @Override // com.bytedance.scene.j
                            public final void c(j jVar, Bundle bundle, boolean z) {
                                if (jVar != this) {
                                    for (e eVar : new ArrayList(this.f42819b)) {
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
                                    for (e eVar : new ArrayList(this.f42819b)) {
                                        if (!z) {
                                            eVar.f42771b.booleanValue();
                                        }
                                    }
                                }
                                super.d(jVar, bundle, z);
                            }

                            @Override // com.bytedance.scene.j
                            public final void a(j jVar, Bundle bundle, boolean z) {
                                if (jVar != this) {
                                    for (e eVar : new ArrayList(this.f42819b)) {
                                        if (!z) {
                                            eVar.f42771b.booleanValue();
                                        }
                                    }
                                }
                                super.a(jVar, bundle, z);
                            }

                            private void a(int i2, j jVar, String str, com.bytedance.scene.a.c cVar) {
                                String str2;
                                com.bytedance.scene.d.j.a();
                                if (TextUtils.isEmpty(str)) {
                                    throw new IllegalArgumentException("tag can't be empty");
                                } else if (jVar != this) {
                                    if (f(jVar)) {
                                        int e2 = this.f42818a.e(jVar);
                                        if (e2 == i2) {
                                            String f2 = this.f42818a.f(jVar);
                                            if (!f2.equals(str)) {
                                                throw new IllegalArgumentException("Scene is already added, tag ".concat(String.valueOf(f2)));
                                            }
                                        } else {
                                            try {
                                                str2 = t().getResources().getResourceName(e2);
                                            } catch (Resources.NotFoundException unused) {
                                                str2 = String.valueOf(e2);
                                            }
                                            throw new IllegalArgumentException("Scene is already added to another container, viewId ".concat(String.valueOf(str2)));
                                        }
                                    } else {
                                        j a2 = a(str);
                                        if (a2 != null) {
                                            throw new IllegalArgumentException("already have a Scene " + a2.toString() + " with tag " + str);
                                        }
                                    }
                                    if (jVar.o != null && jVar.o != this) {
                                        throw new IllegalArgumentException("Scene already has a parent, parent " + jVar.o);
                                    } else if (!this.f42820c || g.a(jVar)) {
                                        this.f42818a.a(i2, jVar, str, cVar);
                                    } else {
                                        throw new IllegalArgumentException("Scene " + jVar.getClass().getName() + " must be a public class or public static class, and have only one parameterless constructor to be properly recreated from instance state.");
                                    }
                                } else {
                                    throw new IllegalArgumentException("GroupScene can't be added to itself");
                                }
                            }
                        }
