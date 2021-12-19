package com.ss.android.ugc.aweme.shoutouts.review;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsRatingListApi;
import com.ss.android.ugc.aweme.shoutouts.model.e;
import com.ss.android.ugc.aweme.shoutouts.model.f;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import f.a.ae;
import h.c.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.q;
import java.util.ArrayList;
import java.util.Iterator;

public final class ShoutoutsReviewsViewModel extends ac {

    /* renamed from: d  reason: collision with root package name */
    public static final a f133335d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f133336a;

    /* renamed from: b  reason: collision with root package name */
    public String f133337b;

    /* renamed from: c  reason: collision with root package name */
    public String f133338c;

    /* renamed from: e  reason: collision with root package name */
    private final h f133339e = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(87213);
    }

    public final com.bytedance.ies.powerlist.page.config.b<Integer> a() {
        return (com.bytedance.ies.powerlist.page.config.b) this.f133339e.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87214);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ ShoutoutsReviewsViewModel this$0;

        static {
            Covode.recordClassIndex(87215);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ShoutoutsReviewsViewModel shoutoutsReviewsViewModel) {
            super(0);
            this.this$0 = shoutoutsReviewsViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            com.bytedance.ies.powerlist.page.config.c cVar = new com.bytedance.ies.powerlist.page.config.c();
            cVar.f34357b = false;
            cVar.f34356a = 5;
            cVar.f34358c = LoadingFooterCell.class;
            return new com.bytedance.ies.powerlist.page.config.b<Integer>(this, cVar) {
                /* class com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsReviewsViewModel.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public int f133340a;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ b f133341e;

                static {
                    Covode.recordClassIndex(87216);
                }

                /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsReviewsViewModel$b$1$a */
                public static final class a implements ae<f> {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f133342a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ d f133343b;

                    static {
                        Covode.recordClassIndex(87217);
                    }

                    @Override // f.a.ae
                    public final void onSubscribe(f.a.b.b bVar) {
                        l.d(bVar, "");
                    }

                    @Override // f.a.ae
                    public final void onError(Throwable th) {
                        l.d(th, "");
                        this.f133343b.resumeWith(q.m223constructorimpl(f.a.a(new Exception(th.getMessage()))));
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // f.a.ae
                    public final /* synthetic */ void onSuccess(com.ss.android.ugc.aweme.shoutouts.model.f fVar) {
                        com.ss.android.ugc.aweme.shoutouts.review.b.b a2;
                        com.ss.android.ugc.aweme.shoutouts.model.f fVar2 = fVar;
                        l.d(fVar2, "");
                        if (fVar2.f133220a == 0) {
                            ArrayList<e> arrayList = fVar2.f133224e;
                            if (arrayList != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<e> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    e next = it.next();
                                    if (!(next == null || (a2 = com.ss.android.ugc.aweme.shoutouts.review.b.a.a(next)) == null)) {
                                        arrayList2.add(a2);
                                        this.f133342a.f133340a++;
                                    }
                                }
                                if (fVar2.f133222c) {
                                    this.f133343b.resumeWith(q.m223constructorimpl(f.a.a(null, Integer.valueOf(this.f133342a.f133340a), arrayList2, 1)));
                                } else {
                                    this.f133343b.resumeWith(q.m223constructorimpl(f.a.a(arrayList2)));
                                }
                            }
                        } else {
                            this.f133343b.resumeWith(q.m223constructorimpl(f.a.a(new Exception(this.f133342a.f133341e.this$0.f133338c))));
                        }
                    }

                    a(AnonymousClass1 r1, d dVar) {
                        this.f133342a = r1;
                        this.f133343b = dVar;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsReviewsViewModel$b$1$b  reason: collision with other inner class name */
                public static final class C3453b implements ae<com.ss.android.ugc.aweme.shoutouts.model.f> {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f133344a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ d f133345b;

                    static {
                        Covode.recordClassIndex(87218);
                    }

                    @Override // f.a.ae
                    public final void onSubscribe(f.a.b.b bVar) {
                        l.d(bVar, "");
                    }

                    @Override // f.a.ae
                    public final void onError(Throwable th) {
                        l.d(th, "");
                        this.f133345b.resumeWith(q.m223constructorimpl(f.a.a(new Exception(th.getMessage()))));
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // f.a.ae
                    public final /* synthetic */ void onSuccess(com.ss.android.ugc.aweme.shoutouts.model.f fVar) {
                        com.ss.android.ugc.aweme.shoutouts.review.b.b a2;
                        com.ss.android.ugc.aweme.shoutouts.model.f fVar2 = fVar;
                        l.d(fVar2, "");
                        if (fVar2.f133220a == 0) {
                            ArrayList<e> arrayList = fVar2.f133224e;
                            if (arrayList != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<e> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    e next = it.next();
                                    if (!(next == null || (a2 = com.ss.android.ugc.aweme.shoutouts.review.b.a.a(next)) == null)) {
                                        arrayList2.add(a2);
                                        this.f133344a.f133340a++;
                                    }
                                }
                                if (fVar2.f133222c) {
                                    this.f133345b.resumeWith(q.m223constructorimpl(f.a.a(null, Integer.valueOf(this.f133344a.f133340a), arrayList2, 1)));
                                } else {
                                    this.f133345b.resumeWith(q.m223constructorimpl(f.a.a(arrayList2)));
                                }
                            }
                        } else {
                            this.f133345b.resumeWith(q.m223constructorimpl(f.a.a(new Exception(this.f133344a.f133341e.this$0.f133338c))));
                        }
                    }

                    C3453b(AnonymousClass1 r1, d dVar) {
                        this.f133344a = r1;
                        this.f133345b = dVar;
                    }
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final void a(d<? super com.bytedance.ies.powerlist.page.f<Integer>> dVar) {
                    l.d(dVar, "");
                    ShoutoutsRatingListApi.a.a().getRatingList(this.f133341e.this$0.f133336a, this.f133341e.this$0.f133337b, this.f133340a, 10).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new C3453b(this, dVar));
                }

                {
                    this.f133341e = r1;
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final /* synthetic */ void b(d dVar, Object obj) {
                    ((Number) obj).intValue();
                    l.d(dVar, "");
                    ShoutoutsRatingListApi.a.a().getRatingList(this.f133341e.this$0.f133336a, this.f133341e.this$0.f133337b, this.f133340a, 10).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new a(this, dVar));
                }
            };
        }
    }

    public static final class c implements ae<BaseResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f133346a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f133347b;

        static {
            Covode.recordClassIndex(87219);
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            l.d(th, "");
            h.f.a.a aVar = this.f133347b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.ae
        public final /* synthetic */ void onSuccess(BaseResponse baseResponse) {
            BaseResponse baseResponse2 = baseResponse;
            l.d(baseResponse2, "");
            if (baseResponse2.status_code == 0) {
                h.f.a.a aVar = this.f133346a;
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            }
            h.f.a.a aVar2 = this.f133347b;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }

        public c(h.f.a.a aVar, h.f.a.a aVar2) {
            this.f133346a = aVar;
            this.f133347b = aVar2;
        }
    }
}
