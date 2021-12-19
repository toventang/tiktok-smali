package com.bytedance.scene.navigation;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.scene.d.k;
import com.bytedance.scene.j;
import com.bytedance.scene.w;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class f {

    /* renamed from: j  reason: collision with root package name */
    public static final Runnable f42967j = new Runnable() {
        /* class com.bytedance.scene.navigation.f.AnonymousClass2 */

        static {
            Covode.recordClassIndex(26351);
        }

        public final void run() {
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public d f42968a;

    /* renamed from: b  reason: collision with root package name */
    public final i f42969b = new i();

    /* renamed from: c  reason: collision with root package name */
    public c f42970c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<b> f42971d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    public long f42972e = -1;

    /* renamed from: f  reason: collision with root package name */
    public final a f42973f = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    final List<com.bytedance.scene.d.e<m, h>> f42974g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public Set<String> f42975h = new HashSet();

    /* renamed from: i  reason: collision with root package name */
    public int f42976i = 0;

    /* renamed from: k  reason: collision with root package name */
    public boolean f42977k = false;

    /* renamed from: l  reason: collision with root package name */
    private final a f42978l = new a(Looper.getMainLooper());

    /* renamed from: m  reason: collision with root package name */
    private int f42979m = 0;

    /* access modifiers changed from: package-private */
    public interface b {
        static {
            Covode.recordClassIndex(26354);
        }

        void a(Runnable runnable);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<com.bytedance.scene.d.c> f42983a;

        static {
            Covode.recordClassIndex(26353);
        }

        private a() {
            this.f42983a = new ArrayList();
        }

        public final void a() {
            if (this.f42983a.size() != 0) {
                ArrayList arrayList = new ArrayList(this.f42983a);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.remove();
                    ((com.bytedance.scene.d.b) it.next()).a();
                }
                this.f42983a.removeAll(arrayList);
            }
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(com.bytedance.scene.d.c cVar) {
            this.f42983a.add(cVar);
        }

        public final void b(com.bytedance.scene.d.c cVar) {
            this.f42983a.remove(cVar);
        }
    }

    static {
        Covode.recordClassIndex(26349);
    }

    public final void a() {
        a(new d(this, null, (byte) 0));
    }

    public final j b() {
        Record a2 = this.f42969b.a();
        if (a2 != null) {
            return a2.f42944a;
        }
        return null;
    }

    public final void d() {
        this.f42973f.a();
        com.bytedance.scene.a.b.a.a();
    }

    public final boolean e() {
        if (this.f42968a.q.value >= w.ACTIVITY_CREATED.value) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        ArrayList arrayList = new ArrayList(this.f42974g);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            com.bytedance.scene.d.e eVar = (com.bytedance.scene.d.e) arrayList.get(size);
            if (eVar.f42770a.getLifecycle().a().isAtLeast(i.b.RESUMED) && eVar.f42771b.a()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.scene.navigation.f$3  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f42982a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 26352(0x66f0, float:3.6927E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.scene.w[] r0 = com.bytedance.scene.w.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.scene.navigation.f.AnonymousClass3.f42982a = r2
                com.bytedance.scene.w r0 = com.bytedance.scene.w.NONE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.scene.navigation.f.AnonymousClass3.f42982a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.scene.w r0 = com.bytedance.scene.w.VIEW_CREATED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.scene.navigation.f.AnonymousClass3.f42982a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.scene.w r0 = com.bytedance.scene.w.ACTIVITY_CREATED     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.scene.navigation.f.AnonymousClass3.f42982a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.scene.w r0 = com.bytedance.scene.w.STARTED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.scene.navigation.f.AnonymousClass3.f42982a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.scene.w r0 = com.bytedance.scene.w.RESUMED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.navigation.f.AnonymousClass3.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements b {

        /* renamed from: b  reason: collision with root package name */
        private final com.bytedance.scene.a.d f42992b;

        static {
            Covode.recordClassIndex(26357);
        }

        @Override // com.bytedance.scene.navigation.f.b
        public final void a(Runnable runnable) {
            new c(f.this, this.f42992b, 1, (byte) 0).a(runnable);
        }

        private d(com.bytedance.scene.a.d dVar) {
            this.f42992b = dVar;
        }

        /* synthetic */ d(f fVar, com.bytedance.scene.a.d dVar, byte b2) {
            this(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        if (!this.f42975h.remove(str)) {
            throw new com.bytedance.scene.d.h("suppressTag not found");
        } else if (this.f42975h.size() == 0) {
            this.f42979m = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final String a(String str) {
        StringBuilder append = new StringBuilder().append(str).append("_");
        int i2 = this.f42979m;
        this.f42979m = i2 + 1;
        String sb = append.append(i2).toString();
        if (this.f42975h.add(sb)) {
            return sb;
        }
        throw new com.bytedance.scene.d.h("suppressTag already exists");
    }

    public class e implements b {

        /* renamed from: b  reason: collision with root package name */
        private final com.bytedance.scene.c.e f42994b;

        static {
            Covode.recordClassIndex(26358);
        }

        @Override // com.bytedance.scene.navigation.f.b
        public final void a(Runnable runnable) {
            List<Record> c2 = f.this.f42969b.c();
            com.bytedance.scene.d.f<j> fVar = this.f42994b.f42745b;
            if (fVar != null) {
                int i2 = 0;
                for (int size = c2.size() - 1; size >= 0; size--) {
                    c2.get(size);
                    if (fVar.a()) {
                        break;
                    }
                    i2++;
                }
                new c(f.this, this.f42994b.f42744a, i2, (byte) 0).a(runnable);
                return;
            }
            new d(f.this, this.f42994b.f42744a, (byte) 0).a(runnable);
        }

        private e(com.bytedance.scene.c.e eVar) {
            this.f42994b = eVar;
        }

        public /* synthetic */ e(f fVar, com.bytedance.scene.c.e eVar, byte b2) {
            this(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    public class g implements b {

        /* renamed from: b  reason: collision with root package name */
        private final j f43003b;

        static {
            Covode.recordClassIndex(26361);
        }

        @Override // com.bytedance.scene.navigation.f.b
        public final void a(Runnable runnable) {
            if (f.this.b() == this.f43003b) {
                new d(f.this, null, (byte) 0).a(runnable);
                return;
            }
            List<Record> c2 = f.this.f42969b.c();
            int size = c2.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Record record = c2.get(size);
                if (record.f42944a == this.f43003b) {
                    if (size == c2.size() - 2) {
                        f.this.d();
                    }
                    w wVar = this.f43003b.q;
                    f.a(f.this.f42968a, this.f43003b, w.NONE, null, false, null);
                    f.this.f42969b.a(record);
                    if (size > 0) {
                        f.a(f.this.f42968a, c2.get(size - 1).f42944a, wVar, null, false, null);
                    }
                } else {
                    size--;
                }
            }
            runnable.run();
        }

        private g(j jVar) {
            this.f43003b = jVar;
        }

        /* synthetic */ g(f fVar, j jVar, byte b2) {
            this(jVar);
        }
    }

    class h implements b {

        /* renamed from: b  reason: collision with root package name */
        private final w f43005b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f43006c;

        static {
            Covode.recordClassIndex(26362);
        }

        @Override // com.bytedance.scene.navigation.f.b
        public final void a(Runnable runnable) {
            if (f.this.f42969b.a() == null) {
                runnable.run();
                return;
            }
            List<Record> c2 = f.this.f42969b.c();
            if (this.f43006c) {
                ArrayList arrayList = new ArrayList(c2);
                Collections.reverse(arrayList);
                c2 = arrayList;
            }
            for (int i2 = 0; i2 < c2.size(); i2++) {
                f.a(f.this.f42968a, c2.get(i2).f42944a, this.f43005b, null, true, null);
            }
            runnable.run();
        }

        /* synthetic */ h(f fVar, w wVar) {
            this(wVar, true);
        }

        private h(w wVar, boolean z) {
            this.f43005b = wVar;
            this.f43006c = true;
        }
    }

    /* access modifiers changed from: package-private */
    public class i implements b {

        /* renamed from: b  reason: collision with root package name */
        private final w f43008b;

        static {
            Covode.recordClassIndex(26363);
        }

        @Override // com.bytedance.scene.navigation.f.b
        public final void a(Runnable runnable) {
            if (f.this.f42969b.a() == null) {
                runnable.run();
                return;
            }
            List<Record> c2 = f.this.f42969b.c();
            w wVar = this.f43008b;
            for (int size = c2.size() - 1; size >= 0; size--) {
                Record record = c2.get(size);
                if (size == c2.size() - 1) {
                    f.a(f.this.f42968a, record.f42944a, wVar, null, true, runnable);
                    if (!record.f42945b) {
                        break;
                    }
                } else {
                    w wVar2 = null;
                    if (wVar == w.RESUMED) {
                        wVar2 = w.STARTED;
                    } else if (wVar == w.STARTED) {
                        wVar2 = w.STARTED;
                    } else if (wVar == w.ACTIVITY_CREATED) {
                        wVar2 = w.ACTIVITY_CREATED;
                    } else if (wVar == w.VIEW_CREATED) {
                        wVar2 = w.VIEW_CREATED;
                    }
                    f.a(f.this.f42968a, record.f42944a, wVar2, null, true, runnable);
                    if (!record.f42945b) {
                        break;
                    }
                }
            }
            runnable.run();
        }

        private i(w wVar) {
            this.f43008b = wVar;
        }

        /* synthetic */ i(f fVar, w wVar, byte b2) {
            this(wVar);
        }
    }

    f(d dVar) {
        this.f42968a = dVar;
        this.f42970c = dVar;
    }

    public final void a(Bundle bundle) {
        bundle.putParcelableArrayList("bd-scene-nav:record_stack", new ArrayList<>(this.f42969b.f43014a));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Record record : this.f42969b.c()) {
            Bundle bundle2 = new Bundle();
            record.f42944a.d(bundle2);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("bd-scene-nav:navigation_scene_manager", arrayList);
    }

    public final void a(final b bVar) {
        if (!e()) {
            this.f42971d.addLast(bVar);
            this.f42972e = System.currentTimeMillis();
        } else if (this.f42975h.size() > 0 || this.f42976i > 0) {
            AnonymousClass1 r1 = new Runnable() {
                /* class com.bytedance.scene.navigation.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(26350);
                }

                public final void run() {
                    f fVar = f.this;
                    fVar.f42976i--;
                    if (f.this.f42975h.size() > 0) {
                        throw new com.bytedance.scene.d.h("miss endSuppressStackOperation(), mIsNavigationStateChangeInProgress content ".concat(String.valueOf(TextUtils.join(",", f.this.f42975h))));
                    } else if (f.this.e()) {
                        String a2 = f.this.a("NavigationManager execute operation by Handler.post()");
                        bVar.a(f.f42967j);
                        f.this.b(a2);
                    } else {
                        f.this.f42971d.addLast(bVar);
                        f.this.f42972e = System.currentTimeMillis();
                    }
                }
            };
            this.f42976i++;
            this.f42978l.a(r1);
        } else {
            String a2 = a("NavigationManager execute operation directly");
            bVar.a(f42967j);
            b(a2);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements b {

        /* renamed from: b  reason: collision with root package name */
        private final com.bytedance.scene.a.d f42985b;

        /* renamed from: c  reason: collision with root package name */
        private final int f42986c;

        static {
            Covode.recordClassIndex(26355);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x019a, code lost:
            if (r10 == null) goto L_0x019c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x01ac, code lost:
            if (r10 == null) goto L_0x01ae;
         */
        @Override // com.bytedance.scene.navigation.f.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(final java.lang.Runnable r22) {
            /*
            // Method dump skipped, instructions count: 733
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.navigation.f.c.a(java.lang.Runnable):void");
        }

        private c(com.bytedance.scene.a.d dVar, int i2) {
            this.f42985b = dVar;
            this.f42986c = i2;
        }

        /* synthetic */ c(f fVar, com.bytedance.scene.a.d dVar, int i2, byte b2) {
            this(dVar, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.scene.navigation.f$f  reason: collision with other inner class name */
    public class C1044f implements b {

        /* renamed from: b  reason: collision with root package name */
        private final j f42996b;

        /* renamed from: c  reason: collision with root package name */
        private final com.bytedance.scene.c.f f42997c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f42998d;

        static {
            Covode.recordClassIndex(26359);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:56:0x01cd, code lost:
            if (r14 == null) goto L_0x01cf;
         */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x023c  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0298  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x02a0  */
        @Override // com.bytedance.scene.navigation.f.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(final java.lang.Runnable r23) {
            /*
            // Method dump skipped, instructions count: 757
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.navigation.f.C1044f.a(java.lang.Runnable):void");
        }

        private C1044f(j jVar, com.bytedance.scene.c.f fVar) {
            boolean z;
            this.f42996b = jVar;
            this.f42997c = fVar;
            if (fVar.f42750c || (jVar instanceof j)) {
                z = true;
            } else {
                z = false;
            }
            this.f42998d = z;
        }

        /* synthetic */ C1044f(f fVar, j jVar, com.bytedance.scene.c.f fVar2, byte b2) {
            this(jVar, fVar2);
        }
    }

    public final void a(h hVar) {
        com.bytedance.scene.d.e<m, h> eVar;
        int size = this.f42974g.size() - 1;
        while (true) {
            if (size < 0) {
                eVar = null;
                break;
            }
            eVar = this.f42974g.get(size);
            if (eVar.f42771b == hVar) {
                break;
            }
            size--;
        }
        this.f42974g.remove(eVar);
    }

    public final void a(w wVar) {
        String a2 = a("NavigationManager dispatchCurrentChildState");
        new i(this, wVar, (byte) 0).a(f42967j);
        b(a2);
    }

    public static w a(w wVar, w wVar2) {
        if (wVar.value > wVar2.value) {
            return wVar2;
        }
        return wVar;
    }

    public final void a(j jVar, com.bytedance.scene.c.f fVar) {
        Objects.requireNonNull(jVar, "scene can't be null");
        a(new C1044f(this, jVar, fVar, (byte) 0));
    }

    public static void a(d dVar, j jVar, w wVar, Bundle bundle, boolean z, Runnable runnable) {
        Record record;
        MethodCollector.i(11195);
        while (true) {
            w wVar2 = jVar.q;
            if (wVar2 == wVar) {
                if (runnable != null) {
                    runnable.run();
                }
                MethodCollector.o(11195);
                return;
            } else if (wVar2.value < wVar.value) {
                int i2 = AnonymousClass3.f42982a[wVar2.ordinal()];
                if (i2 == 1) {
                    jVar.a(dVar.t());
                    jVar.a(dVar);
                    jVar.b(bundle);
                    FrameLayout frameLayout = dVar.f42956d;
                    jVar.a(bundle, frameLayout);
                    if (!z) {
                        if (jVar.n.getBackground() == null) {
                            Iterator<Record> it = dVar.f42955c.f42969b.f43014a.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    record = null;
                                    break;
                                }
                                record = it.next();
                                if (record.f42944a == jVar) {
                                    break;
                                }
                            }
                            if (!record.f42945b && dVar.f42954b.f43012d) {
                                int i3 = dVar.f42954b.f43013e;
                                if (i3 > 0) {
                                    jVar.n.setBackgroundDrawable(jVar.s().getResources().getDrawable(i3));
                                } else {
                                    jVar.n.setBackgroundDrawable(k.a(jVar.s()));
                                }
                                record.f42949f = true;
                            }
                        }
                        frameLayout.addView(jVar.n);
                    }
                    jVar.n.setVisibility(8);
                } else if (i2 == 2) {
                    jVar.c(bundle);
                } else if (i2 == 3) {
                    jVar.n.setVisibility(0);
                    jVar.cl_();
                } else if (i2 == 4) {
                    jVar.cm_();
                } else {
                    com.bytedance.scene.d.h hVar = new com.bytedance.scene.d.h("unreachable state case " + wVar2.getName());
                    MethodCollector.o(11195);
                    throw hVar;
                }
            } else {
                int i4 = AnonymousClass3.f42982a[wVar2.ordinal()];
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            jVar.co_();
                            if (!z) {
                                jVar.n.setVisibility(8);
                            }
                        } else if (i4 == 5) {
                            jVar.cn_();
                        } else {
                            com.bytedance.scene.d.h hVar2 = new com.bytedance.scene.d.h("unreachable state case " + wVar2.getName());
                            MethodCollector.o(11195);
                            throw hVar2;
                        }
                    } else if (wVar == w.VIEW_CREATED) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("cant switch state ACTIVITY_CREATED to VIEW_CREATED");
                        MethodCollector.o(11195);
                        throw illegalArgumentException;
                    }
                }
                View view = jVar.n;
                jVar.cp_();
                if (!z) {
                    k.a(view);
                }
                jVar.k();
                jVar.l();
                jVar.m();
            }
        }
    }
}
