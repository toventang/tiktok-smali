package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.k.b.c;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class at implements com.ss.android.ugc.aweme.share.k.b.a, h {

    /* renamed from: a  reason: collision with root package name */
    public final c f123646a = new c(new com.ss.android.ugc.aweme.share.k.a.a(), this);

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f123647b;

    /* renamed from: c  reason: collision with root package name */
    private final String f123648c;

    static {
        Covode.recordClassIndex(81166);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.fee;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "restrict";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return 2131233783;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return ch_();
    }

    @Override // com.ss.android.ugc.aweme.share.k.b.a
    public final void h() {
        n.a(d.a(), (int) R.string.feh);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        l.d(imageView, "");
        l.d(imageView, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        l.d(textView, "");
        h.a.a(this, textView);
    }

    @Override // com.ss.android.ugc.aweme.share.k.b.a
    public final void a(Exception exc) {
        com.ss.android.ugc.aweme.app.api.b.a.a(d.a(), (Throwable) exc, (int) R.string.g4j);
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final b f123650a = new b();

        static {
            Covode.recordClassIndex(81168);
        }

        b() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at f123649a;

        static {
            Covode.recordClassIndex(81167);
        }

        a(at atVar) {
            this.f123649a = atVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f123649a.f123646a.a(this.f123649a.f123647b.getAid());
            dialogInterface.dismiss();
        }
    }

    public at(Aweme aweme, String str) {
        l.d(aweme, "");
        l.d(str, "");
        this.f123647b = aweme;
        this.f123648c = str;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        if (com.ss.android.ugc.aweme.share.improve.c.a.a(this, context, this.f123647b, this.f123648c)) {
            new a.C0731a(context).a(R.string.fed).a(R.string.fec, (DialogInterface.OnClickListener) new a(this), false).b(R.string.a9e, (DialogInterface.OnClickListener) b.f123650a, false).a().b();
        }
    }
}
