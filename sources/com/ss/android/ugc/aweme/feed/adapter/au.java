package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bw.a.a;
import com.ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.net.g;
import com.ss.android.ugc.aweme.social.api.IRecommendUserApi;
import com.ss.android.ugc.aweme.social.api.RecommendUserApiService;
import java.util.ArrayList;
import java.util.List;

public final class au extends a<SuperAccountList> {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f91607a;

    /* renamed from: b  reason: collision with root package name */
    private final IRecommendUserApi f91608b = RecommendUserApiService.f133669a;

    static {
        Covode.recordClassIndex(57698);
    }

    public final void a() {
        this.f91608b.recommendSuperAccount().a(new g(this.mHandler));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.bw.a.a
    public final /* synthetic */ void handleData(SuperAccountList superAccountList) {
        SuperAccountList superAccountList2 = superAccountList;
        if (this.mQueryType == 1) {
            super.handleData(superAccountList2);
        } else if (this.mQueryType == 4) {
            if (this.mData != null) {
                List<UserWithAweme> userList = ((SuperAccountList) this.mData).getUserList();
                userList.addAll(superAccountList2.getUserList());
                this.mData = superAccountList2;
                ((SuperAccountList) this.mData).userList = userList;
            } else {
                this.mData = superAccountList2;
            }
        }
        List<String> list = this.f91607a;
        if (list == null) {
            this.f91607a = new ArrayList();
        } else {
            list.clear();
        }
        if (!(superAccountList2 == null || superAccountList2.getUserList() == null)) {
            for (UserWithAweme userWithAweme : superAccountList2.getUserList()) {
                this.f91607a.add(userWithAweme.getUser().getUid());
            }
        }
    }
}
