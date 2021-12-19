package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticeSourceType;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.d;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends t<b, d> {

    /* renamed from: b  reason: collision with root package name */
    private final TopChatNoticeSourceType f102025b;

    /* renamed from: c  reason: collision with root package name */
    private final SessionListTopNoticeViewModel f102026c;

    static {
        Covode.recordClassIndex(65285);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        return (long) ((b) a(i2)).hashCode();
    }

    public /* synthetic */ a(TopChatNoticeSourceType topChatNoticeSourceType, SessionListTopNoticeViewModel sessionListTopNoticeViewModel) {
        this(topChatNoticeSourceType, sessionListTopNoticeViewModel, new c());
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(4967);
        l.d(viewGroup, "");
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a8e, viewGroup, false);
        l.b(a3, "");
        d dVar = new d(a3);
        try {
            if (dVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(dVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) dVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(dVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = dVar.getClass().getName();
        MethodCollector.o(4967);
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        d dVar = (d) viewHolder;
        l.d(dVar, "");
        TopChatNoticeSourceType topChatNoticeSourceType = this.f102025b;
        Object a2 = a(i2);
        l.b(a2, "");
        b bVar = (b) a2;
        SessionListTopNoticeViewModel sessionListTopNoticeViewModel = this.f102026c;
        l.d(topChatNoticeSourceType, "");
        l.d(bVar, "");
        l.d(sessionListTopNoticeViewModel, "");
        dVar.f102029a.setOnClickListener(new d.b(sessionListTopNoticeViewModel));
        dVar.f102030b.setOnClickListener(new d.c(sessionListTopNoticeViewModel, topChatNoticeSourceType));
        TextView textView = dVar.f102031c;
        View view = dVar.itemView;
        l.b(view, "");
        textView.setText(view.getContext().getString(bVar.getTitle()));
        TextView textView2 = dVar.f102032d;
        View view2 = dVar.itemView;
        l.b(view2, "");
        textView2.setText(view2.getContext().getString(bVar.getDescription()));
        if (bVar.getButtonText() != 0) {
            dVar.f102029a.setVisibility(0);
            TuxButton tuxButton = dVar.f102029a;
            View view3 = dVar.itemView;
            l.b(view3, "");
            tuxButton.setText(view3.getContext().getString(bVar.getButtonText()));
            return;
        }
        dVar.f102029a.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(TopChatNoticeSourceType topChatNoticeSourceType, SessionListTopNoticeViewModel sessionListTopNoticeViewModel, c cVar) {
        super(cVar);
        l.d(topChatNoticeSourceType, "");
        l.d(sessionListTopNoticeViewModel, "");
        l.d(cVar, "");
        this.f102025b = topChatNoticeSourceType;
        this.f102026c = sessionListTopNoticeViewModel;
        setHasStableIds(true);
    }
}
