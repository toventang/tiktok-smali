package com.ss.android.ugc.aweme.q.a.b;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e extends com.ss.android.ugc.aweme.q.a.a<com.ss.android.ugc.aweme.api.model.a, a> {
    static {
        Covode.recordClassIndex(77273);
    }

    public e(bl blVar) {
        super(blVar);
    }

    public final class a extends com.ss.android.ugc.aweme.q.a.a<com.ss.android.ugc.aweme.api.model.a, a>.C3047a {

        /* renamed from: b  reason: collision with root package name */
        public final TextView f118944b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f118945c;

        static {
            Covode.recordClassIndex(77274);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar, View view) {
            super(eVar, view);
            l.d(view, "");
            this.f118945c = eVar;
            View findViewById = view.findViewById(R.id.fb7);
            l.b(findViewById, "");
            this.f118944b = (TextView) findViewById;
        }
    }

    @Override // j.a.a.c
    public final /* synthetic */ RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.a9g, viewGroup, false);
        l.b(a2, "");
        return new a(this, a2);
    }

    @Override // j.a.a.c
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, Object obj) {
        a aVar = (a) viewHolder;
        com.ss.android.ugc.aweme.api.model.a aVar2 = (com.ss.android.ugc.aweme.api.model.a) obj;
        l.d(aVar, "");
        l.d(aVar2, "");
        if (TextUtils.isEmpty(aVar2.f66465c)) {
            aVar.f118944b.setVisibility(8);
            return;
        }
        aVar.f118944b.setVisibility(0);
        aVar.f118944b.setText(aVar2.f66465c);
    }
}
