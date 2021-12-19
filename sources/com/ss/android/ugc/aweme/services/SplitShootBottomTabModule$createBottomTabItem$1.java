package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.p;
import com.ss.android.ugc.gamora.a.a;
import com.ss.android.ugc.gamora.recorder.b.d;
import com.ss.android.ugc.gamora.recorder.b.l;
import com.ss.android.ugc.gamora.recorder.l.f;
import com.ss.android.ugc.gamora.recorder.permission.PermissionStateViewModel;
import com.zhiliaoapp.musically.R;

public final class SplitShootBottomTabModule$createBottomTabItem$1 implements l {
    final /* synthetic */ a $tabEnv;
    final /* synthetic */ SplitShootBottomTabModule this$0;

    static {
        Covode.recordClassIndex(79567);
    }

    SplitShootBottomTabModule$createBottomTabItem$1(SplitShootBottomTabModule splitShootBottomTabModule, a aVar) {
        this.this$0 = splitShootBottomTabModule;
        this.$tabEnv = aVar;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.l
    public final boolean onTabUnselected(d dVar, l.a aVar) {
        com.ss.android.ugc.gamora.recorder.m.a splitShootApiComponent;
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(aVar, "");
        if ((!h.f.b.l.a((Object) aVar.f147484e, (Object) "RecordCombinePhoto")) && (splitShootApiComponent = this.this$0.getSplitShootApiComponent()) != null) {
            splitShootApiComponent.a(false);
        }
        f speedApiComponent = this.this$0.getSpeedApiComponent();
        if (speedApiComponent != null) {
            speedApiComponent.a(0);
        }
        return false;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.l
    public final boolean onTabSelected(d dVar, l.a aVar) {
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(aVar, "");
        this.this$0.getRecordControlApi().a(p.class);
        com.ss.android.ugc.gamora.recorder.m.a splitShootApiComponent = this.this$0.getSplitShootApiComponent();
        if (splitShootApiComponent != null) {
            splitShootApiComponent.a(true);
        }
        f speedApiComponent = this.this$0.getSpeedApiComponent();
        if (speedApiComponent != null) {
            speedApiComponent.a(-this.$tabEnv.a().getResources().getDimensionPixelOffset(R.dimen.cr));
        }
        if (!SplitShootBottomTabModule.access$getCameraApiComponent$p(this.this$0).b()) {
            SplitShootBottomTabModule.access$getPermissionStateViewModel$p(this.this$0).c(PermissionStateViewModel.b.f148172a);
        }
        com.ss.android.ugc.gamora.recorder.m.a splitShootApiComponent2 = this.this$0.getSplitShootApiComponent();
        if (splitShootApiComponent2 != null) {
            splitShootApiComponent2.a(aVar);
        }
        return true;
    }
}
