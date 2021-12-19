package com.ss.android.ugc.aweme.dsp.playpage.playview.queue;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.dsp.playpage.model.e;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.List;

public final class MDQueueNextMusicCell extends PowerCell<e> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f83902a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private static final String f83903b = MDQueueNextMusicCell.class.getSimpleName();

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int j() {
        return R.layout.am5;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52314);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(52313);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f83904a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MDQueueNextMusicCell f83905b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f83906c;

        static {
            Covode.recordClassIndex(52315);
        }

        b(View view, MDQueueNextMusicCell mDQueueNextMusicCell, e eVar) {
            this.f83904a = view;
            this.f83905b = mDQueueNextMusicCell;
            this.f83906c = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            m<String, Context, z> mVar = this.f83906c.f83744f;
            if (mVar != null) {
                String str = this.f83906c.f83739a;
                Context context = this.f83904a.getContext();
                l.b(context, "");
                mVar.invoke(str, context);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a, java.util.List] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(e eVar, List list) {
        float f2;
        int color;
        int color2;
        e eVar2 = eVar;
        l.d(eVar2, "");
        l.d(list, "");
        View view = this.itemView;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.cq9);
        l.b(tuxTextView, "");
        tuxTextView.setText(eVar2.f83741c);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.cq7);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(eVar2.f83742d);
        v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(eVar2.f83740b)).a(f83903b);
        a2.E = (SmartImageView) view.findViewById(R.id.cq8);
        a2.c();
        boolean z = eVar2.f83743e;
        View view2 = this.itemView;
        SmartImageView smartImageView = (SmartImageView) view2.findViewById(R.id.cq8);
        l.b(smartImageView, "");
        if (z) {
            f2 = 0.5f;
        } else {
            f2 = 1.0f;
        }
        smartImageView.setAlpha(f2);
        TuxTextView tuxTextView3 = (TuxTextView) view2.findViewById(R.id.cq9);
        Resources resources = view2.getResources();
        if (z) {
            color = resources.getColor(R.color.c5);
        } else {
            color = resources.getColor(R.color.bx);
        }
        tuxTextView3.setTextColor(color);
        TuxTextView tuxTextView4 = (TuxTextView) view2.findViewById(R.id.cq7);
        if (z) {
            color2 = view2.getResources().getColor(R.color.bz);
        } else {
            color2 = view2.getResources().getColor(R.color.c5);
        }
        tuxTextView4.setTextColor(color2);
        view.setOnClickListener(new b(view, this, eVar2));
    }
}
