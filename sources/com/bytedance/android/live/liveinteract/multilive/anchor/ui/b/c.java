package com.bytedance.android.live.liveinteract.multilive.anchor.ui.b;

import android.view.View;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.multilive.anchor.ui.a.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends b<b> {

    /* renamed from: a  reason: collision with root package name */
    public final g f11659a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveTextView f11660b;

    static {
        Covode.recordClassIndex(6349);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11661a;

        static {
            Covode.recordClassIndex(6350);
        }

        a(c cVar) {
            this.f11661a = cVar;
        }

        public final void onClick(View view) {
            this.f11661a.f11659a.b();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.b
    public final /* synthetic */ void a(b bVar) {
        b bVar2 = bVar;
        l.d(bVar2, "");
        if (bVar2.f11658a == 1) {
            this.f11660b.setVisibility(8);
        } else {
            this.f11660b.setVisibility(0);
        }
        this.f11660b.setOnClickListener(new a(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view, g gVar) {
        super(view);
        l.d(view, "");
        l.d(gVar, "");
        this.f11659a = gVar;
        View findViewById = view.findViewById(R.id.yt);
        l.b(findViewById, "");
        this.f11660b = (LiveTextView) findViewById;
    }
}
