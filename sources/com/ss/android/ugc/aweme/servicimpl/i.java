package com.ss.android.ugc.aweme.servicimpl;

import androidx.lifecycle.i;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.gamora.recorder.b.k;
import com.ss.android.ugc.gamora.recorder.b.l;
import com.ss.android.ugc.gamora.recorder.l.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.h.d;

public final class i implements com.bytedance.o.a, com.ss.android.ugc.gamora.recorder.b.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f121889a = {new y(i.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new y(i.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0), new y(i.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0), new y(i.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0)};

    /* renamed from: c  reason: collision with root package name */
    public static final a f121890c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final d f121891b = com.bytedance.o.b.a.b(getDiContainer(), f.class);

    /* renamed from: d  reason: collision with root package name */
    private final d f121892d = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.b.b.class);

    /* renamed from: e  reason: collision with root package name */
    private final d f121893e = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.recorder.m.a.class);

    /* renamed from: f  reason: collision with root package name */
    private final d f121894f = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);

    /* renamed from: g  reason: collision with root package name */
    private final String f121895g;

    /* renamed from: h  reason: collision with root package name */
    private final String f121896h;

    /* renamed from: i  reason: collision with root package name */
    private final String f121897i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f121898j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.o.f f121899k;

    static {
        Covode.recordClassIndex(79927);
    }

    public final com.ss.android.ugc.gamora.recorder.b.b a() {
        return (com.ss.android.ugc.gamora.recorder.b.b) this.f121892d.a(this, f121889a[0]);
    }

    public final com.bytedance.creativex.recorder.b.a.d b() {
        return (com.bytedance.creativex.recorder.b.a.d) this.f121894f.a(this, f121889a[3]);
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final void initialize(com.ss.android.ugc.gamora.a.a aVar) {
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final k provideScene() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79928);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f121899k;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final com.ss.android.ugc.gamora.recorder.b.d createBottomTabItem(com.ss.android.ugc.gamora.a.a aVar) {
        l.d(aVar, "");
        return new com.ss.android.ugc.gamora.recorder.b.d(this.f121895g, this.f121896h, this.f121897i, this.f121898j, new b(this, aVar));
    }

    public static final class b implements com.ss.android.ugc.gamora.recorder.b.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f121900a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.gamora.a.a f121901b;

        static {
            Covode.recordClassIndex(79929);
        }

        b(i iVar, com.ss.android.ugc.gamora.a.a aVar) {
            this.f121900a = iVar;
            this.f121901b = aVar;
        }

        @Override // com.ss.android.ugc.gamora.recorder.b.l
        public final boolean onTabUnselected(com.ss.android.ugc.gamora.recorder.b.d dVar, l.a aVar) {
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(aVar, "");
            this.f121900a.a().showComplexTab(8, aVar.f147482c);
            return false;
        }

        @Override // com.ss.android.ugc.gamora.recorder.b.l
        public final boolean onTabSelected(com.ss.android.ugc.gamora.recorder.b.d dVar, l.a aVar) {
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(aVar, "");
            if (!this.f121900a.b().b()) {
                androidx.lifecycle.i lifecycle = this.f121901b.a().getLifecycle();
                h.f.b.l.b(lifecycle, "");
                if (lifecycle.a().isAtLeast(i.b.STARTED)) {
                    this.f121900a.b().a(false, PrivacyCert.Builder.Companion.with("bpea-284").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
                }
            }
            i iVar = this.f121900a;
            f fVar = (f) iVar.f121891b.a(iVar, i.f121889a[2]);
            if (fVar != null) {
                fVar.a(-this.f121901b.a().getResources().getDimensionPixelOffset(R.dimen.cr));
            }
            this.f121900a.a().showComplexTab(0, aVar.f147482c);
            return true;
        }
    }

    public i(String str, String str2, String str3, boolean z, com.bytedance.o.f fVar) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        h.f.b.l.d(fVar, "");
        this.f121895g = str;
        this.f121896h = str2;
        this.f121897i = str3;
        this.f121898j = z;
        this.f121899k = fVar;
    }
}
