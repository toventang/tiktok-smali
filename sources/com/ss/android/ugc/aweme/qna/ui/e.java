package com.ss.android.ugc.aweme.qna.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qna.model.k;
import com.ss.android.ugc.aweme.qna.vm.i;
import h.f.b.l;

public final class e extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public final View f119533a;

    /* renamed from: b  reason: collision with root package name */
    public final String f119534b;

    static {
        Covode.recordClassIndex(77680);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f119535a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f119536b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f119537c;

        static {
            Covode.recordClassIndex(77681);
        }

        a(e eVar, i iVar, k kVar) {
            this.f119535a = eVar;
            this.f119536b = iVar;
            this.f119537c = kVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f119536b.a(this.f119537c, this.f119535a.f119534b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(View view, String str) {
        super(view);
        l.d(view, "");
        this.f119533a = view;
        this.f119534b = str;
    }
}
