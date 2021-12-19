package com.ss.android.ugc.aweme.dsp.library.cell;

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
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.dsp.playerservice.c.f;
import com.ss.android.ugc.aweme.utils.ia;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.l;
import h.z;
import java.util.List;

public final class LibraryMusicCell extends PowerCell<com.ss.android.ugc.aweme.dsp.library.a.b> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f83332a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private static final String f83333b = LibraryMusicCell.class.getSimpleName();

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int j() {
        return R.layout.am0;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51988);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(51987);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void q() {
        View view = this.itemView;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.c_e);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(n.a(view.getContext()) - com.ss.android.ugc.aweme.base.utils.n.a(142.0d), -1);
        layoutParams.setMarginStart(com.ss.android.ugc.aweme.base.utils.n.a(12.0d));
        l.b(linearLayout, "");
        linearLayout.setLayoutParams(layoutParams);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f83334a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LibraryMusicCell f83335b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.dsp.library.a.b f83336c;

        static {
            Covode.recordClassIndex(51989);
        }

        b(View view, LibraryMusicCell libraryMusicCell, com.ss.android.ugc.aweme.dsp.library.a.b bVar) {
            this.f83334a = view;
            this.f83335b = libraryMusicCell;
            this.f83336c = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            q<Context, String, String, z> qVar = this.f83336c.f83323h;
            if (qVar != null) {
                Context context = this.f83334a.getContext();
                l.b(context, "");
                qVar.invoke(context, this.f83336c.f83316a, this.f83336c.f83317b);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a, java.util.List] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.dsp.library.a.b bVar, List list) {
        com.ss.android.ugc.aweme.dsp.library.a.b bVar2 = bVar;
        l.d(bVar2, "");
        l.d(list, "");
        View view = this.itemView;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.c_d);
        l.b(tuxTextView, "");
        tuxTextView.setText(bVar2.f83319d);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.c_a);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(bVar2.f83320e);
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.c_b);
        l.b(tuxTextView3, "");
        tuxTextView3.setText(ia.a(bVar2.f83321f));
        v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(bVar2.f83318c)).a(f83333b);
        a2.E = (SmartImageView) view.findViewById(R.id.c_c);
        a2.c();
        f fVar = bVar2.f83322g;
        View view2 = this.itemView;
        if (fVar.isPlayingState()) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view2.findViewById(R.id.c_k);
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.a();
        } else if (fVar.isPauseState()) {
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) view2.findViewById(R.id.c_k);
            lottieAnimationView2.setVisibility(0);
            lottieAnimationView2.setProgress(0.3f);
            lottieAnimationView2.e();
        } else {
            LottieAnimationView lottieAnimationView3 = (LottieAnimationView) ((LottieAnimationView) view2.findViewById(R.id.c_k)).findViewById(R.id.c_k);
            l.b(lottieAnimationView3, "");
            lottieAnimationView3.setVisibility(4);
        }
        view.setOnClickListener(new b(view, this, bVar2));
    }
}
