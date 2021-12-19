package com.ss.android.ugc.aweme.effect;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.sticker.t;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.views.CircleDraweeView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class z extends com.ss.android.ugc.aweme.effect.a.a<b> {

    /* renamed from: a  reason: collision with root package name */
    public a f89005a;

    public interface a {
        static {
            Covode.recordClassIndex(55979);
        }

        void a(int i2, int i3, EffectModel effectModel);
    }

    static {
        Covode.recordClassIndex(55978);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f88774c.size();
    }

    public class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        AVDmtImageView f89006a;

        /* renamed from: b  reason: collision with root package name */
        AVDmtTextView f89007b;

        /* renamed from: c  reason: collision with root package name */
        CircleDraweeView f89008c;

        /* renamed from: d  reason: collision with root package name */
        ObjectAnimator f89009d;

        /* renamed from: e  reason: collision with root package name */
        int f89010e = 1;

        static {
            Covode.recordClassIndex(55980);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            ObjectAnimator objectAnimator = this.f89009d;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                this.f89009d.cancel();
            }
            this.f89006a.setRotation(0.0f);
            this.f89006a.setImageResource(2131230946);
        }

        /* access modifiers changed from: package-private */
        public final void a(boolean z) {
            this.f89008c.a(z);
        }

        public b(View view) {
            super(view);
            CircleDraweeView circleDraweeView = (CircleDraweeView) view.findViewById(R.id.eb7);
            this.f89008c = circleDraweeView;
            circleDraweeView.f144434d = true;
            AVDmtTextView aVDmtTextView = (AVDmtTextView) view.findViewById(R.id.ebr);
            this.f89007b = aVDmtTextView;
            aVDmtTextView.a();
            this.f89007b.setHorizontalFadingEdgeEnabled(true);
            AVDmtTextView aVDmtTextView2 = this.f89007b;
            aVDmtTextView2.setFadingEdgeLength((int) n.b(aVDmtTextView2.getContext(), 4.0f));
            this.f89006a = (AVDmtImageView) view.findViewById(R.id.bwk);
            this.f89008c.setOnTouchListener(new aa(this));
            this.f89008c.setOnClickListener(new ab(this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (l.a((Object) "trans", (Object) this.f88774c.get(i2).category)) {
            return 2;
        }
        return 1;
    }

    public z(RecyclerView recyclerView, com.ss.android.ugc.aweme.effect.b.a aVar) {
        super(recyclerView, aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        b bVar = (b) viewHolder;
        EffectModel effectModel = this.f88774c.get(i2);
        int a2 = a(i2);
        if (effectModel != null) {
            bVar.f89007b.setText(effectModel.name);
            if (!TextUtils.isEmpty(effectModel.iconUrl) && !effectModel.iconUrl.equals(bVar.f89008c.getTag())) {
                if (i.a(effectModel)) {
                    bVar.f89008c.setImageDrawable(bVar.f89008c.getResources().getDrawable(i.f115645a.getResources().getIdentifier(effectModel.iconUrl, "drawable", i.f115645a.getPackageName())));
                } else {
                    com.ss.android.ugc.tools.c.b.a(bVar.f89008c, effectModel.iconUrl, Bitmap.Config.RGB_565);
                }
                bVar.f89008c.setTag(effectModel.iconUrl);
            }
            if (bVar.f89010e != a2) {
                bVar.f89010e = a2;
                if (a2 == 2) {
                    bVar.a();
                    bVar.f89006a.setVisibility(0);
                } else if (a2 == 4) {
                    bVar.f89006a.setVisibility(8);
                } else if (a2 == 8) {
                    bVar.f89006a.setVisibility(0);
                    bVar.f89006a.setImageResource(2131230948);
                    bVar.f89009d = ObjectAnimator.ofFloat(bVar.f89006a, "rotation", 0.0f, 360.0f);
                    bVar.f89009d.setDuration(800L);
                    bVar.f89009d.setRepeatMode(1);
                    bVar.f89009d.setRepeatCount(-1);
                    bVar.f89009d.setInterpolator(new LinearInterpolator());
                    bVar.f89009d.start();
                } else if (a2 == 16) {
                    bVar.a();
                    bVar.f89006a.setVisibility(8);
                } else if (a2 == 32) {
                    bVar.f89006a.setVisibility(0);
                    bVar.a();
                }
            }
        }
    }

    private static RecyclerView.ViewHolder a(z zVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(661);
        b bVar = new b(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_b, viewGroup, false));
        if (i2 == 2) {
            bVar.f89008c.setOnTouchListener(new t(1.2f, 100, bVar.f89008c));
        } else {
            bVar.f89008c.setOnClickListener(null);
        }
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
        MethodCollector.o(661);
        return bVar;
    }
}
