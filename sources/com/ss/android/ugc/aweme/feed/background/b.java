package com.ss.android.ugc.aweme.feed.background;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a;
import com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService;
import com.ss.android.ugc.aweme.feed.e.c;
import com.ss.android.ugc.aweme.feed.e.o;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class b implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final o f92665a;

    /* renamed from: b  reason: collision with root package name */
    private BackgroundAudioBrowserService f92666b;

    static {
        Covode.recordClassIndex(58771);
    }

    public final void onBindingDied(ComponentName componentName) {
    }

    public final void onNullBinding(ComponentName componentName) {
    }

    public final void a() {
        BackgroundAudioBrowserService backgroundAudioBrowserService = this.f92666b;
        if (backgroundAudioBrowserService != null) {
            backgroundAudioBrowserService.a();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f92666b = null;
    }

    public b(o oVar) {
        l.d(oVar, "");
        this.f92665a = oVar;
    }

    public final void a(Aweme aweme) {
        l.d(aweme, "");
        BackgroundAudioBrowserService backgroundAudioBrowserService = this.f92666b;
        if (backgroundAudioBrowserService != null) {
            l.d(aweme, "");
            a aVar = backgroundAudioBrowserService.f92654k;
            if (aVar == null) {
                l.a("xAndroidSessionController");
            }
            aVar.a(true);
            com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b bVar = backgroundAudioBrowserService.f92653j;
            if (bVar == null) {
                l.a("xNotificationController");
            }
            bVar.a(true);
            a aVar2 = backgroundAudioBrowserService.f92654k;
            if (aVar2 == null) {
                l.a("xAndroidSessionController");
            }
            aVar2.a(a.a(aweme));
            a aVar3 = backgroundAudioBrowserService.f92654k;
            if (aVar3 == null) {
                l.a("xAndroidSessionController");
            }
            aVar3.d();
            a aVar4 = backgroundAudioBrowserService.f92654k;
            if (aVar4 == null) {
                l.a("xAndroidSessionController");
            }
            aVar4.b();
            com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b bVar2 = backgroundAudioBrowserService.f92653j;
            if (bVar2 == null) {
                l.a("xNotificationController");
            }
            bVar2.a(a.a(aweme));
            bz unused = i.a(an.a(bf.f159041b), null, null, new BackgroundAudioBrowserService.k(backgroundAudioBrowserService, aweme, null), 3);
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        l.d(iBinder, "");
        if (!(iBinder instanceof BackgroundAudioBrowserService.c)) {
            iBinder = null;
        }
        BackgroundAudioBrowserService.c cVar = (BackgroundAudioBrowserService.c) iBinder;
        if (cVar != null) {
            BackgroundAudioBrowserService backgroundAudioBrowserService = cVar.f92657b;
            o oVar = this.f92665a;
            l.d(oVar, "");
            com.ss.android.ugc.aweme.feed.e.a aVar = backgroundAudioBrowserService.f92650g;
            l.d(oVar, "");
            aVar.f92886a = oVar;
            c cVar2 = backgroundAudioBrowserService.f92651h;
            l.d(oVar, "");
            cVar2.f92896a = oVar;
            com.ss.android.ugc.aweme.feed.e.b bVar = backgroundAudioBrowserService.f92652i;
            l.d(oVar, "");
            bVar.f92895a = oVar;
            this.f92666b = cVar.f92657b;
            c.f92667a = true;
        }
    }
}
