package com.ss.android.ugc.gamora.recorder.g;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.tux.sheet.a.a;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.eu;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.Locale;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.fragment.app.e f147772a;

    /* renamed from: b  reason: collision with root package name */
    private final ShortVideoContext f147773b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.creativex.recorder.b.a.d f147774c;

    /* renamed from: d  reason: collision with root package name */
    private final m f147775d;

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.duet.d f147776e;

    static final class k implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static final k f147785a = new k();

        static {
            Covode.recordClassIndex(97425);
        }

        k() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
        }
    }

    static {
        Covode.recordClassIndex(97414);
    }

    @Override // com.ss.android.ugc.gamora.recorder.g.b
    public final void c() {
        this.f147775d.c(true);
    }

    @Override // com.ss.android.ugc.gamora.recorder.g.b
    public final void a() {
        com.ss.android.ugc.aweme.ah.c.a();
        this.f147775d.a(false);
    }

    @Override // com.ss.android.ugc.gamora.recorder.g.b
    public final void b() {
        com.ss.android.ugc.aweme.ah.c.a();
        this.f147775d.a(true);
    }

    public static final class j implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f147784a;

        static {
            Covode.recordClassIndex(97424);
        }

        j(h.f.a.a aVar) {
            this.f147784a = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f147784a.invoke();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<View, z> {
        final /* synthetic */ h.f.a.a $record;

        static {
            Covode.recordClassIndex(97422);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(h.f.a.a aVar) {
            super(1);
            this.$record = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            this.$record.invoke();
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<View, z> {
        final /* synthetic */ h.f.a.a $exit;

        static {
            Covode.recordClassIndex(97423);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(h.f.a.a aVar) {
            super(1);
            this.$exit = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            this.$exit.invoke();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.g.b
    public final void a(h.f.a.a<z> aVar) {
        boolean z;
        l.d(aVar, "");
        Dialog b2 = new a.C0731a(this.f147772a).b(R.string.f7v).b(R.string.a9e, (DialogInterface.OnClickListener) null, false).a(R.string.c52, (DialogInterface.OnClickListener) new g(aVar), false).a().b();
        androidx.fragment.app.e eVar = this.f147772a;
        if (TextUtils.equals("oppo", Build.BRAND.toLowerCase(Locale.getDefault()))) {
            z = eVar.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        } else {
            z = false;
        }
        if (!z && !com.ss.android.ugc.aweme.df.a.a() && !com.ss.android.ugc.aweme.df.a.a(eVar) && com.ss.android.ugc.aweme.df.a.a("ro.miui.notch", eVar) != 1 && !com.ss.android.ugc.aweme.df.a.b(eVar) && !com.ss.android.ugc.aweme.df.a.c(eVar)) {
            eu.a(b2);
        }
        b2.show();
    }

    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f147777a;

        static {
            Covode.recordClassIndex(97415);
        }

        a(h.f.a.a aVar) {
            this.f147777a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f147777a.invoke();
        }
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f147778a;

        static {
            Covode.recordClassIndex(97416);
        }

        b(h.f.a.a aVar) {
            this.f147778a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f147778a.invoke();
        }
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f147779a;

        static {
            Covode.recordClassIndex(97417);
        }

        c(h.f.a.a aVar) {
            this.f147779a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f147779a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.d$d  reason: collision with other inner class name */
    static final class DialogInterface$OnClickListenerC3978d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f147780a;

        static {
            Covode.recordClassIndex(97418);
        }

        DialogInterface$OnClickListenerC3978d(h.f.a.a aVar) {
            this.f147780a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f147780a.invoke();
        }
    }

    static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f147781a;

        static {
            Covode.recordClassIndex(97419);
        }

        e(h.f.a.a aVar) {
            this.f147781a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f147781a.invoke();
        }
    }

    static final class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f147782a;

        static {
            Covode.recordClassIndex(97420);
        }

        f(h.f.a.a aVar) {
            this.f147782a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f147782a.invoke();
        }
    }

    static final class g implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f147783a;

        static {
            Covode.recordClassIndex(97421);
        }

        g(h.f.a.a aVar) {
            this.f147783a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f147783a.invoke();
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.g.b
    public final void b(h.f.a.a<z> aVar, h.f.a.a<z> aVar2, h.f.a.a<z> aVar3) {
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        try {
            new c.a(this.f147772a, R.style.wt).b(R.string.b0u).b(R.string.bqu, new a(aVar)).a(R.string.b0r, new b(aVar3)).c(R.string.b0t, new c(aVar2)).b();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.df.e.a(e2.toString());
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.g.b
    public final void c(h.f.a.a<z> aVar, h.f.a.a<z> aVar2, h.f.a.a<z> aVar3) {
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        try {
            new c.a(this.f147772a, R.style.wt).b(R.string.b0v).b(R.string.bqu, new DialogInterface$OnClickListenerC3978d(aVar)).a(R.string.b0s, new e(aVar3)).c(R.string.b0t, new f(aVar2)).b();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.df.e.a(e2.toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.recorder.g.b
    public final void a(h.f.a.a<z> aVar, h.f.a.a<z> aVar2, h.f.a.a<z> aVar3) {
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        a.b a2 = new a.b().a(new a.e().a(R.string.yf).b(1).a(new h(aVar3)), new a.e().a(R.string.ym).a(new i(aVar2))).a(R.string.a9e).a(new j(aVar));
        k kVar = k.f147785a;
        l.c(kVar, "");
        a2.f45252a.f45234b = kVar;
        a2.b().show(this.f147772a.getSupportFragmentManager(), "record action sheet");
    }

    public d(androidx.fragment.app.e eVar, ShortVideoContext shortVideoContext, com.bytedance.creativex.recorder.b.a.d dVar, m mVar, com.ss.android.ugc.aweme.shortvideo.duet.d dVar2) {
        l.d(eVar, "");
        l.d(shortVideoContext, "");
        l.d(dVar, "");
        l.d(mVar, "");
        this.f147772a = eVar;
        this.f147773b = shortVideoContext;
        this.f147774c = dVar;
        this.f147775d = mVar;
        this.f147776e = dVar2;
    }
}
