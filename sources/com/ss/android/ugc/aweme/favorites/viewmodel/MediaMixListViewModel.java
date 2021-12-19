package com.ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.arch.JediBaseViewModel;
import com.ss.android.ugc.aweme.base.arch.g;
import com.ss.android.ugc.aweme.favorites.api.MixCollectionApi;
import com.ss.android.ugc.aweme.feed.model.MixStruct;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class MediaMixListViewModel extends JediBaseViewModel<MediaMixState> {

    /* renamed from: m  reason: collision with root package name */
    public static final a f90954m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<Long> f90955a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<String> f90956b;

    /* renamed from: c  reason: collision with root package name */
    public int f90957c;

    /* renamed from: d  reason: collision with root package name */
    public String f90958d;

    /* renamed from: e  reason: collision with root package name */
    public String f90959e;

    /* renamed from: f  reason: collision with root package name */
    public final MixCollectionApi f90960f;

    /* renamed from: g  reason: collision with root package name */
    public final Set<String> f90961g = new LinkedHashSet();

    /* renamed from: k  reason: collision with root package name */
    public final List<String> f90962k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ListMiddleware<MediaMixState, MixStruct, g> f90963l = new ListMiddleware<>(new b(this), new c(this), d.f90971a, e.f90972a);

    static {
        Covode.recordClassIndex(57169);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57170);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.lifecycle.ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        super.onCleared();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new MediaMixState(null, null, null, null, 15, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bg_() {
        super.bg_();
        this.f90963l.a(c.f91006a, f.f90973a);
        a(this.f90963l);
    }

    public MediaMixListViewModel() {
        String str = Api.f66569d;
        l.b(str, "");
        this.f90960f = (MixCollectionApi) com.bytedance.ies.ugc.aweme.network.ext.a.a().a(str).a(MixCollectionApi.class);
    }

    static final class b extends m implements h.f.a.b<MediaMixState, t<p<? extends List<? extends MixStruct>, ? extends g>>> {
        final /* synthetic */ MediaMixListViewModel this$0;

        final /* synthetic */ class a implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ h.f.a.b f90967a;

            static {
                Covode.recordClassIndex(57175);
            }

            a(h.f.a.b bVar) {
                this.f90967a = bVar;
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                return this.f90967a.invoke(obj);
            }
        }

        static {
            Covode.recordClassIndex(57171);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(MediaMixListViewModel mediaMixListViewModel) {
            super(1);
            this.this$0 = mediaMixListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends MixStruct>, ? extends g>> invoke(MediaMixState mediaMixState) {
            String str;
            t<R> d2;
            String str2;
            l.d(mediaMixState, "");
            if (this.this$0.f90957c == 1) {
                MixCollectionApi mixCollectionApi = this.this$0.f90960f;
                ArrayList<Long> arrayList = this.this$0.f90955a;
                if (arrayList != null) {
                    str2 = arrayList.toString();
                } else {
                    str2 = null;
                }
                d2 = mixCollectionApi.getSearchMixCollection(str2).d(new a(com.ss.android.ugc.aweme.favorites.i.c.a(AnonymousClass1.f90964a)));
            } else if (this.this$0.f90957c == 2) {
                MixCollectionApi mixCollectionApi2 = this.this$0.f90960f;
                String str3 = this.this$0.f90958d;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = this.this$0.f90959e;
                if (str4 == null) {
                    str4 = "";
                }
                d2 = mixCollectionApi2.getProfileVideoMixList(str3, str4, 15, 0).d(new a(com.ss.android.ugc.aweme.favorites.i.c.a(AnonymousClass2.f90965a)));
            } else {
                MixCollectionApi mixCollectionApi3 = this.this$0.f90960f;
                ArrayList<String> arrayList2 = this.this$0.f90956b;
                if (arrayList2 == null || (str = arrayList2.toString()) == null) {
                    str = "";
                }
                l.b(str, "");
                d2 = mixCollectionApi3.getMixCollection(15, 0, str).d(new a(com.ss.android.ugc.aweme.favorites.i.c.a(AnonymousClass3.f90966a)));
            }
            l.b(d2, "");
            return d2;
        }
    }

    static final class c extends m implements h.f.a.b<MediaMixState, t<p<? extends List<? extends MixStruct>, ? extends g>>> {
        final /* synthetic */ MediaMixListViewModel this$0;

        static {
            Covode.recordClassIndex(57176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(MediaMixListViewModel mediaMixListViewModel) {
            super(1);
            this.this$0 = mediaMixListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends MixStruct>, ? extends g>> invoke(MediaMixState mediaMixState) {
            t<R> d2;
            String str;
            MediaMixState mediaMixState2 = mediaMixState;
            l.d(mediaMixState2, "");
            if (this.this$0.f90957c == 1) {
                MixCollectionApi mixCollectionApi = this.this$0.f90960f;
                ArrayList<Long> arrayList = this.this$0.f90955a;
                if (arrayList != null) {
                    str = arrayList.toString();
                } else {
                    str = null;
                }
                d2 = mixCollectionApi.getSearchMixCollection(str).d(new b.a(com.ss.android.ugc.aweme.favorites.i.c.a(AnonymousClass1.f90968a)));
            } else if (this.this$0.f90957c == 2) {
                MixCollectionApi mixCollectionApi2 = this.this$0.f90960f;
                String str2 = this.this$0.f90958d;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = this.this$0.f90959e;
                if (str3 == null) {
                    str3 = "";
                }
                d2 = mixCollectionApi2.getProfileVideoMixList(str2, str3, 15, mediaMixState2.getListState().getPayload().f67988c).d(new b.a(com.ss.android.ugc.aweme.favorites.i.c.a(AnonymousClass2.f90969a)));
            } else {
                d2 = this.this$0.f90960f.getMixCollection(15, mediaMixState2.getListState().getPayload().f67988c, "").d(new b.a(com.ss.android.ugc.aweme.favorites.i.c.a(AnonymousClass3.f90970a)));
            }
            l.b(d2, "");
            return d2;
        }
    }

    static final class f extends m implements h.f.a.m<MediaMixState, ListState<MixStruct, g>, MediaMixState> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f90973a = new f();

        static {
            Covode.recordClassIndex(57182);
        }

        f() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ MediaMixState invoke(MediaMixState mediaMixState, ListState<MixStruct, g> listState) {
            MediaMixState mediaMixState2 = mediaMixState;
            ListState<MixStruct, g> listState2 = listState;
            l.d(mediaMixState2, "");
            l.d(listState2, "");
            return MediaMixState.copy$default(mediaMixState2, null, null, null, listState2, 7, null);
        }
    }

    static final class d extends m implements h.f.a.m<List<? extends MixStruct>, List<? extends MixStruct>, List<? extends MixStruct>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f90971a = new d();

        static {
            Covode.recordClassIndex(57180);
        }

        d() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ List<? extends MixStruct> invoke(List<? extends MixStruct> list, List<? extends MixStruct> list2) {
            List<? extends MixStruct> list3 = list2;
            l.d(list, "");
            l.d(list3, "");
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (T t : list3) {
                if (hashSet.add(t.mixId)) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    static final class e extends m implements h.f.a.m<List<? extends MixStruct>, List<? extends MixStruct>, List<? extends MixStruct>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f90972a = new e();

        static {
            Covode.recordClassIndex(57181);
        }

        e() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ List<? extends MixStruct> invoke(List<? extends MixStruct> list, List<? extends MixStruct> list2) {
            List<? extends MixStruct> list3 = list;
            List<? extends MixStruct> list4 = list2;
            l.d(list3, "");
            l.d(list4, "");
            List d2 = n.d((Collection) list3, (Iterable) list4);
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : d2) {
                if (hashSet.add(((MixStruct) obj).mixId)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }
}
