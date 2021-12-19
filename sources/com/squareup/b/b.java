package com.squareup.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.b.t;
import com.squareup.b.y;

/* access modifiers changed from: package-private */
public final class b extends y {

    /* renamed from: a  reason: collision with root package name */
    private static final int f58002a = 22;

    /* renamed from: b  reason: collision with root package name */
    private final AssetManager f58003b;

    static {
        Covode.recordClassIndex(36043);
    }

    public b(Context context) {
        this.f58003b = context.getAssets();
    }

    @Override // com.squareup.b.y
    public final boolean a(w wVar) {
        Uri uri = wVar.f58115d;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.b.y
    public final y.a b(w wVar) {
        MethodCollector.i(1501);
        y.a aVar = new y.a(this.f58003b.open(wVar.f58115d.toString().substring(f58002a)), t.d.DISK);
        MethodCollector.o(1501);
        return aVar;
    }
}
