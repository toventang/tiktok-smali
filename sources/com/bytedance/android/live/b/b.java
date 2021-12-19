package com.bytedance.android.live.b;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.container.c;
import com.bytedance.android.livesdk.container.i.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class b implements g {
    static {
        Covode.recordClassIndex(3534);
    }

    public c createHybridView(Context context) {
        return null;
    }

    @Override // com.bytedance.android.live.b.g
    public c createHybridView(Context context, Uri uri) {
        l.d(uri, "");
        return null;
    }

    @Override // com.bytedance.android.live.b.g
    public Fragment createPageFragment(Uri uri, Context context) {
        l.d(uri, "");
        return null;
    }

    @Override // com.bytedance.android.live.b.g
    public a<?> getLynxCustomReport() {
        return null;
    }

    @Override // com.bytedance.android.live.b.g
    public a<WebView> getWebViewCustomReport() {
        return null;
    }

    @Override // com.bytedance.android.live.b.g
    public boolean handleScheme(Uri uri, Context context) {
        return false;
    }

    @Override // com.bytedance.android.live.b.g
    public boolean isContainerScheme(Uri uri) {
        return false;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }
}
