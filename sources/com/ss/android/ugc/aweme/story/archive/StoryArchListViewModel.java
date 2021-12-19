package com.ss.android.ugc.aweme.story.archive;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import h.a.n;
import h.c.b.a.d;
import h.f.b.l;
import h.f.b.m;
import java.util.Iterator;
import java.util.List;

public final class StoryArchListViewModel extends BaseDetailShareVM<h, g, Long> {

    /* renamed from: m  reason: collision with root package name */
    private long f136733m;

    /* access modifiers changed from: package-private */
    public static final class a extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ StoryArchListViewModel this$0;

        static {
            Covode.recordClassIndex(89313);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(StoryArchListViewModel storyArchListViewModel, h.c.d dVar) {
            super(dVar);
            this.this$0 = storyArchListViewModel;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(0, this);
        }
    }

    static {
        Covode.recordClassIndex(89312);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final int getPageType(int i2) {
        return 40;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new h();
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object a(h.c.d<? super f<Long>> dVar) {
        return a(0, dVar);
    }

    static final class b extends m implements h.f.a.b<h, h> {
        final /* synthetic */ com.bytedance.ext_power_list.a $newListState;

        static {
            Covode.recordClassIndex(89314);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.bytedance.ext_power_list.a aVar) {
            super(1);
            this.$newListState = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h invoke(h hVar) {
            h hVar2 = hVar;
            l.d(hVar2, "");
            return h.a(hVar2, this.$newListState, null, 2);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final /* synthetic */ Long a(com.ss.android.ugc.aweme.feed.param.b bVar) {
        l.d(bVar, "");
        return Long.valueOf(this.f136733m);
    }

    static final class c extends m implements h.f.a.b<h, h> {
        final /* synthetic */ String $awemeId;

        static {
            Covode.recordClassIndex(89315);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.$awemeId = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h invoke(h hVar) {
            h hVar2 = hVar;
            l.d(hVar2, "");
            return h.a(hVar2, null, new com.bytedance.assem.arch.extensions.a(this.$awemeId), 1);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int a(String str) {
        l.d(str, "");
        List i2 = i();
        int i3 = -1;
        if (i2 != null) {
            int i4 = 0;
            Iterator it = i2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (l.a((Object) ((g) it.next()).f136756a.getAid(), (Object) str)) {
                    i3 = i4;
                    if (i3 >= 0) {
                        a(i3);
                    }
                } else {
                    i4++;
                }
            }
        }
        return i3;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final void a(com.bytedance.ext_power_list.a<g> aVar) {
        l.d(aVar, "");
        a((h.f.a.b) new b(aVar));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final /* synthetic */ Aweme b(g gVar) {
        boolean z;
        g gVar2 = gVar;
        l.d(gVar2, "");
        Aweme aweme = gVar2.f136756a;
        l.d(aweme, "");
        if (aweme.getAwemeType() != 40 || aweme.getUserStory() != null) {
            return aweme;
        }
        Aweme aweme2 = new Aweme();
        aweme2.setAid(aweme.getAid());
        Aweme a2 = AwemeService.b().a(aweme);
        l.b(a2, "");
        List c2 = n.c(a2);
        Story story = aweme.getStory();
        if (story != null) {
            z = story.getViewed();
        } else {
            z = false;
        }
        UserStory userStory = new UserStory(c2, 1, 0, z, 0, 0, false, false, 0, 1, null, false, false, true, 7668, null);
        com.ss.android.ugc.aweme.story.j.a.b("huangxin.2020", "origin total count: " + userStory.getOriginTotalCount() + ", user story instance: " + System.identityHashCode(userStory));
        aweme2.setUserStory(userStory);
        aweme2.setAwemeType(40);
        aweme2.setAuthor(aweme.getAuthor());
        aweme2.setRequestId(aweme.getRequestId());
        return aweme2;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* synthetic */ Object a(Object obj, h.c.d dVar) {
        return a(((Number) obj).longValue(), dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055 A[Catch:{ Exception -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0097 A[Catch:{ Exception -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009f A[Catch:{ Exception -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2 A[Catch:{ Exception -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r9, h.c.d<? super com.bytedance.ies.powerlist.page.f<java.lang.Long>> r11) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.archive.StoryArchListViewModel.a(long, h.c.d):java.lang.Object");
    }
}
