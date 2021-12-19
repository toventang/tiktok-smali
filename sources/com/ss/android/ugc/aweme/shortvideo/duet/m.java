package com.ss.android.ugc.aweme.shortvideo.duet;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.d;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.property.av;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.duet.k;
import com.ss.android.ugc.aweme.sticker.StickerWrapper;
import com.ss.android.ugc.aweme.sticker.repository.a.a.a;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class m extends RecyclerView.a<RecyclerView.ViewHolder> implements k.b {

    /* renamed from: a  reason: collision with root package name */
    List<? extends StickerWrapper> f126564a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f126565b;

    /* renamed from: c  reason: collision with root package name */
    private final d f126566c;

    /* renamed from: d  reason: collision with root package name */
    private final ShortVideoContext f126567d;

    /* renamed from: e  reason: collision with root package name */
    private final f f126568e;

    /* renamed from: f  reason: collision with root package name */
    private final DuetLayoutModeViewModel f126569f;

    static {
        Covode.recordClassIndex(83013);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f126564a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        boolean z;
        String str;
        String str2;
        l.d(viewHolder, "");
        k kVar = (k) viewHolder;
        StickerWrapper stickerWrapper = (StickerWrapper) this.f126564a.get(i2);
        int i3 = 1;
        if (i2 == this.f126565b) {
            z = true;
        } else {
            z = false;
        }
        l.d(stickerWrapper, "");
        kVar.f126556b = stickerWrapper;
        if (stickerWrapper.f134687a != null) {
            f fVar = kVar.f126558d;
            Effect effect = stickerWrapper.f134687a;
            if (fVar == null || !a.b(fVar, effect)) {
                i3 = 3;
            }
            stickerWrapper.f134689c = i3;
            kVar.a(stickerWrapper);
            Effect effect2 = stickerWrapper.f134687a;
            l.b(effect2, "");
            String b2 = l.b(effect2);
            if (av.a()) {
                Object a2 = k.a.a(b2);
                if (a2 instanceof Integer) {
                    kVar.f126555a.a(((Number) a2).intValue());
                } else {
                    List<String> urlList = stickerWrapper.f134687a.getIconUrl().getUrlList();
                    if (!(urlList == null || (str2 = urlList.get(0)) == null)) {
                        kVar.f126555a.a(str2);
                    }
                }
            } else {
                List<String> urlList2 = stickerWrapper.f134687a.getIconUrl().getUrlList();
                if (!(urlList2 == null || (str = urlList2.get(0)) == null)) {
                    kVar.f126555a.a(str);
                }
            }
            kVar.f126555a.a(false);
            kVar.f126555a.setText(stickerWrapper.f134687a.getName());
            if (z) {
                kVar.a(false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e5  */
    @Override // com.ss.android.ugc.aweme.shortvideo.duet.k.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 313
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.duet.m.a(int, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List<Object> list) {
        l.d(viewHolder, "");
        l.d(list, "");
        if (list.isEmpty()) {
            onBindViewHolder(viewHolder, i2);
            return;
        }
        Object obj = list.get(0);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        ((k) viewHolder).c(((Boolean) obj).booleanValue());
    }

    private static RecyclerView.ViewHolder a(m mVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(10192);
        l.d(viewGroup, "");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        l.b(from, "");
        l.d(from, "");
        l.d(viewGroup, "");
        View a3 = com.a.a(from, R.layout.da, viewGroup, false);
        if (a3 != null) {
            k kVar = new k((FrameLayout) a3, mVar.f126568e, mVar);
            try {
                if (kVar.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(kVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) kVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(kVar.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = kVar.getClass().getName();
            MethodCollector.o(10192);
            return kVar;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        MethodCollector.o(10192);
        throw nullPointerException;
    }

    public m(d dVar, ShortVideoContext shortVideoContext, f fVar, DuetLayoutModeViewModel duetLayoutModeViewModel) {
        l.d(dVar, "");
        l.d(shortVideoContext, "");
        l.d(fVar, "");
        l.d(duetLayoutModeViewModel, "");
        this.f126566c = dVar;
        this.f126567d = shortVideoContext;
        this.f126568e = fVar;
        this.f126569f = duetLayoutModeViewModel;
    }
}
