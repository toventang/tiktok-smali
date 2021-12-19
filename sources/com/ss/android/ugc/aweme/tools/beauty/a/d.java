package com.ss.android.ugc.aweme.tools.beauty.a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.e.b.c;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class d extends h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f138778c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final com.ss.android.ugc.aweme.tools.beauty.views.b f138779a = ((com.ss.android.ugc.aweme.tools.beauty.views.b) this.itemView.findViewById(R.id.bt1));

    /* renamed from: b  reason: collision with root package name */
    public m<? super ComposerBeauty, ? super Integer, z> f138780b;

    /* renamed from: d  reason: collision with root package name */
    private final ImageView f138781d = ((ImageView) this.itemView.findViewById(R.id.bue));

    /* renamed from: m  reason: collision with root package name */
    private final View f138782m = this.itemView.findViewById(R.id.bt2);
    private final Context n;

    static {
        Covode.recordClassIndex(90777);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90778);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComposerBeauty f138783a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f138784b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f138785c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f138786d;

        static {
            Covode.recordClassIndex(90779);
        }

        b(ComposerBeauty composerBeauty, d dVar, boolean z, boolean z2) {
            this.f138783a = composerBeauty;
            this.f138784b = dVar;
            this.f138785c = z;
            this.f138786d = z2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f138783a.getEnable()) {
                c cVar = com.ss.android.ugc.aweme.tools.beauty.e.a.f138913c;
                if (cVar != null) {
                    Context context = this.f138784b.f138815j.getContext();
                    l.b(context, "");
                    String string = this.f138784b.f138815j.getContext().getString(R.string.fvu);
                    l.b(string, "");
                    cVar.a(context, string);
                    return;
                }
                return;
            }
            m<? super ComposerBeauty, ? super Integer, z> mVar = this.f138784b.f138780b;
            if (mVar != null) {
                mVar.invoke(this.f138783a, Integer.valueOf(this.f138784b.getLayoutPosition()));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view, com.ss.android.ugc.aweme.tools.beauty.b.a.d dVar) {
        super(view, dVar);
        l.d(view, "");
        l.d(dVar, "");
        Context context = view.getContext();
        l.b(context, "");
        this.n = context;
    }
}
