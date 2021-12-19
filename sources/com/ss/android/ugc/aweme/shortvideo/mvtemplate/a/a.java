package com.ss.android.ugc.aweme.shortvideo.mvtemplate.a;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.widget.r;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class a extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    private int f128770a;

    /* renamed from: b  reason: collision with root package name */
    private int f128771b;

    /* renamed from: c  reason: collision with root package name */
    private List<Bitmap> f128772c = new ArrayList(7);

    static {
        Covode.recordClassIndex(84493);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f128772c.size();
    }

    public final void a(List<Bitmap> list) {
        if (list != null && !list.isEmpty()) {
            this.f128772c.clear();
            this.f128772c.addAll(list);
            notifyDataSetChanged();
        }
    }

    public a(int i2, int i3) {
        this.f128770a = i2;
        this.f128771b = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        Bitmap bitmap = this.f128772c.get(i2);
        ImageView imageView = (ImageView) viewHolder.itemView;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(7048);
        ImageView imageView = (ImageView) com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b3r, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = aVar.f128771b;
        layoutParams.width = aVar.f128770a;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(layoutParams);
        r rVar = new r(imageView);
        try {
            if (rVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(rVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) rVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(rVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = rVar.getClass().getName();
        MethodCollector.o(7048);
        return rVar;
    }
}
