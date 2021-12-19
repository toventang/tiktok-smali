package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a.a;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a.b;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e.c;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class a extends t<com.ss.android.ugc.aweme.im.service.k.a, RecyclerView.ViewHolder> {

    /* renamed from: d  reason: collision with root package name */
    public static final C2539a f101922d = new C2539a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final SparseArray<com.ss.android.ugc.aweme.inbox.widget.b> f101923b;

    /* renamed from: c  reason: collision with root package name */
    final List<c> f101924c;

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.a f101925e;

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.chatlist.controller.a.a f101926f;

    static {
        Covode.recordClassIndex(65219);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a$a  reason: collision with other inner class name */
    public static final class C2539a {
        static {
            Covode.recordClassIndex(65220);
        }

        private C2539a() {
        }

        public /* synthetic */ C2539a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<c, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f101934a = new b();

        static {
            Covode.recordClassIndex(65221);
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

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        return (long) ((com.ss.android.ugc.aweme.im.service.k.a) a(i2)).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (a(i2) instanceof b) {
            return 0;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof c) {
            ((c) viewHolder).b();
            this.f101924c.add(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof c) {
            ((c) viewHolder).c();
            this.f101924c.remove(viewHolder);
        }
    }

    public /* synthetic */ a(com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.a aVar, com.ss.android.ugc.aweme.im.sdk.chatlist.controller.a.a aVar2) {
        this(aVar, aVar2, new com.ss.android.ugc.aweme.im.sdk.chatlist.ui.c.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (viewHolder instanceof c) {
            ((c) viewHolder).a((com.ss.android.ugc.aweme.im.service.k.a) a(i2));
        } else if (viewHolder instanceof com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a.a) {
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a.a aVar = (com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a.a) viewHolder;
            Object a2 = a(i2);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.showprevious.ShowPreviousMessageSession");
            b bVar = (b) a2;
            l.d(bVar, "");
            aVar.itemView.setOnClickListener(new a.b(aVar, bVar));
            if (bVar.q > 0) {
                aVar.f101929b.setBadgeCount(bVar.q);
                aVar.f101929b.setVisibility(0);
                aVar.f101928a.setVisibility(8);
            } else if (bVar.r) {
                aVar.f101929b.setVisibility(8);
                aVar.f101928a.setVisibility(0);
            } else {
                aVar.f101928a.setVisibility(8);
                aVar.f101929b.setVisibility(8);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.a aVar, com.ss.android.ugc.aweme.im.sdk.chatlist.controller.a.a aVar2, com.ss.android.ugc.aweme.im.sdk.chatlist.ui.c.a aVar3) {
        super(aVar3);
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        this.f101925e = aVar;
        this.f101926f = aVar2;
        this.f101923b = new SparseArray<>();
        setHasStableIds(true);
        this.f101924c = new ArrayList();
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        com.ss.android.ugc.aweme.inbox.widget.a aVar2;
        boolean a2;
        MethodCollector.i(6457);
        l.d(viewGroup, "");
        if (i2 != 0) {
            aVar2 = new c(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6o, viewGroup, false), aVar.f101926f);
        } else {
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.a aVar3 = aVar.f101925e;
            l.d(viewGroup, "");
            l.d(aVar3, "");
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6q, viewGroup, false);
            l.b(a3, "");
            aVar2 = new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a.a(a3, aVar3);
        }
        com.ss.android.ugc.aweme.inbox.widget.b bVar = aVar.f101923b.get(i2);
        if (bVar != null) {
            aVar2.a(bVar);
        }
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) aVar2;
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
        MethodCollector.o(6457);
        return viewHolder;
    }
}
