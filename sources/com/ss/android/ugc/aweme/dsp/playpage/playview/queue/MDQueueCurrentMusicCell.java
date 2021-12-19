package com.ss.android.ugc.aweme.dsp.playpage.playview.queue;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.dsp.playerservice.c.f;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.List;

public final class MDQueueCurrentMusicCell extends PowerCell<com.ss.android.ugc.aweme.dsp.playpage.model.b> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f83898a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private static final String f83899b = MDQueueCurrentMusicCell.class.getSimpleName();

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int j() {
        return R.layout.am2;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52309);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(52308);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void q() {
        View view = this.itemView;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.cqb);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(n.a(view.getContext()) - com.ss.android.ugc.aweme.base.utils.n.a(142.0d), -1);
        layoutParams.setMarginStart(com.ss.android.ugc.aweme.base.utils.n.a(12.0d));
        l.b(linearLayout, "");
        linearLayout.setLayoutParams(layoutParams);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MDQueueCurrentMusicCell f83900a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.dsp.playpage.model.b f83901b;

        static {
            Covode.recordClassIndex(52310);
        }

        b(MDQueueCurrentMusicCell mDQueueCurrentMusicCell, com.ss.android.ugc.aweme.dsp.playpage.model.b bVar) {
            this.f83900a = mDQueueCurrentMusicCell;
            this.f83901b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            m<String, Context, z> mVar = this.f83901b.f83737f;
            if (mVar != null) {
                String str = this.f83901b.f83732a;
                l.b(view, "");
                Context context = view.getContext();
                l.b(context, "");
                mVar.invoke(str, context);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a, java.util.List] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.dsp.playpage.model.b bVar, List list) {
        com.ss.android.ugc.aweme.dsp.playpage.model.b bVar2 = bVar;
        l.d(bVar2, "");
        l.d(list, "");
        View view = this.itemView;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.cq9);
        l.b(tuxTextView, "");
        tuxTextView.setText(bVar2.f83734c);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.cq7);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(bVar2.f83735d);
        v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(bVar2.f83733b)).a(f83899b);
        a2.E = (SmartImageView) view.findViewById(R.id.cq8);
        a2.c();
        f fVar = bVar2.f83736e;
        View view2 = this.itemView;
        if (fVar.isPlayingState()) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view2.findViewById(R.id.cqc);
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.a();
            ((TuxIconView) view2.findViewById(R.id.cq_)).setIconRes(R.raw.icon_pause_fill);
            TuxIconView tuxIconView = (TuxIconView) view2.findViewById(R.id.cq_);
            l.b(tuxIconView, "");
            tuxIconView.setVisibility(0);
        } else if (fVar.isPauseState()) {
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) view2.findViewById(R.id.cqc);
            lottieAnimationView2.setVisibility(0);
            lottieAnimationView2.setProgress(0.3f);
            lottieAnimationView2.e();
            ((TuxIconView) view2.findViewById(R.id.cq_)).setIconRes(R.raw.icon_play_fill);
            TuxIconView tuxIconView2 = (TuxIconView) view2.findViewById(R.id.cq_);
            l.b(tuxIconView2, "");
            tuxIconView2.setVisibility(0);
        } else {
            ((LottieAnimationView) view2.findViewById(R.id.cqc)).setVisibility(4);
            TuxIconView tuxIconView3 = (TuxIconView) view2.findViewById(R.id.cq_);
            l.b(tuxIconView3, "");
            tuxIconView3.setVisibility(4);
        }
        ((SmartImageView) view.findViewById(R.id.cq8)).setOnClickListener(new b(this, bVar2));
    }
}
