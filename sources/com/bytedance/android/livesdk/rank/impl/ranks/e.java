package com.bytedance.android.livesdk.rank.impl.ranks;

import android.view.View;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.model.message.bp;
import com.bytedance.android.livesdk.rank.api.j;
import com.bytedance.android.livesdk.rank.impl.ranks.a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final RankEntranceWidget f20911a;

    static {
        Covode.recordClassIndex(12381);
    }

    e(RankEntranceWidget rankEntranceWidget) {
        this.f20911a = rankEntranceWidget;
    }

    public final void onClick(View view) {
        g gVar = this.f20911a.f20766b;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (bp bpVar : gVar.f20913a) {
            arrayList.add(Integer.valueOf(bpVar.f19348e));
        }
        ((a.AbstractC0430a) gVar.y).a(arrayList);
        c b2 = ((a.AbstractC0430a) gVar.y).b();
        if (b2 != null) {
            String rankName = j.HOURLY_RANK.getRankName();
            if (b2.f20906a == j.WEEKLY_RANK.getType()) {
                rankName = j.WEEKLY_RANK.getRankName();
            }
            b.a.a("livesdk_hourly_rank_entrance_click").a(gVar.w).a("user_type", gVar.f20915c ? "anchor" : "user").a("rank_type", rankName).b();
        }
    }
}
