package com.ss.android.ugc.aweme.im.sdk.u16.controller;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.router.SmartRouter;
import com.bytedance.x.c.c;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.im.sdk.u16.data.ImUnder16Manger;
import com.ss.android.ugc.aweme.im.sdk.u16.data.a;
import com.ss.android.ugc.aweme.im.service.IIMunder16Proxy;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.b;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import h.f.b.l;

public final class IMUnder16ProxyImpl implements IIMunder16Proxy {
    static {
        Covode.recordClassIndex(66471);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMunder16Proxy
    public final boolean a() {
        return ImUnder16Manger.d();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMunder16Proxy
    public final boolean c() {
        return ImUnder16Manger.c();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMunder16Proxy
    public final boolean d() {
        return ImUnder16Manger.b();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMunder16Proxy
    public final w j() {
        return new IMUnder16InitTask();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMunder16Proxy
    public final boolean b() {
        return ((Boolean) ImUnder16Manger.f103775c.a()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMunder16Proxy
    public final String e() {
        return (String) ImUnder16Manger.f103776d.a();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMunder16Proxy
    public final String f() {
        return (String) ImUnder16Manger.f103777e.a();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMunder16Proxy
    public final String g() {
        return d.a().getString(R.string.fbz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMunder16Proxy
    public final long m() {
        return ((Number) ImUnder16Manger.f103778f.a()).longValue();
    }

    public static IIMunder16Proxy n() {
        MethodCollector.i(6570);
        Object a2 = b.a(IIMunder16Proxy.class, false);
        if (a2 != null) {
            IIMunder16Proxy iIMunder16Proxy = (IIMunder16Proxy) a2;
            MethodCollector.o(6570);
            return iIMunder16Proxy;
        }
        if (b.bD == null) {
            synchronized (IIMunder16Proxy.class) {
                try {
                    if (b.bD == null) {
                        b.bD = new IMUnder16ProxyImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6570);
                    throw th;
                }
            }
        }
        IMUnder16ProxyImpl iMUnder16ProxyImpl = (IMUnder16ProxyImpl) b.bD;
        MethodCollector.o(6570);
        return iMUnder16ProxyImpl;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMunder16Proxy
    public final void h() {
        if (!c.a(ImUnder16Manger.f())) {
            SmartRouter.buildRoute(d.a(), "//webview").withParam("url", ImUnder16Manger.f()).withParam("hide_nav_bar", true).open();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMunder16Proxy
    public final void i() {
        if (!c.a(ImUnder16Manger.e())) {
            SmartRouter.buildRoute(d.a(), "//webview").withParam("url", ImUnder16Manger.e()).withParam("hide_nav_bar", true).open();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMunder16Proxy
    public final void k() {
        if (!in.d()) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (g2.isLogin()) {
                ab<a> a2 = ImUnder16Manger.f103773a.getUnder16Info().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
                l.b(a2, "");
                f.a.j.d.a(a2, ImUnder16Manger.g.f103792a, ImUnder16Manger.f.f103791a);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMunder16Proxy
    public final void l() {
        ImUnder16Manger.f103779g.storeBoolean("is_chat_function_off", false);
        ImUnder16Manger.f103779g.storeBoolean("show_msg_privacy_entrance", true);
        ImUnder16Manger.f103779g.storeString("download_data_page_url", "");
        ImUnder16Manger.f103779g.storeString("msg_disappear_page_url", "");
        ImUnder16Manger.f103779g.storeString("alert_title", "");
        ImUnder16Manger.f103779g.storeString("alert_content", "");
        ImUnder16Manger.f103779g.storeString("chat_cell_title", "");
        ImUnder16Manger.f103779g.storeString("chat_cell_content", "");
        ImUnder16Manger.f103779g.storeBoolean("show_msg_disappear_chat_cell", false);
        ImUnder16Manger.f103779g.storeBoolean("clear_im_chatlist", false);
        ImUnder16Manger.f103779g.storeBoolean("redirect_to_msg_disappear_page", false);
        ImUnder16Manger.f103779g.storeLong("msg_disappear_chat_cell_server_time", Long.MAX_VALUE);
        ImUnder16Manger.f103774b = false;
        ImUnder16Manger.a(false);
        ImUnder16Manger.b(true);
        ImUnder16Manger.a("");
        ImUnder16Manger.b("");
        ImUnder16Manger.c("");
        ImUnder16Manger.d("");
        ImUnder16Manger.e("");
        ImUnder16Manger.f("");
        ImUnder16Manger.c(false);
        ImUnder16Manger.e(false);
        ImUnder16Manger.d(false);
        ImUnder16Manger.f(false);
        ImUnder16Manger.a(Long.MAX_VALUE);
    }
}
