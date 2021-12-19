package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class aj implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123628a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f123629b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f123630c;

    static {
        Covode.recordClassIndex(81153);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.f6y;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "qr_code";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_qrcode;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81154);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        return this.f123630c;
    }

    public /* synthetic */ aj() {
        this("");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return ch_();
    }

    private aj(String str) {
        l.d(str, "");
        this.f123629b = str;
        this.f123630c = true;
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
}
