package com.ss.android.ugc.aweme.contentlanguage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.contentlanguage.l;
import com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public final class d extends RecyclerView.a<RecyclerView.ViewHolder> implements m, l.a {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<com.ss.android.ugc.aweme.setting.serverpush.a.a> f78162a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    final Activity f78163b;

    /* renamed from: c  reason: collision with root package name */
    public final ContentPreferenceViewModel f78164c;

    /* renamed from: d  reason: collision with root package name */
    l f78165d;

    static {
        Covode.recordClassIndex(48465);
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.l.a
    public final void a(Throwable th) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return i2 == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        int i2;
        ArrayList<com.ss.android.ugc.aweme.setting.serverpush.a.a> arrayList = this.f78162a;
        if (arrayList != null) {
            i2 = arrayList.size();
        } else {
            i2 = 0;
        }
        return i2 + 1;
    }

    @Override // androidx.lifecycle.m
    public final i getLifecycle() {
        Activity activity = this.f78163b;
        if (activity instanceof m) {
            return ((m) activity).getLifecycle();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.l.a
    public final void a() {
        String str = "";
        for (int i2 = 0; i2 < this.f78164c.c().getValue().size(); i2++) {
            str = str + this.f78164c.c().getValue().get(i2).getLanguageCode() + ",";
        }
        SharePrefCache.inst().getUserAddLanguages().b(str);
    }

    /* access modifiers changed from: package-private */
    public static class a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(48466);
        }

        a(View view) {
            super(view);
        }
    }

    public static class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        CommonItemView f78166a;

        static {
            Covode.recordClassIndex(48467);
        }

        public b(View view) {
            super(view);
            this.f78166a = (CommonItemView) view;
        }
    }

    public d(Activity activity) {
        this.f78163b = activity;
        ContentPreferenceViewModel contentPreferenceViewModel = (ContentPreferenceViewModel) ae.a((e) activity, (ad.b) null).a(ContentPreferenceViewModel.class);
        this.f78164c = contentPreferenceViewModel;
        contentPreferenceViewModel.c().observe(this, new e(this));
        l lVar = new l();
        this.f78165d = lVar;
        lVar.f78211b = this;
        if (activity instanceof m) {
            ((m) activity).getLifecycle().a(new ContentLanguageAdapter$1(this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        if (getItemCount() != 1 && (viewHolder instanceof b)) {
            b bVar = (b) viewHolder;
            com.ss.android.ugc.aweme.setting.serverpush.a.a aVar = this.f78162a.get(i2 - 1);
            if (aVar.getLocalName() != null) {
                bVar.f78166a.setLeftText(aVar.getLocalName());
                bVar.f78166a.setRightIconRes(2131232492);
                bVar.f78166a.setOnClickListener(new f(this, aVar));
            }
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(6275);
        if (i2 == 0) {
            viewHolder = new a(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ae5, viewGroup, false));
        } else {
            viewHolder = new b(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9a, viewGroup, false));
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
        MethodCollector.o(6275);
        return viewHolder;
    }
}
