package com.bytedance.android.livesdk.chatroom.a.b;

import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.barrage.view.BarrageLayout;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public final class a extends com.bytedance.android.livesdk.model.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0319a f14886a = new C0319a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    private final ArrayList<b> f14887j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private final Random f14888k = new Random();

    /* renamed from: l  reason: collision with root package name */
    private float f14889l = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    private final BarrageLayout f14890m;
    private final int n;

    static {
        Covode.recordClassIndex(8252);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.a.b.a$a  reason: collision with other inner class name */
    public static final class C0319a {
        static {
            Covode.recordClassIndex(8253);
        }

        private C0319a() {
        }

        public /* synthetic */ C0319a(byte b2) {
            this();
        }
    }

    @Override // com.ss.ugc.live.barrage.b.a
    public final void a() {
        d();
        Iterator<T> it = this.f14887j.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        super.a();
    }

    @Override // com.ss.ugc.live.barrage.b.a
    public final int b() {
        int b2 = super.b();
        Iterator<T> it = this.f14887j.iterator();
        while (it.hasNext()) {
            b2 += it.next().b();
        }
        return b2;
    }

    @Override // com.ss.ugc.live.barrage.b.a
    public final void a(com.ss.ugc.live.barrage.a.a aVar) {
        l.d(aVar, "");
        c();
    }

    @Override // com.bytedance.android.livesdk.model.a
    public final void a(Path path) {
        l.d(path, "");
        b bVar = new b(this.f14890m, path, this.n);
        this.f14887j.add(bVar);
        BarrageLayout.a(this.f14890m, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(BarrageLayout barrageLayout, int i2) {
        super(barrageLayout);
        l.d(barrageLayout, "");
        this.f14890m = barrageLayout;
        this.n = i2;
    }

    @Override // com.ss.ugc.live.barrage.b.a
    public final void a(com.ss.ugc.live.barrage.a aVar, float f2) {
        l.d(aVar, "");
        float f3 = this.f14889l + (f2 / ((float) this.n));
        this.f14889l = f3;
        if (f3 > 0.32f) {
            com.ss.ugc.live.barrage.a.a e2 = e();
            if (e2 != null) {
                this.f14887j.get(this.f14888k.nextInt(this.f14887j.size())).a(e2, false);
            }
            this.f14889l = 0.0f;
        }
    }
}
