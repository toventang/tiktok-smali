package com.ss.android.ugc.aweme.story.interaction.cell;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.c.e;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.story.interaction.b.f;
import com.ss.android.ugc.aweme.utils.aa;
import com.ss.android.ugc.aweme.utils.ib;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Calendar;

public final class ReactionBubblePublishCell extends BaseReactionBubbleCell<f> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f137920b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public SmartImageView f137921a;

    /* renamed from: j  reason: collision with root package name */
    private TuxTextView f137922j;

    /* renamed from: k  reason: collision with root package name */
    private TuxTextView f137923k;

    /* renamed from: l  reason: collision with root package name */
    private TuxTextView f137924l;

    static {
        Covode.recordClassIndex(90210);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90211);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactionBubblePublishCell f137925a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f137926b;

        static {
            Covode.recordClassIndex(90212);
        }

        b(ReactionBubblePublishCell reactionBubblePublishCell, f fVar) {
            this.f137925a = reactionBubblePublishCell;
            this.f137926b = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f137925a.a(this.f137926b.f137850a, this.f137926b.f137852c);
        }
    }

    static final class c extends m implements h.f.a.b<e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f137927a = new c();

        static {
            Covode.recordClassIndex(90213);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44775a = Integer.valueOf(Color.parseColor("#80545454"));
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44777c = Float.valueOf((float) h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics())));
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        MethodCollector.i(5222);
        l.d(viewGroup, "");
        View inflate = View.inflate(viewGroup.getContext(), R.layout.b2k, null);
        l.b(inflate, "");
        e a2 = com.bytedance.tux.c.f.a(c.f137927a);
        Context context = viewGroup.getContext();
        l.b(context, "");
        inflate.setBackground(a2.a(context));
        this.f137921a = (SmartImageView) inflate.findViewById(R.id.ov);
        this.f137922j = (TuxTextView) inflate.findViewById(R.id.csa);
        this.f137923k = (TuxTextView) inflate.findViewById(R.id.ekz);
        this.f137924l = (TuxTextView) inflate.findViewById(R.id.ak_);
        MethodCollector.o(5222);
        return inflate;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(com.bytedance.ies.powerlist.b.a aVar) {
        String d2;
        f fVar = (f) aVar;
        l.d(fVar, "");
        super.a((com.bytedance.ies.powerlist.b.a) fVar);
        v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(fVar.f137850a.getAvatarThumb())).a("ReactionBubblePublishCell");
        a2.E = this.f137921a;
        a2.w = a();
        a2.f39907c = true;
        a2.c();
        TuxTextView tuxTextView = this.f137922j;
        if (tuxTextView != null) {
            a.C0730a aVar2 = new a.C0730a();
            String uniqueId = fVar.f137850a.getUniqueId();
            l.b(uniqueId, "");
            tuxTextView.setText(aVar2.a(uniqueId).f33382a);
        }
        long j2 = fVar.f137851b;
        Calendar instance = Calendar.getInstance();
        l.b(instance, "");
        if (instance.getTimeInMillis() - j2 <= 0) {
            Calendar instance2 = Calendar.getInstance();
            l.b(instance2, "");
            j2 = instance2.getTimeInMillis() - 1;
        }
        if (com.bytedance.ies.abmock.b.a().a(true, "standardize_timestamp", false)) {
            aa.a aVar3 = aa.s;
            d2 = aa.a.a(j2);
        } else {
            View view = this.itemView;
            l.b(view, "");
            d2 = ib.d(view.getContext(), j2);
        }
        TuxTextView tuxTextView2 = this.f137923k;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(new a.C0730a().a(" · ".concat(String.valueOf(d2))).f33382a);
        }
        SmartImageView smartImageView = this.f137921a;
        if (smartImageView != null) {
            smartImageView.setOnClickListener(new b(this, fVar));
        }
        View view2 = this.itemView;
        l.b(view2, "");
        view2.setTag(2);
    }
}
