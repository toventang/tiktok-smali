package com.ss.android.ugc.aweme.story.interaction.vm;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ag;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.d;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.story.api.IStoryCommentListViewModel;
import com.ss.android.ugc.aweme.story.interaction.api.StoryInteractionApi;
import f.a.d.f;
import h.f.b.l;
import h.p;
import java.util.List;
import java.util.Map;

public final class StoryCommentListViewModel extends IStoryCommentListViewModel {

    /* renamed from: f  reason: collision with root package name */
    public static final a f137944f = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    private final f.a.b.a f137945g = new f.a.b.a();

    /* renamed from: h  reason: collision with root package name */
    private final m f137946h;

    static {
        Covode.recordClassIndex(90222);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90223);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static StoryCommentListViewModel a(e eVar, ag agVar) {
            l.d(eVar, "");
            l.d(agVar, "");
            ac a2 = d.a(eVar, agVar, new a(eVar)).a(StoryCommentListViewModel.class);
            l.b(a2, "");
            return (StoryCommentListViewModel) a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.DataCenter, androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f137945g.a();
    }

    public StoryCommentListViewModel(m mVar) {
        l.d(mVar, "");
        this.f137946h = mVar;
        this.f66996a = mVar;
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryCommentListViewModel f137950a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f137951b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f137952c;

        static {
            Covode.recordClassIndex(90225);
        }

        c(StoryCommentListViewModel storyCommentListViewModel, long j2, String str) {
            this.f137950a = storyCommentListViewModel;
            this.f137951b = j2;
            this.f137952c = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f137951b == 0) {
                this.f137950a.a("REFRESH_STORY_COMMENT_LIST_FAIL", this.f137952c);
                ((IStoryCommentListViewModel) this.f137950a).f136720d.put(this.f137952c, 3);
                return;
            }
            this.f137950a.a("LOAD_MORE_STORY_COMMENT_LIST_FAIL", this.f137952c);
            ((IStoryCommentListViewModel) this.f137950a).f136720d.put(this.f137952c, 4);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryCommentListViewModel f137947a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f137948b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f137949c;

        static {
            Covode.recordClassIndex(90224);
        }

        b(StoryCommentListViewModel storyCommentListViewModel, String str, long j2) {
            this.f137947a = storyCommentListViewModel;
            this.f137948b = str;
            this.f137949c = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            CommentItemList commentItemList = (CommentItemList) obj;
            ((IStoryCommentListViewModel) this.f137947a).f136720d.put(this.f137948b, 2);
            if (this.f137949c == 0) {
                Map<String, CommentItemList> map = ((IStoryCommentListViewModel) this.f137947a).f136719c;
                String str = this.f137948b;
                l.b(commentItemList, "");
                map.put(str, commentItemList);
                this.f137947a.a("REFRESH_STORY_COMMENT_LIST_SUCCESS", new p(this.f137948b, commentItemList));
                return;
            }
            CommentItemList commentItemList2 = ((IStoryCommentListViewModel) this.f137947a).f136719c.get(this.f137948b);
            if (commentItemList2 != null) {
                long j2 = commentItemList2.total;
                l.b(commentItemList, "");
                commentItemList2.total = j2 + commentItemList.total;
                commentItemList2.cursor = commentItemList.cursor;
                List<Comment> list = commentItemList2.items;
                List<Comment> list2 = commentItemList.items;
                l.b(list2, "");
                list.addAll(list2);
                this.f137947a.a("LOAD_MORE_STORY_COMMENT_LIST_SUCCESS", new p(this.f137948b, commentItemList));
            }
        }
    }

    public final void a(String str, long j2) {
        l.d(str, "");
        if (j2 == 0) {
            ((IStoryCommentListViewModel) this).f136720d.put(str, 0);
        } else {
            ((IStoryCommentListViewModel) this).f136720d.put(str, 1);
        }
        f.a.b.b a2 = StoryInteractionApi.f137840a.fetchCommentListV2(str, j2, 30, null, 1, 2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this, str, j2), new c(this, j2, str));
        l.b(a2, "");
        f.a.j.a.a(a2, this.f137945g);
    }
}
