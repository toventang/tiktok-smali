package com.ss.android.ugc.aweme.commercialize.b.a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class f extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    final RemoteImageView f73714a;

    /* renamed from: b  reason: collision with root package name */
    final TextView f73715b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f73716c;

    /* renamed from: d  reason: collision with root package name */
    final TextView f73717d;

    /* renamed from: e  reason: collision with root package name */
    final TextView f73718e;

    /* renamed from: f  reason: collision with root package name */
    final TextView f73719f;

    /* renamed from: g  reason: collision with root package name */
    final View f73720g;

    /* renamed from: h  reason: collision with root package name */
    public final m f73721h;

    static {
        Covode.recordClassIndex(45352);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AnchorPublishStruct f73723a;

        static {
            Covode.recordClassIndex(45354);
        }

        b(AnchorPublishStruct anchorPublishStruct) {
            this.f73723a = anchorPublishStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f73723a.onClickAction.invoke();
        }
    }

    static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f73722a;

        static {
            Covode.recordClassIndex(45353);
        }

        a(f fVar) {
            this.f73722a = fVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            float f2;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                ConstraintLayout constraintLayout = this.f73722a.f73716c;
                if (booleanValue) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.34f;
                }
                constraintLayout.setAlpha(f2);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(View view, m mVar) {
        super(view);
        l.d(view, "");
        l.d(mVar, "");
        this.f73721h = mVar;
        View findViewById = this.itemView.findViewById(R.id.btn);
        l.b(findViewById, "");
        this.f73714a = (RemoteImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.evf);
        l.b(findViewById2, "");
        this.f73715b = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.jo);
        l.b(findViewById3, "");
        this.f73716c = (ConstraintLayout) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.f8f);
        l.b(findViewById4, "");
        this.f73717d = (TextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.sh);
        l.b(findViewById5, "");
        this.f73718e = (TextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.brn);
        l.b(findViewById6, "");
        this.f73719f = (TextView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.ca6);
        l.b(findViewById7, "");
        this.f73720g = findViewById7;
    }
}
