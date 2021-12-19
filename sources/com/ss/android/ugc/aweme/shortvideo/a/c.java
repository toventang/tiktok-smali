package com.ss.android.ugc.aweme.shortvideo.a;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.imagepipeline.j.b;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.util.bo;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;

public final class c extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    private int f124796a;

    /* renamed from: b  reason: collision with root package name */
    private int f124797b;

    /* renamed from: c  reason: collision with root package name */
    private float f124798c = 1.2f;

    /* renamed from: d  reason: collision with root package name */
    private int f124799d;

    /* renamed from: e  reason: collision with root package name */
    private int f124800e;

    /* renamed from: f  reason: collision with root package name */
    private bo f124801f;

    static {
        Covode.recordClassIndex(82002);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f124800e;
    }

    /* access modifiers changed from: package-private */
    public static class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        ImageView f124805a;

        /* renamed from: b  reason: collision with root package name */
        com.facebook.common.h.a<com.facebook.imagepipeline.j.c> f124806b;

        static {
            Covode.recordClassIndex(82004);
        }

        a(View view) {
            super(view);
            this.f124805a = (ImageView) view.findViewById(R.id.c22);
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.shortvideo.a.c.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(82005);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    a.this.getLayoutPosition();
                }
            });
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(8234);
        a aVar = new a(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aqe, viewGroup, false));
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar.getClass().getName();
        MethodCollector.o(8234);
        return aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        final a aVar2 = aVar;
        com.facebook.common.h.a.c(aVar2.f124806b);
        final int min = (int) Math.min(((float) i2) * this.f124798c * 1000.0f, (float) this.f124797b);
        aVar2.f124805a.setTag(String.valueOf(min));
        RecyclerView.j jVar = (RecyclerView.j) aVar2.f124805a.getLayoutParams();
        jVar.height = this.f124796a;
        jVar.width = this.f124796a;
        jVar.setMargins(0, 0, 0, 0);
        if (i2 <= 0 || i2 >= this.f124800e - 1) {
            int i3 = this.f124796a;
            int i4 = i3 >> 1;
            int i5 = this.f124800e;
            if (i2 == i5 - 1) {
                if (i2 == 0) {
                    float f2 = this.f124798c;
                    double d2 = (double) (((float) this.f124797b) % (f2 * 1000.0f));
                    Double.isNaN(d2);
                    double d3 = (double) (f2 * 1000.0f);
                    Double.isNaN(d3);
                    double d4 = (d2 * 1.0d) / d3;
                    double d5 = (double) i3;
                    Double.isNaN(d5);
                    jVar.width = (int) (d4 * d5);
                    jVar.setMargins(i4, 0, this.f124799d, 0);
                }
            } else if (i2 == 0) {
                jVar.width = i3;
                jVar.setMargins(i4, 0, 0, 0);
            }
            if (i2 == i5 - 1) {
                float f3 = this.f124798c;
                float f4 = ((float) this.f124797b) % (f3 * 1000.0f);
                if (f4 == 0.0f) {
                    f4 = f3 * 1000.0f;
                }
                double d6 = (double) f4;
                Double.isNaN(d6);
                double d7 = (double) (f3 * 1000.0f);
                Double.isNaN(d7);
                double d8 = (d6 * 1.0d) / d7;
                double d9 = (double) i3;
                Double.isNaN(d9);
                jVar.width = (int) (d8 * d9);
                if (i2 < 5) {
                    jVar.setMargins(0, 0, i4 + this.f124799d, 0);
                } else {
                    jVar.setMargins(0, 0, i4, 0);
                }
            }
        } else {
            jVar.width = this.f124796a;
            aVar2.f124805a.setPadding(0, 0, 0, 0);
        }
        aVar2.f124805a.setLayoutParams(jVar);
        aVar2.f124805a.setScaleType(ImageView.ScaleType.CENTER_CROP);
        aVar2.f124805a.setImageBitmap(null);
        bo boVar = this.f124801f;
        if (boVar != null) {
            boVar.a(min, new bo.a() {
                /* class com.ss.android.ugc.aweme.shortvideo.a.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(82003);
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.util.bo.a
                public final void a(com.facebook.common.h.a<com.facebook.imagepipeline.j.c> aVar) {
                    Bitmap d2 = ((b) aVar.a()).d();
                    if (d2 != null && !d2.isRecycled() && aVar2.f124805a != null && aVar2.f124805a.getTag().equals(new StringBuilder().append(min).toString())) {
                        aVar2.f124806b = aVar;
                        aVar2.f124805a.setImageBitmap(d2);
                    }
                }
            });
        }
    }

    public c(m mVar, int i2, int i3, int i4, String str, int i5, int i6, int i7) {
        this.f124796a = i2;
        this.f124797b = i3;
        this.f124799d = i4;
        this.f124800e = i7;
        if (str != null) {
            this.f124801f = AVExternalServiceImpl.a().abilityService().effectService().getVideoCoverBitmapCache(mVar, str, i5, i6, this.f124797b, this.f124798c);
        }
    }
}
