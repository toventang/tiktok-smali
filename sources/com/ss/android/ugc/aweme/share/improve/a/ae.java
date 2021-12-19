package com.ss.android.ugc.aweme.share.improve.a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import c.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.d.c;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.File;
import java.io.FileInputStream;

public final class ae implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f123602a;

    /* renamed from: b  reason: collision with root package name */
    public final String f123603b;

    /* renamed from: c  reason: collision with root package name */
    private final int f123604c;

    static {
        Covode.recordClassIndex(81138);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.fgf;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "save_no_watermark";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return 2131233766;
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
        return 2131233779;
    }

    public static final class a extends com.ss.android.ugc.aweme.feed.share.a.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ae f123605a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f123606b;

        static {
            Covode.recordClassIndex(81139);
        }

        @Override // com.ss.android.ugc.aweme.feed.share.a.a.a, com.ss.android.ugc.aweme.feed.share.a.a.b
        public final void a() {
            super.a();
            r.a("download_without_logo_status", new d().a("download_result", "fail").a("group_id", this.f123605a.f123602a.getAid()).a("author_id", ac.a(this.f123605a.f123602a)).a("enter_from", this.f123605a.f123603b).f66730a);
        }

        @Override // com.ss.android.ugc.aweme.feed.share.a.a.a, com.ss.android.ugc.aweme.feed.share.a.a.b
        public final void a(String str) {
            String str2;
            MethodCollector.i(9549);
            l.d(str, "");
            d dVar = new d();
            if (TextUtils.isEmpty(str)) {
                str2 = "fail";
            } else {
                str2 = "success";
            }
            r.a("download_without_logo_status", dVar.a("download_result", str2).a("group_id", this.f123605a.f123602a.getAid()).a("author_id", ac.a(this.f123605a.f123602a)).a("enter_from", this.f123605a.f123603b).f66730a);
            if (TextUtils.isEmpty(str)) {
                MethodCollector.o(9549);
                return;
            }
            Context b2 = b();
            if (b2 != null) {
                try {
                    Uri b3 = e.b(b2, new File(str).getName());
                    if (b3 == null) {
                        b3 = e.b(b2, new File(str).getName(), "video/mp4");
                        c.b.d.a(new FileInputStream(str), b2.getContentResolver().openOutputStream(b3, "w"));
                    }
                    String a2 = c.d.a.a(b2, b3);
                    if (a2 != null) {
                        e.c(b2, a2);
                    }
                    if (b3 != null && !c.b("download")) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(b2).a(R.string.h_v).a();
                    }
                    MethodCollector.o(9549);
                } catch (Exception unused) {
                    MethodCollector.o(9549);
                }
            } else {
                MethodCollector.o(9549);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ae aeVar, Context context, Context context2) {
            super(context2);
            this.f123605a = aeVar;
            this.f123606b = context;
        }
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

    static final class b implements b.AbstractC1579b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ae f123607a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.trill.share.base.b f123608b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f123609c;

        static {
            Covode.recordClassIndex(81140);
        }

        b(ae aeVar, com.ss.android.ugc.trill.share.base.b bVar, Context context) {
            this.f123607a = aeVar;
            this.f123608b = bVar;
            this.f123609c = context;
        }

        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        public final void a(String[] strArr, int[] iArr) {
            if (iArr != null && iArr.length != 0) {
                if (iArr[0] == 0) {
                    ae.a(this.f123608b, this.f123609c, this.f123607a.f123602a);
                    return;
                }
                Activity a2 = com.ss.android.ugc.aweme.share.improve.c.b.a(this.f123609c);
                if (a2 != null) {
                    ShareDependService.a.a().a(a2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        r.a("download_without_logo", new d().a("action_type", "click").a("group_id", this.f123602a.getAid()).a("author_id", ac.a(this.f123602a)).a("enter_from", this.f123603b).f66730a);
        com.ss.android.ugc.trill.share.base.b bVar = new com.ss.android.ugc.trill.share.base.b(context, false, this.f123604c, "download_no_watermark");
        bVar.a(new a(this, context, context));
        if (com.ss.android.ugc.aweme.utils.permission.e.c(com.ss.android.ugc.aweme.share.improve.c.b.a(context)) == 0) {
            a(bVar, context, this.f123602a);
        } else {
            com.ss.android.ugc.aweme.ce.b.a(com.ss.android.ugc.aweme.share.improve.c.b.a(context), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new b(this, bVar, context));
        }
    }

    public static void a(com.ss.android.ugc.trill.share.base.b bVar, Context context, Aweme aweme) {
        if (com.ss.android.ugc.trill.share.base.e.b(context, aweme)) {
            bVar.a(aweme, "no_watermark", true);
        }
    }

    public ae(Aweme aweme, String str, int i2) {
        l.d(aweme, "");
        l.d(str, "");
        this.f123602a = aweme;
        this.f123603b = str;
        this.f123604c = i2;
    }
}
