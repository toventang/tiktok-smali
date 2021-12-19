package com.ss.android.ugc.aweme.following.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ae;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;

public final class f extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    User f96498a;

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f96499b;

    /* renamed from: c  reason: collision with root package name */
    TextView f96500c;

    /* renamed from: d  reason: collision with root package name */
    boolean f96501d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f96502e;

    /* renamed from: f  reason: collision with root package name */
    private Context f96503f;

    /* renamed from: g  reason: collision with root package name */
    private o f96504g;

    /* renamed from: h  reason: collision with root package name */
    private int f96505h;

    /* renamed from: i  reason: collision with root package name */
    private List<FollowerDetail> f96506i;

    static {
        Covode.recordClassIndex(61116);
    }

    public f(View view, o oVar) {
        super(view);
        int size;
        this.f96499b = (RecyclerView) view.findViewById(R.id.b08);
        this.f96500c = (TextView) view.findViewById(R.id.eze);
        this.f96503f = view.getContext();
        this.f96504g = oVar;
        this.f96498a = oVar.getUser();
        this.f96502e = oVar.isMine();
        User user = this.f96498a;
        if (user != null) {
            this.f96506i = ae.a(user.getFollowerDetailList());
        }
        if (b.a((Collection) this.f96506i)) {
            size = 0;
        } else {
            size = this.f96506i.size() + 3;
        }
        this.f96505h = size;
    }
}
