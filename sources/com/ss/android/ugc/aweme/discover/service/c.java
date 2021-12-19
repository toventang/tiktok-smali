package com.ss.android.ugc.aweme.discover.service;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f82055a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(51066);
    }

    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView f82056a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f82057b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f82058c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f82059d;

        static {
            Covode.recordClassIndex(51067);
        }

        public final void onViewAttachedToWindow(View view) {
            RecyclerView.i layoutManager;
            RecyclerView.a adapter;
            int[] iArr = new int[2];
            RecyclerView recyclerView = this.f82056a;
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null || !(adapter instanceof b))) {
                iArr = ((b) adapter).f82052b;
            }
            RecyclerView recyclerView2 = this.f82056a;
            if (recyclerView2 != null && (layoutManager = recyclerView2.getLayoutManager()) != null && (layoutManager instanceof LinearLayoutManager)) {
                ((LinearLayoutManager) layoutManager).a(iArr[0], iArr[1]);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
            if (r8 == r6) goto L_0x0064;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onViewDetachedFromWindow(android.view.View r12) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.service.c.a.onViewDetachedFromWindow(android.view.View):void");
        }

        a(RecyclerView recyclerView, Context context, View.OnClickListener onClickListener, List list) {
            this.f82056a = recyclerView;
            this.f82057b = context;
            this.f82058c = onClickListener;
            this.f82059d = list;
        }
    }
}
