package com.ss.android.ugc.aweme.shortvideo.editcut.b.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.scene.group.b;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.aw;
import com.ss.android.ugc.aweme.shortvideo.editcut.b.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.reflect.Type;

public final class q extends aw implements d {

    /* renamed from: i  reason: collision with root package name */
    public static final a f128195i = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    private final String f128196j = "EditCutVideoSpeedScene";

    /* renamed from: k  reason: collision with root package name */
    private final f f128197k;

    /* renamed from: l  reason: collision with root package name */
    private final b f128198l;
    private final int t = R.id.b5d;

    static {
        Covode.recordClassIndex(84021);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.aw
    public final void b() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84022);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.b.d
    public final String a() {
        return this.f128196j;
    }

    public final void C() {
        if (this.f128198l.g(this)) {
            this.f128198l.c(this);
        }
    }

    public final void d() {
        if (!this.f128198l.f(this)) {
            this.f128198l.a(this.t, this, this.f128196j);
        }
        if (!this.f128198l.g(this)) {
            this.f128198l.e(this);
        }
    }

    @Override // com.bytedance.scene.j, com.ss.android.ugc.aweme.shortvideo.cut.scene.aw
    public final void a(Bundle bundle) {
        super.a(bundle);
        a((CutMultiVideoViewModel) this.f128197k.a((Type) CutMultiVideoViewModel.class, (String) null));
        a((CutVideoSpeedViewModel) this.f128197k.a((Type) CutVideoSpeedViewModel.class, (String) null));
    }

    public q(f fVar, b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f128197k = fVar;
        this.f128198l = bVar;
    }
}
