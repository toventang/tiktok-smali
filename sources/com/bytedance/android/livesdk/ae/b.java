package com.bytedance.android.livesdk.ae;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.b.g;
import com.bytedance.android.livesdk.container.config.base.HybridConfig;
import com.bytedance.android.livesdk.container.config.base.PageConfig;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.container.config.base.ViewConfig;
import com.bytedance.android.livesdk.container.i.c;
import com.bytedance.android.livesdk.container.i.d;
import com.bytedance.android.livesdk.container.k.e;
import com.bytedance.android.livesdk.livesetting.hybrid.LynxCardPriority;
import com.bytedance.android.livesdk.lynx.lynxcard.e;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class b implements g {
    static {
        Covode.recordClassIndex(7596);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    public static final class a implements e.a {
        static {
            Covode.recordClassIndex(7597);
        }

        @Override // com.bytedance.android.livesdk.lynx.lynxcard.e.a
        public final void a(String str) {
            l.d(str, "");
        }

        a() {
        }
    }

    @Override // com.bytedance.android.live.b.g
    public com.bytedance.android.livesdk.container.i.a<?> getLynxCustomReport() {
        return c.f16799b;
    }

    @Override // com.bytedance.android.live.b.g
    public com.bytedance.android.livesdk.container.i.a<WebView> getWebViewCustomReport() {
        return d.f16800b;
    }

    public com.bytedance.android.livesdk.container.c createHybridView(Context context) {
        if (context != null) {
            return new com.bytedance.android.livesdk.container.k.b(context);
        }
        return null;
    }

    private final void handleCard(Uri uri) {
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(f.class);
        l.b(a2, "");
        ((f) a2).getLynxCardViewManager().a(new e(uri, LynxCardPriority.INSTANCE.getPriority(uri.getQueryParameter("priority")), new a()));
    }

    @Override // com.bytedance.android.live.b.g
    public boolean isContainerScheme(Uri uri) {
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        if (com.bytedance.android.livesdk.container.j.a.f16804d.contains(host)) {
            return true;
        }
        if ((!com.bytedance.android.livesdk.container.j.a.f16803c.contains(host) || !l.a((Object) "1", (Object) uri.getQueryParameter("use_new_container"))) && !com.bytedance.android.livesdk.container.j.a.f16805e.contains(host)) {
            return false;
        }
        return true;
    }

    private final com.bytedance.android.livesdk.container.c createHybridView(Context context, HybridConfig hybridConfig) {
        com.bytedance.android.livesdk.container.c createHybridView;
        if (context == null || (createHybridView = createHybridView(context)) == null) {
            return null;
        }
        createHybridView.setConfig(hybridConfig);
        return createHybridView;
    }

    private final void handlePage(Uri uri, Context context) {
        ((IHostAction) com.bytedance.android.live.t.a.a(IHostAction.class)).openLiveNewHybrid(uri, context, new Bundle());
    }

    private final void handlePopup(Uri uri, Context context) {
        com.bytedance.android.livesdk.container.k.e a2 = e.a.a(new PopupConfig(uri));
        if (context != null) {
            if (!(context instanceof Activity)) {
                com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(IHostApp.class);
                l.b(a3, "");
                context = ((IHostApp) a3).getTopActivity();
            }
            androidx.fragment.app.e b2 = com.bytedance.android.live.core.f.a.b(context);
            if (b2 != null) {
                com.bytedance.android.live.core.widget.a.a(b2, a2);
            }
        }
    }

    @Override // com.bytedance.android.live.b.g
    public com.bytedance.android.livesdk.container.c createHybridView(Context context, Uri uri) {
        ViewConfig viewConfig;
        l.d(uri, "");
        if (context == null) {
            return null;
        }
        if (com.bytedance.android.livesdk.container.j.a.f16802b.contains(uri.getHost())) {
            viewConfig = new ViewConfig(uri.buildUpon().appendQueryParameter("init_time", String.valueOf(System.currentTimeMillis())).build());
        } else {
            viewConfig = new ViewConfig(uri);
        }
        return createHybridView(context, viewConfig);
    }

    @Override // com.bytedance.android.live.b.g
    public Fragment createPageFragment(Uri uri, Context context) {
        l.d(uri, "");
        PageConfig pageConfig = new PageConfig(uri);
        l.d(pageConfig, "");
        com.bytedance.android.livesdk.container.k.d dVar = new com.bytedance.android.livesdk.container.k.d();
        com.bytedance.android.livesdk.browser.g.a.a(pageConfig.getUrl());
        Bundle bundle = new Bundle();
        bundle.putSerializable("argument_key_config", pageConfig);
        dVar.setArguments(bundle);
        return dVar;
    }

    @Override // com.bytedance.android.live.b.g
    public boolean handleScheme(Uri uri, Context context) {
        Uri uri2;
        if (uri == null) {
            return false;
        }
        if (com.bytedance.android.livesdk.container.j.a.f16802b.contains(uri.getHost())) {
            c cVar = c.f16799b;
            String uri3 = uri.toString();
            l.b(uri3, "");
            cVar.a(uri3);
            uri2 = uri.buildUpon().appendQueryParameter("init_time", String.valueOf(System.currentTimeMillis())).build();
        } else {
            d dVar = d.f16800b;
            String uri4 = uri.toString();
            l.b(uri4, "");
            dVar.a(uri4);
            uri2 = uri;
        }
        l.b(uri2, "");
        String host = uri2.getHost();
        if (com.bytedance.android.livesdk.container.j.a.f16803c.contains(host)) {
            handlePage(uri2, context);
            return true;
        } else if (com.bytedance.android.livesdk.container.j.a.f16804d.contains(host)) {
            handlePopup(uri2, context);
            return true;
        } else if (!com.bytedance.android.livesdk.container.j.a.f16805e.contains(host)) {
            return false;
        } else {
            handleCard(uri);
            return true;
        }
    }
}
