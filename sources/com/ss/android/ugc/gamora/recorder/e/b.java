package com.ss.android.ugc.gamora.recorder.e;

import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.als.g;
import com.bytedance.als.j;
import com.bytedance.als.k;
import com.bytedance.als.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.t;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.setting.i.p;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.y;
import h.h;
import h.k.i;
import h.z;

public class b extends j<a> implements com.bytedance.o.a, a {
    static final /* synthetic */ i[] $$delegatedProperties = {new y(b.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new y(b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(b.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new y(b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};
    public final a apiComponent = this;
    private final f diContainer;
    private final k<z> dismissSuperEntranceEvent;
    private final k<z> dismissUploadPopEntranceEvent;
    private final l<Integer> effectContainerVisibility;
    private final k<z> needNoTouchListener;
    public final com.bytedance.scene.group.b parentScene;
    private final h.h.d planCUIApiComponent$delegate = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.h.a.class);
    private final h.h.d recordControlApi$delegate = com.bytedance.o.b.a.a(getDiContainer(), m.class);
    private final d recordDockBarScene;
    private final h.h.d shortVideoContext$delegate = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);
    private final h shortVideoContextViewModel$delegate = h.i.a(h.m.NONE, new a(this));
    private final h.h.d stickerApiComponent$delegate = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.sticker.c.j.class);
    public final l<Integer> uploadVisibility;

    static {
        Covode.recordClassIndex(97349);
    }

    private final com.ss.android.ugc.aweme.shortvideo.h.a getPlanCUIApiComponent() {
        return (com.ss.android.ugc.aweme.shortvideo.h.a) this.planCUIApiComponent$delegate.a(this, $$delegatedProperties[0]);
    }

    private final ShortVideoContextViewModel getShortVideoContextViewModel() {
        return (ShortVideoContextViewModel) this.shortVideoContextViewModel$delegate.getValue();
    }

    private final com.ss.android.ugc.gamora.recorder.sticker.c.j getStickerApiComponent() {
        return (com.ss.android.ugc.gamora.recorder.sticker.c.j) this.stickerApiComponent$delegate.a(this, $$delegatedProperties[2]);
    }

    public final m getRecordControlApi() {
        return (m) this.recordControlApi$delegate.a(this, $$delegatedProperties[1]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.shortVideoContext$delegate.a(this, $$delegatedProperties[3]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public /* bridge */ /* synthetic */ a getApiComponent() {
        return this.apiComponent;
    }

    @Override // com.bytedance.o.a
    public f getDiContainer() {
        return this.diContainer;
    }

    @Override // com.ss.android.ugc.gamora.recorder.e.a
    public void dismissSuperEntranceEvent() {
        this.dismissSuperEntranceEvent.a(z.f158842a);
    }

    @Override // com.ss.android.ugc.gamora.recorder.e.a
    public void dismissUploadPopEntranceEvent() {
        this.dismissUploadPopEntranceEvent.a(z.f158842a);
    }

    @Override // com.ss.android.ugc.gamora.recorder.e.a
    public g<z> getNoBlockTouchEvent() {
        return this.recordDockBarScene.f147704d;
    }

    public final void hideUploadAndEffect() {
        setUploadVisibility(8);
        setEffectContainerVisibility(8);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<ShortVideoContextViewModel> {
        final /* synthetic */ com.bytedance.o.a $this_viewModel;

        static {
            Covode.recordClassIndex(97350);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_viewModel = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.ac, com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_viewModel
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<androidx.fragment.app.e> r1 = androidx.fragment.app.e.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                androidx.fragment.app.e r0 = (androidx.fragment.app.e) r0
                androidx.lifecycle.ad r1 = com_ss_android_ugc_gamora_recorder_control_RecordDockBarComponent$$special$$inlined$viewModel$1_androidx_lifecycle_VScopeLancet_of(r0)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r0 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
                androidx.lifecycle.ac r0 = r1.a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.e.b.a.invoke():androidx.lifecycle.ac");
        }

        public static ad com_ss_android_ugc_gamora_recorder_control_RecordDockBarComponent$$special$$inlined$viewModel$1_androidx_lifecycle_VScopeLancet_of(androidx.fragment.app.e eVar) {
            return ae.a(eVar, (ad.b) null);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.e.a
    public void dismissLivePopupEvent() {
        ((com.ss.android.ugc.gamora.recorder.b.b) getDiContainer().a(com.ss.android.ugc.gamora.recorder.b.b.class, (String) null)).hidePopupForLiveTab();
    }

    @Override // com.bytedance.als.j
    public void onCreate() {
        super.onCreate();
        this.parentScene.a(R.id.dj5, this.recordDockBarScene, "RecordDockBarScene");
        getRecordControlApi().o().b(this, new C3972b(this));
        getPlanCUIApiComponent().a().a(this, new c(this));
        getRecordControlApi().k().a(this, new d(this));
        getRecordControlApi().w().a(this, new e(this));
    }

    @Override // com.ss.android.ugc.gamora.recorder.e.a
    public void setNeedNoTouchListener(boolean z) {
        this.needNoTouchListener.a(z.f158842a);
    }

    public void setEffectContainerVisibility(int i2) {
        this.effectContainerVisibility.b(Integer.valueOf(i2));
    }

    public void setUploadVisibility(int i2) {
        this.uploadVisibility.b(Integer.valueOf(i2));
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f147698a;

        static {
            Covode.recordClassIndex(97354);
        }

        e(b bVar) {
            this.f147698a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f147698a.getShortVideoContext().b()) {
                this.f147698a.hideUploadAndEffect();
            } else {
                this.f147698a.setUploadVisibility(4);
            }
        }
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f147697a;

        static {
            Covode.recordClassIndex(97353);
        }

        d(b bVar) {
            this.f147697a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f147697a.getShortVideoContext().b()) {
                this.f147697a.hideUploadAndEffect();
            } else if (this.f147697a.getShortVideoContext().f124757b.h() > 0) {
                this.f147697a.setUploadVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.b$b  reason: collision with other inner class name */
    static final class C3972b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f147695a;

        static {
            Covode.recordClassIndex(97351);
        }

        C3972b(b bVar) {
            this.f147695a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            t tVar = (t) obj;
            if (this.f147695a.getShortVideoContext().b()) {
                this.f147695a.hideUploadAndEffect();
            } else if (tVar == null) {
            } else {
                if (!tVar.f28205a.isEmpty() || tVar.f28206b != 0) {
                    this.f147695a.getShortVideoContext();
                    if (p.a() == 2) {
                        T value = this.f147695a.uploadVisibility.f6468a.getValue();
                        if (value == null || value.intValue() != 4) {
                            this.f147695a.setUploadVisibility(4);
                            return;
                        }
                        return;
                    }
                    this.f147695a.setUploadVisibility(4);
                } else if (!this.f147695a.getShortVideoContext().f124757b.f124714i && tVar.f28208d && !this.f147695a.getShortVideoContext().f124757b.b() && !this.f147695a.getShortVideoContext().f124757b.c() && !this.f147695a.getShortVideoContext().c()) {
                    T value2 = this.f147695a.getRecordControlApi().c().f6468a.getValue();
                    h.f.b.l.b(value2, "");
                    if (value2.booleanValue()) {
                        this.f147695a.setUploadVisibility(0);
                    }
                }
            }
        }
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f147696a;

        static {
            Covode.recordClassIndex(97352);
        }

        c(b bVar) {
            this.f147696a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            if (this.f147696a.getShortVideoContext().b()) {
                this.f147696a.hideUploadAndEffect();
                return;
            }
            h.f.b.l.b(bool, "");
            int i3 = 0;
            if (!bool.booleanValue() || this.f147696a.getShortVideoContext().f124757b.h() > 0) {
                this.f147696a.setUploadVisibility(8);
            } else {
                b bVar = this.f147696a;
                if (bVar.getShortVideoContext().f124757b.f124714i || this.f147696a.getShortVideoContext().c()) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                bVar.setUploadVisibility(i2);
            }
            b bVar2 = this.f147696a;
            if (!bool.booleanValue()) {
                i3 = 4;
            }
            bVar2.setEffectContainerVisibility(i3);
            if (this.f147696a.getShortVideoContext().f124757b.b() || this.f147696a.getShortVideoContext().f124757b.c()) {
                this.f147696a.setUploadVisibility(8);
            }
        }
    }

    public b(com.bytedance.scene.group.b bVar, f fVar) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(fVar, "");
        this.parentScene = bVar;
        this.diContainer = fVar;
        l<Integer> lVar = new l<>(8);
        this.effectContainerVisibility = lVar;
        k<z> kVar = new k<>();
        this.dismissSuperEntranceEvent = kVar;
        k<z> kVar2 = new k<>();
        this.dismissUploadPopEntranceEvent = kVar2;
        l<Integer> lVar2 = new l<>(8);
        this.uploadVisibility = lVar2;
        k<z> kVar3 = new k<>();
        this.needNoTouchListener = kVar3;
        this.recordDockBarScene = new d(getDiContainer(), lVar, lVar2, kVar3, getPlanCUIApiComponent().c(), new c(kVar, kVar2, getStickerApiComponent().D().a()));
    }
}
