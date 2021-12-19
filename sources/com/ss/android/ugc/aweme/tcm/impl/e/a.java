package com.ss.android.ugc.aweme.tcm.impl.e;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBADetagBA;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBAHideLoading;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBAShowLoading;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBAToPublish;
import com.ss.android.ugc.aweme.tcm.impl.api.BABCRemoveMeApi;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f138624a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(90686);
    }

    public static final boolean a() {
        TcmConfig a2;
        TcmConfig a3;
        com.ss.android.ugc.aweme.tcm.api.a.a a4 = com.ss.android.ugc.aweme.tcm.impl.a.a.a();
        if ((a4 == null || !a4.a()) && (a2 = com.ss.android.ugc.aweme.tcm.impl.d.e.a()) != null && a2.isBrandedContentCreator() && (a3 = com.ss.android.ugc.aweme.tcm.impl.d.e.a()) != null && a3.getCanUseBrandedContentTool()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.e.a$a  reason: collision with other inner class name */
    public static final class C3658a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CheckBAShowLoading f138625a;

        static {
            Covode.recordClassIndex(90687);
        }

        public C3658a(CheckBAShowLoading checkBAShowLoading) {
            this.f138625a = checkBAShowLoading;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f138625a.showLoading();
        }
    }

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CheckBAToPublish f138630a;

        static {
            Covode.recordClassIndex(90690);
        }

        public c(CheckBAToPublish checkBAToPublish) {
            this.f138630a = checkBAToPublish;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f138630a.toPublish();
        }
    }

    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CheckBAShowLoading f138631a;

        static {
            Covode.recordClassIndex(90691);
        }

        public d(CheckBAShowLoading checkBAShowLoading) {
            this.f138631a = checkBAShowLoading;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f138631a.showLoading();
        }
    }

    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CheckBAToPublish f138637a;

        static {
            Covode.recordClassIndex(90695);
        }

        public f(CheckBAToPublish checkBAToPublish) {
            this.f138637a = checkBAToPublish;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f138637a.toPublish();
        }
    }

    public static final class h extends m implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f138640a = new h();

        static {
            Covode.recordClassIndex(90699);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
            l.d(aVar, "");
            return z.f158842a;
        }
    }

    public static final class k extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f138641a;

        static {
            Covode.recordClassIndex(90702);
        }

        public k(Context context) {
            this.f138641a = context;
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setColor(androidx.core.content.b.c(this.f138641a, R.color.a2));
            textPaint.setUnderlineText(false);
            textPaint.setFakeBoldText(true);
        }

        public final void onClick(View view) {
            String str;
            l.d(view, "");
            BrandedContentToolSchema a2 = com.ss.android.ugc.aweme.tcm.impl.d.b.a();
            if (a2 == null || (str = a2.brandedContentInfo) == null) {
                str = "https://support.tiktok.com/en/business-and-creator/creator-and-business-accounts/branded-content-on-tiktok";
            }
            SmartRouter.buildRoute(this.f138641a, "aweme://webview/").withParam("url", str).open();
        }
    }

    public static final class g extends m implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {
        final /* synthetic */ Aweme $aweme;
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(90696);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(Aweme aweme, Context context) {
            super(1);
            this.$aweme = aweme;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
            String str;
            l.d(aVar, "");
            BABCRemoveMeApi bABCRemoveMeApi = (BABCRemoveMeApi) com.ss.android.ugc.aweme.commercialize.util.b.a.a(BABCRemoveMeApi.class, com.ss.android.ugc.aweme.commercialize.util.c.f75475a);
            Aweme aweme = this.$aweme;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            bABCRemoveMeApi.getBABCRemoveMe(str).a(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.tcm.impl.e.a.g.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f138638a;

                static {
                    Covode.recordClassIndex(90697);
                }

                {
                    this.f138638a = r1;
                }

                /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
                /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
                @Override // f.a.d.f
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ void accept(java.lang.Object r8) {
                    /*
                    // Method dump skipped, instructions count: 138
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tcm.impl.e.a.g.AnonymousClass1.accept(java.lang.Object):void");
                }
            }, new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.tcm.impl.e.a.g.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f138639a;

                static {
                    Covode.recordClassIndex(90698);
                }

                {
                    this.f138639a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    a.a(this.f138639a.$context);
                    a.a(this.f138639a.$aweme, false);
                }
            });
            return z.f158842a;
        }
    }

    public static final class j extends m implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ boolean $isGeneralMusic;
        final /* synthetic */ boolean $useBcPopupExceedThreshold;

        static {
            Covode.recordClassIndex(90701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(boolean z, Activity activity, boolean z2) {
            super(1);
            this.$useBcPopupExceedThreshold = z;
            this.$activity = activity;
            this.$isGeneralMusic = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
            String str;
            String str2;
            l.d(aVar, "");
            if (this.$useBcPopupExceedThreshold) {
                str = "passively_popup_highfans_bc";
            } else {
                str = "passively_popup_lowfans_bc";
            }
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            if (this.$useBcPopupExceedThreshold) {
                str2 = "highfans_choice";
            } else {
                str2 = "lowfans_choice";
            }
            r.a(str, dVar.a(str2, 2).f66730a);
            com.ss.android.ugc.aweme.tcm.impl.b.b.a(this.$activity, this.$isGeneralMusic, null);
            return z.f158842a;
        }
    }

    public static final String a(long j2) {
        if (1000 > j2 || 9999 < j2) {
            return com.ss.android.ugc.aweme.i18n.b.a(j2);
        }
        return new BigDecimal(j2).divide(new BigDecimal(1000), 1, RoundingMode.HALF_UP).toString() + "K";
    }

    public static Activity b(Context context) {
        l.d(context, "");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) context;
            if (contextThemeWrapper.getBaseContext() instanceof Activity) {
                Context baseContext = contextThemeWrapper.getBaseContext();
                Objects.requireNonNull(baseContext, "null cannot be cast to non-null type android.app.Activity");
                return (Activity) baseContext;
            }
        }
        return com.bytedance.ies.ugc.appcontext.f.j();
    }

    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CheckBAHideLoading f138626a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CheckBAToPublish f138627b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f138628c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CheckBADetagBA f138629d;

        static {
            Covode.recordClassIndex(90688);
        }

        public b(CheckBAHideLoading checkBAHideLoading, CheckBAToPublish checkBAToPublish, Context context, CheckBADetagBA checkBADetagBA) {
            this.f138626a = checkBAHideLoading;
            this.f138627b = checkBAToPublish;
            this.f138628c = context;
            this.f138629d = checkBADetagBA;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 116
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tcm.impl.e.a.b.accept(java.lang.Object):void");
        }
    }

    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CheckBAHideLoading f138632a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CheckBAToPublish f138633b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f138634c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Activity f138635d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f138636e;

        static {
            Covode.recordClassIndex(90692);
        }

        public e(CheckBAHideLoading checkBAHideLoading, CheckBAToPublish checkBAToPublish, Context context, Activity activity, boolean z) {
            this.f138632a = checkBAHideLoading;
            this.f138633b = checkBAToPublish;
            this.f138634c = context;
            this.f138635d = activity;
            this.f138636e = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (android.text.TextUtils.isEmpty(r0) != false) goto L_0x0019;
         */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r5) {
            /*
            // Method dump skipped, instructions count: 125
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tcm.impl.e.a.e.accept(java.lang.Object):void");
        }
    }

    public static final class i extends m implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {
        final /* synthetic */ boolean $useBcPopupExceedThreshold;

        static {
            Covode.recordClassIndex(90700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(boolean z) {
            super(1);
            this.$useBcPopupExceedThreshold = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
            String str;
            String str2;
            if (this.$useBcPopupExceedThreshold) {
                r.a("tcm_bc_toggle", new com.ss.android.ugc.aweme.app.f.d().a("click_toggle", 5).f66730a);
                if (a.a()) {
                    com.ss.android.ugc.aweme.tcm.api.b.a.b("0");
                    com.ss.android.ugc.aweme.tcm.api.b.a.a((String) null);
                } else {
                    com.ss.android.ugc.aweme.tcm.api.b.c.b("0");
                    com.ss.android.ugc.aweme.tcm.api.b.c.a(null);
                }
            }
            if (this.$useBcPopupExceedThreshold) {
                str = "passively_popup_highfans_bc";
            } else {
                str = "passively_popup_lowfans_bc";
            }
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            if (this.$useBcPopupExceedThreshold) {
                str2 = "highfans_choice";
            } else {
                str2 = "lowfans_choice";
            }
            r.a(str, dVar.a(str2, 1).f66730a);
            return z.f158842a;
        }
    }

    public static void a(Context context) {
        String str;
        l.d(context, "");
        Activity b2 = b(context);
        if (b2 != null) {
            com.bytedance.tux.g.b bVar = new com.bytedance.tux.g.b(b2);
            Resources resources = context.getResources();
            if (resources != null) {
                str = resources.getString(R.string.de2);
            } else {
                str = null;
            }
            bVar.a(str).b();
        }
    }

    public static final boolean a(String str) {
        List<String> list;
        com.ss.android.ugc.aweme.commerce.e brandedContent;
        com.ss.android.ugc.aweme.commerce.c a2 = com.ss.android.ugc.aweme.tcm.impl.d.a.a();
        if (a2 == null || (brandedContent = a2.getBrandedContent()) == null) {
            list = null;
        } else {
            list = brandedContent.getEnterFroms();
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (String str2 : list) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static void a(Aweme aweme, boolean z) {
        String str;
        String str2;
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "video_play");
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("item_id", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        r.a("ttelite_BA_bctool_video_remove_tag", a3.a("remove_success", str2).f66730a);
    }
}
