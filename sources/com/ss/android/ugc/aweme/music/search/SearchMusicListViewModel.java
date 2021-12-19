package com.ss.android.ugc.aweme.music.search;

import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.music.assem.list.s;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.OriginalMusicList;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.ss.android.ugc.aweme.music.q;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;

public final class SearchMusicListViewModel extends AssemListViewModel<s, com.ss.android.ugc.aweme.music.assem.list.cell.d, a> implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: k  reason: collision with root package name */
    final List<Music> f111637k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public String f111638l = "";

    /* renamed from: m  reason: collision with root package name */
    public boolean f111639m;
    public boolean n;
    public final com.bytedance.assem.arch.a.a<r> o;
    private volatile int p;

    static {
        Covode.recordClassIndex(71733);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(34, new org.greenrobot.eventbus.g(SearchMusicListViewModel.class, "onAntiCrawlerEvent", com.ss.android.ugc.aweme.base.d.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ SearchMusicListViewModel this$0;

        static {
            Covode.recordClassIndex(71738);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SearchMusicListViewModel searchMusicListViewModel) {
            super(0);
            this.this$0 = searchMusicListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            this.this$0.f111639m = true;
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ com.bytedance.assem.arch.viewModel.j f() {
        return new s();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        cg.b(this);
    }

    private static boolean n() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private final String m() {
        com.ss.android.ugc.aweme.music.assem.b bVar = (com.ss.android.ugc.aweme.music.assem.b) com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.music.assem.h.class));
        if (bVar != null) {
            return bVar.f111133a;
        }
        return null;
    }

    private static boolean o() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean n2 = n();
        com.ss.android.ugc.aweme.lancet.j.f107229h = n2;
        return n2;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void c() {
        super.c();
        AssemViewModel.a(this, s.f111725a, null, new b(this), new d(this), new c(this), 2);
        cg.a(this);
    }

    public final String j() {
        com.ss.android.ugc.aweme.music.assem.b bVar = (com.ss.android.ugc.aweme.music.assem.b) com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.music.assem.h.class));
        if (bVar != null) {
            return bVar.f111134b;
        }
        return null;
    }

    public final PinnedMusicList k() {
        com.ss.android.ugc.aweme.music.assem.b bVar = (com.ss.android.ugc.aweme.music.assem.b) com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.music.assem.h.class));
        if (bVar != null) {
            return bVar.f111140h;
        }
        return null;
    }

    public final void l() {
        com.bytedance.ies.ugc.appcontext.d.a();
        if (!o()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.de8).a();
            a((h.f.a.b) i.f111646a);
        } else if (!TextUtils.isEmpty(m())) {
            this.f111639m = true;
            g();
            a((h.f.a.b) j.f111647a);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<com.bytedance.ext_power_list.l, z> {
        final /* synthetic */ SearchMusicListViewModel this$0;

        static {
            Covode.recordClassIndex(71737);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SearchMusicListViewModel searchMusicListViewModel) {
            super(1);
            this.this$0 = searchMusicListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ext_power_list.l lVar) {
            h.f.b.l.d(lVar, "");
            this.this$0.f111639m = false;
            return z.f158842a;
        }
    }

    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchMusicListViewModel f111643a;

        static {
            Covode.recordClassIndex(71741);
        }

        public g(SearchMusicListViewModel searchMusicListViewModel) {
            this.f111643a = searchMusicListViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f111643a.a((h.f.a.b) AnonymousClass1.f111644a);
            this.f111643a.n = false;
        }
    }

    public static final class m<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchMusicListViewModel f111651a;

        static {
            Covode.recordClassIndex(71749);
        }

        public m(SearchMusicListViewModel searchMusicListViewModel) {
            this.f111651a = searchMusicListViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f111651a.a((h.f.a.b) AnonymousClass1.f111652a);
            this.f111651a.n = false;
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final void a(com.bytedance.ext_power_list.a<com.ss.android.ugc.aweme.music.assem.list.cell.d> aVar) {
        h.f.b.l.d(aVar, "");
        a((h.f.a.b) new a(aVar));
    }

    static final class a extends h.f.b.m implements h.f.a.b<s, s> {
        final /* synthetic */ com.bytedance.ext_power_list.a $newListState;

        static {
            Covode.recordClassIndex(71734);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(com.bytedance.ext_power_list.a aVar) {
            super(1);
            this.$newListState = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ s invoke(s sVar) {
            s sVar2 = sVar;
            h.f.b.l.d(sVar2, "");
            return s.a(sVar2, false, null, null, null, null, this.$newListState, 31);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ SearchMusicListViewModel this$0;

        static {
            Covode.recordClassIndex(71735);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SearchMusicListViewModel searchMusicListViewModel) {
            super(1);
            this.this$0 = searchMusicListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            h.f.b.l.d(th, "");
            this.this$0.f111639m = false;
            this.this$0.a((h.f.a.b) AnonymousClass1.f111640a);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.b<s, s> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f111646a = new i();

        static {
            Covode.recordClassIndex(71744);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ s invoke(s sVar) {
            s sVar2 = sVar;
            h.f.b.l.d(sVar2, "");
            return s.a(sVar2, true, null, null, null, new com.bytedance.assem.arch.extensions.a(null), null, 46);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.b<s, s> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f111647a = new j();

        static {
            Covode.recordClassIndex(71745);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ s invoke(s sVar) {
            s sVar2 = sVar;
            h.f.b.l.d(sVar2, "");
            return s.a(sVar2, false, null, null, null, null, null, 62);
        }
    }

    public SearchMusicListViewModel(com.bytedance.assem.arch.a.a<r> aVar) {
        h.f.b.l.d(aVar, "");
        this.o = aVar;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object a(h.c.d<? super com.bytedance.ies.powerlist.page.f<a>> dVar) {
        this.p++;
        return a(new a(this.p, j(), this.f111638l, 0, true));
    }

    @r
    public final void onAntiCrawlerEvent(com.ss.android.ugc.aweme.base.d.a aVar) {
        h.f.b.l.d(aVar, "");
        String str = aVar.f68097a;
        if (str != null && p.a((CharSequence) str, (CharSequence) "/aweme/v1/original/music/list/?", false)) {
            EventBus.a().d(aVar);
            l();
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.b<s, s> {
        final /* synthetic */ SearchMusicListViewModel this$0;

        static {
            Covode.recordClassIndex(71739);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(SearchMusicListViewModel searchMusicListViewModel) {
            super(1);
            this.this$0 = searchMusicListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ s invoke(s sVar) {
            int i2;
            List<Music> musicList;
            s sVar2 = sVar;
            h.f.b.l.d(sVar2, "");
            q qVar = q.FULL;
            PinnedMusicList k2 = this.this$0.k();
            if (k2 == null || (musicList = k2.getMusicList()) == null) {
                i2 = 3;
            } else {
                i2 = musicList.size();
            }
            return s.a(sVar2, false, null, new com.bytedance.assem.arch.extensions.a(new com.ss.android.ugc.aweme.music.p(true, qVar, i2)), null, null, null, 59);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<s, s> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f111645a = new h();

        static {
            Covode.recordClassIndex(71743);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ s invoke(s sVar) {
            s sVar2 = sVar;
            h.f.b.l.d(sVar2, "");
            return s.a(sVar2, false, null, new com.bytedance.assem.arch.extensions.a(new com.ss.android.ugc.aweme.music.p(true, q.SUCCESS)), null, null, null, 59);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<s, s> {
        final /* synthetic */ ArrayList $musicModelList;

        static {
            Covode.recordClassIndex(71746);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(ArrayList arrayList) {
            super(1);
            this.$musicModelList = arrayList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ s invoke(s sVar) {
            s sVar2 = sVar;
            h.f.b.l.d(sVar2, "");
            return s.a(sVar2, false, new com.bytedance.assem.arch.extensions.a(Integer.valueOf(this.$musicModelList.size())), null, null, null, null, 61);
        }
    }

    static Music a(MusicModel musicModel) {
        Music convertToMusic = musicModel.convertToMusic();
        h.f.b.l.b(convertToMusic, "");
        convertToMusic.setDuration(convertToMusic.getDuration() / 1000);
        convertToMusic.setShootDuration(Integer.valueOf(convertToMusic.getShootDuration() / 1000));
        convertToMusic.setAuditionDuration(Integer.valueOf(convertToMusic.getAuditionDuration() / 1000));
        return convertToMusic;
    }

    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchMusicListViewModel f111641a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.music.assem.list.cell.d f111642b;

        static {
            Covode.recordClassIndex(71740);
        }

        public f(SearchMusicListViewModel searchMusicListViewModel, com.ss.android.ugc.aweme.music.assem.list.cell.d dVar) {
            this.f111641a = searchMusicListViewModel;
            this.f111642b = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            PinnedMusicList k2;
            this.f111641a.n = false;
            SearchMusicListViewModel searchMusicListViewModel = this.f111641a;
            com.ss.android.ugc.aweme.music.assem.list.cell.d dVar = this.f111642b;
            PinnedMusicList k3 = searchMusicListViewModel.k();
            if ((k3 == null || k3.getMusicList() == null) && (k2 = searchMusicListViewModel.k()) != null) {
                k2.setMusicList(new ArrayList());
            }
            PinnedMusicList k4 = searchMusicListViewModel.k();
            if (k4 != null) {
                List<Music> musicList = k4.getMusicList();
                if (musicList != null) {
                    musicList.add(0, SearchMusicListViewModel.a(dVar.f111239a));
                }
                k4.setAvalibleCapicity(k4.getAvalibleCapicity() - 1);
            }
            ArrayList arrayList = new ArrayList();
            for (T t : searchMusicListViewModel.f111637k) {
                MusicModel convertToMusicModel = t.convertToMusicModel();
                h.f.b.l.b(convertToMusicModel, "");
                arrayList.add(new com.ss.android.ugc.aweme.music.assem.list.cell.d(convertToMusicModel, searchMusicListViewModel.a((Music) t)));
            }
            searchMusicListViewModel.a((Collection) arrayList);
            searchMusicListViewModel.a((h.f.a.b) h.f111645a);
        }
    }

    public static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchMusicListViewModel f111648a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.music.assem.list.cell.d f111649b;

        static {
            Covode.recordClassIndex(71747);
        }

        public l(SearchMusicListViewModel searchMusicListViewModel, com.ss.android.ugc.aweme.music.assem.list.cell.d dVar) {
            this.f111648a = searchMusicListViewModel;
            this.f111649b = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f111648a.a((h.f.a.b) AnonymousClass1.f111650a);
            this.f111648a.n = false;
            SearchMusicListViewModel searchMusicListViewModel = this.f111648a;
            Music a2 = SearchMusicListViewModel.a(this.f111649b.f111239a);
            PinnedMusicList k2 = searchMusicListViewModel.k();
            if (k2 != null) {
                List<Music> musicList = k2.getMusicList();
                if (musicList != null) {
                    musicList.remove(a2);
                }
                k2.setAvalibleCapicity(k2.getAvalibleCapicity() + 1);
            }
            ArrayList arrayList = new ArrayList();
            for (T t : searchMusicListViewModel.f111637k) {
                MusicModel convertToMusicModel = t.convertToMusicModel();
                h.f.b.l.b(convertToMusicModel, "");
                arrayList.add(new com.ss.android.ugc.aweme.music.assem.list.cell.d(convertToMusicModel, searchMusicListViewModel.a((Music) t)));
            }
            searchMusicListViewModel.a((Collection) arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.music.assem.list.cell.f a(Music music) {
        List<Music> musicList;
        PinnedMusicList k2 = k();
        if (!(k2 == null || (musicList = k2.getMusicList()) == null)) {
            Iterator<T> it = musicList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (it.next().getId() == music.getId()) {
                    z = true;
                }
            }
            if (z) {
                return com.ss.android.ugc.aweme.music.assem.list.cell.f.PINNED;
            }
        }
        PinnedMusicList k3 = k();
        if (k3 == null || k3.getAvalibleCapicity() <= 0) {
            return com.ss.android.ugc.aweme.music.assem.list.cell.f.DISABLE_PINNED;
        }
        return com.ss.android.ugc.aweme.music.assem.list.cell.f.ENABLE_PINNED;
    }

    private final com.bytedance.ies.powerlist.page.f<a> a(a aVar) {
        if (in.d()) {
            return f.a.a(h.a.z.INSTANCE);
        }
        String str = aVar.f111655c;
        if (str == null || str.length() == 0 || (!h.f.b.l.a((Object) this.f111638l, (Object) aVar.f111655c))) {
            return f.a.a(h.a.z.INSTANCE);
        }
        try {
            if (aVar.f111653a == this.p && aVar.f111658f) {
                this.f111637k.clear();
            }
            OriginalMusicList a2 = this.o.a().a(aVar.f111654b, aVar.f111655c, aVar.f111656d, aVar.f111657e);
            if (a2 == null) {
                return f.a.a(h.a.z.INSTANCE);
            }
            ArrayList arrayList = new ArrayList();
            List<Music> list = a2.musicList;
            if (list != null) {
                for (T t : list) {
                    if (t != null) {
                        MusicModel convertToMusicModel = t.convertToMusicModel();
                        h.f.b.l.b(convertToMusicModel, "");
                        arrayList.add(new com.ss.android.ugc.aweme.music.assem.list.cell.d(convertToMusicModel, a((Music) t)));
                        if (aVar.f111653a == this.p) {
                            this.f111637k.add(t);
                        }
                    }
                }
            }
            if (aVar.f111653a == this.p && aVar.f111658f) {
                a((h.f.a.b) new k(arrayList));
            }
            if (a2.hasMore) {
                return f.a.a(null, new a(aVar.f111653a, aVar.f111654b, aVar.f111655c, a2.cursor, false), arrayList, 1);
            }
            return f.a.a(arrayList);
        } catch (Exception e2) {
            if (aVar.f111658f) {
                this.f111637k.clear();
            }
            e2.printStackTrace();
            return f.a.a(e2);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.c.d] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object a(a aVar, h.c.d<? super com.bytedance.ies.powerlist.page.f<a>> dVar) {
        return a(aVar);
    }
}
