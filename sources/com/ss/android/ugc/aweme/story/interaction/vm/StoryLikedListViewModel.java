package com.ss.android.ugc.aweme.story.interaction.vm;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ag;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.d;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.IStoryLikedListViewModel;
import com.ss.android.ugc.aweme.story.interaction.api.StoryInteractionApi;
import f.a.d.f;
import h.a.z;
import h.f.b.l;
import h.p;
import java.util.List;
import java.util.Map;

public final class StoryLikedListViewModel extends IStoryLikedListViewModel {

    /* renamed from: f  reason: collision with root package name */
    public static final a f137953f = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    private final f.a.b.a f137954g = new f.a.b.a();

    /* renamed from: h  reason: collision with root package name */
    private final m f137955h;

    static {
        Covode.recordClassIndex(90226);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90227);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static StoryLikedListViewModel a(e eVar, ag agVar) {
            l.d(eVar, "");
            l.d(agVar, "");
            ac a2 = d.a(eVar, agVar, new b(eVar)).a(StoryLikedListViewModel.class);
            l.b(a2, "");
            return (StoryLikedListViewModel) a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.DataCenter, androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f137954g.a();
    }

    public StoryLikedListViewModel(m mVar) {
        l.d(mVar, "");
        this.f137955h = mVar;
        this.f66996a = mVar;
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryLikedListViewModel f137959a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f137960b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f137961c;

        static {
            Covode.recordClassIndex(90229);
        }

        c(StoryLikedListViewModel storyLikedListViewModel, long j2, String str) {
            this.f137959a = storyLikedListViewModel;
            this.f137960b = j2;
            this.f137961c = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f137960b == 0) {
                this.f137959a.a("REFRESH_STORY_LIKED_LIST_FAIL", this.f137961c);
                ((IStoryLikedListViewModel) this.f137959a).f136723d.put(this.f137961c, 3);
                return;
            }
            this.f137959a.a("LOAD_MORE_STORY_LIKED_LIST_FAIL", this.f137961c);
            ((IStoryLikedListViewModel) this.f137959a).f136723d.put(this.f137961c, 1);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryLikedListViewModel f137956a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f137957b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f137958c;

        static {
            Covode.recordClassIndex(90228);
        }

        b(StoryLikedListViewModel storyLikedListViewModel, String str, long j2) {
            this.f137956a = storyLikedListViewModel;
            this.f137957b = str;
            this.f137958c = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.story.model.f fVar = (com.ss.android.ugc.aweme.story.model.f) obj;
            ((IStoryLikedListViewModel) this.f137956a).f136723d.put(this.f137957b, 2);
            if (this.f137958c == 0) {
                Map<String, com.ss.android.ugc.aweme.story.model.f> map = ((IStoryLikedListViewModel) this.f137956a).f136722c;
                String str = this.f137957b;
                l.b(fVar, "");
                map.put(str, fVar);
                this.f137956a.a("REFRESH_STORY_LIKED_LIST_SUCCESS", new p(this.f137957b, fVar));
                return;
            }
            com.ss.android.ugc.aweme.story.model.f fVar2 = ((IStoryLikedListViewModel) this.f137956a).f136722c.get(this.f137957b);
            if (fVar2 != null) {
                fVar2.setTotal(fVar2.getTotal() + fVar.getTotal());
                fVar2.setCursor(fVar.getCursor());
                List<User> likedList = fVar2.getLikedList();
                if (likedList != null) {
                    List<User> likedList2 = fVar.getLikedList();
                    if (likedList2 == null) {
                        likedList2 = z.INSTANCE;
                    }
                    likedList.addAll(likedList2);
                }
            }
            this.f137956a.a("LOAD_MORE_STORY_LIKED_LIST_SUCCESS", new p(this.f137957b, fVar));
        }
    }

    public final void a(String str, long j2) {
        l.d(str, "");
        if (j2 == 0) {
            ((IStoryLikedListViewModel) this).f136723d.put(str, 0);
        } else {
            ((IStoryLikedListViewModel) this).f136723d.put(str, 1);
        }
        f.a.b.b a2 = StoryInteractionApi.f137840a.fetchStoryLikedList(str, j2, 30).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this, str, j2), new c(this, j2, str));
        l.b(a2, "");
        f.a.j.a.a(a2, this.f137954g);
    }
}
