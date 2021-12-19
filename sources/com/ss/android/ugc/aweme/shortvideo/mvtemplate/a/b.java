package com.ss.android.ugc.aweme.shortvideo.mvtemplate.a;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.widget.r;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class b extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public final List<Bitmap> f128775a = new ArrayList(7);

    /* renamed from: b  reason: collision with root package name */
    private final int f128776b;

    /* renamed from: c  reason: collision with root package name */
    private final int f128777c;

    /* renamed from: d  reason: collision with root package name */
    private int f128778d = 1;

    static {
        Covode.recordClassIndex(84494);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f128775a.size() / this.f128778d;
    }

    public b(int i2, int i3) {
        this.f128776b = i2;
        this.f128777c = i3;
        this.f128778d = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        Bitmap bitmap = this.f128775a.get(i2);
        ImageView imageView = (ImageView) viewHolder.itemView;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(8279);
        ImageView imageView = (ImageView) a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b3r, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = bVar.f128777c;
        layoutParams.width = bVar.f128776b;
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
        MethodCollector.o(8279);
        return rVar;
    }
}
