package com.ss.android.ugc.aweme.compliance.api.services.child;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class a implements IChildModeService {
    static {
        Covode.recordClassIndex(47383);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void a(Context context) {
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void a(boolean z, Runnable runnable) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final boolean a() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void b(Context context) {
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void c(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final List<String> c() {
        return z.INSTANCE;
    }
}
