package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.editSticker.interact.a.b;
import com.ss.android.ugc.aweme.ftc.components.sticker.a;
import com.ss.android.ugc.aweme.ftc.components.sticker.hint.FTCStickerHintTextViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.ak;
import com.ss.android.ugc.aweme.tools.e.c;
import java.util.ArrayList;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public List<a> f98055a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public a f98056b;

    /* renamed from: c  reason: collision with root package name */
    public int f98057c;

    /* renamed from: d  reason: collision with root package name */
    public g f98058d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a f98059e;

    /* renamed from: f  reason: collision with root package name */
    public b f98060f;

    /* renamed from: g  reason: collision with root package name */
    public c<a> f98061g;

    /* renamed from: h  reason: collision with root package name */
    private final float f98062h = 0.5f;

    /* renamed from: i  reason: collision with root package name */
    private final float f98063i = 0.5f;

    /* renamed from: j  reason: collision with root package name */
    private FTCInfoStickerEditView f98064j;

    /* renamed from: k  reason: collision with root package name */
    private FTCStickerHintTextViewModel f98065k;

    static {
        Covode.recordClassIndex(62335);
    }

    public final void a() {
        FTCStickerHintTextViewModel fTCStickerHintTextViewModel = this.f98065k;
        if (fTCStickerHintTextViewModel != null) {
            fTCStickerHintTextViewModel.a().postValue(true);
        }
    }

    public final void c() {
        for (a aVar : this.f98055a) {
            this.f98058d.c(aVar.f97894b.getId(), 0.3137255f);
        }
    }

    public final void d() {
        for (a aVar : this.f98055a) {
            this.f98058d.c(aVar.f97894b.getId(), 1.0f);
        }
    }

    public final void b() {
        a aVar = this.f98056b;
        if (aVar != null) {
            aVar.f97894b.getId();
            if (!this.f98056b.f97904l) {
                this.f98058d.b(this.f98056b.f97894b.getId(), this.f98056b.f97894b.startTime, this.f98056b.f97894b.endTime);
                this.f98056b.f97895c = false;
            }
            this.f98056b = null;
        }
    }

    public final void d(a aVar) {
        aVar.f97895c = true;
        this.f98056b = aVar;
    }

    public final boolean e(a aVar) {
        if (!aVar.f97894b.isPin() || this.f98058d.q(aVar.f97894b.getId())) {
            return false;
        }
        return true;
    }

    public final void a(a aVar) {
        if (aVar != null && !aVar.f97904l) {
            aVar.f97894b.getId();
            this.f98058d.b(aVar.f97894b.getId(), 0, this.f98057c);
        }
    }

    public final void c(a aVar) {
        if (aVar != null) {
            aVar.f97894b.getId();
            if (aVar.f97894b.layerWeight != ak.f127126b) {
                aVar.f97894b.updateLayerWeight(ak.a());
                aVar.f97894b.getId();
                this.f98058d.f(aVar.f97894b.getId(), aVar.f97894b.layerWeight);
                c<a> cVar = this.f98061g;
                if (cVar != null) {
                    cVar.a(aVar);
                }
            }
        }
    }

    public final void b(a aVar) {
        if (aVar != null && this.f98055a.contains(aVar) && !aVar.f97904l) {
            aVar.f97894b.getId();
            this.f98058d.b(aVar.f97894b.getId(), aVar.f97894b.startTime, aVar.f97894b.endTime);
        }
    }

    public static int a(a aVar, a aVar2) {
        return aVar.f97894b.layerWeight - aVar2.f97894b.layerWeight;
    }

    public final void a(a aVar, float f2) {
        if (!aVar.f97904l && f2 != 0.0f) {
            aVar.f97894b.rotateAngle += f2;
            this.f98058d.a(aVar.f97894b.getId(), -aVar.f97894b.rotateAngle);
            aVar.a(f2);
        }
    }

    public final boolean a(a aVar, int i2) {
        if (aVar.f97904l) {
            if (i2 < aVar.f97894b.startTime || i2 > aVar.f97894b.endTime) {
                return false;
            }
            return true;
        } else if ((i2 < aVar.f97894b.startTime || i2 > aVar.f97894b.endTime) && !aVar.equals(this.f98056b)) {
            return false;
        } else {
            return true;
        }
    }

    public final void b(a aVar, float f2) {
        float f3 = aVar.f97894b.scale * f2;
        if (f3 >= aVar.f97893a || f2 >= 1.0f) {
            this.f98058d.b(aVar.f97894b.getId(), f2);
            aVar.f97894b.scale = f3;
            aVar.b(f2);
        }
    }

    public final void a(a aVar, int i2, int i3) {
        if (aVar != null) {
            b(aVar, i2, i3);
        }
    }

    h(FTCInfoStickerEditView fTCInfoStickerEditView, g gVar, View view) {
        this.f98064j = fTCInfoStickerEditView;
        this.f98058d = gVar;
        this.f98057c = gVar.j();
        Activity a2 = com.ss.android.ugc.aweme.scene.a.a(view.getContext());
        if (a2 != null) {
            this.f98065k = (FTCStickerHintTextViewModel) ae.a((e) a2, (ad.b) null).a(FTCStickerHintTextViewModel.class);
        }
    }

    private void b(a aVar, int i2, int i3) {
        aVar.f97894b.startTime = i2;
        aVar.f97894b.endTime = i3;
        int r = this.f98058d.r(i2);
        int r2 = this.f98058d.r(i3);
        aVar.f97894b.uiStartTime = r;
        aVar.f97894b.uiEndTime = r2;
        this.f98058d.b(aVar.f97894b.getId(), i2, i3);
    }

    public final void a(a aVar, float f2, float f3) {
        if (aVar.f97904l) {
            for (a aVar2 : this.f98055a) {
                if (aVar2.f97904l) {
                    aVar2.f97894b.currentOffsetY += f3 / ((float) this.f98064j.f97997d);
                    this.f98058d.a(aVar2.f97894b.getId(), aVar2.f97894b.currentOffsetX, aVar2.f97894b.currentOffsetY);
                    aVar2.a(0.0f, f3);
                }
            }
            return;
        }
        aVar.f97894b.currentOffsetX += f2 / ((float) this.f98064j.f97996c);
        aVar.f97894b.currentOffsetY += f3 / ((float) this.f98064j.f97997d);
        this.f98058d.a(aVar.f97894b.getId(), aVar.f97894b.currentOffsetX, aVar.f97894b.currentOffsetY);
        aVar.a(f2, f3);
    }
}
