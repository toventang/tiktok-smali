package com.ss.android.ugc.aweme.discover.ui.suggest;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.c.c;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.utils.by;
import com.ss.android.ugc.aweme.utils.hv;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class DiscoverySuggestSearchBreakLineCell extends PowerCell<a> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f82734a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f82735b;

    /* renamed from: j  reason: collision with root package name */
    private final int f82736j = ((int) ((((float) i.b(GlobalContext.getContext())) - by.a(40)) / 2.0f));

    static {
        Covode.recordClassIndex(51533);
    }

    static final class a extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ int $resId;

        static {
            Covode.recordClassIndex(51534);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2) {
            super(1);
            this.$resId = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = this.$resId;
            return z.f158842a;
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DiscoverySuggestSearchBreakLineCell f82737a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f82738b;

        static {
            Covode.recordClassIndex(51535);
        }

        b(DiscoverySuggestSearchBreakLineCell discoverySuggestSearchBreakLineCell, a aVar) {
            this.f82737a = discoverySuggestSearchBreakLineCell;
            this.f82738b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f82738b.f82753b.a(this.f82737a.getLayoutPosition(), this.f82738b.f82752a);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.avc, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(a aVar) {
        boolean z;
        int i2;
        boolean z2;
        int i3;
        a aVar2 = aVar;
        l.d(aVar2, "");
        String word = aVar2.f82752a.getWord();
        if (word == null) {
            word = "";
        }
        int i4 = this.f82736j;
        boolean z3 = true;
        if (aVar2.f82752a.getWordType() != null) {
            z = true;
        } else {
            z = false;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(by.a(13));
        textPaint.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(d.f33795a));
        StaticLayout staticLayout = new StaticLayout(word, textPaint, i4 - ((int) by.a(20)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        int lineCount = staticLayout.getLineCount();
        float lineWidth = staticLayout.getLineWidth(0);
        float lineWidth2 = staticLayout.getLineWidth(lineCount - 1);
        if (z) {
            i2 = 16;
        } else {
            i2 = 0;
        }
        int a2 = (int) by.a(i2 + 20);
        if (lineCount > 1 || lineWidth > ((float) (i4 - a2))) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f82735b = z2;
        if (lineCount <= 2 && (lineCount <= 1 || lineWidth2 <= ((float) (i4 - a2)))) {
            z3 = false;
        }
        this.f82734a = z3;
        View view = this.itemView;
        l.b(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ams);
        if (aVar2.f82752a.getWordType() == null || this.f82734a) {
            tuxTextView.setText(aVar2.f82752a.getWord());
        } else {
            com.bytedance.tux.c.a a3 = c.a(new a(com.ss.android.ugc.aweme.search.s.d.a(aVar2.f82752a)));
            Context context = tuxTextView.getContext();
            l.b(context, "");
            com.bytedance.tux.c.b a4 = a3.a(context);
            a4.setBounds(0, 0, (int) by.a(16), (int) by.a(16));
            hv.a(tuxTextView, aVar2.f82752a.getWord(), a4);
        }
        View view2 = this.itemView;
        l.b(view2, "");
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (this.f82735b) {
            i3 = this.f82736j;
        } else {
            i3 = -2;
        }
        layoutParams.width = i3;
        this.itemView.setOnClickListener(new b(this, aVar2));
        this.itemView.setBackgroundResource(R.drawable.bc4);
        aVar2.f82753b.b(getLayoutPosition(), aVar2.f82752a);
    }
}
