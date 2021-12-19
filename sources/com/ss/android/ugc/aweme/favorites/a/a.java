package com.ss.android.ugc.aweme.favorites.a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.i18n.b;
import com.zhiliaoapp.musically.R;

public final class a extends f<Challenge> {

    /* renamed from: a  reason: collision with root package name */
    private Activity f90416a;

    static {
        Covode.recordClassIndex(56760);
    }

    public a(Activity activity) {
        this.f90416a = activity;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        return new com.ss.android.ugc.aweme.favorites.j.a(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.zw, viewGroup, false));
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        int i3;
        Challenge challenge = (Challenge) e().get(i2);
        com.ss.android.ugc.aweme.favorites.j.a aVar = (com.ss.android.ugc.aweme.favorites.j.a) viewHolder;
        Activity activity = this.f90416a;
        if (challenge != null) {
            aVar.f90654h = activity;
            aVar.f90653g = challenge;
            if (challenge.getCoverItem() != null) {
                e.a(aVar.f90648b, challenge.getCoverItem());
            } else {
                e.a(aVar.f90648b, 2131232035);
            }
            if (CommerceChallengeServiceImpl.e().a(aVar.f90653g.getChallengeName(), aVar.f90653g.isCommerce(), false) != null) {
                aVar.f90655i = true;
                CommerceChallengeServiceImpl.e().a(aVar.f90647a.getContext(), aVar.itemView.getResources().getString(R.string.fr3, aVar.f90653g.getChallengeName()), aVar.f90653g.isCommerce(), aVar.f90647a, true, "favorite_hashtag");
            } else {
                aVar.f90655i = false;
                aVar.f90647a.setText(aVar.itemView.getResources().getString(R.string.fr3, aVar.f90653g.getChallengeName()));
            }
            if (challenge.getViewCount() >= 0) {
                i3 = R.string.aat;
            } else {
                i3 = R.string.cqa;
            }
            aVar.f90652f.setText(new a.C0730a().a(aVar.itemView.getResources(), i3, b.a(challenge.getDisplayCount())).f33382a);
            aVar.c();
        }
    }
}
