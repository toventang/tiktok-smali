package com.ss.android.ugc.aweme.challenge.g;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.challenge.model.ChallengeList;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.util.Collection;
import java.util.List;

public final class d extends a<Challenge, ChallengeList> {
    static {
        Covode.recordClassIndex(43143);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Challenge> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((ChallengeList) this.mData).items;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null || !((ChallengeList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        com.ss.android.ugc.aweme.settingsrequest.a.b();
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        com.ss.android.ugc.aweme.settingsrequest.a.b();
        n.a().a(this.mHandler, e.f69981a, 0);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        ChallengeList challengeList = (ChallengeList) obj;
        if (challengeList == null || b.a((Collection) challengeList.items)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = challengeList;
            } else if (i2 == 4) {
                ((ChallengeList) this.mData).items.addAll(challengeList.items);
                ((ChallengeList) this.mData).maxCursor = Math.min(((ChallengeList) this.mData).maxCursor, challengeList.maxCursor);
                ((ChallengeList) this.mData).hasMore = ((ChallengeList) this.mData).hasMore;
            }
        } else if (this.mData != null) {
            ((ChallengeList) this.mData).hasMore = false;
        }
    }
}
