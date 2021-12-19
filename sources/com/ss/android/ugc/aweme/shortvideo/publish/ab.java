package com.ss.android.ugc.aweme.shortvideo.publish;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.google.c.h.a.k;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.ss.android.ugc.aweme.shortvideo.ct;
import com.ss.android.ugc.aweme.utils.gr;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class ab {
    static {
        Covode.recordClassIndex(85143);
    }

    public static final class a implements k<ct> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f129689a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f129690b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f129691c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f129692d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f129693e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f129694f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ l f129695g;

        static {
            Covode.recordClassIndex(85144);
        }

        @Override // com.google.c.h.a.k
        public final void onFailure(Throwable th) {
            ab.a("request Failed");
            this.f129689a.invoke();
            this.f129690b.invoke();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.c.h.a.k
        public final /* synthetic */ void onSuccess(ct ctVar) {
            ct ctVar2 = ctVar;
            this.f129689a.invoke();
            if (ctVar2 == null) {
                ab.a("null result");
                this.f129690b.invoke();
                return;
            }
            ab.a("Success isPass:" + ctVar2.isPassed() + " status_code:" + ctVar2.status_code);
            if (ctVar2.status_code != 0 || !l.a((Object) ctVar2.isPassed(), (Object) false)) {
                this.f129690b.invoke();
                return;
            }
            String a2 = ab.a(this.f129691c, ctVar2.getReasonBody(), R.string.esf);
            String a3 = ab.a(this.f129691c, ctVar2.getReasonTitle(), R.string.esg);
            if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(a3)) {
                this.f129690b.invoke();
                return;
            }
            a.C0731a aVar = new a.C0731a(this.f129691c);
            aVar.f33402b = a2;
            aVar.f33401a = a3;
            aVar.a(R.string.esd, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3381a(this), false).b(R.string.ese, (DialogInterface.OnClickListener) new b(this), false);
            Dialog c2 = aVar.a().c();
            c2.setCancelable(true);
            c2.setCanceledOnTouchOutside(false);
            l.f129801a = m.POST_FREQUENCY_LIMIT_DIALOG;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.ab$a$a  reason: collision with other inner class name */
        static final class DialogInterface$OnClickListenerC3381a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f129696a;

            static {
                Covode.recordClassIndex(85145);
            }

            DialogInterface$OnClickListenerC3381a(a aVar) {
                this.f129696a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                ab.a("UserSaveDraft");
                com.ss.android.ugc.aweme.draft.k.a("couldn't upload video click to save draft");
                this.f129696a.f129692d.invoke();
            }
        }

        static final class b implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f129697a;

            static {
                Covode.recordClassIndex(85146);
            }

            b(a aVar) {
                this.f129697a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                gr.c("SC T:" + this.f129697a.f129693e + " L:" + this.f129697a.f129694f);
            }
        }

        a(h.f.a.a aVar, h.f.a.a aVar2, Context context, h.f.a.a aVar3, int i2, int i3, l lVar) {
            this.f129689a = aVar;
            this.f129690b = aVar2;
            this.f129691c = context;
            this.f129692d = aVar3;
            this.f129693e = i2;
            this.f129694f = i3;
            this.f129695g = lVar;
        }
    }

    public static final void a(String str) {
        q.a("CheckServerPrePost ".concat(String.valueOf(str)));
    }

    public static final String a(Context context, String str, int i2) {
        if (str != null && str.length() != 0) {
            return str;
        }
        String string = context.getString(i2);
        l.b(string, "");
        return string;
    }

    public static final void a(Context context, l lVar, h.f.a.a<z> aVar, h.f.a.a<z> aVar2, h.f.a.a<z> aVar3, h.f.a.a<z> aVar4) {
        l.d(lVar, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        l.d(aVar4, "");
        if (context == null) {
            a("null context");
            aVar.invoke();
            return;
        }
        int a2 = SettingsManager.a().a("pre_post_check_type", 0);
        int a3 = SettingsManager.a().a("pre_post_check_freq_limit", -1);
        a("Setting prePostCheckType:" + a2 + " prePostCheckFreqLimit:" + a3);
        if (a2 == 0) {
            aVar.invoke();
            return;
        }
        aVar2.invoke();
        com.google.c.h.a.l.a(((TTUploaderService.RetrofitService) g.a().C().retrofitCreate(AVApiImpl.b().a(), TTUploaderService.RetrofitService.class)).getServerPrePostResult(a2, a3), new a(aVar3, aVar, context, aVar4, a2, a3, lVar), i.f4826c);
    }
}
