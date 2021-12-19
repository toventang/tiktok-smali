package com.ss.android.ugc.aweme.story.interaction.c;

import androidx.fragment.app.e;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.comment.c.c;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.feed.adapter.cf;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleCommentCell;
import com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleEmojiCell;
import com.ss.android.ugc.aweme.story.interaction.vm.StoryCommentListViewModel;
import com.ss.android.ugc.aweme.story.interaction.vm.StoryViewerListViewModel;
import com.ss.android.ugc.aweme.story.view.ReactionBubbleList;
import com.ss.android.ugc.aweme.utils.cg;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.p;
import h.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class d extends a implements u<com.ss.android.ugc.aweme.arch.widgets.base.b>, i, j {

    /* renamed from: d  reason: collision with root package name */
    public final String f137885d;

    /* renamed from: e  reason: collision with root package name */
    private final h f137886e;

    /* renamed from: f  reason: collision with root package name */
    private final h f137887f;

    /* renamed from: g  reason: collision with root package name */
    private List<? extends com.bytedance.ies.powerlist.b.a> f137888g;

    /* renamed from: h  reason: collision with root package name */
    private h.c.d<? super f<b>> f137889h;

    static {
        Covode.recordClassIndex(90193);
    }

    private final StoryCommentListViewModel d() {
        return (StoryCommentListViewModel) this.f137886e.getValue();
    }

    private final StoryViewerListViewModel e() {
        return (StoryViewerListViewModel) this.f137887f.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final boolean a() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(85, new g(d.class, "onCommentDeleteEvent", c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @r(a = ThreadMode.MAIN)
    public final void onCommentDeleteEvent(c cVar) {
        l.d(cVar, "");
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final void c() {
        super.c();
        cg.b(this);
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final void b() {
        this.f137872c.a(ReactionBubbleCommentCell.class, ReactionBubbleEmojiCell.class);
    }

    static final class a extends m implements h.f.a.a<StoryCommentListViewModel> {
        final /* synthetic */ cf $params;

        static {
            Covode.recordClassIndex(90194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(cf cfVar) {
            super(0);
            this.$params = cfVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryCommentListViewModel invoke() {
            e activity = this.$params.f91768c.getActivity();
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            e activity2 = this.$params.f91768c.getActivity();
            if (activity2 == null) {
                l.b();
            }
            l.b(activity2, "");
            return StoryCommentListViewModel.a.a(activity, activity2);
        }
    }

    static final class b extends m implements h.f.a.a<StoryViewerListViewModel> {
        final /* synthetic */ cf $params;

        static {
            Covode.recordClassIndex(90195);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(cf cfVar) {
            super(0);
            this.$params = cfVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryViewerListViewModel invoke() {
            e activity = this.$params.f91768c.getActivity();
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            e activity2 = this.$params.f91768c.getActivity();
            if (activity2 == null) {
                l.b();
            }
            l.b(activity2, "");
            return StoryViewerListViewModel.a.a(activity, activity2);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final void a(Aweme aweme) {
        l.d(aweme, "");
        super.a(aweme);
        cg.a(this);
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final void a(h.c.d<? super f<b>> dVar) {
        l.d(dVar, "");
        this.f137889h = dVar;
        d().a(this.f137870a, 0);
    }

    private final void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        if (l.a(bVar.a(), (Object) this.f137870a)) {
            h.c.d<? super f<b>> dVar = this.f137889h;
            if (dVar != null) {
                dVar.resumeWith(q.m223constructorimpl(f.a.a(new Exception())));
            }
            this.f137889h = null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
        if (bVar2 != null && (str = bVar2.f67014a) != null) {
            switch (str.hashCode()) {
                case -2122462547:
                    if (str.equals("LOAD_MORE_STORY_VIEWER_LIST_FAIL")) {
                        a(bVar2);
                        return;
                    }
                    return;
                case -1108427715:
                    if (str.equals("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS")) {
                        p pVar = (p) bVar2.a();
                        if (l.a(pVar.getFirst(), (Object) this.f137870a)) {
                            a((CommentItemList) pVar.getSecond(), false);
                            return;
                        }
                        return;
                    }
                    return;
                case -738219936:
                    if (str.equals("REFRESH_STORY_VIEWER_LIST_FAIL")) {
                        a(bVar2);
                        return;
                    }
                    return;
                case -553717260:
                    if (str.equals("LOAD_MORE_STORY_VIEWER_LIST_SUCCESS")) {
                        p pVar2 = (p) bVar2.a();
                        if (l.a(pVar2.getFirst(), (Object) this.f137870a)) {
                            a((com.ss.android.ugc.aweme.story.model.i) pVar2.getSecond(), false);
                            return;
                        }
                        return;
                    }
                    return;
                case -108517967:
                    if (str.equals("REFRESH_STORY_COMMENT_LIST_FAIL")) {
                        a(bVar2);
                        return;
                    }
                    return;
                case -70365948:
                    if (str.equals("LOAD_MORE_STORY_COMMENT_LIST_FAIL")) {
                        a(bVar2);
                        return;
                    }
                    return;
                case 471107696:
                    if (str.equals("REFRESH_STORY_COMMENT_LIST_SUCCESS")) {
                        p pVar3 = (p) bVar2.a();
                        if (l.a(pVar3.getFirst(), (Object) this.f137870a)) {
                            a((CommentItemList) pVar3.getSecond(), true);
                            return;
                        }
                        return;
                    }
                    return;
                case 1436898145:
                    if (str.equals("REFRESH_STORY_VIEWER_LIST_SUCCESS")) {
                        p pVar4 = (p) bVar2.a();
                        if (l.a(pVar4.getFirst(), (Object) this.f137870a)) {
                            a((com.ss.android.ugc.aweme.story.model.i) pVar4.getSecond(), true);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final void a(h.c.d<? super f<b>> dVar, b bVar) {
        l.d(dVar, "");
        l.d(bVar, "");
        this.f137889h = dVar;
        if (bVar.f137875a == 1) {
            d().a(this.f137870a, bVar.f137876b);
        } else {
            e().a(this.f137870a, bVar.f137876b);
        }
    }

    private final void a(CommentItemList commentItemList, boolean z) {
        List<Comment> list = commentItemList.items;
        if (list == null) {
            list = z.INSTANCE;
        }
        ArrayList<Comment> arrayList = new ArrayList();
        for (Comment comment : list) {
            l.b(comment, "");
            arrayList.add(comment);
            List<Comment> replyComments = comment.getReplyComments();
            if (replyComments != null) {
                arrayList.addAll(replyComments);
            }
        }
        ArrayList arrayList2 = new ArrayList(n.a((Iterable) arrayList, 10));
        for (Comment comment2 : arrayList) {
            arrayList2.add(com.ss.android.ugc.aweme.story.interaction.b.b.a(comment2, this.f137872c.getMobEventParam()));
        }
        ArrayList arrayList3 = arrayList2;
        if (commentItemList.hasMore) {
            h.c.d<? super f<b>> dVar = this.f137889h;
            if (dVar != null) {
                dVar.resumeWith(q.m223constructorimpl(f.a.a(null, new b(1, commentItemList.cursor), arrayList3, 1)));
            }
            this.f137889h = null;
            if (z && (!list.isEmpty())) {
                this.f137872c.r();
                return;
            }
            return;
        }
        this.f137888g = arrayList3;
        e().a(this.f137870a, 0);
    }

    private final void a(com.ss.android.ugc.aweme.story.model.i iVar, boolean z) {
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
        Collection collection = this.f137888g;
        if (collection == null) {
            collection = z.INSTANCE;
        }
        List d2 = n.d(collection, (Iterable) arrayList2);
        this.f137888g = null;
        if (iVar.getHasMore()) {
            h.c.d<? super f<b>> dVar = this.f137889h;
            if (dVar != null) {
                dVar.resumeWith(q.m223constructorimpl(f.a.a(null, new b(2, iVar.getCursor()), d2, 1)));
            }
        } else {
            h.c.d<? super f<b>> dVar2 = this.f137889h;
            if (dVar2 != null) {
                dVar2.resumeWith(q.m223constructorimpl(f.a.a(d2)));
            }
        }
        this.f137889h = null;
        if (z && (!d2.isEmpty())) {
            this.f137872c.r();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str, cf cfVar, ReactionBubbleList reactionBubbleList) {
        super(reactionBubbleList);
        l.d(cfVar, "");
        l.d(reactionBubbleList, "");
        this.f137885d = str;
        this.f137886e = h.i.a((h.f.a.a) new a(cfVar));
        this.f137887f = h.i.a((h.f.a.a) new b(cfVar));
        StoryCommentListViewModel d2 = d();
        d2.a("REFRESH_STORY_COMMENT_LIST_SUCCESS", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        d2.a("REFRESH_STORY_COMMENT_LIST_FAIL", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        d2.a("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        d2.a("LOAD_MORE_STORY_COMMENT_LIST_FAIL", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        StoryViewerListViewModel e2 = e();
        e2.a("REFRESH_STORY_VIEWER_LIST_SUCCESS", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        e2.a("REFRESH_STORY_VIEWER_LIST_FAIL", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        e2.a("LOAD_MORE_STORY_VIEWER_LIST_SUCCESS", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        e2.a("LOAD_MORE_STORY_VIEWER_LIST_FAIL", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
    }
}
