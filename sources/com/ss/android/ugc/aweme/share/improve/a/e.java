package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.dialog.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.improve.c.d;
import com.ss.android.ugc.aweme.share.k.b.b;
import com.ss.android.ugc.aweme.share.k.b.d;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e implements b, h {

    /* renamed from: a  reason: collision with root package name */
    public final d f123706a = new d(new com.ss.android.ugc.aweme.share.k.a.b(), this);

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f123707b;

    /* renamed from: c  reason: collision with root package name */
    private final String f123708c;

    static {
        Covode.recordClassIndex(81203);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.a6h;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "blacklist";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return 2131233778;
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

    @Override // com.ss.android.ugc.aweme.share.k.b.b
    public final void a(Exception exc) {
        com.ss.android.ugc.aweme.app.api.b.a.a(com.bytedance.ies.ugc.appcontext.d.a(), (Throwable) exc, (int) R.string.g4j);
    }

    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f123709a;

        static {
            Covode.recordClassIndex(81204);
        }

        a(e eVar) {
            this.f123709a = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f123709a.f123706a.a(this.f123709a.f123707b.getAuthorUid());
            dialogInterface.dismiss();
        }
    }

    public e(Aweme aweme, String str) {
        l.d(aweme, "");
        l.d(str, "");
        this.f123707b = aweme;
        this.f123708c = str;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        if (com.ss.android.ugc.aweme.share.improve.c.a.a(this, context, this.f123707b, this.f123708c)) {
            String string = context.getResources().getString(R.string.a6h);
            l.b(string, "");
            String string2 = context.getResources().getString(R.string.a6i);
            l.b(string2, "");
            String string3 = context.getResources().getString(R.string.a6h);
            l.b(string3, "");
            a aVar = new a(this);
            l.d(context, "");
            l.d(string, "");
            l.d(string2, "");
            l.d(string3, "");
            l.d(aVar, "");
            b.a aVar2 = new b.a(context);
            aVar2.a(string).b(string2).a(string3, aVar);
            d.a aVar3 = d.a.f123846a;
            aVar2.f35470a.f35452k = aVar2.f35470a.f35442a.getText(R.string.a9e);
            aVar2.f35470a.f35453l = aVar3;
            aVar2.b().show();
        }
    }
}
