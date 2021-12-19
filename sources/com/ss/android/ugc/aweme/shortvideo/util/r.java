package com.ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatform.c;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.sticker.m;
import com.ss.android.ugc.aweme.sticker.p.e;
import com.ss.android.ugc.aweme.view.b;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.widget.k;
import com.zhiliaoapp.musically.R;
import h.f.a.a;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f132360a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f132361b;

    /* renamed from: c  reason: collision with root package name */
    private final String f132362c;

    /* renamed from: d  reason: collision with root package name */
    private final Bundle f132363d;

    /* renamed from: e  reason: collision with root package name */
    private final j f132364e;

    static {
        Covode.recordClassIndex(86673);
    }

    r(Context context, boolean z, String str, Bundle bundle, j jVar) {
        this.f132360a = context;
        this.f132361b = z;
        this.f132362c = str;
        this.f132363d = bundle;
        this.f132364e = jVar;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        Context context = this.f132360a;
        boolean z = this.f132361b;
        String str = this.f132362c;
        Bundle bundle = this.f132363d;
        j jVar = this.f132364e;
        b bVar = null;
        f a2 = c.a(context, null);
        if (z) {
            bVar = b.C3836b.a(context, b.a.VISIBLE_AFTER_5S, m.f132337a);
            bVar.setMessage(context.getString(R.string.fuh));
            bVar.setCancelable(false);
            bVar.setIndeterminate(true);
            bVar.show();
        }
        m.a(a2).a(str, "", new IFetchEffectListener(bVar, bundle, jVar) {
            /* class com.ss.android.ugc.aweme.shortvideo.util.f.AnonymousClass4 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f132296a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bundle f132297b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ j f132298c;

            static {
                Covode.recordClassIndex(86646);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(Effect effect) {
                Effect effect2 = effect;
                k.b(this.f132296a);
                this.f132297b.putParcelable("first_sticker", effect2);
                if (effect2.getMusic() != null && !effect2.getMusic().isEmpty()) {
                    String a2 = e.a(effect2.getMusic().get(0));
                    if (!TextUtils.isEmpty(a2)) {
                        this.f132297b.putString("path", a2);
                    }
                }
                this.f132298c.a(this.f132297b);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                b bVar = this.f132296a;
                if (bVar != null) {
                    bVar.dismiss();
                }
                if (exceptionResult != null) {
                    exceptionResult.getException().printStackTrace();
                    this.f132298c.a(exceptionResult.getException());
                }
            }

            {
                this.f132296a = r1;
                this.f132297b = r2;
                this.f132298c = r3;
            }
        });
        return z.f158842a;
    }
}
