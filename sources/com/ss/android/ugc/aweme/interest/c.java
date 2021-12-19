package com.ss.android.ugc.aweme.interest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.journey.e;
import com.ss.android.ugc.aweme.journey.w;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.Objects;

public final class c extends com.ss.android.ugc.aweme.journey.step.interestselector.a {
    static {
        Covode.recordClassIndex(67168);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.a, com.ss.android.ugc.aweme.journey.g
    public final e a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.abs, viewGroup, false);
        l.b(a2, "");
        Context context = a2.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.ss.android.ugc.aweme.interest.UpdateInterestActivity");
        int i2 = ((UpdateInterestActivity) context).f104746a;
        if (i2 > 0) {
            a2.getLayoutParams().width = i2;
        }
        a2.setLayoutParams(a2.getLayoutParams());
        TuxTextView tuxTextView = (TuxTextView) a2.findViewById(R.id.eoh);
        l.b(tuxTextView, "");
        return new a(a2, a2, tuxTextView.getText().toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(List<w> list, b<? super Integer, z> bVar) {
        super(list, true, bVar, null);
        l.d(list, "");
        l.d(bVar, "");
    }

    public static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f104765a;

        static {
            Covode.recordClassIndex(67169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, View view2, String str) {
            super(view2, str);
            this.f104765a = view;
        }
    }
}
