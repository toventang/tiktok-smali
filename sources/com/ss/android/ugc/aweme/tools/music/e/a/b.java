package com.ss.android.ugc.aweme.tools.music.e.a;

import android.content.SharedPreferences;
import b.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.a.n;
import h.c.b.a.k;
import h.c.h;
import h.f.a.m;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static final b f140453h = C3712b.f140462a;

    /* renamed from: i  reason: collision with root package name */
    public static final a f140454i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public aa.k f140455a;

    /* renamed from: b  reason: collision with root package name */
    public aa.j f140456b;

    /* renamed from: c  reason: collision with root package name */
    public List<MusicModel> f140457c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f140458d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f140459e;

    /* renamed from: f  reason: collision with root package name */
    public int f140460f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f140461g;

    public static final class a {
        static {
            Covode.recordClassIndex(91750);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.e.a.b$b  reason: collision with other inner class name */
    static final class C3712b {

        /* renamed from: a  reason: collision with root package name */
        static final b f140462a = new b((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final C3712b f140463b = new C3712b();

        private C3712b() {
        }

        static {
            Covode.recordClassIndex(91751);
        }
    }

    private b() {
        this.f140457c = new ArrayList();
    }

    static {
        Covode.recordClassIndex(91749);
    }

    public static CollectedMusicList a() {
        String string = c.f140472b.f140474a.getString("collect_music_list", "");
        if (string == null || string.length() == 0) {
            return null;
        }
        try {
            return (CollectedMusicList) com.ss.android.ugc.aweme.tools.music.f.d.f140594a.a(string, CollectedMusicList.class);
        } catch (Exception unused) {
            SharedPreferences.Editor edit = c.f140472b.f140474a.edit();
            edit.remove("collect_music_list");
            edit.commit();
            return null;
        }
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    public final void a(List<MusicModel> list) {
        l.d(list, "");
        this.f140457c = list;
    }

    public final void b(int i2) {
        if (!this.f140458d) {
            a(i2);
            return;
        }
        aa.k kVar = this.f140455a;
        if (kVar != null) {
            kVar.b();
        }
    }

    public final void c(int i2) {
        this.f140459e = true;
        bz unused = i.a(bs.f159054a, null, null, new f(this, i2, null), 3);
    }

    public static void a(CollectedMusicList collectedMusicList) {
        c cVar = c.f140472b;
        String b2 = com.ss.android.ugc.aweme.tools.music.f.d.f140594a.b(collectedMusicList);
        l.b(b2, "");
        l.d(b2, "");
        SharedPreferences.Editor edit = cVar.f140474a.edit();
        edit.putString("collect_music_list", b2);
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    public static final class c<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f140464a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ aa.j f140465b;

        static {
            Covode.recordClassIndex(91752);
        }

        c(boolean z, aa.j jVar) {
            this.f140464a = z;
            this.f140465b = jVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            boolean z;
            l.b(iVar, "");
            if (iVar.c() || !iVar.a()) {
                z = false;
            } else {
                z = true;
            }
            if (this.f140464a) {
                aa.j jVar = b.f140453h.f140456b;
                if (jVar != null) {
                    jVar.a(z);
                }
            } else {
                aa.j jVar2 = this.f140465b;
                if (jVar2 != null) {
                    jVar2.b(z);
                }
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ int $soundPageScene;
        int label;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(91753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, int i2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
            this.$soundPageScene = i2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new d(this.this$0, this.$soundPageScene, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                b.i<CollectedMusicList> a2 = MusicService.m().a(0, this.$soundPageScene);
                if (a2 != null) {
                    a2.a(new g(this) {
                        /* class com.ss.android.ugc.aweme.tools.music.e.a.b.d.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ d f140466a;

                        static {
                            Covode.recordClassIndex(91754);
                        }

                        {
                            this.f140466a = r1;
                        }

                        @Override // b.g
                        public final /* synthetic */ Object then(b.i iVar) {
                            List<Music> list;
                            l.b(iVar, "");
                            if (iVar.c() || !iVar.a()) {
                                CollectedMusicList a2 = b.a();
                                if (!(a2 == null || (list = a2.items) == null)) {
                                    ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                                    Iterator<T> it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(it.next().convertToMusicModel());
                                    }
                                    ArrayList arrayList2 = arrayList;
                                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                                        this.f140466a.this$0.a(n.g((Collection) arrayList2));
                                        aa.k kVar = this.f140466a.this$0.f140455a;
                                        if (kVar == null) {
                                            return null;
                                        }
                                        kVar.a(this.f140466a.this$0.f140457c, false);
                                        return z.f158842a;
                                    }
                                }
                                aa.k kVar2 = this.f140466a.this$0.f140455a;
                                if (kVar2 == null) {
                                    return null;
                                }
                                kVar2.c();
                                return z.f158842a;
                            } else if (iVar.d() != null) {
                                b bVar = this.f140466a.this$0;
                                Object d2 = iVar.d();
                                l.b(d2, "");
                                bVar.f140460f = ((CollectedMusicList) d2).cursor;
                                b bVar2 = this.f140466a.this$0;
                                Object d3 = iVar.d();
                                l.b(d3, "");
                                bVar2.f140461g = ((CollectedMusicList) d3).isHasMore();
                                Object d4 = iVar.d();
                                l.b(d4, "");
                                if (((CollectedMusicList) d4).items != null) {
                                    Object d5 = iVar.d();
                                    l.b(d5, "");
                                    if (((CollectedMusicList) d5).items.size() > 0) {
                                        Object d6 = iVar.d();
                                        l.b(d6, "");
                                        b.a((CollectedMusicList) d6);
                                        b bVar3 = this.f140466a.this$0;
                                        Object d7 = iVar.d();
                                        l.b(d7, "");
                                        List<Music> list2 = ((CollectedMusicList) d7).items;
                                        l.b(list2, "");
                                        ArrayList arrayList3 = new ArrayList(n.a((Iterable) list2, 10));
                                        Iterator<T> it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            arrayList3.add(it2.next().convertToMusicModel());
                                        }
                                        bVar3.a(n.g((Collection) arrayList3));
                                        aa.k kVar3 = this.f140466a.this$0.f140455a;
                                        if (kVar3 == null) {
                                            return null;
                                        }
                                        kVar3.a(this.f140466a.this$0.f140457c, this.f140466a.this$0.f140461g);
                                        return z.f158842a;
                                    }
                                }
                                this.f140466a.this$0.f140457c.clear();
                                aa.k kVar4 = this.f140466a.this$0.f140455a;
                                if (kVar4 == null) {
                                    return null;
                                }
                                kVar4.a();
                                return z.f158842a;
                            } else {
                                this.f140466a.this$0.f140457c.clear();
                                aa.k kVar5 = this.f140466a.this$0.f140455a;
                                if (kVar5 == null) {
                                    return null;
                                }
                                kVar5.a();
                                return z.f158842a;
                            }
                        }
                    });
                }
                this.this$0.f140458d = false;
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f140467a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f140468b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f140469c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f140470d = 12;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f140471e;

        static {
            Covode.recordClassIndex(91755);
        }

        e(h.c.d dVar, b bVar, int i2, int i3) {
            this.f140467a = dVar;
            this.f140468b = bVar;
            this.f140469c = i2;
            this.f140471e = i3;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            l.b(iVar, "");
            if (iVar.c() || !iVar.a()) {
                if (this.f140468b.f140458d) {
                    CollectedMusicList a2 = b.a();
                    if (a2 != null) {
                        a2.setHasMore(false);
                    }
                    this.f140467a.resumeWith(q.m223constructorimpl(a2));
                } else {
                    this.f140467a.resumeWith(q.m223constructorimpl(null));
                }
            } else if (iVar.d() != null) {
                this.f140467a.resumeWith(q.m223constructorimpl(iVar.d()));
                if (this.f140469c == 0) {
                    Object d2 = iVar.d();
                    l.b(d2, "");
                    b.a((CollectedMusicList) d2);
                }
            } else {
                this.f140467a.resumeWith(q.m223constructorimpl(null));
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ int $soundPageScene;
        int label;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(91756);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, int i2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
            this.$soundPageScene = i2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new f(this.this$0, this.$soundPageScene, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((f) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                b bVar = this.this$0;
                int i3 = bVar.f140460f;
                int i4 = this.$soundPageScene;
                this.label = 1;
                h hVar = new h(h.c.a.b.a(this));
                b.i<CollectedMusicList> a2 = MusicService.m().a(i3, i4);
                if (a2 != null) {
                    a2.a(new e(hVar, bVar, i3, i4));
                }
                obj = hVar.a();
                if (obj == h.c.a.a.COROUTINE_SUSPENDED) {
                    l.d(this, "");
                }
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CollectedMusicList collectedMusicList = (CollectedMusicList) obj;
            if (collectedMusicList != null) {
                this.this$0.f140460f = collectedMusicList.cursor;
                this.this$0.f140461g = collectedMusicList.isHasMore();
                if (collectedMusicList.items != null && collectedMusicList.items.size() > 0) {
                    List<Music> list = collectedMusicList.items;
                    l.b(list, "");
                    ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().convertToMusicModel());
                    }
                    this.this$0.f140457c.addAll(arrayList);
                }
                aa.k kVar = this.this$0.f140455a;
                if (kVar != null) {
                    kVar.a(this.this$0.f140457c, this.this$0.f140461g);
                }
            } else {
                aa.k kVar2 = this.this$0.f140455a;
                if (kVar2 != null) {
                    kVar2.a(this.this$0.f140457c, false);
                }
            }
            this.this$0.f140459e = true;
            return z.f158842a;
        }
    }

    public final void a(int i2) {
        this.f140458d = true;
        this.f140460f = 0;
        bz unused = i.a(bs.f159054a, null, null, new d(this, i2, null), 3);
    }

    public static void a(String str, boolean z, aa.j jVar) {
        l.d(str, "");
        l.d(jVar, "");
        f140453h.f140456b = jVar;
        MusicService.m().a(str, z ? 1 : 0).a(new c(z, jVar), b.i.f4826c, null);
    }
}
