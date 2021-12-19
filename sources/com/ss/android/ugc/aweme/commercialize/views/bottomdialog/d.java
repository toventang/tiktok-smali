package com.ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class d extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75976a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f75977b;

    /* renamed from: c  reason: collision with root package name */
    private final h f75978c;

    static {
        Covode.recordClassIndex(46854);
    }

    /* access modifiers changed from: package-private */
    public final FrameLayout a() {
        return (FrameLayout) this.f75977b.getValue();
    }

    /* access modifiers changed from: package-private */
    public final LinearLayout b() {
        return (LinearLayout) this.f75978c.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46855);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(46857);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return this.$itemView.findViewById(R.id.cp6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d$d  reason: collision with other inner class name */
    static final class C1733d extends m implements h.f.a.a<FrameLayout> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(46858);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1733d(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FrameLayout invoke() {
            return this.$itemView.findViewById(R.id.e4k);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f75979a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f75980b;

        static {
            Covode.recordClassIndex(46856);
        }

        b(b bVar, int i2) {
            this.f75979a = bVar;
            this.f75980b = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f75979a.a(this.f75980b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view) {
        super(view);
        l.d(view, "");
        this.f75977b = i.a((h.f.a.a) new C1733d(view));
        this.f75978c = i.a((h.f.a.a) new c(view));
    }
}
