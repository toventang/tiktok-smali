package com.bytedance.creativex.recorder.sticker.panel;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.z;
import com.bytedance.creativex.recorder.gesture.api.d;
import com.bytedance.creativex.recorder.sticker.panel.e;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.Mission;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.f;
import com.ss.android.ugc.aweme.sticker.d;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.h.d;
import h.k.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class g extends e {

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ i[] f28475c = {new y(g.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(g.class, "tikTokCameraApiComponent", "getTikTokCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new y(g.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};

    /* renamed from: d  reason: collision with root package name */
    final e f28476d = ((e) getDiContainer().a(e.class, (String) null));

    /* renamed from: e  reason: collision with root package name */
    private final d f28477e = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);

    /* renamed from: f  reason: collision with root package name */
    private final d f28478f = com.bytedance.o.b.a.b(getDiContainer(), z.class);

    /* renamed from: k  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sticker.e f28479k = ((com.ss.android.ugc.aweme.sticker.e) getDiContainer().b(com.ss.android.ugc.aweme.sticker.e.class, null));

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.creativex.recorder.gesture.api.b f28480l = ((com.bytedance.creativex.recorder.gesture.api.b) getDiContainer().b(com.bytedance.creativex.recorder.gesture.api.b.class, null));

    /* renamed from: m  reason: collision with root package name */
    private final d f28481m = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);

    static {
        Covode.recordClassIndex(16735);
    }

    /* access modifiers changed from: package-private */
    public final com.bytedance.creativex.recorder.b.a.d f() {
        return (com.bytedance.creativex.recorder.b.a.d) this.f28477e.a(this, f28475c[0]);
    }

    /* access modifiers changed from: package-private */
    public final z g() {
        return (z) this.f28478f.a(this, f28475c[1]);
    }

    /* access modifiers changed from: package-private */
    public final ShortVideoContext h() {
        return (ShortVideoContext) this.f28481m.a(this, f28475c[2]);
    }

    /* access modifiers changed from: package-private */
    public final ASCameraView i() {
        return f().D();
    }

    @Override // com.bytedance.ui_component.b, com.bytedance.creativex.recorder.sticker.panel.e, com.bytedance.als.j
    public final void onCreate() {
        com.bytedance.als.g<com.ss.android.ugc.aweme.sticker.d> a2;
        com.bytedance.als.g<com.ss.android.ugc.aweme.sticker.presenter.handler.c.c> f2;
        super.onCreate();
        com.bytedance.creativex.recorder.gesture.api.b bVar = this.f28480l;
        if (bVar != null) {
            ((e) this).f28462a.d().a(this, new a(bVar, this));
            com.bytedance.creativex.recorder.sticker.a.a aVar = ((e) this).f28462a;
            if (!(aVar == null || (f2 = aVar.f()) == null)) {
                f2.a(this, new b(bVar, this));
            }
            com.ss.android.ugc.aweme.sticker.e eVar = this.f28479k;
            if (eVar != null && (a2 = eVar.a()) != null) {
                a2.a(this, new c(bVar));
            }
        }
    }

    static final class c<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.creativex.recorder.gesture.api.b f28486a;

        static {
            Covode.recordClassIndex(16738);
        }

        c(com.bytedance.creativex.recorder.gesture.api.b bVar) {
            this.f28486a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj instanceof d.b) {
                this.f28486a.a(new d.a());
            }
        }
    }

    static final class a<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.creativex.recorder.gesture.api.b f28482a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f28483b;

        static {
            Covode.recordClassIndex(16736);
        }

        a(com.bytedance.creativex.recorder.gesture.api.b bVar, g gVar) {
            this.f28482a = bVar;
            this.f28483b = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            String stickerId;
            String str;
            String str2;
            Boolean bool = (Boolean) obj;
            this.f28482a.a(!bool.booleanValue());
            l.b(bool, "");
            if (bool.booleanValue() && !com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
                g gVar = this.f28483b;
                Mission a2 = com.ss.android.ugc.aweme.port.in.c.f115633l.a(gVar.h().af.f124735c);
                if (a2 != null && (stickerId = a2.getStickerId()) != null && stickerId.length() != 0) {
                    Integer num = null;
                    if (!a2.isStickerToasted()) {
                        Effect a3 = com.ss.android.ugc.aweme.sticker.f.e.a(((e) gVar).f28462a);
                        if (a3 != null) {
                            str2 = a3.getEffectId();
                        } else {
                            str2 = null;
                        }
                        if (!TextUtils.equals(str2, a2.getStickerId())) {
                            a2.setStickerToasted(true);
                            gVar.h().af.f124735c = com.ss.android.ugc.aweme.port.in.c.f115633l.a(gVar.h().af.f124735c, a2);
                        }
                    }
                    if (!a2.isStickerToasted()) {
                        com.ss.android.ugc.tools.view.widget.d.b(gVar.f28476d, R.string.d52).b();
                        com.ss.android.ugc.tools.f.b a4 = new com.ss.android.ugc.tools.f.b().a("reason", 0).a("mission_id", a2.getMissionId()).a("page_source", a2.getEnterFrom());
                        com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.c.u.e();
                        if (e2 != null) {
                            num = Integer.valueOf(e2.m());
                        }
                        com.ss.android.ugc.tools.f.b a5 = a4.a("creator_followers", num);
                        if (com.ss.android.ugc.aweme.port.in.l.f115658a.z().j()) {
                            str = "0";
                        } else {
                            str = "1";
                        }
                        r.a("mission_requirement_toast", a5.a("creator_type", str).f149193a);
                    }
                }
            }
        }
    }

    static final class b<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.creativex.recorder.gesture.api.b f28484a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f28485b;

        static {
            Covode.recordClassIndex(16737);
        }

        b(com.bytedance.creativex.recorder.gesture.api.b bVar, g gVar) {
            this.f28484a = bVar;
            this.f28485b = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Effect effect;
            String str;
            String str2;
            com.bytedance.creativex.recorder.gesture.api.d dVar;
            com.ss.android.ugc.aweme.shortvideo.record.a.a ap;
            com.ss.android.ugc.aweme.sticker.presenter.handler.c.c cVar = (com.ss.android.ugc.aweme.sticker.presenter.handler.c.c) obj;
            g gVar = this.f28485b;
            l.b(cVar, "");
            com.bytedance.creativex.recorder.gesture.api.b bVar = this.f28484a;
            com.ss.android.ugc.aweme.sticker.d.b.a aVar = com.ss.android.ugc.aweme.sticker.d.b.a.UI_CLICK;
            Integer num = null;
            if (cVar instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.c.a) {
                com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar2 = (com.ss.android.ugc.aweme.sticker.presenter.handler.c.a) cVar;
                effect = aVar2.f135378a;
                if (com.ss.android.ugc.aweme.sticker.p.g.k(effect)) {
                    gVar.f().y();
                    com.ss.android.ugc.asve.recorder.effect.a effectController = gVar.i().getEffectController();
                    ViewGroup.LayoutParams layoutParams = gVar.f().G().getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    bVar.a(new com.ss.android.ugc.aweme.shortvideo.d.a.a(effectController, new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams)));
                } else {
                    List<String> tags = effect.getTags();
                    if (tags == null) {
                        tags = new ArrayList<>();
                    }
                    if (tags.contains("transfer_touch")) {
                        bVar.a(new f(gVar.f28476d, gVar.i().getEffectController()));
                    } else if (!effect.getTypes().contains("FaceReplace3D")) {
                        gVar.a(effect, bVar);
                    } else if (effect.getTags() != null) {
                        z g2 = gVar.g();
                        if (g2 == null || (ap = g2.ap()) == null || (dVar = ap.f130013g) == null) {
                            dVar = new d.a();
                        }
                        bVar.a(dVar);
                    }
                }
                aVar = aVar2.f135380c;
            } else {
                if (cVar instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.c.d) {
                    gVar.a(null, bVar);
                    aVar = ((com.ss.android.ugc.aweme.sticker.presenter.handler.c.d) cVar).f135386c;
                }
                effect = null;
            }
            if (aVar != com.ss.android.ugc.aweme.sticker.d.b.a.MANUAL_SET) {
                if (effect != null) {
                    str = effect.getEffectId();
                } else {
                    str = null;
                }
                PublishExtensionModel fromString = PublishExtensionModel.fromString(gVar.h().af.f124735c);
                Mission mission = fromString.mission;
                if (mission != null && !mission.isStickerToasted() && !TextUtils.equals(mission.getStickerId(), str)) {
                    mission.setStickerToasted(true);
                    com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("value", 0).a("mission_id", mission.getMissionId()).a("page_source", mission.getEnterFrom());
                    com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.c.u.e();
                    if (e2 != null) {
                        num = Integer.valueOf(e2.m());
                    }
                    com.ss.android.ugc.tools.f.b a3 = a2.a("creator_followers", num);
                    if (com.ss.android.ugc.aweme.port.in.l.f115658a.z().j()) {
                        str2 = "0";
                    } else {
                        str2 = "1";
                    }
                    r.a("mission_requirement_modified", a3.a("creator_type", str2).f149193a);
                    fromString.mission = mission;
                    gVar.h().af.f124735c = PublishExtensionModel.toString(fromString);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Effect effect, com.bytedance.creativex.recorder.gesture.api.b bVar) {
        com.bytedance.creativex.recorder.gesture.api.d aVar;
        com.ss.android.ugc.aweme.shortvideo.record.a.a ap;
        z g2 = g();
        if (g2 != null && (ap = g2.ap()) != null && !com.ss.android.ugc.aweme.sticker.p.g.m(effect)) {
            aVar = ap.f130013g;
        } else if (effect == null || !effect.getTypes().contains("TouchGes")) {
            aVar = new d.a();
        } else {
            f().y();
            com.ss.android.ugc.asve.recorder.effect.a effectController = i().getEffectController();
            ViewGroup.LayoutParams layoutParams = f().G().getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            aVar = new com.ss.android.ugc.aweme.shortvideo.d.a.a(effectController, new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams));
        }
        l.b(aVar, "");
        bVar.a(aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(com.bytedance.o.f fVar, com.bytedance.scene.group.b bVar, int i2, h.f.a.b<? super e.a, h.z> bVar2) {
        super(fVar, bVar, i2, bVar2);
        l.d(fVar, "");
        l.d(bVar, "");
    }
}
