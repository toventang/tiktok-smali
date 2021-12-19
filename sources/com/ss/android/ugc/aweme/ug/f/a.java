package com.ss.android.ugc.aweme.ug.f;

import android.app.Application;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.deeplink.p;
import com.ss.android.ugc.aweme.ug.e;
import f.a.d.f;
import h.f.b.l;

public abstract class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f141828a = true;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f141829b = true;

    /* renamed from: c  reason: collision with root package name */
    public e.a f141830c;

    /* renamed from: d  reason: collision with root package name */
    private e.a f141831d;

    /* renamed from: e  reason: collision with root package name */
    private Application f141832e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f141833f;

    static {
        Covode.recordClassIndex(92697);
    }

    /* access modifiers changed from: protected */
    public final String c() {
        if (!this.f141828a) {
            return "0";
        }
        this.f141828a = false;
        return "1";
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.f.a$a  reason: collision with other inner class name */
    static final class C3773a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141834a;

        static {
            Covode.recordClassIndex(92698);
        }

        C3773a(a aVar) {
            this.f141834a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                this.f141834a.f141829b = true;
            }
        }
    }

    public static /* synthetic */ void a(a aVar, String str) {
        aVar.a(str, new d());
    }

    private final void a(String str, d dVar) {
        r.a("launch_log", dVar.a("launch_method", str).a("c_launch_method", str).a("is_cold_launch", c()).a("from_channel", "user").f66730a);
    }

    @Override // com.ss.android.ugc.aweme.ug.e
    public final void a(e.a aVar, String str) {
        l.d(aVar, "");
        l.d(str, "");
        this.f141829b = false;
        this.f141830c = null;
        String value = aVar.getValue();
        d a2 = new d().a("launch_from", str);
        l.b(a2, "");
        a(value, a2);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ss.android.ugc.aweme.ug.e
    public final void a(Application application, String str) {
        e.a aVar;
        l.d(application, "");
        l.d(str, "");
        this.f141832e = application;
        if (!this.f141833f) {
            this.f141833f = true;
            com.bytedance.ies.ugc.appcontext.f.g().d(new C3773a(this));
        }
        if (this.f141829b) {
            if (this.f141830c == null) {
                switch (str.hashCode()) {
                    case -2110102721:
                        if (str.equals("com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity")) {
                            aVar = e.a.WIDGET;
                            break;
                        }
                        aVar = e.a.NONE;
                        break;
                    case -1915565709:
                        if (str.equals("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity")) {
                            aVar = e.a.SHORTCUT;
                            break;
                        }
                        aVar = e.a.NONE;
                        break;
                    case -1122151764:
                        if (str.equals("com.ss.android.ugc.aweme.share.SystemShareActivity")) {
                            aVar = e.a.OPEN_SHARE;
                            break;
                        }
                        aVar = e.a.NONE;
                        break;
                    case 163197832:
                        if (str.equals("com.ss.android.ugc.aweme.journey.StubMainActivity")) {
                            aVar = e.a.MAIN;
                            break;
                        }
                        aVar = e.a.NONE;
                        break;
                    case 683138905:
                        if (str.equals("com.ss.android.ugc.aweme.main.MainActivity")) {
                            aVar = e.a.MAIN;
                            break;
                        }
                        aVar = e.a.NONE;
                        break;
                    case 1231814645:
                        if (str.equals("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2")) {
                            aVar = e.a.DEEP_LINK;
                            break;
                        }
                        aVar = e.a.NONE;
                        break;
                    case 1685925711:
                        if (str.equals("com.ss.android.ugc.aweme.deeplink.AppLinkHandlerV2")) {
                            aVar = e.a.DEEP_LINK;
                            break;
                        }
                        aVar = e.a.NONE;
                        break;
                    default:
                        aVar = e.a.NONE;
                        break;
                }
                if (aVar == e.a.NONE) {
                    aVar = e.a.MAIN;
                    if (this.f141831d == null) {
                        this.f141831d = aVar;
                        r.a("unknown_launch_method", new d().a("class_name", str).f66730a);
                    }
                }
                this.f141830c = aVar;
            }
            if (this.f141828a && this.f141830c == e.a.MAIN) {
                this.f141829b = false;
                this.f141830c = null;
                a(this, e.a.MAIN.getValue());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ug.e
    public void a(Uri uri, boolean z, p pVar, boolean z2, long j2, boolean z3) {
        l.d(uri, "");
        l.d(pVar, "");
        this.f141829b = false;
        this.f141830c = null;
    }
}
