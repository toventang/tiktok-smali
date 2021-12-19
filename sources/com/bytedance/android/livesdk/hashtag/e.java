package com.bytedance.android.livesdk.hashtag;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.design.widget.LiveRadioButton;
import com.bytedance.android.livesdk.hashtag.l;
import com.bytedance.android.livesdk.j.aq;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.util.List;

public final class e extends RecyclerView.a<l> {

    /* renamed from: a  reason: collision with root package name */
    public Context f18129a;

    /* renamed from: b  reason: collision with root package name */
    public DataChannel f18130b;

    /* renamed from: c  reason: collision with root package name */
    public b<? super Hashtag, z> f18131c;

    /* renamed from: d  reason: collision with root package name */
    private List<Hashtag> f18132d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f18133e;

    static {
        Covode.recordClassIndex(10067);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ l onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f18132d.size();
    }

    static final /* synthetic */ class a extends j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(10068);
        }

        a(e eVar) {
            super(0, eVar, e.class, "notifyDataSetChanged", "notifyDataSetChanged()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((RecyclerView.a) this.receiver).notifyDataSetChanged();
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(l lVar, int i2) {
        Hashtag hashtag;
        l lVar2 = lVar;
        l.d(lVar2, "");
        Hashtag hashtag2 = this.f18132d.get(i2);
        DataChannel dataChannel = this.f18130b;
        boolean z = this.f18133e;
        a aVar = new a(this);
        b<? super Hashtag, z> bVar = this.f18131c;
        l.d(hashtag2, "");
        l.d(aVar, "");
        l.d(bVar, "");
        p.b(lVar2.f18186a, hashtag2.image, 2131234109, 8);
        lVar2.f18187b.setText(hashtag2.title);
        if (dataChannel == null || (hashtag = (Hashtag) dataChannel.b(aq.class)) == null) {
            lVar2.f18188c.setChecked(false);
        } else {
            lVar2.f18188c.setChecked(l.a(hashtag.id, hashtag2.id));
        }
        LiveRadioButton liveRadioButton = lVar2.f18188c;
        liveRadioButton.setOnClickListener(new l.a(liveRadioButton, z, aVar, dataChannel, hashtag2, bVar));
    }

    private static RecyclerView.ViewHolder a(e eVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(1660);
        h.f.b.l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(eVar.f18129a), R.layout.b_3, viewGroup, false);
        h.f.b.l.b(a3, "");
        l lVar = new l(a3);
        try {
            if (lVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(lVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) lVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(lVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = lVar.getClass().getName();
        MethodCollector.o(1660);
        return lVar;
    }

    public e(Context context, List<Hashtag> list, DataChannel dataChannel, boolean z, b<? super Hashtag, z> bVar) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(list, "");
        h.f.b.l.d(bVar, "");
        this.f18129a = context;
        this.f18132d = list;
        this.f18130b = dataChannel;
        this.f18133e = z;
        this.f18131c = bVar;
    }
}
