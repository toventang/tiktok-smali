package com.ss.android.ugc.aweme.feed.assem.avatar;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.assem.avatar.a;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class FeedAvatarDefaultVM extends FeedBaseViewModel<h> {
    static {
        Covode.recordClassIndex(57935);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new h();
    }

    public final void h() {
        a(new a(this));
    }

    public final String i() {
        Aweme aweme;
        User author;
        ProfileBadgeStruct profileBadge;
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (author = aweme.getAuthor()) == null || (profileBadge = author.getProfileBadge()) == null)) {
            l.b(profileBadge, "");
            if (profileBadge.getShouldShow() && profileBadge.getUrl().length() > 0) {
                return profileBadge.getUrl();
            }
        }
        return null;
    }

    public final int j() {
        Aweme aweme;
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams == null || (aweme = videoItemParams.mAweme) == null || !aweme.isCanPlay() || aweme.isDelete() || a.C2220a.a(aweme) || com.ss.android.ugc.aweme.commercialize.e.a.b.V(aweme)) {
            return 8;
        }
        if (in.a(aweme) || com.ss.android.ugc.aweme.commercialize.e.a.b.aq(aweme) || !n.b(aweme)) {
            return 4;
        }
        return 0;
    }

    static final class a extends m implements h.f.a.b<h, h> {
        final /* synthetic */ FeedAvatarDefaultVM this$0;

        static {
            Covode.recordClassIndex(57936);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(FeedAvatarDefaultVM feedAvatarDefaultVM) {
            super(1);
            this.this$0 = feedAvatarDefaultVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h invoke(h hVar) {
            h hVar2 = hVar;
            l.d(hVar2, "");
            FeedAvatarDefaultVM feedAvatarDefaultVM = this.this$0;
            Object g2 = feedAvatarDefaultVM.g();
            if (g2 == null) {
                l.b();
            }
            return feedAvatarDefaultVM.a(hVar2, (VideoItemParams) g2);
        }
    }

    static final class b extends m implements h.f.a.b<h, z> {
        final /* synthetic */ String $newUrl;
        final /* synthetic */ FeedAvatarDefaultVM this$0;

        static {
            Covode.recordClassIndex(57937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FeedAvatarDefaultVM feedAvatarDefaultVM, String str) {
            super(1);
            this.this$0 = feedAvatarDefaultVM;
            this.$newUrl = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(h hVar) {
            h hVar2 = hVar;
            l.d(hVar2, "");
            if (!l.a((Object) this.$newUrl, (Object) hVar2.f92028b)) {
                this.this$0.a(new h.f.a.b<h, h>(this) {
                    /* class com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultVM.b.AnonymousClass1 */
                    final /* synthetic */ b this$0;

                    static {
                        Covode.recordClassIndex(57938);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ h invoke(h hVar) {
                        h hVar2 = hVar;
                        l.d(hVar2, "");
                        return h.a(hVar2.f92027a, this.this$0.$newUrl);
                    }
                });
            }
            return z.f158842a;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.j
    public final /* synthetic */ VideoItemParams b(j jVar, VideoItemParams videoItemParams) {
        l.d(jVar, "");
        l.d(videoItemParams, "");
        return videoItemParams;
    }

    public final h a(h hVar, VideoItemParams videoItemParams) {
        l.d(hVar, "");
        l.d(videoItemParams, "");
        return h.a(j(), i());
    }
}
