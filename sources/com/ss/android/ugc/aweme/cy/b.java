package com.ss.android.ugc.aweme.cy;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.av;
import com.ss.android.ugc.aweme.servicimpl.ad;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.dm;
import com.ss.android.ugc.aweme.shortvideo.em;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.zhiliaoapp.musically.R;
import h.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public final class b {

    /* renamed from: i  reason: collision with root package name */
    public static final C1843b f79192i = new C1843b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final c f79193a = new c();

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.creativex.recorder.b.a.d f79194b;

    /* renamed from: c  reason: collision with root package name */
    com.bytedance.creativex.recorder.b.a.m f79195c;

    /* renamed from: d  reason: collision with root package name */
    ShortVideoContext f79196d;

    /* renamed from: e  reason: collision with root package name */
    public androidx.fragment.app.e f79197e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f79198f = av.a();

    /* renamed from: g  reason: collision with root package name */
    public List<? extends CharSequence> f79199g;

    /* renamed from: h  reason: collision with root package name */
    String f79200h;

    /* renamed from: j  reason: collision with root package name */
    private com.ss.android.ugc.gamora.recorder.sticker.c.j f79201j;

    /* renamed from: k  reason: collision with root package name */
    private com.ss.android.ugc.aweme.shortvideo.ui.a.i f79202k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f79203l;

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f79206a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f79207b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f79208c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f79209d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f79210e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f79211f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f79212g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f79213h;

        static {
            Covode.recordClassIndex(49149);
        }
    }

    static {
        Covode.recordClassIndex(49145);
    }

    /* renamed from: com.ss.android.ugc.aweme.cy.b$b  reason: collision with other inner class name */
    public static final class C1843b {
        static {
            Covode.recordClassIndex(49148);
        }

        private C1843b() {
        }

        public /* synthetic */ C1843b(byte b2) {
            this();
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedList<com.ss.android.ugc.gamora.recorder.n.b> f79204a = new LinkedList<>();

        static {
            Covode.recordClassIndex(49146);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.cy.b$a$a  reason: collision with other inner class name */
        public static final class C1842a extends h.f.b.m implements h.f.a.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final C1842a f79205a = new C1842a();

            static {
                Covode.recordClassIndex(49147);
            }

            C1842a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                return true;
            }
        }

        public final a a(com.ss.android.ugc.gamora.recorder.n.b bVar, h.f.a.a<Boolean> aVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(aVar, "");
            if (!aVar.invoke().booleanValue()) {
                return this;
            }
            this.f79204a.addLast(bVar);
            return this;
        }
    }

    private final void a() {
        ShortVideoContext shortVideoContext = this.f79196d;
        if (shortVideoContext == null) {
            h.f.b.l.a("shortVideoContext");
        }
        if (shortVideoContext.c()) {
            ShortVideoContext shortVideoContext2 = this.f79196d;
            if (shortVideoContext2 == null) {
                h.f.b.l.a("shortVideoContext");
            }
            StitchParams stitchParams = shortVideoContext2.F.f124773a;
            if (stitchParams == null) {
                h.f.b.l.b();
            }
            if (!com.ss.android.ugc.aweme.shortvideo.stitch.c.b() && stitchParams.isPGCMusic() && stitchParams.getMusicStart() >= 0) {
                com.ss.android.ugc.aweme.shortvideo.stitch.c.c();
                this.f79193a.f79212g = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.o.f $diContainer;
        final /* synthetic */ e $modelFactory;
        final /* synthetic */ com.bytedance.scene.group.b $parentScene;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(49150);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, com.bytedance.scene.group.b bVar2, com.bytedance.o.f fVar, e eVar) {
            super(0);
            this.this$0 = bVar;
            this.$parentScene = bVar2;
            this.$diContainer = fVar;
            this.$modelFactory = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            b bVar = this.this$0;
            com.bytedance.scene.group.b bVar2 = this.$parentScene;
            com.bytedance.o.f fVar = this.$diContainer;
            e eVar = this.$modelFactory;
            com.bytedance.scene.navigation.d b2 = com.bytedance.scene.ktx.b.b(bVar2);
            com.bytedance.creativex.recorder.b.a.m mVar = bVar.f79195c;
            if (mVar == null) {
                h.f.b.l.a("recordControlApi");
            }
            mVar.C().a(b2, new i(eVar, fVar));
            com.bytedance.creativex.recorder.b.a.d dVar = bVar.f79194b;
            if (dVar == null) {
                h.f.b.l.a("cameraApiComponent");
            }
            dVar.t().a(b2, new q(bVar, eVar, fVar));
            com.bytedance.creativex.recorder.b.a.d dVar2 = bVar.f79194b;
            if (dVar2 == null) {
                h.f.b.l.a("cameraApiComponent");
            }
            dVar2.s().a(b2, new r(bVar, eVar, fVar));
            if (bVar.f79198f) {
                ((com.ss.android.ugc.gamora.recorder.l.f) fVar.a((Type) com.ss.android.ugc.gamora.recorder.l.f.class, (String) null)).c().a(b2, new s(eVar, fVar));
            } else {
                ((com.ss.android.ugc.gamora.recorder.l.f) fVar.a((Type) com.ss.android.ugc.gamora.recorder.l.f.class, (String) null)).b().a(b2, new t(eVar, fVar));
            }
            com.bytedance.creativex.recorder.b.a.d dVar3 = bVar.f79194b;
            if (dVar3 == null) {
                h.f.b.l.a("cameraApiComponent");
            }
            dVar3.u().a(b2, new u(eVar, fVar));
            com.ss.android.ugc.aweme.shortvideo.duet.d dVar4 = (com.ss.android.ugc.aweme.shortvideo.duet.d) fVar.b(com.ss.android.ugc.aweme.shortvideo.duet.d.class, null);
            if (dVar4 != null) {
                dVar4.a().a(b2, new g(b2, eVar, fVar));
                dVar4.b().a(b2, new h(b2, eVar, fVar));
            }
            com.bytedance.creativex.recorder.b.a.d dVar5 = bVar.f79194b;
            if (dVar5 == null) {
                h.f.b.l.a("cameraApiComponent");
            }
            dVar5.v().a(b2, new v(bVar, eVar, fVar));
            ((com.ss.android.ugc.gamora.recorder.j.a) fVar.a((Type) com.ss.android.ugc.gamora.recorder.j.a.class, (String) null)).a().a(b2, new w(eVar, fVar));
            ((com.ss.android.ugc.gamora.recorder.b.b) fVar.a((Type) com.ss.android.ugc.gamora.recorder.b.b.class, (String) null)).getBottomTabIndexChangeEvent().a(b2, new j(bVar, eVar, fVar));
            com.bytedance.creativex.recorder.b.a.d dVar6 = bVar.f79194b;
            if (dVar6 == null) {
                h.f.b.l.a("cameraApiComponent");
            }
            dVar6.o().a(b2, new k(eVar, fVar));
            com.bytedance.creativex.recorder.b.a.d dVar7 = bVar.f79194b;
            if (dVar7 == null) {
                h.f.b.l.a("cameraApiComponent");
            }
            dVar7.n().a(b2, new l(eVar, fVar));
            ((com.bytedance.creativex.recorder.b.a.d) fVar.a((Type) com.bytedance.creativex.recorder.b.a.d.class, (String) null)).x().a(b2, new m(bVar, eVar, fVar, bVar2));
            com.ss.android.ugc.gamora.recorder.choosemusic.a aVar = (com.ss.android.ugc.gamora.recorder.choosemusic.a) fVar.a((Type) com.ss.android.ugc.gamora.recorder.choosemusic.a.class, (String) null);
            ShortVideoContext shortVideoContext = bVar.f79196d;
            if (shortVideoContext == null) {
                h.f.b.l.a("shortVideoContext");
            }
            if (shortVideoContext.f124757b.a()) {
                bVar.a(eVar, fVar);
            }
            aVar.getMusicAdded().a(b2, new e(bVar, eVar, fVar, b2));
            aVar.getMusicCleared().a(b2, new f(bVar, eVar, fVar, b2));
            ((com.ss.android.ugc.aweme.shortvideo.countdown.a) fVar.a((Type) com.ss.android.ugc.aweme.shortvideo.countdown.a.class, (String) null)).a().a(b2, new n(bVar, eVar, fVar));
            ((com.bytedance.creativex.recorder.b.a.z) fVar.a((Type) com.bytedance.creativex.recorder.b.a.z.class, (String) null)).an().a(b2, new o(bVar, eVar, fVar));
            ((com.bytedance.creativex.recorder.b.a.z) fVar.a((Type) com.bytedance.creativex.recorder.b.a.z.class, (String) null)).ao().a(b2, new p(bVar, eVar, fVar));
            return z.f158842a;
        }
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f79230a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f79231b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f79232c;

        static {
            Covode.recordClassIndex(49156);
        }

        j(b bVar, e eVar, com.bytedance.o.f fVar) {
            this.f79230a = bVar;
            this.f79231b = eVar;
            this.f79232c = fVar;
        }

        static final class a extends h.f.b.m implements h.f.a.b<Boolean, List<com.ss.android.ugc.gamora.recorder.n.b>> {
            final /* synthetic */ List $deleteItems;
            final /* synthetic */ List $newItems;

            static {
                Covode.recordClassIndex(49157);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List list, List list2) {
                super(1);
                this.$newItems = list;
                this.$deleteItems = list2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ List<com.ss.android.ugc.gamora.recorder.n.b> invoke(Boolean bool) {
                if (bool.booleanValue()) {
                    return this.$newItems;
                }
                return this.$deleteItems;
            }
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            com.ss.android.ugc.gamora.recorder.b.c cVar = (com.ss.android.ugc.gamora.recorder.b.c) obj;
            b bVar = this.f79230a;
            androidx.fragment.app.e a2 = b.a(bVar);
            Object obj2 = cVar.f147371c;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
            if (bVar.a(a2, (CharSequence) obj2)) {
                b bVar2 = this.f79230a;
                Object obj3 = cVar.f147371c;
                Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.CharSequence");
                String str = bVar2.f79200h;
                if (str == null) {
                    h.f.b.l.a("liveText");
                }
                if (h.f.b.l.a((Object) str, obj3) || h.f.b.l.a((Object) "RecordCombinePhoto", obj3)) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f79230a.f79193a.f79206a != z) {
                    boolean O = b.b(this.f79230a).O();
                    this.f79230a.f79193a.f79206a = z;
                    this.f79230a.f79193a.f79208c = b.b(this.f79230a).a(O, z);
                    this.f79230a.f79193a.f79209d = b.b(this.f79230a).d(O);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    a aVar = new a(arrayList, arrayList2);
                    if (this.f79230a.f79193a.f79206a) {
                        arrayList2.add(this.f79231b.b());
                        arrayList2.add(this.f79231b.i());
                        arrayList2.add(this.f79231b.k());
                        arrayList2.add(this.f79231b.f());
                        ((List) aVar.invoke(Boolean.valueOf(this.f79230a.f79193a.f79208c))).add(this.f79231b.m());
                        ((List) aVar.invoke(Boolean.valueOf(this.f79230a.f79193a.f79209d))).add(this.f79231b.h());
                    } else {
                        arrayList.add(this.f79231b.b());
                        ((List) aVar.invoke(Boolean.valueOf(this.f79230a.f79193a.f79210e))).add(this.f79231b.i());
                        ((List) aVar.invoke(Boolean.valueOf(this.f79230a.f79193a.f79211f))).add(this.f79231b.k());
                        arrayList.add(this.f79231b.f());
                        ((List) aVar.invoke(Boolean.valueOf(this.f79230a.f79193a.f79208c))).add(this.f79231b.m());
                        ((List) aVar.invoke(Boolean.valueOf(this.f79230a.f79193a.f79209d))).add(this.f79231b.h());
                    }
                    ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79232c.a(com.ss.android.ugc.gamora.recorder.n.a.e.class)).a(arrayList);
                    ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79232c.a(com.ss.android.ugc.gamora.recorder.n.a.e.class)).b(arrayList2);
                    b bVar3 = this.f79230a;
                    ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79232c.a(com.ss.android.ugc.gamora.recorder.n.a.e.class)).a(bVar3.a(bVar3.f79193a));
                }
            }
        }
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f79237a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f79238b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f79239c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f79240d;

        static {
            Covode.recordClassIndex(49160);
        }

        m(b bVar, e eVar, com.bytedance.o.f fVar, com.bytedance.scene.group.b bVar2) {
            this.f79237a = bVar;
            this.f79238b = eVar;
            this.f79239c = fVar;
            this.f79240d = bVar2;
        }

        static final class a extends h.f.b.m implements h.f.a.b<Boolean, List<com.ss.android.ugc.gamora.recorder.n.b>> {
            final /* synthetic */ List $deleteItems;
            final /* synthetic */ List $newItems;

            static {
                Covode.recordClassIndex(49162);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List list, List list2) {
                super(1);
                this.$newItems = list;
                this.$deleteItems = list2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ List<com.ss.android.ugc.gamora.recorder.n.b> invoke(Boolean bool) {
                if (bool.booleanValue()) {
                    return this.$newItems;
                }
                return this.$deleteItems;
            }
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            com.ss.android.ugc.aweme.tools.g gVar = (com.ss.android.ugc.aweme.tools.g) obj;
            c cVar = this.f79237a.f79193a;
            h.f.b.l.b(gVar, "");
            cVar.f79207b = gVar.f140198a;
            this.f79237a.f79193a.f79208c = b.b(this.f79237a).a(this.f79237a.f79193a.f79207b, this.f79237a.f79193a.f79206a);
            this.f79237a.f79193a.f79209d = b.b(this.f79237a).d(this.f79237a.f79193a.f79207b);
            com.ss.android.ugc.gamora.recorder.n.b l2 = this.f79238b.l();
            if (this.f79237a.f79198f) {
                i2 = 2131232562;
            } else {
                i2 = 2131232561;
            }
            l2.f148159b = i2;
            ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79239c.a((Type) com.ss.android.ugc.gamora.recorder.n.a.e.class, (String) null)).a(l2);
            final com.ss.android.ugc.gamora.recorder.n.b a2 = this.f79238b.a();
            a2.f148163f = gVar.f140199b;
            com.bytedance.scene.ktx.c.a(this.f79240d, new Runnable(this) {
                /* class com.ss.android.ugc.aweme.cy.b.m.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ m f79241a;

                static {
                    Covode.recordClassIndex(49161);
                }

                {
                    this.f79241a = r1;
                }

                public final void run() {
                    ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79241a.f79239c.a((Type) com.ss.android.ugc.gamora.recorder.n.a.e.class, (String) null)).a(a2);
                }
            });
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            a aVar = new a(arrayList, arrayList2);
            ((List) aVar.invoke(Boolean.valueOf(this.f79237a.f79193a.f79209d))).add(this.f79238b.h());
            ((List) aVar.invoke(Boolean.valueOf(!this.f79237a.f79193a.f79207b))).add(this.f79238b.l());
            ((List) aVar.invoke(Boolean.valueOf(this.f79237a.f79193a.f79208c))).add(this.f79238b.m());
            ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79239c.a(com.ss.android.ugc.gamora.recorder.n.a.e.class)).a(arrayList);
            ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79239c.a(com.ss.android.ugc.gamora.recorder.n.a.e.class)).b(arrayList2);
            b bVar = this.f79237a;
            ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79239c.a(com.ss.android.ugc.gamora.recorder.n.a.e.class)).a(bVar.a(bVar.f79193a));
        }
    }

    static final class o<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f79246a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f79247b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f79248c;

        static {
            Covode.recordClassIndex(49164);
        }

        o(b bVar, e eVar, com.bytedance.o.f fVar) {
            this.f79246a = bVar;
            this.f79247b = eVar;
            this.f79248c = fVar;
        }

        static final class a extends h.f.b.m implements h.f.a.b<Boolean, List<com.ss.android.ugc.gamora.recorder.n.b>> {
            final /* synthetic */ List $deleteItems;
            final /* synthetic */ List $newItems;

            static {
                Covode.recordClassIndex(49165);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List list, List list2) {
                super(1);
                this.$newItems = list;
                this.$deleteItems = list2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ List<com.ss.android.ugc.gamora.recorder.n.b> invoke(Boolean bool) {
                if (bool.booleanValue()) {
                    return this.$newItems;
                }
                return this.$deleteItems;
            }
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            int i2;
            int i3;
            boolean z2;
            boolean z3;
            com.ss.android.ugc.gamora.recorder.n.b l2 = this.f79247b.l();
            boolean z4 = false;
            if (!b.b(this.f79246a).X() || !b.b(this.f79246a).aa()) {
                z = true;
            } else {
                z = false;
            }
            com.bytedance.o.f fVar = this.f79248c;
            if (this.f79246a.f79198f) {
                i2 = 2131232562;
            } else {
                i2 = 2131232561;
            }
            b.a(l2, z, fVar, i2);
            if (this.f79246a.f79198f) {
                i3 = 2131232543;
            } else {
                i3 = 2131232542;
            }
            com.ss.android.ugc.gamora.recorder.n.b m2 = this.f79247b.m();
            if (!b.b(this.f79246a).Y() || !com.ss.android.ugc.asve.recorder.camera.c.c.a(b.a(this.f79246a))) {
                z2 = true;
            } else {
                z2 = false;
            }
            b.a(m2, z2, this.f79248c, 2131232579);
            com.ss.android.ugc.gamora.recorder.n.b h2 = this.f79247b.h();
            if (!b.b(this.f79246a).Y() || !com.ss.android.ugc.asve.recorder.camera.a.b.b(b.a(this.f79246a))) {
                z3 = true;
            } else {
                z3 = false;
            }
            b.a(h2, z3, this.f79248c, i3);
            c cVar = this.f79246a.f79193a;
            com.bytedance.creativex.recorder.b.a.d b2 = b.b(this.f79246a);
            if (b2.Z() && b2.d(this.f79246a.f79193a.f79207b)) {
                z4 = true;
            }
            cVar.f79209d = z4;
            this.f79246a.f79193a.f79208c = b.b(this.f79246a).a(this.f79246a.f79193a.f79207b, this.f79246a.f79193a.f79206a);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            a aVar = new a(arrayList, arrayList2);
            ((List) aVar.invoke(Boolean.valueOf(this.f79246a.f79193a.f79209d))).add(this.f79247b.h());
            ((List) aVar.invoke(Boolean.valueOf(this.f79246a.f79193a.f79208c))).add(this.f79247b.m());
            ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79248c.a(com.ss.android.ugc.gamora.recorder.n.a.e.class)).a(arrayList);
            ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79248c.a(com.ss.android.ugc.gamora.recorder.n.a.e.class)).b(arrayList2);
            b bVar = this.f79246a;
            ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79248c.a(com.ss.android.ugc.gamora.recorder.n.a.e.class)).a(bVar.a(bVar.f79193a));
            if (b.b(this.f79246a).P()) {
                b.b(this.f79246a).b(5);
            }
            this.f79246a.b(this.f79247b, this.f79248c);
        }
    }

    static final class p<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f79249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f79250b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f79251c;

        static {
            Covode.recordClassIndex(49166);
        }

        p(b bVar, e eVar, com.bytedance.o.f fVar) {
            this.f79249a = bVar;
            this.f79250b = eVar;
            this.f79251c = fVar;
        }

        static final class a extends h.f.b.m implements h.f.a.b<Boolean, List<com.ss.android.ugc.gamora.recorder.n.b>> {
            final /* synthetic */ List $deleteItems;
            final /* synthetic */ List $newItems;

            static {
                Covode.recordClassIndex(49167);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List list, List list2) {
                super(1);
                this.$newItems = list;
                this.$deleteItems = list2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ List<com.ss.android.ugc.gamora.recorder.n.b> invoke(Boolean bool) {
                if (bool.booleanValue()) {
                    return this.$newItems;
                }
                return this.$deleteItems;
            }
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            c cVar = this.f79249a.f79193a;
            com.bytedance.creativex.recorder.b.a.d b2 = b.b(this.f79249a);
            if (!b2.Z() || !b2.d(this.f79249a.f79193a.f79207b)) {
                z = false;
            } else {
                z = true;
            }
            cVar.f79209d = z;
            this.f79249a.f79193a.f79208c = b.b(this.f79249a).a(this.f79249a.f79193a.f79207b, this.f79249a.f79193a.f79206a);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            a aVar = new a(arrayList, arrayList2);
            ((List) aVar.invoke(Boolean.valueOf(this.f79249a.f79193a.f79209d))).add(this.f79250b.h());
            ((List) aVar.invoke(Boolean.valueOf(this.f79249a.f79193a.f79208c))).add(this.f79250b.m());
            ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79251c.a(com.ss.android.ugc.gamora.recorder.n.a.e.class)).a(arrayList);
            ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79251c.a(com.ss.android.ugc.gamora.recorder.n.a.e.class)).b(arrayList2);
            b bVar = this.f79249a;
            ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79251c.a(com.ss.android.ugc.gamora.recorder.n.a.e.class)).a(bVar.a(bVar.f79193a));
        }
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f79214a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f79215b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f79216c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.navigation.d f79217d;

        static {
            Covode.recordClassIndex(49151);
        }

        e(b bVar, e eVar, com.bytedance.o.f fVar, com.bytedance.scene.navigation.d dVar) {
            this.f79214a = bVar;
            this.f79215b = eVar;
            this.f79216c = fVar;
            this.f79217d = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f79214a.a(this.f79215b, this.f79216c);
        }
    }

    public static final /* synthetic */ androidx.fragment.app.e a(b bVar) {
        androidx.fragment.app.e eVar = bVar.f79197e;
        if (eVar == null) {
            h.f.b.l.a("activity");
        }
        return eVar;
    }

    public static final /* synthetic */ com.bytedance.creativex.recorder.b.a.d b(b bVar) {
        com.bytedance.creativex.recorder.b.a.d dVar = bVar.f79194b;
        if (dVar == null) {
            h.f.b.l.a("cameraApiComponent");
        }
        return dVar;
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.navigation.d f79222a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f79223b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f79224c;

        static {
            Covode.recordClassIndex(49153);
        }

        g(com.bytedance.scene.navigation.d dVar, e eVar, com.bytedance.o.f fVar) {
            this.f79222a = dVar;
            this.f79223b = eVar;
            this.f79224c = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.gamora.recorder.n.b n = this.f79223b.n();
            n.f148161d = !((Boolean) obj).booleanValue();
            ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79224c.a((Type) com.ss.android.ugc.gamora.recorder.n.a.e.class, (String) null)).a(n);
        }
    }

    static final class h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.navigation.d f79225a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f79226b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f79227c;

        static {
            Covode.recordClassIndex(49154);
        }

        h(com.bytedance.scene.navigation.d dVar, e eVar, com.bytedance.o.f fVar) {
            this.f79225a = dVar;
            this.f79226b = eVar;
            this.f79227c = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.gamora.recorder.n.b n = this.f79226b.n();
            n.f148160c = (com.ss.android.ugc.aweme.base.l) obj;
            ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79227c.a((Type) com.ss.android.ugc.gamora.recorder.n.a.e.class, (String) null)).a(n);
        }
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f79218a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f79219b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f79220c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.navigation.d f79221d;

        static {
            Covode.recordClassIndex(49152);
        }

        f(b bVar, e eVar, com.bytedance.o.f fVar, com.bytedance.scene.navigation.d dVar) {
            this.f79218a = bVar;
            this.f79219b = eVar;
            this.f79220c = fVar;
            this.f79221d = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            b bVar = this.f79218a;
            e eVar = this.f79219b;
            com.bytedance.o.f fVar = this.f79220c;
            bVar.f79193a.f79210e = false;
            ArrayList arrayList = new ArrayList();
            arrayList.add(eVar.i());
            com.ss.android.ugc.gamora.recorder.n.a.e eVar2 = (com.ss.android.ugc.gamora.recorder.n.a.e) fVar.a(com.ss.android.ugc.gamora.recorder.n.a.e.class);
            eVar2.b(arrayList);
            eVar2.a(bVar.a(bVar.f79193a));
        }
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f79228a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f79229b;

        static {
            Covode.recordClassIndex(49155);
        }

        i(e eVar, com.bytedance.o.f fVar) {
            this.f79228a = eVar;
            this.f79229b = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            com.ss.android.ugc.aweme.tools.m mVar = (com.ss.android.ugc.aweme.tools.m) obj;
            com.ss.android.ugc.gamora.recorder.n.b k2 = this.f79228a.k();
            h.f.b.l.b(mVar, "");
            if (mVar.f140265b) {
                i2 = 2131232590;
            } else {
                i2 = 2131232589;
            }
            k2.f148159b = i2;
            k2.f148161d = !mVar.f140264a;
            ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79229b.a((Type) com.ss.android.ugc.gamora.recorder.n.a.e.class, (String) null)).a(k2);
        }
    }

    static final class k<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f79233a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f79234b;

        static {
            Covode.recordClassIndex(49158);
        }

        k(e eVar, com.bytedance.o.f fVar) {
            this.f79233a = eVar;
            this.f79234b = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            com.ss.android.ugc.gamora.recorder.n.b a2 = this.f79233a.a();
            if (!h.f.b.l.a(Boolean.valueOf(a2.f148161d), bool)) {
                h.f.b.l.b(bool, "");
                a2.f148161d = bool.booleanValue();
                ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79234b.a((Type) com.ss.android.ugc.gamora.recorder.n.a.e.class, (String) null)).a(a2);
            }
        }
    }

    public static final class n implements com.bytedance.als.m<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f79243a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f79244b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f79245c;

        static {
            Covode.recordClassIndex(49163);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Integer num) {
            int i2;
            Integer num2 = num;
            if (num2 != null) {
                com.ss.android.ugc.gamora.recorder.n.b f2 = this.f79244b.f();
                if (this.f79243a.f79198f) {
                    if (num2.intValue() == 10) {
                        i2 = 2131232592;
                    } else {
                        i2 = 2131232594;
                    }
                } else if (num2.intValue() == 10) {
                    i2 = 2131232591;
                } else {
                    i2 = 2131232593;
                }
                f2.f148159b = i2;
                ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79245c.a((Type) com.ss.android.ugc.gamora.recorder.n.a.e.class, (String) null)).a(f2);
            }
        }

        n(b bVar, e eVar, com.bytedance.o.f fVar) {
            this.f79243a = bVar;
            this.f79244b = eVar;
            this.f79245c = fVar;
        }
    }

    static final class t<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f79260a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f79261b;

        static {
            Covode.recordClassIndex(49171);
        }

        t(e eVar, com.bytedance.o.f fVar) {
            this.f79260a = eVar;
            this.f79261b = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            com.ss.android.ugc.gamora.recorder.n.b b2 = this.f79260a.b();
            if (num != null && num.intValue() == 0) {
                b2.f148159b = 2131232578;
                if (b2.f148165h > 0) {
                    b2.f148165h = R.string.g2z;
                }
            } else {
                b2.f148159b = 2131232577;
                if (b2.f148165h > 0) {
                    b2.f148165h = R.string.g2y;
                }
            }
            ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79261b.a((Type) com.ss.android.ugc.gamora.recorder.n.a.e.class, (String) null)).a(b2);
        }
    }

    static final class u<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f79262a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f79263b;

        static {
            Covode.recordClassIndex(49172);
        }

        u(e eVar, com.bytedance.o.f fVar) {
            this.f79262a = eVar;
            this.f79263b = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            com.ss.android.ugc.gamora.recorder.n.b m2 = this.f79262a.m();
            if (num != null) {
                if (num.intValue() == 2) {
                    m2.f148159b = 2131232579;
                } else if (num.intValue() == 3) {
                    m2.f148159b = 2131232580;
                }
            }
            m2.f148165h = R.string.fsf;
            ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79263b.a((Type) com.ss.android.ugc.gamora.recorder.n.a.e.class, (String) null)).a(m2);
        }
    }

    static final class w<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f79267a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f79268b;

        static {
            Covode.recordClassIndex(49174);
        }

        w(e eVar, com.bytedance.o.f fVar) {
            this.f79267a = eVar;
            this.f79268b = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            com.ss.android.ugc.gamora.recorder.n.b i2 = this.f79267a.i();
            if (!h.f.b.l.a(Boolean.valueOf(i2.f148161d), bool)) {
                h.f.b.l.b(bool, "");
                i2.f148161d = bool.booleanValue();
                ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79268b.a((Type) com.ss.android.ugc.gamora.recorder.n.a.e.class, (String) null)).a(i2);
            }
        }
    }

    static final class l<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f79235a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f79236b;

        static {
            Covode.recordClassIndex(49159);
        }

        l(e eVar, com.bytedance.o.f fVar) {
            this.f79235a = eVar;
            this.f79236b = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            com.ss.android.ugc.gamora.recorder.n.b a2 = this.f79235a.a();
            if ((!h.f.b.l.a(Boolean.valueOf(a2.f148161d), bool)) || (!h.f.b.l.a(Boolean.valueOf(a2.f148167j), bool))) {
                h.f.b.l.b(bool, "");
                a2.f148161d = bool.booleanValue();
                a2.f148167j = bool.booleanValue();
                if (bool.booleanValue()) {
                    a2.f148163f = false;
                }
                ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79236b.a((Type) com.ss.android.ugc.gamora.recorder.n.a.e.class, (String) null)).a(a2);
            }
        }
    }

    static final class q<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f79252a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f79253b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f79254c;

        static {
            Covode.recordClassIndex(49168);
        }

        q(b bVar, e eVar, com.bytedance.o.f fVar) {
            this.f79252a = bVar;
            this.f79253b = eVar;
            this.f79254c = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Integer num = (Integer) obj;
            com.ss.android.ugc.gamora.recorder.n.b h2 = this.f79253b.h();
            if (this.f79252a.f79198f) {
                if (num != null) {
                    if (num.intValue() == 2) {
                        h2.f148159b = 2131232543;
                    } else if (num.intValue() == 3) {
                        h2.f148159b = 2131232545;
                    }
                }
            } else if (num != null) {
                if (num.intValue() == 2) {
                    h2.f148159b = 2131232542;
                } else if (num.intValue() == 3) {
                    h2.f148159b = 2131232544;
                }
            }
            ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79254c.a((Type) com.ss.android.ugc.gamora.recorder.n.a.e.class, (String) null)).a(h2);
            if (!this.f79252a.f79193a.f79207b) {
                com.ss.android.ugc.gamora.recorder.n.b l2 = this.f79253b.l();
                if (this.f79252a.f79198f) {
                    i2 = 2131232562;
                } else {
                    i2 = 2131232561;
                }
                l2.f148159b = i2;
                ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79254c.a((Type) com.ss.android.ugc.gamora.recorder.n.a.e.class, (String) null)).a(l2);
            }
        }
    }

    static final class r<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f79255a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f79256b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f79257c;

        static {
            Covode.recordClassIndex(49169);
        }

        r(b bVar, e eVar, com.bytedance.o.f fVar) {
            this.f79255a = bVar;
            this.f79256b = eVar;
            this.f79257c = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            int i3;
            Integer num = (Integer) obj;
            com.ss.android.ugc.gamora.recorder.n.b l2 = this.f79256b.l();
            if (num != null) {
                if (num.intValue() == 0) {
                    if (this.f79255a.f79198f) {
                        i2 = 2131232562;
                    } else {
                        i2 = 2131232561;
                    }
                    l2.f148159b = i2;
                } else if (num.intValue() == 5) {
                    l2.f148161d = false;
                } else if (num.intValue() == 6) {
                    l2.f148161d = true;
                }
                ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79257c.a((Type) com.ss.android.ugc.gamora.recorder.n.a.e.class, (String) null)).a(l2);
            }
            if (this.f79255a.f79198f) {
                i3 = 2131232564;
            } else {
                i3 = 2131232563;
            }
            l2.f148159b = i3;
            ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79257c.a((Type) com.ss.android.ugc.gamora.recorder.n.a.e.class, (String) null)).a(l2);
        }
    }

    static final class s<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f79258a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f79259b;

        static {
            Covode.recordClassIndex(49170);
        }

        s(e eVar, com.bytedance.o.f fVar) {
            this.f79258a = eVar;
            this.f79259b = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.tools.i iVar = (com.ss.android.ugc.aweme.tools.i) obj;
            com.ss.android.ugc.gamora.recorder.n.b b2 = this.f79258a.b();
            int i2 = 2131232574;
            if (iVar != null) {
                int i3 = c.f79269a[iVar.ordinal()];
                if (i3 == 1) {
                    i2 = 2131232572;
                } else if (i3 == 2) {
                    i2 = 2131232573;
                } else if (i3 != 3) {
                    if (i3 == 4) {
                        i2 = 2131232575;
                    } else if (i3 == 5) {
                        i2 = 2131232576;
                    }
                }
            }
            b2.f148159b = i2;
            ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79259b.a((Type) com.ss.android.ugc.gamora.recorder.n.a.e.class, (String) null)).a(b2);
        }
    }

    static final class v<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f79264a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f79265b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f79266c;

        static {
            Covode.recordClassIndex(49173);
        }

        v(b bVar, e eVar, com.bytedance.o.f fVar) {
            this.f79264a = bVar;
            this.f79265b = eVar;
            this.f79266c = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            int i3;
            com.ss.android.ugc.aweme.tools.j jVar = (com.ss.android.ugc.aweme.tools.j) obj;
            com.ss.android.ugc.gamora.recorder.n.b g2 = this.f79265b.g();
            h.f.b.l.b(jVar, "");
            int i4 = jVar.f140202a;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        g2.f148161d = true;
                    } else if (i4 == 4) {
                        g2.f148161d = false;
                    }
                } else if (g2.f148161d) {
                    if (this.f79264a.f79198f) {
                        i3 = 2131232568;
                    } else {
                        i3 = 2131232567;
                    }
                    g2.f148159b = i3;
                }
            } else if (g2.f148161d) {
                if (this.f79264a.f79198f) {
                    i2 = 2131232570;
                } else {
                    i2 = 2131232569;
                }
                g2.f148159b = i2;
            }
            ((com.ss.android.ugc.gamora.recorder.n.a.e) this.f79266c.a((Type) com.ss.android.ugc.gamora.recorder.n.a.e.class, (String) null)).a(g2);
        }
    }

    public final int a(c cVar) {
        int i2;
        ShortVideoContext shortVideoContext = this.f79196d;
        if (shortVideoContext == null) {
            h.f.b.l.a("shortVideoContext");
        }
        boolean b2 = dm.b(shortVideoContext);
        boolean a2 = com.ss.android.ugc.aweme.shortvideo.duet.a.a(shortVideoContext);
        if (com.ss.android.ugc.aweme.beauty.b.a()) {
            i2 = 6;
        } else {
            i2 = 5;
        }
        if (b2) {
            i2++;
        }
        if (a2) {
            i2++;
        }
        if (cVar.f79209d) {
            i2++;
        }
        if (cVar.f79210e) {
            i2++;
        }
        if (cVar.f79213h) {
            i2++;
        }
        return i2 + 1;
    }

    public final void b(e eVar, com.bytedance.o.f fVar) {
        boolean z = this.f79203l;
        androidx.fragment.app.e eVar2 = this.f79197e;
        if (eVar2 == null) {
            h.f.b.l.a("activity");
        }
        if (z != em.a(eVar2)) {
            androidx.fragment.app.e eVar3 = this.f79197e;
            if (eVar3 == null) {
                h.f.b.l.a("activity");
            }
            this.f79203l = em.a(eVar3);
            for (com.ss.android.ugc.gamora.recorder.n.b bVar : h.a.n.b(eVar.a(), eVar.b(), eVar.c(), eVar.d(), eVar.e(), eVar.f(), eVar.g(), eVar.h(), eVar.i(), eVar.j(), eVar.k(), eVar.l(), eVar.m(), eVar.n())) {
                bVar.a(this.f79203l);
                ((com.ss.android.ugc.gamora.recorder.n.a.e) fVar.a(com.ss.android.ugc.gamora.recorder.n.a.e.class, (String) null)).a(bVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(e eVar, com.bytedance.o.f fVar) {
        this.f79193a.f79210e = true;
        ArrayList arrayList = new ArrayList();
        ShortVideoContext shortVideoContext = this.f79196d;
        if (shortVideoContext == null) {
            h.f.b.l.a("shortVideoContext");
        }
        if (!shortVideoContext.c()) {
            arrayList.add(eVar.i());
        }
        com.ss.android.ugc.gamora.recorder.n.a.e eVar2 = (com.ss.android.ugc.gamora.recorder.n.a.e) fVar.a(com.ss.android.ugc.gamora.recorder.n.a.e.class);
        eVar2.a(arrayList);
        eVar2.a(a(this.f79193a));
    }

    public final boolean a(Activity activity, CharSequence charSequence) {
        if (this.f79199g == null) {
            List<Number> b2 = h.a.n.b(Integer.valueOf(ad.RECORD_COMBINE.getTagResId()), Integer.valueOf(ad.RECORD_COMBINE_15.getTagResId()), Integer.valueOf(ad.RECORD_COMBINE_60.getTagResId()), Integer.valueOf(ad.PHOTO_SHORT.getTagResId()), Integer.valueOf(ad.RECORD_LIGHTENING_VIDEO.getTagResId()));
            ArrayList arrayList = new ArrayList();
            for (Number number : b2) {
                String string = activity.getResources().getString(number.intValue());
                h.f.b.l.b(string, "");
                arrayList.add(string);
            }
            arrayList.add("RecordCombinePhoto");
            this.f79199g = arrayList;
            String string2 = activity.getResources().getString(ad.PHOTO_SHORT.getTagResId());
            h.f.b.l.b(string2, "");
            this.f79200h = string2;
        }
        List<? extends CharSequence> list = this.f79199g;
        if (list == null) {
            h.f.b.l.a("tabs");
        }
        return list.contains(charSequence);
    }

    public final com.ss.android.ugc.gamora.recorder.n.a.f a(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar, a aVar) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(aVar, "");
        return b(bVar, fVar, aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0160, code lost:
        if (r0.f124757b.f124706a == 2) goto L_0x0162;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.ss.android.ugc.gamora.recorder.n.a.f b(com.bytedance.scene.group.b r19, com.bytedance.o.f r20, com.ss.android.ugc.aweme.cy.a r21) {
        /*
        // Method dump skipped, instructions count: 440
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.cy.b.b(com.bytedance.scene.group.b, com.bytedance.o.f, com.ss.android.ugc.aweme.cy.a):com.ss.android.ugc.gamora.recorder.n.a.f");
    }

    public static void a(com.ss.android.ugc.gamora.recorder.n.b bVar, boolean z, com.bytedance.o.f fVar, int i2) {
        bVar.f148161d = z;
        if (!z) {
            bVar.f148159b = i2;
        }
        ((com.ss.android.ugc.gamora.recorder.n.a.e) fVar.a(com.ss.android.ugc.gamora.recorder.n.a.e.class, (String) null)).a(bVar);
    }
}
