package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.d.d;
import com.ss.android.ugc.aweme.feed.adapter.ax;
import com.ss.android.ugc.aweme.feed.experiment.aj;
import com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.widget.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class aw extends f<UserWithAweme> implements ax.a, ax.b {

    /* renamed from: a  reason: collision with root package name */
    public String f91612a = "";

    /* renamed from: b  reason: collision with root package name */
    public d<ax> f91613b;

    /* renamed from: c  reason: collision with root package name */
    public h.b f91614c;

    /* renamed from: d  reason: collision with root package name */
    private int f91615d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f91616e = -1;

    /* renamed from: f  reason: collision with root package name */
    private final GalleryLayoutManager f91617f;

    static {
        Covode.recordClassIndex(57702);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ax.b
    public final void a(int i2) {
        this.f91617f.a(i2 + 1);
    }

    public aw(GalleryLayoutManager galleryLayoutManager) {
        l.d(galleryLayoutManager, "");
        this.f91617f = galleryLayoutManager;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ax.a
    public final void a(User user, int i2) {
        l.d(user, "");
        GalleryLayoutManager galleryLayoutManager = this.f91617f;
        if (galleryLayoutManager.f93214b >= 0 && galleryLayoutManager.f93214b == i2 && galleryLayoutManager.f93223k != null && !galleryLayoutManager.f93223k.n()) {
            e().remove(this.f91617f.f93214b);
            notifyItemRemoved(this.f91617f.f93214b);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        View a2 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bji, viewGroup, false);
        l.b(a2, "");
        Context context = viewGroup.getContext();
        l.b(context, "");
        if (aj.a()) {
            if (this.f91616e == -1 || this.f91615d == -1) {
                int a3 = (int) (((float) n.a(context)) * 0.712f);
                this.f91616e = a3;
                this.f91615d = (int) (((float) a3) * 1.34f);
            }
            ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f91616e;
                layoutParams.height = this.f91615d;
            } else {
                layoutParams = new RecyclerView.j(this.f91616e, this.f91615d);
            }
            a2.setLayoutParams(layoutParams);
        }
        return new ax(a2, this, this, this.f91617f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009c, code lost:
        if (r0 == null) goto L_0x001a;
     */
    @Override // com.ss.android.ugc.aweme.common.a.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.recyclerview.widget.RecyclerView.ViewHolder r6, int r7) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.aw.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }
}
