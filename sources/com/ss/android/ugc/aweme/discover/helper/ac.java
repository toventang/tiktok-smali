package com.ss.android.ugc.aweme.discover.helper;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.discover.helper.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class ac implements k {

    /* renamed from: a  reason: collision with root package name */
    private final h f81059a;

    /* renamed from: b  reason: collision with root package name */
    private final h f81060b = i.a((h.f.a.a) a.f81061a);

    static {
        Covode.recordClassIndex(50384);
    }

    private final ConstraintLayout a() {
        return (ConstraintLayout) this.f81059a.getValue();
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f81061a = new a();

        static {
            Covode.recordClassIndex(50385);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.a().a("trending_sounds_rank_num", 12) - 1);
        }
    }

    static final class b extends m implements h.f.a.a<ConstraintLayout> {
        final /* synthetic */ k.b $param;

        static {
            Covode.recordClassIndex(50386);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k.b bVar) {
            super(0);
            this.$param = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConstraintLayout invoke() {
            View a2 = com.a.a(LayoutInflater.from(this.$param.f81127a.getContext()), R.layout.ax_, this.$param.f81127a, false);
            if (!(a2 instanceof ConstraintLayout)) {
                return null;
            }
            return a2;
        }
    }

    public ac(k.b bVar) {
        l.d(bVar, "");
        this.f81059a = i.a((h.f.a.a) new b(bVar));
        ConstraintLayout a2 = a();
        if (a2 != null && bVar.f81128b.invoke(a2).intValue() == 1) {
            a2.findViewById(R.id.t1).setBackgroundResource(R.drawable.bbo);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.k
    public final void a(k.a aVar) {
        l.d(aVar, "");
        ConstraintLayout a2 = a();
        if (a2 != null) {
            int intValue = ((Number) this.f81060b.getValue()).intValue();
            int i2 = aVar.f81126a;
            if (i2 >= 0 && intValue >= i2) {
                a2.setVisibility(0);
                View findViewById = a2.findViewById(R.id.aq1);
                l.b(findViewById, "");
                ((TextView) findViewById).setText(String.valueOf(aVar.f81126a + 1));
                return;
            }
            a2.setVisibility(8);
        }
    }
}
