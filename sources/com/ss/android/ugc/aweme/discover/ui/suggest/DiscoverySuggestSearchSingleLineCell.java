package com.ss.android.ugc.aweme.discover.ui.suggest;

import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.utils.by;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class DiscoverySuggestSearchSingleLineCell extends PowerCell<b> {

    /* renamed from: a  reason: collision with root package name */
    private final int f82739a = ((i.b(GlobalContext.getContext()) * 2) / 3);

    static {
        Covode.recordClassIndex(51536);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DiscoverySuggestSearchSingleLineCell f82740a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f82741b;

        static {
            Covode.recordClassIndex(51537);
        }

        a(DiscoverySuggestSearchSingleLineCell discoverySuggestSearchSingleLineCell, b bVar) {
            this.f82740a = discoverySuggestSearchSingleLineCell;
            this.f82741b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f82741b.f82756c.a(this.f82740a.getLayoutPosition(), this.f82741b.f82754a);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.avd, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(b bVar) {
        boolean z;
        int i2;
        int i3;
        b bVar2 = bVar;
        l.d(bVar2, "");
        View view = this.itemView;
        l.b(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.amr);
        l.b(tuxTextView, "");
        tuxTextView.setText(bVar2.f82754a.getWord());
        View view2 = this.itemView;
        l.b(view2, "");
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        int i4 = 0;
        if (bVar2.f82755b != 0) {
            i3 = -1;
        } else {
            String word = bVar2.f82754a.getWord();
            if (word == null) {
                word = "";
            }
            int i5 = this.f82739a;
            if (bVar2.f82754a.getWordType() != null) {
                z = true;
            } else {
                z = false;
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(by.a(13));
            textPaint.setTypeface(b.a().a(d.f33795a));
            if (z) {
                i2 = 18;
            } else {
                i2 = 0;
            }
            if (textPaint.measureText(word) + by.a(i2 + 20) > ((float) i5)) {
                i3 = this.f82739a;
            } else {
                i3 = -2;
            }
        }
        layoutParams.width = i3;
        View view3 = this.itemView;
        l.b(view3, "");
        TuxIconView tuxIconView = (TuxIconView) view3.findViewById(R.id.amt);
        l.b(tuxIconView, "");
        if (bVar2.f82754a.getWordType() == null) {
            i4 = 8;
        }
        tuxIconView.setVisibility(i4);
        this.itemView.setOnClickListener(new a(this, bVar2));
        this.itemView.setBackgroundResource(R.drawable.bc4);
        bVar2.f82756c.b(getLayoutPosition(), bVar2.f82754a);
    }
}
