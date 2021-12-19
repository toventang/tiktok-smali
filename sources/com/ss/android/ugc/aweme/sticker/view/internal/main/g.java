package com.ss.android.ugc.aweme.sticker.view.internal.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.sticker.panel.e;
import com.ss.android.ugc.tools.view.widget.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class g implements com.ss.android.ugc.aweme.sticker.view.internal.b {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f136291a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f136292b = true;

    /* renamed from: c  reason: collision with root package name */
    public final a f136293c;

    /* renamed from: d  reason: collision with root package name */
    public final ViewGroup f136294d;

    /* renamed from: e  reason: collision with root package name */
    public final e f136295e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f136296f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f136297g;

    /* renamed from: h  reason: collision with root package name */
    private final View f136298h;

    static {
        Covode.recordClassIndex(89018);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public h.f.a.b<? super TextView, z> f136299a;

        static {
            Covode.recordClassIndex(89019);
        }

        private a() {
            this.f136299a = null;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f136300a;

        static {
            Covode.recordClassIndex(89020);
        }

        b(g gVar) {
            this.f136300a = gVar;
        }

        public final void run() {
            this.f136300a.f136291a.setEnabled(false);
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f136301a;

        static {
            Covode.recordClassIndex(89021);
        }

        c(g gVar) {
            this.f136301a = gVar;
        }

        public final void run() {
            this.f136301a.f136291a.setRotation(0.0f);
            this.f136301a.f136291a.setEnabled(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.b
    public final void a(boolean z) {
        b(z);
    }

    private final void b(boolean z) {
        float f2;
        this.f136292b = z;
        this.f136298h.setEnabled(z);
        ImageView imageView = this.f136291a;
        float f3 = 1.0f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.5f;
        }
        imageView.setAlpha(f2);
        TextView textView = this.f136297g;
        if (textView != null) {
            if (!z) {
                f3 = 0.5f;
            }
            textView.setAlpha(f3);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f136302a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f136303b;

        static {
            Covode.recordClassIndex(89022);
        }

        d(g gVar, Context context) {
            this.f136302a = gVar;
            this.f136303b = context;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f136302a.f136292b) {
                Context context = this.f136303b;
                j.a.b(context, context.getResources().getString(R.string.f9s), 0).a();
                return;
            }
            h.f.a.b<? super Boolean, Boolean> bVar = this.f136302a.f136295e.f135108d;
            if (bVar == null || !bVar.invoke(Boolean.valueOf(this.f136302a.f136292b)).booleanValue()) {
                g gVar = this.f136302a;
                e eVar = gVar.f136295e;
                gVar.f136291a.animate().rotationBy(-180.0f).setDuration(200).withStartAction(new b(gVar)).withEndAction(new c(gVar)).start();
                h.f.a.b<? super View, z> bVar2 = eVar.f135107c;
                if (bVar2 != null) {
                    bVar2.invoke(gVar.f136291a);
                }
            }
        }
    }

    public g(ViewGroup viewGroup, e eVar, boolean z) {
        int i2;
        l.d(viewGroup, "");
        l.d(eVar, "");
        this.f136294d = viewGroup;
        this.f136295e = eVar;
        this.f136296f = z;
        a aVar = new a((byte) 0);
        this.f136293c = aVar;
        h.f.a.b<? super a, z> bVar = eVar.f135110f;
        if (bVar != null) {
            bVar.invoke(aVar);
        }
        Context context = viewGroup.getContext();
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.aau, viewGroup, true);
        l.b(a2, "");
        this.f136298h = a2;
        View findViewById = a2.findViewById(R.id.bus);
        findViewById.setFocusable(true);
        findViewById.setContentDescription(context.getString(R.string.fez));
        View findViewById2 = viewGroup.findViewById(R.id.by0);
        l.b(findViewById2, "");
        ImageView imageView = (ImageView) findViewById2;
        this.f136291a = imageView;
        l.b(context, "");
        l.d(context, "");
        l.d(viewGroup, "");
        TextView textView = (TextView) viewGroup.findViewById(R.id.f0e);
        if (textView != null) {
            h.f.a.b<? super TextView, z> bVar2 = aVar.f136299a;
            if (bVar2 != null) {
                bVar2.invoke(textView);
            }
        } else {
            textView = null;
        }
        this.f136297g = textView;
        boolean z2 = eVar.f135106b;
        TextView textView2 = this.f136297g;
        if (textView2 != null) {
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView2.setVisibility(i2);
        }
        View findViewById3 = a2.findViewById(R.id.bus);
        l.b(findViewById3, "");
        findViewById3.setVisibility(0);
        imageView.setOnClickListener(new d(this, context));
        imageView.setImageResource(eVar.f135109e);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (eVar.f135105a > 0) {
            marginLayoutParams.topMargin = eVar.f135105a;
        }
        marginLayoutParams.topMargin += dh.c(context);
        b(z);
    }
}
