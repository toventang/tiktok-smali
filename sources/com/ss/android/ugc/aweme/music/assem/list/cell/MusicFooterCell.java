package com.ss.android.ugc.aweme.music.assem.list.cell;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.ies.powerlist.page.i;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.a.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import java.util.Objects;

public final class MusicFooterCell extends PowerLoadingCell {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f111189a = {new y(MusicFooterCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/music/assem/list/cell/IFooterControl;", 0)};

    /* renamed from: j  reason: collision with root package name */
    public static final b f111190j = new b((byte) 0);
    private static final CharSequence q;
    private static final CharSequence r;

    /* renamed from: b  reason: collision with root package name */
    public k f111191b;

    /* renamed from: k  reason: collision with root package name */
    private TextView f111192k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f111193l;

    /* renamed from: m  reason: collision with root package name */
    private DmtStatusView f111194m;
    private final h.h.d n = new a(this);
    private final h o = h.i.a((h.f.a.a) new e(this));
    private final h p = h.i.a((h.f.a.a) new c(this));

    public final b d() {
        return (b) this.n.a(this, f111189a[0]);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(71402);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void b() {
        DmtStatusView dmtStatusView = this.f111194m;
        if (dmtStatusView != null) {
            dmtStatusView.g();
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void c() {
        DmtStatusView dmtStatusView = this.f111194m;
        if (dmtStatusView != null) {
            dmtStatusView.d();
        }
        DmtStatusView dmtStatusView2 = this.f111194m;
        if (dmtStatusView2 != null) {
            dmtStatusView2.f();
        }
    }

    static final class c extends m implements h.f.a.a<h.a> {
        final /* synthetic */ MusicFooterCell this$0;

        static {
            Covode.recordClassIndex(71403);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(MusicFooterCell musicFooterCell) {
            super(0);
            this.this$0 = musicFooterCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.a invoke() {
            b d2 = this.this$0.d();
            if (d2 != null) {
                return d2.B().f111198b;
            }
            return null;
        }
    }

    static final class e extends m implements h.f.a.a<PowerList> {
        final /* synthetic */ MusicFooterCell this$0;

        static {
            Covode.recordClassIndex(71405);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(MusicFooterCell musicFooterCell) {
            super(0);
            this.this$0 = musicFooterCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PowerList invoke() {
            b d2 = this.this$0.d();
            if (d2 != null) {
                return d2.B().f111197a;
            }
            return null;
        }
    }

    static {
        Covode.recordClassIndex(71400);
        String string = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.cyu);
        l.b(string, "");
        q = string;
        String string2 = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.cyt);
        l.b(string2, "");
        r = string2;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void k() {
        MethodCollector.i(9307);
        super.k();
        View view = this.itemView;
        if (view != null) {
            this.f111194m = (DmtStatusView) view;
            View view2 = this.itemView;
            l.b(view2, "");
            Context context = ((DmtStatusView) view2).getContext();
            l.b(context, "");
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.gz);
            DmtStatusView dmtStatusView = this.f111194m;
            if (dmtStatusView != null) {
                dmtStatusView.setLayoutParams(new RecyclerView.j(-1, dimensionPixelSize));
            }
            View view3 = this.itemView;
            l.b(view3, "");
            TextView textView = (TextView) LayoutInflater.from(((DmtStatusView) view3).getContext()).inflate(R.layout.bjc, (ViewGroup) null);
            this.f111192k = textView;
            if (textView != null) {
                textView.setGravity(17);
            }
            View view4 = this.itemView;
            l.b(view4, "");
            TextView textView2 = (TextView) LayoutInflater.from(((DmtStatusView) view4).getContext()).inflate(R.layout.bjd, (ViewGroup) null);
            this.f111193l = textView2;
            if (textView2 != null) {
                textView2.setText(R.string.cyt);
            }
            TextView textView3 = this.f111193l;
            if (textView3 != null) {
                textView3.setGravity(17);
            }
            DmtStatusView dmtStatusView2 = this.f111194m;
            if (dmtStatusView2 != null) {
                View view5 = this.itemView;
                l.b(view5, "");
                dmtStatusView2.setBuilder(DmtStatusView.a.a(((DmtStatusView) view5).getContext()).b(this.f111192k).c(this.f111193l));
            }
            TextView textView4 = this.f111193l;
            if (textView4 != null) {
                textView4.setOnClickListener(new d(this));
                MethodCollector.o(9307);
                return;
            }
            MethodCollector.o(9307);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
        MethodCollector.o(9307);
        throw nullPointerException;
    }

    public static final class a implements h.h.d<Object, b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PowerCell f111195a;

        static {
            Covode.recordClassIndex(71401);
        }

        public a(PowerCell powerCell) {
            this.f111195a = powerCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
            if (r0 == null) goto L_0x004b;
         */
        @Override // h.h.d
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.music.assem.list.cell.b a(java.lang.Object r6, h.k.i r7) {
            /*
            // Method dump skipped, instructions count: 149
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.assem.list.cell.MusicFooterCell.a.a(java.lang.Object, h.k.i):java.lang.Object");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void a(com.bytedance.ies.powerlist.footer.a aVar) {
        a(aVar);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        return new DmtStatusView(viewGroup.getContext());
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusicFooterCell f111196a;

        static {
            Covode.recordClassIndex(71404);
        }

        d(MusicFooterCell musicFooterCell) {
            this.f111196a = musicFooterCell;
        }

        public final void onClick(View view) {
            h.a aVar;
            ClickAgent.onClick(view);
            b d2 = this.f111196a.d();
            if (!(d2 == null || (aVar = d2.B().f111198b) == null)) {
                aVar.l();
            }
            k kVar = this.f111196a.f111191b;
            if (kVar != null) {
                kVar.f76379a = false;
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void a(com.bytedance.ies.powerlist.footer.a aVar) {
        RecyclerView recyclerView;
        CharSequence charSequence;
        TextView textView;
        l.d(aVar, "");
        TextView textView2 = this.f111193l;
        if (textView2 != null) {
            textView2.setText(r);
        }
        TextView textView3 = this.f111193l;
        if (textView3 != null) {
            textView3.setTextColor(-16777216);
        }
        TextView textView4 = this.f111192k;
        if (textView4 != null) {
            textView4.setText(q);
        }
        TextView textView5 = this.f111192k;
        if (textView5 != null) {
            textView5.setTextColor(-16777216);
        }
        com.bytedance.ies.powerlist.page.i iVar = aVar.f34291a.f34345b;
        if (iVar instanceof i.d) {
            c();
        } else if (iVar instanceof i.b) {
            com.bytedance.ies.powerlist.page.e eVar = iVar.f34399a;
            l.d(eVar, "");
            if (c.f111238a[eVar.ordinal()] == 1 && (recyclerView = (RecyclerView) this.o.getValue()) != null) {
                View view = this.itemView;
                Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
                DmtStatusView dmtStatusView = (DmtStatusView) view;
                TextView textView6 = this.f111193l;
                if (textView6 != null) {
                    charSequence = textView6.getText();
                } else {
                    charSequence = null;
                }
                View view2 = this.itemView;
                l.b(view2, "");
                if (!TextUtils.equals(charSequence, ((DmtStatusView) view2).getResources().getString(R.string.f16)) && (textView = this.f111193l) != null) {
                    textView.setText(R.string.f16);
                }
                dmtStatusView.h();
                if (this.f111191b == null) {
                    this.f111191b = new k(recyclerView, (h.a) this.p.getValue());
                }
                k kVar = this.f111191b;
                if (kVar != null) {
                    kVar.f76379a = true;
                }
            }
        } else if (iVar instanceof i.a) {
            b();
        }
    }
}
