package com.bytedance.android.livesdk.qa;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.m.c;
import com.bytedance.android.livesdk.ap.a;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.qa.i;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i.f f20500a;

    /* renamed from: b  reason: collision with root package name */
    private final QuestionViewModel f20501b;

    /* renamed from: c  reason: collision with root package name */
    private final af f20502c;

    /* renamed from: d  reason: collision with root package name */
    private final int f20503d;

    static {
        Covode.recordClassIndex(12100);
    }

    l(i.f fVar, QuestionViewModel questionViewModel, af afVar, int i2) {
        this.f20500a = fVar;
        this.f20501b = questionViewModel;
        this.f20502c = afVar;
        this.f20503d = i2;
    }

    public final void onClick(View view) {
        i.f fVar = this.f20500a;
        QuestionViewModel questionViewModel = this.f20501b;
        af afVar = this.f20502c;
        int i2 = this.f20503d;
        if (!i.this.f20466j.booleanValue()) {
            return;
        }
        if (!c.b(i.this.n)) {
            ao.a(y.e(), (int) R.string.eo4);
        } else if (questionViewModel.f20320j.o != null) {
            if (a.ch.a().booleanValue()) {
                com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) a.ch, (Object) false);
                b.a aVar = new b.a(fVar.f20489b);
                aVar.f18296m = true;
                aVar.a(R.string.eob).b(R.string.eoc).a(R.string.eod, (DialogInterface.OnClickListener) new m(fVar, afVar, i2), false).b(R.string.ep3, n.f20507a, false).a().show();
                return;
            }
            fVar.a(afVar, i2);
        } else if (a.cg.a().booleanValue()) {
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) a.cg, (Object) false);
            b.a aVar2 = new b.a(fVar.f20489b);
            aVar2.f18296m = true;
            aVar2.a(R.string.dwe).b(R.string.dwf).a(R.string.dwg, (DialogInterface.OnClickListener) new o(fVar, afVar, i2), false).b(R.string.ep3, p.f20511a, false).a().show();
        } else {
            fVar.a(afVar, i2);
        }
    }
}
