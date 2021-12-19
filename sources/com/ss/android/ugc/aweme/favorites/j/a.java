package com.ss.android.ugc.aweme.favorites.j;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.favorites.i.a;
import com.zhiliaoapp.musically.R;
import java.util.UUID;

public final class a extends RecyclerView.ViewHolder implements View.OnClickListener, a.AbstractC2193a {

    /* renamed from: a  reason: collision with root package name */
    public TextView f90647a;

    /* renamed from: b  reason: collision with root package name */
    public RemoteImageView f90648b;

    /* renamed from: c  reason: collision with root package name */
    RelativeLayout f90649c;

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f90650d;

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f90651e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f90652f;

    /* renamed from: g  reason: collision with root package name */
    public Challenge f90653g;

    /* renamed from: h  reason: collision with root package name */
    public Activity f90654h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f90655i;

    static {
        Covode.recordClassIndex(56953);
    }

    @Override // com.ss.android.ugc.aweme.favorites.i.a.AbstractC2193a
    public final void c() {
        Challenge challenge = this.f90653g;
        if (challenge != null) {
            com.ss.android.ugc.aweme.favorites.i.a.a(challenge.getCid());
        }
    }

    public a(View view) {
        super(view);
        this.f90647a = (TextView) view.findViewById(R.id.a48);
        this.f90648b = (RemoteImageView) view.findViewById(R.id.dtl);
        this.f90649c = (RelativeLayout) view.findViewById(R.id.doy);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.cgx);
        this.f90650d = linearLayout;
        linearLayout.setOnClickListener(this);
        this.f90651e = (LinearLayout) view.findViewById(R.id.a47);
        this.f90652f = (TextView) view.findViewById(R.id.f_a);
    }

    public final void onClick(View view) {
        String str;
        ClickAgent.onClick(view);
        if (view.getId() == R.id.cgx) {
            Activity activity = this.f90654h;
            Challenge challenge = this.f90653g;
            if (challenge != null) {
                String uuid = UUID.randomUUID().toString();
                SmartRoute withParam = SmartRouter.buildRoute(activity, "aweme://challenge/detail/").withParam("id", challenge.getCid());
                if (CommerceChallengeServiceImpl.e().b(challenge)) {
                    str = "1";
                } else {
                    str = "0";
                }
                withParam.withParam("is_commerce", str).withParam("enter_from", "collection_tag").withParam("process_id", uuid).open();
                String cid = challenge.getCid();
                d dVar = new d();
                if (!TextUtils.isEmpty("")) {
                    dVar.a("tab_name", "");
                }
                r.a("enter_tag_detail", dVar.a("enter_from", "collection_tag").a("enter_method", "click_collection_tag").a("tag_id", cid).a("process_id", uuid).f66730a);
                String cid2 = challenge.getCid();
                d dVar2 = new d();
                if (!TextUtils.isEmpty("")) {
                    dVar2.a("tab_name", "");
                }
                r.a("click_personal_collection", dVar2.a("enter_from", "collection_tag").a("content", "tag").a("tag_id", cid2).f66730a);
            }
            CommerceChallengeServiceImpl.e().b("favorite_hashtag", this.f90653g.getChallengeName());
        }
    }
}
