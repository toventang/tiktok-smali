package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.concurrent.Callable;

public final class al implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f123634a;

    static {
        Covode.recordClassIndex(81156);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.fc6;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "remove_follower";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_person_x_mark;
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

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f123635a = new a();

        static {
            Covode.recordClassIndex(81157);
        }

        a() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return new Object();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return ch_();
    }

    public al(Handler handler) {
        l.d(handler, "");
        this.f123634a = handler;
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

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        n.a().a(this.f123634a, a.f123635a, 56);
    }
}
