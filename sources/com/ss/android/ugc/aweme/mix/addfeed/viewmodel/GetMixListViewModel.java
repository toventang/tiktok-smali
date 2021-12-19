package com.ss.android.ugc.aweme.mix.addfeed.viewmodel;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.config.b;
import com.bytedance.ies.powerlist.page.config.c;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.q;
import java.util.ArrayList;
import java.util.List;

public final class GetMixListViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public int f109772a = -1;

    /* renamed from: b  reason: collision with root package name */
    public AddFeedToMixFragment.d f109773b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f109774c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f109775d;

    /* renamed from: e  reason: collision with root package name */
    public List<AddFeedToMixFragment.b> f109776e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public String f109777f = "";

    /* renamed from: g  reason: collision with root package name */
    public Aweme f109778g;

    /* renamed from: h  reason: collision with root package name */
    public String f109779h = "";

    /* renamed from: i  reason: collision with root package name */
    public String f109780i = "";

    /* renamed from: j  reason: collision with root package name */
    public boolean f109781j;

    /* renamed from: k  reason: collision with root package name */
    private final h f109782k = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(70292);
    }

    public final b<com.ss.android.ugc.aweme.mix.model.a> a() {
        return (b) this.f109782k.getValue();
    }

    static final class a extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ GetMixListViewModel this$0;

        static {
            Covode.recordClassIndex(70293);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(GetMixListViewModel getMixListViewModel) {
            super(0);
            this.this$0 = getMixListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            c cVar = new c();
            cVar.f34357b = false;
            return new b<com.ss.android.ugc.aweme.mix.model.a>(this, cVar) {
                /* class com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f109783a;

                static {
                    Covode.recordClassIndex(70294);
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel$a$1$b */
                static final class b<T> implements f {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ h.c.d f109786a;

                    static {
                        Covode.recordClassIndex(70296);
                    }

                    b(h.c.d dVar) {
                        this.f109786a = dVar;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f109786a.resumeWith(q.m223constructorimpl(f.a.a(new Exception(((Throwable) obj).getMessage()))));
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel$a$1$d */
                static final class d<T> implements f.a.d.f {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ h.c.d f109789a;

                    static {
                        Covode.recordClassIndex(70298);
                    }

                    d(h.c.d dVar) {
                        this.f109789a = dVar;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f109789a.resumeWith(q.m223constructorimpl(f.a.a(new Exception(((Throwable) obj).getMessage()))));
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel$a$1$a  reason: collision with other inner class name */
                static final class C2812a<T> implements f.a.d.f {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f109784a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ h.c.d f109785b;

                    static {
                        Covode.recordClassIndex(70295);
                    }

                    C2812a(AnonymousClass1 r1, h.c.d dVar) {
                        this.f109784a = r1;
                        this.f109785b = dVar;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        com.ss.android.ugc.aweme.mix.model.a aVar = (com.ss.android.ugc.aweme.mix.model.a) obj;
                        if (aVar != null) {
                            List<AddFeedToMixFragment.d> a2 = this.f109784a.f109783a.this$0.a((List<? extends com.ss.android.ugc.aweme.mix.model.d>) aVar.getMixList(), true);
                            List<AddFeedToMixFragment.b> list = this.f109784a.f109783a.this$0.f109776e;
                            ArrayList arrayList = new ArrayList();
                            if (list != null) {
                                arrayList.addAll(list);
                            }
                            arrayList.addAll(a2);
                            if (aVar.getHasMore()) {
                                this.f109785b.resumeWith(q.m223constructorimpl(f.a.a(null, aVar, this.f109784a.f109783a.this$0.a((List<? extends com.ss.android.ugc.aweme.mix.model.d>) aVar.getMixList(), true))));
                            } else {
                                this.f109785b.resumeWith(q.m223constructorimpl(f.a.a(this.f109784a.f109783a.this$0.a((List<? extends com.ss.android.ugc.aweme.mix.model.d>) aVar.getMixList(), true))));
                            }
                        }
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel$a$1$c */
                static final class c<T> implements f.a.d.f {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f109787a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ h.c.d f109788b;

                    static {
                        Covode.recordClassIndex(70297);
                    }

                    c(AnonymousClass1 r1, h.c.d dVar) {
                        this.f109787a = r1;
                        this.f109788b = dVar;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        com.ss.android.ugc.aweme.mix.model.a aVar = (com.ss.android.ugc.aweme.mix.model.a) obj;
                        if (aVar != null) {
                            List<com.ss.android.ugc.aweme.mix.model.d> mixList = aVar.getMixList();
                            if (mixList != null && mixList.isEmpty()) {
                                this.f109788b.resumeWith(q.m223constructorimpl(f.a.a(this.f109787a.f109783a.this$0.a((List<? extends com.ss.android.ugc.aweme.mix.model.d>) aVar.getMixList(), false))));
                            } else if (aVar.getHasMore()) {
                                this.f109788b.resumeWith(q.m223constructorimpl(f.a.a(null, aVar, this.f109787a.f109783a.this$0.a((List<? extends com.ss.android.ugc.aweme.mix.model.d>) aVar.getMixList(), false))));
                            } else {
                                this.f109788b.resumeWith(q.m223constructorimpl(f.a.a(this.f109787a.f109783a.this$0.a((List<? extends com.ss.android.ugc.aweme.mix.model.d>) aVar.getMixList(), false))));
                            }
                        }
                    }
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final void a(h.c.d<? super com.bytedance.ies.powerlist.page.f<com.ss.android.ugc.aweme.mix.model.a>> dVar) {
                    l.d(dVar, "");
                    com.ss.android.ugc.aweme.account.b.a();
                    IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
                    l.b(e2, "");
                    String curUserId = e2.getCurUserId();
                    com.ss.android.ugc.aweme.account.b.a();
                    IAccountUserService e3 = com.ss.android.ugc.aweme.account.b.f62864a.e();
                    l.b(e3, "");
                    String curSecUserId = e3.getCurSecUserId();
                    MixFeedApi a2 = MixFeedApi.a.a();
                    l.b(curUserId, "");
                    l.b(curSecUserId, "");
                    l.b(a2.getUserMixList(curUserId, 0, curSecUserId).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this, dVar), new d(dVar)), "");
                }

                {
                    this.f109783a = r1;
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final /* synthetic */ void b(h.c.d dVar, Object obj) {
                    com.ss.android.ugc.aweme.mix.model.a aVar = (com.ss.android.ugc.aweme.mix.model.a) obj;
                    l.d(dVar, "");
                    l.d(aVar, "");
                    com.ss.android.ugc.aweme.account.b.a();
                    IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
                    l.b(e2, "");
                    String curUserId = e2.getCurUserId();
                    if (aVar.getHasMore()) {
                        MixFeedApi a2 = MixFeedApi.a.a();
                        l.b(curUserId, "");
                        l.b(a2.getUserMixList(curUserId, aVar.getCursor(), "").b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new C2812a(this, dVar), new b(dVar)), "");
                    }
                }
            };
        }
    }

    public final void b() {
        a().f34367c.e();
    }

    public final void a(int i2, AddFeedToMixFragment.d dVar) {
        this.f109772a = i2;
        this.f109773b = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r9.isEmpty() != false) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment.d> a(java.util.List<? extends com.ss.android.ugc.aweme.mix.model.d> r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel.a(java.util.List, boolean):java.util.List");
    }
}
