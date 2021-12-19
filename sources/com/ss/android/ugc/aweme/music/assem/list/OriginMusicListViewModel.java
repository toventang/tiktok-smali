package com.ss.android.ugc.aweme.music.assem.list;

import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.OriginalMusicList;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
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

public final class OriginMusicListViewModel extends AssemListViewModel<s, com.ss.android.ugc.aweme.music.assem.list.cell.d, a> implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: k  reason: collision with root package name */
    public PinnedMusicList f111154k;

    /* renamed from: l  reason: collision with root package name */
    final List<Music> f111155l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public boolean f111156m;
    public boolean n;
    public final com.bytedance.assem.arch.a.a<r> o;
    private volatile int p;

    static {
        Covode.recordClassIndex(71348);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(34, new org.greenrobot.eventbus.g(OriginMusicListViewModel.class, "onAntiCrawlerEvent", com.ss.android.ugc.aweme.base.d.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ OriginMusicListViewModel this$0;

        static {
            Covode.recordClassIndex(71353);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(OriginMusicListViewModel originMusicListViewModel) {
            super(0);
            this.this$0 = originMusicListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            this.this$0.f111156m = true;
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ com.bytedance.assem.arch.viewModel.j f() {
        return new s();
    }

    private static boolean n() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private final boolean p() {
        PinnedMusicList pinnedMusicList = this.f111154k;
        if (pinnedMusicList == null || pinnedMusicList.getAvalibleCapicity() <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.music.assem.list.cell.f m() {
        if (p()) {
            return com.ss.android.ugc.aweme.music.assem.list.cell.f.ENABLE_PINNED;
        }
        return com.ss.android.ugc.aweme.music.assem.list.cell.f.DISABLE_PINNED;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        EventBus.a().b(this);
    }

    private static boolean o() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean n2 = n();
        com.ss.android.ugc.aweme.lancet.j.f107229h = n2;
        return n2;
    }

    public final String j() {
        com.ss.android.ugc.aweme.music.assem.b bVar = (com.ss.android.ugc.aweme.music.assem.b) com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.music.assem.h.class));
        if (bVar != null) {
            return bVar.f111133a;
        }
        return null;
    }

    public final String k() {
        com.ss.android.ugc.aweme.music.assem.b bVar = (com.ss.android.ugc.aweme.music.assem.b) com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.music.assem.h.class));
        if (bVar != null) {
            return bVar.f111134b;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void c() {
        super.c();
        AssemViewModel.a(this, t.f111264a, null, new b(this), new d(this), new c(this), 2);
        EventBus.a(EventBus.a(), this);
    }

    public final void l() {
        com.bytedance.ies.ugc.appcontext.d.a();
        if (!o()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.de8).a();
            a((h.f.a.b) i.f111163a);
        } else if (!TextUtils.isEmpty(j()) && !this.f111156m) {
            this.f111156m = true;
            g();
            a((h.f.a.b) j.f111164a);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<com.bytedance.ext_power_list.l, z> {
        final /* synthetic */ OriginMusicListViewModel this$0;

        static {
            Covode.recordClassIndex(71352);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(OriginMusicListViewModel originMusicListViewModel) {
            super(1);
            this.this$0 = originMusicListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ext_power_list.l lVar) {
            h.f.b.l.d(lVar, "");
            this.this$0.f111156m = false;
            return z.f158842a;
        }
    }

    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OriginMusicListViewModel f111160a;

        static {
            Covode.recordClassIndex(71356);
        }

        public g(OriginMusicListViewModel originMusicListViewModel) {
            this.f111160a = originMusicListViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f111160a.a((h.f.a.b) AnonymousClass1.f111161a);
            this.f111160a.n = false;
        }
    }

    public static final class m<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OriginMusicListViewModel f111167a;

        static {
            Covode.recordClassIndex(71363);
        }

        public m(OriginMusicListViewModel originMusicListViewModel) {
            this.f111167a = originMusicListViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f111167a.a((h.f.a.b) AnonymousClass1.f111168a);
            this.f111167a.n = false;
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
            Covode.recordClassIndex(71349);
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
        final /* synthetic */ OriginMusicListViewModel this$0;

        static {
            Covode.recordClassIndex(71350);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(OriginMusicListViewModel originMusicListViewModel) {
            super(1);
            this.this$0 = originMusicListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            h.f.b.l.d(th, "");
            this.this$0.f111156m = false;
            this.this$0.a((h.f.a.b) AnonymousClass1.f111157a);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.b<s, s> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f111163a = new i();

        static {
            Covode.recordClassIndex(71359);
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
        public static final j f111164a = new j();

        static {
            Covode.recordClassIndex(71360);
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

    static final class q extends h.f.b.m implements h.f.a.b<s, s> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f111172a = new q();

        static {
            Covode.recordClassIndex(71368);
        }

        q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ s invoke(s sVar) {
            s sVar2 = sVar;
            h.f.b.l.d(sVar2, "");
            return s.a(sVar2, false, null, null, new com.bytedance.assem.arch.extensions.a(false), null, null, 55);
        }
    }

    public OriginMusicListViewModel(com.bytedance.assem.arch.a.a<r> aVar) {
        h.f.b.l.d(aVar, "");
        this.o = aVar;
    }

    private final PinnedMusicList a(String str) {
        try {
            return this.o.a().a(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return new PinnedMusicList();
        }
    }

    @r
    public final void onAntiCrawlerEvent(com.ss.android.ugc.aweme.base.d.a aVar) {
        h.f.b.l.d(aVar, "");
        String str = aVar.f68097a;
        if (str != null && h.m.p.a((CharSequence) str, (CharSequence) "/aweme/v1/original/music/list/?", false)) {
            EventBus.a().d(aVar);
            l();
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.b<s, s> {
        final /* synthetic */ OriginMusicListViewModel this$0;

        static {
            Covode.recordClassIndex(71354);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(OriginMusicListViewModel originMusicListViewModel) {
            super(1);
            this.this$0 = originMusicListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ s invoke(s sVar) {
            int i2;
            List<Music> musicList;
            s sVar2 = sVar;
            h.f.b.l.d(sVar2, "");
            com.ss.android.ugc.aweme.music.q qVar = com.ss.android.ugc.aweme.music.q.FULL;
            PinnedMusicList pinnedMusicList = this.this$0.f111154k;
            if (pinnedMusicList == null || (musicList = pinnedMusicList.getMusicList()) == null) {
                i2 = 3;
            } else {
                i2 = musicList.size();
            }
            return s.a(sVar2, false, null, new com.bytedance.assem.arch.extensions.a(new com.ss.android.ugc.aweme.music.p(true, qVar, i2)), null, null, null, 59);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<s, s> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f111162a = new h();

        static {
            Covode.recordClassIndex(71358);
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
            return s.a(sVar2, false, null, new com.bytedance.assem.arch.extensions.a(new com.ss.android.ugc.aweme.music.p(true, com.ss.android.ugc.aweme.music.q.SUCCESS)), new com.bytedance.assem.arch.extensions.a(true), null, null, 51);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<s, s> {
        final /* synthetic */ ArrayList $musicModelList;

        static {
            Covode.recordClassIndex(71361);
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

    static final class n extends h.f.b.m implements h.f.a.b<s, s> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f111169a = new n();

        static {
            Covode.recordClassIndex(71365);
        }

        n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ s invoke(s sVar) {
            s sVar2 = sVar;
            h.f.b.l.d(sVar2, "");
            return s.a(sVar2, false, null, new com.bytedance.assem.arch.extensions.a(new com.ss.android.ugc.aweme.music.p(false, com.ss.android.ugc.aweme.music.q.SUCCESS)), new com.bytedance.assem.arch.extensions.a(false), null, null, 51);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<s, s> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f111170a = new o();

        static {
            Covode.recordClassIndex(71366);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ s invoke(s sVar) {
            s sVar2 = sVar;
            h.f.b.l.d(sVar2, "");
            return s.a(sVar2, false, null, new com.bytedance.assem.arch.extensions.a(new com.ss.android.ugc.aweme.music.p(false, com.ss.android.ugc.aweme.music.q.SUCCESS)), null, null, null, 59);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<s, s> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f111171a = new p();

        static {
            Covode.recordClassIndex(71367);
        }

        p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ s invoke(s sVar) {
            s sVar2 = sVar;
            h.f.b.l.d(sVar2, "");
            return s.a(sVar2, false, null, new com.bytedance.assem.arch.extensions.a(new com.ss.android.ugc.aweme.music.p(false, com.ss.android.ugc.aweme.music.q.SUCCESS)), null, null, null, 59);
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

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object a(h.c.d<? super com.bytedance.ies.powerlist.page.f<a>> dVar) {
        this.p++;
        return a(new a(this.p, j(), k(), 0, true));
    }

    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OriginMusicListViewModel f111158a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.music.assem.list.cell.d f111159b;

        static {
            Covode.recordClassIndex(71355);
        }

        public f(OriginMusicListViewModel originMusicListViewModel, com.ss.android.ugc.aweme.music.assem.list.cell.d dVar) {
            this.f111158a = originMusicListViewModel;
            this.f111159b = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<Music> musicList;
            PinnedMusicList pinnedMusicList;
            this.f111158a.n = false;
            OriginMusicListViewModel originMusicListViewModel = this.f111158a;
            com.ss.android.ugc.aweme.music.assem.list.cell.d dVar = this.f111159b;
            PinnedMusicList pinnedMusicList2 = originMusicListViewModel.f111154k;
            if ((pinnedMusicList2 == null || pinnedMusicList2.getMusicList() == null) && (pinnedMusicList = originMusicListViewModel.f111154k) != null) {
                pinnedMusicList.setMusicList(new ArrayList());
            }
            PinnedMusicList pinnedMusicList3 = originMusicListViewModel.f111154k;
            if (pinnedMusicList3 != null) {
                List<Music> musicList2 = pinnedMusicList3.getMusicList();
                if (musicList2 != null) {
                    musicList2.add(0, OriginMusicListViewModel.a(dVar.f111239a));
                }
                pinnedMusicList3.setAvalibleCapicity(pinnedMusicList3.getAvalibleCapicity() - 1);
            }
            ArrayList arrayList = new ArrayList();
            PinnedMusicList pinnedMusicList4 = originMusicListViewModel.f111154k;
            if (!(pinnedMusicList4 == null || (musicList = pinnedMusicList4.getMusicList()) == null)) {
                Iterator<T> it = musicList.iterator();
                while (it.hasNext()) {
                    MusicModel convertToMusicModel = it.next().convertToMusicModel();
                    h.f.b.l.b(convertToMusicModel, "");
                    arrayList.add(new com.ss.android.ugc.aweme.music.assem.list.cell.d(convertToMusicModel, com.ss.android.ugc.aweme.music.assem.list.cell.f.PINNED));
                }
            }
            for (T t : originMusicListViewModel.f111155l) {
                if (!originMusicListViewModel.a((Music) t)) {
                    MusicModel convertToMusicModel2 = t.convertToMusicModel();
                    h.f.b.l.b(convertToMusicModel2, "");
                    arrayList.add(new com.ss.android.ugc.aweme.music.assem.list.cell.d(convertToMusicModel2, originMusicListViewModel.m()));
                }
            }
            originMusicListViewModel.a((Collection) arrayList);
            originMusicListViewModel.a((h.f.a.b) h.f111162a);
        }
    }

    public static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OriginMusicListViewModel f111165a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.music.assem.list.cell.d f111166b;

        static {
            Covode.recordClassIndex(71362);
        }

        public l(OriginMusicListViewModel originMusicListViewModel, com.ss.android.ugc.aweme.music.assem.list.cell.d dVar) {
            this.f111165a = originMusicListViewModel;
            this.f111166b = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Integer num;
            List<Music> musicList;
            List<Music> musicList2;
            this.f111165a.n = false;
            OriginMusicListViewModel originMusicListViewModel = this.f111165a;
            Music a2 = OriginMusicListViewModel.a(this.f111166b.f111239a);
            PinnedMusicList pinnedMusicList = originMusicListViewModel.f111154k;
            if (pinnedMusicList == null || (musicList2 = pinnedMusicList.getMusicList()) == null) {
                num = null;
            } else {
                num = Integer.valueOf(musicList2.indexOf(a2));
            }
            PinnedMusicList pinnedMusicList2 = originMusicListViewModel.f111154k;
            if (pinnedMusicList2 != null) {
                List<Music> musicList3 = pinnedMusicList2.getMusicList();
                if (musicList3 != null) {
                    musicList3.remove(a2);
                }
                pinnedMusicList2.setAvalibleCapicity(pinnedMusicList2.getAvalibleCapicity() + 1);
            }
            ArrayList<T> arrayList = new ArrayList();
            PinnedMusicList pinnedMusicList3 = originMusicListViewModel.f111154k;
            if (!(pinnedMusicList3 == null || (musicList = pinnedMusicList3.getMusicList()) == null)) {
                Iterator<T> it = musicList.iterator();
                while (it.hasNext()) {
                    MusicModel convertToMusicModel = it.next().convertToMusicModel();
                    h.f.b.l.b(convertToMusicModel, "");
                    arrayList.add(new com.ss.android.ugc.aweme.music.assem.list.cell.d(convertToMusicModel, com.ss.android.ugc.aweme.music.assem.list.cell.f.PINNED));
                }
            }
            for (T t : originMusicListViewModel.f111155l) {
                if (!originMusicListViewModel.a((Music) t)) {
                    MusicModel convertToMusicModel2 = t.convertToMusicModel();
                    h.f.b.l.b(convertToMusicModel2, "");
                    arrayList.add(new com.ss.android.ugc.aweme.music.assem.list.cell.d(convertToMusicModel2, originMusicListViewModel.m()));
                }
            }
            ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) arrayList, 10));
            for (T t2 : arrayList) {
                arrayList2.add(t2.f111239a.getMusicId());
            }
            if (num != null && num.intValue() == 0) {
                originMusicListViewModel.a((h.f.a.b) n.f111169a);
            } else {
                originMusicListViewModel.a((h.f.a.b) o.f111170a);
            }
            originMusicListViewModel.a((h.f.a.b) p.f111171a);
            originMusicListViewModel.a((Collection) arrayList);
        }
    }

    private final com.bytedance.ies.powerlist.page.f<a> a(a aVar) {
        PinnedMusicList pinnedMusicList;
        List<Music> musicList;
        if (in.d()) {
            return f.a.a(h.a.z.INSTANCE);
        }
        try {
            if (aVar.f111173a == this.p && aVar.f111178f) {
                this.f111154k = a(aVar.f111175c);
                this.f111155l.clear();
            }
            OriginalMusicList a2 = this.o.a().a(aVar.f111174b, aVar.f111175c, aVar.f111176d, aVar.f111177e);
            if (a2 == null) {
                return f.a.a(h.a.z.INSTANCE);
            }
            ArrayList arrayList = new ArrayList();
            if (aVar.f111173a == this.p && aVar.f111178f && (pinnedMusicList = this.f111154k) != null && (musicList = pinnedMusicList.getMusicList()) != null) {
                Iterator<T> it = musicList.iterator();
                while (it.hasNext()) {
                    MusicModel convertToMusicModel = it.next().convertToMusicModel();
                    h.f.b.l.b(convertToMusicModel, "");
                    arrayList.add(new com.ss.android.ugc.aweme.music.assem.list.cell.d(convertToMusicModel, com.ss.android.ugc.aweme.music.assem.list.cell.f.PINNED));
                }
            }
            List<Music> list = a2.musicList;
            if (list != null) {
                for (T t : list) {
                    if (t != null) {
                        if (aVar.f111173a == this.p) {
                            this.f111155l.add(t);
                        }
                        if (!a((Music) t)) {
                            MusicModel convertToMusicModel2 = t.convertToMusicModel();
                            h.f.b.l.b(convertToMusicModel2, "");
                            arrayList.add(new com.ss.android.ugc.aweme.music.assem.list.cell.d(convertToMusicModel2, m()));
                        }
                    }
                }
            }
            if (aVar.f111173a == this.p && aVar.f111178f) {
                a((h.f.a.b) new k(arrayList));
            }
            if (a2.hasMore) {
                return f.a.a(null, new a(aVar.f111173a, aVar.f111174b, aVar.f111175c, a2.cursor, false), arrayList, 1);
            }
            return f.a.a(arrayList);
        } catch (Exception e2) {
            e2.printStackTrace();
            return f.a.a(e2);
        }
    }

    public final void a(PinnedMusicList pinnedMusicList) {
        int i2;
        int i3;
        com.ss.android.ugc.aweme.music.assem.list.cell.f fVar;
        List<Music> musicList;
        List<Music> musicList2;
        List<Music> musicList3;
        h.f.b.l.d(pinnedMusicList, "");
        List<Music> musicList4 = pinnedMusicList.getMusicList();
        boolean z = false;
        if (musicList4 != null) {
            i2 = musicList4.size();
        } else {
            i2 = 0;
        }
        PinnedMusicList pinnedMusicList2 = this.f111154k;
        if (pinnedMusicList2 == null || (musicList3 = pinnedMusicList2.getMusicList()) == null) {
            i3 = 0;
        } else {
            i3 = musicList3.size();
        }
        if (i2 == i3) {
            List<Music> musicList5 = pinnedMusicList.getMusicList();
            if (musicList5 != null) {
                for (T t : musicList5) {
                    PinnedMusicList pinnedMusicList3 = this.f111154k;
                    if (!(pinnedMusicList3 == null || (musicList2 = pinnedMusicList3.getMusicList()) == null || musicList2.contains(t))) {
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f111154k = pinnedMusicList;
        ArrayList arrayList = new ArrayList();
        PinnedMusicList pinnedMusicList4 = this.f111154k;
        if (!(pinnedMusicList4 == null || (musicList = pinnedMusicList4.getMusicList()) == null)) {
            Iterator<T> it = musicList.iterator();
            while (it.hasNext()) {
                MusicModel convertToMusicModel = it.next().convertToMusicModel();
                h.f.b.l.b(convertToMusicModel, "");
                arrayList.add(new com.ss.android.ugc.aweme.music.assem.list.cell.d(convertToMusicModel, com.ss.android.ugc.aweme.music.assem.list.cell.f.PINNED));
            }
        }
        for (T t2 : this.f111155l) {
            if (!a((Music) t2)) {
                MusicModel convertToMusicModel2 = t2.convertToMusicModel();
                h.f.b.l.b(convertToMusicModel2, "");
                if (p()) {
                    fVar = com.ss.android.ugc.aweme.music.assem.list.cell.f.ENABLE_PINNED;
                } else {
                    fVar = com.ss.android.ugc.aweme.music.assem.list.cell.f.DISABLE_PINNED;
                }
                arrayList.add(new com.ss.android.ugc.aweme.music.assem.list.cell.d(convertToMusicModel2, fVar));
            }
        }
        a((Collection) arrayList);
        a((h.f.a.b) q.f111172a);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Music music) {
        List<Music> musicList;
        PinnedMusicList pinnedMusicList = this.f111154k;
        boolean z = false;
        if (!(pinnedMusicList == null || (musicList = pinnedMusicList.getMusicList()) == null)) {
            Iterator<T> it = musicList.iterator();
            while (it.hasNext()) {
                if (it.next().getId() == music.getId()) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.c.d] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object a(a aVar, h.c.d<? super com.bytedance.ies.powerlist.page.f<a>> dVar) {
        return a(aVar);
    }
}
