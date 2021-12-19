package com.ss.android.ugc.aweme.emoji.emojiPageV2;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.b.a;
import com.ss.android.ugc.aweme.emoji.i.b.b;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class i extends a<a> {

    /* renamed from: g  reason: collision with root package name */
    public final m f89193g;

    /* renamed from: h  reason: collision with root package name */
    private final float f89194h = 14.0f;

    /* renamed from: i  reason: collision with root package name */
    private final float f89195i = 12.0f;

    /* renamed from: j  reason: collision with root package name */
    private final float f89196j = 24.0f;

    /* renamed from: k  reason: collision with root package name */
    private final float f89197k = 29.0f;
    private final int w = ((int) n.b(((a) this).f89130d, 14.0f));
    private final int x = ((int) n.b(((a) this).f89130d, 12.0f));
    private final int y = ((int) n.b(((a) this).f89130d, 24.0f));
    private final int z = ((int) n.b(((a) this).f89130d, 29.0f));

    static {
        Covode.recordClassIndex(56074);
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.a
    public final int m() {
        return R.layout.yp;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(m mVar) {
        super(mVar);
        l.d(mVar, "");
        this.f89193g = mVar;
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.a
    public final void a(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i2 = this.w;
        ((RelativeLayout.LayoutParams) layoutParams).setMargins(i2, 0, i2, 0);
        recyclerView.setLayoutManager(new WrapGridLayoutManager(((a) this).f89127a, 1));
        recyclerView.b(new b(((a) this).f89127a, a(this.z, this.w, ((a) this).f89127a), this.y));
        recyclerView.setAdapter(this);
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.a
    public final void a(a<a>.b bVar, int i2) {
        if (e() != null && e().size() > 0 && bVar != null) {
            Object obj = e().get(i2);
            l.b(obj, "");
            a aVar = (a) obj;
            if ((!TextUtils.isEmpty(aVar.f89105c) || aVar.f89103a > 0 || !TextUtils.isEmpty(aVar.f89104b)) && bVar.f89133a != null) {
                bVar.f89133a.setVisibility(0);
                b.a(bVar.f89133a, aVar);
                bVar.f89133a.setContentDescription(((a) this).f89130d.getString(R.string.bmn, aVar.f89105c));
            }
        }
    }
}
