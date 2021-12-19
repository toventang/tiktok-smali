package com.google.android.play.core.e;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bg;
import com.google.android.play.core.e.b.a;
import com.google.android.play.core.tasks.d;
import java.io.File;
import java.util.Set;

final class ae implements c {

    /* renamed from: a  reason: collision with root package name */
    private final bg<as> f53225a;

    /* renamed from: b  reason: collision with root package name */
    private final bg<a> f53226b;

    /* renamed from: c  reason: collision with root package name */
    private final bg<File> f53227c;

    static {
        Covode.recordClassIndex(32899);
    }

    ae(bg<as> bgVar, bg<a> bgVar2, bg<File> bgVar3) {
        this.f53225a = bgVar;
        this.f53226b = bgVar2;
        this.f53227c = bgVar3;
    }

    private final c c() {
        return (c) (this.f53227c.a() == null ? this.f53225a : this.f53226b).a();
    }

    @Override // com.google.android.play.core.e.c
    public final d<Void> a(int i2) {
        return c().a(i2);
    }

    @Override // com.google.android.play.core.e.c
    public final d<Integer> a(e eVar) {
        return c().a(eVar);
    }

    @Override // com.google.android.play.core.e.c
    public final Set<String> a() {
        return c().a();
    }

    @Override // com.google.android.play.core.e.c
    public final void a(g gVar) {
        c().a(gVar);
    }

    @Override // com.google.android.play.core.e.c
    public final boolean a(f fVar, Activity activity, int i2) {
        return c().a(fVar, activity, i2);
    }

    @Override // com.google.android.play.core.e.c
    public final d<f> b(int i2) {
        return c().b(i2);
    }

    @Override // com.google.android.play.core.e.c
    public final Set<String> b() {
        return c().b();
    }

    @Override // com.google.android.play.core.e.c
    public final void b(g gVar) {
        c().b(gVar);
    }
}
