package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.h.v;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ab.d;
import com.ss.android.ugc.aweme.feed.ab.f;
import com.ss.android.ugc.aweme.feed.adapter.h;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import java.util.LinkedList;

public class z extends b {
    public int o = -1;
    public h p = new h();
    final k q;
    private final int v = 1;

    static {
        Covode.recordClassIndex(57839);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.b
    public String b() {
        return "full_feed";
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f91896a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f91897b;

        static {
            Covode.recordClassIndex(57841);
        }

        b(z zVar, ViewGroup viewGroup) {
            this.f91896a = zVar;
            this.f91897b = viewGroup;
        }

        public final void run() {
            this.f91896a.a(this.f91897b);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.b
    public ch a() {
        return new ch(new a(this));
    }

    static final class a extends m implements h.f.a.b<cf, ce> {
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(57840);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(z zVar) {
            super(1);
            this.this$0 = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ce invoke(cf cfVar) {
            cf cfVar2 = cfVar;
            l.d(cfVar2, "");
            l.d(cfVar2, "");
            return new FullFeedVideoViewHolder(cfVar2);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.b, androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        l.d(obj, "");
        aj d2 = d((View) obj);
        if (!(d2 == null || d2.b() == null)) {
            Aweme b2 = d2.b();
            l.b(b2, "");
            if (b2.isLiveNoDeduplicate() && f.a()) {
                int count = getCount();
                for (int i2 = 0; i2 < count; i2++) {
                    String uniqueId = e().get(i2).getUniqueId();
                    Aweme b3 = d2.b();
                    l.b(b3, "");
                    if (l.a((Object) uniqueId, (Object) b3.getUniqueId())) {
                        return i2;
                    }
                }
                return -2;
            }
        }
        return super.getItemPosition(obj);
    }

    public final void a(ViewGroup viewGroup) {
        int i2;
        int i3;
        Aweme d2;
        int b2;
        View poll;
        if (viewGroup != null && v.y(viewGroup) && this.f91659i != null && this.f91659i.getActivity() != null && (i2 = this.o) >= 0 && i2 < getCount() - 1 && (d2 = d((i3 = this.o + 1))) != null && !this.p.f91805b.containsKey(d2) && (b2 = b(i3)) == 0) {
            LinkedList<View> linkedList = this.p.f91804a.get(b2);
            if (linkedList == null || linkedList.size() <= 0) {
                this.p.a(b2, a(b2, viewGroup));
            }
            LinkedList<View> linkedList2 = this.p.f91804a.get(b2);
            if (linkedList2 != null && linkedList2.size() > 0 && (poll = linkedList2.poll()) != null) {
                a(poll);
                h hVar = this.p;
                String b3 = b();
                aj ajVar = (aj) poll.getTag(R.id.b1q);
                if (ajVar != null) {
                    ajVar.b(b3);
                    ajVar.a(d2, i3);
                    if (hVar.f91805b.size() > 0) {
                        hVar.a();
                    }
                    hVar.f91805b.put(d2, new h.a(poll, i3));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        if (r4 == null) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c  */
    @Override // com.ss.android.ugc.aweme.feed.adapter.b, com.ss.android.ugc.aweme.feed.adapter.ar
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.z.a(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(Context context, LayoutInflater layoutInflater, s<ag> sVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, com.ss.android.ugc.aweme.feed.e.l lVar) {
        super(context, layoutInflater, sVar, fragment, onTouchListener, baseFeedPageParams, lVar);
        l.d(context, "");
        l.d(layoutInflater, "");
        l.d(sVar, "");
        l.d(fragment, "");
        l.d(onTouchListener, "");
        l.d(baseFeedPageParams, "");
        l.d(lVar, "");
        FullFeedPagerAdapter$lifecycleObserver$1 fullFeedPagerAdapter$lifecycleObserver$1 = new FullFeedPagerAdapter$lifecycleObserver$1(this);
        this.q = fullFeedPagerAdapter$lifecycleObserver$1;
        if (d.f91465a) {
            fragment.getLifecycle().a(fullFeedPagerAdapter$lifecycleObserver$1);
        }
    }
}
