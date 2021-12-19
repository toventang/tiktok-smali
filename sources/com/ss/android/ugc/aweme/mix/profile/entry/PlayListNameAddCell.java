package com.ss.android.ugc.aweme.mix.profile.entry;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.mix.c.b;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class PlayListNameAddCell extends PowerCell<a> {
    static {
        Covode.recordClassIndex(70744);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aoy, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PlayListNameAddCell f110223a;

        static {
            Covode.recordClassIndex(70745);
        }

        a(PlayListNameAddCell playListNameAddCell) {
            this.f110223a = playListNameAddCell;
        }

        public final void onClick(View view) {
            int i2;
            ClickAgent.onClick(view);
            if (b.a() == 1 || b.a() == 2) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            IMixFeedService k2 = MixFeedService.k();
            View view2 = this.f110223a.itemView;
            l.b(view2, "");
            Context context = ((TuxButton) view2).getContext();
            l.b(context, "");
            k2.a(context, new Bundle(), i2, "personal_homepage", "profile");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(a aVar) {
        l.d(aVar, "");
        Objects.requireNonNull(this.itemView, "null cannot be cast to non-null type com.bytedance.tux.button.TuxButton");
        View view = this.itemView;
        l.b(view, "");
        ((TuxButton) this.itemView).setIconTintColor(((TuxButton) view).getResources().getColor(R.color.bx));
        this.itemView.setOnClickListener(new a(this));
    }
}
