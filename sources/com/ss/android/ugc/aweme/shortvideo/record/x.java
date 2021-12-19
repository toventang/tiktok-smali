package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEListener;
import java.io.File;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class x implements VEListener.j {

    /* renamed from: a  reason: collision with root package name */
    private final u f130184a;

    /* renamed from: b  reason: collision with root package name */
    private final List f130185b;

    /* renamed from: c  reason: collision with root package name */
    private final File f130186c;

    static {
        Covode.recordClassIndex(85396);
    }

    x(u uVar, List list, File file) {
        this.f130184a = uVar;
        this.f130185b = list;
        this.f130186c = file;
    }

    @Override // com.ss.android.vesdk.VEListener.j
    public final void a(int i2) {
        this.f130184a.a(this.f130185b, this.f130186c, i2);
    }
}
