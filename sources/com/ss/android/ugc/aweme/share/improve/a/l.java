package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.u;
import com.ss.android.ugc.aweme.im.service.c.k;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;

public class l implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123788a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f123789b;

    /* renamed from: c  reason: collision with root package name */
    private final String f123790c;

    /* renamed from: d  reason: collision with root package name */
    private String f123791d;

    static {
        Covode.recordClassIndex(81244);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "duet";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_duet;
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
        return R.raw.icon_duet;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81245);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public int b() {
        if (AVExternalServiceImpl.a().configService().avsettingsConfig().showDuetWithReact()) {
            return R.string.be8;
        }
        return R.string.bdj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0045 A[RETURN] */
    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f123789b
            boolean r6 = com.ss.android.ugc.aweme.feed.x.m.a(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f123789b
            boolean r5 = com.ss.android.ugc.aweme.utils.y.c(r0)
            boolean r0 = com.ss.android.ugc.aweme.language.d.c()
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0043
            com.ss.android.ugc.aweme.app.s r0 = com.ss.android.ugc.aweme.app.s.a.f66880a
            com.ss.android.ugc.aweme.app.aj r1 = r0.o()
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            java.lang.Object r0 = r1.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0043
            r2 = 1
        L_0x002c:
            com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService r1 = com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl.f()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f123789b
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            boolean r1 = r1.b(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f123789b
            boolean r0 = com.ss.android.ugc.aweme.feed.model.DuetHelperKt.setGrayForDuet(r0, r6, r5, r2, r1)
            if (r0 != 0) goto L_0x0045
            return r4
        L_0x0043:
            r2 = 0
            goto L_0x002c
        L_0x0045:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.a.l.f():boolean");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        h.f.b.l.d(imageView, "");
        h.f.b.l.d(imageView, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        h.f.b.l.d(textView, "");
        h.a.a(this, textView);
    }

    public /* synthetic */ l(Aweme aweme, String str) {
        this(aweme, str, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(sharePackage, "");
        String str = this.f123791d;
        if ((str == null || str.length() == 0) && k.c()) {
            this.f123791d = "click_more_duet";
        }
        if (com.ss.android.ugc.aweme.share.improve.c.a.a(this, context, this.f123789b, this.f123790c)) {
            u.a(this.f123789b, context, this.f123791d, this.f123790c, false, 24);
        }
    }

    public l(Aweme aweme, String str, String str2) {
        h.f.b.l.d(aweme, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        this.f123789b = aweme;
        this.f123790c = str;
        this.f123791d = str2;
    }
}
