package com.ss.android.ugc.aweme.im.sdk.chat.ui.a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.b.g;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class a extends RecyclerView.a<com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a> implements g.a {

    /* renamed from: a  reason: collision with root package name */
    protected RecyclerView f101100a;

    /* renamed from: b  reason: collision with root package name */
    public List<ai> f101101b;

    /* renamed from: c  reason: collision with root package name */
    protected Set<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> f101102c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private List<com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a> f101103d = new ArrayList();

    static {
        Covode.recordClassIndex(64680);
    }

    a() {
    }

    /* access modifiers changed from: protected */
    public final void d() {
        for (com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a aVar : this.f101103d) {
            aVar.f();
        }
        this.f101103d.clear();
    }

    public void a(com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar) {
        this.f101102c.add(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f101100a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f101100a = null;
    }

    /* renamed from: b */
    public void onViewDetachedFromWindow(com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a aVar) {
        super.onViewDetachedFromWindow(aVar);
        this.f101103d.remove(aVar);
        aVar.f();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.g.a
    public void a(int i2) {
        for (com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar : this.f101102c) {
            aVar.a(this.f101101b);
        }
        d.f();
    }

    /* renamed from: a */
    public void onViewAttachedToWindow(com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a aVar) {
        super.onViewAttachedToWindow(aVar);
        aVar.e();
        this.f101103d.add(aVar);
        ai aiVar = aVar.s;
        if (!(aiVar == null || b.a((Collection) this.f101101b) || !aiVar.equals(this.f101101b.get(0)))) {
            for (com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar2 : this.f101102c) {
                aVar2.e();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.g.a
    public void a(Object obj, int i2) {
        for (com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar : this.f101102c) {
            aVar.a(this.f101101b);
        }
    }
}
