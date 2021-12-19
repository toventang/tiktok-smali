package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.b;
import com.ss.android.ugc.aweme.player.sdk.b.e;
import com.ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.simkit.c;
import com.ss.android.ugc.aweme.simkit.d;
import com.ss.android.ugc.aweme.simkit.impl.b.a;
import com.ss.android.ugc.aweme.simkit.impl.bitrateselector.r;
import com.ss.android.ugc.aweme.video.preload.i;
import com.ss.android.ugc.aweme.video.preload.s;
import com.ss.android.ugc.playerkit.videoview.d.j;
import com.ss.android.ugc.playerkit.videoview.d.n;
import com.ss.android.ugc.playerkit.videoview.d.o;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.List;

public final class v implements b {

    /* renamed from: a  reason: collision with root package name */
    private List<n> f133575a = new ArrayList();

    static {
        Covode.recordClassIndex(87380);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.c
    public final void a(int i2, int i3, e.a aVar) {
    }

    public v() {
        c a2 = d.a();
        l.a((Object) a2, "");
        ISimKitConfig b2 = a2.b();
        l.a((Object) b2, "");
        ICommonConfig commonConfig = b2.getCommonConfig();
        l.a((Object) commonConfig, "");
        if (commonConfig.getVideoUrlHooks() != null) {
            List<n> list = this.f133575a;
            c a3 = d.a();
            l.a((Object) a3, "");
            ISimKitConfig b3 = a3.b();
            l.a((Object) b3, "");
            ICommonConfig commonConfig2 = b3.getCommonConfig();
            l.a((Object) commonConfig2, "");
            List<n> videoUrlHooks = commonConfig2.getVideoUrlHooks();
            l.a((Object) videoUrlHooks, "");
            list.addAll(videoUrlHooks);
        }
        c a4 = d.a();
        l.a((Object) a4, "");
        ISimKitConfig b4 = a4.b();
        l.a((Object) b4, "");
        if (b4.getPreloaderExperiment().PreloadTypeExperiment() == i.a.VideoCache) {
            this.f133575a.add(new com.ss.android.ugc.aweme.simkit.impl.b.b(s.b()));
        } else {
            List<n> list2 = this.f133575a;
            i b5 = s.b();
            c a5 = d.a();
            l.a((Object) a5, "");
            ISimKitConfig b6 = a5.b();
            l.a((Object) b6, "");
            ICommonConfig commonConfig3 = b6.getCommonConfig();
            l.a((Object) commonConfig3, "");
            list2.add(new a(b5, commonConfig3.getVideoUrlHookHook()));
        }
        List<n> list3 = this.f133575a;
        if (list3 == null || list3.isEmpty()) {
            n nVar = n.f148944b;
            l.a((Object) nVar, "");
            this.f133575a = h.a.n.c(nVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.b
    public final boolean a(int i2, int i3, e eVar) {
        r rVar = r.a.f133571a;
        l.a((Object) rVar, "");
        if (rVar.a() == null || eVar == null || eVar.f115343i == null) {
            r rVar2 = r.a.f133571a;
            l.a((Object) rVar2, "");
            rVar2.a();
            return false;
        }
        com.ss.android.ugc.playerkit.simapicommon.a.i a2 = com.ss.android.ugc.playerkit.d.d.a(eVar);
        if (a2 == null) {
            return false;
        }
        c a3 = d.a();
        l.a((Object) a3, "");
        if (a3.b() != null) {
            c a4 = d.a();
            l.a((Object) a4, "");
            ISimKitConfig b2 = a4.b();
            l.a((Object) b2, "");
            if (b2.getCommonConfig() != null) {
                c a5 = d.a();
                l.a((Object) a5, "");
                ISimKitConfig b3 = a5.b();
                l.a((Object) b3, "");
                if (b3.getCommonConfig().isSkipSelectBitrate(a2)) {
                    c a6 = d.a();
                    l.a((Object) a6, "");
                    ISimKitConfig b4 = a6.b();
                    l.a((Object) b4, "");
                    if (!TextUtils.isEmpty(b4.getCommonConfig().getLocalVideoPath(a2))) {
                        e.a aVar = eVar.f115343i;
                        c a7 = d.a();
                        l.a((Object) a7, "");
                        ISimKitConfig b5 = a7.b();
                        l.a((Object) b5, "");
                        aVar.w = b5.getCommonConfig().getLocalVideoPath(a2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.b
    public final boolean b(int i2, int i3, e eVar) {
        if (eVar != null && eVar.f115340f) {
            return false;
        }
        r rVar = r.a.f133571a;
        l.a((Object) rVar, "");
        if (rVar.a() == null || eVar == null || eVar.f115343i == null) {
            r rVar2 = r.a.f133571a;
            l.a((Object) rVar2, "");
            rVar2.a();
            return false;
        }
        com.ss.android.ugc.playerkit.simapicommon.a.i a2 = com.ss.android.ugc.playerkit.d.d.a(eVar);
        if (a2 == null) {
            return false;
        }
        c a3 = d.a();
        l.a((Object) a3, "");
        if (a3.b() != null) {
            c a4 = d.a();
            l.a((Object) a4, "");
            ISimKitConfig b2 = a4.b();
            l.a((Object) b2, "");
            if (b2.getCommonConfig() != null) {
                c a5 = d.a();
                l.a((Object) a5, "");
                ISimKitConfig b3 = a5.b();
                l.a((Object) b3, "");
                if (b3.getCommonConfig().isSkipSelectBitrate(a2)) {
                    c a6 = d.a();
                    l.a((Object) a6, "");
                    ISimKitConfig b4 = a6.b();
                    l.a((Object) b4, "");
                    if (!TextUtils.isEmpty(b4.getCommonConfig().getLocalVideoPath(a2))) {
                        e.a aVar = eVar.f115343i;
                        c a7 = d.a();
                        l.a((Object) a7, "");
                        ISimKitConfig b5 = a7.b();
                        l.a((Object) b5, "");
                        aVar.w = b5.getCommonConfig().getLocalVideoPath(a2);
                        return true;
                    }
                }
            }
        }
        e.a aVar2 = eVar.f115343i;
        String str = aVar2.f115352e;
        List<String> list = aVar2.f115353f;
        l.a((Object) list, "");
        Object[] array = list.toArray(new String[0]);
        if (array != null) {
            com.ss.android.ugc.playerkit.videoview.d.i iVar = new com.ss.android.ugc.playerkit.videoview.d.i(a2, str, (String[]) array);
            j a8 = new o(this.f133575a, iVar, 0).a(iVar);
            e.a aVar3 = eVar.f115343i;
            Object obj = a8.f148935a;
            if (!(obj instanceof String)) {
                obj = null;
            }
            aVar3.w = (String) obj;
            aVar3.u = a8.f148936b;
            aVar3.f115360m = a2.getRatio();
            return false;
        }
        throw new w("null cannot be cast to non-null type");
    }
}
