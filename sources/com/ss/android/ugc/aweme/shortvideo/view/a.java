package com.ss.android.ugc.aweme.shortvideo.view;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.sheet.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.a<z> f132618a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.appcompat.app.d f132619b;

    /* renamed from: c  reason: collision with root package name */
    private final h f132620c = i.a((h.f.a.a) new f(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f132621d = i.a((h.f.a.a) new d(this));

    /* renamed from: e  reason: collision with root package name */
    private final h f132622e = i.a((h.f.a.a) new C3436a(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f132623f = i.a((h.f.a.a) new e(this));

    static {
        Covode.recordClassIndex(86775);
    }

    private final View c() {
        return (View) this.f132621d.getValue();
    }

    private final View d() {
        return (View) this.f132622e.getValue();
    }

    public final View a() {
        return (View) this.f132620c.getValue();
    }

    public final com.bytedance.tux.sheet.sheet.a b() {
        return (com.bytedance.tux.sheet.sheet.a) this.f132623f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.a$a  reason: collision with other inner class name */
    static final class C3436a extends m implements h.f.a.a<View> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(86776);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3436a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            View findViewById = this.this$0.a().findViewById(R.id.z_);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.view.View");
            return findViewById;
        }
    }

    static final class d extends m implements h.f.a.a<View> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(86779);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            View findViewById = this.this$0.a().findViewById(R.id.a06);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.view.View");
            return findViewById;
        }
    }

    static final class f extends m implements h.f.a.a<View> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(86782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return com.a.a(LayoutInflater.from(this.this$0.f132619b), R.layout.ae6, null, false);
        }
    }

    static final class e extends m implements h.f.a.a<com.bytedance.tux.sheet.sheet.a> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(86780);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.tux.sheet.sheet.a invoke() {
            a.C1112a aVar = new a.C1112a();
            View a2 = this.this$0.a();
            l.b(a2, "");
            return aVar.a(a2).a(true).a(new DialogInterface.OnDismissListener(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.view.a.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f132628a;

                static {
                    Covode.recordClassIndex(86781);
                }

                {
                    this.f132628a = r1;
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    h.f.a.a<z> aVar = this.f132628a.this$0.f132618a;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }
            }).f45299a;
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f132624a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f132625b;

        static {
            Covode.recordClassIndex(86777);
        }

        b(a aVar, h.f.a.a aVar2) {
            this.f132624a = aVar;
            this.f132625b = aVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f132625b.invoke();
            this.f132624a.b().dismiss();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f132626a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f132627b;

        static {
            Covode.recordClassIndex(86778);
        }

        c(a aVar, h.f.a.a aVar2) {
            this.f132626a = aVar;
            this.f132627b = aVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f132627b.invoke();
            this.f132626a.b().dismiss();
        }
    }

    public a(androidx.appcompat.app.d dVar) {
        l.d(dVar, "");
        this.f132619b = dVar;
    }

    public final void a(h.f.a.a<z> aVar, h.f.a.a<z> aVar2, h.f.a.a<z> aVar3) {
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f132618a = aVar3;
        c().setOnClickListener(new b(this, aVar));
        d().setOnClickListener(new c(this, aVar2));
        b().show(this.f132619b.getSupportFragmentManager(), "Auto-generated Captions");
    }
}
