package com.ss.android.ugc.aweme.music.ui.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.o;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import f.a.d.e;
import f.a.d.g;
import f.a.d.k;
import f.a.e.e.e.at;
import f.a.t;
import f.a.w;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.List;

public final class MusicAwemeListViewModel extends CommonListViewModel<Object, MusicAwemeListState> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f112047f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.music.ui.d.b f112048a = new com.ss.android.ugc.aweme.music.ui.d.b();

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<Object> f112049b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public boolean f112050c;

    /* renamed from: d  reason: collision with root package name */
    public int f112051d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f112052e;

    static {
        Covode.recordClassIndex(72007);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72008);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final h.f.a.b<MusicAwemeListState, t<p<List<Object>, o>>> a() {
        return new d(this);
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final h.f.a.b<MusicAwemeListState, t<p<List<Object>, o>>> b() {
        return new c(this);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new MusicAwemeListState(null, 0, false, null, 15, null);
    }

    public final ArrayList<Object> b(int i2) {
        ArrayList<Object> arrayList = new ArrayList<>();
        if (this.f112049b.size() >= i2) {
            arrayList.addAll(this.f112049b.subList(0, i2));
        } else {
            arrayList.addAll(this.f112049b);
        }
        return arrayList;
    }

    static final class d extends m implements h.f.a.b<MusicAwemeListState, t<p<? extends List<? extends Object>, ? extends o>>> {
        final /* synthetic */ MusicAwemeListViewModel this$0;

        static {
            Covode.recordClassIndex(72017);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(MusicAwemeListViewModel musicAwemeListViewModel) {
            super(1);
            this.this$0 = musicAwemeListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends Object>, ? extends o>> invoke(MusicAwemeListState musicAwemeListState) {
            MusicAwemeListState musicAwemeListState2 = musicAwemeListState;
            l.d(musicAwemeListState2, "");
            t<R> d2 = this.this$0.f112048a.a(musicAwemeListState2.getMusicId(), 0, 20).d(new g(this) {
                /* class com.ss.android.ugc.aweme.music.ui.viewmodel.MusicAwemeListViewModel.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f112063a;

                static {
                    Covode.recordClassIndex(72018);
                }

                {
                    this.f112063a = r1;
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    boolean z;
                    MusicAwemeList musicAwemeList = (MusicAwemeList) obj;
                    l.d(musicAwemeList, "");
                    MusicAwemeListViewModel musicAwemeListViewModel = this.f112063a.this$0;
                    boolean z2 = false;
                    if (musicAwemeList.hasMore == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    musicAwemeListViewModel.f112052e = z;
                    int a2 = com.bytedance.ies.abmock.b.a().a(true, "music_detail_more_sounds", 0);
                    int i2 = a2 - (a2 % 3);
                    if (i2 <= 1) {
                        i2 = 12;
                    }
                    this.f112063a.this$0.f112049b.addAll(musicAwemeList.items);
                    final z.e eVar = new z.e();
                    eVar.element = (T) this.f112063a.this$0.b(i2);
                    this.f112063a.this$0.f112049b.removeAll(eVar.element);
                    this.f112063a.this$0.c(new h.f.a.b<MusicAwemeListState, MusicAwemeListState>() {
                        /* class com.ss.android.ugc.aweme.music.ui.viewmodel.MusicAwemeListViewModel.d.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(72019);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ MusicAwemeListState invoke(MusicAwemeListState musicAwemeListState) {
                            MusicAwemeListState musicAwemeListState2 = musicAwemeListState;
                            l.d(musicAwemeListState2, "");
                            return MusicAwemeListState.copy$default(musicAwemeListState2, null, eVar.element.size(), false, null, 13, null);
                        }
                    });
                    if (this.f112063a.this$0.f112052e || this.f112063a.this$0.f112049b.size() != 0) {
                        z2 = true;
                    }
                    return v.a(eVar.element, new o(z2, (int) musicAwemeList.cursor));
                }
            });
            l.b(d2, "");
            return d2;
        }
    }

    static final class b<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusicAwemeListViewModel f112053a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicAwemeListState f112054b;

        static {
            Covode.recordClassIndex(72009);
        }

        b(MusicAwemeListViewModel musicAwemeListViewModel, MusicAwemeListState musicAwemeListState) {
            this.f112053a = musicAwemeListViewModel;
            this.f112054b = musicAwemeListState;
        }

        @Override // f.a.w
        public final void subscribe(f.a.v<List<Object>> vVar) {
            l.d(vVar, "");
            List<Object> arrayList = new ArrayList<>();
            final z.c cVar = new z.c();
            cVar.element = this.f112054b.getOutBound();
            if (this.f112054b.isNeedControl()) {
                if (cVar.element + 12 <= ((ListState) this.f112054b.getSubstate()).getList().size()) {
                    cVar.element += 12;
                } else if (this.f112053a.f112049b.size() != 0) {
                    arrayList = this.f112053a.b(12);
                    cVar.element += arrayList.size();
                    this.f112053a.f112049b.removeAll(arrayList);
                } else {
                    cVar.element = ((ListState) this.f112054b.getSubstate()).getList().size();
                }
                this.f112053a.c(new h.f.a.b<MusicAwemeListState, MusicAwemeListState>() {
                    /* class com.ss.android.ugc.aweme.music.ui.viewmodel.MusicAwemeListViewModel.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(72010);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ MusicAwemeListState invoke(MusicAwemeListState musicAwemeListState) {
                        MusicAwemeListState musicAwemeListState2 = musicAwemeListState;
                        l.d(musicAwemeListState2, "");
                        return MusicAwemeListState.copy$default(musicAwemeListState2, null, cVar.element, false, null, 9, null);
                    }
                });
            } else {
                arrayList = this.f112053a.b(12);
                this.f112053a.f112049b.removeAll(arrayList);
            }
            vVar.a(arrayList);
        }
    }

    static final class c extends m implements h.f.a.b<MusicAwemeListState, t<p<? extends List<? extends Object>, ? extends o>>> {
        final /* synthetic */ MusicAwemeListViewModel this$0;

        static {
            Covode.recordClassIndex(72011);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(MusicAwemeListViewModel musicAwemeListViewModel) {
            super(1);
            this.this$0 = musicAwemeListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends Object>, ? extends o>> invoke(MusicAwemeListState musicAwemeListState) {
            final MusicAwemeListState musicAwemeListState2 = musicAwemeListState;
            l.d(musicAwemeListState2, "");
            final z.e eVar = new z.e();
            eVar.element = (T) new ArrayList();
            if (this.this$0.f112049b.size() >= 12 || !this.this$0.f112052e || (musicAwemeListState2.isNeedControl() && musicAwemeListState2.getOutBound() < ((ListState) musicAwemeListState2.getSubstate()).getList().size())) {
                t a2 = t.a(new b(this.this$0, musicAwemeListState2));
                l.b(a2, "");
                t d2 = a2.d(new g(this) {
                    /* class com.ss.android.ugc.aweme.music.ui.viewmodel.MusicAwemeListViewModel.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f112055a;

                    static {
                        Covode.recordClassIndex(72012);
                    }

                    {
                        this.f112055a = r1;
                    }

                    @Override // f.a.d.g
                    public final /* synthetic */ Object apply(Object obj) {
                        boolean z;
                        l.d(obj, "");
                        if (this.f112055a.this$0.f112052e || this.f112055a.this$0.f112049b.size() != 0) {
                            z = ((ListState) musicAwemeListState2.getSubstate()).getPayload().f39459a.f39447a;
                        } else {
                            z = false;
                        }
                        return v.a(obj, new o(z, ((ListState) musicAwemeListState2.getSubstate()).getPayload().f39460b));
                    }
                });
                l.b(d2, "");
                return d2;
            }
            t<MusicAwemeList> a3 = this.this$0.f112048a.a(musicAwemeListState2.getMusicId(), (long) ((ListState) musicAwemeListState2.getSubstate()).getPayload().f39460b, 12);
            AnonymousClass2 r1 = new e(this) {
                /* class com.ss.android.ugc.aweme.music.ui.viewmodel.MusicAwemeListViewModel.c.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f112057a;

                static {
                    Covode.recordClassIndex(72013);
                }

                {
                    this.f112057a = r1;
                }

                @Override // f.a.d.e
                public final boolean a() {
                    if (this.f112057a.this$0.f112049b.size() >= 12 || this.f112057a.this$0.f112050c || !this.f112057a.this$0.f112052e || this.f112057a.this$0.f112051d > 1) {
                        return true;
                    }
                    return false;
                }
            };
            f.a.e.b.b.a((Object) r1, "stop is null");
            t d3 = f.a.h.a.a(new at(a3, r1)).a(new k(this) {
                /* class com.ss.android.ugc.aweme.music.ui.viewmodel.MusicAwemeListViewModel.c.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f112058a;

                static {
                    Covode.recordClassIndex(72014);
                }

                {
                    this.f112058a = r1;
                }

                @Override // f.a.d.k
                public final /* synthetic */ boolean a(Object obj) {
                    boolean z;
                    MusicAwemeList musicAwemeList = (MusicAwemeList) obj;
                    l.d(musicAwemeList, "");
                    MusicAwemeListViewModel musicAwemeListViewModel = this.f112058a.this$0;
                    if (musicAwemeList.hasMore == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    musicAwemeListViewModel.f112052e = z;
                    if (musicAwemeList.items.size() > 0 || !this.f112058a.this$0.f112052e) {
                        this.f112058a.this$0.f112051d = 0;
                    } else {
                        this.f112058a.this$0.f112051d++;
                        if (this.f112058a.this$0.f112051d > 1) {
                            this.f112058a.this$0.f112051d = 0;
                            return true;
                        }
                    }
                    this.f112058a.this$0.f112049b.addAll(musicAwemeList.items);
                    if (this.f112058a.this$0.f112049b.size() >= 12 || !this.f112058a.this$0.f112052e) {
                        ArrayList<Object> b2 = this.f112058a.this$0.b(12);
                        eVar.element.clear();
                        eVar.element.addAll(b2);
                        this.f112058a.this$0.f112049b.removeAll(b2);
                        return true;
                    }
                    this.f112058a.this$0.f112050c = false;
                    return false;
                }
            }).d(new g(this) {
                /* class com.ss.android.ugc.aweme.music.ui.viewmodel.MusicAwemeListViewModel.c.AnonymousClass4 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f112060a;

                static {
                    Covode.recordClassIndex(72015);
                }

                {
                    this.f112060a = r1;
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    MusicAwemeList musicAwemeList = (MusicAwemeList) obj;
                    l.d(musicAwemeList, "");
                    boolean z = true;
                    this.f112060a.this$0.f112050c = true;
                    if (musicAwemeListState2.isNeedControl()) {
                        final int outBound = musicAwemeListState2.getOutBound() + 12;
                        int size = ((ListState) musicAwemeListState2.getSubstate()).getList().size() + eVar.element.size();
                        if (outBound >= size) {
                            outBound = size;
                        }
                        this.f112060a.this$0.c(new h.f.a.b<MusicAwemeListState, MusicAwemeListState>() {
                            /* class com.ss.android.ugc.aweme.music.ui.viewmodel.MusicAwemeListViewModel.c.AnonymousClass4.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(72016);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ MusicAwemeListState invoke(MusicAwemeListState musicAwemeListState) {
                                MusicAwemeListState musicAwemeListState2 = musicAwemeListState;
                                l.d(musicAwemeListState2, "");
                                return MusicAwemeListState.copy$default(musicAwemeListState2, null, outBound, false, null, 9, null);
                            }
                        });
                    }
                    T t = eVar.element;
                    if (!this.f112060a.this$0.f112052e && this.f112060a.this$0.f112049b.size() <= 0) {
                        z = false;
                    }
                    return v.a(t, new o(z, (int) musicAwemeList.cursor));
                }
            });
            l.b(d3, "");
            return d3;
        }
    }
}
