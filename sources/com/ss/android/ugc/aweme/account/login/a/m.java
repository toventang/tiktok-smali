package com.ss.android.ugc.aweme.account.login.a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.i;

public final class m extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    l f63302a;

    /* renamed from: b  reason: collision with root package name */
    final h f63303b;

    static {
        Covode.recordClassIndex(39011);
    }

    static final class b extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ View $view;

        static {
            Covode.recordClassIndex(39013);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.$view.findViewById(R.id.cnk);
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f63304a;

        static {
            Covode.recordClassIndex(39012);
        }

        a(l lVar) {
            this.f63304a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            l lVar = this.f63304a;
            if (lVar != null) {
                lVar.a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(View view) {
        super(view);
        l.d(view, "");
        this.f63303b = i.a(h.m.NONE, new b(view));
    }
}
