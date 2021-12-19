package com.ss.android.ugc.aweme.app.host;

import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.ies.ugc.appcontext.i;

public final class b implements i {

    /* renamed from: a  reason: collision with root package name */
    private AwemeHostApplication f66759a;

    static {
        Covode.recordClassIndex(41091);
    }

    @Override // com.bytedance.ies.ugc.appcontext.i
    public final Application a() {
        return this.f66759a;
    }

    @Override // com.bytedance.ies.ugc.appcontext.i
    public final Activity b() {
        return f.j();
    }

    @Override // com.bytedance.ies.ugc.appcontext.i
    public final Resources c() {
        return this.f66759a.getResources();
    }

    public b(AwemeHostApplication awemeHostApplication) {
        this.f66759a = awemeHostApplication;
    }
}
