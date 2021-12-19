package com.ss.android.ugc.aweme.story.interaction.c;

import androidx.fragment.app.e;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.feed.adapter.cf;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleCommentCell;
import com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleEmojiCell;
import com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubblePublishCell;
import com.ss.android.ugc.aweme.story.interaction.vm.StoryCommentListViewModel;
import com.ss.android.ugc.aweme.story.interaction.vm.StoryLikedListViewModel;
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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class c extends a implements u<com.ss.android.ugc.aweme.arch.widgets.base.b>, i, j {

    /* renamed from: e  reason: collision with root package name */
    public static final a f137877e = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public final String f137878d;

    /* renamed from: f  reason: collision with root package name */
    private final h f137879f;

    /* renamed from: g  reason: collision with root package name */
    private final h f137880g;

    /* renamed from: h  reason: collision with root package name */
    private List<? extends com.bytedance.ies.powerlist.b.a> f137881h;

    /* renamed from: i  reason: collision with root package name */
    private d<? super f<b>> f137882i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f137883j = true;

    /* renamed from: k  reason: collision with root package name */
    private com.bytedance.ies.powerlist.b.a f137884k;

    static {
        Covode.recordClassIndex(90189);
    }

    private final StoryCommentListViewModel d() {
        return (StoryCommentListViewModel) this.f137879f.getValue();
    }

    private final StoryLikedListViewModel e() {
        return (StoryLikedListViewModel) this.f137880g.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final boolean a() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(85, new g(c.class, "onCommentDeleteEvent", com.ss.android.ugc.aweme.comment.c.c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @r(a = ThreadMode.MAIN)
    public final void onCommentDeleteEvent(com.ss.android.ugc.aweme.comment.c.c cVar) {
        l.d(cVar, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90190);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final void c() {
        super.c();
        cg.b(this);
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final void b() {
        this.f137872c.a(ReactionBubblePublishCell.class, ReactionBubbleCommentCell.class, ReactionBubbleEmojiCell.class);
    }

    static final class b extends m implements h.f.a.a<StoryCommentListViewModel> {
        final /* synthetic */ cf $params;

        static {
            Covode.recordClassIndex(90191);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(cf cfVar) {
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

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.c.c$c  reason: collision with other inner class name */
    static final class C3630c extends m implements h.f.a.a<StoryLikedListViewModel> {
        final /* synthetic */ cf $params;

        static {
            Covode.recordClassIndex(90192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3630c(cf cfVar) {
            super(0);
            this.$params = cfVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryLikedListViewModel invoke() {
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
            return StoryLikedListViewModel.a.a(activity, activity2);
        }
    }

    private final void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        if (l.a(bVar.a(), (Object) this.f137870a)) {
            d<? super f<b>> dVar = this.f137882i;
            if (dVar != null) {
                dVar.resumeWith(q.m223constructorimpl(f.a.a(new Exception())));
            }
            this.f137882i = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final void a(Aweme aweme) {
        l.d(aweme, "");
        User author = aweme.getAuthor();
        l.b(author, "");
        this.f137884k = new com.ss.android.ugc.aweme.story.interaction.b.f(author, aweme.getCreateTime() * 1000, this.f137872c.getMobEventParam());
        this.f137872c.getState().a(this.f137884k);
        this.f137883j = CommentServiceImpl.e().b(aweme);
        super.a(aweme);
        cg.a(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
        if (bVar2 != null && (str = bVar2.f67014a) != null) {
            switch (str.hashCode()) {
                case -2111570833:
                    if (str.equals("LOAD_MORE_STORY_LIKED_LIST_SUCCESS")) {
                        p pVar = (p) bVar2.a();
                        if (l.a(pVar.getFirst(), (Object) this.f137870a)) {
                            a((com.ss.android.ugc.aweme.story.model.f) pVar.getSecond(), false);
                            return;
                        }
                        return;
                    }
                    return;
                case -1108427715:
                    if (str.equals("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS")) {
                        p pVar2 = (p) bVar2.a();
                        if (l.a(pVar2.getFirst(), (Object) this.f137870a)) {
                            a((CommentItemList) pVar2.getSecond(), false);
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
                case 29510162:
                    if (str.equals("LOAD_MORE_STORY_LIKED_LIST_FAIL")) {
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
                case 1000683874:
                    if (str.equals("REFRESH_STORY_LIKED_LIST_SUCCESS")) {
                        p pVar4 = (p) bVar2.a();
                        if (l.a(pVar4.getFirst(), (Object) this.f137870a)) {
                            a((com.ss.android.ugc.aweme.story.model.f) pVar4.getSecond(), true);
                            return;
                        }
                        return;
                    }
                    return;
                case 1736731135:
                    if (str.equals("REFRESH_STORY_LIKED_LIST_FAIL")) {
                        a(bVar2);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final void a(d<? super f<b>> dVar) {
        l.d(dVar, "");
        this.f137882i = dVar;
        if (this.f137883j) {
            d().a(this.f137870a, 0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        com.bytedance.ies.powerlist.b.a aVar = this.f137884k;
        if (aVar != null) {
            arrayList.add(0, aVar);
        }
        this.f137881h = arrayList;
        e().a(this.f137870a, 0);
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
        List<? extends com.bytedance.ies.powerlist.b.a> g2 = n.g((Collection) arrayList2);
        com.bytedance.ies.powerlist.b.a aVar = this.f137884k;
        if (aVar != null && z) {
            g2.add(0, aVar);
        }
        if (commentItemList.hasMore) {
            d<? super f<b>> dVar = this.f137882i;
            if (dVar != null) {
                dVar.resumeWith(q.m223constructorimpl(f.a.a(null, new b(1, commentItemList.cursor), g2, 1)));
            }
            this.f137882i = null;
            if (z && g2.size() > 1) {
                this.f137872c.r();
                return;
            }
            return;
        }
        this.f137881h = g2;
        e().a(this.f137870a, 0);
    }

    private final void a(com.ss.android.ugc.aweme.story.model.f fVar, boolean z) {
        ArrayList arrayList;
        if (fVar.getLikedList() == null) {
            arrayList = z.INSTANCE;
        } else {
            List<User> likedList = fVar.getLikedList();
            if (likedList == null) {
                l.b();
            }
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) likedList, 10));
            Iterator<T> it = likedList.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.ss.android.ugc.aweme.story.interaction.b.d.a((User) it.next(), this.f137872c.getMobEventParam()));
            }
            arrayList = arrayList2;
        }
        Collection collection = this.f137881h;
        if (collection == null) {
            collection = z.INSTANCE;
        }
        List d2 = n.d(collection, arrayList);
        this.f137881h = null;
        if (fVar.getHasMore()) {
            d<? super f<b>> dVar = this.f137882i;
            if (dVar != null) {
                dVar.resumeWith(q.m223constructorimpl(f.a.a(null, new b(2, fVar.getCursor()), d2, 1)));
            }
        } else {
            d<? super f<b>> dVar2 = this.f137882i;
            if (dVar2 != null) {
                dVar2.resumeWith(q.m223constructorimpl(f.a.a(d2)));
            }
        }
        this.f137882i = null;
        if (z && d2.size() > 1) {
            this.f137872c.r();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.c.a
    public final void a(d<? super f<b>> dVar, b bVar) {
        l.d(dVar, "");
        l.d(bVar, "");
        this.f137882i = dVar;
        if (bVar.f137875a == 1) {
            d().a(this.f137870a, bVar.f137876b);
        } else {
            e().a(this.f137870a, bVar.f137876b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str, cf cfVar, ReactionBubbleList reactionBubbleList) {
        super(reactionBubbleList);
        l.d(cfVar, "");
        l.d(reactionBubbleList, "");
        this.f137878d = str;
        this.f137879f = h.i.a((h.f.a.a) new b(cfVar));
        this.f137880g = h.i.a((h.f.a.a) new C3630c(cfVar));
        StoryCommentListViewModel d2 = d();
        d2.a("REFRESH_STORY_COMMENT_LIST_SUCCESS", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        d2.a("REFRESH_STORY_COMMENT_LIST_FAIL", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        d2.a("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        d2.a("LOAD_MORE_STORY_COMMENT_LIST_FAIL", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        StoryLikedListViewModel e2 = e();
        e2.a("REFRESH_STORY_LIKED_LIST_SUCCESS", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        e2.a("REFRESH_STORY_LIKED_LIST_FAIL", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        e2.a("LOAD_MORE_STORY_LIKED_LIST_SUCCESS", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        e2.a("LOAD_MORE_STORY_LIKED_LIST_FAIL", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
    }
}
