package com.ss.android.ugc.aweme.dsp.library.cell;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.f.d;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.dsp.library.a.c;
import com.ss.android.ugc.aweme.dsp.playerservice.c.f;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.List;

public final class LibraryTitleCell extends PowerCell<c> {
    static {
        Covode.recordClassIndex(51990);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int j() {
        return R.layout.am1;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f83337a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LibraryTitleCell f83338b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f83339c;

        static {
            Covode.recordClassIndex(51991);
        }

        a(View view, LibraryTitleCell libraryTitleCell, c cVar) {
            this.f83337a = view;
            this.f83338b = libraryTitleCell;
            this.f83339c = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            b<Context, z> bVar = this.f83339c.f83327d;
            Context context = this.f83337a.getContext();
            l.b(context, "");
            bVar.invoke(context);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a, java.util.List] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(c cVar, List list) {
        c cVar2 = cVar;
        l.d(cVar2, "");
        l.d(list, "");
        View view = this.itemView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        d dVar = new d(view.getResources().getString(cVar2.f83324a));
        dVar.a(33);
        dVar.setSpan(new ForegroundColorSpan(view.getResources().getColor(R.color.bx)), 0, dVar.length(), 17);
        spannableStringBuilder.append((CharSequence) dVar);
        int i2 = cVar2.f83325b;
        if (1 <= i2 && 50 >= i2) {
            d dVar2 = new d("(" + cVar2.f83325b + ')');
            dVar2.a(31);
            dVar2.setSpan(new ForegroundColorSpan(view.getResources().getColor(R.color.c5)), 0, dVar2.length(), 17);
            spannableStringBuilder.append((CharSequence) dVar2);
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.c_i);
        l.b(tuxTextView, "");
        tuxTextView.setText(spannableStringBuilder);
        ((TuxButton) view.findViewById(R.id.c_f)).setOnClickListener(new a(view, this, cVar2));
        f fVar = cVar2.f83326c;
        View view2 = this.itemView;
        if (fVar.isPlayingState()) {
            ((TuxButton) view2.findViewById(R.id.c_f)).setText(R.string.dbk);
            ((TuxButton) view2.findViewById(R.id.c_f)).setButtonStartIcon(Integer.valueOf((int) R.raw.icon_pause_fill));
            ((TuxButton) view2.findViewById(R.id.c_f)).setIconHeight((int) i.a.a.a.a.b.a(12.0f));
            ((TuxButton) view2.findViewById(R.id.c_f)).setIconWidth((int) i.a.a.a.a.b.a(12.0f));
            return;
        }
        ((TuxButton) view2.findViewById(R.id.c_f)).setText(R.string.dc0);
        ((TuxButton) view2.findViewById(R.id.c_f)).setButtonStartIcon(Integer.valueOf((int) R.raw.icon_shuffle));
        ((TuxButton) view2.findViewById(R.id.c_f)).setIconHeight((int) i.a.a.a.a.b.a(18.0f));
        ((TuxButton) view2.findViewById(R.id.c_f)).setIconWidth((int) i.a.a.a.a.b.a(18.0f));
    }
}
