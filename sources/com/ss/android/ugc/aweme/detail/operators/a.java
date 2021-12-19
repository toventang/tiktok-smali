package com.ss.android.ugc.aweme.detail.operators;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.feed.x.m;

public abstract class a<MODEL extends com.ss.android.ugc.aweme.common.e.a, PRESENTER extends b<MODEL>> implements aa {
    protected MODEL mModel;
    protected PRESENTER mPresenter;

    static {
        Covode.recordClassIndex(49615);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean cannotLoadMore() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public int getPageType(int i2) {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean init(Fragment fragment) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public Object getViewModel() {
        return this.mModel;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean isDataEmpty() {
        return this.mModel.isDataEmpty();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean isLoading() {
        return this.mPresenter.j();
    }

    public boolean checkSelfInvalid() {
        if (this.mPresenter == null || this.mModel == null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public void unInit() {
        this.mPresenter.cd_();
        this.mPresenter.h();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public void bindView(ad adVar) {
        this.mPresenter.a_(adVar);
        this.mPresenter.a(adVar);
        this.mPresenter.a(this.mModel);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean deleteItem(String str) {
        String str2;
        String name;
        boolean a2 = this.mPresenter.a(m.a(str));
        StringBuilder append = new StringBuilder("delete aweme: ").append(str);
        if (a2) {
            str2 = " success";
        } else {
            str2 = " failed";
        }
        StringBuilder append2 = append.append(str2);
        if (this.mPresenter.f76396h == null) {
            name = "null";
        } else {
            name = this.mPresenter.f76396h.getClass().getName();
        }
        com.ss.android.ugc.aweme.framework.a.a.b(6, "DeleteAweme", append2.append(name).toString());
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        this.mPresenter.a(Integer.valueOf(i2));
    }
}
