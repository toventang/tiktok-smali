package com.ss.android.ugc.gamora.recorder.b;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.t;
import com.bytedance.creativex.recorder.b.a.x;
import com.bytedance.creativex.recorder.b.a.z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.ao;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.v;
import com.bytedance.tux.dialog.a;
import com.ss.android.ugc.aweme.property.bk;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ec;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.util.bh;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.aweme.sticker.types.f.a;
import com.ss.android.ugc.aweme.utils.ig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import h.f.b.y;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class i extends com.bytedance.als.j<b> implements com.bytedance.jedi.arch.b, com.bytedance.o.a, b {
    static final /* synthetic */ h.k.i[] $$delegatedProperties = {new y(i.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new y(i.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(i.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new y(i.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0), new y(i.class, "chooseMusicApiComponent", "getChooseMusicApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/ChooseMusicApiComponent;", 0), new y(i.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new y(i.class, "stickerPanelApiComponent", "getStickerPanelApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerPanelApiComponent;", 0)};
    private final com.bytedance.als.k<c> _bottomTabIndexChangeEvent;
    private final com.bytedance.als.k<String> _sharedARTabIndexChangeEvent;
    public final b apiComponent = this;
    private final com.bytedance.als.g<c> bottomTabIndexChangeEvent;
    public final e bottomTabManager;
    public final j bottomTabScene;
    public final List<a> bottoms;
    private final h.h.d cameraApiComponent$delegate;
    private final h.h.d chooseMusicApiComponent$delegate;
    private final com.bytedance.als.l<Integer> complexTabVisibility;
    private final h.h.d controlProgressApiComponent$delegate;
    private final com.bytedance.o.f diContainer;
    private final h.h enableSwitchDurationAfterRecording$delegate;
    private boolean hasSelectDefaultTab;
    public boolean isCurrentForbidAudioTab;
    public final com.bytedance.scene.group.b parentScene;
    private final com.ss.android.ugc.aweme.shortvideo.h.a planCUiApiComponent;
    private final h.h.d recordControlApi$delegate;
    private com.ss.android.ugc.gamora.a.a recordEnv;
    private final com.bytedance.als.k<Integer> setBottomTabEndMargin;
    private final com.bytedance.als.k<Integer> setBottomTabStartMargin;
    private final com.bytedance.als.g<String> sharedARTabIndexChangeEvent;
    private final h.h.d shortVideoContext$delegate;
    private final com.bytedance.als.k<Boolean> showBottomTabEvent;
    private final com.bytedance.als.d<Integer> showLiveTagState;
    private final h.h.d stickerApiComponent$delegate;
    private final h.h.d stickerPanelApiComponent$delegate;
    private final h.h switchDurationConfigFactory$delegate;

    static {
        Covode.recordClassIndex(97152);
    }

    private final com.ss.android.ugc.gamora.recorder.choosemusic.a getChooseMusicApiComponent() {
        return (com.ss.android.ugc.gamora.recorder.choosemusic.a) this.chooseMusicApiComponent$delegate.a(this, $$delegatedProperties[4]);
    }

    private final com.bytedance.creativex.recorder.b.a.m getRecordControlApi() {
        return (com.bytedance.creativex.recorder.b.a.m) this.recordControlApi$delegate.a(this, $$delegatedProperties[1]);
    }

    private final com.bytedance.creativex.recorder.sticker.a.c getStickerPanelApiComponent() {
        return (com.bytedance.creativex.recorder.sticker.a.c) this.stickerPanelApiComponent$delegate.a(this, $$delegatedProperties[6]);
    }

    private final ec getSwitchDurationConfigFactory() {
        return (ec) this.switchDurationConfigFactory$delegate.getValue();
    }

    public final z getCameraApiComponent() {
        return (z) this.cameraApiComponent$delegate.a(this, $$delegatedProperties[0]);
    }

    public final com.ss.android.ugc.gamora.recorder.k.a getControlProgressApiComponent() {
        return (com.ss.android.ugc.gamora.recorder.k.a) this.controlProgressApiComponent$delegate.a(this, $$delegatedProperties[3]);
    }

    public final boolean getEnableSwitchDurationAfterRecording() {
        return ((Boolean) this.enableSwitchDurationAfterRecording$delegate.getValue()).booleanValue();
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.shortVideoContext$delegate.a(this, $$delegatedProperties[2]);
    }

    public final com.ss.android.ugc.gamora.recorder.sticker.c.j getStickerApiComponent() {
        return (com.ss.android.ugc.gamora.recorder.sticker.c.j) this.stickerApiComponent$delegate.a(this, $$delegatedProperties[5]);
    }

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void showComplexTab(int i2, c cVar) {
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public /* bridge */ /* synthetic */ b getApiComponent() {
        return this.apiComponent;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public com.bytedance.als.g<c> getBottomTabIndexChangeEvent() {
        return this.bottomTabIndexChangeEvent;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public com.bytedance.als.l<Integer> getComplexTabVisibility() {
        return this.complexTabVisibility;
    }

    @Override // com.bytedance.o.a
    public com.bytedance.o.f getDiContainer() {
        return this.diContainer;
    }

    @Override // com.bytedance.jedi.arch.ae
    public com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    public com.bytedance.als.g<String> getSharedARTabIndexChangeEvent() {
        return this.sharedARTabIndexChangeEvent;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public String getCurrentBottomTag() {
        return this.bottomTabManager.d();
    }

    @Override // com.bytedance.jedi.arch.v
    public androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void hidePopupForLiveTab() {
        this.bottomTabManager.b();
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void tryShowPopupForLiveTab() {
        this.bottomTabManager.a();
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f147448a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f147449b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f147450c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f147451d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f147452e;

        static {
            Covode.recordClassIndex(97153);
        }

        a(com.bytedance.scene.group.b bVar, f fVar, i iVar, a aVar, int i2) {
            this.f147448a = bVar;
            this.f147449b = fVar;
            this.f147450c = iVar;
            this.f147451d = aVar;
            this.f147452e = i2;
        }

        public final void run() {
            i.changeToDefaultTab$default(this.f147450c, this.f147448a, this.f147449b, false, 2, null);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f147453a = new b();

        static {
            Covode.recordClassIndex(97154);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(bk.a());
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public int bottomTabSize() {
        return this.bottomTabManager.f147382a.size();
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public com.ss.android.ugc.gamora.a.a provideRecordEnv() {
        com.ss.android.ugc.gamora.a.a aVar = this.recordEnv;
        if (aVar == null) {
            h.f.b.l.a("recordEnv");
        }
        return aVar;
    }

    static final class s extends h.f.b.m implements h.f.a.a<ec> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(97171);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ec invoke() {
            return new ec(this.this$0.getShortVideoContext(), this.this$0.getDiContainer());
        }
    }

    public d getCurrentBottomTabItem() {
        e eVar = this.bottomTabManager;
        List<f> list = eVar.f147382a;
        TabHost tabHost = eVar.f147385d;
        if (tabHost == null) {
            h.f.b.l.a("bottomTabHost");
        }
        return list.get(tabHost.getCurrentIndex()).f147393b;
    }

    public String defaultBottomTab() {
        List<f> list = this.bottomTabManager.f147382a;
        if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
            return null;
        }
        for (T t : list) {
            if (t.f147393b.f147379e) {
                return t.f147393b.f147377c;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public boolean isCurrentTabNeedCamera() {
        if (!(!h.f.b.l.a((Object) getCurrentBottomTag(), (Object) "record_mode_mv")) || !(!h.f.b.l.a((Object) getCurrentBottomTag(), (Object) com.bytedance.als.dsl.g.b(this).getString(R.string.f_h)))) {
            return false;
        }
        return true;
    }

    public boolean isLiveJumpChangeSwitchOpen() {
        String str;
        if (com.bytedance.framwork.core.b.e.b.a(this.bottomTabManager.f147382a)) {
            return false;
        }
        for (T t : this.bottomTabManager.f147382a) {
            k kVar = t.f147394c;
            if (kVar != null) {
                str = kVar.a();
            } else {
                str = null;
            }
            if (h.f.b.l.a((Object) "RecordLiveScene", (Object) str)) {
                t.f147394c.G();
            }
        }
        return false;
    }

    public boolean isLiveReuseSwitchOpen() {
        String str;
        if (com.bytedance.framwork.core.b.e.b.a(this.bottomTabManager.f147382a)) {
            return false;
        }
        for (T t : this.bottomTabManager.f147382a) {
            k kVar = t.f147394c;
            if (kVar != null) {
                str = kVar.a();
            } else {
                str = null;
            }
            if (h.f.b.l.a((Object) "RecordLiveScene", (Object) str)) {
                t.f147394c.H();
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public boolean isZTLiveSwitch() {
        String str;
        if (com.bytedance.framwork.core.b.e.b.a(this.bottomTabManager.f147382a)) {
            return false;
        }
        for (T t : this.bottomTabManager.f147382a) {
            k kVar = t.f147394c;
            if (kVar != null) {
                str = kVar.a();
            } else {
                str = null;
            }
            if (h.f.b.l.a((Object) "RecordLiveScene", (Object) str)) {
                t.f147394c.F();
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void updateBottomTab() {
        if (bk.a() && !getCameraApiComponent().D().i() && !getShortVideoContext().f124757b.f124714i) {
            this.bottomTabManager.a(bh.a(getShortVideoContext().s()));
            showBottomTab(true);
        }
    }

    static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f147463a;

        static {
            Covode.recordClassIndex(97162);
        }

        j(i iVar) {
            this.f147463a = iVar;
        }

        public final void run() {
            if (this.f147463a.getShortVideoContext().f124757b.h() >= this.f147463a.getShortVideoContext().f124757b.k() && !this.f147463a.getShortVideoContext().f124757b.f124714i && bk.a() && !this.f147463a.getCameraApiComponent().D().i()) {
                this.f147463a.bottomTabManager.a(bh.a(this.f147463a.getShortVideoContext().s()));
                this.f147463a.showBottomTab(true);
            }
        }
    }

    @Override // com.bytedance.als.j
    public void onCreate() {
        super.onCreate();
        Object a2 = this.parentScene.B().a("record_env_context");
        if (a2 == null) {
            h.f.b.l.b();
        }
        com.ss.android.ugc.gamora.a.a aVar = (com.ss.android.ugc.gamora.a.a) a2;
        this.recordEnv = aVar;
        e eVar = this.bottomTabManager;
        if (aVar == null) {
            h.f.b.l.a("recordEnv");
        }
        eVar.a(aVar, this.bottoms, this._bottomTabIndexChangeEvent, this._sharedARTabIndexChangeEvent);
        List<f> list = this.bottomTabManager.f147382a;
        if (!onlyShowLiveTab(this.parentScene)) {
            for (T t : list) {
                if (t.f147394c != null) {
                    com.bytedance.scene.ktx.a.a(this.parentScene, R.id.dj5, t.f147394c, t.f147394c.a());
                }
            }
            this.parentScene.a(R.id.dj5, this.bottomTabScene, "RecordBottomTabScene");
            init(this.parentScene, list);
            setDefaultSelectedTab(this.parentScene, list);
            com.bytedance.scene.ktx.c.a(this.bottomTabScene, new j(this));
            getSharedARTabIndexChangeEvent().a(this, new k(this));
            getBottomTabIndexChangeEvent().a(this, new l(this));
            getRecordControlApi().o().b(this, new m(this));
            getRecordControlApi().h().a(this, new n(this));
            this.setBottomTabStartMargin.a(this, new o(this));
            this.setBottomTabEndMargin.a(this, new p(this));
            getRecordControlApi().m().a(this, new e(this));
            getRecordControlApi().k().a(this, new f(this));
            getRecordControlApi().w().a(this, new g(this));
            getCameraApiComponent().aj().a(this, new h(this));
            getCameraApiComponent().ai().a(this, new C3958i(this));
        }
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f147460a;

        static {
            Covode.recordClassIndex(97159);
        }

        g(i iVar) {
            this.f147460a = iVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147460a.showBottomTab(false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f147470a = new r();

        static {
            Covode.recordClassIndex(97170);
        }

        r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
            h.f.b.l.d(aVar, "");
            return h.z.f158842a;
        }
    }

    private final void observeLiveTabTag(com.bytedance.scene.group.b bVar) {
        getShortVideoContext();
        isZTLiveSwitch();
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f147458a;

        static {
            Covode.recordClassIndex(97157);
        }

        e(i iVar) {
            this.f147458a = iVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147458a.bottomTabManager.a(true);
        }
    }

    static final class h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f147461a;

        static {
            Covode.recordClassIndex(97160);
        }

        h(i iVar) {
            this.f147461a = iVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147461a.bottomTabScene.a(((com.bytedance.creativex.recorder.b.a.k) obj).f28194a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.a, h.z> {
        final /* synthetic */ String $toTag;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(97169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(i iVar, String str) {
            super(1);
            this.this$0 = iVar;
            this.$toTag = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
            h.f.b.l.d(aVar, "");
            this.this$0.handleLeaveSharedARSession(this.$toTag);
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void configSwitchDuration(com.ss.android.ugc.aweme.tools.l lVar) {
        h.f.b.l.d(lVar, "");
        getSwitchDurationConfigFactory().onEvent(lVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void notifyBottomTabIndexChange(c cVar) {
        h.f.b.l.d(cVar, "");
        this._bottomTabIndexChangeEvent.a(cVar);
    }

    public void notifySharedARTabIndexChange(String str) {
        h.f.b.l.d(str, "");
        this._sharedARTabIndexChangeEvent.a(str);
    }

    public void setBottomTabEndMargin(int i2) {
        this.setBottomTabEndMargin.a(Integer.valueOf(i2));
    }

    public void setBottomTabStartMargin(int i2) {
        this.setBottomTabStartMargin.a(Integer.valueOf(i2));
    }

    public void setLiveTagState(int i2) {
        this.showLiveTagState.b(Integer.valueOf(i2));
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void showBottomTab(boolean z) {
        this.showBottomTabEvent.a(Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f147454a;

        static {
            Covode.recordClassIndex(97155);
        }

        c(com.bytedance.scene.group.b bVar) {
            this.f147454a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                com.bytedance.scene.ktx.a.a(this.f147454a, "RecordBottomTabScene");
            } else {
                com.bytedance.scene.ktx.a.b(this.f147454a, "RecordBottomTabScene");
            }
        }
    }

    static final class o<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f147468a;

        static {
            Covode.recordClassIndex(97167);
        }

        o(i iVar) {
            this.f147468a = iVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            com.bytedance.scene.j a2 = this.f147468a.parentScene.a("RecordBottomTabScene");
            if (a2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(a2, "");
            ((j) a2).b(num);
        }
    }

    static final class p<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f147469a;

        static {
            Covode.recordClassIndex(97168);
        }

        p(i iVar) {
            this.f147469a = iVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            com.bytedance.scene.j a2 = this.f147469a.parentScene.a("RecordBottomTabScene");
            if (a2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(a2, "");
            ((j) a2).a(num);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void resetToCurTab(String str) {
        h.f.b.l.d(str, "");
        int a2 = this.bottomTabScene.a(str);
        if (a2 >= 0) {
            this.bottomTabScene.a(a2, false);
        }
    }

    static final class k<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f147464a;

        static {
            Covode.recordClassIndex(97163);
        }

        k(i iVar) {
            this.f147464a = iVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            String str = (String) obj;
            if (!this.f147464a.getShortVideoContext().b()) {
                return;
            }
            if (h.f.b.l.a((Object) str, (Object) com.ss.android.ugc.aweme.shortvideo.ae.f124883a) || h.f.b.l.a((Object) str, (Object) "record_mode_mv")) {
                this.f147464a.showExitSharedARSessionDialog(str);
            }
        }
    }

    static final class n<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f147467a;

        static {
            Covode.recordClassIndex(97166);
        }

        n(i iVar) {
            this.f147467a = iVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147467a.bottomTabManager.a(false);
            this.f147467a.showBottomTab(false);
            ShortVideoContext shortVideoContext = this.f147467a.getShortVideoContext();
            if (shortVideoContext.aa != shortVideoContext.Z) {
                shortVideoContext.aa = shortVideoContext.Z;
                com.ss.android.ugc.aweme.shortvideo.f.a.c(shortVideoContext.aa);
            }
        }
    }

    private final void mobDefaultBottomTabChange(String str) {
        if (!com.ss.android.ugc.gamora.recorder.m.d.b() || getShortVideoContext().f124757b.b() || getShortVideoContext().f124757b.c() || getShortVideoContext().i()) {
            handleBottomTabIndexChangeEvent(new c("by_default", str, 0, false, false, 24));
        }
    }

    public final void handleLeaveSharedARSession(String str) {
        com.ss.android.ugc.aweme.sticker.f.e.a(getStickerApiComponent(), (Effect) null);
        com.ss.android.ugc.aweme.tools.d.b.a(com.ss.android.ugc.aweme.tools.d.a.f139289a);
        getStickerApiComponent().F().a();
        getShortVideoContext().a(false);
        this.planCUiApiComponent.a(true, false);
        getRecordControlApi().c(true);
        getStickerPanelApiComponent().a(true);
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void onCombinePhotoTabChanged(c cVar) {
        c cVar2;
        String str;
        h.f.b.l.d(cVar, "");
        e eVar = this.bottomTabManager;
        if (h.f.b.l.a(cVar.f147370b, (Object) "RecordCombinePhoto")) {
            cVar2 = new c("RecordCombinePhoto", com.ss.android.ugc.aweme.shortvideo.ae.f124885c, cVar.f147372d, cVar.f147373e, cVar.f147374f);
        } else {
            if (cVar.f147370b != null) {
                str = com.ss.android.ugc.aweme.shortvideo.ae.f124885c;
            } else {
                str = null;
            }
            cVar2 = new c(str, "RecordCombinePhoto", cVar.f147372d, cVar.f147373e, cVar.f147374f);
        }
        eVar.a(cVar2);
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f147459a;

        static {
            Covode.recordClassIndex(97158);
        }

        f(i iVar) {
            this.f147459a = iVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            x xVar = (x) obj;
            if (this.f147459a.getShortVideoContext().f124757b.h() > 0) {
                if (bk.a() && !this.f147459a.getShortVideoContext().f124757b.f124714i) {
                    h.f.b.l.b(xVar, "");
                    if (xVar.f28214a != 2) {
                        this.f147459a.bottomTabManager.a(bh.a(this.f147459a.getShortVideoContext().s()));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (this.f147459a.getShortVideoContext().f124757b.f124714i) {
                return;
            } else {
                if (bk.a()) {
                    this.f147459a.bottomTabManager.c();
                }
            }
            this.f147459a.showBottomTab(true);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.i$i  reason: collision with other inner class name */
    static final class C3958i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f147462a;

        static {
            Covode.recordClassIndex(97161);
        }

        C3958i(i iVar) {
            this.f147462a = iVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.creativex.recorder.b.a.l lVar = (com.bytedance.creativex.recorder.b.a.l) obj;
            boolean z = false;
            if (lVar.f28197b) {
                if (this.f147462a.getShortVideoContext().f124757b.h() == 0) {
                    z = true;
                }
                if (lVar.f28196a || (z && !this.f147462a.getShortVideoContext().f124757b.f124714i)) {
                    if (bk.a()) {
                        this.f147462a.bottomTabManager.c();
                    }
                    this.f147462a.showBottomTab(true);
                } else if (bk.a() && !this.f147462a.getCameraApiComponent().D().i() && !this.f147462a.getShortVideoContext().f124757b.f124714i) {
                    this.f147462a.showBottomTab(true);
                }
            } else {
                this.f147462a.showBottomTab(false);
            }
        }
    }

    private final boolean onlyShowLiveTab(com.bytedance.scene.group.b bVar) {
        T t;
        List<f> list = this.bottomTabManager.f147382a;
        if (!getShortVideoContext().al) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (h.f.b.l.a((Object) t.f147393b.f147377c, (Object) ig.a(R.string.f_b))) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null) {
            return false;
        }
        observeBottomTabVisibility(bVar, t2);
        k kVar = t2.f147394c;
        if (kVar != null) {
            com.bytedance.scene.ktx.a.a(bVar, R.id.dj5, this.bottomTabScene, "RecordBottomTabScene");
            bVar.a(R.id.dj5, kVar, kVar.a());
        }
        changeToDefaultTab(bVar, t2, false);
        this.bottomTabManager.e();
        mobDefaultBottomTabChange(t2.f147393b.f147377c);
        return true;
    }

    public final void showExitSharedARSessionDialog(String str) {
        com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(com.bytedance.als.dsl.g.b(this));
        bVar.a(R.string.fus, new q(this, str));
        bVar.b(R.string.b0r, r.f147470a);
        ((com.bytedance.tux.dialog.b) ((com.bytedance.tux.dialog.b) a.C1094a.a(com.bytedance.als.dsl.g.b(this)).a(R.string.fuu).b(R.string.fut)).a(bVar).a(false)).a().b().show();
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f147455a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f147456b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f147457c;

        static {
            Covode.recordClassIndex(97156);
        }

        d(i iVar, com.bytedance.scene.group.b bVar, f fVar) {
            this.f147455a = iVar;
            this.f147456b = bVar;
            this.f147457c = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (this.f147457c.f147394c != null) {
                    if (bool.booleanValue()) {
                        if (h.f.b.l.a((Object) this.f147457c.f147394c.a(), (Object) "RecordLiveScene")) {
                            this.f147457c.f147394c.E();
                            Activity activity = this.f147456b.f42913m;
                            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
                            ((VideoRecordNewActivity) activity).a(true, false);
                            if (this.f147455a.isZTLiveSwitch() && this.f147455a.isLiveReuseSwitchOpen()) {
                                this.f147455a.setLiveTagState(-1);
                            }
                        }
                        e.a(true, this.f147457c.f147394c.a(), this.f147457c.f147394c.C(), (com.bytedance.creativex.recorder.b.a.d) this.f147455a.getCameraApiComponent());
                        this.f147456b.e(this.f147457c.f147394c);
                        this.f147457c.f147394c.b();
                        return;
                    }
                    if (h.f.b.l.a((Object) this.f147457c.f147394c.a(), (Object) "RecordLiveScene")) {
                        this.f147457c.f147394c.E();
                        Activity activity2 = this.f147456b.f42913m;
                        Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
                        ((VideoRecordNewActivity) activity2).a(false, true);
                    }
                    this.f147457c.f147394c.d();
                    this.f147456b.d(this.f147457c.f147394c);
                    e.a(false, this.f147457c.f147394c.a(), this.f147457c.f147394c.C(), (com.bytedance.creativex.recorder.b.a.d) this.f147455a.getCameraApiComponent());
                }
            }
        }
    }

    static final class l<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f147465a;

        static {
            Covode.recordClassIndex(97164);
        }

        l(i iVar) {
            this.f147465a = iVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            c cVar = (c) obj;
            i iVar = this.f147465a;
            h.f.b.l.b(cVar, "");
            iVar.handleBottomTabIndexChangeEvent(cVar);
            String string = this.f147465a.parentScene.t().getString(R.string.f_b);
            h.f.b.l.b(string, "");
            if (TextUtils.equals((CharSequence) cVar.f147370b, string)) {
                Object obj2 = cVar.f147371c;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
                if (!TextUtils.equals((CharSequence) obj2, string)) {
                    this.f147465a.getControlProgressApiComponent().a(true);
                }
            }
            if (!TextUtils.equals((CharSequence) cVar.f147370b, "record_mode_mv")) {
                Object obj3 = cVar.f147371c;
                Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.CharSequence");
                if (TextUtils.equals((CharSequence) obj3, "record_mode_mv")) {
                    this.f147465a.getCameraApiComponent().a(0);
                }
            }
            String str = (String) cVar.f147371c;
            if (!h.f.b.l.a((Object) str, (Object) ig.a(R.string.f_9))) {
                this.f147465a.isCurrentForbidAudioTab = a.C3549a.a(str);
            }
            this.f147465a.getStickerApiComponent().e(this.f147465a.isCurrentForbidAudioTab);
        }
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f147466a;

        static {
            Covode.recordClassIndex(97165);
        }

        m(i iVar) {
            this.f147466a = iVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean a2;
            t tVar = (t) obj;
            if (tVar != null) {
                this.f147466a.getShortVideoContext();
                if (com.ss.android.ugc.aweme.setting.i.p.a() == 2) {
                    a2 = this.f147466a.getEnableSwitchDurationAfterRecording();
                } else {
                    a2 = bk.a();
                }
                if (!tVar.f28205a.isEmpty() || tVar.f28206b != 0) {
                    if (!a2 || this.f147466a.getCameraApiComponent().D().i() || this.f147466a.getShortVideoContext().f124757b.f124714i) {
                        this.f147466a.showBottomTab(false);
                    } else if (this.f147466a.getShortVideoContext().f124757b.h() < this.f147466a.getShortVideoContext().f124757b.k()) {
                        this.f147466a.bottomTabManager.a(bh.a(this.f147466a.getShortVideoContext().s()));
                        this.f147466a.showBottomTab(true);
                    }
                } else if (!this.f147466a.getShortVideoContext().f124757b.f124714i && tVar.f28208d) {
                    if (a2) {
                        this.f147466a.bottomTabManager.c();
                    }
                    if (!this.f147466a.getShortVideoContext().b()) {
                        this.f147466a.showBottomTab(true);
                    }
                }
            }
        }
    }

    public final void handleBottomTabIndexChangeEvent(c cVar) {
        com.ss.android.ugc.tools.f.b a2;
        h.f.b.l.d(cVar, "");
        if (cVar.f147373e) {
            String str = "";
            for (f fVar : this.bottomTabManager.f147382a) {
                Object obj = cVar.f147371c;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                if (TextUtils.equals((CharSequence) obj, fVar.f147393b.f147377c)) {
                    str = fVar.f147393b.f147378d;
                }
            }
            if (!TextUtils.equals(str, "")) {
                if (TextUtils.equals(str, "video_15") && com.ss.android.ugc.gamora.recorder.m.d.b()) {
                    str = "camera";
                }
                com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("creation_id", getShortVideoContext().q).a("shoot_way", getShortVideoContext().r).a("draft_id", getShortVideoContext().C).a("to_status", str).a("from_status", bh.a(cVar.f147370b));
                if (!bk.a() || getShortVideoContext().f124757b.h() <= 0) {
                    a2 = a3.a("enter_from", "video_shoot_page");
                } else {
                    a2 = a3.a("enter_from", "video_recording_page");
                }
                com.ss.android.ugc.aweme.common.r.a("change_record_mode", a2.f149193a);
            }
        }
    }

    private final void observeBottomTabVisibility(com.bytedance.scene.group.b bVar, f fVar) {
        fVar.f147392a.observe(com.bytedance.scene.ktx.b.b(bVar), new d(this, bVar, fVar));
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void setCurrentTab(String str, boolean z) {
        h.f.b.l.d(str, "");
        this.bottomTabManager.a(str, z);
    }

    private final void setDefaultSelectedTab(com.bytedance.scene.group.b bVar, List<f> list) {
        T t;
        if (!this.hasSelectDefaultTab) {
            this.hasSelectDefaultTab = true;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t.f147393b.f147379e) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                changeToDefaultTab(bVar, t2, false);
                this.bottomTabManager.e();
                mobDefaultBottomTabChange(t2.f147393b.f147377c);
            }
        }
    }

    private final void init(com.bytedance.scene.group.b bVar, List<f> list) {
        T t;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            observeBottomTabVisibility(bVar, it.next());
        }
        this.showBottomTabEvent.a(bVar, new c(bVar));
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t = null;
                break;
            }
            t = it2.next();
            if (t.f147393b.f147379e) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            changeToDefaultTab$default(this, bVar, t2, false, 2, null);
        }
        observeLiveTabTag(bVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    public <M1 extends com.bytedance.jedi.arch.x<S1, PROP1>, PROP1 extends af, S1 extends af, R> R withSubstate(com.bytedance.jedi.arch.x<S1, PROP1> xVar, h.f.a.b<? super PROP1, ? extends R> bVar) {
        h.f.b.l.d(xVar, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(xVar, bVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends af, VM2 extends JediViewModel<S2>, S2 extends af, R> R withState(VM1 vm1, VM2 vm2, h.f.a.m<? super S1, ? super S2, ? extends R> mVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(vm2, "");
        h.f.b.l.d(mVar, "");
        return (R) b.a.a(vm1, vm2, mVar);
    }

    public <M1 extends com.bytedance.jedi.arch.x<S1, PROP1>, PROP1 extends af, S1 extends af, M2 extends com.bytedance.jedi.arch.x<S2, PROP2>, PROP2 extends af, S2 extends af, R> R withSubstate(com.bytedance.jedi.arch.x<S1, PROP1> xVar, com.bytedance.jedi.arch.x<S2, PROP2> xVar2, h.f.a.m<? super PROP1, ? super PROP2, ? extends R> mVar) {
        h.f.b.l.d(xVar, "");
        h.f.b.l.d(xVar2, "");
        h.f.b.l.d(mVar, "");
        return (R) b.a.a(xVar, xVar2, mVar);
    }

    private final void changeToDefaultTab(com.bytedance.scene.group.b bVar, f fVar, boolean z) {
        com.bytedance.scene.j a2 = bVar.a("RecordBottomTabScene");
        if (a2 == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(a2, "");
        j jVar = (j) a2;
        int a3 = jVar.a(fVar.f147393b.f147377c);
        if (a3 >= 0) {
            jVar.a(a3, z);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void addBottomTab(int i2, a aVar, int i3) {
        h.f.b.l.d(aVar, "");
        com.bytedance.scene.group.b bVar = this.parentScene;
        Iterator<T> it = this.bottomTabManager.f147382a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            String str = next.f147393b.f147377c;
            com.ss.android.ugc.gamora.a.a aVar2 = this.recordEnv;
            if (aVar2 == null) {
                h.f.b.l.a("recordEnv");
            }
            if (h.f.b.l.a((Object) str, (Object) aVar.createBottomTabItem(aVar2).f147377c)) {
                if (next != null) {
                    return;
                }
            }
        }
        e eVar = this.bottomTabManager;
        com.ss.android.ugc.gamora.a.a aVar3 = this.recordEnv;
        if (aVar3 == null) {
            h.f.b.l.a("recordEnv");
        }
        f a2 = eVar.a(aVar3, i2, aVar);
        observeBottomTabVisibility(bVar, a2);
        k kVar = a2.f147394c;
        if (kVar != null) {
            com.bytedance.scene.ktx.a.a(bVar, R.id.dj6, kVar, kVar.a());
        }
        if (a2.f147393b.f147379e) {
            com.bytedance.scene.ktx.c.a(bVar, new a(bVar, a2, this, aVar, i2), 500);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.List<? extends com.ss.android.ugc.gamora.recorder.b.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public i(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar, List<? extends a> list) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(list, "");
        this.parentScene = bVar;
        this.diContainer = fVar;
        this.bottoms = list;
        Object a2 = getDiContainer().a(com.ss.android.ugc.aweme.shortvideo.h.a.class, (String) null);
        h.f.b.l.b(a2, "");
        com.ss.android.ugc.aweme.shortvideo.h.a aVar = (com.ss.android.ugc.aweme.shortvideo.h.a) a2;
        this.planCUiApiComponent = aVar;
        this.cameraApiComponent$delegate = com.bytedance.o.b.a.a(getDiContainer(), z.class);
        this.recordControlApi$delegate = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.m.class);
        this.shortVideoContext$delegate = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);
        this.controlProgressApiComponent$delegate = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.k.a.class);
        this.chooseMusicApiComponent$delegate = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.choosemusic.a.class);
        this.stickerApiComponent$delegate = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.sticker.c.j.class);
        this.stickerPanelApiComponent$delegate = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.sticker.a.c.class);
        com.bytedance.als.k<c> kVar = new com.bytedance.als.k<>();
        this._bottomTabIndexChangeEvent = kVar;
        com.bytedance.als.k<String> kVar2 = new com.bytedance.als.k<>();
        this._sharedARTabIndexChangeEvent = kVar2;
        this.bottomTabIndexChangeEvent = kVar;
        this.sharedARTabIndexChangeEvent = kVar2;
        e eVar = new e();
        this.bottomTabManager = eVar;
        this.showBottomTabEvent = new com.bytedance.als.k<>();
        this.showLiveTagState = new com.bytedance.als.d<>(null);
        this.setBottomTabStartMargin = new com.bytedance.als.k<>();
        this.setBottomTabEndMargin = new com.bytedance.als.k<>();
        this.bottomTabScene = new j(getDiContainer(), getShortVideoContext(), eVar, aVar.c());
        this.enableSwitchDurationAfterRecording$delegate = h.i.a((h.f.a.a) b.f147453a);
        this.switchDurationConfigFactory$delegate = h.i.a(h.m.NONE, new s(this));
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends af, VM2 extends JediViewModel<S2>, S2 extends af, VM3 extends JediViewModel<S3>, S3 extends af, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, h.f.a.q<? super S1, ? super S2, ? super S3, ? extends R> qVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(vm2, "");
        h.f.b.l.d(vm3, "");
        h.f.b.l.d(qVar, "");
        return (R) b.a.a(vm1, vm2, vm3, qVar);
    }

    public <M1 extends com.bytedance.jedi.arch.x<S1, PROP1>, PROP1 extends af, S1 extends af, M2 extends com.bytedance.jedi.arch.x<S2, PROP2>, PROP2 extends af, S2 extends af, M3 extends com.bytedance.jedi.arch.x<S3, PROP3>, PROP3 extends af, S3 extends af, R> R withSubstate(com.bytedance.jedi.arch.x<S1, PROP1> xVar, com.bytedance.jedi.arch.x<S2, PROP2> xVar2, com.bytedance.jedi.arch.x<S3, PROP3> xVar3, h.f.a.q<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> qVar) {
        h.f.b.l.d(xVar, "");
        h.f.b.l.d(xVar2, "");
        h.f.b.l.d(xVar3, "");
        h.f.b.l.d(qVar, "");
        return (R) b.a.a(xVar, xVar2, xVar3, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends af, VM2 extends JediViewModel<S2>, S2 extends af, VM3 extends JediViewModel<S3>, S3 extends af, VM4 extends JediViewModel<S4>, S4 extends af, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, h.f.a.r<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> rVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(vm2, "");
        h.f.b.l.d(vm3, "");
        h.f.b.l.d(vm4, "");
        h.f.b.l.d(rVar, "");
        return (R) b.a.a(vm1, vm2, vm3, vm4, rVar);
    }

    public <M1 extends com.bytedance.jedi.arch.x<S1, PROP1>, PROP1 extends af, S1 extends af, M2 extends com.bytedance.jedi.arch.x<S2, PROP2>, PROP2 extends af, S2 extends af, M3 extends com.bytedance.jedi.arch.x<S3, PROP3>, PROP3 extends af, S3 extends af, M4 extends com.bytedance.jedi.arch.x<S4, PROP4>, PROP4 extends af, S4 extends af, R> R withSubstate(com.bytedance.jedi.arch.x<S1, PROP1> xVar, com.bytedance.jedi.arch.x<S2, PROP2> xVar2, com.bytedance.jedi.arch.x<S3, PROP3> xVar3, com.bytedance.jedi.arch.x<S4, PROP4> xVar4, h.f.a.r<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> rVar) {
        h.f.b.l.d(xVar, "");
        h.f.b.l.d(xVar2, "");
        h.f.b.l.d(xVar3, "");
        h.f.b.l.d(xVar4, "");
        h.f.b.l.d(rVar, "");
        return (R) b.a.a(xVar, xVar2, xVar3, xVar4, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    static /* synthetic */ void changeToDefaultTab$default(i iVar, com.bytedance.scene.group.b bVar, f fVar, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z = true;
            }
            iVar.changeToDefaultTab(bVar, fVar, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeToDefaultTab");
    }

    public <VM1 extends JediViewModel<S1>, S1 extends af, VM2 extends JediViewModel<S2>, S2 extends af, VM3 extends JediViewModel<S3>, S3 extends af, VM4 extends JediViewModel<S4>, S4 extends af, VM5 extends JediViewModel<S5>, S5 extends af, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, h.f.a.s<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> sVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(vm2, "");
        h.f.b.l.d(vm3, "");
        h.f.b.l.d(vm4, "");
        h.f.b.l.d(vm5, "");
        h.f.b.l.d(sVar, "");
        return (R) b.a.a(vm1, vm2, vm3, vm4, vm5, sVar);
    }

    public <M1 extends com.bytedance.jedi.arch.x<S1, PROP1>, PROP1 extends af, S1 extends af, M2 extends com.bytedance.jedi.arch.x<S2, PROP2>, PROP2 extends af, S2 extends af, M3 extends com.bytedance.jedi.arch.x<S3, PROP3>, PROP3 extends af, S3 extends af, M4 extends com.bytedance.jedi.arch.x<S4, PROP4>, PROP4 extends af, S4 extends af, M5 extends com.bytedance.jedi.arch.x<S5, PROP5>, PROP5 extends af, S5 extends af, R> R withSubstate(com.bytedance.jedi.arch.x<S1, PROP1> xVar, com.bytedance.jedi.arch.x<S2, PROP2> xVar2, com.bytedance.jedi.arch.x<S3, PROP3> xVar3, com.bytedance.jedi.arch.x<S4, PROP4> xVar4, com.bytedance.jedi.arch.x<S5, PROP5> xVar5, h.f.a.s<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> sVar) {
        h.f.b.l.d(xVar, "");
        h.f.b.l.d(xVar2, "");
        h.f.b.l.d(xVar3, "");
        h.f.b.l.d(xVar4, "");
        h.f.b.l.d(xVar5, "");
        h.f.b.l.d(sVar, "");
        return (R) b.a.a(xVar, xVar2, xVar3, xVar4, xVar5, sVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }

    public <S extends af, A, B, C, D, E> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, h.k.k<S, ? extends E> kVar5, ah<ao<A, B, C, D, E>> ahVar, h.f.a.t<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, ? super E, h.z> tVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(kVar5, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(tVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, kVar5, ahVar, tVar);
    }
}
