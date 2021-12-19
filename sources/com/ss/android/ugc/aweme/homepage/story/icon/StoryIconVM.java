package com.ss.android.ugc.aweme.homepage.story.icon;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.m;
import h.h;
import h.i;

public final class StoryIconVM extends AssemViewModel<i> {

    /* renamed from: m  reason: collision with root package name */
    public static final a f99413m = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public Aweme f99414j;

    /* renamed from: k  reason: collision with root package name */
    String f99415k;

    /* renamed from: l  reason: collision with root package name */
    boolean f99416l;
    private final h n = i.a((h.f.a.a) b.f99417a);

    static {
        Covode.recordClassIndex(63329);
    }

    /* access modifiers changed from: package-private */
    public final f.a.b.a g() {
        return (f.a.b.a) this.n.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63330);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f99417a = new b();

        static {
            Covode.recordClassIndex(63331);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ i f() {
        return new i();
    }

    /* access modifiers changed from: package-private */
    public static final class c implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryIconVM f99418a;

        static {
            Covode.recordClassIndex(63332);
        }

        c(StoryIconVM storyIconVM) {
            this.f99418a = storyIconVM;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f99418a.f99414j = null;
            this.f99418a.a(AnonymousClass1.f99419a);
        }
    }

    static boolean a(Aweme aweme) {
        Aweme aweme2;
        UserStory userStory;
        if (aweme == null || (userStory = aweme.getUserStory()) == null) {
            aweme2 = null;
        } else {
            aweme2 = UserStoryKt.currentStory(userStory);
        }
        return com.ss.android.ugc.aweme.story.d.a.f(aweme2);
    }

    static boolean b(Aweme aweme) {
        String str;
        User author;
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            str = null;
        } else {
            str = author.getUid();
        }
        return com.ss.android.ugc.aweme.homepage.story.c.b.a(str);
    }
}
