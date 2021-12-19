package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e.c;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.List;

public final class a extends t<com.ss.android.ugc.aweme.im.service.k.a, RecyclerView.ViewHolder> {

    /* renamed from: c  reason: collision with root package name */
    public static final int f102098c = ((int) n.b(d.a(), 8.0f));

    /* renamed from: d  reason: collision with root package name */
    public static final int f102099d = ((int) n.b(d.a(), 72.0f));

    /* renamed from: e  reason: collision with root package name */
    public static final C2554a f102100e = new C2554a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final List<c> f102101b = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.chatlist.controller.a.a f102102f;

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.b.a$a  reason: collision with other inner class name */
    public static final class C2554a {
        static {
            Covode.recordClassIndex(65332);
        }

        private C2554a() {
        }

        public /* synthetic */ C2554a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(65331);
    }

    public final synchronized boolean a() {
        MethodCollector.i(6677);
        if (this.f4207a.f4004f.isEmpty() || (this.f4207a.f4004f.size() == 1 && (this.f4207a.f4004f.get(0) instanceof com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.b))) {
            MethodCollector.o(6677);
            return true;
        }
        MethodCollector.o(6677);
        return false;
    }

    public static final class b extends m implements h.f.a.b<c, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f102103a = new b();

        static {
            Covode.recordClassIndex(65333);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(c cVar) {
            l.d(cVar, "");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(com.ss.android.ugc.aweme.im.sdk.chatlist.controller.a.a aVar) {
        super(new com.ss.android.ugc.aweme.im.sdk.chatlist.ui.c.a());
        l.d(aVar, "");
        this.f102102f = aVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (this.f4207a.f4004f.get(i2) instanceof com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.b) {
            return 10005;
        }
        if (i2 != 0) {
            return 10002;
        }
        return 10003;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof c) {
            ((c) viewHolder).b();
            this.f102101b.add(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof c) {
            ((c) viewHolder).c();
            this.f102101b.remove(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (viewHolder instanceof c) {
            ((c) viewHolder).a((com.ss.android.ugc.aweme.im.service.k.a) a(i2));
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(6656);
        l.d(viewGroup, "");
        if (i2 == 10003) {
            com.ss.android.ugc.aweme.im.sdk.chatlist.controller.a.a aVar2 = aVar.f102102f;
            l.d(viewGroup, "");
            l.d(aVar2, "");
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6s, viewGroup, false);
            l.b(a3, "");
            viewHolder = new com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e.b(a3, aVar2);
        } else if (i2 != 10005) {
            viewHolder = new c(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6r, viewGroup, false), aVar.f102102f);
        } else {
            View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6p, viewGroup, false);
            l.b(a4, "");
            viewHolder = new com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e.a(a4);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(6656);
        return viewHolder;
    }
}
