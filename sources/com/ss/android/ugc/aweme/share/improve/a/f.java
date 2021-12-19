package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.preload.b.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.concurrent.Callable;

public final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    private final User f123710a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f123711b;

    static {
        Covode.recordClassIndex(81205);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "block_user";
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
        public static final a f123712a = new a();

        static {
            Covode.recordClassIndex(81206);
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

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        if (!this.f123710a.isBlock) {
            return R.string.a6k;
        }
        return R.string.h3i;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        if (this.f123710a.isBlock) {
            return R.raw.icon_2pt_line_circle;
        }
        return R.raw.icon_2pt_block;
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

    public f(User user, Handler handler) {
        l.d(user, "");
        l.d(handler, "");
        this.f123710a = user;
        this.f123711b = handler;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        int i2;
        l.d(context, "");
        l.d(sharePackage, "");
        a.C2958a.a();
        com.ss.android.ugc.aweme.preload.b.a.a(this.f123710a.getSecUid(), this.f123710a.getUid());
        r.a("click_block", new d().a("enter_from", "others_homepage").a("to_user_id", this.f123710a.getUid()).f66730a);
        n a2 = n.a();
        Handler handler = this.f123711b;
        a aVar = a.f123712a;
        if (this.f123710a.isBlock) {
            i2 = 55;
        } else {
            i2 = 54;
        }
        a2.a(handler, aVar, i2);
    }
}
