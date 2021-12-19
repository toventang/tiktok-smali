package com.bytedance.android.live.effect;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.effect.api.a.g;
import com.bytedance.android.live.effect.widget.BeautyIconWidget;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.widget.AdjustPercentBar;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.HashMap;

public final class f extends com.bytedance.android.livesdk.ui.a implements AdjustPercentBar.b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f9825e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AdjustPercentBar f9826a;

    /* renamed from: b  reason: collision with root package name */
    BeautyIconWidget f9827b;

    /* renamed from: c  reason: collision with root package name */
    public g f9828c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.live.effect.model.b f9829d;

    /* renamed from: f  reason: collision with root package name */
    private final h f9830f = i.a((h.f.a.a) new d(this));

    /* renamed from: g  reason: collision with root package name */
    private final h f9831g = i.a((h.f.a.a) new b(this));

    /* renamed from: h  reason: collision with root package name */
    private final h f9832h = i.a((h.f.a.a) new c(this));

    /* renamed from: i  reason: collision with root package name */
    private HashMap f9833i;

    static {
        Covode.recordClassIndex(5016);
    }

    /* access modifiers changed from: package-private */
    public final BeautyIconWidget a() {
        return (BeautyIconWidget) this.f9830f.getValue();
    }

    /* access modifiers changed from: package-private */
    public final BeautyIconWidget b() {
        return (BeautyIconWidget) this.f9831g.getValue();
    }

    /* access modifiers changed from: package-private */
    public final BeautyIconWidget c() {
        return (BeautyIconWidget) this.f9832h.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5017);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<BeautyIconWidget> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(5018);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BeautyIconWidget invoke() {
            return new BeautyIconWidget(new h.f.a.b<View, z>(this.this$0) {
                /* class com.bytedance.android.live.effect.f.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(5019);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(View view) {
                    f fVar = (f) this.receiver;
                    fVar.a().b();
                    fVar.b().a();
                    fVar.c().b();
                    fVar.f9827b = fVar.b();
                    AdjustPercentBar adjustPercentBar = fVar.f9826a;
                    if (adjustPercentBar != null) {
                        com.bytedance.android.livesdk.ap.b<Float> bVar = com.bytedance.android.livesdk.ap.a.R;
                        l.b(bVar, "");
                        adjustPercentBar.setPercent((int) (bVar.a().floatValue() * 100.0f));
                    }
                    return z.f158842a;
                }
            });
        }
    }

    static final class c extends m implements h.f.a.a<BeautyIconWidget> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(5020);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BeautyIconWidget invoke() {
            return new BeautyIconWidget(new h.f.a.b<View, z>(this.this$0) {
                /* class com.bytedance.android.live.effect.f.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(5021);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(View view) {
                    f fVar = (f) this.receiver;
                    fVar.a().b();
                    fVar.b().b();
                    fVar.c().a();
                    fVar.f9827b = fVar.c();
                    AdjustPercentBar adjustPercentBar = fVar.f9826a;
                    if (adjustPercentBar != null) {
                        com.bytedance.android.livesdk.ap.b<Float> bVar = com.bytedance.android.livesdk.ap.a.S;
                        l.b(bVar, "");
                        adjustPercentBar.setPercent((int) (bVar.a().floatValue() * 100.0f));
                    }
                    return z.f158842a;
                }
            });
        }
    }

    static final class d extends m implements h.f.a.a<BeautyIconWidget> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(5022);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BeautyIconWidget invoke() {
            return new BeautyIconWidget(new h.f.a.b<View, z>(this.this$0) {
                /* class com.bytedance.android.live.effect.f.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(5023);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(View view) {
                    f fVar = (f) this.receiver;
                    fVar.a().a();
                    fVar.b().b();
                    fVar.c().b();
                    fVar.f9827b = fVar.a();
                    AdjustPercentBar adjustPercentBar = fVar.f9826a;
                    if (adjustPercentBar != null) {
                        com.bytedance.android.livesdk.ap.b<Float> bVar = com.bytedance.android.livesdk.ap.a.Q;
                        l.b(bVar, "");
                        adjustPercentBar.setPercent((int) (bVar.a().floatValue() * 100.0f));
                    }
                    return z.f158842a;
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f9833i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.widget.AdjustPercentBar.b
    public final void a(int i2) {
        g gVar;
        BeautyIconWidget beautyIconWidget = this.f9827b;
        if (beautyIconWidget == null) {
            l.a("mSelectedIcon");
        }
        if (l.a(beautyIconWidget, a())) {
            g gVar2 = this.f9828c;
            if (gVar2 != null) {
                gVar2.a(((float) i2) / 100.0f);
            }
        } else if (l.a(beautyIconWidget, b())) {
            g gVar3 = this.f9828c;
            if (gVar3 != null) {
                gVar3.b(((float) i2) / 100.0f);
            }
        } else if (l.a(beautyIconWidget, c()) && (gVar = this.f9828c) != null) {
            gVar.c(((float) i2) / 100.0f);
        }
    }

    @Override // com.bytedance.android.livesdk.widget.AdjustPercentBar.b
    public final void b(int i2) {
        String str;
        String str2;
        com.bytedance.android.live.effect.model.b bVar = this.f9829d;
        if (bVar != null) {
            str = bVar.f9887c;
        } else {
            str = null;
        }
        if (l.a((Object) str, (Object) "live_take_detail")) {
            str2 = "broadcast";
        } else {
            str2 = "preview";
        }
        com.bytedance.android.livesdk.ab.a b2 = c.a.a("ttlive_change_beauty").b(str2);
        BeautyIconWidget beautyIconWidget = this.f9827b;
        if (beautyIconWidget == null) {
            l.a("mSelectedIcon");
        }
        if (l.a(beautyIconWidget, a())) {
            com.bytedance.android.livesdk.ap.b<Float> bVar2 = com.bytedance.android.livesdk.ap.a.Q;
            l.b(bVar2, "");
            com.bytedance.android.livesdk.ap.c.a(bVar2, Float.valueOf(((float) i2) / 100.0f));
            com.bytedance.android.livesdk.ap.b<Float> bVar3 = com.bytedance.android.livesdk.ap.a.Q;
            l.b(bVar3, "");
            b2.a("beauty_skin", bVar3.a());
        } else if (l.a(beautyIconWidget, b())) {
            com.bytedance.android.livesdk.ap.b<Float> bVar4 = com.bytedance.android.livesdk.ap.a.R;
            l.b(bVar4, "");
            com.bytedance.android.livesdk.ap.c.a(bVar4, Float.valueOf(((float) i2) / 100.0f));
            com.bytedance.android.livesdk.ap.b<Float> bVar5 = com.bytedance.android.livesdk.ap.a.R;
            l.b(bVar5, "");
            b2.a("big_eyes", bVar5.a());
        } else if (l.a(beautyIconWidget, c())) {
            com.bytedance.android.livesdk.ap.b<Float> bVar6 = com.bytedance.android.livesdk.ap.a.S;
            l.b(bVar6, "");
            com.bytedance.android.livesdk.ap.c.a(bVar6, Float.valueOf(((float) i2) / 100.0f));
            com.bytedance.android.livesdk.ap.b<Float> bVar7 = com.bytedance.android.livesdk.ap.a.S;
            l.b(bVar7, "");
            b2.a("face_lift", bVar7.a());
        }
        b2.a();
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            new com.bytedance.android.live.effect.c.f().a(room.getId());
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        WidgetManager of = WidgetManager.of(this, view, com.bytedance.android.live.u.h.f12831c);
        of.load(R.id.e6k, a());
        of.load(R.id.az9, b());
        of.load(R.id.dm7, c());
        this.f9827b = a();
        a().a(2131234397, R.string.gut, true);
        b().a(2131234395, R.string.eah, false);
        c().a(2131234396, R.string.gng, false);
        AdjustPercentBar adjustPercentBar = this.f9826a;
        if (adjustPercentBar != null) {
            adjustPercentBar.setOnLevelChangeListener(this);
        }
        AdjustPercentBar adjustPercentBar2 = this.f9826a;
        if (adjustPercentBar2 != null) {
            adjustPercentBar2.a(y.b((int) R.color.v_), y.b((int) R.color.v8), y.b((int) R.color.v9));
        }
        AdjustPercentBar adjustPercentBar3 = this.f9826a;
        if (adjustPercentBar3 != null) {
            adjustPercentBar3.a(100, 0, 0, true);
        }
        AdjustPercentBar adjustPercentBar4 = this.f9826a;
        if (adjustPercentBar4 != null) {
            com.bytedance.android.livesdk.ap.b<Float> bVar = com.bytedance.android.livesdk.ap.a.Q;
            l.b(bVar, "");
            adjustPercentBar4.setPercent((int) (bVar.a().floatValue() * 100.0f));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b9e, viewGroup, false);
    }
}
