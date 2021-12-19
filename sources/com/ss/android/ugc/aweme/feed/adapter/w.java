package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.List;

public final class w extends b {
    private final ArrayList<Aweme> o = new ArrayList<>();

    static {
        Covode.recordClassIndex(57835);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.b
    public final String b() {
        return "forward_feed";
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.b, com.ss.android.ugc.aweme.feed.adapter.ag
    public final List<Aweme> e() {
        return this.o;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.b
    public final ch a() {
        return new ch(a.f91890a);
    }

    static final class a extends m implements b<cf, ce> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f91890a = new a();

        static {
            Covode.recordClassIndex(57836);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ce invoke(cf cfVar) {
            cf cfVar2 = cfVar;
            l.d(cfVar2, "");
            return new ForwardFeedVideoViewHolder(cfVar2);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.b
    public final Aweme d(int i2) {
        if (i2 < 0 || i2 >= getCount()) {
            return null;
        }
        return this.o.get(i2);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.adapter.b
    public final void e(int i2) {
        if (i2 >= 0 && i2 < getCount()) {
            this.o.remove(i2);
            super.e(i2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.adapter.b, com.ss.android.ugc.aweme.feed.adapter.ar
    public final int b(int i2) {
        Aweme c2 = c(i2);
        if (c2 == null || !c2.isForwardAweme() || c2.getForwardItem() == null) {
            return super.b(i2);
        }
        Aweme forwardItem = c2.getForwardItem();
        l.b(forwardItem, "");
        if (forwardItem.getAwemeType() == 2) {
            return 1;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.b, androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        l.d(obj, "");
        aj d2 = d((View) obj);
        int count = getCount();
        for (int i2 = 0; i2 < count; i2++) {
            Aweme d3 = d(i2);
            if (!(d2 == null || d3 == null)) {
                String aid = d3.getAid();
                Aweme P = d2.P();
                l.b(P, "");
                if (com.bytedance.common.utility.m.a(aid, P.getAid())) {
                    return i2;
                }
            }
        }
        return -2;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.b, com.ss.android.ugc.aweme.feed.adapter.ag
    public final void a(List<? extends Aweme> list) {
        this.o.clear();
        ArrayList arrayList = null;
        j.a(this.o, list != null ? n.g((Iterable) list) : null);
        if (list != null) {
            arrayList = new ArrayList();
            for (Aweme aweme : list) {
                if (aweme != null) {
                    if (aweme.isForwardAweme()) {
                        arrayList.add(aweme.getForwardItem());
                    } else {
                        arrayList.add(aweme);
                    }
                }
            }
        }
        super.a(arrayList);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(Context context, LayoutInflater layoutInflater, s<ag> sVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, com.ss.android.ugc.aweme.feed.e.l lVar) {
        super(context, layoutInflater, sVar, fragment, onTouchListener, baseFeedPageParams, lVar);
        l.d(context, "");
        l.d(layoutInflater, "");
        l.d(sVar, "");
        l.d(fragment, "");
        l.d(onTouchListener, "");
        l.d(baseFeedPageParams, "");
        l.d(lVar, "");
    }
}
