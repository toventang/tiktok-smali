package com.ss.android.ugc.aweme.dsp.playpage.queue;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.dsp.playerservice.a.q;
import com.ss.android.ugc.aweme.utils.cg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class MDQueueViewModel extends AssemListViewModel<e, com.bytedance.ies.powerlist.b.a, Long> implements i, j {

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.extensions.i f83907k = new com.bytedance.assem.arch.extensions.i(true, new a(this, "play_page"));

    /* renamed from: l  reason: collision with root package name */
    private final h f83908l = h.i.a((h.f.a.a) new d(this));

    static {
        Covode.recordClassIndex(52317);
    }

    private final d.AnonymousClass1 k() {
        return (d.AnonymousClass1) this.f83908l.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(353, new g(MDQueueViewModel.class, "onExpiredPlayableEvent", com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public final c j() {
        return (c) this.f83907k.getValue();
    }

    static final class d extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ MDQueueViewModel this$0;

        static {
            Covode.recordClassIndex(52321);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(MDQueueViewModel mDQueueViewModel) {
            super(0);
            this.this$0 = mDQueueViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new Object(this) {
                /* class com.ss.android.ugc.aweme.dsp.playpage.queue.MDQueueViewModel.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f83909a;

                static {
                    Covode.recordClassIndex(52322);
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
                    this.f83909a = r1;
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
                public final void b(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
                    l.d(cVar, "");
                    this.f83909a.this$0.g();
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
                public final void b(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
                    l.d(dVar, "");
                    l.d(dVar, "");
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
                public final void a(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
                    l.d(dVar, "");
                    this.f83909a.this$0.g();
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
                public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.a aVar) {
                    l.d(aVar, "");
                    l.d(aVar, "");
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
                public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.b bVar) {
                    l.d(bVar, "");
                    l.d(bVar, "");
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
                public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.c cVar) {
                    l.d(cVar, "");
                    l.d(cVar, "");
                }

                /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
                    if (r2 != null) goto L_0x004c;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
                    if (r6 == null) goto L_0x0052;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
                    r6 = new com.ss.android.ugc.aweme.base.model.UrlModel();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
                    if (r2 == null) goto L_0x005f;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
                    r7 = r2.i();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
                    if (r7 != null) goto L_0x0062;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
                    r7 = "";
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
                    if (r2 == null) goto L_0x0068;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
                    r8 = r2.j();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
                    if (r8 != null) goto L_0x0069;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
                    r8 = "";
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
                    r10 = r1.f83737f;
                    h.f.b.l.d(r5, "");
                    h.f.b.l.d(r6, "");
                    h.f.b.l.d(r7, "");
                    h.f.b.l.d(r8, "");
                    h.f.b.l.d(r12, "");
                    r0.b(1, new com.ss.android.ugc.aweme.dsp.playpage.model.b(r5, r6, r7, r8, r12, r10));
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
                    return;
                 */
                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.f r12) {
                    /*
                    // Method dump skipped, instructions count: 131
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.playpage.queue.MDQueueViewModel.d.AnonymousClass1.a(com.ss.android.ugc.aweme.dsp.playerservice.c.f):void");
                }

                @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
                public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.g gVar) {
                    l.d(gVar, "");
                    l.d(gVar, "");
                }
            };
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ com.bytedance.assem.arch.viewModel.j f() {
        return new e();
    }

    public static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ String $identify;
        final /* synthetic */ AssemViewModel $this_hierarchyData;

        static {
            Covode.recordClassIndex(52318);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.$this_hierarchyData = assemViewModel;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [com.ss.android.ugc.aweme.dsp.playpage.queue.c, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.dsp.playpage.queue.c invoke() {
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
                java.lang.Class<com.ss.android.ugc.aweme.dsp.playpage.queue.c> r1 = com.ss.android.ugc.aweme.dsp.playpage.queue.c.class
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.playpage.queue.MDQueueViewModel.a.invoke():java.lang.Object");
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void c() {
        super.c();
        j().f83916a.a().a((q) k());
        j().f83916a.a().a((com.ss.android.ugc.aweme.dsp.playerservice.a.j) k());
        cg.a(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ac
    public final void onCleared() {
        j().f83916a.a().b((q) k());
        j().f83916a.a().b((com.ss.android.ugc.aweme.dsp.playerservice.a.j) k());
        cg.b(this);
        super.onCleared();
    }

    static final class e extends m implements h.f.a.b<e, e> {
        final /* synthetic */ com.bytedance.ext_power_list.a $newListState;

        static {
            Covode.recordClassIndex(52323);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.bytedance.ext_power_list.a aVar) {
            super(1);
            this.$newListState = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ e invoke(e eVar) {
            l.d(eVar, "");
            com.bytedance.ext_power_list.a aVar = this.$newListState;
            l.d(aVar, "");
            return new e(aVar);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final void a(com.bytedance.ext_power_list.a<com.bytedance.ies.powerlist.b.a> aVar) {
        l.d(aVar, "");
        a((h.f.a.b) new e(aVar));
    }

    @r(a = ThreadMode.MAIN)
    public final void onExpiredPlayableEvent(com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.a aVar) {
        l.d(aVar, "");
        List i2 = i();
        if (i2 != null) {
            int i3 = 0;
            for (Object obj : i2) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    n.a();
                }
                com.bytedance.ies.powerlist.b.a aVar2 = (com.bytedance.ies.powerlist.b.a) obj;
                if (aVar2 instanceof com.ss.android.ugc.aweme.dsp.playpage.model.e) {
                    com.ss.android.ugc.aweme.dsp.playpage.model.e eVar = (com.ss.android.ugc.aweme.dsp.playpage.model.e) aVar2;
                    boolean a2 = com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b.a(eVar.f83739a);
                    if (eVar.f83743e != a2) {
                        String str = eVar.f83739a;
                        UrlModel urlModel = eVar.f83740b;
                        String str2 = eVar.f83741c;
                        String str3 = eVar.f83742d;
                        h.f.a.m<String, Context, z> mVar = eVar.f83744f;
                        l.d(str, "");
                        l.d(urlModel, "");
                        l.d(str2, "");
                        l.d(str3, "");
                        b(i3, new com.ss.android.ugc.aweme.dsp.playpage.model.e(str, urlModel, str2, str3, a2, mVar));
                    }
                }
                i3 = i4;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0064, code lost:
        if (r8 == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0066, code lost:
        r8 = new com.ss.android.ugc.aweme.base.model.UrlModel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006b, code lost:
        if (r4 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006d, code lost:
        r9 = r4.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0071, code lost:
        if (r9 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        if (r4 == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        r1 = r4.j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007a, code lost:
        if (r1 != null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007c, code lost:
        r0.add(new com.ss.android.ugc.aweme.dsp.playpage.model.b(r7, r8, r9, r10, r11, new com.ss.android.ugc.aweme.dsp.playpage.queue.MDQueueViewModel.c(r13)));
        r0.add(new com.ss.android.ugc.aweme.dsp.playpage.model.f());
        r2 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0097, code lost:
        if (r2.hasNext() == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0099, code lost:
        r1 = r2.next();
        r0.add(new com.ss.android.ugc.aweme.dsp.playpage.model.e(r1.a(), r1.l(), r1.i(), r1.j(), com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b.a(r1.a()), new com.ss.android.ugc.aweme.dsp.playpage.queue.MDQueueViewModel.b(r13, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c5, code lost:
        r10 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00db, code lost:
        if (h.f.b.l.a(j().f83916a.k(), com.ss.android.ugc.aweme.dsp.playerservice.c.e.f83415c) == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00dd, code lost:
        r0.add(new com.ss.android.ugc.aweme.dsp.playpage.model.d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e9, code lost:
        return com.bytedance.ies.powerlist.page.f.a.a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005e, code lost:
        if (r4 != null) goto L_0x0060;
     */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(h.c.d<? super com.bytedance.ies.powerlist.page.f<java.lang.Long>> r14) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.playpage.queue.MDQueueViewModel.a(h.c.d):java.lang.Object");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.c.d] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* synthetic */ Object a(Long l2, h.c.d<? super f<Long>> dVar) {
        l2.longValue();
        return f.a.a(h.a.z.INSTANCE);
    }

    static final class b extends m implements h.f.a.m<String, Context, z> {
        final /* synthetic */ List $itemList$inlined;
        final /* synthetic */ MDQueueViewModel this$0;

        static {
            Covode.recordClassIndex(52319);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(MDQueueViewModel mDQueueViewModel, List list) {
            super(2);
            this.this$0 = mDQueueViewModel;
            this.$itemList$inlined = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Context context) {
            String str2 = str;
            Context context2 = context;
            l.d(str2, "");
            l.d(context2, "");
            this.this$0.a(str2, context2);
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.m<String, Context, z> {
        final /* synthetic */ MDQueueViewModel this$0;

        static {
            Covode.recordClassIndex(52320);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(MDQueueViewModel mDQueueViewModel) {
            super(2);
            this.this$0 = mDQueueViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Context context) {
            String str2 = str;
            Context context2 = context;
            l.d(str2, "");
            l.d(context2, "");
            com.ss.android.ugc.aweme.dsp.playerservice.f.a a2 = this.this$0.j().f83916a.a();
            com.ss.android.ugc.aweme.dsp.playerservice.c.f e2 = a2.f83565a.e();
            if (e2.isPlayingState()) {
                a2.f(new com.ss.android.ugc.aweme.dsp.playerservice.b.f("PAUSE_FROM_USER_PAUSE"));
            } else if (e2.isPauseState()) {
                a2.g(new com.ss.android.ugc.aweme.dsp.playerservice.b.f("RESUME_FROM_USER_RESUME"));
            } else {
                this.this$0.a(str2, context2);
            }
            return z.f158842a;
        }
    }

    public final void a(String str, Context context) {
        com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar;
        com.ss.android.ugc.aweme.dsp.playerservice.b.j a2 = j().f83916a.a().a(str);
        int i2 = f.f83918a[a2.f83394a.ordinal()];
        if (i2 == 3 || i2 == 4) {
            while (context != null) {
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity != null) {
                        new com.bytedance.tux.g.b(activity).e(R.string.dbd).b();
                        return;
                    }
                    return;
                } else if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    return;
                }
            }
        } else if (i2 == 5) {
            com.bytedance.services.apm.api.a.a("MDQueueViewModel startPlayCurrentPlayableQueue error");
        } else if (i2 == 6 && (cVar = a2.f83395b) != null) {
            com.ss.android.ugc.aweme.dsp.b.b.a(context, cVar, j().f83916a.n());
        }
    }
}
