package com.ss.android.ugc.gamora.recorder.quickupload;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.covode.number.Covode;

public final class RvLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public boolean f148186a = true;

    static {
        Covode.recordClassIndex(97671);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final boolean f() {
        if (!this.f148186a || !super.f()) {
            return false;
        }
        return true;
    }
}
