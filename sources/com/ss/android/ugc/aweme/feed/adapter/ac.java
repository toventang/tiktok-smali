package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.e.l;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import h.f.a.b;
import h.f.b.m;

public final class ac extends z {
    static {
        Covode.recordClassIndex(57674);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.b, com.ss.android.ugc.aweme.feed.adapter.z
    public final String b() {
        return "follow_feed";
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.b, com.ss.android.ugc.aweme.feed.adapter.z
    public final ch a() {
        return new u(a.f91591a);
    }

    static final class a extends m implements b<cf, ce> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f91591a = new a();

        static {
            Covode.recordClassIndex(57675);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ce invoke(cf cfVar) {
            return new FollowLiveVideoViewHolder(cfVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ac(Context context, LayoutInflater layoutInflater, s<ag> sVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, l lVar) {
        super(context, layoutInflater, sVar, fragment, onTouchListener, baseFeedPageParams, lVar);
        h.f.b.l.d(context, "");
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(sVar, "");
        h.f.b.l.d(fragment, "");
        h.f.b.l.d(onTouchListener, "");
        h.f.b.l.d(baseFeedPageParams, "");
        h.f.b.l.d(lVar, "");
    }
}
