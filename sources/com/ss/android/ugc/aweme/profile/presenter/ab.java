package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bw.a.a;
import com.ss.android.ugc.aweme.bw.a.b;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public final class ab extends b<RecommendCommonUserModel, u> implements o {
    static {
        Covode.recordClassIndex(75298);
    }

    public final void a(List<User> list) {
        if (this.f69566b != null) {
            ((RecommendCommonUserModel) this.f69566b).setData(list);
        }
    }

    public final void d() {
        ((RecommendCommonUserModel) this.f69566b).recommendUserDialogLoadMore(30);
    }

    public final void e() {
        if (this.f69566b != null) {
            ((RecommendCommonUserModel) this.f69566b).resetShownUserIds();
        }
    }

    public final int f() {
        if (this.f69566b != null) {
            return ((RecommendCommonUserModel) this.f69566b).newUserCount;
        }
        return 0;
    }

    public final RecommendList a() {
        if (this.f69566b == null) {
            return null;
        }
        return ((a) this.f69566b).mData;
    }

    @Override // com.ss.android.ugc.aweme.common.o
    public final void c() {
        e.a.f112592a.b();
        if (((a) this.f69566b).mQueryType == 1) {
            ((u) this.f69567c).a((RecommendList) ((a) this.f69566b).mData);
        } else if (((a) this.f69566b).mQueryType == 4) {
            ((u) this.f69567c).b(((a) this.f69566b).mData);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        ((u) this.f69567c).a(exc);
    }

    public final int a(String str) {
        if (this.f69566b != null) {
            return ((RecommendCommonUserModel) this.f69566b).getUserImprOrder(str);
        }
        return 0;
    }

    public final void a(User user) {
        if (this.f69566b != null) {
            ((RecommendCommonUserModel) this.f69566b).removeData(user);
        }
    }

    public ab(RecommendCommonUserModel recommendCommonUserModel, u uVar) {
        super(recommendCommonUserModel, uVar);
        ((a) this.f69566b).addNotifyListener(this);
    }

    public final void a(String str, int i2, int i3) {
        ((RecommendCommonUserModel) this.f69566b).fetchData(30, str, 2, 0, i2, 2, null, i3);
    }

    public final void a(String str, int i2, String str2) {
        a(20, str, 4, i2, 2, str2);
    }

    public final void a(String str, int i2, String str2, boolean z) {
        a(str, i2, 2, str2, z);
    }

    private void a(String str, int i2, int i3, String str2, boolean z) {
        ((RecommendCommonUserModel) this.f69566b).refreshRecommendUser(20, str, 4, 0, i2, null, 2, str2, null, null, z);
    }

    public final void a(int i2, String str, int i3, int i4, int i5, String str2) {
        ((RecommendCommonUserModel) this.f69566b).loadMore(i2, str, i3, 0, i4, 2, str2, null);
    }
}
