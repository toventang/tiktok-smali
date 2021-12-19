package com.ss.android.ugc.aweme.sticker.repository.internals.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.repository.a.j;
import com.ss.android.ugc.aweme.sticker.repository.a.q;
import com.ss.android.ugc.aweme.sticker.repository.a.r;
import com.ss.android.ugc.aweme.sticker.repository.internals.e.f;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import f.a.t;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class b implements r {

    /* renamed from: a  reason: collision with root package name */
    public final f.a.l.b<List<com.ss.android.ugc.aweme.sticker.repository.d.a.a>> f135579a;

    /* renamed from: b  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.sticker.repository.d.a.a> f135580b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final h<j> f135581c;

    static {
        Covode.recordClassIndex(88612);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.q
    public final q.a a() {
        return new a();
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.r
    public final t<List<com.ss.android.ugc.aweme.sticker.repository.d.a.a>> b() {
        t<List<com.ss.android.ugc.aweme.sticker.repository.d.a.a>> c2 = this.f135579a.c();
        l.b(c2, "");
        return c2;
    }

    final class a implements q.a {

        /* renamed from: b  reason: collision with root package name */
        private final List<f> f135583b = new ArrayList();

        static {
            Covode.recordClassIndex(88613);
        }

        @Override // com.ss.android.ugc.aweme.sticker.repository.a.q.a
        public final void a() {
            Iterator<T> it = this.f135583b.iterator();
            while (it.hasNext()) {
                it.next().a(b.this.f135580b);
            }
            b.this.f135579a.onNext(b.this.f135580b);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // com.ss.android.ugc.aweme.sticker.repository.a.q.a
        public final void a(com.ss.android.ugc.aweme.sticker.repository.d.a.a aVar) {
            l.d(aVar, "");
            this.f135583b.add(new f.a(aVar));
        }

        @Override // com.ss.android.ugc.aweme.sticker.repository.a.q.a
        public final void b(com.ss.android.ugc.aweme.sticker.repository.d.a.a aVar) {
            l.d(aVar, "");
            this.f135583b.add(new f.b(aVar));
        }

        @Override // com.ss.android.ugc.aweme.sticker.repository.a.q.a
        public final void a(h.f.a.b<? super com.ss.android.ugc.aweme.sticker.repository.d.a.a, Boolean> bVar) {
            l.d(bVar, "");
            this.f135583b.add(new f.c(bVar));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(h<? extends j> hVar) {
        l.d(hVar, "");
        this.f135581c = hVar;
        f.a.l.b<List<com.ss.android.ugc.aweme.sticker.repository.d.a.a>> bVar = new f.a.l.b<>();
        l.b(bVar, "");
        this.f135579a = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.b$b  reason: collision with other inner class name */
    static final class C3533b extends m implements h.f.a.b<Effect, Boolean> {
        final /* synthetic */ List $filters;
        final /* synthetic */ String $targetCategory;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(88614);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3533b(b bVar, String str, List list) {
            super(1);
            this.this$0 = bVar;
            this.$targetCategory = str;
            this.$filters = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Effect effect) {
            boolean z;
            Effect effect2 = effect;
            l.d(effect2, "");
            String str = this.$targetCategory;
            List list = this.$filters;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((com.ss.android.ugc.aweme.sticker.repository.d.a.a) it.next()).b(str, effect2)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                return Boolean.valueOf(z);
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.q
    public final void a(String str, List<Effect> list) {
        List<com.ss.android.ugc.aweme.sticker.repository.d.a.a> list2;
        String str2 = "";
        l.d(list, str2);
        if (str != null) {
            str2 = str;
        }
        List<com.ss.android.ugc.aweme.sticker.repository.d.a.a> list3 = this.f135580b;
        com.ss.android.ugc.aweme.sticker.repository.a.f fVar = this.f135581c.getValue().a().get(str);
        if (fVar == null || (list2 = fVar.c()) == null) {
            list2 = z.INSTANCE;
        }
        n.a((List) list, (h.f.a.b) new C3533b(this, str2, n.d((Collection) list3, (Iterable) list2)));
    }
}
