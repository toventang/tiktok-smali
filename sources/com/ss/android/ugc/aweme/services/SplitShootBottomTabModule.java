package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.t;
import com.bytedance.o.a;
import com.bytedance.o.f;
import com.ss.android.ugc.gamora.recorder.b.k;
import com.ss.android.ugc.gamora.recorder.permission.PermissionStateViewModel;
import h.f.b.l;
import h.f.b.y;
import h.k.i;

public final class SplitShootBottomTabModule implements a, com.ss.android.ugc.gamora.recorder.b.a {
    static final /* synthetic */ i[] $$delegatedProperties = {new y(SplitShootBottomTabModule.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0), new y(SplitShootBottomTabModule.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0), new y(SplitShootBottomTabModule.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0)};
    public d cameraApiComponent;
    private final boolean defaultSelected;
    private final f diContainer;
    public PermissionStateViewModel permissionStateViewModel;
    private final h.h.d recordControlApi$delegate = com.bytedance.o.b.a.a(getDiContainer(), m.class);
    private final h.h.d speedApiComponent$delegate = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.recorder.l.f.class);
    private final h.h.d splitShootApiComponent$delegate = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.recorder.m.a.class);
    private final String tag;
    private final String text;

    static {
        Covode.recordClassIndex(79566);
    }

    public final m getRecordControlApi() {
        return (m) this.recordControlApi$delegate.a(this, $$delegatedProperties[2]);
    }

    public final com.ss.android.ugc.gamora.recorder.l.f getSpeedApiComponent() {
        return (com.ss.android.ugc.gamora.recorder.l.f) this.speedApiComponent$delegate.a(this, $$delegatedProperties[1]);
    }

    public final com.ss.android.ugc.gamora.recorder.m.a getSplitShootApiComponent() {
        return (com.ss.android.ugc.gamora.recorder.m.a) this.splitShootApiComponent$delegate.a(this, $$delegatedProperties[0]);
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final k provideScene() {
        return null;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.diContainer;
    }

    public static final /* synthetic */ d access$getCameraApiComponent$p(SplitShootBottomTabModule splitShootBottomTabModule) {
        d dVar = splitShootBottomTabModule.cameraApiComponent;
        if (dVar == null) {
            l.a("cameraApiComponent");
        }
        return dVar;
    }

    public static final /* synthetic */ PermissionStateViewModel access$getPermissionStateViewModel$p(SplitShootBottomTabModule splitShootBottomTabModule) {
        PermissionStateViewModel permissionStateViewModel2 = splitShootBottomTabModule.permissionStateViewModel;
        if (permissionStateViewModel2 == null) {
            l.a("permissionStateViewModel");
        }
        return permissionStateViewModel2;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final com.ss.android.ugc.gamora.recorder.b.d createBottomTabItem(com.ss.android.ugc.gamora.a.a aVar) {
        l.d(aVar, "");
        return new com.ss.android.ugc.gamora.recorder.b.d(this.text, this.tag, "video_15", this.defaultSelected, new SplitShootBottomTabModule$createBottomTabItem$1(this, aVar));
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final void initialize(com.ss.android.ugc.gamora.a.a aVar) {
        l.d(aVar, "");
        this.cameraApiComponent = aVar.d();
        JediViewModel a2 = t.a(aVar.a()).a(PermissionStateViewModel.class);
        l.b(a2, "");
        this.permissionStateViewModel = (PermissionStateViewModel) a2;
    }

    public SplitShootBottomTabModule(String str, String str2, f fVar, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        l.d(fVar, "");
        this.text = str;
        this.tag = str2;
        this.diContainer = fVar;
        this.defaultSelected = z;
    }
}
