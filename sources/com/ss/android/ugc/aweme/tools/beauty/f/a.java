package com.ss.android.ugc.aweme.tools.beauty.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.tools.beauty.service.d;
import com.ss.android.ugc.aweme.tools.beauty.service.f;
import h.f.b.l;
import java.util.List;

public class a implements f.a {

    /* renamed from: b  reason: collision with root package name */
    public final d f138934b;

    static {
        Covode.recordClassIndex(90850);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.a
    public void a() {
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.a
    public void b() {
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.a
    public final void a(boolean z) {
        this.f138934b.b(z);
    }

    public a(d dVar) {
        l.d(dVar, "");
        this.f138934b = dVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.a
    public final void a(List<BeautyComposerInfo> list, int i2) {
        l.d(list, "");
        this.f138934b.c(list, i2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.a
    public final int[] a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return this.f138934b.a(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.a
    public final void a(String str, String str2, float f2) {
        l.d(str, "");
        l.d(str2, "");
        this.f138934b.a(str, str2, f2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.a
    public final void a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2, int i2) {
        l.d(list, "");
        l.d(list2, "");
        this.f138934b.a(list, list2, i2);
    }
}
