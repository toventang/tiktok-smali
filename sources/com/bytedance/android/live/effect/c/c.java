package com.bytedance.android.live.effect.c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.effect.c.j;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class c extends RecyclerView.a<b> {

    /* renamed from: a  reason: collision with root package name */
    List<FilterModel> f9702a;

    /* renamed from: b  reason: collision with root package name */
    int f9703b;

    /* renamed from: c  reason: collision with root package name */
    a f9704c;

    /* renamed from: d  reason: collision with root package name */
    private Context f9705d;

    public interface a {
        static {
            Covode.recordClassIndex(4943);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(4942);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    /* access modifiers changed from: package-private */
    public static class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final View f9706a;

        /* renamed from: b  reason: collision with root package name */
        public View f9707b;

        /* renamed from: c  reason: collision with root package name */
        public HSImageView f9708c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f9709d;

        /* renamed from: e  reason: collision with root package name */
        public ImageView f9710e;

        /* renamed from: f  reason: collision with root package name */
        private View f9711f;

        static {
            Covode.recordClassIndex(4944);
        }

        public final void a() {
            this.f9711f.setVisibility(4);
        }

        b(View view) {
            super(view);
            this.f9707b = view.findViewById(R.id.us);
            this.f9708c = (HSImageView) view.findViewById(R.id.buf);
            this.f9709d = (TextView) view.findViewById(R.id.f3c);
            this.f9706a = view.findViewById(R.id.byw);
            this.f9711f = view.findViewById(R.id.bs7);
            this.f9710e = (ImageView) view.findViewById(R.id.bzc);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f9702a.size();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, int i2) {
        boolean z;
        int i3;
        int b2;
        b bVar2 = bVar;
        FilterModel filterModel = this.f9702a.get(i2);
        if (i2 == this.f9703b) {
            z = true;
        } else {
            z = false;
        }
        View view = bVar2.f9707b;
        if (z) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        view.setVisibility(i3);
        if (z) {
            b2 = y.b((int) R.color.v7);
        } else {
            b2 = y.b((int) R.color.xg);
        }
        bVar2.f9709d.setTextColor(b2);
        int filterType = filterModel.getFilterType();
        if (filterType == 0) {
            bVar2.f9708c.setImageResource(R.drawable.bq4);
            if (bVar2.f9710e != null) {
                bVar2.f9710e.setVisibility(0);
            }
            bVar2.f9709d.setText(filterModel.getLocalFilter().getName());
            bVar2.f9706a.setVisibility(8);
            bVar2.a();
        } else if (filterType == 1) {
            bVar2.f9708c.setImageDrawable(y.c(filterModel.getLocalFilter().getCoverResId()));
            bVar2.f9709d.setText(filterModel.getLocalFilter().getName());
            bVar2.f9706a.setVisibility(8);
            if (bVar2.f9710e != null) {
                bVar2.f9710e.setVisibility(8);
            }
            bVar2.a();
        } else if (filterType == 2) {
            HSImageView hSImageView = bVar2.f9708c;
            UrlModel iconUrl = filterModel.getEffect().getIconUrl();
            ImageModel imageModel = new ImageModel();
            imageModel.setUri(iconUrl.getUri());
            imageModel.setUrls(iconUrl.getUrlList());
            k.a(hSImageView, imageModel);
            bVar2.f9709d.setText(filterModel.getEffect().getName());
            if (j.b.f9740a.c(filterModel)) {
                bVar2.f9706a.setVisibility(0);
            } else {
                bVar2.f9706a.setVisibility(8);
            }
            bVar2.a();
            if (bVar2.f9710e != null) {
                bVar2.f9710e.setVisibility(8);
            }
        }
        bVar2.itemView.setOnClickListener(new d(this, i2, bVar2));
    }

    public c(Context context, List<FilterModel> list, a aVar) {
        this.f9705d = context;
        this.f9702a = list == null ? new ArrayList<>() : list;
        this.f9703b = com.bytedance.android.livesdk.ap.a.O.a().intValue();
        this.f9704c = aVar;
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        int i3;
        boolean a2;
        MethodCollector.i(357);
        if (LiveNewEffectPanelSetting.INSTANCE.useNewPanel()) {
            i3 = R.layout.b8r;
        } else {
            i3 = R.layout.bar;
        }
        b bVar = new b(com.a.a(LayoutInflater.from(cVar.f9705d), i3, viewGroup, false));
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
        MethodCollector.o(357);
        return bVar;
    }
}
