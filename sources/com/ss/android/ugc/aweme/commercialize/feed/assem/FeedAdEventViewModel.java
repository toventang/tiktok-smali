package com.ss.android.ugc.aweme.commercialize.feed.assem;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.b.c;
import h.f.b.l;
import h.f.b.m;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class FeedAdEventViewModel extends AssemViewModel<r> implements i, j {
    static {
        Covode.recordClassIndex(45634);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(378, new g(FeedAdEventViewModel.class, "onShowPopUpWebPageInFeedEvent", com.ss.android.ugc.aweme.commercialize.feed.assem.popup.b.b.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(379, new g(FeedAdEventViewModel.class, "onClickFromButtonEvent", c.class, ThreadMode.BACKGROUND, 0, false));
        return hashMap;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ r f() {
        return new r();
    }

    public FeedAdEventViewModel() {
        EventBus.a(EventBus.a(), this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        EventBus.a().b(this);
    }

    @r(a = ThreadMode.BACKGROUND)
    public final void onClickFromButtonEvent(c cVar) {
        l.d(cVar, "");
        a(new a(cVar));
    }

    static final class a extends m implements h.f.a.b<r, r> {
        final /* synthetic */ c $event;

        static {
            Covode.recordClassIndex(45635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(1);
            this.$event = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ r invoke(r rVar) {
            r rVar2 = rVar;
            l.d(rVar2, "");
            return r.a(rVar2, null, new com.bytedance.assem.arch.extensions.a(Boolean.valueOf(this.$event.f74134a)), null, null, null, 29);
        }
    }

    static final class b extends m implements h.f.a.b<r, r> {
        final /* synthetic */ com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b $this_apply;

        static {
            Covode.recordClassIndex(45636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b bVar) {
            super(1);
            this.$this_apply = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ r invoke(r rVar) {
            r rVar2 = rVar;
            l.d(rVar2, "");
            return r.a(rVar2, new com.bytedance.assem.arch.extensions.a(this.$this_apply), null, null, null, null, 30);
        }
    }

    @r(a = ThreadMode.BACKGROUND)
    public final void onShowPopUpWebPageInFeedEvent(com.ss.android.ugc.aweme.commercialize.feed.assem.popup.b.b bVar) {
        l.d(bVar, "");
        com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b bVar2 = bVar.f74133a;
        if (bVar2 != null) {
            a(new b(bVar2));
        }
    }
}
