package com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.b;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a extends RecyclerView.a<g> {

    /* renamed from: c  reason: collision with root package name */
    public static final C2499a f100885c = new C2499a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final List<c> f100886a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Context f100887b;

    static {
        Covode.recordClassIndex(64538);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ g onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.a$a  reason: collision with other inner class name */
    public static final class C2499a {
        static {
            Covode.recordClassIndex(64539);
        }

        private C2499a() {
        }

        public /* synthetic */ C2499a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f100886a.size();
    }

    public final void a() {
        this.f100886a.clear();
        notifyDataSetChanged();
    }

    public a(Context context) {
        l.d(context, "");
        this.f100887b = context;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(g gVar, int i2) {
        UrlModel avatarThumb;
        g gVar2 = gVar;
        l.d(gVar2, "");
        c cVar = this.f100886a.get(i2);
        l.d(cVar, "");
        int i3 = cVar.f100892a;
        if (i3 == 0) {
            IMUser iMUser = cVar.f100893b;
            if (!(iMUser == null || (avatarThumb = iMUser.getAvatarThumb()) == null)) {
                View view = gVar2.itemView;
                l.b(view, "");
                e.a((RemoteImageView) view.findViewById(R.id.pf), avatarThumb);
            }
            View view2 = gVar2.itemView;
            l.b(view2, "");
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.c_s);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(8);
        } else if (i3 == 1) {
            View view3 = gVar2.itemView;
            l.b(view3, "");
            View view4 = gVar2.itemView;
            l.b(view4, "");
            ((AvatarImageView) view3.findViewById(R.id.pf)).setImageDrawable(b.a(view4.getContext(), (int) R.drawable.aql));
            a.C0730a aVar = new a.C0730a();
            aVar.c("+");
            aVar.a(String.valueOf(cVar.f100894c));
            View view5 = gVar2.itemView;
            l.b(view5, "");
            TuxTextView tuxTextView2 = (TuxTextView) view5.findViewById(R.id.c_s);
            l.b(tuxTextView2, "");
            tuxTextView2.setText(aVar.f33382a);
            View view6 = gVar2.itemView;
            l.b(view6, "");
            TuxTextView tuxTextView3 = (TuxTextView) view6.findViewById(R.id.c_s);
            l.b(tuxTextView3, "");
            tuxTextView3.setVisibility(0);
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(5335);
        l.d(viewGroup, "");
        Context context = aVar.f100887b;
        l.d(context, "");
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(context), R.layout.a55, viewGroup, false);
        l.b(a3, "");
        g gVar = new g(a3);
        try {
            if (gVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(gVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) gVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(gVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = gVar.getClass().getName();
        MethodCollector.o(5335);
        return gVar;
    }
}
