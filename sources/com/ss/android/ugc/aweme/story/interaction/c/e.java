package com.ss.android.ugc.aweme.story.interaction.c;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.c.c;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.feed.adapter.cf;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleCommentCell;
import com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubblePublishCell;
import com.ss.android.ugc.aweme.story.interaction.vm.StoryCommentListViewModel;
import com.ss.android.ugc.aweme.story.view.ReactionBubbleList;
import com.ss.android.ugc.aweme.utils.cg;
import h.a.n;
import h.a.z;
import h.c.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.p;
import h.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class e extends a implements u<b>, i, j {

    /* renamed from: d  reason: collision with root package name */
    public final String f137890d;

    /* renamed from: e  reason: collision with root package name */
    public final cf f137891e;

    /* renamed from: f  reason: collision with root package name */
    private final h f137892f = h.i.a((h.f.a.a) new a(this));

    /* renamed from: g  reason: collision with root package name */
    private final boolean f137893g;

    /* renamed from: h  reason: collision with root package name */
    private d<? super f<b>> f137894h;

    /* renamed from: i  reason: collision with root package name */
    private com.bytedance.ies.powerlist.b.a f137895i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f137896j;

    static {
        Covode.recordClassIndex(90196);
    }

    private final StoryCommentListViewModel d() {
        return (StoryCommentListViewModel) this.f137892f.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final boolean a() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(85, new g(e.class, "onCommentDeleteEvent", c.class, ThreadMode.MAIN, 0, false));
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
        this.f137872c.a(ReactionBubbleCommentCell.class, ReactionBubblePublishCell.class);
    }

    static final class a extends m implements h.f.a.a<StoryCommentListViewModel> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(90197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryCommentListViewModel invoke() {
            androidx.fragment.app.e activity = this.this$0.f137891e.f91768c.getActivity();
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            androidx.fragment.app.e activity2 = this.this$0.f137891e.f91768c.getActivity();
            if (activity2 == null) {
                l.b();
            }
            l.b(activity2, "");
            return StoryCommentListViewModel.a.a(activity, activity2);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final void a(Aweme aweme) {
        l.d(aweme, "");
        if (this.f137893g) {
            User author = aweme.getAuthor();
            l.b(author, "");
            this.f137895i = new com.ss.android.ugc.aweme.story.interaction.b.f(author, aweme.getCreateTime() * 1000, this.f137872c.getMobEventParam());
            this.f137872c.getState().a(this.f137895i);
        }
        this.f137896j = CommentServiceImpl.e().b(aweme);
        super.a(aweme);
        cg.a(this);
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final void a(d<? super f<b>> dVar) {
        l.d(dVar, "");
        this.f137894h = dVar;
        if (this.f137896j) {
            d().a(this.f137870a, 0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        com.bytedance.ies.powerlist.b.a aVar = this.f137895i;
        if (aVar != null) {
            arrayList.add(0, aVar);
        }
        dVar.resumeWith(q.m223constructorimpl(f.a.a(arrayList)));
        this.f137894h = null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(b bVar) {
        String str;
        b bVar2 = bVar;
        if (bVar2 != null && (str = bVar2.f67014a) != null) {
            switch (str.hashCode()) {
                case -1108427715:
                    if (str.equals("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS")) {
                        a(bVar2, false);
                        return;
                    }
                    return;
                case -108517967:
                    if (!str.equals("REFRESH_STORY_COMMENT_LIST_FAIL")) {
                        return;
                    }
                    break;
                case -70365948:
                    if (!str.equals("LOAD_MORE_STORY_COMMENT_LIST_FAIL")) {
                        return;
                    }
                    break;
                case 471107696:
                    if (str.equals("REFRESH_STORY_COMMENT_LIST_SUCCESS")) {
                        a(bVar2, true);
                        return;
                    }
                    return;
                default:
                    return;
            }
            String str2 = (String) bVar2.a();
            d<? super f<b>> dVar = this.f137894h;
            if (dVar != null) {
                dVar.resumeWith(q.m223constructorimpl(f.a.a(new Exception(str2))));
            }
            this.f137894h = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final void a(d<? super f<b>> dVar, b bVar) {
        l.d(dVar, "");
        l.d(bVar, "");
        this.f137894h = dVar;
        d().a(this.f137870a, bVar.f137876b);
    }

    private final void a(b bVar, boolean z) {
        p pVar = (p) bVar.a();
        if (!(!l.a(pVar.getFirst(), (Object) this.f137870a))) {
            CommentItemList commentItemList = (CommentItemList) pVar.getSecond();
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
            List g2 = n.g((Collection) arrayList2);
            com.bytedance.ies.powerlist.b.a aVar = this.f137895i;
            if (aVar != null && z) {
                g2.add(0, aVar);
            }
            if (commentItemList.hasMore) {
                d<? super f<b>> dVar = this.f137894h;
                if (dVar != null) {
                    dVar.resumeWith(q.m223constructorimpl(f.a.a(null, new b(1, commentItemList.cursor), g2, 1)));
                }
            } else {
                d<? super f<b>> dVar2 = this.f137894h;
                if (dVar2 != null) {
                    dVar2.resumeWith(q.m223constructorimpl(f.a.a(g2)));
                }
            }
            this.f137894h = null;
            if (z && ((this.f137893g && g2.size() > 1) || (!this.f137893g && g2.size() > 0))) {
                this.f137872c.r();
            }
            this.f137872c.setForbidAppendItem(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(String str, cf cfVar, ReactionBubbleList reactionBubbleList) {
        super(reactionBubbleList);
        l.d(cfVar, "");
        l.d(reactionBubbleList, "");
        this.f137890d = str;
        this.f137891e = cfVar;
        StoryCommentListViewModel d2 = d();
        d2.a("REFRESH_STORY_COMMENT_LIST_SUCCESS", (u<b>) this);
        d2.a("REFRESH_STORY_COMMENT_LIST_FAIL", (u<b>) this);
        d2.a("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS", (u<b>) this);
        d2.a("LOAD_MORE_STORY_COMMENT_LIST_FAIL", (u<b>) this);
        this.f137893g = com.ss.android.ugc.aweme.story.c.b.l();
        this.f137896j = true;
    }
}
