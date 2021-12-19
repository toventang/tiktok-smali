package com.ss.android.ugc.aweme.tools.beauty.a;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.beauty.views.SwitchButton;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.h;
import h.i;
import h.z;

public final class g extends RecyclerView.ViewHolder {

    /* renamed from: g  reason: collision with root package name */
    public static final a f138796g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final SwitchButton f138797a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f138798b;

    /* renamed from: c  reason: collision with root package name */
    final View f138799c;

    /* renamed from: d  reason: collision with root package name */
    public m<? super String, ? super Boolean, z> f138800d;

    /* renamed from: e  reason: collision with root package name */
    public f f138801e;

    /* renamed from: f  reason: collision with root package name */
    public final a f138802f;

    /* renamed from: h  reason: collision with root package name */
    private final h f138803h;

    /* renamed from: i  reason: collision with root package name */
    private final h f138804i;

    static {
        Covode.recordClassIndex(90784);
    }

    public final String a() {
        return (String) this.f138803h.getValue();
    }

    public final String b() {
        return (String) this.f138804i.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90785);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(90788);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return this.$itemView.getContext().getString(com.ss.android.ugc.aweme.shortvideo.m.b.f128750d);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(90789);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return this.$itemView.getContext().getString(com.ss.android.ugc.aweme.shortvideo.m.b.f128749c);
        }
    }

    public static final class c extends androidx.core.h.a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f138806b;

        static {
            Covode.recordClassIndex(90787);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(g gVar) {
            this.f138806b = gVar;
        }

        @Override // androidx.core.h.a
        public final void a(View view, androidx.core.h.a.d dVar) {
            super.a(view, dVar);
            if (dVar != null) {
                StringBuilder sb = new StringBuilder();
                View view2 = this.f138806b.itemView;
                l.b(view2, "");
                StringBuilder append = sb.append(view2.getResources().getString(R.string.a46));
                TextView textView = this.f138806b.f138798b;
                l.b(textView, "");
                dVar.b(append.append(textView.getText()).toString());
            }
        }
    }

    static final class b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f138805a;

        static {
            Covode.recordClassIndex(90786);
        }

        b(g gVar) {
            this.f138805a = gVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            m<? super String, ? super Boolean, z> mVar;
            if (z) {
                TextView textView = this.f138805a.f138798b;
                l.b(textView, "");
                textView.setText(this.f138805a.a());
            } else {
                TextView textView2 = this.f138805a.f138798b;
                l.b(textView2, "");
                textView2.setText(this.f138805a.b());
            }
            if (this.f138805a.f138802f.f138766f && (mVar = this.f138805a.f138800d) != null) {
                f fVar = this.f138805a.f138801e;
                if (fVar == null) {
                    l.a("beautyListSwitch");
                }
                mVar.invoke(fVar.f138794c, Boolean.valueOf(z));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(View view, a aVar) {
        super(view);
        l.d(view, "");
        l.d(aVar, "");
        this.f138802f = aVar;
        this.f138797a = (SwitchButton) view.findViewById(R.id.dsa);
        this.f138798b = (TextView) view.findViewById(R.id.ew6);
        this.f138799c = view.findViewById(R.id.b4g);
        this.f138803h = i.a((h.f.a.a) new e(view));
        this.f138804i = i.a((h.f.a.a) new d(view));
    }
}
