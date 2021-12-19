package com.ss.android.ugc.aweme.story.interaction.c;

import androidx.fragment.app.e;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.feed.adapter.cf;
import com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleEmojiCell;
import com.ss.android.ugc.aweme.story.interaction.vm.StoryViewerListViewModel;
import com.ss.android.ugc.aweme.story.view.ReactionBubbleList;
import h.a.n;
import h.a.z;
import h.c.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import h.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class f extends a implements u<b> {

    /* renamed from: d  reason: collision with root package name */
    public final String f137897d;

    /* renamed from: e  reason: collision with root package name */
    public final cf f137898e;

    /* renamed from: f  reason: collision with root package name */
    private final h f137899f = i.a((h.f.a.a) new a(this));

    /* renamed from: g  reason: collision with root package name */
    private d<? super com.bytedance.ies.powerlist.page.f<b>> f137900g;

    static {
        Covode.recordClassIndex(90198);
    }

    private final StoryViewerListViewModel d() {
        return (StoryViewerListViewModel) this.f137899f.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final boolean a() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final void b() {
        this.f137872c.a(ReactionBubbleEmojiCell.class);
    }

    static final class a extends m implements h.f.a.a<StoryViewerListViewModel> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(90199);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryViewerListViewModel invoke() {
            e activity = this.this$0.f137898e.f91768c.getActivity();
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            e activity2 = this.this$0.f137898e.f91768c.getActivity();
            if (activity2 == null) {
                l.b();
            }
            l.b(activity2, "");
            return StoryViewerListViewModel.a.a(activity, activity2);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final void a(d<? super com.bytedance.ies.powerlist.page.f<b>> dVar) {
        l.d(dVar, "");
        this.f137900g = dVar;
        d().a(this.f137870a, 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(b bVar) {
        String str;
        b bVar2 = bVar;
        if (bVar2 != null && (str = bVar2.f67014a) != null) {
            switch (str.hashCode()) {
                case -2122462547:
                    if (str.equals("LOAD_MORE_STORY_VIEWER_LIST_FAIL") && l.a(bVar2.a(), (Object) this.f137870a)) {
                        d<? super com.bytedance.ies.powerlist.page.f<b>> dVar = this.f137900g;
                        if (dVar != null) {
                            dVar.resumeWith(q.m223constructorimpl(f.a.a(new Exception())));
                        }
                        this.f137900g = null;
                        return;
                    }
                    return;
                case -738219936:
                    if (str.equals("REFRESH_STORY_VIEWER_LIST_FAIL") && l.a(bVar2.a(), (Object) this.f137870a)) {
                        d<? super com.bytedance.ies.powerlist.page.f<b>> dVar2 = this.f137900g;
                        if (dVar2 != null) {
                            dVar2.resumeWith(q.m223constructorimpl(f.a.a(new Exception())));
                        }
                        this.f137900g = null;
                        return;
                    }
                    return;
                case -553717260:
                    if (str.equals("LOAD_MORE_STORY_VIEWER_LIST_SUCCESS")) {
                        a(bVar2, false);
                        return;
                    }
                    return;
                case 1436898145:
                    if (str.equals("REFRESH_STORY_VIEWER_LIST_SUCCESS")) {
                        a(bVar2, true);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final void a(d<? super com.bytedance.ies.powerlist.page.f<b>> dVar, b bVar) {
        l.d(dVar, "");
        l.d(bVar, "");
        this.f137900g = dVar;
        d().a(this.f137870a, bVar.f137876b);
    }

    private final void a(b bVar, boolean z) {
        p pVar = (p) bVar.a();
        if (l.a(pVar.getFirst(), (Object) this.f137870a)) {
            com.ss.android.ugc.aweme.story.model.i iVar = (com.ss.android.ugc.aweme.story.model.i) pVar.getSecond();
            List<com.ss.android.ugc.aweme.story.model.h> viewerList = iVar.getViewerList();
            if (viewerList == null) {
                viewerList = z.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(n.a((Iterable) viewerList, 10));
            Iterator<T> it = viewerList.iterator();
            while (it.hasNext()) {
                arrayList.add(com.ss.android.ugc.aweme.story.interaction.b.d.a((com.ss.android.ugc.aweme.story.model.h) it.next(), this.f137872c.getMobEventParam()));
            }
            ArrayList arrayList2 = arrayList;
            if (iVar.getHasMore()) {
                d<? super com.bytedance.ies.powerlist.page.f<b>> dVar = this.f137900g;
                if (dVar != null) {
                    dVar.resumeWith(q.m223constructorimpl(f.a.a(null, new b(2, iVar.getCursor()), arrayList2, 1)));
                }
            } else {
                d<? super com.bytedance.ies.powerlist.page.f<b>> dVar2 = this.f137900g;
                if (dVar2 != null) {
                    dVar2.resumeWith(q.m223constructorimpl(f.a.a(arrayList2)));
                }
            }
            this.f137900g = null;
            if (z && (!arrayList2.isEmpty())) {
                this.f137872c.r();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(String str, cf cfVar, ReactionBubbleList reactionBubbleList) {
        super(reactionBubbleList);
        l.d(cfVar, "");
        l.d(reactionBubbleList, "");
        this.f137897d = str;
        this.f137898e = cfVar;
        StoryViewerListViewModel d2 = d();
        d2.a("REFRESH_STORY_VIEWER_LIST_SUCCESS", (u<b>) this);
        d2.a("REFRESH_STORY_VIEWER_LIST_FAIL", (u<b>) this);
        d2.a("LOAD_MORE_STORY_VIEWER_LIST_SUCCESS", (u<b>) this);
        d2.a("LOAD_MORE_STORY_VIEWER_LIST_FAIL", (u<b>) this);
    }
}
