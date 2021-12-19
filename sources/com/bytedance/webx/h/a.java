package com.bytedance.webx.h;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

public final class a implements com.bytedance.webx.h.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static com.bytedance.webx.h.a.a f46013a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f46014b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(28137);
    }

    @Override // com.bytedance.webx.h.a.a
    public final WebView a(Context context, String str) {
        com.bytedance.webx.h.a.a aVar = f46013a;
        if (aVar != null) {
            return aVar.a(context, str);
        }
        return null;
    }

    @Override // com.bytedance.webx.h.a.a
    public final com.bytedance.webx.h.a.a a(String str, com.bytedance.webx.h.c.a aVar) {
        com.bytedance.webx.h.a.a aVar2 = f46013a;
        if (aVar2 != null) {
            aVar2.a(str, aVar);
        }
        return this;
    }
}
