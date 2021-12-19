package com.ss.android.ugc.aweme.commercialize.tasks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.depend.AdTaskDependImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;
import org.json.JSONObject;

public final class a implements IAdTaskDepend {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75298a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IAdTaskDepend f75299b;

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final Intent a(Context context) {
        l.d(context, "");
        return this.f75299b.a(context);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final String a() {
        return this.f75299b.a();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final JSONObject a(Context context, Aweme aweme, String str) {
        l.d(context, "");
        l.d(aweme, "");
        l.d(str, "");
        return this.f75299b.a(context, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final void a(Context context, int i2, int i3) {
        l.d(context, "");
        this.f75299b.a(context, i2, i3);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final void a(Context context, String str, String str2, Bundle bundle) {
        l.d(context, "");
        l.d(str, "");
        this.f75299b.a(context, str, str2, bundle);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final void a(String str) {
        l.d(str, "");
        this.f75299b.a(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean a(Context context, int i2) {
        l.d(context, "");
        return this.f75299b.a(context, i2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean a(Context context, AwemeRawAd awemeRawAd, String str, String str2, String str3, int i2) {
        l.d(context, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return this.f75299b.a(context, awemeRawAd, str, str2, str3, i2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        return this.f75299b.a(context, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean a(Context context, String str, String str2) {
        return this.f75299b.a(context, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean a(Context context, String str, String str2, String str3, String str4) {
        return this.f75299b.a(context, str, str2, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean a(Aweme aweme) {
        return this.f75299b.a(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean a(AwemeRawAd awemeRawAd) {
        return this.f75299b.a(awemeRawAd);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean a(String str, Context context, AwemeRawAd awemeRawAd) {
        l.d(str, "");
        l.d(context, "");
        return this.f75299b.a(str, context, awemeRawAd);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean a(boolean z, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return this.f75299b.a(z, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final void b(Context context) {
        l.d(context, "");
        this.f75299b.b(context);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean b() {
        return this.f75299b.b();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean b(String str) {
        l.d(str, "");
        return this.f75299b.b(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean c(String str) {
        l.d(str, "");
        return this.f75299b.c(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final void d(String str) {
        l.d(str, "");
        this.f75299b.d(str);
    }

    static {
        Covode.recordClassIndex(46471);
    }

    private a() {
        IAdTaskDepend c2 = AdTaskDependImpl.c();
        l.b(c2, "");
        this.f75299b = c2;
    }
}
