package com.ss.android.ugc.aweme.share.improve.a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.ht;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.util.o;
import com.ss.android.ugc.aweme.util.u;
import com.ss.android.ugc.aweme.util.v;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class q implements h {

    /* renamed from: a  reason: collision with root package name */
    private final String f123804a;

    static {
        Covode.recordClassIndex(81251);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.ffv;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "image_save";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_arrow_to_bottom;
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

    public q(String str) {
        l.d(str, "");
        this.f123804a = str;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    public static final class a extends com.ss.android.ugc.aweme.util.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f123805a;

        static {
            Covode.recordClassIndex(81252);
        }

        @Override // com.ss.android.ugc.aweme.util.q, com.ss.android.ugc.aweme.util.o.a
        public final void a(String str) {
            l.d(str, "");
            super.a(str);
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f123805a).a(R.string.g95).a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, Activity activity) {
            super(activity);
            this.f123805a = context;
        }
    }

    public static final class b extends v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f123806a;

        static {
            Covode.recordClassIndex(81253);
        }

        @Override // com.ss.android.ugc.aweme.util.u.b, com.ss.android.ugc.aweme.util.v
        public final void a(Uri uri) {
            super.a(uri);
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f123806a).a(R.string.g95).a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Activity activity, Activity activity2) {
            super(activity2);
            this.f123806a = activity;
        }
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

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        if (ht.a()) {
            new o(new WeakReference(context)).a(this.f123804a, new a(context, com.ss.android.ugc.aweme.share.improve.c.b.a(context)));
            return;
        }
        Activity a2 = com.ss.android.ugc.aweme.share.improve.c.b.a(context);
        if (a2 != null) {
            new u(new WeakReference(context)).a(this.f123804a, new b(a2, a2));
        }
    }
}
