package com.ss.android.ugc.aweme.autoplay.d;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.autoplay.player.video.SearchVideoView;
import com.ss.android.ugc.aweme.autoplay.player.video.c;
import com.ss.android.ugc.aweme.flowfeed.a.b;
import com.ss.android.ugc.aweme.flowfeed.utils.g;
import com.ss.android.ugc.aweme.utils.gp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public abstract class k extends RecyclerView.ViewHolder implements c {

    /* renamed from: a  reason: collision with root package name */
    private final h f67428a;

    /* renamed from: i  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.flowfeed.a.a f67429i;

    /* renamed from: j  reason: collision with root package name */
    public final g f67430j;

    /* renamed from: k  reason: collision with root package name */
    public b f67431k;

    static {
        Covode.recordClassIndex(41518);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void i() {
    }

    public abstract ImageView j();

    public abstract SearchVideoView l();

    public c m() {
        return (c) this.f67428a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void e() {
        m().e();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void f() {
        m().f();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void g() {
        m().g();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.c
    public final c b() {
        return m().b();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.c
    public final n c() {
        return m().c();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.c
    public final b.a d() {
        return m().d();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final boolean h() {
        return m().h();
    }

    static final class a extends m implements h.f.a.a<j> {
        final /* synthetic */ View $itemView;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(41519);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k kVar, View view) {
            super(0);
            this.this$0 = kVar;
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j invoke() {
            return new j(this.this$0.l(), this.this$0.j(), this.this$0.f67429i, this.this$0.f67430j, this.this$0.f67431k, this.$itemView);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void a(long j2) {
        m().a(j2);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.c
    public final void a(b.a aVar) {
        m().a(aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(View view, com.ss.android.ugc.aweme.flowfeed.a.a aVar, g gVar, com.ss.android.ugc.aweme.flowfeed.a.b bVar) {
        super(view);
        l.d(view, "");
        l.d(aVar, "");
        l.d(gVar, "");
        l.d(bVar, "");
        this.f67429i = aVar;
        this.f67430j = gVar;
        this.f67431k = bVar;
        this.f67428a = i.a((h.f.a.a) new a(this, view));
        if (Build.VERSION.SDK_INT >= 21) {
            view.setOutlineProvider(new gp(view.getResources().getDimensionPixelOffset(R.dimen.rw)));
            view.setClipToOutline(true);
        }
    }
}
