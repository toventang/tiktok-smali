package com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.h;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.gs;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class d extends h {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f131864a = gs.a();

    /* renamed from: b  reason: collision with root package name */
    public TuxTextView f131865b;

    /* renamed from: c  reason: collision with root package name */
    public h.f.a.a<z> f131866c;

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.a<z> f131867d;

    /* renamed from: e  reason: collision with root package name */
    public final Activity f131868e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f131869f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f131870g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f131871h;

    static {
        Covode.recordClassIndex(86394);
    }

    public final void b() {
        Drawable a2 = androidx.core.content.b.a(getContext(), 2131232375);
        Drawable a3 = androidx.core.content.b.a(getContext(), 2131232374);
        ImageView imageView = this.f131869f;
        if (imageView != null) {
            if (f.a("android.permission.CAMERA")) {
                a3 = a2;
            }
            imageView.setImageDrawable(a3);
        }
        Drawable a4 = androidx.core.content.b.a(getContext(), 2131232377);
        ImageView imageView2 = this.f131870g;
        if (imageView2 != null) {
            if (f.a("android.permission.RECORD_AUDIO")) {
                a4 = a2;
            }
            imageView2.setImageDrawable(a4);
        }
        Drawable a5 = androidx.core.content.b.a(getContext(), 2131232376);
        ImageView imageView3 = this.f131871h;
        if (imageView3 != null) {
            if (!f.a("android.permission.WRITE_EXTERNAL_STORAGE")) {
                a2 = a5;
            }
            imageView3.setImageDrawable(a2);
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f131872a;

        static {
            Covode.recordClassIndex(86395);
        }

        a(d dVar) {
            this.f131872a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f131872a.cancel();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f131873a;

        static {
            Covode.recordClassIndex(86396);
        }

        b(d dVar) {
            this.f131873a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.a<z> aVar = this.f131873a.f131866c;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    static final class c implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f131874a;

        static {
            Covode.recordClassIndex(86397);
        }

        c(d dVar) {
            this.f131874a = dVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            h.f.a.a<z> aVar = this.f131874a.f131867d;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Activity activity) {
        super(activity);
        l.d(activity, "");
        this.f131868e = activity;
    }

    @Override // androidx.appcompat.app.h
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        requestWindowFeature(1);
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.as5, (ViewGroup) findViewById(R.id.adh), false);
        setContentView(a2);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(17170445);
        }
        this.f131869f = (ImageView) a2.findViewById(R.id.bur);
        this.f131870g = (ImageView) a2.findViewById(R.id.bz0);
        this.f131871h = (ImageView) a2.findViewById(R.id.bwz);
        this.f131865b = (TuxTextView) a2.findViewById(R.id.j1);
        TextView textView = (TextView) a2.findViewById(R.id.ee9);
        l.b(textView, "");
        if (this.f131864a) {
            string = getContext().getString(R.string.g_w, getContext().getString(R.string.g_p), getContext().getString(R.string.g_t));
        } else {
            string = getContext().getString(R.string.g_x, getContext().getString(R.string.g_p), getContext().getString(R.string.g_t), getContext().getString(R.string.g_r));
        }
        l.b(string, "");
        textView.setText(string);
        if (this.f131864a) {
            View findViewById = a2.findViewById(R.id.b2_);
            l.b(findViewById, "");
            findViewById.setVisibility(8);
        }
        b();
        a2.findViewById(R.id.q9).setOnClickListener(new a(this));
        TuxTextView tuxTextView = this.f131865b;
        if (tuxTextView != null) {
            tuxTextView.setOnClickListener(new b(this));
        }
        setOnCancelListener(new c(this));
    }
}
