package com.ss.android.ugc.aweme.commercialize.feed;

import android.graphics.Color;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.feed.mask.b.a;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commercialize.ad.b;
import com.ss.android.ugc.aweme.commercialize.utils.ad;
import com.ss.android.ugc.aweme.utils.j;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f74431a;

    static {
        Covode.recordClassIndex(45905);
    }

    v(h hVar) {
        this.f74431a = hVar;
    }

    public final void run() {
        String a2;
        b bVar;
        int parseColor;
        h hVar = this.f74431a;
        hVar.Y.setVisibility(4);
        hVar.H();
        bf.a("showAdLayout", hVar.o);
        hVar.t.setVisibility(0);
        j.a(hVar.u);
        TextView textView = hVar.u;
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.x(hVar.o)) {
            a2 = com.ss.android.ugc.aweme.commercialize.e.a.b.ac(hVar.o);
        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aE(hVar.o)) {
            a2 = com.ss.android.ugc.aweme.commercialize.e.a.b.aR(hVar.o);
        } else {
            a2 = ad.a(hVar.ae, hVar.o, true);
        }
        textView.setText(a2);
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.x(hVar.o)) {
            bVar = new b((float) n.a(2.0d), androidx.core.content.b.c(hVar.ae, R.color.bh));
        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aE(hVar.o)) {
            bVar = new b((float) n.a(2.0d), Color.parseColor(com.ss.android.ugc.aweme.commercialize.e.a.b.aS(hVar.o)));
        } else {
            bVar = new b((float) n.a(2.0d), androidx.core.content.b.c(hVar.ae, R.color.av));
        }
        int c2 = androidx.core.content.b.c(hVar.ae, R.color.f159926j);
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.x(hVar.o)) {
            parseColor = androidx.core.content.b.c(hVar.ae, R.color.bh);
        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aE(hVar.o)) {
            parseColor = Color.parseColor(com.ss.android.ugc.aweme.commercialize.e.a.b.aS(hVar.o));
        } else {
            parseColor = Color.parseColor(com.ss.android.ugc.aweme.commercialize.e.a.b.ak(hVar.o));
        }
        j.a(hVar.u, bVar, c2, parseColor, 300, null);
        hVar.t.animate().alpha(1.0f).setDuration(150).start();
        c.a(new a(true, hVar.o.getAid()));
    }
}
