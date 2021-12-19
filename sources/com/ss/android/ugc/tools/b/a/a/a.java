package com.ss.android.ugc.tools.b.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.ugc.effectplatform.model.net.QueryInfoStickerResponse;
import h.a.z;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final EffectChannelResponse f149090a = new EffectChannelResponse(null, 1, null);

    /* renamed from: b  reason: collision with root package name */
    public static final EffectCategoryResponse f149091b = new EffectCategoryResponse(new com.ss.ugc.effectplatform.model.EffectCategoryResponse("", "", "", null, null, null, null, z.INSTANCE, z.INSTANCE, "", null, false, null, 7288, null));

    /* renamed from: c  reason: collision with root package name */
    private static final QueryInfoStickerResponse f149092c = new QueryInfoStickerResponse(null, null, 0, 7, null);

    static {
        Covode.recordClassIndex(98206);
    }

    public static final class d implements ICheckChannelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.tools.b.a.d f149117a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f149118b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ IFetchEffectChannelListener f149119c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f149120d = false;

        static {
            Covode.recordClassIndex(98210);
        }

        /* renamed from: com.ss.android.ugc.tools.b.a.a.a$d$a  reason: collision with other inner class name */
        public static final class C4026a implements IFetchEffectChannelListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f149121a;

            static {
                Covode.recordClassIndex(98211);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C4026a(d dVar) {
                this.f149121a = dVar;
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                l.d(exceptionResult, "");
                this.f149121a.f149117a.a(this.f149121a.f149118b, false, this.f149121a.f149120d, this.f149121a.f149119c);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                l.d(effectChannelResponse2, "");
                if (effectChannelResponse2.getAllCategoryEffects().size() == 0) {
                    this.f149121a.f149117a.a(this.f149121a.f149118b, false, this.f149121a.f149120d, this.f149121a.f149119c);
                    return;
                }
                this.f149121a.f149119c.onSuccess(effectChannelResponse2);
            }
        }

        public static final class b implements IFetchEffectChannelListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f149122a;

            static {
                Covode.recordClassIndex(98212);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            b(d dVar) {
                this.f149122a = dVar;
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                l.d(exceptionResult, "");
                this.f149122a.f149117a.a(this.f149122a.f149118b, false, this.f149122a.f149120d, this.f149122a.f149119c);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                l.d(effectChannelResponse2, "");
                if (effectChannelResponse2.getAllCategoryEffects().isEmpty()) {
                    this.f149122a.f149117a.a(this.f149122a.f149118b, false, this.f149122a.f149120d, this.f149122a.f149119c);
                    return;
                }
                this.f149122a.f149119c.onSuccess(effectChannelResponse2);
            }
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
        public final void checkChannelFailed(ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            this.f149117a.a(this.f149118b, true, this.f149120d, (IFetchEffectChannelListener) new C4026a(this));
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
        public final void checkChannelSuccess(boolean z) {
            if (z) {
                this.f149117a.a(this.f149118b, false, this.f149120d, this.f149119c);
                return;
            }
            this.f149117a.a(this.f149118b, true, this.f149120d, (IFetchEffectChannelListener) new b(this));
        }

        d(com.ss.android.ugc.tools.b.a.d dVar, String str, IFetchEffectChannelListener iFetchEffectChannelListener, boolean z) {
            this.f149117a = dVar;
            this.f149118b = str;
            this.f149119c = iFetchEffectChannelListener;
        }
    }

    public static final class b implements IFetchCategoryEffectListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.tools.b.a.d f149101a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IFetchCategoryEffectListener f149102b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f149103c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f149104d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f149105e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f149106f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f149107g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f149108h;

        static {
            Covode.recordClassIndex(98208);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* bridge */ /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
            this.f149102b.onSuccess(categoryPageModel);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
        public final void onFail(ExceptionResult exceptionResult) {
            this.f149101a.a(this.f149103c, this.f149104d, this.f149105e, this.f149106f, this.f149107g, this.f149108h, false, this.f149102b);
        }

        b(com.ss.android.ugc.tools.b.a.d dVar, IFetchCategoryEffectListener iFetchCategoryEffectListener, String str, String str2, int i2, int i3, int i4, String str3) {
            this.f149101a = dVar;
            this.f149102b = iFetchCategoryEffectListener;
            this.f149103c = str;
            this.f149104d = str2;
            this.f149105e = i2;
            this.f149106f = i3;
            this.f149107g = i4;
            this.f149108h = str3;
        }
    }

    public static final class e implements IFetchEffectChannelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.tools.b.a.d f149123a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IFetchEffectChannelListener f149124b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f149125c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f149126d = false;

        static {
            Covode.recordClassIndex(98213);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* bridge */ /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            this.f149124b.onSuccess(effectChannelResponse);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            this.f149123a.a(this.f149125c, true, this.f149126d, this.f149124b);
        }

        public e(com.ss.android.ugc.tools.b.a.d dVar, IFetchEffectChannelListener iFetchEffectChannelListener, String str) {
            this.f149123a = dVar;
            this.f149124b = iFetchEffectChannelListener;
            this.f149125c = str;
        }
    }

    public static final class g implements IFetchPanelInfoListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.tools.b.a.d f149134a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IFetchPanelInfoListener f149135b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f149136c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f149137d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f149138e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f149139f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f149140g;

        static {
            Covode.recordClassIndex(98215);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(PanelInfoModel panelInfoModel) {
            l.d(panelInfoModel, "");
            this.f149135b.onSuccess(panelInfoModel);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
        public final void onFail(ExceptionResult exceptionResult) {
            this.f149134a.a(this.f149136c, this.f149137d, this.f149138e, this.f149139f, this.f149140g, false, this.f149135b);
        }

        g(com.ss.android.ugc.tools.b.a.d dVar, IFetchPanelInfoListener iFetchPanelInfoListener, String str, boolean z, String str2, int i2, int i3) {
            this.f149134a = dVar;
            this.f149135b = iFetchPanelInfoListener;
            this.f149136c = str;
            this.f149137d = z;
            this.f149138e = str2;
            this.f149139f = i2;
            this.f149140g = i3;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.b.a.a.a$a  reason: collision with other inner class name */
    public static final class C4025a implements ICheckChannelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.tools.b.a.d f149093a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f149094b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f149095c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f149096d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f149097e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f149098f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f149099g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ IFetchCategoryEffectListener f149100h;

        static {
            Covode.recordClassIndex(98207);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
        public final void checkChannelFailed(ExceptionResult exceptionResult) {
            a.a(this.f149093a, this.f149094b, this.f149095c, true, this.f149096d, this.f149097e, this.f149098f, this.f149099g, this.f149100h);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
        public final void checkChannelSuccess(boolean z) {
            a.a(this.f149093a, this.f149094b, this.f149095c, !z, this.f149096d, this.f149097e, this.f149098f, this.f149099g, this.f149100h);
        }

        public C4025a(com.ss.android.ugc.tools.b.a.d dVar, String str, String str2, int i2, int i3, int i4, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
            this.f149093a = dVar;
            this.f149094b = str;
            this.f149095c = str2;
            this.f149096d = i2;
            this.f149097e = i3;
            this.f149098f = i4;
            this.f149099g = str3;
            this.f149100h = iFetchCategoryEffectListener;
        }
    }

    public static final class c implements ICheckChannelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.tools.b.a.d f149109a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f149110b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f149111c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f149112d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f149113e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f149114f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f149115g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ IFetchCategoryEffectListener f149116h;

        static {
            Covode.recordClassIndex(98209);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
        public final void checkChannelFailed(ExceptionResult exceptionResult) {
            this.f149109a.a(this.f149110b, this.f149111c, this.f149112d, this.f149113e, this.f149114f, this.f149115g, true, this.f149116h);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
        public final void checkChannelSuccess(boolean z) {
            a.a(this.f149109a, this.f149110b, this.f149111c, !z, this.f149112d, this.f149113e, this.f149114f, this.f149115g, this.f149116h);
        }

        public c(com.ss.android.ugc.tools.b.a.d dVar, String str, String str2, int i2, int i3, int i4, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
            this.f149109a = dVar;
            this.f149110b = str;
            this.f149111c = str2;
            this.f149112d = i2;
            this.f149113e = i3;
            this.f149114f = i4;
            this.f149115g = str3;
            this.f149116h = iFetchCategoryEffectListener;
        }
    }

    public static final class f implements ICheckChannelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.tools.b.a.d f149127a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f149128b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f149129c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f149130d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f149131e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f149132f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ IFetchPanelInfoListener f149133g;

        static {
            Covode.recordClassIndex(98214);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
        public final void checkChannelFailed(ExceptionResult exceptionResult) {
            this.f149127a.a(this.f149128b, this.f149129c, this.f149130d, this.f149131e, this.f149132f, true, this.f149133g);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
        public final void checkChannelSuccess(boolean z) {
            IFetchPanelInfoListener iFetchPanelInfoListener;
            com.ss.android.ugc.tools.b.a.d dVar = this.f149127a;
            String str = this.f149128b;
            boolean z2 = this.f149129c;
            String str2 = this.f149130d;
            int i2 = this.f149131e;
            int i3 = this.f149132f;
            boolean z3 = !z;
            IFetchPanelInfoListener iFetchPanelInfoListener2 = this.f149133g;
            l.d(dVar, "");
            l.d(str, "");
            l.d(iFetchPanelInfoListener2, "");
            if (z3) {
                iFetchPanelInfoListener = new g(dVar, iFetchPanelInfoListener2, str, z2, str2, i2, i3);
            } else {
                iFetchPanelInfoListener = iFetchPanelInfoListener2;
            }
            dVar.a(str, z2, str2, i2, i3, z3, iFetchPanelInfoListener);
        }

        f(com.ss.android.ugc.tools.b.a.d dVar, String str, boolean z, String str2, int i2, int i3, IFetchPanelInfoListener iFetchPanelInfoListener) {
            this.f149127a = dVar;
            this.f149128b = str;
            this.f149129c = z;
            this.f149130d = str2;
            this.f149131e = i2;
            this.f149132f = i3;
            this.f149133g = iFetchPanelInfoListener;
        }
    }

    public static final Exception a(ExceptionResult exceptionResult) {
        Exception exc;
        String str;
        if (exceptionResult == null || (exc = exceptionResult.getException()) == null) {
            StringBuilder sb = new StringBuilder("Failed on fetch from effect platform, msg: ");
            Integer num = null;
            if (exceptionResult != null) {
                str = exceptionResult.getMsg();
            } else {
                str = null;
            }
            StringBuilder append = sb.append(str).append(", code: ");
            if (exceptionResult != null) {
                num = Integer.valueOf(exceptionResult.getErrorCode());
            }
            exc = new RuntimeException(append.append(num).toString());
        }
        return exc;
    }

    public static final void a(com.ss.android.ugc.tools.b.a.d dVar, String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        l.d(dVar, "");
        l.d(str, "");
        l.d(iFetchEffectChannelListener, "");
        dVar.a(str, null, d.a.f149142a, new d(dVar, str, iFetchEffectChannelListener, false), null);
    }

    public static final void a(com.ss.android.ugc.tools.b.a.d dVar, String str, boolean z, String str2, int i2, int i3, IFetchPanelInfoListener iFetchPanelInfoListener) {
        l.d(dVar, "");
        l.d(str, "");
        l.d(iFetchPanelInfoListener, "");
        dVar.a(str, str2, d.a.f149144c, new f(dVar, str, z, str2, i2, i3, iFetchPanelInfoListener), null);
    }

    public static final void a(com.ss.android.ugc.tools.b.a.d dVar, String str, String str2, boolean z, int i2, int i3, int i4, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        IFetchCategoryEffectListener iFetchCategoryEffectListener2;
        l.d(dVar, "");
        l.d(str, "");
        l.d(iFetchCategoryEffectListener, "");
        if (z) {
            iFetchCategoryEffectListener2 = new b(dVar, iFetchCategoryEffectListener, str, str2, i2, i3, i4, str3);
        } else {
            iFetchCategoryEffectListener2 = iFetchCategoryEffectListener;
        }
        dVar.a(str, str2, i2, i3, i4, str3, z, iFetchCategoryEffectListener2);
    }
}
