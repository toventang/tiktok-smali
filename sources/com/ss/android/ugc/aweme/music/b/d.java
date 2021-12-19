package com.ss.android.ugc.aweme.music.b;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.c;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.music.b.a.b;
import java.util.List;

public final class d extends h {

    /* renamed from: a  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.music.b.b.a> f111319a;

    /* renamed from: b  reason: collision with root package name */
    int f111320b;

    /* renamed from: c  reason: collision with root package name */
    RecyclerView f111321c;

    /* renamed from: d  reason: collision with root package name */
    private c<List<com.ss.android.ugc.aweme.music.b.b.a>> f111322d;

    /* renamed from: e  reason: collision with root package name */
    private b f111323e;

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.ugc.aweme.music.b.a.a f111324f;

    static {
        Covode.recordClassIndex(71536);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c() {
        return this.f111319a.size();
    }

    public enum a {
        BtnConfirmAndShoot,
        BtnConfirm;

        static {
            Covode.recordClassIndex(71537);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        c<List<com.ss.android.ugc.aweme.music.b.b.a>> cVar = this.f111322d;
        if (cVar != null) {
            cVar.a();
        }
        this.f111321c = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        c<List<com.ss.android.ugc.aweme.music.b.b.a>> cVar = this.f111322d;
        if (cVar != null) {
            cVar.b();
        }
        this.f111321c = null;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        if (this.f111319a.size() > i2) {
            return this.f111322d.a(this.f111319a, i2);
        }
        return super.c(i2);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        return this.f111322d.a(viewGroup, i2);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        com.ss.android.ugc.aweme.music.b.a.a aVar = this.f111324f;
        if (aVar != null) {
            aVar.f111297c = this.f111320b;
        }
        b bVar = this.f111323e;
        if (bVar != null) {
            bVar.f111305c = this.f111320b;
        }
        this.f111322d.a(this.f111319a, i2, viewHolder);
    }
}
