package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.editSticker.interact.a.b;
import com.ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.scene.a;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.tools.infosticker.a.b.n;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.vesdk.z;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public List<aj> f127131a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public aj f127132b;

    /* renamed from: c  reason: collision with root package name */
    public int f127133c;

    /* renamed from: d  reason: collision with root package name */
    public InfoStickerEditView f127134d;

    /* renamed from: e  reason: collision with root package name */
    public g f127135e;

    /* renamed from: f  reason: collision with root package name */
    public a f127136f;

    /* renamed from: g  reason: collision with root package name */
    public b f127137g;

    /* renamed from: h  reason: collision with root package name */
    StickerHintTextViewModel f127138h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f127139i = true;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.e.c<aj> f127140j;

    /* renamed from: k  reason: collision with root package name */
    private final float f127141k = 0.5f;

    /* renamed from: l  reason: collision with root package name */
    private final float f127142l = 0.5f;

    /* renamed from: m  reason: collision with root package name */
    private e f127143m;

    static {
        Covode.recordClassIndex(83399);
    }

    public final boolean a(aj ajVar, int i2) {
        return (i2 >= ajVar.f127114c.startTime && i2 <= ajVar.f127114c.endTime) || ajVar.equals(this.f127132b);
    }

    public final void a(aj ajVar, int i2, int i3) {
        if (ajVar != null) {
            ajVar.f127114c.startTime = i2;
            ajVar.f127114c.endTime = i3;
            int r = this.f127135e.r(i2);
            int r2 = this.f127135e.r(i3);
            ajVar.f127114c.uiStartTime = r;
            ajVar.f127114c.uiEndTime = r2;
            this.f127135e.b(ajVar.f127114c.getId(), i2, i3);
        }
    }

    public final void a() {
        StickerHintTextViewModel stickerHintTextViewModel = this.f127138h;
        if (stickerHintTextViewModel != null) {
            stickerHintTextViewModel.a().postValue(true);
        }
    }

    public final void b() {
        aj ajVar = this.f127132b;
        if (ajVar != null) {
            ajVar.f127114c.getId();
            this.f127135e.b(this.f127132b.f127114c.getId(), this.f127132b.f127114c.startTime, this.f127132b.f127114c.endTime);
            this.f127132b.f127115d = false;
            this.f127132b = null;
        }
    }

    public final void c() {
        for (aj ajVar : this.f127131a) {
            this.f127135e.c(ajVar.f127114c.getId(), 0.3137255f);
        }
    }

    public final void d() {
        for (aj ajVar : this.f127131a) {
            this.f127135e.c(ajVar.f127114c.getId(), 1.0f);
        }
    }

    public final void d(aj ajVar) {
        ajVar.f127115d = true;
        this.f127132b = ajVar;
    }

    public final boolean e(aj ajVar) {
        if (!ajVar.f127114c.isPin() || this.f127135e.q(ajVar.f127114c.getId())) {
            return false;
        }
        return true;
    }

    public final void a(aj ajVar) {
        if (ajVar != null) {
            ajVar.f127114c.getId();
            this.f127135e.b(ajVar.f127114c.getId(), 0, this.f127133c);
        }
    }

    public final void b(aj ajVar) {
        if (ajVar != null && this.f127131a.contains(ajVar)) {
            ajVar.f127114c.getId();
            this.f127135e.b(ajVar.f127114c.getId(), ajVar.f127114c.startTime, ajVar.f127114c.endTime);
        }
    }

    public final void c(aj ajVar) {
        if (ajVar != null) {
            ajVar.f127114c.getId();
            if (ajVar.f127114c.layerWeight != ak.f127126b) {
                ajVar.f127114c.updateLayerWeight(ak.a());
                ajVar.f127114c.getId();
                this.f127135e.f(ajVar.f127114c.getId(), ajVar.f127114c.layerWeight);
                com.ss.android.ugc.aweme.tools.e.c<aj> cVar = this.f127140j;
                if (cVar != null) {
                    cVar.a(ajVar);
                }
            }
        }
    }

    public static int a(aj ajVar, aj ajVar2) {
        return ajVar.f127114c.layerWeight - ajVar2.f127114c.layerWeight;
    }

    public final void b(aj ajVar, float f2) {
        if (ajVar.f127114c.isMagnifier()) {
            a(ajVar, f2, ajVar.f127112a, ajVar.f127113b);
        } else {
            a(ajVar, f2, ajVar.f127112a, 2.14748365E9f);
        }
    }

    public final void a(InfoStickerModel infoStickerModel, boolean z) {
        if (!(infoStickerModel == null || h.a(infoStickerModel.stickers))) {
            ArrayList<StickerItemModel> arrayList = null;
            for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
                int i2 = stickerItemModel.layerWeight;
                if (i2 != ak.f127126b) {
                    ak.f127125a = Math.max(i2, ak.f127125a);
                }
                if (com.ss.android.ugc.aweme.editSticker.model.c.a(stickerItemModel)) {
                    if (z) {
                        String str = infoStickerModel.infoStickerDraftDir;
                        if (stickerItemModel.isImageSticker()) {
                            stickerItemModel.setId(this.f127135e.a(stickerItemModel.path, stickerItemModel.x, stickerItemModel.y, stickerItemModel.w, stickerItemModel.f88243h));
                            if (stickerItemModel.getId() < 0) {
                                com.ss.android.ugc.aweme.df.e.a("restore subtitle failed: " + stickerItemModel.getId());
                            } else {
                                if (!stickerItemModel.isPin() || !i.a(stickerItemModel.pinAlgorithmFile)) {
                                    this.f127135e.a(stickerItemModel.getId(), -stickerItemModel.rotateAngle);
                                    this.f127135e.b(stickerItemModel.getId(), stickerItemModel.scale);
                                    this.f127135e.a(stickerItemModel.getId(), stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
                                } else {
                                    b.i.b(new e(this, stickerItemModel), b.i.f4824a);
                                }
                                this.f127135e.b(stickerItemModel.getId(), stickerItemModel.startTime, stickerItemModel.endTime);
                                this.f127135e.f(stickerItemModel.getId(), stickerItemModel.layerWeight);
                            }
                        } else {
                            String str2 = stickerItemModel.path;
                            if (!com.ss.android.ugc.aweme.video.e.b(str2)) {
                                str2 = str + File.separator + new File(str2).getName();
                            }
                            if (!com.ss.android.ugc.aweme.video.e.b(str2)) {
                                com.ss.android.ugc.aweme.port.in.g.a();
                                com.ss.android.ugc.aweme.df.e.a((Throwable) new Exception("infoSticker not exist in edit"));
                            } else {
                                stickerItemModel.setId(this.f127135e.a(str2, TextUtils.isEmpty(stickerItemModel.extra) ? null : new String[]{stickerItemModel.extra}));
                                bj.d("veAddInfoSticker id = " + stickerItemModel.getId());
                                if (stickerItemModel.getId() < 0) {
                                    com.ss.android.ugc.aweme.df.e.a("restore infoSticker failed: " + stickerItemModel.getId());
                                    q.a("info_sticker", new ar().a("event", "restore_failed: " + stickerItemModel.getId()).a("user_info", "path: " + str2 + " extra: " + stickerItemModel.extra).a());
                                } else {
                                    if (!stickerItemModel.isPin() || !i.a(stickerItemModel.pinAlgorithmFile)) {
                                        this.f127135e.a(stickerItemModel.getId(), -stickerItemModel.rotateAngle);
                                        this.f127135e.b(stickerItemModel.getId(), stickerItemModel.scale);
                                        this.f127135e.a(stickerItemModel.getId(), stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
                                    } else {
                                        b.i.b(new f(this, stickerItemModel), b.i.f4824a);
                                    }
                                    this.f127135e.b(stickerItemModel.getId(), stickerItemModel.startTime, stickerItemModel.endTime);
                                    this.f127135e.f(stickerItemModel.getId(), stickerItemModel.layerWeight);
                                }
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(stickerItemModel);
                    }
                    aj ajVar = new aj(this.f127134d.getContext(), stickerItemModel, this);
                    ajVar.a(this.f127134d.f127069c, this.f127134d.f127070d, this.f127134d.f127067a, this.f127134d.f127068b);
                    ajVar.b(stickerItemModel.scale);
                    ajVar.a((stickerItemModel.currentOffsetX - 0.5f) * ((float) this.f127134d.f127069c), (stickerItemModel.currentOffsetY - 0.5f) * ((float) this.f127134d.f127070d));
                    this.f127131a.add(ajVar);
                    if (stickerItemModel.isImageSticker()) {
                        ajVar.f127124m = true;
                    }
                }
            }
            if (h.b(arrayList)) {
                bj.b("restore info stickers error: " + arrayList.size());
                for (StickerItemModel stickerItemModel2 : arrayList) {
                    bj.b("remove error sticker " + stickerItemModel2.getId());
                    infoStickerModel.removeSticker(stickerItemModel2);
                }
            }
        }
    }

    public final void a(aj ajVar, float f2) {
        if (f2 != 0.0f) {
            ajVar.f127114c.rotateAngle += f2;
            this.f127135e.a(ajVar.f127114c.getId(), -ajVar.f127114c.rotateAngle);
            ajVar.a(f2);
        }
    }

    public final void a(aj ajVar, float f2, float f3) {
        ajVar.f127114c.currentOffsetX += f2 / ((float) this.f127134d.f127069c);
        ajVar.f127114c.currentOffsetY += f3 / ((float) this.f127134d.f127070d);
        this.f127135e.a(ajVar.f127114c.getId(), ajVar.f127114c.currentOffsetX, ajVar.f127114c.currentOffsetY);
        ajVar.a(f2, f3);
    }

    public c(e eVar, InfoStickerEditView infoStickerEditView, g gVar, View view) {
        this.f127134d = infoStickerEditView;
        this.f127135e = gVar;
        this.f127143m = eVar;
        this.f127133c = gVar.j();
        Activity a2 = a.a(view.getContext());
        if (a2 != null) {
            this.f127138h = (StickerHintTextViewModel) ae.a((e) a2, (ad.b) null).a(StickerHintTextViewModel.class);
        }
    }

    private void a(aj ajVar, float f2, float f3, float f4) {
        float f5 = ajVar.f127114c.scale * f2;
        if (f5 < f3 && f2 < 1.0f) {
            return;
        }
        if (f5 <= f4 || f2 <= 1.0f) {
            this.f127135e.b(ajVar.f127114c.getId(), f2);
            ajVar.f127114c.scale = f5;
            ajVar.b(f2);
        }
    }

    public final aj a(String str, String str2, String str3, int i2, int i3, float f2, float f3, float f4, float f5, boolean z) {
        long j2;
        bj.d("addInfoSticker1 id = ".concat(String.valueOf(i3)));
        if (i3 < 0) {
            boolean b2 = com.ss.android.ugc.aweme.video.e.b(str2);
            if (b2) {
                j2 = new File(str2).length();
            } else {
                j2 = 0;
            }
            com.ss.android.ugc.aweme.df.e.a("add infoSticker failed: ".concat(String.valueOf(i3)));
            q.a("info_sticker", new ar().a("event", "addFailed: ".concat(String.valueOf(i3))).a("user_info", "path: " + str2 + " file exist " + b2 + " size: " + j2 + " extra: " + str3).a());
            return null;
        }
        StickerItemModel a2 = a(i3, str, str2, str3, i2, ak.a(), f2, f3, f4, f5, z);
        if (a2 == null) {
            return null;
        }
        aj ajVar = new aj(this.f127134d.getContext(), a2, this);
        ajVar.a(this.f127134d.f127069c, this.f127134d.f127070d, this.f127134d.f127067a, this.f127134d.f127068b);
        this.f127135e.a(a2.getId(), a2.currentOffsetX, a2.currentOffsetY);
        this.f127135e.f(a2.getId(), ajVar.f127114c.layerWeight);
        a2.getId();
        this.f127132b = ajVar;
        ajVar.f127115d = false;
        this.f127131a.add(ajVar);
        a aVar = this.f127136f;
        if (aVar != null) {
            aVar.a(a2);
        }
        if (this.f127138h != null && this.f127139i) {
            this.f127134d.postDelayed(new d(this, ajVar), 500);
        }
        return ajVar;
    }

    private StickerItemModel a(int i2, String str, String str2, String str3, int i3, int i4, float f2, float f3, float f4, float f5, boolean z) {
        z e2;
        try {
            StickerItemModel stickerItemModel = new StickerItemModel(str, str2, str3, i4, this.f127135e.f(i2), 0, this.f127133c, i3);
            stickerItemModel.x = f2;
            stickerItemModel.y = f3;
            stickerItemModel.w = f4;
            stickerItemModel.f88243h = f5;
            stickerItemModel.cutout = z;
            stickerItemModel.uiStartTime = 0;
            stickerItemModel.uiEndTime = this.f127135e.G();
            float[] fArr = new float[2];
            this.f127135e.a(i2, fArr);
            stickerItemModel.currentOffsetX = fArr[0];
            stickerItemModel.currentOffsetY = fArr[1];
            this.f127135e.b(i2, fArr[0], fArr[1]);
            stickerItemModel.setId(i2);
            float[] h2 = this.f127135e.h(i2);
            stickerItemModel.initWidth = (h2[2] - h2[0]) * ((float) this.f127134d.f127069c);
            stickerItemModel.initHeight = (h2[1] - h2[3]) * ((float) this.f127134d.f127070d);
            try {
                EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) n.b().a(str);
                if (effectCategoryResponse != null) {
                    stickerItemModel.tabId = effectCategoryResponse.getId();
                }
                return stickerItemModel;
            } catch (z e3) {
                e2 = e3;
                com.ss.android.ugc.aweme.df.e.a((Throwable) new RuntimeException("add info sticker failed: ".concat(String.valueOf(str)), e2));
                q.a("info_sticker", new ar().a("event", "initSticker failed : ".concat(String.valueOf(str))).a("user_info", "initSticker size : " + this.f127131a.size()).a());
                return null;
            }
        } catch (z e4) {
            e2 = e4;
            com.ss.android.ugc.aweme.df.e.a((Throwable) new RuntimeException("add info sticker failed: ".concat(String.valueOf(str)), e2));
            q.a("info_sticker", new ar().a("event", "initSticker failed : ".concat(String.valueOf(str))).a("user_info", "initSticker size : " + this.f127131a.size()).a());
            return null;
        }
    }
}
