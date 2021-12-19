package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.config.c;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.im.sdk.group.a.e;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import h.a.n;
import h.a.z;
import h.c.d;
import h.f.b.l;
import h.h;
import h.i;
import h.q;
import java.util.ArrayList;
import java.util.List;

public final class GroupListViewModel extends ac implements au {

    /* renamed from: d  reason: collision with root package name */
    public static final a f102774d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<IMConversation> f102775a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final t<Boolean> f102776b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<IMConversation> f102777c = new t<>();

    /* renamed from: e  reason: collision with root package name */
    private final h f102778e = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(65892);
    }

    public final com.bytedance.ies.powerlist.page.config.b<Long> a() {
        return (com.bytedance.ies.powerlist.page.config.b) this.f102778e.getValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65893);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<AnonymousClass2> {
        final /* synthetic */ GroupListViewModel this$0;

        static {
            Covode.recordClassIndex(65894);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(GroupListViewModel groupListViewModel) {
            super(0);
            this.this$0 = groupListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass2 invoke() {
            final a aVar = new a(this);
            final AnonymousClass1 r2 = new h.f.a.b<d<? super f<Long>>, a>() {
                /* class com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.GroupListViewModel.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(65895);
                }

                /* renamed from: a */
                public final a invoke(d<? super f<Long>> dVar) {
                    l.d(dVar, "");
                    a aVar = aVar;
                    aVar.a(dVar);
                    return aVar;
                }
            };
            c cVar = new c();
            cVar.f34358c = LoadingFooterCell.class;
            return new com.bytedance.ies.powerlist.page.config.b<Long>(this, cVar) {
                /* class com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.GroupListViewModel.b.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f102779a;

                static {
                    Covode.recordClassIndex(65896);
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final void a(d<? super f<Long>> dVar) {
                    l.d(dVar, "");
                    com.ss.android.ugc.aweme.im.service.m.a.c("GroupListViewModel", "onRefresh");
                    this.f102779a.this$0.f102775a.clear();
                    e.a.a();
                    e.a(0, r2.invoke(dVar));
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final /* synthetic */ void b(d dVar, Object obj) {
                    long longValue = ((Number) obj).longValue();
                    l.d(dVar, "");
                    com.ss.android.ugc.aweme.im.service.m.a.c("GroupListViewModel", "onLoadMore, from cursor: ".concat(String.valueOf(longValue)));
                    e.a.a();
                    e.a(longValue, r2.invoke(dVar));
                }

                {
                    this.f102779a = r1;
                }
            };
        }

        public static final class a extends com.bytedance.im.core.a.a.a<List<? extends com.bytedance.im.core.d.h>> {

            /* renamed from: a  reason: collision with root package name */
            public d<? super f<Long>> f102781a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f102782b;

            static {
                Covode.recordClassIndex(65897);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(b bVar) {
                this.f102782b = bVar;
            }

            public final void a(d<? super f<Long>> dVar) {
                l.d(dVar, "");
                this.f102781a = dVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
                if (((kotlinx.coroutines.m) r1).a() != false) goto L_0x0032;
             */
            @Override // com.bytedance.im.core.a.a.b
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(com.bytedance.im.core.d.u r5) {
                /*
                    r4 = this;
                    java.lang.String r1 = java.lang.String.valueOf(r5)
                    java.lang.String r0 = "GroupListViewModel"
                    com.ss.android.ugc.aweme.im.service.m.a.e(r0, r1)
                    android.content.Context r0 = com.bytedance.ies.ugc.appcontext.d.a()
                    com.ss.android.ugc.aweme.im.sdk.group.a.a.b.a(r0, r5)
                    h.c.d<? super com.bytedance.ies.powerlist.page.f<java.lang.Long>> r0 = r4.f102781a
                    java.lang.String r3 = "continuation"
                    if (r0 != 0) goto L_0x0019
                    h.f.b.l.a(r3)
                L_0x0019:
                    boolean r0 = r0 instanceof kotlinx.coroutines.m
                    r2 = 1
                    if (r0 == 0) goto L_0x0032
                    h.c.d<? super com.bytedance.ies.powerlist.page.f<java.lang.Long>> r1 = r4.f102781a
                    if (r1 != 0) goto L_0x0025
                    h.f.b.l.a(r3)
                L_0x0025:
                    java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<com.bytedance.ies.powerlist.page.PageValue<kotlin.Long>>"
                    java.util.Objects.requireNonNull(r1, r0)
                    kotlinx.coroutines.m r1 = (kotlinx.coroutines.m) r1
                    boolean r0 = r1.a()
                    if (r0 == 0) goto L_0x0044
                L_0x0032:
                    h.c.d<? super com.bytedance.ies.powerlist.page.f<java.lang.Long>> r1 = r4.f102781a
                    if (r1 != 0) goto L_0x0039
                    h.f.b.l.a(r3)
                L_0x0039:
                    com.bytedance.ies.powerlist.page.f$b r0 = com.bytedance.ies.powerlist.page.f.a.a()
                    java.lang.Object r0 = h.q.m223constructorimpl(r0)
                    r1.resumeWith(r0)
                L_0x0044:
                    com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.GroupListViewModel$b r0 = r4.f102782b
                    com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.GroupListViewModel r0 = r0.this$0
                    androidx.lifecycle.t<java.lang.Boolean> r1 = r0.f102776b
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    r1.postValue(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.GroupListViewModel.b.a.a(com.bytedance.im.core.d.u):void");
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, long, boolean] */
            @Override // com.bytedance.im.core.a.a.a
            public final /* synthetic */ void a(List<? extends com.bytedance.im.core.d.h> list, long j2, boolean z) {
                boolean z2;
                List<? extends com.bytedance.im.core.d.h> list2 = list;
                com.ss.android.ugc.aweme.im.service.m.a.c("GroupListViewModel", new StringBuilder("onResult, result size ").append(list2 != null ? Integer.valueOf(list2.size()) : null).append(", nextCursor: ").append(j2).append(", hasMore: ").append(z).toString());
                if (list2 == null || list2.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    d<? super f<Long>> dVar = this.f102781a;
                    if (dVar == null) {
                        l.a("continuation");
                    }
                    dVar.resumeWith(q.m223constructorimpl(f.a.a(z.INSTANCE)));
                } else {
                    List<com.bytedance.im.core.d.h> g2 = n.g((Iterable) list2);
                    ArrayList arrayList = new ArrayList(n.a((Iterable) g2, 10));
                    for (com.bytedance.im.core.d.h hVar : g2) {
                        arrayList.add(com.ss.android.ugc.aweme.im.sdk.common.controller.e.e.b(hVar));
                    }
                    this.f102782b.this$0.f102775a.addAll(arrayList);
                    if (z) {
                        d<? super f<Long>> dVar2 = this.f102781a;
                        if (dVar2 == null) {
                            l.a("continuation");
                        }
                        dVar2.resumeWith(q.m223constructorimpl(f.a.a(null, Long.valueOf(j2), null, 5)));
                    } else {
                        d<? super f<Long>> dVar3 = this.f102781a;
                        if (dVar3 == null) {
                            l.a("continuation");
                        }
                        dVar3.resumeWith(q.m223constructorimpl(f.a.a(z.INSTANCE)));
                    }
                }
                this.f102782b.this$0.f102776b.postValue(true);
            }
        }
    }
}
