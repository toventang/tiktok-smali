package com.vk.api.sdk;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tiktok.security.a.a;
import com.vk.api.sdk.c.b;
import com.vk.api.sdk.f;
import com.vk.api.sdk.f.h;
import com.vk.api.sdk.ui.VKCaptchaActivity;
import com.vk.api.sdk.ui.VKConfirmationActivity;
import com.vk.api.sdk.ui.VKWebViewAuthActivity;
import h.f.b.l;

public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f156331a;

    static {
        Covode.recordClassIndex(103821);
    }

    public g(Context context) {
        l.c(context, "");
        this.f156331a = context;
    }

    @Override // com.vk.api.sdk.f
    public final void a(b bVar, d dVar) {
        l.c(bVar, "");
        l.c(dVar, "");
        l.c(bVar, "");
        l.c(dVar, "");
        throw bVar;
    }

    @Override // com.vk.api.sdk.f
    public final void a(String str, f.a<String> aVar) {
        l.c(str, "");
        l.c(aVar, "");
        Context context = this.f156331a;
        l.c(context, "");
        l.c(str, "");
        l.a(new VKCaptchaActivity.a.RunnableC4125a(context, str));
        h.a();
        if (VKCaptchaActivity.f156361d != null) {
            String str2 = VKCaptchaActivity.f156361d;
            if (str2 == null) {
                l.a();
            }
            aVar.a(str2);
            return;
        }
        aVar.f156306b.countDown();
    }

    @Override // com.vk.api.sdk.f
    public final void b(String str, f.a<f.b> aVar) {
        l.c(str, "");
        l.c(aVar, "");
        VKWebViewAuthActivity.f156382c = null;
        Context context = this.f156331a;
        l.c(context, "");
        l.c(str, "");
        Intent putExtra = new Intent(context, VKWebViewAuthActivity.class).putExtra("vk_validation_url", str);
        l.a((Object) putExtra, "");
        a.a(putExtra, context);
        context.startActivity(putExtra);
        h.a();
        f.b bVar = VKWebViewAuthActivity.f156382c;
        if (bVar != null) {
            aVar.a(bVar);
        } else {
            aVar.f156306b.countDown();
        }
        VKWebViewAuthActivity.f156382c = null;
    }

    @Override // com.vk.api.sdk.f
    public final void c(String str, f.a<Boolean> aVar) {
        l.c(str, "");
        l.c(aVar, "");
        VKConfirmationActivity.f156375a = false;
        Context context = this.f156331a;
        l.c(context, "");
        l.c(str, "");
        l.a(new VKConfirmationActivity.a.RunnableC4126a(context, str));
        h.a();
        aVar.a(Boolean.valueOf(VKConfirmationActivity.f156375a));
        VKConfirmationActivity.f156375a = false;
    }
}
