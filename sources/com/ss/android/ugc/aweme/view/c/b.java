package com.ss.android.ugc.aweme.view.c;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends com.google.android.material.bottomsheet.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f144146a;

    /* renamed from: b  reason: collision with root package name */
    public final a f144147b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f144148c;

    public interface a {
        static {
            Covode.recordClassIndex(94338);
        }

        void n();

        void o();
    }

    static {
        Covode.recordClassIndex(94337);
    }

    public final void dismiss() {
        if (this.f144146a) {
            com.ss.android.ugc.aweme.bn.a.b("tap");
        }
        super.dismiss();
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC3839b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f144149a;

        static {
            Covode.recordClassIndex(94339);
        }

        View$OnClickListenerC3839b(b bVar) {
            this.f144149a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.bn.a.b("cancel");
            this.f144149a.f144146a = false;
            this.f144149a.dismiss();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f144150a;

        static {
            Covode.recordClassIndex(94340);
        }

        c(b bVar) {
            this.f144150a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f144150a.f144147b.n();
            this.f144150a.f144146a = false;
            this.f144150a.dismiss();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f144151a;

        static {
            Covode.recordClassIndex(94341);
        }

        d(b bVar) {
            this.f144151a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f144151a.f144147b.o();
            this.f144151a.f144146a = false;
            this.f144151a.dismiss();
        }
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.apr);
        ((TuxTextView) findViewById(R.id.dad)).setOnClickListener(new View$OnClickListenerC3839b(this));
        ((TuxTextView) findViewById(R.id.dae)).setOnClickListener(new c(this));
        ((TuxTextView) findViewById(R.id.daf)).setOnClickListener(new d(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Activity activity, a aVar) {
        super(activity, R.style.a0a);
        l.d(activity, "");
        l.d(aVar, "");
        this.f144148c = activity;
        this.f144147b = aVar;
        this.f144146a = true;
    }

    public /* synthetic */ b(Activity activity, a aVar, byte b2) {
        this(activity, aVar);
    }
}
