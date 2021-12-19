package com.ss.android.ugc.aweme.emoji.emojiPageV2;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class g extends a<com.ss.android.ugc.aweme.emoji.b.a> {

    /* renamed from: g  reason: collision with root package name */
    public final m f89181g;

    /* renamed from: h  reason: collision with root package name */
    private final float f89182h = 16.0f;

    /* renamed from: i  reason: collision with root package name */
    private final float f89183i = 4.0f;

    /* renamed from: j  reason: collision with root package name */
    private final float f89184j = 8.0f;

    /* renamed from: k  reason: collision with root package name */
    private final int f89185k = ((int) n.b(((a) this).f89130d, 8.0f));
    private final int w = ((int) n.b(((a) this).f89130d, 16.0f));
    private final int x = ((int) n.b(((a) this).f89130d, 4.0f));

    static {
        Covode.recordClassIndex(56071);
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.a
    public final int m() {
        return R.layout.ys;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(m mVar) {
        super(mVar);
        l.d(mVar, "");
        this.f89181g = mVar;
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.a
    public final void a(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i2 = this.w;
        int i3 = this.x;
        ((RelativeLayout.LayoutParams) layoutParams).setMargins(i2, i3, i2, i3);
        WrapStaggeredGridLayoutManager wrapStaggeredGridLayoutManager = new WrapStaggeredGridLayoutManager(((a) this).f89129c);
        recyclerView.setLayoutManager(wrapStaggeredGridLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.a(new a(wrapStaggeredGridLayoutManager, recyclerView));
        recyclerView.b(new f(((a) this).f89129c, this.f89185k));
        recyclerView.setAdapter(this);
    }

    public static final class a extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StaggeredGridLayoutManager f89186a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecyclerView f89187b;

        static {
            Covode.recordClassIndex(56072);
        }

        a(StaggeredGridLayoutManager staggeredGridLayoutManager, RecyclerView recyclerView) {
            this.f89186a = staggeredGridLayoutManager;
            this.f89187b = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            if (i2 == 0) {
                int[] a2 = this.f89186a.a((int[]) null);
                if (a2[0] <= 1 && a2[1] <= 1) {
                    this.f89186a.k();
                    this.f89187b.o();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.a
    public final void a(a<com.ss.android.ugc.aweme.emoji.b.a>.b bVar, int i2) {
        com.facebook.drawee.f.a aVar;
        if (e() != null && e().size() > 0 && bVar != null) {
            RemoteImageView remoteImageView = bVar.f89133a;
            if (!(remoteImageView == null || (aVar = (com.facebook.drawee.f.a) remoteImageView.getHierarchy()) == null)) {
                aVar.c(R.color.f159926j);
            }
            Object obj = e().get(i2);
            l.b(obj, "");
            com.ss.android.ugc.aweme.emoji.b.a aVar2 = (com.ss.android.ugc.aweme.emoji.b.a) obj;
            com.ss.android.ugc.aweme.emoji.g.a aVar3 = aVar2.f89106d;
            l.b(aVar3, "");
            if (aVar3.getStickerType() == 10 && bVar.f89133a != null) {
                if (aVar2.f89103a == 2131231993) {
                    a(bVar.f89133a, ((a) this).f89130d, aVar2.f89103a);
                    bVar.f89133a.setContentDescription(((a) this).f89130d.getString(R.string.bmp));
                    return;
                }
                a(bVar.f89133a, aVar2);
                bVar.f89133a.setContentDescription(((a) this).f89130d.getString(R.string.bmo));
            }
        }
    }
}
