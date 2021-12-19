package com.ss.android.ugc.aweme.comment.barrage.c;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleCommentCell;
import com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleDescriptionCell;
import com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleEmojiCell;
import com.ss.android.ugc.aweme.comment.barrage.view.AwemeCommentBubbleList;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.comment.model.LikeListResponse;
import com.ss.android.ugc.aweme.comment.viewmodel.CommentListViewModel;
import com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
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
    public static final a f71574e = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public final String f71575c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.comment.i.b f71576d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f71577f = true;

    /* renamed from: g  reason: collision with root package name */
    private int f71578g;

    /* renamed from: h  reason: collision with root package name */
    private int f71579h;

    /* renamed from: i  reason: collision with root package name */
    private final h f71580i = h.i.a((h.f.a.a) new b(this));

    /* renamed from: j  reason: collision with root package name */
    private final h f71581j = h.i.a((h.f.a.a) new C1613c(this));

    /* renamed from: k  reason: collision with root package name */
    private List<? extends com.bytedance.ies.powerlist.b.a> f71582k;

    /* renamed from: l  reason: collision with root package name */
    private d<? super f<b>> f71583l;

    /* renamed from: m  reason: collision with root package name */
    private com.bytedance.ies.powerlist.b.a f71584m;

    static {
        Covode.recordClassIndex(44040);
    }

    private final CommentListViewModel d() {
        return (CommentListViewModel) this.f71580i.getValue();
    }

    private final LikeListVM e() {
        return (LikeListVM) this.f71581j.getValue();
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
            Covode.recordClassIndex(44041);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.barrage.c.a
    public final void b() {
        super.b();
        cg.b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.c.c$c  reason: collision with other inner class name */
    static final class C1613c extends m implements h.f.a.a<LikeListVM> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(44043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1613c(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LikeListVM invoke() {
            e activity = this.this$0.f71576d.b().getActivity();
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            return LikeListVM.a.a(activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.barrage.c.a
    public final void a() {
        this.f71568b.a(ReactionBubbleDescriptionCell.class, ReactionBubbleCommentCell.class, ReactionBubbleEmojiCell.class);
    }

    static final class b extends m implements h.f.a.a<CommentListViewModel> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(44042);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CommentListViewModel invoke() {
            e activity = this.this$0.f71576d.b().getActivity();
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            e activity2 = this.this$0.f71576d.b().getActivity();
            if (activity2 == null) {
                l.b();
            }
            l.b(activity2, "");
            l.d(activity, "");
            l.d(activity2, "");
            ac a2 = com.ss.android.ugc.aweme.arch.widgets.base.d.a(activity, activity2, new com.ss.android.ugc.aweme.comment.viewmodel.a(activity)).a(CommentListViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    private final void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        if (l.a(bVar.a(), (Object) this.f71567a)) {
            d<? super f<b>> dVar = this.f71583l;
            if (dVar != null) {
                dVar.resumeWith(q.m223constructorimpl(f.a.a(new Exception())));
            }
            this.f71583l = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.barrage.c.a
    public final void a(Aweme aweme) {
        l.d(aweme, "");
        this.f71578g = 0;
        this.f71579h = 0;
        User author = aweme.getAuthor();
        l.b(author, "");
        this.f71584m = new com.ss.android.ugc.aweme.comment.barrage.b.b(author, aweme, aweme.getCreateTime() * 1000, this.f71568b.getMMobEventParam());
        this.f71568b.getState().a(this.f71584m);
        this.f71577f = CommentServiceImpl.e().b(aweme);
        super.a(aweme);
        cg.a(this);
    }

    @Override // com.ss.android.ugc.aweme.comment.barrage.c.a
    public final void a(d<? super f<b>> dVar) {
        l.d(dVar, "");
        this.f71583l = dVar;
        if (this.f71577f) {
            d().a(this.f71567a, 0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        com.bytedance.ies.powerlist.b.a aVar = this.f71584m;
        if (aVar != null) {
            arrayList.add(0, aVar);
        }
        this.f71582k = arrayList;
        e().b().a(this.f71567a, 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
        StringBuilder sb = new StringBuilder("onChanged  ");
        String str2 = null;
        if (bVar2 != null) {
            str2 = bVar2.f67014a;
        }
        com.ss.android.ugc.aweme.comment.util.i.a("CommentAndLikeListMgr", sb.append(str2).toString());
        if (bVar2 != null && (str = bVar2.f67014a) != null) {
            switch (str.hashCode()) {
                case -1108427715:
                    if (str.equals("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS")) {
                        p pVar = (p) bVar2.a();
                        if (l.a(pVar.getFirst(), (Object) this.f71567a)) {
                            a((CommentItemList) pVar.getSecond(), false);
                            return;
                        }
                        return;
                    }
                    return;
                case -1077696328:
                    if (str.equals("REFRESH_LIKED_LIST_SUCCESS")) {
                        p pVar2 = (p) bVar2.a();
                        if (l.a(pVar2.getFirst(), (Object) this.f71567a)) {
                            a((LikeListResponse) pVar2.getSecond(), true);
                            return;
                        }
                        return;
                    }
                    return;
                case -734123415:
                    if (str.equals("REFRESH_LIKED_LIST_FAIL")) {
                        a(bVar2);
                        return;
                    }
                    return;
                case -249497211:
                    if (str.equals("LOAD_MORE_LIKED_LIST_SUCCESS")) {
                        p pVar3 = (p) bVar2.a();
                        if (l.a(pVar3.getFirst(), (Object) this.f71567a)) {
                            a((LikeListResponse) pVar3.getSecond(), false);
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
                        p pVar4 = (p) bVar2.a();
                        if (l.a(pVar4.getFirst(), (Object) this.f71567a)) {
                            a((CommentItemList) pVar4.getSecond(), true);
                            return;
                        }
                        return;
                    }
                    return;
                case 1780372668:
                    if (str.equals("LOAD_MORE_LIKED_LIST_FAIL")) {
                        a(bVar2);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    private final void a(CommentItemList commentItemList, boolean z) {
        List<Comment> replyComments;
        List<Comment> list = commentItemList.items;
        if (list == null) {
            list = z.INSTANCE;
        }
        com.ss.android.ugc.aweme.comment.util.i.a("CommentAndLikeListMgr", "handleCommentListData original comment size " + list.size());
        ArrayList<Comment> arrayList = new ArrayList();
        for (Comment comment : list) {
            l.b(comment, "");
            arrayList.add(comment);
            if (list.size() < 20 && (replyComments = comment.getReplyComments()) != null) {
                arrayList.addAll(replyComments);
            }
        }
        ArrayList arrayList2 = new ArrayList(n.a((Iterable) arrayList, 10));
        for (Comment comment2 : arrayList) {
            arrayList2.add(com.ss.android.ugc.aweme.comment.barrage.view.a.a(comment2, this.f71568b.getMMobEventParam()));
        }
        List<? extends com.bytedance.ies.powerlist.b.a> g2 = n.g((Collection) arrayList2);
        com.bytedance.ies.powerlist.b.a aVar = this.f71584m;
        if (aVar != null && z) {
            g2.add(0, aVar);
        }
        this.f71579h++;
        com.ss.android.ugc.aweme.comment.util.i.a("CommentAndLikeListMgr", "currentCommentLoadTimes:" + this.f71579h + " commentItems: " + g2.size() + " handleCommentListData: " + z + " hasmore " + commentItemList.hasMore + ' ' + this.f71582k);
        if (!commentItemList.hasMore || this.f71579h >= 5) {
            this.f71582k = g2;
            e().b().a(this.f71567a, 0);
            return;
        }
        d<? super f<b>> dVar = this.f71583l;
        if (dVar != null) {
            dVar.resumeWith(q.m223constructorimpl(f.a.a(null, new b(1, commentItemList.cursor), g2, 1)));
        }
        this.f71583l = null;
        if (z && g2.size() > 1) {
            this.f71568b.r();
        }
    }

    private final void a(LikeListResponse likeListResponse, boolean z) {
        ArrayList arrayList;
        if (likeListResponse.getLikeList() == null) {
            arrayList = z.INSTANCE;
        } else {
            List<User> likeList = likeListResponse.getLikeList();
            if (likeList == null) {
                l.b();
            }
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) likeList, 10));
            Iterator<T> it = likeList.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.ss.android.ugc.aweme.comment.barrage.view.a.a((User) it.next(), this.f71568b.getMMobEventParam()));
            }
            arrayList = arrayList2;
        }
        com.ss.android.ugc.aweme.comment.util.i.a("CommentAndLikeListMgr", "handleLikedListData data:hasmore:" + likeListResponse.getHasMore() + " likedListItems:" + arrayList.size() + " currentLikeLoadTimes:" + this.f71578g + ' ' + this.f71582k + "  ");
        Collection collection = this.f71582k;
        if (collection == null) {
            collection = z.INSTANCE;
        }
        List d2 = n.d(collection, (Iterable) arrayList);
        this.f71578g++;
        this.f71582k = null;
        if (!likeListResponse.getHasMore() || this.f71579h >= 5) {
            d<? super f<b>> dVar = this.f71583l;
            if (dVar != null) {
                dVar.resumeWith(q.m223constructorimpl(f.a.a(d2)));
            }
        } else {
            d<? super f<b>> dVar2 = this.f71583l;
            if (dVar2 != null) {
                dVar2.resumeWith(q.m223constructorimpl(f.a.a(null, new b(2, likeListResponse.getCursor()), d2, 1)));
            }
        }
        this.f71583l = null;
        com.ss.android.ugc.aweme.comment.util.i.a("CommentAndLikeListMgr", "handleLikedListData:powerItemssize:" + d2.size() + ' ' + d2);
        if (z && d2.size() > 1) {
            this.f71568b.r();
        } else if (d2.size() == 1) {
            AwemeCommentBubbleList awemeCommentBubbleList = this.f71568b;
            awemeCommentBubbleList.S = awemeCommentBubbleList.getFirstDataPositionInState();
            awemeCommentBubbleList.s();
            awemeCommentBubbleList.b(0);
            awemeCommentBubbleList.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.barrage.c.a
    public final void a(d<? super f<b>> dVar, b bVar) {
        l.d(dVar, "");
        l.d(bVar, "");
        this.f71583l = dVar;
        if (bVar.f71572a == 1) {
            d().a(this.f71567a, bVar.f71573b);
        } else {
            e().b().a(this.f71567a, bVar.f71573b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str, com.ss.android.ugc.aweme.comment.i.b bVar, AwemeCommentBubbleList awemeCommentBubbleList) {
        super(awemeCommentBubbleList);
        l.d(bVar, "");
        l.d(awemeCommentBubbleList, "");
        this.f71575c = str;
        this.f71576d = bVar;
        CommentListViewModel d2 = d();
        d2.a("REFRESH_STORY_COMMENT_LIST_SUCCESS", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        d2.a("REFRESH_STORY_COMMENT_LIST_FAIL", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        d2.a("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        d2.a("LOAD_MORE_STORY_COMMENT_LIST_FAIL", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        LikeListVM.BubbleBridge b2 = e().b();
        b2.a("REFRESH_LIKED_LIST_SUCCESS", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        b2.a("REFRESH_LIKED_LIST_FAIL", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        b2.a("LOAD_MORE_LIKED_LIST_SUCCESS", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        b2.a("LOAD_MORE_LIKED_LIST_FAIL", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
    }
}
