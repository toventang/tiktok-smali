package com.ss.android.ugc.aweme.story.feed.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.b;
import com.ss.android.ugc.aweme.feed.adapter.ce;
import com.ss.android.ugc.aweme.feed.adapter.cf;
import com.ss.android.ugc.aweme.feed.adapter.ch;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import h.f.b.l;
import h.f.b.m;

public final class c extends b {
    static {
        Covode.recordClassIndex(90067);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.b
    public final String b() {
        return "story_feed";
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.b
    public final ch a() {
        return new ch(a.f137659a);
    }

    static final class a extends m implements h.f.a.b<cf, ce> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f137659a = new a();

        static {
            Covode.recordClassIndex(90068);
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
            return new StoryVideoViewHolder(cfVar2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, LayoutInflater layoutInflater, s<ag> sVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, com.ss.android.ugc.aweme.feed.e.l lVar) {
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
