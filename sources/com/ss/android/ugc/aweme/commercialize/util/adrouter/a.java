package com.ss.android.ugc.aweme.commercialize.util.adrouter;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.depend.AdRouterHandlerDependImpl;
import h.f.a.b;
import h.f.b.l;
import h.z;
import org.json.JSONObject;

public final class a implements IAdRouterHandlerDepend {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75399a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IAdRouterHandlerDepend f75400b;

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final String a() {
        return this.f75400b.a();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void a(b<? super Boolean, z> bVar) {
        l.d(bVar, "");
        this.f75400b.a(bVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void a(String str) {
        l.d(str, "");
        this.f75400b.a(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void a(String str, JSONObject jSONObject, String str2, String str3) {
        l.d(str, "");
        this.f75400b.a(str, jSONObject, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean a(Context context, String str, Uri uri, b bVar) {
        l.d(context, "");
        return this.f75400b.a(context, str, uri, bVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean a(Context context, String str, String str2) {
        return this.f75400b.a(context, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final com.ss.android.ugc.aweme.commercialize.util.adrouter.a.a b(b<? super Boolean, z> bVar) {
        return this.f75400b.b(bVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean b(String str) {
        l.d(str, "");
        return this.f75400b.b(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final com.ss.android.ugc.aweme.commercialize.util.adrouter.a.a c(b<? super Boolean, z> bVar) {
        return this.f75400b.c(bVar);
    }

    static {
        Covode.recordClassIndex(46534);
    }

    private a() {
        IAdRouterHandlerDepend b2 = AdRouterHandlerDependImpl.b();
        l.b(b2, "");
        this.f75400b = b2;
    }
}
