package com.ss.android.ugc.aweme.feed.assem.videoauthorinfo;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.d.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.hh;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagLabelEvent;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.bm;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class VideoAuthorInfoRelationVM extends FeedBaseViewModel<p> {

    /* renamed from: k  reason: collision with root package name */
    private List<InteractionTagUserInfo> f92536k = new ArrayList();

    static {
        Covode.recordClassIndex(58608);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new p();
    }

    static final class b extends m implements h.f.a.b<p, p> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f92537a = new b();

        static {
            Covode.recordClassIndex(58610);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ p invoke(p pVar) {
            p pVar2 = pVar;
            l.d(pVar2, "");
            return p.a(pVar2, false, null, null, null, null, null, null, 126);
        }
    }

    static final class c extends m implements h.f.a.b<p, p> {
        final /* synthetic */ boolean $showRelation;

        static {
            Covode.recordClassIndex(58611);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z) {
            super(1);
            this.$showRelation = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ p invoke(p pVar) {
            p pVar2 = pVar;
            l.d(pVar2, "");
            return p.a(pVar2, false, null, null, null, null, null, new com.bytedance.assem.arch.extensions.a(Boolean.valueOf(this.$showRelation)), 63);
        }
    }

    static final class a extends m implements h.f.a.b<p, p> {
        final /* synthetic */ FollowStatus $followStatus;

        static {
            Covode.recordClassIndex(58609);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(FollowStatus followStatus) {
            super(1);
            this.$followStatus = followStatus;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ p invoke(p pVar) {
            p pVar2 = pVar;
            l.d(pVar2, "");
            return p.a(pVar2, false, true, null, null, null, v.a(Integer.valueOf(this.$followStatus.followStatus), Integer.valueOf(this.$followStatus.followerStatus)), null, 93);
        }
    }

    public final String a(Aweme aweme) {
        InteractionTagInfo interactionTagInfo;
        List<InteractionTagUserInfo> taggedUsers;
        String a2;
        if (!g.b() || aweme == null || (interactionTagInfo = aweme.getInteractionTagInfo()) == null || (taggedUsers = interactionTagInfo.getTaggedUsers()) == null) {
            return "";
        }
        Iterator<T> it = this.f92536k.iterator();
        while (it.hasNext()) {
            if (!taggedUsers.contains(it.next())) {
                new InteractionTagLabelEvent(aweme).post();
            }
        }
        this.f92536k = taggedUsers;
        if (!(!taggedUsers.isEmpty())) {
            return "";
        }
        if (taggedUsers.size() != 1) {
            String string = com.bytedance.ies.ugc.appcontext.g.a().getString(R.string.gc1);
            l.b(string, "");
            a2 = com.a.a(string, Arrays.copyOf(new Object[]{"", Integer.valueOf(taggedUsers.size())}, 2));
            l.b(a2, "");
        } else if (d.c()) {
            a2 = taggedUsers.get(0).getNickname();
        } else {
            a2 = taggedUsers.get(0).getUniqueId();
        }
        if (a2 == null) {
            return "";
        }
        return a2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.j
    public final /* synthetic */ VideoItemParams b(j jVar, VideoItemParams videoItemParams) {
        l.d(jVar, "");
        l.d(videoItemParams, "");
        return videoItemParams;
    }

    public final void a(Aweme aweme, String str) {
        String str2 = "";
        l.d(aweme, str2);
        l.d(str, str2);
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.p);
        String aid = aweme.getAid();
        if (aid == null) {
            aid = str2;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", aid);
        String authorUid = aweme.getAuthorUid();
        if (authorUid != null) {
            str2 = authorUid;
        }
        r.a("tag_anchor_show", a3.a("author_id", str2).a("anchor_type", str).f66730a);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final /* synthetic */ p a(p pVar, VideoItemParams videoItemParams) {
        boolean z;
        MatchedFriendStruct matchedFriendStruct;
        AwemeRelationRecommendModel relationRecommendInfo;
        User author;
        List<AwemeHybridLabelModel> hybridLabels;
        p pVar2 = pVar;
        l.d(pVar2, "");
        l.d(videoItemParams, "");
        Aweme aweme = videoItemParams.mAweme;
        if (aweme == null) {
            return pVar2;
        }
        if (bm.b(aweme.getAid()) || (relationRecommendInfo = aweme.getRelationRecommendInfo()) == null || relationRecommendInfo.getRecType() == null || ((aweme.getMutualRelation() == null && ((hybridLabels = aweme.getHybridLabels()) == null || hybridLabels.isEmpty())) || !hh.b() || (author = aweme.getAuthor()) == null || author.getFollowStatus() != 0)) {
            z = false;
        } else {
            z = true;
        }
        p a2 = p.a(pVar2, z, null, null, null, null, null, null, 126);
        if (!a2.f92582a) {
            return a2;
        }
        if (aweme.getMutualRelation() != null) {
            a2 = p.a(a2, false, null, aweme.getMutualRelation(), null, null, null, null, 123);
        } else {
            User author2 = aweme.getAuthor();
            if (author2 == null || (matchedFriendStruct = author2.getMatchedFriendStruct()) == null || matchedFriendStruct.getExternalRecommendReasonStruct() == null) {
                List<AwemeHybridLabelModel> hybridLabels2 = aweme.getHybridLabels();
                if (hybridLabels2 != null && !hybridLabels2.isEmpty()) {
                    a2 = p.a(a2, false, null, null, aweme.getHybridLabels().get(0).getText(), null, null, null, 119);
                }
            } else {
                a2 = p.a(a2, false, null, null, null, aweme, null, null, 111);
            }
        }
        User author3 = aweme.getAuthor();
        if (author3 != null) {
            return p.a(a2, false, null, null, null, null, v.a(Integer.valueOf(author3.getFollowStatus()), Integer.valueOf(author3.getFollowerStatus())), null, 95);
        }
        return a2;
    }
}
