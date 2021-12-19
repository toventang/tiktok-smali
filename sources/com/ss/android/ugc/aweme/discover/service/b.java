package com.ss.android.ugc.aweme.discover.service;

import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.utils.gp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class b extends RecyclerView.a<d> {

    /* renamed from: a  reason: collision with root package name */
    final List<MusicTag> f82051a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int[] f82052b = new int[2];

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f82053c;

    /* renamed from: d  reason: collision with root package name */
    private final View.OnClickListener f82054d;

    static {
        Covode.recordClassIndex(51065);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ d onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f82051a.size();
    }

    public b(View.OnClickListener onClickListener, RecyclerView recyclerView) {
        l.d(onClickListener, "");
        l.d(recyclerView, "");
        this.f82054d = onClickListener;
        this.f82053c = recyclerView;
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(2383);
        l.d(viewGroup, "");
        View a3 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aaz, viewGroup, false);
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
        MethodCollector.o(2383);
        return dVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(d dVar, int i2) {
        d dVar2 = dVar;
        l.d(dVar2, "");
        MusicTag musicTag = this.f82051a.get(i2);
        dVar2.itemView.setOnClickListener(this.f82054d);
        l.d(musicTag, "");
        if (!TextUtils.isEmpty(musicTag.getTagColor()) && !TextUtils.isEmpty(musicTag.getTagTitle())) {
            TextView textView = dVar2.f82060a;
            if (textView != null) {
                textView.setText(musicTag.getTagTitle());
            }
            try {
                TextView textView2 = dVar2.f82060a;
                if (textView2 != null) {
                    textView2.setBackgroundColor(Color.parseColor(musicTag.getTagColor()));
                }
                TextView textView3 = dVar2.f82060a;
                if (textView3 != null) {
                    textView3.setTextColor(Color.parseColor(musicTag.getTagTitleColor()));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            TextView textView4 = dVar2.f82060a;
            if (textView4 != null) {
                textView4.setLayoutParams((RecyclerView.j) dVar2.f82061b.getValue());
            }
            if (dVar2.f82060a != null) {
                TextView textView5 = dVar2.f82060a;
                Objects.requireNonNull(textView5, "null cannot be cast to non-null type android.view.View");
                if (Build.VERSION.SDK_INT >= 21) {
                    textView5.setOutlineProvider(new gp(textView5.getResources().getDimensionPixelOffset(R.dimen.qq)));
                    textView5.setClipToOutline(true);
                }
            }
        }
    }
}
