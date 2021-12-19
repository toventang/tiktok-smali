package com.ss.android.ugc.aweme.emoji.sysemoji;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.emojiPageV2.SwipeControlledRecycleView;
import com.ss.android.ugc.aweme.emoji.emojiPageV2.b;
import com.ss.android.ugc.aweme.emoji.sysemoji.c;
import com.ss.android.ugc.aweme.emoji.sysemoji.g;
import com.ss.android.ugc.aweme.emoji.sysemoji.h;
import com.ss.android.ugc.aweme.emoji.utils.d;
import com.ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class p extends com.ss.android.ugc.aweme.emoji.emojiPageV2.a<com.ss.android.ugc.aweme.emoji.b.a> implements c.b {

    /* renamed from: g  reason: collision with root package name */
    public final m f89410g;

    /* renamed from: h  reason: collision with root package name */
    public final SwipeControlledRecycleView f89411h;

    /* renamed from: i  reason: collision with root package name */
    public final SwipeControlledViewPager f89412i;

    /* renamed from: j  reason: collision with root package name */
    private final float f89413j = 14.0f;

    /* renamed from: k  reason: collision with root package name */
    private final float f89414k = 24.0f;
    private final float w = 29.0f;
    private final int x = ((int) n.b(((com.ss.android.ugc.aweme.emoji.emojiPageV2.a) this).f89130d, 14.0f));
    private final int y = ((int) n.b(((com.ss.android.ugc.aweme.emoji.emojiPageV2.a) this).f89130d, 24.0f));
    private final int z = ((int) n.b(((com.ss.android.ugc.aweme.emoji.emojiPageV2.a) this).f89130d, 29.0f));

    static {
        Covode.recordClassIndex(56181);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        return (long) i2;
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.a
    public final int m() {
        return R.layout.yr;
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.a
    public final void a(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        Context context = recyclerView.getContext();
        while (!(context instanceof Activity)) {
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return;
            }
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            int i2 = this.x;
            ((RelativeLayout.LayoutParams) layoutParams).setMargins(i2, 0, i2, 0);
            recyclerView.setLayoutManager(new WrapGridLayoutManager(((com.ss.android.ugc.aweme.emoji.emojiPageV2.a) this).f89127a));
            c cVar = new c(activity, this.f89411h);
            l.d(this, "");
            cVar.f89364a = this;
            recyclerView.b(new b(((com.ss.android.ugc.aweme.emoji.emojiPageV2.a) this).f89127a, a(this.z, this.x, ((com.ss.android.ugc.aweme.emoji.emojiPageV2.a) this).f89127a), this.y));
            recyclerView.setAdapter(this);
            SwipeControlledViewPager swipeControlledViewPager = this.f89412i;
            List e2 = e();
            l.b(e2, "");
            recyclerView.a(new d(cVar, swipeControlledViewPager, e2, this.z));
            recyclerView.setItemViewCacheSize(14);
            recyclerView.setHasFixedSize(true);
        }
    }

    public final class a extends com.ss.android.ugc.aweme.emoji.emojiPageV2.a<com.ss.android.ugc.aweme.emoji.b.a>.b {

        /* renamed from: d  reason: collision with root package name */
        public final TextView f89415d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f89416e;

        static {
            Covode.recordClassIndex(56182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p pVar, View view) {
            super(pVar, view);
            l.d(view, "");
            this.f89416e = pVar;
            this.f89415d = (TextView) view.findViewById(R.id.avi);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.emoji.emojiPageV2.a
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        View a2 = com.a.a(LayoutInflater.from(((com.ss.android.ugc.aweme.emoji.emojiPageV2.a) this).f89130d), R.layout.yr, viewGroup, false);
        l.b(a2, "");
        return new a(this, a2);
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.a
    public final void a(com.ss.android.ugc.aweme.emoji.emojiPageV2.a<com.ss.android.ugc.aweme.emoji.b.a>.b bVar, int i2) {
        List e2 = e();
        if (e2 != null && !e2.isEmpty() && bVar != null) {
            Object obj = e().get(i2);
            l.b(obj, "");
            com.ss.android.ugc.aweme.emoji.b.a aVar = (com.ss.android.ugc.aweme.emoji.b.a) obj;
            if (!TextUtils.isEmpty(aVar.f89105c)) {
                a aVar2 = (a) bVar;
                if (aVar2.f89415d != null) {
                    com.ss.android.ugc.aweme.emoji.g.a aVar3 = aVar.f89106d;
                    Objects.requireNonNull(aVar3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel");
                    i iVar = (i) aVar3;
                    iVar.setPosition(i2);
                    aVar2.f89415d.setText(iVar.getPreviewEmoji());
                    aVar2.f89415d.setContentDescription(((com.ss.android.ugc.aweme.emoji.emojiPageV2.a) this).f89130d.getString(R.string.bmn, aVar.f89105c));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.emoji.sysemoji.c.b
    public final void a(i iVar, String str) {
        l.d(iVar, "");
        l.d(str, "");
        iVar.getPosition();
        Object obj = e().get(iVar.getPosition());
        l.b(obj, "");
        com.ss.android.ugc.aweme.emoji.g.a aVar = ((com.ss.android.ugc.aweme.emoji.b.a) obj).f89106d;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel");
        ((i) aVar).setPreviewEmoji(str);
        l().a(str);
        notifyItemChanged(iVar.getPosition());
        g.a.a();
        List<i> a2 = q.a(e());
        l.b(a2, "");
        l.d(a2, "");
        l.d(a2, "");
        d a3 = d.a();
        l.b(a3, "");
        String d2 = a3.d();
        if (d2 != null && d2.length() != 0) {
            bz unused = i.a(h.f89391a, null, null, new h.f(d2, 1, a2, null), 3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(m mVar, SwipeControlledRecycleView swipeControlledRecycleView, SwipeControlledViewPager swipeControlledViewPager) {
        super(mVar);
        l.d(mVar, "");
        l.d(swipeControlledRecycleView, "");
        l.d(swipeControlledViewPager, "");
        this.f89410g = mVar;
        this.f89411h = swipeControlledRecycleView;
        this.f89412i = swipeControlledViewPager;
    }
}
