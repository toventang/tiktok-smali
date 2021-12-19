package com.ss.android.ugc.aweme.emoji.emojiPageV2;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.emoji.b.a;
import com.ss.android.ugc.aweme.emoji.utils.c;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.File;
import java.util.Objects;

public final class h extends a<a> {

    /* renamed from: g  reason: collision with root package name */
    public final m f89188g;

    /* renamed from: h  reason: collision with root package name */
    private final float f89189h = 16.0f;

    /* renamed from: i  reason: collision with root package name */
    private final float f89190i = 16.0f;

    /* renamed from: j  reason: collision with root package name */
    private final float f89191j = 24.0f;

    /* renamed from: k  reason: collision with root package name */
    private final float f89192k = 60.0f;
    private final int w = ((int) n.b(((a) this).f89130d, 16.0f));
    private final int x = ((int) n.b(((a) this).f89130d, 16.0f));
    private final int y = ((int) n.b(((a) this).f89130d, 60.0f));
    private final int z = ((int) n.b(((a) this).f89130d, 24.0f));

    static {
        Covode.recordClassIndex(56073);
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.a
    public final int m() {
        return R.layout.yj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(m mVar) {
        super(mVar);
        l.d(mVar, "");
        this.f89188g = mVar;
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.a
    public final void a(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i2 = this.w;
        ((RelativeLayout.LayoutParams) layoutParams).setMargins(i2, 0, i2, 0);
        recyclerView.setLayoutManager(new WrapGridLayoutManager(((a) this).f89128b, 1));
        recyclerView.b(new b(((a) this).f89128b, a(this.y, this.w, ((a) this).f89128b), this.z));
        recyclerView.setAdapter(this);
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.a
    public final void a(a<a>.b bVar, int i2) {
        if (e() != null && e().size() > 0 && bVar != null && bVar.f89133a != null) {
            Object obj = e().get(i2);
            l.b(obj, "");
            a aVar = (a) obj;
            String a2 = c.a(aVar.f89106d);
            if (new File(a2).exists()) {
                RemoteImageView remoteImageView = bVar.f89133a;
                l.b(a2, "");
                com.ss.android.ugc.aweme.emoji.g.a aVar2 = aVar.f89106d;
                l.b(aVar2, "");
                a(remoteImageView, a2, com.ss.android.ugc.aweme.emoji.d.a.a.d(aVar2));
            } else {
                a(bVar.f89133a, aVar);
            }
            if (!TextUtils.isEmpty(aVar.f89105c)) {
                bVar.f89133a.setContentDescription(((a) this).f89130d.getString(R.string.bmn, aVar.f89105c));
            }
        }
    }
}
