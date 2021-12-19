package com.ss.android.ugc.aweme.dsp.library;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.dsp.common.api.MusicDspApi;
import com.ss.android.ugc.aweme.dsp.common.arch.a.a;
import com.ss.android.ugc.aweme.dsp.playerservice.a.q;
import com.ss.android.ugc.aweme.dsp.playerservice.e.a;
import com.ss.android.ugc.aweme.dsp.playpage.subpage.SubPlayerActivity;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.cg;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.ab;
import h.m.p;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.internal.o;
import org.greenrobot.eventbus.ThreadMode;

public final class MusicLibraryViewModel extends AssemListViewModel<j, com.ss.android.ugc.aweme.dsp.library.a.a, Long> implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static final b n = new b((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    public long f83306k;

    /* renamed from: l  reason: collision with root package name */
    String f83307l = "MUSIC_DSP";

    /* renamed from: m  reason: collision with root package name */
    String f83308m = "LIBRARY";
    private final com.bytedance.assem.arch.extensions.i o = new com.bytedance.assem.arch.extensions.i(true, new a(this, "key_hierarchy_data_page_scene"));
    private String p;
    private final h.h q;
    private final h.h r;

    /* access modifiers changed from: package-private */
    public static final class f extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MusicLibraryViewModel this$0;

        static {
            Covode.recordClassIndex(51951);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(MusicLibraryViewModel musicLibraryViewModel, h.c.d dVar) {
            super(dVar);
            this.this$0 = musicLibraryViewModel;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.b((h.c.d<? super com.bytedance.ies.powerlist.page.f<Long>>) this);
        }
    }

    static {
        Covode.recordClassIndex(51944);
    }

    private final e.AnonymousClass1 o() {
        return (e.AnonymousClass1) this.q.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(44, new org.greenrobot.eventbus.g(MusicLibraryViewModel.class, "onTabChangeEvent", com.ss.android.ugc.aweme.ug.guide.m.class, ThreadMode.POSTING, 0, false));
        hashMap.put(200, new org.greenrobot.eventbus.g(MusicLibraryViewModel.class, "onMusicDspTabChangeEvent", com.ss.android.ugc.aweme.dsp.a.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(65, new org.greenrobot.eventbus.g(MusicLibraryViewModel.class, "onCollectAwemeEvent", com.ss.android.ugc.aweme.favorites.d.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(201, new org.greenrobot.eventbus.g(MusicLibraryViewModel.class, "onUpdateUserIdEvent", com.ss.android.ugc.aweme.dsp.common.a.b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(52, new org.greenrobot.eventbus.g(MusicLibraryViewModel.class, "onMusicCollectEvent", com.ss.android.ugc.aweme.music.f.b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public final com.ss.android.ugc.aweme.dsp.library.a.d k() {
        return (com.ss.android.ugc.aweme.dsp.library.a.d) this.o.getValue();
    }

    public final com.ss.android.ugc.aweme.dsp.playerservice.e.a l() {
        return (com.ss.android.ugc.aweme.dsp.playerservice.e.a) this.r.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(51946);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ MusicLibraryViewModel this$0;

        static {
            Covode.recordClassIndex(51949);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(MusicLibraryViewModel musicLibraryViewModel) {
            super(0);
            this.this$0 = musicLibraryViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new Object(this) {
                /* class com.ss.android.ugc.aweme.dsp.library.MusicLibraryViewModel.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f83309a;

                static {
                    Covode.recordClassIndex(51950);
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
                public final void a(float f2) {
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
                public final void a(int i2, int i3) {
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
                public final void a(long j2) {
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
                public final void a(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
                public final void b(long j2) {
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
                public final void bd_() {
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
                public final void be_() {
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
                public final void c() {
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
                public final void d() {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f83309a = r1;
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
                public final void b(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
                    h.f.b.l.d(cVar, "");
                    h.f.b.l.d(cVar, "");
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
                public final void b(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
                    h.f.b.l.d(dVar, "");
                    h.f.b.l.d(dVar, "");
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
                public final void a(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
                    h.f.b.l.d(dVar, "");
                    h.f.b.l.d(dVar, "");
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
                public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.a aVar) {
                    h.f.b.l.d(aVar, "");
                    h.f.b.l.d(aVar, "");
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
                public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.b bVar) {
                    h.f.b.l.d(bVar, "");
                    h.f.b.l.d(bVar, "");
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
                public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.c cVar) {
                    h.f.b.l.d(cVar, "");
                    h.f.b.l.d(cVar, "");
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
                public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.f fVar) {
                    h.f.b.l.d(fVar, "");
                    List i2 = this.f83309a.this$0.i();
                    if (i2 != null) {
                        int size = i2.size();
                        com.ss.android.ugc.aweme.dsp.playerservice.b.c n = this.f83309a.this$0.n().f83565a.n();
                        for (int i3 = 0; i3 < size; i3++) {
                            com.ss.android.ugc.aweme.dsp.library.a.a aVar = (com.ss.android.ugc.aweme.dsp.library.a.a) this.f83309a.this$0.b(i3);
                            if (aVar != null) {
                                if (aVar instanceof com.ss.android.ugc.aweme.dsp.library.a.b) {
                                    com.ss.android.ugc.aweme.dsp.library.a.b bVar = (com.ss.android.ugc.aweme.dsp.library.a.b) aVar;
                                    String str = null;
                                    if (!h.f.b.l.a((Object) bVar.f83316a, (Object) (n != null ? n.a() : null)) || bVar.f83322g == fVar) {
                                        String str2 = bVar.f83316a;
                                        if (n != null) {
                                            str = n.a();
                                        }
                                        if ((!h.f.b.l.a((Object) str2, (Object) str)) && bVar.f83322g != com.ss.android.ugc.aweme.dsp.playerservice.c.f.PLAYBACK_STATE_STOPPED) {
                                            this.f83309a.this$0.b(i3, com.ss.android.ugc.aweme.dsp.library.a.b.a(bVar.f83316a, bVar.f83317b, bVar.f83318c, bVar.f83319d, bVar.f83320e, bVar.f83321f, com.ss.android.ugc.aweme.dsp.playerservice.c.f.PLAYBACK_STATE_STOPPED, bVar.f83323h));
                                        }
                                    } else {
                                        this.f83309a.this$0.b(i3, com.ss.android.ugc.aweme.dsp.library.a.b.a(bVar.f83316a, bVar.f83317b, bVar.f83318c, bVar.f83319d, bVar.f83320e, bVar.f83321f, fVar, bVar.f83323h));
                                    }
                                } else if (aVar instanceof com.ss.android.ugc.aweme.dsp.library.a.c) {
                                    com.ss.android.ugc.aweme.dsp.library.a.c cVar = (com.ss.android.ugc.aweme.dsp.library.a.c) aVar;
                                    if (fVar != cVar.f83326c) {
                                        this.f83309a.this$0.b(i3, com.ss.android.ugc.aweme.dsp.library.a.c.a(cVar, 0, 0, fVar, null, 11));
                                    }
                                }
                            }
                        }
                    }
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
                public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.g gVar) {
                    h.f.b.l.d(gVar, "");
                    h.f.b.l.d(gVar, "");
                }
            };
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusicLibraryViewModel f83310a;

        static {
            Covode.recordClassIndex(51960);
        }

        l(MusicLibraryViewModel musicLibraryViewModel) {
            this.f83310a = musicLibraryViewModel;
        }

        public final void run() {
            this.f83310a.a((h.f.a.b) AnonymousClass1.f83311a);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ com.bytedance.assem.arch.viewModel.j f() {
        return new j();
    }

    public final com.ss.android.ugc.aweme.dsp.playerservice.f.a n() {
        return a.C1960a.a(j()).f83291b.f83362b;
    }

    static final class g extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.dsp.playerservice.e.a> {
        final /* synthetic */ MusicLibraryViewModel this$0;

        static {
            Covode.recordClassIndex(51952);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(MusicLibraryViewModel musicLibraryViewModel) {
            super(0);
            this.this$0 = musicLibraryViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.dsp.playerservice.e.a invoke() {
            return new com.ss.android.ugc.aweme.dsp.playerservice.e.a("", new com.ss.android.ugc.aweme.dsp.playerservice.b.i(null, null, "my_playlist", "my_playlist", this.this$0.j(), 3));
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void c() {
        super.c();
        n().a((com.ss.android.ugc.aweme.dsp.playerservice.a.j) o());
        n().a((q) o());
        cg.a(this);
    }

    public final String j() {
        String str;
        f fVar = (f) com.bytedance.assem.arch.service.d.a(this, ab.a(i.class));
        if (fVar == null || (str = fVar.f83342a) == null) {
            return "homepage_music_tab";
        }
        return str;
    }

    public final void m() {
        new Handler(Looper.getMainLooper()).postDelayed(new l(this), 500);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ac
    public final void onCleared() {
        n().b((com.ss.android.ugc.aweme.dsp.playerservice.a.j) o());
        n().b((q) o());
        cg.b(this);
        super.onCleared();
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ com.ss.android.ugc.aweme.dsp.playerservice.f.a $controller;
        final /* synthetic */ String $fullClipId;
        final /* synthetic */ String $id;
        Object L$0;
        int label;
        final /* synthetic */ MusicLibraryViewModel this$0;

        static {
            Covode.recordClassIndex(51963);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(MusicLibraryViewModel musicLibraryViewModel, com.ss.android.ugc.aweme.dsp.playerservice.f.a aVar, String str, Context context, String str2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = musicLibraryViewModel;
            this.$controller = aVar;
            this.$fullClipId = str;
            this.$context = context;
            this.$id = str2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new n(this.this$0, this.$controller, this.$fullClipId, this.$context, this.$id, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((n) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* access modifiers changed from: package-private */
        public static final class a extends h.f.b.m implements h.f.a.a<List<String>> {
            final /* synthetic */ n this$0;

            static {
                Covode.recordClassIndex(51965);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(n nVar) {
                super(0);
                this.this$0 = nVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ List<String> invoke() {
                CopyOnWriteArrayList<com.ss.android.ugc.aweme.dsp.playerservice.b.c> copyOnWriteArrayList = this.this$0.this$0.l().f83535c;
                ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) copyOnWriteArrayList, 10));
                Iterator<T> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().b());
                }
                return h.a.n.g((Collection) arrayList);
            }
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            final com.ss.android.ugc.aweme.dsp.playerservice.e.d dVar;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            T t = null;
            if (i2 == 0) {
                r.a(obj);
                com.ss.android.ugc.aweme.dsp.playerservice.f.a aVar2 = this.$controller;
                com.ss.android.ugc.aweme.dsp.playerservice.b.i iVar = new com.ss.android.ugc.aweme.dsp.playerservice.b.i(null, null, "my_playlist", "my_playlist", this.this$0.j(), 3);
                a aVar3 = new a(this);
                String str = this.$fullClipId;
                if (str == null) {
                    str = "";
                }
                dVar = new com.ss.android.ugc.aweme.dsp.playerservice.e.d(aVar2, "", iVar, aVar3, str);
                h.c.f plus = this.this$0.aH_().a().plus(bf.f159041b);
                AnonymousClass1 r0 = new h.f.a.m<am, h.c.d<? super List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c>>, Object>(null) {
                    /* class com.ss.android.ugc.aweme.dsp.library.MusicLibraryViewModel.n.AnonymousClass1 */
                    int label;

                    static {
                        Covode.recordClassIndex(51964);
                    }

                    @Override // h.c.b.a.a
                    public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                        h.f.b.l.d(dVar, "");
                        return 

                        public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.dsp.library.a.d> {
                            final /* synthetic */ String $identify;
                            final /* synthetic */ AssemViewModel $this_hierarchyData;

                            static {
                                Covode.recordClassIndex(51945);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            public a(AssemViewModel assemViewModel, String str) {
                                super(0);
                                this.$this_hierarchyData = assemViewModel;
                                this.$identify = str;
                            }

                            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.ss.android.ugc.aweme.dsp.library.a.d] */
                            /* JADX WARNING: Unknown variable types count: 1 */
                            @Override // h.f.a.a
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final com.ss.android.ugc.aweme.dsp.library.a.d invoke() {
                                /*
                                    r3 = this;
                                    com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyData
                                    com.bytedance.assem.arch.core.d r0 = r0.f25687d
                                    if (r0 == 0) goto L_0x0018
                                    com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyData
                                    com.bytedance.assem.arch.core.d r2 = r0.f25687d
                                    if (r2 != 0) goto L_0x000f
                                    h.f.b.l.a()
                                L_0x000f:
                                    java.lang.Class<com.ss.android.ugc.aweme.dsp.library.a.d> r1 = com.ss.android.ugc.aweme.dsp.library.a.d.class
                                    java.lang.String r0 = r3.$identify
                                    java.lang.Object r0 = r2.a(r1, r0)
                                    return r0
                                L_0x0018:
                                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                    java.lang.String r0 = "HierarchyData has not inject to "
                                    r1.<init>(r0)
                                    com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyData
                                    java.lang.StringBuilder r1 = r1.append(r0)
                                    java.lang.String r0 = ", you can't get hierarchyData"
                                    java.lang.StringBuilder r0 = r1.append(r0)
                                    java.lang.String r0 = r0.toString()
                                    java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                                    java.lang.String r0 = r0.toString()
                                    r1.<init>(r0)
                                    throw r1
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.library.MusicLibraryViewModel.a.invoke():java.lang.Object");
                            }
                        }

                        public MusicLibraryViewModel() {
                            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                            h.f.b.l.b(g2, "");
                            this.p = g2.getCurUserId();
                            this.q = h.i.a((h.f.a.a) new e(this));
                            this.r = h.i.a((h.f.a.a) new g(this));
                        }

                        @Override // com.bytedance.ext_power_list.AssemListViewModel
                        public final Object a(h.c.d<? super com.bytedance.ies.powerlist.page.f<Long>> dVar) {
                            return b(dVar);
                        }

                        @org.greenrobot.eventbus.r
                        public final void onMusicDspTabChangeEvent(com.ss.android.ugc.aweme.dsp.a.a aVar) {
                            h.f.b.l.d(aVar, "");
                            this.f83308m = aVar.f83239c;
                        }

                        @org.greenrobot.eventbus.r
                        public final void onTabChangeEvent(com.ss.android.ugc.aweme.ug.guide.m mVar) {
                            h.f.b.l.d(mVar, "");
                            this.f83307l = mVar.f141945b;
                        }

                        static final class h extends h.f.b.m implements h.f.a.b<j, j> {
                            final /* synthetic */ com.bytedance.ext_power_list.a $newListState;

                            static {
                                Covode.recordClassIndex(51953);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            h(com.bytedance.ext_power_list.a aVar) {
                                super(1);
                                this.$newListState = aVar;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ j invoke(j jVar) {
                                j jVar2 = jVar;
                                h.f.b.l.d(jVar2, "");
                                return j.a(jVar2, this.$newListState, 0, null, 6);
                            }
                        }

                        /* access modifiers changed from: package-private */
                        public static final class m extends h.f.b.m implements h.f.a.b<j, j> {
                            final /* synthetic */ boolean $loading;

                            static {
                                Covode.recordClassIndex(51962);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            m(boolean z) {
                                super(1);
                                this.$loading = z;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ j invoke(j jVar) {
                                j jVar2 = jVar;
                                h.f.b.l.d(jVar2, "");
                                return j.a(jVar2, null, 0, Boolean.valueOf(this.$loading), 3);
                            }
                        }

                        @Override // com.bytedance.ext_power_list.AssemListViewModel
                        public final void a(com.bytedance.ext_power_list.a<com.ss.android.ugc.aweme.dsp.library.a.a> aVar) {
                            h.f.b.l.d(aVar, "");
                            a((h.f.a.b) new h(aVar));
                        }

                        public final void a(boolean z) {
                            a((h.f.a.b) new m(z));
                        }

                        @org.greenrobot.eventbus.r
                        public final void onCollectAwemeEvent(com.ss.android.ugc.aweme.favorites.d.a aVar) {
                            h.f.b.l.d(aVar, "");
                            String str = aVar.f90593a;
                            int i2 = aVar.f90594b;
                            if (i2 == 0) {
                                bz unused = kotlinx.coroutines.i.a(aH_(), o.f159148a, null, new j(this, str, null), 2);
                            } else if (i2 == 1) {
                                bz unused2 = kotlinx.coroutines.i.a(aH_(), o.f159148a, null, new i(this, str, null), 2);
                            }
                        }

                        @org.greenrobot.eventbus.r
                        public final void onMusicCollectEvent(com.ss.android.ugc.aweme.music.f.b bVar) {
                            Music music;
                            h.f.b.l.d(bVar, "");
                            MusicModel musicModel = bVar.f111484b;
                            if (musicModel != null && (music = musicModel.getMusic()) != null && bVar.f111483a == 1) {
                                bz unused = kotlinx.coroutines.i.a(aH_(), o.f159148a, null, new k(this, music, bVar, null), 2);
                            }
                        }

                        @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
                        public final void onUpdateUserIdEvent(com.ss.android.ugc.aweme.dsp.common.a.b bVar) {
                            h.f.b.l.d(bVar, "");
                            String str = bVar.f83280a;
                            if (str != null) {
                                String str2 = this.p;
                                if (str2 == null || str2.length() == 0) {
                                    this.p = str;
                                } else if (!h.f.b.l.a((Object) str2, (Object) str)) {
                                    this.p = str;
                                    b((h.f.a.b) new AssemListViewModel.d(this));
                                    g();
                                }
                            }
                        }

                        /* access modifiers changed from: package-private */
                        public static final class i extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
                            final /* synthetic */ String $aid;
                            int label;
                            final /* synthetic */ MusicLibraryViewModel this$0;

                            static {
                                Covode.recordClassIndex(51954);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            i(MusicLibraryViewModel musicLibraryViewModel, String str, h.c.d dVar) {
                                super(2, dVar);
                                this.this$0 = musicLibraryViewModel;
                                this.$aid = str;
                            }

                            @Override // h.c.b.a.a
                            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                h.f.b.l.d(dVar, "");
                                return new i(this.this$0, this.$aid, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                                return ((i) create(amVar, dVar)).invokeSuspend(z.f158842a);
                            }

                            /* access modifiers changed from: package-private */
                            public static final class a extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c>>, Object> {
                                int label;
                                final /* synthetic */ i this$0;

                                static {
                                    Covode.recordClassIndex(51955);
                                }

                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                a(i iVar, h.c.d dVar) {
                                    super(2, dVar);
                                    this.this$0 = iVar;
                                }

                                @Override // h.c.b.a.a
                                public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                    h.f.b.l.d(dVar, "");
                                    return new a(this.this$0, dVar);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                @Override // h.f.a.m
                                public final Object invoke(am amVar, h.c.d<? super List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c>> dVar) {
                                    return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
                                }

                                @Override // h.c.b.a.a
                                public final Object invokeSuspend(Object obj) {
                                    long j2;
                                    h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                    int i2 = this.label;
                                    if (i2 == 0) {
                                        r.a(obj);
                                        com.ss.android.ugc.aweme.dsp.playerservice.e.a.a aVar2 = this.this$0.this$0.l().f83518a;
                                        if (!(aVar2 instanceof a.C1975a)) {
                                            aVar2 = null;
                                        }
                                        a.C1975a aVar3 = (a.C1975a) aVar2;
                                        if (aVar3 == null) {
                                            return h.a.z.INSTANCE;
                                        }
                                        List a2 = h.a.n.a(this.this$0.$aid);
                                        h.f.b.l.d(a2, "");
                                        Long g2 = p.g(aVar3.f83523c.f83534a);
                                        if (g2 != null) {
                                            j2 = g2.longValue();
                                        } else {
                                            j2 = 0;
                                        }
                                        t<R> f2 = MusicDspApi.a.a(j2, h.a.z.INSTANCE, a2).d(new a.C1975a.b(aVar3)).f(a.C1975a.c.f83528a);
                                        h.f.b.l.b(f2, "");
                                        this.label = 1;
                                        obj = kotlinx.coroutines.c.b.a(f2, this);
                                        if (obj == aVar) {
                                            return aVar;
                                        }
                                    } else if (i2 == 1) {
                                        r.a(obj);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    return obj;
                                }
                            }

                            @Override // h.c.b.a.a
                            public final Object invokeSuspend(Object obj) {
                                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                int i2 = this.label;
                                if (i2 == 0) {
                                    r.a(obj);
                                    h.c.f plus = this.this$0.aH_().a().plus(bf.f159041b);
                                    a aVar2 = new a(this, null);
                                    this.label = 1;
                                    obj = kotlinx.coroutines.i.a(plus, aVar2, this);
                                    if (obj == aVar) {
                                        return aVar;
                                    }
                                } else if (i2 == 1) {
                                    r.a(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c> list = (List) obj;
                                h.f.b.l.b(list, "");
                                if (!list.isEmpty()) {
                                    List<com.ss.android.ugc.aweme.dsp.library.a.a> a2 = this.this$0.a(list);
                                    List i3 = this.this$0.i();
                                    if (i3 == null || i3.size() <= 0) {
                                        this.this$0.a(0, a2);
                                    } else {
                                        this.this$0.a(1, a2);
                                        this.this$0.m();
                                    }
                                }
                                return z.f158842a;
                            }
                        }

                        /* access modifiers changed from: package-private */
                        public static final class j extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
                            final /* synthetic */ String $aid;
                            int label;
                            final /* synthetic */ MusicLibraryViewModel this$0;

                            static {
                                Covode.recordClassIndex(51956);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            j(MusicLibraryViewModel musicLibraryViewModel, String str, h.c.d dVar) {
                                super(2, dVar);
                                this.this$0 = musicLibraryViewModel;
                                this.$aid = str;
                            }

                            @Override // h.c.b.a.a
                            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                h.f.b.l.d(dVar, "");
                                return new j(this.this$0, this.$aid, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                                return ((j) create(amVar, dVar)).invokeSuspend(z.f158842a);
                            }

                            /* access modifiers changed from: package-private */
                            public static final class a extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super List<? extends String>>, Object> {
                                int label;
                                final /* synthetic */ j this$0;

                                static {
                                    Covode.recordClassIndex(51957);
                                }

                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                a(j jVar, h.c.d dVar) {
                                    super(2, dVar);
                                    this.this$0 = jVar;
                                }

                                @Override // h.c.b.a.a
                                public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                    h.f.b.l.d(dVar, "");
                                    return new a(this.this$0, dVar);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                @Override // h.f.a.m
                                public final Object invoke(am amVar, h.c.d<? super List<? extends String>> dVar) {
                                    return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
                                }

                                @Override // h.c.b.a.a
                                public final Object invokeSuspend(Object obj) {
                                    long j2;
                                    h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                    int i2 = this.label;
                                    if (i2 == 0) {
                                        r.a(obj);
                                        com.ss.android.ugc.aweme.dsp.playerservice.e.a.a aVar2 = this.this$0.this$0.l().f83518a;
                                        if (!(aVar2 instanceof a.C1975a)) {
                                            aVar2 = null;
                                        }
                                        a.C1975a aVar3 = (a.C1975a) aVar2;
                                        if (aVar3 == null) {
                                            return h.a.z.INSTANCE;
                                        }
                                        List a2 = h.a.n.a(this.this$0.$aid);
                                        h.f.b.l.d(a2, "");
                                        Long g2 = p.g(aVar3.f83523c.f83534a);
                                        if (g2 != null) {
                                            j2 = g2.longValue();
                                        } else {
                                            j2 = 0;
                                        }
                                        t<R> f2 = MusicDspApi.a.a(j2, h.a.z.INSTANCE, a2).d(new a.C1975a.f(aVar3, a2)).f(a.C1975a.g.f83533a);
                                        h.f.b.l.b(f2, "");
                                        this.label = 1;
                                        obj = kotlinx.coroutines.c.b.a(f2, this);
                                        if (obj == aVar) {
                                            return aVar;
                                        }
                                    } else if (i2 == 1) {
                                        r.a(obj);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    return obj;
                                }
                            }

                            @Override // h.c.b.a.a
                            public final Object invokeSuspend(Object obj) {
                                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                int i2 = this.label;
                                com.ss.android.ugc.aweme.dsp.library.a.c cVar = null;
                                if (i2 == 0) {
                                    r.a(obj);
                                    h.c.f plus = this.this$0.aH_().a().plus(bf.f159041b);
                                    a aVar2 = new a(this, null);
                                    this.label = 1;
                                    obj = kotlinx.coroutines.i.a(plus, aVar2, this);
                                    if (obj == aVar) {
                                        return aVar;
                                    }
                                } else if (i2 == 1) {
                                    r.a(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                List list = (List) obj;
                                h.f.b.l.b(list, "");
                                if (!list.isEmpty()) {
                                    List<com.ss.android.ugc.aweme.dsp.library.a.a> i3 = this.this$0.i();
                                    if (i3 != null) {
                                        for (com.ss.android.ugc.aweme.dsp.library.a.a aVar3 : i3) {
                                            if ((aVar3 instanceof com.ss.android.ugc.aweme.dsp.library.a.b) && list.contains(((com.ss.android.ugc.aweme.dsp.library.a.b) aVar3).f83316a)) {
                                                this.this$0.a((com.bytedance.ies.powerlist.b.a) aVar3);
                                            }
                                        }
                                    }
                                    List i4 = this.this$0.i();
                                    if (i4 != null) {
                                        int size = i4.size();
                                        if (size == 1) {
                                            com.bytedance.ies.powerlist.b.a b2 = this.this$0.b(0);
                                            if (b2 instanceof com.ss.android.ugc.aweme.dsp.library.a.c) {
                                                cVar = b2;
                                            }
                                            com.ss.android.ugc.aweme.dsp.library.a.c cVar2 = (com.ss.android.ugc.aweme.dsp.library.a.c) cVar;
                                            if (cVar2 == null) {
                                                return z.f158842a;
                                            }
                                            this.this$0.a((com.bytedance.ies.powerlist.b.a) cVar2);
                                        } else if (size > 1) {
                                            com.bytedance.ies.powerlist.b.a b3 = this.this$0.b(0);
                                            if (b3 instanceof com.ss.android.ugc.aweme.dsp.library.a.c) {
                                                cVar = b3;
                                            }
                                            com.ss.android.ugc.aweme.dsp.library.a.c cVar3 = cVar;
                                            if (cVar3 == null) {
                                                return z.f158842a;
                                            }
                                            MusicLibraryViewModel musicLibraryViewModel = this.this$0;
                                            musicLibraryViewModel.b(0, com.ss.android.ugc.aweme.dsp.library.a.c.a(cVar3, 0, musicLibraryViewModel.l().f83537e, null, null, 13));
                                        }
                                    }
                                }
                                return z.f158842a;
                            }
                        }

                        /* access modifiers changed from: package-private */
                        public static final class k extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
                            final /* synthetic */ com.ss.android.ugc.aweme.music.f.b $event;
                            final /* synthetic */ Music $musicModel;
                            int label;
                            final /* synthetic */ MusicLibraryViewModel this$0;

                            static {
                                Covode.recordClassIndex(51958);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            k(MusicLibraryViewModel musicLibraryViewModel, Music music, com.ss.android.ugc.aweme.music.f.b bVar, h.c.d dVar) {
                                super(2, dVar);
                                this.this$0 = musicLibraryViewModel;
                                this.$musicModel = music;
                                this.$event = bVar;
                            }

                            @Override // h.c.b.a.a
                            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                h.f.b.l.d(dVar, "");
                                return new k(this.this$0, this.$musicModel, this.$event, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                                return ((k) create(amVar, dVar)).invokeSuspend(z.f158842a);
                            }

                            /* access modifiers changed from: package-private */
                            public static final class a extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c>>, Object> {
                                int label;
                                final /* synthetic */ k this$0;

                                static {
                                    Covode.recordClassIndex(51959);
                                }

                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                a(k kVar, h.c.d dVar) {
                                    super(2, dVar);
                                    this.this$0 = kVar;
                                }

                                @Override // h.c.b.a.a
                                public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                    h.f.b.l.d(dVar, "");
                                    return new a(this.this$0, dVar);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                @Override // h.f.a.m
                                public final Object invoke(am amVar, h.c.d<? super List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c>> dVar) {
                                    return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
                                }

                                @Override // h.c.b.a.a
                                public final Object invokeSuspend(Object obj) {
                                    long j2;
                                    h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                    int i2 = this.label;
                                    if (i2 == 0) {
                                        r.a(obj);
                                        com.ss.android.ugc.aweme.dsp.playerservice.e.a.a aVar2 = this.this$0.this$0.l().f83518a;
                                        if (!(aVar2 instanceof a.C1975a)) {
                                            aVar2 = null;
                                        }
                                        a.C1975a aVar3 = (a.C1975a) aVar2;
                                        if (aVar3 == null) {
                                            return h.a.z.INSTANCE;
                                        }
                                        List a2 = h.a.n.a(String.valueOf(this.this$0.$musicModel.getId()));
                                        h.f.b.l.d(a2, "");
                                        Long g2 = p.g(aVar3.f83523c.f83534a);
                                        if (g2 != null) {
                                            j2 = g2.longValue();
                                        } else {
                                            j2 = 0;
                                        }
                                        t<R> f2 = MusicDspApi.a.a(j2, a2, h.a.z.INSTANCE).d(new a.C1975a.d(aVar3)).f(a.C1975a.e.f83530a);
                                        h.f.b.l.b(f2, "");
                                        this.label = 1;
                                        obj = kotlinx.coroutines.c.b.a(f2, this);
                                        if (obj == aVar) {
                                            return aVar;
                                        }
                                    } else if (i2 == 1) {
                                        r.a(obj);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    return obj;
                                }
                            }

                            @Override // h.c.b.a.a
                            public final Object invokeSuspend(Object obj) {
                                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                int i2 = this.label;
                                if (i2 == 0) {
                                    r.a(obj);
                                    h.c.f plus = this.this$0.aH_().a().plus(bf.f159041b);
                                    a aVar2 = new a(this, null);
                                    this.label = 1;
                                    obj = kotlinx.coroutines.i.a(plus, aVar2, this);
                                    if (obj == aVar) {
                                        return aVar;
                                    }
                                } else if (i2 == 1) {
                                    r.a(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c> list = (List) obj;
                                h.f.b.l.b(list, "");
                                if (!list.isEmpty()) {
                                    ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
                                    for (com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar : list) {
                                        arrayList.add(cVar.a());
                                    }
                                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.dsp.common.a.a(arrayList, this.$event.f111483a));
                                    List<com.ss.android.ugc.aweme.dsp.library.a.a> a2 = this.this$0.a(list);
                                    List i3 = this.this$0.i();
                                    if (i3 == null || i3.size() <= 0) {
                                        this.this$0.a(0, a2);
                                    } else {
                                        this.this$0.a(1, a2);
                                        this.this$0.m();
                                    }
                                }
                                return z.f158842a;
                            }
                        }

                        /* access modifiers changed from: package-private */
                        public static final class d extends h.f.b.m implements h.f.a.b<Context, z> {
                            final /* synthetic */ List $playableList$inlined;
                            final /* synthetic */ MusicLibraryViewModel this$0;

                            static {
                                Covode.recordClassIndex(51948);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            d(MusicLibraryViewModel musicLibraryViewModel, List list) {
                                super(1);
                                this.this$0 = musicLibraryViewModel;
                                this.$playableList$inlined = list;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(Context context) {
                                Context context2 = context;
                                h.f.b.l.d(context2, "");
                                if (System.currentTimeMillis() - this.this$0.f83306k >= 200) {
                                    this.this$0.f83306k = System.currentTimeMillis();
                                    if (this.this$0.n().f83565a.e().isPlayingState()) {
                                        this.this$0.n().f(new com.ss.android.ugc.aweme.dsp.playerservice.b.f("PAUSE_FROM_USER_PAUSE"));
                                    } else {
                                        this.this$0.a(null, null, context2);
                                    }
                                }
                                return z.f158842a;
                            }
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
                        /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object b(h.c.d<? super com.bytedance.ies.powerlist.page.f<java.lang.Long>> r7) {
                            /*
                            // Method dump skipped, instructions count: 188
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.library.MusicLibraryViewModel.b(h.c.d):java.lang.Object");
                        }

                        public final List<com.ss.android.ugc.aweme.dsp.library.a.a> a(List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c> list) {
                            ArrayList arrayList;
                            boolean z;
                            com.ss.android.ugc.aweme.dsp.playerservice.c.f fVar;
                            ArrayList arrayList2 = new ArrayList();
                            com.ss.android.ugc.aweme.dsp.playerservice.b.c n2 = n().f83565a.n();
                            com.ss.android.ugc.aweme.dsp.playerservice.c.f e2 = n().f83565a.e();
                            List i2 = i();
                            com.ss.android.ugc.aweme.dsp.library.a.c cVar = null;
                            if (i2 != null) {
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj : i2) {
                                    if (obj instanceof com.ss.android.ugc.aweme.dsp.library.a.b) {
                                        arrayList3.add(obj);
                                    }
                                }
                                ArrayList<com.ss.android.ugc.aweme.dsp.library.a.b> arrayList4 = arrayList3;
                                ArrayList arrayList5 = new ArrayList(h.a.n.a((Iterable) arrayList4, 10));
                                for (com.ss.android.ugc.aweme.dsp.library.a.b bVar : arrayList4) {
                                    arrayList5.add(bVar.f83316a);
                                }
                                arrayList = arrayList5;
                            } else {
                                arrayList = null;
                            }
                            for (T t : list) {
                                String a2 = t.a();
                                String b2 = t.b();
                                UrlModel l2 = t.l();
                                String i3 = t.i();
                                String j2 = t.j();
                                Video video = t.c().getAweme().getVideo();
                                h.f.b.l.b(video, "");
                                int duration = video.getDuration();
                                if (h.f.b.l.a((Object) t.a(), (Object) (n2 != null ? n2.a() : null))) {
                                    fVar = e2;
                                } else {
                                    fVar = com.ss.android.ugc.aweme.dsp.playerservice.c.f.PLAYBACK_STATE_STOPPED;
                                }
                                com.ss.android.ugc.aweme.dsp.library.a.b bVar2 = new com.ss.android.ugc.aweme.dsp.library.a.b(a2, b2, l2, i3, j2, duration, fVar, new c(arrayList2, n2, e2, arrayList, this, list));
                                if (arrayList == null || !arrayList.contains(bVar2.f83316a)) {
                                    arrayList2.add(bVar2);
                                }
                            }
                            List i4 = i();
                            if (i4 == null || i4.size() <= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            int i5 = l().f83537e;
                            if (!z) {
                                com.bytedance.ies.powerlist.b.a b3 = b(0);
                                if (b3 instanceof com.ss.android.ugc.aweme.dsp.library.a.c) {
                                    cVar = b3;
                                }
                                com.ss.android.ugc.aweme.dsp.library.a.c cVar2 = cVar;
                                if (cVar2 != null) {
                                    b(0, com.ss.android.ugc.aweme.dsp.library.a.c.a(cVar2, 0, i5, null, null, 13));
                                }
                            } else if (!arrayList2.isEmpty()) {
                                arrayList2.add(0, new com.ss.android.ugc.aweme.dsp.library.a.c(R.string.dbn, i5, e2, new d(this, list)));
                            }
                            return arrayList2;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.c.d] */
                        @Override // com.bytedance.ext_power_list.AssemListViewModel
                        public final /* synthetic */ Object a(Long l2, h.c.d<? super com.bytedance.ies.powerlist.page.f<Long>> dVar) {
                            l2.longValue();
                            return b(dVar);
                        }

                        /* access modifiers changed from: package-private */
                        public static final class c extends h.f.b.m implements h.f.a.q<Context, String, String, z> {
                            final /* synthetic */ List $currentIds$inlined;
                            final /* synthetic */ com.ss.android.ugc.aweme.dsp.playerservice.b.c $currentPlayable$inlined;
                            final /* synthetic */ com.ss.android.ugc.aweme.dsp.playerservice.c.f $currentPlaybackState$inlined;
                            final /* synthetic */ List $playableList$inlined;
                            final /* synthetic */ List $this_apply$inlined;
                            final /* synthetic */ MusicLibraryViewModel this$0;

                            static {
                                Covode.recordClassIndex(51947);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            c(List list, com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar, com.ss.android.ugc.aweme.dsp.playerservice.c.f fVar, List list2, MusicLibraryViewModel musicLibraryViewModel, List list3) {
                                super(3);
                                this.$this_apply$inlined = list;
                                this.$currentPlayable$inlined = cVar;
                                this.$currentPlaybackState$inlined = fVar;
                                this.$currentIds$inlined = list2;
                                this.this$0 = musicLibraryViewModel;
                                this.$playableList$inlined = list3;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.q
                            public final /* synthetic */ z invoke(Context context, String str, String str2) {
                                Context context2 = context;
                                String str3 = str;
                                String str4 = str2;
                                h.f.b.l.d(context2, "");
                                h.f.b.l.d(str3, "");
                                h.f.b.l.d(str4, "");
                                if (System.currentTimeMillis() - this.this$0.f83306k >= 200) {
                                    this.this$0.f83306k = System.currentTimeMillis();
                                    this.this$0.a(str3, str4, context2);
                                }
                                return z.f158842a;
                            }
                        }

                        public final void a(String str, String str2, Context context) {
                            com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar;
                            a(true);
                            com.ss.android.ugc.aweme.dsp.playerservice.f.a n2 = n();
                            T t = null;
                            if (n2.f83565a.e().isPlayingOrPause()) {
                                cVar = n2.f83565a.n();
                            } else {
                                cVar = null;
                            }
                            if (cVar != null && (str == null || h.f.b.l.a((Object) str, (Object) cVar.a()))) {
                                n2.e((com.ss.android.ugc.aweme.dsp.playerservice.b.f) null);
                                SubPlayerActivity.a.a(context, j());
                                a(false);
                            } else if (com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b.b()) {
                                Iterator<T> it = l().f83535c.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    T next = it.next();
                                    if (h.f.b.l.a((Object) next.a(), (Object) str)) {
                                        t = next;
                                        break;
                                    }
                                }
                                T t2 = t;
                                if (t2 == null) {
                                    t2 = (com.ss.android.ugc.aweme.dsp.playerservice.b.c) h.a.n.g((List) l().f83535c);
                                }
                                com.ss.android.ugc.aweme.dsp.b.b.a(context, t2, k().f83329a);
                                a(false);
                            } else {
                                bz unused = kotlinx.coroutines.i.a(aH_(), o.f159148a, null, new n(this, n2, str2, context, str, null), 2);
                            }
                        }
                    }
