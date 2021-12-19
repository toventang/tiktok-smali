package com.bytedance.android.livesdk.container.f;

import android.view.View;
import androidx.core.h.v;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.container.config.live.LivePopupConfig;
import com.bytedance.android.livesdk.container.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.a.a.d;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16791a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(9312);
    }

    public static final class b implements com.bytedance.android.livesdk.container.custom.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f16793a;

        static {
            Covode.recordClassIndex(9314);
        }

        b(int i2) {
            this.f16793a = i2;
        }

        @Override // com.bytedance.android.livesdk.container.custom.a.b
        public final void a(View view) {
            l.d(view, "");
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + this.f16793a, view.getPaddingRight(), view.getPaddingBottom());
        }

        @Override // com.bytedance.android.livesdk.container.custom.a.b
        public final void b(View view) {
            l.d(view, "");
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() - this.f16793a, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.f.a$a  reason: collision with other inner class name */
    public static final class View$OnClickListenerC0339a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f16792a;

        static {
            Covode.recordClassIndex(9313);
        }

        public View$OnClickListenerC0339a(e eVar) {
            this.f16792a = eVar;
        }

        public final void onClick(View view) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("container_id", this.f16792a.getHybridContainerId());
            com.bytedance.ies.xbridge.e.a aVar = new com.bytedance.ies.xbridge.e.a("container_popupTapSpace", currentTimeMillis, new d(jSONObject));
            aVar.a(this.f16792a.getHybridContainerId());
            com.bytedance.ies.xbridge.e.b.a(aVar);
        }
    }

    public static void a(PopupConfig popupConfig) {
        int minMarginTop;
        LivePopupConfig extraConfig = popupConfig.getExtraConfig();
        if (extraConfig != null && (minMarginTop = extraConfig.getMinMarginTop()) > 0) {
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(f.class);
            l.b(a2, "");
            Iterator<T> it = ((f) a2).getHybridDialogManager().b().iterator();
            while (it.hasNext()) {
                it.next().a(new b(minMarginTop));
            }
        }
    }

    public static final class c extends LiveBottomSheetBehavior.a {

        /* renamed from: a  reason: collision with root package name */
        public int f16794a = 3;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f16795b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f16796c;

        static {
            Covode.recordClassIndex(9315);
        }

        public c(List list, e eVar) {
            this.f16795b = list;
            this.f16796c = eVar;
        }

        @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.a
        public final void a(View view, float f2) {
            l.d(view, "");
            for (e eVar : this.f16795b) {
                View c2 = eVar.c();
                if (c2 != null) {
                    v.d(c2, (int) (((float) c2.getHeight()) * f2));
                }
            }
        }

        @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.a
        public final void a(View view, int i2) {
            Object obj;
            l.d(view, "");
            if (i2 == 5) {
                for (e eVar : this.f16795b) {
                    if (eVar != null && this.f16794a == 2 && (!l.a((Object) eVar.getHybridContainerId(), (Object) this.f16796c.getHybridContainerId()))) {
                        try {
                            eVar.b();
                            obj = q.m223constructorimpl(z.f158842a);
                        } catch (Throwable th) {
                            obj = q.m223constructorimpl(r.a(th));
                        }
                        q.m222boximpl(obj);
                    }
                }
            }
            this.f16794a = i2;
        }
    }
}
