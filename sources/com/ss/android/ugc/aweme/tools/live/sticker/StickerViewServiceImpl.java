package com.ss.android.ugc.aweme.tools.live.sticker;

import android.widget.FrameLayout;
import androidx.appcompat.app.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.c.a.q;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.sticker.IStickerViewService;
import com.ss.android.ugc.aweme.sticker.f.e;
import com.ss.android.ugc.aweme.sticker.n.a;
import com.ss.android.ugc.aweme.sticker.panel.i;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.ss.android.ugc.aweme.tools.live.sticker.d;
import com.ss.android.ugc.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import java.lang.reflect.Type;
import java.util.List;

public class StickerViewServiceImpl implements IStickerViewService {
    private d liveStickerModule;
    private q<a> processorSupplier;
    private com.ss.android.ugc.aweme.sticker.l.a stickerMobHelper;

    static {
        Covode.recordClassIndex(91624);
    }

    public String getFaceTrackPath() {
        return "face_track.model";
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public boolean isShowStickerView() {
        d dVar = this.liveStickerModule;
        if (dVar == null || !e.c(dVar)) {
            return false;
        }
        return true;
    }

    public void release() {
        d dVar = this.liveStickerModule;
        if (dVar != null) {
            this.stickerMobHelper = null;
            dVar.f();
            this.liveStickerModule = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void hideStickerView() {
        d dVar = this.liveStickerModule;
        if (dVar != null) {
            l.d(dVar, "");
            i v = dVar.v();
            if (v != null) {
                v.g();
            }
        }
    }

    public String getStickerFilePath(IStickerService.FaceSticker faceSticker) {
        return faceSticker.localPath;
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void setPixelLoopStickerPresenterSupplier(q<a> qVar) {
        this.processorSupplier = qVar;
        d dVar = this.liveStickerModule;
        if (dVar != null) {
            dVar.a(qVar);
        }
    }

    public void setStickerMobHelper(com.ss.android.ugc.aweme.sticker.l.a aVar) {
        this.stickerMobHelper = aVar;
        d dVar = this.liveStickerModule;
        if (dVar != null) {
            dVar.a(aVar);
        }
    }

    public static IStickerViewService createIStickerViewServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(4613);
        Object a2 = b.a(IStickerViewService.class, z);
        if (a2 != null) {
            IStickerViewService iStickerViewService = (IStickerViewService) a2;
            MethodCollector.o(4613);
            return iStickerViewService;
        }
        if (b.er == null) {
            synchronized (IStickerViewService.class) {
                try {
                    if (b.er == null) {
                        b.er = new StickerViewServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4613);
                    throw th;
                }
            }
        }
        StickerViewServiceImpl stickerViewServiceImpl = (StickerViewServiceImpl) b.er;
        MethodCollector.o(4613);
        return stickerViewServiceImpl;
    }

    private void initLiveModuleIfNeeded(d dVar, String str) {
        d dVar2 = this.liveStickerModule;
        Effect effect = null;
        if (dVar2 == null || dVar2.r != dVar || !this.liveStickerModule.s.equals(str)) {
            d dVar3 = this.liveStickerModule;
            if (dVar3 != null) {
                effect = dVar3.f140244h.f();
                this.liveStickerModule.f();
            }
            this.liveStickerModule = new d(dVar, str);
            if (effect != null && this.liveStickerModule.f140244h.c().e().a(effect)) {
                this.liveStickerModule.f140244h.n().a(effect);
            }
        }
        q<a> qVar = this.processorSupplier;
        if (qVar != null) {
            this.liveStickerModule.a(qVar);
        }
        com.ss.android.ugc.aweme.sticker.l.a aVar = this.stickerMobHelper;
        if (aVar != null) {
            this.liveStickerModule.a(aVar);
        }
    }

    public void showStickerView(d dVar, String str, FrameLayout frameLayout, IStickerViewService.a aVar) {
        showStickerView(dVar, dVar.getSupportFragmentManager(), str, frameLayout, aVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService
    public void showStickerView(d dVar, androidx.fragment.app.i iVar, String str, FrameLayout frameLayout, IStickerViewService.a aVar) {
        initLiveModuleIfNeeded(dVar, str);
        d dVar2 = this.liveStickerModule;
        if (dVar2 != null) {
            l.d(frameLayout, "");
            l.d(iVar, "");
            if (dVar2.f135258f == null || (!l.a(dVar2.n, frameLayout)) || (!l.a(dVar2.o, iVar))) {
                dVar2.o = iVar;
                dVar2.n = frameLayout;
                i a2 = com.ss.android.ugc.aweme.sticker.l.a(dVar2.e(), dVar2.f140244h, dVar2.f140245i, dVar2.f140243a.getValue(), dVar2.p, dVar2.q).a(dVar2.r, frameLayout, dVar2.r, iVar);
                Object a3 = dVar2.q.a((Type) com.ss.android.ugc.aweme.sticker.view.a.b.class, (String) null);
                d dVar3 = dVar2.r;
                Object a4 = dVar2.q.a((Type) com.ss.android.ugc.aweme.sticker.favorite.b.class, (String) null);
                o oVar = dVar2.f140244h;
                Object a5 = dVar2.q.a((Type) StickerPreferences.class, (String) null);
                l.d(a3, "");
                l.d(dVar3, "");
                l.d(a4, "");
                l.d(oVar, "");
                l.d(a5, "");
                a2.a(new d.o(dVar2, aVar));
                a2.a(new d.p(aVar));
                a2.b(new d.q(dVar2, aVar));
                dVar2.a(a2);
            }
            d dVar4 = this.liveStickerModule;
            l.d(dVar4, "");
            i v = dVar4.v();
            if (v != null) {
                v.f();
            }
        }
    }

    public void addStickersWithModel(androidx.appcompat.app.d dVar, FrameLayout frameLayout, List<Effect> list, boolean z, boolean z2, String str) {
        initLiveModuleIfNeeded(dVar, str);
        d dVar2 = this.liveStickerModule;
        l.d(list, "");
        if ((!list.isEmpty()) && list != null) {
            e.a(dVar2, list, z, z2, null, 0, null, 1016);
        }
    }
}
