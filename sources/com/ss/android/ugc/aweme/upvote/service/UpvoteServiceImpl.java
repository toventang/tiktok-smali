package com.ss.android.ugc.aweme.upvote.service;

import android.widget.FrameLayout;
import androidx.fragment.app.e;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.c.h;
import com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteFeedBubble;
import com.ss.android.ugc.aweme.upvote.detail.d;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.ss.android.ugc.aweme.upvote.publish.c;
import com.ss.android.ugc.aweme.upvote.publish.g;
import com.zhiliaoapp.musically.R;
import h.a.i;
import h.a.z;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class UpvoteServiceImpl implements IUpvoteService {

    public static final class a extends m implements h.f.a.b<g, g> {
        public static final a INSTANCE = new a();

        static {
            Covode.recordClassIndex(93082);
        }

        public a() {
            super(1);
        }

        public final g invoke(g gVar) {
            l.c(gVar, "");
            return gVar;
        }
    }

    public static final class b extends m implements h.f.a.b<g, g> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(93083);
        }

        public b() {
            super(1);
        }

        public final g invoke(g gVar) {
            l.c(gVar, "");
            return gVar;
        }
    }

    static {
        Covode.recordClassIndex(93081);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final int a() {
        return R.layout.bib;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void b() {
        com.ss.android.ugc.aweme.base.utils.m.a(c.b.f142300a);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void c() {
        com.ss.android.ugc.aweme.upvote.detail.b.a().clear();
        com.ss.android.ugc.aweme.upvote.detail.b.b().clear();
        com.ss.android.ugc.aweme.upvote.detail.b.d().evictAll();
        com.ss.android.ugc.aweme.upvote.detail.b.c().clear();
    }

    public static IUpvoteService d() {
        MethodCollector.i(7296);
        Object a2 = com.ss.android.ugc.b.a(IUpvoteService.class, false);
        if (a2 != null) {
            IUpvoteService iUpvoteService = (IUpvoteService) a2;
            MethodCollector.o(7296);
            return iUpvoteService;
        }
        if (com.ss.android.ugc.b.eu == null) {
            synchronized (IUpvoteService.class) {
                try {
                    if (com.ss.android.ugc.b.eu == null) {
                        com.ss.android.ugc.b.eu = new UpvoteServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7296);
                    throw th;
                }
            }
        }
        UpvoteServiceImpl upvoteServiceImpl = (UpvoteServiceImpl) com.ss.android.ugc.b.eu;
        MethodCollector.o(7296);
        return upvoteServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final Integer b(String str) {
        l.d(str, "");
        l.d(str, "");
        return com.ss.android.ugc.aweme.upvote.detail.b.b().get(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final AssemViewModel<g> a(e eVar) {
        l.d(eVar, "");
        return (UpvotePublishVM) new com.bytedance.assem.a.a(ab.a(UpvotePublishVM.class), null, u.j.f25671a, u.a((androidx.lifecycle.m) eVar, false), u.c.f25670a, b.INSTANCE, u.a(eVar), u.b(eVar)).getValue();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final List<h> a(String str) {
        List<h> upvotes;
        l.d(str, "");
        com.ss.android.ugc.aweme.upvote.c.e b2 = com.ss.android.ugc.aweme.upvote.detail.b.b(str);
        if (b2 == null || (upvotes = b2.getUpvotes()) == null) {
            return z.INSTANCE;
        }
        return upvotes;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final com.ss.android.ugc.aweme.upvote.event.a c(String str) {
        boolean z;
        String str2;
        l.d(str, "");
        com.ss.android.ugc.aweme.upvote.c.e b2 = com.ss.android.ugc.aweme.upvote.detail.b.b(str);
        if (b2 == null) {
            return new com.ss.android.ugc.aweme.upvote.event.a();
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        String curUserId = g2.getCurUserId();
        List<h> upvotes = b2.getUpvotes();
        if (!(upvotes instanceof Collection) || !upvotes.isEmpty()) {
            Iterator<T> it = upvotes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                User user = it.next().getUser();
                if (user != null) {
                    str2 = user.getUid();
                } else {
                    str2 = null;
                }
                if (l.a((Object) str2, (Object) curUserId)) {
                    z = true;
                    break;
                }
            }
            return new com.ss.android.ugc.aweme.upvote.event.a(true, (int) b2.getTotal(), z);
        }
        z = false;
        return new com.ss.android.ugc.aweme.upvote.event.a(true, (int) b2.getTotal(), z);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void a(List<? extends Aweme> list) {
        Integer num;
        l.d(list, "");
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t : list) {
            String aid = t.getAid();
            if (aid != null) {
                InteractPermission interactPermission = t.getInteractPermission();
                if (interactPermission != null) {
                    num = Integer.valueOf(interactPermission.getUpvote());
                    if (num != null) {
                        com.ss.android.ugc.aweme.upvote.detail.b.a(aid, num.intValue());
                    }
                } else {
                    num = null;
                }
                UpvoteReason upvoteReason = t.getUpvoteReason();
                if (upvoteReason != null) {
                    l.b(upvoteReason, "");
                    if (num != null && num.intValue() == 0) {
                        arrayList.add(aid);
                        arrayList2.add(upvoteReason);
                        l.d(aid, "");
                        l.d(upvoteReason, "");
                        com.ss.android.ugc.aweme.upvote.detail.b.a().put(aid, upvoteReason);
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            d.a(arrayList, arrayList2);
        }
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void a(String str, int i2) {
        l.d(str, "");
        com.ss.android.ugc.aweme.upvote.detail.b.a(str, i2);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final com.ss.android.ugc.aweme.upvote.a.a a(FrameLayout frameLayout, androidx.lifecycle.m mVar) {
        l.d(frameLayout, "");
        l.d(mVar, "");
        if (!com.ss.android.ugc.aweme.upvote.b.a.a()) {
            return null;
        }
        return new UpvoteFeedBubble(frameLayout, mVar);
    }

    static final class c extends m implements h.f.a.m<com.bytedance.tiktok.proxy.d, com.bytedance.assem.arch.extensions.a<? extends p<? extends Integer, ? extends String>>, h.z> {
        final /* synthetic */ com.ss.android.ugc.aweme.upvote.publish.a $listener$inlined;

        static {
            Covode.recordClassIndex(93084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.ss.android.ugc.aweme.upvote.publish.a aVar) {
            super(2);
            this.$listener$inlined = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.tiktok.proxy.d dVar, com.bytedance.assem.arch.extensions.a<? extends p<? extends Integer, ? extends String>> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends p<? extends Integer, ? extends String>> aVar2 = aVar;
            l.d(dVar, "");
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                int intValue = ((Number) t.component1()).intValue();
                String str = (String) t.component2();
                if (i.a(new Integer[]{1, 2}, Integer.valueOf(intValue))) {
                    this.$listener$inlined.a(str);
                }
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void a(com.bytedance.assem.arch.viewModel.h hVar, com.ss.android.ugc.aweme.upvote.publish.a aVar) {
        l.d(hVar, "");
        l.d(aVar, "");
        f.a.a(hVar, (AssemViewModel) new com.bytedance.assem.a.a(ab.a(UpvotePublishVM.class), null, u.j.f25671a, u.a((androidx.lifecycle.m) hVar, false), u.c.f25670a, a.INSTANCE, null, null).getValue(), b.f142310a, com.bytedance.assem.arch.viewModel.l.a(), new c(aVar), 4);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void a(String str, UpvotePublishMobParam upvotePublishMobParam) {
        l.d(str, "");
        l.d(upvotePublishMobParam, "");
        com.ss.android.ugc.aweme.upvote.publish.c.a(str, upvotePublishMobParam);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void a(String str, boolean z, UpvotePublishMobParam upvotePublishMobParam, h.f.a.a<h.z> aVar) {
        l.d(str, "");
        l.d(upvotePublishMobParam, "");
        com.ss.android.ugc.aweme.upvote.publish.c.a(str, z, upvotePublishMobParam, aVar);
    }
}
