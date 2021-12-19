package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.a.k;
import com.ss.android.ugc.aweme.friends.c.c;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public abstract class y extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f97289a;

    static {
        Covode.recordClassIndex(61803);
    }

    public View a(int i2) {
        if (this.f97289a == null) {
            this.f97289a = new SparseArray();
        }
        View view = (View) this.f97289a.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f97289a.put(i2, findViewById);
        return findViewById;
    }

    public abstract View getRecommendItemView();

    public void setData(User user) {
    }

    public abstract void setEnterFrom(String str);

    public void setIgnoreRecFriendsCardExp(boolean z) {
    }

    public abstract void setListener(k<User> kVar);

    public void setPageOwner(Object obj) {
        l.d(obj, "");
    }

    public void setPositionInApiList(int i2) {
    }

    public void setRecommendAwemeClickListener(c cVar) {
    }

    public void setRecommendUserType(int i2) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(Context context, AttributeSet attributeSet, int i2) {
        super(context, null, 0);
        l.d(context, "");
    }
}
