package com.ss.android.ugc.aweme.discover.alading.a;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.utils.by;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.l;
import h.z;

public final class b extends RecyclerView.ViewHolder {

    /* renamed from: i  reason: collision with root package name */
    static final float f80716i = by.a(2);

    /* renamed from: j  reason: collision with root package name */
    public static final a f80717j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    View f80718a;

    /* renamed from: b  reason: collision with root package name */
    SmartImageView f80719b;

    /* renamed from: c  reason: collision with root package name */
    TextView f80720c;

    /* renamed from: d  reason: collision with root package name */
    TextView f80721d;

    /* renamed from: e  reason: collision with root package name */
    View f80722e;

    /* renamed from: f  reason: collision with root package name */
    boolean f80723f;

    /* renamed from: g  reason: collision with root package name */
    Aweme f80724g;

    /* renamed from: h  reason: collision with root package name */
    public final q<View, Integer, Aweme, z> f80725h;

    public static final class a {
        static {
            Covode.recordClassIndex(50201);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.a.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC1883b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f80726a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f80727b;

        static {
            Covode.recordClassIndex(50202);
        }

        View$OnClickListenerC1883b(b bVar, Aweme aweme) {
            this.f80726a = bVar;
            this.f80727b = aweme;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                View view2 = this.f80726a.itemView;
                l.b(view2, "");
                view2.getContext();
                if (!j.f107229h || !j.b() || j.c()) {
                    j.f107229h = a();
                }
                if (!j.f107229h) {
                    View view3 = this.f80726a.itemView;
                    l.b(view3, "");
                    new com.ss.android.ugc.aweme.tux.a.i.a(view3.getContext()).a(R.string.de8).a();
                    return;
                }
                a.f80707f = this.f80727b.getAid();
                q<View, Integer, Aweme, z> qVar = this.f80726a.f80725h;
                if (qVar != null) {
                    l.b(view, "");
                    qVar.invoke(view, Integer.valueOf(this.f80726a.getAdapterPosition()), this.f80727b);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(50200);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.q<? super android.view.View, ? super java.lang.Integer, ? super com.ss.android.ugc.aweme.feed.model.Aweme, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view, q<? super View, ? super Integer, ? super Aweme, z> qVar) {
        super(view);
        l.d(view, "");
        this.f80725h = qVar;
        this.f80718a = view;
        LinearGradientDraweeView linearGradientDraweeView = (LinearGradientDraweeView) view.findViewById(R.id.agf);
        l.b(linearGradientDraweeView, "");
        this.f80719b = linearGradientDraweeView;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.c_s);
        l.b(tuxTextView, "");
        this.f80720c = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.cum);
        l.b(tuxTextView2, "");
        this.f80721d = tuxTextView2;
        View findViewById = view.findViewById(R.id.fgo);
        l.b(findViewById, "");
        this.f80722e = findViewById;
        this.f80723f = gb.a(view.getContext());
    }
}
