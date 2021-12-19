package com.ss.android.ugc.aweme.share.improve.a;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.o.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.improve.c.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class bb implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123687a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f123688b;

    /* renamed from: c  reason: collision with root package name */
    private final String f123689c;

    static {
        Covode.recordClassIndex(81193);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.fu4;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "stitch";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_stitch;
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
    public final int g() {
        return R.raw.icon_stitch;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81194);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r0.getFollowStatus() == 2) goto L_0x0080;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f() {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.a.bb.f():boolean");
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

    public bb(Aweme aweme, String str) {
        l.d(aweme, "");
        l.d(str, "");
        this.f123688b = aweme;
        this.f123689c = str;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        if (MSAdaptionService.c().b(context)) {
            g.a(context);
            return;
        }
        Activity a2 = b.a(context);
        if (a2 != null) {
            ShareDependService.a.a().a(this.f123688b, a2, this.f123689c);
        }
    }
}
