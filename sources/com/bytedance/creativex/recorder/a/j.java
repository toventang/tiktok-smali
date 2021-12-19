package com.bytedance.creativex.recorder.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.effect.a;
import com.ss.android.ugc.asve.recorder.effect.composer.c;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.tools.beauty.service.d;
import h.f.b.l;
import java.util.List;

public final class j implements d {

    /* renamed from: a  reason: collision with root package name */
    private int f28140a;

    /* renamed from: b  reason: collision with root package name */
    private int f28141b;

    /* renamed from: c  reason: collision with root package name */
    private int f28142c;

    /* renamed from: d  reason: collision with root package name */
    private int f28143d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f28144e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f28145f = true;

    /* renamed from: g  reason: collision with root package name */
    private final a f28146g;

    static {
        Covode.recordClassIndex(16481);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final void b(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final void o() {
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final int k() {
        return this.f28140a;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final int l() {
        return this.f28142c;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final int m() {
        return this.f28141b;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final int n() {
        return this.f28143d;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final void e(boolean z) {
        this.f28144e = z;
        this.f28145f = z;
    }

    public j(a aVar) {
        l.d(aVar, "");
        this.f28146g = aVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final void a(List<BeautyComposerInfo> list, int i2) {
        l.d(list, "");
        this.f28146g.b(h.a(list), i2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final void b(List<BeautyComposerInfo> list, int i2) {
        l.d(list, "");
        this.f28146g.c(h.a(list), i2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final void c(List<BeautyComposerInfo> list, int i2) {
        l.d(list, "");
        this.f28146g.a(h.a(list), i2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final int[] a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return this.f28146g.c(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final void a(String str, String str2, float f2) {
        l.d(str, "");
        l.d(str2, "");
        c g2 = this.f28146g.g();
        g2.a(str, str2, f2);
        g2.a();
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final void a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2, int i2) {
        l.d(list, "");
        l.d(list2, "");
        this.f28146g.a(h.a(list), h.a(list2), i2);
    }
}
