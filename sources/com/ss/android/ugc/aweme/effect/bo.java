package com.ss.android.ugc.aweme.effect;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.sticker.t;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.ugc.aweme.themechange.base.c;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.views.CircleDraweeView;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class bo extends RecyclerView.a<b> {

    /* renamed from: a  reason: collision with root package name */
    public List<EffectModel> f88884a;

    /* renamed from: b  reason: collision with root package name */
    public a f88885b;

    /* renamed from: c  reason: collision with root package name */
    public int f88886c;

    public interface a {
        static {
            Covode.recordClassIndex(55913);
        }

        boolean a(int i2, boolean z);
    }

    static {
        Covode.recordClassIndex(55912);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f88884a.size();
    }

    public final void a(int i2) {
        notifyItemChanged(this.f88886c);
        this.f88886c = i2;
        notifyItemChanged(i2);
    }

    /* access modifiers changed from: package-private */
    public class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        CircleDraweeView f88887a;

        /* renamed from: b  reason: collision with root package name */
        AVDmtTextView f88888b;

        /* renamed from: c  reason: collision with root package name */
        View f88889c;

        static {
            Covode.recordClassIndex(55914);
        }

        b(View view) {
            super(view);
            this.f88887a = (CircleDraweeView) view.findViewById(R.id.eb7);
            this.f88888b = (AVDmtTextView) view.findViewById(R.id.ebr);
            this.f88889c = view.findViewById(R.id.eab);
            this.f88888b.setStatusTextColor(androidx.core.content.b.c(view.getContext(), R.color.bh));
            this.f88888b.a();
            this.f88888b.setHorizontalFadingEdgeEnabled(true);
            AVDmtTextView aVDmtTextView = this.f88888b;
            aVDmtTextView.setFadingEdgeLength((int) n.b(aVDmtTextView.getContext(), 4.0f));
            this.f88887a.setOnClickListener(new bp(this));
            this.f88887a.setOnTouchListener(new t(1.2f, 100, this.f88889c));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, int i2) {
        int i3;
        b bVar2 = bVar;
        EffectModel effectModel = bo.this.f88884a.get(i2);
        Drawable drawable = bVar2.f88887a.getResources().getDrawable(effectModel.imagePath);
        if (!effectModel.isEnabled) {
            i3 = 127;
        } else {
            i3 = 255;
        }
        if (i2 == 0) {
            int b2 = (int) n.b(bVar2.f88887a.getContext(), 12.0f);
            int color = bVar2.itemView.getContext().getResources().getColor(R.color.a8);
            drawable = c.a(drawable);
            bVar2.f88887a.setImageDrawable(drawable);
            bVar2.f88887a.setPadding(b2, b2, b2, b2);
            bVar2.f88887a.setBackground(com.ss.android.ugc.tools.view.a.a(color, color, 0));
        } else {
            bVar2.f88887a.setBackground(drawable);
        }
        SpannableString spannableString = new SpannableString(effectModel.name);
        spannableString.setSpan(new ForegroundColorSpan(androidx.core.graphics.a.b(androidx.core.content.b.c(i.f115645a, R.color.f159928l), i3)), 0, spannableString.length(), 17);
        drawable.setAlpha(i3);
        bVar2.f88888b.setText(spannableString);
        if (i2 == bo.this.f88886c) {
            bVar2.f88888b.a(true);
            bVar2.f88888b.setSelected(true);
            bVar2.f88889c.setBackground(bVar2.f88889c.getResources().getDrawable(R.drawable.eh));
            return;
        }
        bVar2.f88888b.a(false);
        bVar2.f88888b.setSelected(false);
        bVar2.f88889c.setBackground(null);
    }

    private static RecyclerView.ViewHolder a(bo boVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(1833);
        b bVar = new b(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_d, viewGroup, false));
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = bVar.getClass().getName();
        MethodCollector.o(1833);
        return bVar;
    }
}
