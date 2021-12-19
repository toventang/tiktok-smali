package com.ss.android.ugc.aweme.shortvideo.z.c;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.c;
import com.bytedance.tux.input.TuxRadio;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.h;
import h.i;
import h.z;

public final class d extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public m<? super Integer, ? super View, z> f133075a;

    /* renamed from: b  reason: collision with root package name */
    final TextView f133076b;

    /* renamed from: c  reason: collision with root package name */
    final TextView f133077c;

    /* renamed from: d  reason: collision with root package name */
    final AvatarImageView f133078d;

    /* renamed from: e  reason: collision with root package name */
    final TuxRadio f133079e;

    /* renamed from: f  reason: collision with root package name */
    final com.ss.android.ugc.aweme.shortvideo.z.d.a f133080f;

    /* renamed from: g  reason: collision with root package name */
    private final ImageView f133081g;

    /* renamed from: h  reason: collision with root package name */
    private final h f133082h;

    static {
        Covode.recordClassIndex(87017);
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return ((Number) this.f133082h.getValue()).intValue();
    }

    static final class a extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(87020);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) n.b(this.$itemView.getContext(), 16.0f));
        }
    }

    public final void a(View view) {
        m<? super Integer, ? super View, z> mVar;
        if (getAdapterPosition() != -1 && (mVar = this.f133075a) != null) {
            mVar.invoke(Integer.valueOf(getAdapterPosition()), view);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(com.ss.android.ugc.aweme.shortvideo.z.d.a aVar, View view) {
        super(view);
        l.d(aVar, "");
        l.d(view, "");
        this.f133080f = aVar;
        View findViewById = view.findViewById(R.id.csg);
        l.b(findViewById, "");
        this.f133076b = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.al5);
        l.b(findViewById2, "");
        this.f133077c = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.fez);
        l.b(findViewById3, "");
        this.f133081g = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.pf);
        l.b(findViewById4, "");
        this.f133078d = (AvatarImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.a5_);
        l.b(findViewById5, "");
        TuxRadio tuxRadio = (TuxRadio) findViewById5;
        this.f133079e = tuxRadio;
        this.f133082h = i.a((h.f.a.a) new a(view));
        view.setBackground(c.c(view.getContext()));
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.z.c.d.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f133083a;

            static {
                Covode.recordClassIndex(87018);
            }

            {
                this.f133083a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                d dVar = this.f133083a;
                l.b(view, "");
                dVar.a(view);
            }
        });
        tuxRadio.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.z.c.d.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f133084a;

            static {
                Covode.recordClassIndex(87019);
            }

            {
                this.f133084a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                d dVar = this.f133084a;
                l.b(view, "");
                dVar.a(view);
            }
        });
    }
}
