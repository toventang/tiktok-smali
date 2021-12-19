package com.ss.android.ugc.aweme.discover.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.api.SearchApi;
import com.ss.android.ugc.aweme.discover.helper.ab;
import com.ss.android.ugc.aweme.discover.helper.j;
import com.ss.android.ugc.aweme.discover.helper.s;
import com.ss.android.ugc.aweme.discover.model.CardType;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import com.ss.android.ugc.aweme.discover.model.SearchMusicList;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.h;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class n extends f<SearchMusic, SearchMusicList> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f81282a = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f81283d = 20;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.discover.h.c f81284b = h.f121133a.f().a();

    /* renamed from: c  reason: collision with root package name */
    private j f81285c;

    @Override // com.ss.android.ugc.aweme.discover.j.f
    public final int c() {
        return 1;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50510);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public final class b extends b {

        /* renamed from: b  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.discover.jedi.viewmodel.f f81286b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n f81287c;

        static {
            Covode.recordClassIndex(50511);
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.ugc.aweme.discover.j.b
        public final Object a() {
            return SearchApi.d(this.f81286b);
        }

        public b(n nVar, com.ss.android.ugc.aweme.discover.jedi.viewmodel.f fVar) {
            l.d(fVar, "");
            this.f81287c = nVar;
            this.f81286b = fVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<Integer> {
        final /* synthetic */ SearchMusic $music;

        static {
            Covode.recordClassIndex(50513);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SearchMusic searchMusic) {
            super(0);
            this.$music = searchMusic;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            List<Music> musicList;
            if (this.$music.getCardType() == CardType.TYPE_MUSICIAN.getValue() && (musicList = this.$music.getMusicList()) != null) {
                musicList.size();
            }
            return 1;
        }
    }

    static {
        Covode.recordClassIndex(50509);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null) {
            return false;
        }
        Object obj = this.mData;
        l.b(obj, "");
        if (((SearchMusicList) obj).hasMore) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<Integer, Integer> {
        final /* synthetic */ int $index;

        static {
            Covode.recordClassIndex(50514);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(int i2) {
            super(1);
            this.$index = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Integer num) {
            num.intValue();
            return Integer.valueOf(this.$index + 1);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<Integer, Integer> {
        final /* synthetic */ Music $m;

        static {
            Covode.recordClassIndex(50515);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Music music) {
            super(1);
            this.$m = music;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Integer num) {
            this.$m.getExtraParamFromPretreatment().put("rank", Integer.valueOf(num.intValue()));
            return 1;
        }
    }

    private void a(com.ss.android.ugc.aweme.discover.jedi.viewmodel.f fVar) {
        l.d(fVar, "");
        b bVar = new b(this, fVar);
        bVar.f81229a = fVar.r;
        this.f81247k = bVar;
        com.ss.android.ugc.aweme.base.n.a().a(this.mHandler, bVar, 0);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ List $list;
        final /* synthetic */ int $size;

        static {
            Covode.recordClassIndex(50512);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(int i2, List list) {
            super(1);
            this.$size = i2;
            this.$list = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            if (intValue >= 0 && intValue <= this.$size) {
                SearchMusic searchMusic = new SearchMusic();
                searchMusic.setCardType(CardType.TYPE_USER_NOTE.getValue());
                this.$list.add(intValue, searchMusic);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        String str = "";
        l.d(objArr, str);
        int i2 = 0;
        String a2 = a(objArr);
        if (!isDataEmpty()) {
            Object obj = this.mData;
            l.b(obj, str);
            i2 = ((SearchMusicList) obj).cursor;
        }
        long j2 = (long) i2;
        int i3 = f81283d;
        String str2 = this.q;
        if (str2 != null) {
            str = str2;
        }
        Object obj2 = objArr[3];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int i4 = this.o;
        a(new com.ss.android.ugc.aweme.discover.jedi.viewmodel.f(a2, 0, e(), null, i4, ((Integer) obj2).intValue(), str, this.r, j2, i3, i(), (com.ss.android.ugc.aweme.search.g.b) objArr[4], null, null, null, null, 0, null, null, 1044490));
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        l.d(objArr, "");
        String a2 = a(objArr);
        int i2 = f81283d;
        Object obj = objArr[3];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int i3 = this.o;
        a(new com.ss.android.ugc.aweme.discover.jedi.viewmodel.f(a2, 0, e(), null, i3, ((Integer) obj).intValue(), "", this.r, 0, i2, i(), (com.ss.android.ugc.aweme.search.g.b) objArr[4], null, null, null, null, 0, null, s.a.a().a(), 520202));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchMusicList searchMusicList) {
        boolean z;
        boolean z2;
        super.handleData((SearchApiResult) searchMusicList);
        if (searchMusicList == null) {
            l.b();
        }
        List<SearchMusic> list = searchMusicList.searchMusicList;
        this.mIsNewDataEmpty = com.bytedance.common.utility.collection.b.a((Collection) list);
        boolean z3 = false;
        if (!this.mIsNewDataEmpty) {
            com.ss.android.ugc.aweme.discover.h.c cVar = this.f81284b;
            if (this.mListQueryType == 1 && cVar != null) {
                cVar.b();
            }
            l.b(list, "");
            GlobalDoodleConfig globalDoodleConfig = searchMusicList.globalDoodleConfig;
            if (globalDoodleConfig == null || globalDoodleConfig.getSoundsListType() != 2) {
                z = false;
            } else {
                z = true;
            }
            j jVar = this.f81285c;
            if (z) {
                if (jVar == null) {
                    jVar = new ab();
                    this.f81285c = jVar;
                }
                if (this.mListQueryType == 1) {
                    SearchMusic searchMusic = new SearchMusic();
                    searchMusic.setCardType(CardType.TYPE_TRENDING_SOUNDS_TITLE.getValue());
                    list.add(0, searchMusic);
                    if (jVar == null) {
                        l.b();
                    }
                    jVar.a();
                }
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                SearchMusic searchMusic2 = list.get(i2);
                searchMusic2.setRequestId(this.p);
                searchMusic2.setLogPb(searchMusicList.logPb);
                l.b(searchMusic2, "");
                com.ss.android.ugc.aweme.discover.h.c cVar2 = this.f81284b;
                if (cVar2 != null) {
                    boolean z4 = !searchMusicList.hasMore;
                    if (i2 == size - 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar2.a(z4 & z2, new d(searchMusic2), new e(i2));
                }
                GlobalDoodleConfig globalDoodleConfig2 = searchMusicList.globalDoodleConfig;
                Music music = searchMusic2.getMusic();
                j jVar2 = this.f81285c;
                if (!(music == null || globalDoodleConfig2 == null)) {
                    music.setSoundsListType(globalDoodleConfig2.getSoundsListType());
                    if (jVar2 != null && searchMusic2.getCardType() == CardType.TYPE_NORMAL.getValue()) {
                        jVar2.a(new f(music));
                    }
                }
            }
            com.ss.android.ugc.aweme.discover.h.c cVar3 = this.f81284b;
            if (cVar3 != null) {
                cVar3.a(new c(size, list));
            }
            int i3 = this.mListQueryType;
            if (i3 == 1) {
                this.mData = searchMusicList;
                a_(list);
            } else if (i3 == 4) {
                b(list);
                Object obj = this.mData;
                l.b(obj, "");
                SearchMusicList searchMusicList2 = (SearchMusicList) obj;
                if (searchMusicList.hasMore) {
                    Object obj2 = this.mData;
                    l.b(obj2, "");
                    if (((SearchMusicList) obj2).hasMore) {
                        z3 = true;
                    }
                }
                searchMusicList2.hasMore = z3;
                Object obj3 = this.mData;
                l.b(obj3, "");
                ((SearchMusicList) obj3).cursor = searchMusicList.cursor;
            }
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchMusicList;
                d();
            }
            if (this.mData != null) {
                Object obj4 = this.mData;
                l.b(obj4, "");
                ((SearchMusicList) obj4).hasMore = false;
            }
        }
    }
}
