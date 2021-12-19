package com.ss.android.ugc.aweme.notification.vm;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public RecommendList f114105a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends Friend> f114106b;

    static {
        Covode.recordClassIndex(73364);
    }

    public a() {
        this(null, null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f114105a, aVar.f114105a) && l.a(this.f114106b, aVar.f114106b);
    }

    public final int hashCode() {
        RecommendList recommendList = this.f114105a;
        int i2 = 0;
        int hashCode = (recommendList != null ? recommendList.hashCode() : 0) * 31;
        List<? extends Friend> list = this.f114106b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        Integer num;
        Integer num2;
        List<User> userList;
        List<User> inviterList;
        StringBuilder sb = new StringBuilder("BottomCombineResponse{recommends:{");
        RecommendList recommendList = this.f114105a;
        Integer num3 = null;
        if (recommendList == null || (inviterList = recommendList.getInviterList()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(inviterList.size());
        }
        StringBuilder append = sb.append(num).append(", ");
        RecommendList recommendList2 = this.f114105a;
        if (recommendList2 == null || (userList = recommendList2.getUserList()) == null) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(userList.size());
        }
        StringBuilder append2 = append.append(num2).append("},contacts:");
        List<? extends Friend> list = this.f114106b;
        if (list != null) {
            num3 = Integer.valueOf(list.size());
        }
        return append2.append(num3).append("}").toString();
    }

    public a(RecommendList recommendList, List<? extends Friend> list) {
        this.f114105a = recommendList;
        this.f114106b = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(RecommendList recommendList, List list, int i2) {
        this((i2 & 1) != 0 ? null : recommendList, (i2 & 2) != 0 ? null : list);
    }
}
