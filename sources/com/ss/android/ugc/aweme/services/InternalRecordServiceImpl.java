package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel;
import com.bytedance.creativex.recorder.sticker.panel.g;
import com.bytedance.keva.Keva;
import com.bytedance.o.f;
import com.bytedance.o.n;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.cs.e.m;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.photo.PhotoModule;
import com.ss.android.ugc.aweme.property.bj;
import com.ss.android.ugc.aweme.record.b;
import com.ss.android.ugc.aweme.record.d;
import com.ss.android.ugc.aweme.record.e;
import com.ss.android.ugc.aweme.record.f;
import com.ss.android.ugc.aweme.servicimpl.aa;
import com.ss.android.ugc.aweme.servicimpl.z;
import com.ss.android.ugc.aweme.setting.br;
import com.ss.android.ugc.aweme.setting.bu;
import com.ss.android.ugc.aweme.setting.bv;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.db;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.types.ar.text.r;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.aweme.story.edit.business.shared.f.b;
import com.ss.android.ugc.aweme.story.record.c;
import com.ss.android.vesdk.k;
import com.zhiliaoapp.musically.R;
import h.f.a.a;
import h.f.b.l;
import h.h;
import h.i;
import h.m.p;
import h.z;
import java.io.File;
import java.util.Collection;
import java.util.Set;

public final class InternalRecordServiceImpl implements d {
    private final h mMaxDurationResolver$delegate = i.a((a) InternalRecordServiceImpl$mMaxDurationResolver$2.INSTANCE);

    static {
        Covode.recordClassIndex(79490);
    }

    private final InternalMaxDurationResolverImpl getMMaxDurationResolver() {
        return (InternalMaxDurationResolverImpl) this.mMaxDurationResolver$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final boolean shouldDropCurrentMusicFor3min(Object obj, ShortVideoContext shortVideoContext) {
        l.d(obj, "");
        l.d(shortVideoContext, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final void cleanStoryCache() {
        m.f79049c.l();
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final j createLighteningFakeScene() {
        return new c();
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final boolean enable3MinRecord() {
        return db.b();
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final com.ss.android.ugc.aweme.record.c getABService() {
        return new InternalRecordServiceImpl$getABService$1();
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final b getAlbumService() {
        return new AlbumServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final e getMaxDurationResolver() {
        return getMMaxDurationResolver();
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final void requestDuetSettingPermission() {
        b.i.b(bu.f122119a, b.i.f4824a).a(bv.f122120a);
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final boolean getRequestDuetSettingPermission() {
        if (Keva.getRepo("DUET_SETTING_REPO").getInt("DUET_SETTING_KEY", br.f122116f) == br.f122115e) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final boolean isRecordingOrEditing() {
        Activity c2 = com.ss.android.ugc.aweme.df.c.c();
        if (!(c2 instanceof VideoRecordNewActivity) && !(c2 instanceof VEVideoPublishEditActivity)) {
            return false;
        }
        return true;
    }

    public static ad com_ss_android_ugc_aweme_services_InternalRecordServiceImpl_androidx_lifecycle_VScopeLancet_of(androidx.fragment.app.e eVar) {
        return ae.a(eVar, (ad.b) null);
    }

    public final boolean isMusicUnavailableLongVideo(com.ss.android.ugc.aweme.shortvideo.c cVar) {
        return com.ss.android.ugc.aweme.shortvideo.edit.videolength.a.a(cVar);
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final com.bytedance.creativex.recorder.a.i generateBeautyComponent(f fVar) {
        l.d(fVar, "");
        return com.ss.android.ugc.aweme.shortvideo.beauty.a.a(fVar, false);
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final void initVESDK(k kVar) {
        l.d(kVar, "");
        com.ss.android.ugc.aweme.port.in.c.a(kVar);
    }

    private final int getDefaultShootMode(ShortVideoContext shortVideoContext) {
        int i2 = shortVideoContext.f124757b.f124706a;
        if (i2 == 1) {
            return shortVideoContext.Z;
        }
        if (i2 != 2) {
            return -1;
        }
        return com.ss.android.ugc.aweme.shortvideo.f.a.b().shootMode;
    }

    private final int getDefaultTabRes(ShortVideoContext shortVideoContext) {
        if (!shortVideoContext.f124757b.t) {
            return R.string.f_2;
        }
        if (db.b()) {
            return R.string.f_3;
        }
        return R.string.f_4;
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final void addStoryTempFile(String str) {
        l.d(str, "");
        l.d(str, "");
        String str2 = File.separator;
        l.b(str2, "");
        if (p.c(str, str2, false)) {
            Set<String> set = m.f79048b;
            String absolutePath = new File(str).getAbsolutePath();
            l.b(absolutePath, "");
            set.add(absolutePath);
            return;
        }
        m.f79048b.add(str);
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final String getDefaultShootTabTag(ShortVideoContext shortVideoContext) {
        int i2;
        l.d(shortVideoContext, "");
        if (!com.bytedance.ies.abmock.b.a().a(true, "landing_long_duration_qa_reply", false) || !shortVideoContext.o() || shortVideoContext.p()) {
            return getDefaultTag(getDefaultShootMode(shortVideoContext), shortVideoContext);
        }
        if (db.b()) {
            i2 = R.string.f_3;
        } else {
            i2 = R.string.f_4;
        }
        String string = com.ss.android.ugc.aweme.port.in.i.f115645a.getString(i2);
        l.b(string, "");
        return string;
    }

    public final l.b assembleStickerDependencyRequired(f fVar) {
        return new l.b(((com.ss.android.ugc.gamora.recorder.sticker.c.j) fVar.a(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, (String) null)).t(), ((com.ss.android.ugc.gamora.recorder.sticker.c.j) fVar.a(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, (String) null)).u(), (com.ss.android.ugc.aweme.sticker.m.h) fVar.a(com.ss.android.ugc.aweme.sticker.m.h.class, (String) null), new com.ss.android.ugc.aweme.sticker.m.c(), new com.ss.android.ugc.aweme.sticker.view.internal.main.m((com.ss.android.ugc.tools.b.a.d) fVar.a(com.ss.android.ugc.tools.b.a.d.class, (String) null)), ((com.ss.android.ugc.aweme.sticker.panel.j) fVar.a(com.ss.android.ugc.aweme.sticker.panel.j.class, (String) null)).f135225m);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017  */
    @Override // com.ss.android.ugc.aweme.record.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Activity findActivityInstance(java.lang.Class<? extends androidx.fragment.app.e> r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r5, r0)
            com.ss.android.ugc.aweme.port.in.k r1 = com.ss.android.ugc.aweme.port.in.k.a.f115657a
            boolean r0 = r1.f115653f
            if (r0 == 0) goto L_0x0042
            java.util.Set<android.app.Activity> r0 = r1.f115649b
            java.util.Iterator r3 = r0.iterator()
        L_0x0011:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r2 = r3.next()
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Class r0 = r2.getClass()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = r5.getName()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0041
            android.content.ComponentName r0 = r2.getComponentName()
            java.lang.String r1 = r0.getClassName()
            java.lang.String r0 = r5.getName()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x0011
        L_0x0041:
            return r2
        L_0x0042:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.InternalRecordServiceImpl.findActivityInstance(java.lang.Class):android.app.Activity");
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final com.bytedance.creativex.recorder.gesture.api.d getARGestureDelegateListener(com.ss.android.ugc.asve.recorder.effect.a aVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(marginLayoutParams, "");
        return new com.ss.android.ugc.aweme.shortvideo.d.a.a(aVar, marginLayoutParams);
    }

    private final String getDefaultTag(int i2, ShortVideoContext shortVideoContext) {
        int i3;
        if (i2 == 10) {
            i3 = R.string.f_2;
        } else if (i2 == 11) {
            i3 = R.string.f_4;
        } else if (i2 != 14) {
            i3 = getDefaultTabRes(shortVideoContext);
        } else {
            i3 = R.string.f_3;
        }
        String string = com.ss.android.ugc.aweme.port.in.i.f115645a.getString(i3);
        h.f.b.l.b(string, "");
        return string;
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final com.ss.android.ugc.aweme.record.f getPhotoModule(androidx.fragment.app.e eVar, com.ss.android.ugc.asve.recorder.c.a aVar, f.a aVar2) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(aVar2, "");
        return new PhotoModule(eVar, aVar, aVar2);
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final void registerNeededObjects(androidx.fragment.app.e eVar, n nVar, ShortVideoContext shortVideoContext) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(nVar, "");
        h.f.b.l.d(shortVideoContext, "");
        ac a2 = com_ss_android_ugc_aweme_services_InternalRecordServiceImpl_androidx_lifecycle_VScopeLancet_of(eVar).a(ShortVideoContextViewModel.class);
        h.f.b.l.b(a2, "");
        ((ShortVideoContextViewModel) a2).f124769a = shortVideoContext;
        h.f.b.l.b(nVar.a(com.ss.android.ugc.aweme.sticker.p.d.class, (String) null, (com.bytedance.o.p) new InternalRecordServiceImpl$$special$$inlined$singleton$1()), "");
        h.f.b.l.b(nVar.a(com.ss.android.ugc.aweme.sticker.m.h.class, (String) null, (com.bytedance.o.p) new InternalRecordServiceImpl$registerNeededObjects$$inlined$apply$lambda$1(this, shortVideoContext)), "");
        h.f.b.l.b(nVar.a(com.ss.android.ugc.aweme.sticker.favorite.b.class, (String) null, (com.bytedance.o.p) new InternalRecordServiceImpl$$special$$inlined$singleton$3()), "");
        h.f.b.l.b(nVar.a(com.ss.android.ugc.aweme.sticker.panel.guide.j.class, (String) null, (com.bytedance.o.p) new InternalRecordServiceImpl$$special$$inlined$singleton$4()), "");
        h.f.b.l.b(nVar.a(com.ss.android.ugc.aweme.sticker.panel.j.class, (String) null, (com.bytedance.o.p) new InternalRecordServiceImpl$$special$$inlined$singleton$5()), "");
        h.f.b.l.b(nVar.a(com.ss.android.ugc.aweme.sticker.types.lock.a.class, (String) null, (com.bytedance.o.p) new InternalRecordServiceImpl$$special$$inlined$singleton$6()), "");
        if (bj.a()) {
            h.f.b.l.b(nVar.a(com.ss.android.ugc.aweme.sticker.view.internal.search.a.class, (String) null, (com.bytedance.o.p) new InternalRecordServiceImpl$$special$$inlined$singleton$7()), "");
        }
        h.f.b.l.b(nVar.a(com.ss.android.ugc.aweme.sticker.view.a.b.class, (String) null, (com.bytedance.o.p) new InternalRecordServiceImpl$registerNeededObjects$$inlined$apply$lambda$2(this, shortVideoContext)), "");
        h.f.b.l.b(nVar.a(com.ss.android.ugc.gamora.recorder.sticker.a.b.class, (String) null, (com.bytedance.o.p) new InternalRecordServiceImpl$$special$$inlined$singleton$9()), "");
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final void attachStickerComponent(com.bytedance.als.dsl.b bVar, com.bytedance.scene.group.b bVar2, int i2, r.b bVar3) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(bVar2, "");
        h.f.b.l.d(bVar3, "");
        com.bytedance.als.dsl.d dVar = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer = bVar.f6461a;
        alsLogicContainer.f6437d.a(com.ss.android.ugc.gamora.recorder.sticker.c.h.class, (String) null, (com.bytedance.o.p) new InternalRecordServiceImpl$$special$$inlined$component$1(dVar));
        alsLogicContainer.a(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, com.ss.android.ugc.gamora.recorder.sticker.c.h.class);
        com.bytedance.als.dsl.d dVar2 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer2 = bVar.f6461a;
        alsLogicContainer2.f6437d.a(com.ss.android.ugc.gamora.recorder.sticker.a.a.class, (String) null, (com.bytedance.o.p) new InternalRecordServiceImpl$$special$$inlined$component$2(dVar2));
        alsLogicContainer2.a(com.ss.android.ugc.aweme.sticker.e.class, com.ss.android.ugc.gamora.recorder.sticker.a.a.class);
        com.bytedance.als.dsl.d dVar3 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer3 = bVar.f6461a;
        alsLogicContainer3.f6437d.a(g.class, (String) null, (com.bytedance.o.p) new InternalRecordServiceImpl$attachStickerComponent$$inlined$apply$lambda$1(dVar3, bVar2, i2, bVar3));
        alsLogicContainer3.a(RecordStickerPanelViewModel.class, g.class);
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final void startStoryPublish(Activity activity, com.ss.android.ugc.asve.editor.g gVar, com.ss.android.ugc.aweme.shortvideo.preview.a aVar, com.ss.android.ugc.aweme.publish.a aVar2, Intent intent) {
        h.f.b.l.d(activity, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(aVar2, "");
        com.ss.android.ugc.aweme.story.edit.business.shared.f.b bVar = new com.ss.android.ugc.aweme.story.edit.business.shared.f.b(activity, gVar, aVar, aVar2);
        b.i.b((Collection<? extends b.i<?>>) h.a.n.a(bVar.a())).a(new b.i(bVar, intent), b.i.f4826c, null);
    }

    @Override // com.ss.android.ugc.aweme.record.d
    public final void photoCanvasGoNext(androidx.fragment.app.e eVar, String str, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, boolean z, MediaModel mediaModel, h.f.a.b<? super Boolean, z> bVar) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(shortVideoContext, "");
        h.f.b.l.d(bVar, "");
        aa.a(new z.a(eVar, str, null, shortVideoContext, faceStickerBean, z, null, mediaModel, new InternalRecordServiceImpl$photoCanvasGoNext$1(eVar, bVar)));
    }
}
