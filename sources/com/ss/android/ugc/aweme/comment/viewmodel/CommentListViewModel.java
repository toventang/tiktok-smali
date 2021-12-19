package com.ss.android.ugc.aweme.comment.viewmodel;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.barrage.BarrageCommentAndLikeApi;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import f.a.d.f;
import h.f.b.l;
import h.p;
import java.util.List;
import java.util.Map;

public final class CommentListViewModel extends ICommentListViewModel {

    /* renamed from: c  reason: collision with root package name */
    public static final a f72902c = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private final f.a.b.a f72903f = new f.a.b.a();

    /* renamed from: g  reason: collision with root package name */
    private final m f72904g;

    static {
        Covode.recordClassIndex(44904);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44905);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.DataCenter, androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f72903f.a();
        ((ICommentListViewModel) this).f72923d.clear();
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentListViewModel f72908a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f72909b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f72910c;

        static {
            Covode.recordClassIndex(44907);
        }

        c(CommentListViewModel commentListViewModel, long j2, String str) {
            this.f72908a = commentListViewModel;
            this.f72909b = j2;
            this.f72910c = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f72909b == 0) {
                this.f72908a.a("REFRESH_STORY_COMMENT_LIST_FAIL", this.f72910c);
            } else {
                this.f72908a.a("LOAD_MORE_STORY_COMMENT_LIST_FAIL", this.f72910c);
            }
        }
    }

    public CommentListViewModel(m mVar) {
        l.d(mVar, "");
        this.f72904g = mVar;
        this.f66996a = mVar;
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentListViewModel f72905a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f72906b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f72907c;

        static {
            Covode.recordClassIndex(44906);
        }

        b(CommentListViewModel commentListViewModel, long j2, String str) {
            this.f72905a = commentListViewModel;
            this.f72906b = j2;
            this.f72907c = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            CommentItemList commentItemList = (CommentItemList) obj;
            if (this.f72906b == 0) {
                Map<String, CommentItemList> map = ((ICommentListViewModel) this.f72905a).f72923d;
                String str = this.f72907c;
                l.b(commentItemList, "");
                map.put(str, commentItemList);
                this.f72905a.a("REFRESH_STORY_COMMENT_LIST_SUCCESS", new p(this.f72907c, commentItemList));
                return;
            }
            CommentItemList commentItemList2 = ((ICommentListViewModel) this.f72905a).f72923d.get(this.f72907c);
            if (commentItemList2 != null) {
                long j2 = commentItemList2.total;
                l.b(commentItemList, "");
                commentItemList2.total = j2 + commentItemList.total;
                commentItemList2.cursor = commentItemList.cursor;
                List<Comment> list = commentItemList2.items;
                List<Comment> list2 = commentItemList.items;
                l.b(list2, "");
                list.addAll(list2);
                this.f72905a.a("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS", new p(this.f72907c, commentItemList));
            }
        }
    }

    public final void a(String str, long j2) {
        l.d(str, "");
        f.a.b.b a2 = BarrageCommentAndLikeApi.f71530a.fetchCommentList(str, j2, 20, null, 1, 2, 1).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this, j2, str), new c(this, j2, str));
        l.b(a2, "");
        f.a.j.a.a(a2, this.f72903f);
    }
}
