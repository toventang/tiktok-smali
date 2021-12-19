package com.ss.android.ugc.aweme.emoji.emojiPageV2;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.b.a;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class e extends a<a> {

    /* renamed from: g  reason: collision with root package name */
    public final m f89174g;

    /* renamed from: h  reason: collision with root package name */
    private final float f89175h = 16.0f;

    /* renamed from: i  reason: collision with root package name */
    private final float f89176i = 12.0f;

    /* renamed from: j  reason: collision with root package name */
    private final float f89177j = 64.0f;

    /* renamed from: k  reason: collision with root package name */
    private final float f89178k = 8.0f;
    private final int w = ((int) n.b(((a) this).f89130d, 16.0f));
    private final int x = ((int) n.b(((a) this).f89130d, 12.0f));
    private final int y = ((int) n.b(((a) this).f89130d, 64.0f));
    private final int z = ((int) n.b(((a) this).f89130d, 8.0f));

    static {
        Covode.recordClassIndex(56069);
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.a
    public final int m() {
        return R.layout.yj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(m mVar) {
        super(mVar);
        l.d(mVar, "");
        this.f89174g = mVar;
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.a
    public final void a(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i2 = this.w;
        ((RelativeLayout.LayoutParams) layoutParams).setMargins(i2, 0, i2, 0);
        recyclerView.setLayoutManager(new WrapGridLayoutManager(((a) this).f89128b, 1));
        recyclerView.b(new b(((a) this).f89128b, a(this.y, this.w, ((a) this).f89129c), this.z));
        recyclerView.setAdapter(this);
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.a
    public final void a(a<a>.b bVar, int i2) {
        if (e() != null && e().size() > 0 && bVar != null) {
            Object obj = e().get(i2);
            l.b(obj, "");
            a aVar = (a) obj;
            com.ss.android.ugc.aweme.emoji.g.a aVar2 = aVar.f89106d;
            l.b(aVar2, "");
            if (aVar2.getStickerType() == 2 && bVar.f89133a != null) {
                if (aVar.f89103a == 2131231984) {
                    a(bVar.f89133a, ((a) this).f89130d, aVar.f89103a);
                } else {
                    b(bVar.f89133a, aVar);
                }
                bVar.f89133a.setContentDescription(((a) this).f89130d.getString(R.string.bmq));
            }
        }
    }
}
