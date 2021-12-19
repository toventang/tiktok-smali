package com.ss.android.ugc.aweme.discover.adapter.viewholder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.m.e;
import com.ss.android.ugc.aweme.discover.ui.al;
import com.ss.android.ugc.aweme.discover.widget.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends RecyclerView.ViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static final a f80641b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public al.b f80642a;

    static {
        Covode.recordClassIndex(50156);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50157);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f80643a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ al.b f80644b;

        static {
            Covode.recordClassIndex(50158);
        }

        @Override // com.ss.android.ugc.aweme.discover.m.e
        public final void a() {
            al.b bVar;
            if (this.f80643a.f80642a != null && (bVar = this.f80644b) != null) {
                bVar.b();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, al.b bVar) {
            super((byte) 0);
            this.f80643a = cVar;
            this.f80644b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.c$c  reason: collision with other inner class name */
    public static final class C1881c extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f80645a;

        static {
            Covode.recordClassIndex(50159);
        }

        @Override // com.ss.android.ugc.aweme.discover.m.e
        public final void a() {
            if (this.f80645a.f80642a != null) {
                View view = this.f80645a.itemView;
                l.b(view, "");
                Context context = view.getContext();
                l.b(context, "");
                d dVar = new d(context);
                View view2 = this.f80645a.itemView;
                l.b(view2, "");
                String string = view2.getContext().getString(R.string.fie);
                l.b(string, "");
                d c2 = dVar.c(string);
                View view3 = this.f80645a.itemView;
                l.b(view3, "");
                String string2 = view3.getContext().getString(R.string.fif);
                l.b(string2, "");
                d d2 = c2.d(string2);
                View view4 = this.f80645a.itemView;
                l.b(view4, "");
                String string3 = view4.getContext().getString(R.string.fic);
                l.b(string3, "");
                d a2 = d2.a(string3);
                View view5 = this.f80645a.itemView;
                l.b(view5, "");
                String string4 = view5.getContext().getString(R.string.fid);
                l.b(string4, "");
                d b2 = a2.b(string4);
                b2.show();
                TextView textView = b2.f82858a;
                TextView textView2 = b2.f82859b;
                if (textView != null) {
                    textView.setOnClickListener(new a(b2));
                }
                if (textView2 != null) {
                    textView2.setOnClickListener(new b(this, b2));
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1881c(c cVar) {
            super((byte) 0);
            this.f80645a = cVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.c$c$a */
        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f80646a;

            static {
                Covode.recordClassIndex(50160);
            }

            a(d dVar) {
                this.f80646a = dVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f80646a.dismiss();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.c$c$b */
        static final class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1881c f80647a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f80648b;

            static {
                Covode.recordClassIndex(50161);
            }

            b(C1881c cVar, d dVar) {
                this.f80647a = cVar;
                this.f80648b = dVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                al.b bVar = this.f80647a.f80645a.f80642a;
                if (bVar != null) {
                    bVar.b();
                }
                this.f80648b.dismiss();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view, al.b bVar) {
        super(view);
        l.d(view, "");
        this.f80642a = bVar;
        this.itemView.setOnClickListener(new b(this, bVar));
        this.itemView.setOnClickListener(new C1881c(this));
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.a72);
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(42);
        }
        View view2 = this.itemView;
        l.b(view2, "");
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            View view3 = this.itemView;
            l.b(view3, "");
            layoutParams.height = (int) n.b(view3.getContext(), 40.0f);
            View view4 = this.itemView;
            l.b(view4, "");
            view4.setLayoutParams(layoutParams);
        }
    }
}
