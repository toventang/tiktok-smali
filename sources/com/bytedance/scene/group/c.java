package com.bytedance.scene.group;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.scene.d.h;
import com.bytedance.scene.d.k;
import com.bytedance.scene.j;
import com.bytedance.scene.w;
import com.bytedance.scene.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap<j, com.bytedance.scene.d.b> f42823d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    static final Runnable f42824e = new Runnable() {
        /* class com.bytedance.scene.group.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(26290);
        }

        public final void run() {
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final b f42825a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f42826b;

    /* renamed from: c  reason: collision with root package name */
    public final a f42827c = new a();

    /* renamed from: f  reason: collision with root package name */
    boolean f42828f = false;

    /* renamed from: g  reason: collision with root package name */
    List<d> f42829g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final Handler f42830h = new Handler(Looper.getMainLooper());

    /* renamed from: i  reason: collision with root package name */
    private final Set<androidx.core.g.e<j, String>> f42831i = new HashSet();

    private List<j> a() {
        return this.f42827c.a();
    }

    private List<GroupRecord> b() {
        return Collections.unmodifiableList(this.f42827c.f42814a);
    }

    static {
        Covode.recordClassIndex(26289);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.scene.group.c$5  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f42838a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 26294(0x66b6, float:3.6846E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.scene.w[] r0 = com.bytedance.scene.w.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.scene.group.c.AnonymousClass5.f42838a = r2
                com.bytedance.scene.w r0 = com.bytedance.scene.w.NONE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.scene.group.c.AnonymousClass5.f42838a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.scene.w r0 = com.bytedance.scene.w.VIEW_CREATED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.scene.group.c.AnonymousClass5.f42838a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.scene.w r0 = com.bytedance.scene.w.ACTIVITY_CREATED     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.scene.group.c.AnonymousClass5.f42838a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.scene.w r0 = com.bytedance.scene.w.STARTED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.scene.group.c.AnonymousClass5.f42838a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.scene.w r0 = com.bytedance.scene.w.RESUMED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.group.c.AnonymousClass5.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public final GroupRecord d(j jVar) {
        return this.f42827c.a(jVar);
    }

    private static y h(j jVar) {
        while (jVar != null) {
            if (jVar instanceof y) {
                return (y) jVar;
            }
            jVar = jVar.o;
            if (jVar == null) {
                return null;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final int e(j jVar) {
        return this.f42827c.a(jVar).f42806a;
    }

    /* access modifiers changed from: package-private */
    public final String f(j jVar) {
        return this.f42827c.a(jVar).f42808c;
    }

    /* access modifiers changed from: package-private */
    public final class e extends AbstractC1043c {

        /* renamed from: a  reason: collision with root package name */
        public final View f42863a;

        /* renamed from: b  reason: collision with root package name */
        public final ViewGroup f42864b;

        /* renamed from: c  reason: collision with root package name */
        public int f42865c;
        private final com.bytedance.scene.a.c o;
        private final boolean p;
        private boolean q;

        static {
            Covode.recordClassIndex(26304);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.scene.group.c.AbstractC1043c
        public final void a(boolean z) {
            super.a(z);
            if (z && this.q) {
                this.f42865c = this.f42863a.getVisibility();
                this.f42863a.setVisibility(0);
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
            r3 = r4.o.a();
         */
        @Override // com.bytedance.scene.group.c.AbstractC1043c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(boolean r5) {
            /*
                r4 = this;
                super.b(r5)
                if (r5 != 0) goto L_0x0006
                return
            L_0x0006:
                boolean r0 = r4.p
                if (r0 != 0) goto L_0x000b
                return
            L_0x000b:
                com.bytedance.scene.a.c r0 = r4.o
                com.bytedance.scene.a.b r3 = r0.a()
                if (r3 != 0) goto L_0x0014
                return
            L_0x0014:
                android.view.ViewGroup r0 = r4.f42864b
                if (r0 == 0) goto L_0x0029
                android.view.View r0 = r4.f42863a
                int r0 = r0.getWidth()
                if (r0 == 0) goto L_0x0028
                android.view.View r0 = r4.f42863a
                int r0 = r0.getHeight()
                if (r0 != 0) goto L_0x0029
            L_0x0028:
                return
            L_0x0029:
                com.bytedance.scene.group.c$e$1 r0 = new com.bytedance.scene.group.c$e$1
                r0.<init>()
                r3.a(r0)
                java.util.HashMap<com.bytedance.scene.j, com.bytedance.scene.d.b> r2 = com.bytedance.scene.group.c.f42823d
                com.bytedance.scene.j r1 = r4.f42858i
                com.bytedance.scene.group.c$e$2 r0 = new com.bytedance.scene.group.c$e$2
                r0.<init>(r3)
                r2.put(r1, r0)
                android.view.ViewGroup r1 = r4.f42864b
                android.view.View r0 = r4.f42863a
                r1.startViewTransition(r0)
                android.view.View r0 = r4.f42863a
                r3.a(r0)
                r0 = 1
                r4.q = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.group.c.e.b(boolean):void");
        }

        private e(j jVar, com.bytedance.scene.a.c cVar) {
            super(jVar, -1, null, w.NONE, false, false, true);
            boolean z;
            this.o = cVar;
            if (jVar.n == null || jVar.n.getParent() == null) {
                z = false;
            } else {
                z = true;
            }
            this.p = z;
            if (z) {
                View view = jVar.n;
                this.f42863a = view;
                this.f42864b = (ViewGroup) view.getParent();
                return;
            }
            this.f42863a = null;
            this.f42864b = null;
        }

        /* synthetic */ e(c cVar, j jVar, com.bytedance.scene.a.c cVar2, byte b2) {
            this(jVar, cVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public final class f extends AbstractC1043c {

        /* renamed from: b  reason: collision with root package name */
        private final com.bytedance.scene.a.c f42871b;

        static {
            Covode.recordClassIndex(26307);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.scene.group.c.AbstractC1043c
        public final void b(boolean z) {
            super.b(z);
            if (this.f42858i.n != null) {
                c.a(this.f42858i, 0);
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
            r3 = r5.f42871b.a();
         */
        @Override // com.bytedance.scene.group.c.AbstractC1043c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(boolean r6) {
            /*
                r5 = this;
                super.a(r6)
                if (r6 != 0) goto L_0x0006
                return
            L_0x0006:
                com.bytedance.scene.j r0 = r5.f42858i
                android.view.View r4 = r0.n
                if (r4 != 0) goto L_0x000d
                return
            L_0x000d:
                com.bytedance.scene.a.c r0 = r5.f42871b
                com.bytedance.scene.a.b r3 = r0.a()
                if (r3 != 0) goto L_0x0016
                return
            L_0x0016:
                com.bytedance.scene.group.c$f$1 r0 = new com.bytedance.scene.group.c$f$1
                r0.<init>()
                r3.a(r0)
                java.util.HashMap<com.bytedance.scene.j, com.bytedance.scene.d.b> r2 = com.bytedance.scene.group.c.f42823d
                com.bytedance.scene.j r1 = r5.f42858i
                com.bytedance.scene.group.c$f$2 r0 = new com.bytedance.scene.group.c$f$2
                r0.<init>(r3)
                r2.put(r1, r0)
                r3.a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.group.c.f.a(boolean):void");
        }

        private f(j jVar, com.bytedance.scene.a.c cVar) {
            super(jVar, -1, null, c.a(w.RESUMED, c.this.f42825a.q), true, false, false);
            this.f42871b = cVar;
        }

        /* synthetic */ f(c cVar, j jVar, com.bytedance.scene.a.c cVar2, byte b2) {
            this(jVar, cVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public final class g extends AbstractC1043c {
        static {
            Covode.recordClassIndex(26310);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.scene.group.c.AbstractC1043c
        public final void a(boolean z) {
            super.a(z);
            if (this.f42858i.n != null && this.f42861l) {
                c.a(this.f42858i, 8);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.scene.group.c.AbstractC1043c
        public final void b(boolean z) {
            super.b(z);
            if (this.f42858i.n != null && this.f42860k) {
                c.a(this.f42858i, 0);
            }
        }

        g(j jVar, int i2, String str, w wVar, boolean z, boolean z2, boolean z3) {
            super(jVar, i2, str, wVar, z, z2, z3);
        }
    }

    static a a(List<d> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            d dVar = list.get(size);
            if (dVar instanceof a) {
                return (a) dVar;
            }
        }
        return null;
    }

    public final boolean g(j jVar) {
        List<GroupRecord> b2 = b();
        for (int i2 = 0; i2 < b2.size(); i2++) {
            if (b2.get(i2).f42807b == jVar) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final class a extends AbstractC1043c {

        /* renamed from: a  reason: collision with root package name */
        final int f42839a;

        /* renamed from: b  reason: collision with root package name */
        final String f42840b;

        /* renamed from: c  reason: collision with root package name */
        final com.bytedance.scene.a.c f42841c;

        static {
            Covode.recordClassIndex(26295);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = r5.f42841c.a();
         */
        @Override // com.bytedance.scene.group.c.AbstractC1043c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(boolean r6) {
            /*
                r5 = this;
                super.a(r6)
                if (r6 != 0) goto L_0x0006
                return
            L_0x0006:
                com.bytedance.scene.a.c r0 = r5.f42841c
                com.bytedance.scene.a.b r4 = r0.a()
                if (r4 != 0) goto L_0x000f
                return
            L_0x000f:
                com.bytedance.scene.j r0 = r5.f42858i
                android.view.View r3 = r0.n
                if (r3 != 0) goto L_0x0016
                return
            L_0x0016:
                com.bytedance.scene.group.c$a$1 r0 = new com.bytedance.scene.group.c$a$1
                r0.<init>()
                r4.a(r0)
                java.util.HashMap<com.bytedance.scene.j, com.bytedance.scene.d.b> r2 = com.bytedance.scene.group.c.f42823d
                com.bytedance.scene.j r1 = r5.f42858i
                com.bytedance.scene.group.c$a$2 r0 = new com.bytedance.scene.group.c$a$2
                r0.<init>(r4)
                r2.put(r1, r0)
                r4.a(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.group.c.a.a(boolean):void");
        }

        private a(int i2, j jVar, String str, com.bytedance.scene.a.c cVar) {
            super(jVar, i2, str, c.a(w.RESUMED, c.this.f42825a.q), true, false, false);
            this.f42839a = i2;
            this.f42840b = str;
            this.f42841c = cVar;
        }

        /* synthetic */ a(c cVar, int i2, j jVar, String str, com.bytedance.scene.a.c cVar2, byte b2) {
            this(i2, jVar, str, cVar2);
        }
    }

    c(b bVar) {
        this.f42825a = bVar;
    }

    /* access modifiers changed from: package-private */
    public final void b(w wVar) {
        List unmodifiableList = Collections.unmodifiableList(this.f42827c.f42814a);
        for (int i2 = 0; i2 <= unmodifiableList.size() - 1; i2++) {
            GroupRecord groupRecord = (GroupRecord) unmodifiableList.get(i2);
            if (!groupRecord.f42809d) {
                final j jVar = groupRecord.f42807b;
                if (g(jVar)) {
                    b(jVar);
                    a(this.f42825a, groupRecord.f42807b, wVar, false, new Runnable() {
                        /* class com.bytedance.scene.group.c.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(26292);
                        }

                        public final void run() {
                            c.this.c(jVar);
                        }
                    });
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final class b extends AbstractC1043c {

        /* renamed from: b  reason: collision with root package name */
        private final com.bytedance.scene.a.c f42847b;

        static {
            Covode.recordClassIndex(26298);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
            r3 = r4.f42847b.a();
         */
        @Override // com.bytedance.scene.group.c.AbstractC1043c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(boolean r5) {
            /*
                r4 = this;
                super.a(r5)
                com.bytedance.scene.j r0 = r4.f42858i
                android.view.View r2 = r0.n
                if (r2 != 0) goto L_0x000a
                return
            L_0x000a:
                com.bytedance.scene.j r1 = r4.f42858i
                r0 = 8
                com.bytedance.scene.group.c.a(r1, r0)
                if (r5 != 0) goto L_0x0014
                return
            L_0x0014:
                com.bytedance.scene.a.c r0 = r4.f42847b
                com.bytedance.scene.a.b r3 = r0.a()
                if (r3 != 0) goto L_0x001d
                return
            L_0x001d:
                int r1 = r2.getVisibility()
                r0 = 0
                r2.setVisibility(r0)
                com.bytedance.scene.group.c$b$1 r0 = new com.bytedance.scene.group.c$b$1
                r0.<init>(r2, r1)
                r3.a(r0)
                java.util.HashMap<com.bytedance.scene.j, com.bytedance.scene.d.b> r2 = com.bytedance.scene.group.c.f42823d
                com.bytedance.scene.j r1 = r4.f42858i
                com.bytedance.scene.group.c$b$2 r0 = new com.bytedance.scene.group.c$b$2
                r0.<init>(r3)
                r2.put(r1, r0)
                com.bytedance.scene.j r0 = r4.f42858i
                android.view.View r0 = r0.n
                r3.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.group.c.b.a(boolean):void");
        }

        private b(j jVar, com.bytedance.scene.a.c cVar) {
            super(jVar, -1, null, c.a(w.ACTIVITY_CREATED, c.this.f42825a.q), false, true, false);
            this.f42847b = cVar;
        }

        /* synthetic */ b(c cVar, j jVar, com.bytedance.scene.a.c cVar2, byte b2) {
            this(jVar, cVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public final GroupRecord a(String str) {
        return this.f42827c.a(str);
    }

    public final void b(j jVar) {
        String str;
        for (androidx.core.g.e<j, String> eVar : this.f42831i) {
            if (eVar.f2397a == jVar) {
                throw new h("Target scene " + jVar.getClass().getCanonicalName() + " is already tracked");
            }
        }
        y h2 = h(this.f42825a.o);
        if (h2 != null) {
            str = h2.a(jVar.toString());
        } else {
            str = null;
        }
        this.f42831i.add(androidx.core.g.e.a(jVar, str));
    }

    public final void c(j jVar) {
        for (androidx.core.g.e<j, String> eVar : this.f42831i) {
            if (eVar.f2397a == jVar) {
                if (eVar.f2398b != null) {
                    h(this.f42825a.o).b(eVar.f2398b);
                }
                this.f42831i.remove(eVar);
                return;
            }
        }
        throw new h("Target scene " + jVar.getClass().getCanonicalName() + " is not tracked");
    }

    /* renamed from: com.bytedance.scene.group.c$c  reason: collision with other inner class name */
    abstract class AbstractC1043c extends d {

        /* renamed from: e  reason: collision with root package name */
        final int f42853e;

        /* renamed from: f  reason: collision with root package name */
        final String f42854f;

        /* renamed from: g  reason: collision with root package name */
        final w f42855g;

        static {
            Covode.recordClassIndex(26301);
        }

        /* access modifiers changed from: protected */
        public void a(boolean z) {
        }

        /* access modifiers changed from: protected */
        public void b(boolean z) {
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.scene.group.c.d
        public final void a(Runnable runnable) {
            com.bytedance.scene.d.b bVar = c.f42823d.get(this.f42858i);
            if (bVar != null) {
                bVar.a();
                if (c.f42823d.get(this.f42858i) != null) {
                    throw new h("CancellationSignal cancel callback should remove target Scene from CancellationSignal map");
                }
            }
            if (!c.this.g(this.f42858i)) {
                if (this.f42858i.q == w.NONE) {
                    k.a((Object) this.f42854f, "tag can't be null");
                    a aVar = c.this.f42827c;
                    int i2 = this.f42853e;
                    j jVar = this.f42858i;
                    String str = this.f42854f;
                    GroupRecord groupRecord = new GroupRecord();
                    groupRecord.f42806a = i2;
                    groupRecord.f42807b = (j) k.a(jVar, "scene can't be null");
                    groupRecord.f42808c = (String) k.a((Object) str, "tag can't be null");
                    groupRecord.f42811f = (String) k.a((Object) jVar.getClass().getName(), "Scene class name is null");
                    aVar.f42814a.add(groupRecord);
                    aVar.f42815b.put(groupRecord.f42807b, groupRecord);
                    aVar.f42816c.put(groupRecord.f42808c, groupRecord);
                } else {
                    throw new h("Scene state is " + this.f42858i.q.name + " but it is not added to record list");
                }
            }
            boolean z = false;
            if (this.f42860k) {
                c.this.f42827c.a(this.f42858i).f42809d = false;
            }
            if (this.f42861l) {
                c.this.f42827c.a(this.f42858i).f42809d = true;
            }
            if (this.f42858i.q != this.f42855g) {
                z = true;
            }
            b(z);
            c.this.b(this.f42858i);
            c.a(c.this.f42825a, this.f42858i, this.f42855g, this.f42862m, new Runnable() {
                /* class com.bytedance.scene.group.c.AbstractC1043c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(26302);
                }

                public final void run() {
                    c.this.c(AbstractC1043c.this.f42858i);
                }
            });
            if (this.f42862m) {
                a aVar2 = c.this.f42827c;
                GroupRecord a2 = c.this.f42827c.a(this.f42858i);
                aVar2.f42814a.remove(a2);
                aVar2.f42815b.remove(a2.f42807b);
                aVar2.f42816c.remove(a2.f42808c);
            }
            a(z);
            runnable.run();
        }

        AbstractC1043c(j jVar, int i2, String str, w wVar, boolean z, boolean z2, boolean z3) {
            super(jVar, wVar, z, z2, z3);
            if (!z || !z2) {
                this.f42853e = i2;
                this.f42854f = str;
                this.f42855g = wVar;
                return;
            }
            throw new IllegalArgumentException("cant forceShow with forceHide");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle) {
        bundle.putParcelableArrayList("bd-scene-nav:group_stack", new ArrayList<>(this.f42827c.f42814a));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        List<j> a2 = a();
        for (int i2 = 0; i2 <= a2.size() - 1; i2++) {
            Bundle bundle2 = new Bundle();
            a2.get(i2).d(bundle2);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("bd-scene-nav:group_scene_manager", arrayList);
    }

    /* access modifiers changed from: package-private */
    public final void a(j jVar) {
        for (androidx.core.g.e<j, String> eVar : this.f42831i) {
            if (eVar.f2397a == jVar) {
                throw new com.bytedance.scene.b.a("Cant add/remove/show/hide " + jVar.getClass().getCanonicalName() + " before it finish previous add/remove/show/hide operation or in its lifecycle method");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(w wVar) {
        List<j> a2 = this.f42827c.a();
        for (int i2 = 0; i2 <= a2.size() - 1; i2++) {
            final j jVar = a2.get(i2);
            if (g(jVar)) {
                b(jVar);
                a(this.f42825a, jVar, wVar, false, new Runnable() {
                    /* class com.bytedance.scene.group.c.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(26291);
                    }

                    public final void run() {
                        c.this.c(jVar);
                    }
                });
            }
        }
    }

    public static w a(w wVar, w wVar2) {
        if (wVar.value < wVar2.value) {
            return wVar;
        }
        return wVar2;
    }

    public static void a(j jVar, int i2) {
        View view = jVar.n;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
    }

    public final void a(int i2, j jVar, String str, com.bytedance.scene.a.c cVar) {
        a(jVar);
        a aVar = new a(this, i2, jVar, str, cVar, (byte) 0);
        if (this.f42828f) {
            this.f42829g.add(aVar);
        } else {
            aVar.a(f42824e);
        }
    }

    public static void a(b bVar, j jVar, w wVar, boolean z, Runnable runnable) {
        MethodCollector.i(1951);
        while (true) {
            w wVar2 = jVar.q;
            if (wVar2 == wVar) {
                runnable.run();
                MethodCollector.o(1951);
                return;
            } else if (wVar2.value < wVar.value) {
                int i2 = AnonymousClass5.f42838a[wVar2.ordinal()];
                if (i2 == 1) {
                    jVar.a(bVar.t());
                    jVar.a(bVar);
                    GroupRecord d2 = bVar.f42818a.d(jVar);
                    Bundle bundle = d2.f42812g;
                    jVar.b(bundle);
                    ViewGroup d3 = bVar.d(bVar.f42818a.e(jVar));
                    jVar.a(bundle, d3);
                    d3.addView(jVar.n);
                    if (d2.f42809d) {
                        a(jVar, 8);
                    }
                } else if (i2 == 2) {
                    GroupRecord d4 = bVar.f42818a.d(jVar);
                    jVar.c(d4.f42812g);
                    d4.f42812g = null;
                } else if (i2 == 3) {
                    jVar.cl_();
                } else if (i2 == 4) {
                    jVar.cm_();
                } else {
                    h hVar = new h("unreachable state case " + wVar2.getName());
                    MethodCollector.o(1951);
                    throw hVar;
                }
            } else {
                int i3 = AnonymousClass5.f42838a[wVar2.ordinal()];
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            jVar.co_();
                        } else if (i3 == 5) {
                            jVar.cn_();
                        } else {
                            h hVar2 = new h("unreachable state case " + wVar2.getName());
                            MethodCollector.o(1951);
                            throw hVar2;
                        }
                    } else if (wVar == w.VIEW_CREATED) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("cant switch state ACTIVITY_CREATED to VIEW_CREATED");
                        MethodCollector.o(1951);
                        throw illegalArgumentException;
                    }
                }
                View view = jVar.n;
                jVar.cp_();
                if (z) {
                    k.a(view);
                }
                jVar.k();
                jVar.l();
                jVar.m();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract class d {

        /* renamed from: i  reason: collision with root package name */
        final j f42858i;

        /* renamed from: j  reason: collision with root package name */
        final w f42859j;

        /* renamed from: k  reason: collision with root package name */
        final boolean f42860k;

        /* renamed from: l  reason: collision with root package name */
        final boolean f42861l;

        /* renamed from: m  reason: collision with root package name */
        final boolean f42862m;

        static {
            Covode.recordClassIndex(26303);
        }

        /* access modifiers changed from: package-private */
        public abstract void a(Runnable runnable);

        d(j jVar, w wVar, boolean z, boolean z2, boolean z3) {
            this.f42858i = jVar;
            this.f42859j = wVar;
            this.f42860k = z;
            this.f42861l = z2;
            this.f42862m = z3;
        }
    }
}
