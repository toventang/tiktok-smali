package com.bytedance.android.live.broadcast.preview.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.broadcast.x;
import com.bytedance.android.live.core.widget.HorizontalTabScrollView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.ad;
import com.bytedance.android.livesdk.j.ae;
import com.bytedance.android.livesdk.j.cr;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorScreenshotEnableSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.ArrayList;

public final class PreviewLiveModeWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    ArrayList<b> f8357a = new ArrayList<>(0);

    /* renamed from: b  reason: collision with root package name */
    public boolean f8358b;

    /* renamed from: c  reason: collision with root package name */
    private int f8359c = -1;

    /* renamed from: d  reason: collision with root package name */
    private final com.bytedance.android.livesdkapi.l.b f8360d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.android.livesdkapi.l.a f8361e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f8362f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f8363g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f8364h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f8365i;

    static {
        Covode.recordClassIndex(4271);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bhg;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static final class a extends RecyclerView.a<RecyclerView.ViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<b> f8366a;

        static {
            Covode.recordClassIndex(4272);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(viewGroup, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemCount() {
            return this.f8366a.size();
        }

        public a(ArrayList<b> arrayList) {
            l.d(arrayList, "");
            this.f8366a = arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
            int i3;
            float f2;
            Resources resources;
            String string;
            String str = "";
            l.d(viewHolder, str);
            if (viewHolder instanceof c) {
                b bVar = this.f8366a.get(i2);
                l.b(bVar, str);
                b bVar2 = bVar;
                View view = viewHolder.itemView;
                l.b(view, str);
                Context context = view.getContext();
                int i4 = bVar2.f8368b;
                if (bVar2.f8367a) {
                    i3 = bVar2.f8369c;
                } else {
                    i3 = bVar2.f8370d;
                }
                if (bVar2.f8367a) {
                    f2 = 0.9f;
                } else {
                    f2 = 0.5f;
                }
                c cVar = (c) viewHolder;
                cVar.f8373b.setBackgroundResource(i3);
                TextView textView = cVar.f8372a;
                if (!(context == null || (resources = context.getResources()) == null || (string = resources.getString(i4)) == null)) {
                    str = string;
                }
                textView.setText(str);
                cVar.f8372a.setAlpha(f2);
            }
        }

        private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
            boolean a2;
            MethodCollector.i(5792);
            l.d(viewGroup, "");
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bhn, viewGroup, false);
            l.b(a3, "");
            c cVar = new c(a3);
            try {
                if (cVar.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(cVar.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = cVar.getClass().getName();
            MethodCollector.o(5792);
            return cVar;
        }
    }

    private static boolean b() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final HorizontalTabScrollView a() {
        View view = getView();
        if (!(view instanceof HorizontalTabScrollView)) {
            view = null;
        }
        return (HorizontalTabScrollView) view;
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewLiveModeWidget f8376a;

        static {
            Covode.recordClassIndex(4277);
        }

        f(PreviewLiveModeWidget previewLiveModeWidget) {
            this.f8376a = previewLiveModeWidget;
        }

        public final void run() {
            PreviewLiveModeWidget previewLiveModeWidget = this.f8376a;
            Object b2 = previewLiveModeWidget.dataChannel.b(x.class);
            if (b2 == null) {
                l.b();
            }
            int size = previewLiveModeWidget.f8357a.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                b bVar = previewLiveModeWidget.f8357a.get(i3);
                l.b(bVar, "");
                if (bVar.f8371e == b2) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            HorizontalTabScrollView a2 = previewLiveModeWidget.a();
            if (a2 != null) {
                a2.a(i2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        if (com.bytedance.android.livesdk.utils.p.a(r0) != false) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PreviewLiveModeWidget() {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.widget.PreviewLiveModeWidget.<init>():void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        com.bytedance.android.live.n.f dnsOptimizer;
        super.onCreate();
        com.bytedance.android.live.i.a.d dVar = (com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class);
        if (!(dVar == null || (dnsOptimizer = dVar.getDnsOptimizer()) == null)) {
            dnsOptimizer.a();
        }
        com.bytedance.android.livesdk.ab.a a2 = c.a.b("ttlive_fetch_pc_mode_all").b("preview").a("support_pc_mode", Boolean.valueOf(this.f8363g));
        boolean z = true;
        a2.f13426c = true;
        a2.a();
        if (!this.f8364h || !b() || !LiveAnchorScreenshotEnableSetting.INSTANCE.enable()) {
            z = false;
        }
        if (this.f8362f) {
            this.f8357a.add(new b(R.string.dxj, 2131234305, 2131234306, com.bytedance.android.livesdkapi.depend.model.live.i.VIDEO));
        }
        if (z) {
            this.f8357a.add(new b(R.string.eam, 2131234302, 2131234303, com.bytedance.android.livesdkapi.depend.model.live.i.SCREEN_RECORD));
        }
        if (this.f8363g) {
            this.f8357a.add(new b(R.string.eae, 2131234291, 2131234292, com.bytedance.android.livesdkapi.depend.model.live.i.THIRD_PARTY));
        }
        if (this.f8365i) {
            this.f8357a.add(new b(R.string.ebt, 2131234293, 2131234294, com.bytedance.android.livesdkapi.depend.model.live.i.LIVE_STUDIO));
        }
        HorizontalTabScrollView a3 = a();
        if (a3 != null) {
            a3.setAdapter(new a(this.f8357a));
        }
        HorizontalTabScrollView a4 = a();
        if (a4 != null) {
            a4.f9276a.a(new HorizontalTabScrollView.e(a4.getContext(), a4.f9276a, new d(this), (byte) 0));
        }
        HorizontalTabScrollView a5 = a();
        if (a5 != null) {
            e eVar = new e(this);
            HorizontalTabScrollView.g gVar = a5.f9277b;
            if (gVar.f9288b == null) {
                gVar.f9288b = new ArrayList();
            }
            gVar.f9288b.add(eVar);
        }
        View view = getView();
        if (view != null) {
            view.post(new f(this));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.a(cr.class, (h.f.a.b) new g(this)).a(ad.class, (h.f.a.b) new h(this));
        }
    }

    static final class d implements HorizontalTabScrollView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewLiveModeWidget f8374a;

        static {
            Covode.recordClassIndex(4275);
        }

        d(PreviewLiveModeWidget previewLiveModeWidget) {
            this.f8374a = previewLiveModeWidget;
        }

        @Override // com.bytedance.android.live.core.widget.HorizontalTabScrollView.c
        public final void a(int i2) {
            this.f8374a.a(i2);
        }
    }

    private final void f(int i2) {
        if (this.f8359c != i2) {
            this.f8359c = i2;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ PreviewLiveModeWidget this$0;

        static {
            Covode.recordClassIndex(4278);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(PreviewLiveModeWidget previewLiveModeWidget) {
            super(1);
            this.this$0 = previewLiveModeWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            l.d(zVar, "");
            this.this$0.a(com.bytedance.android.livesdkapi.depend.model.live.i.LIVE_STUDIO, false);
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<com.bytedance.android.livesdkapi.depend.model.live.i, z> {
        final /* synthetic */ PreviewLiveModeWidget this$0;

        static {
            Covode.recordClassIndex(4279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(PreviewLiveModeWidget previewLiveModeWidget) {
            super(1);
            this.this$0 = previewLiveModeWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.livesdkapi.depend.model.live.i iVar) {
            com.bytedance.android.livesdkapi.depend.model.live.i iVar2 = iVar;
            l.d(iVar2, "");
            this.this$0.a(iVar2, true);
            return z.f158842a;
        }
    }

    private final void a(com.bytedance.android.livesdkapi.depend.model.live.i iVar) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.b(x.class, iVar);
        }
    }

    private final boolean c(int i2) {
        if (i2 < 0 || i2 > this.f8357a.size() - 1) {
            return false;
        }
        return true;
    }

    static final class e implements HorizontalTabScrollView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewLiveModeWidget f8375a;

        static {
            Covode.recordClassIndex(4276);
        }

        e(PreviewLiveModeWidget previewLiveModeWidget) {
            this.f8375a = previewLiveModeWidget;
        }

        @Override // com.bytedance.android.live.core.widget.HorizontalTabScrollView.d
        public final void a(int i2) {
            this.f8375a.b(i2);
            if (this.f8375a.f8358b) {
                this.f8375a.a(i2, false);
            }
            this.f8375a.f8358b = true;
        }
    }

    private final void e(int i2) {
        if (this.f8359c != i2) {
            HorizontalTabScrollView a2 = a();
            if (a2 != null) {
                a2.b(this.f8359c);
            }
            HorizontalTabScrollView a3 = a();
            if (a3 != null) {
                a3.b(i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f8372a;

        /* renamed from: b  reason: collision with root package name */
        public final ImageView f8373b;

        static {
            Covode.recordClassIndex(4274);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            l.d(view, "");
            View findViewById = view.findViewById(R.id.ek6);
            l.b(findViewById, "");
            this.f8372a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.icon_iv);
            l.b(findViewById2, "");
            this.f8373b = (ImageView) findViewById2;
        }
    }

    private final void d(int i2) {
        int i3 = this.f8359c;
        if (i3 != i2) {
            if (c(i3)) {
                b bVar = this.f8357a.get(this.f8359c);
                l.b(bVar, "");
                bVar.f8367a = false;
            }
            if (c(i2)) {
                b bVar2 = this.f8357a.get(i2);
                l.b(bVar2, "");
                bVar2.f8367a = true;
            }
        }
    }

    public final void a(int i2) {
        HorizontalTabScrollView a2 = a();
        if (a2 != null) {
            a2.a(i2);
        }
    }

    public final void b(int i2) {
        d(i2);
        e(i2);
        f(i2);
        if (c(i2)) {
            String a2 = j.a(this.f8357a.get(i2).f8371e);
            com.bytedance.android.livesdk.ab.b a3 = b.a.a("livesdk_live_take_type_show");
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            l.b(b2, "");
            a3.a("anchor_id", b2.c()).a(a2).b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setWidgetCallback(com.bytedance.android.widget.Widget.a r5) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.widget.PreviewLiveModeWidget.setWidgetCallback(com.bytedance.android.widget.Widget$a):void");
    }

    public final void a(int i2, boolean z) {
        if (c(i2)) {
            b bVar = this.f8357a.get(i2);
            l.b(bVar, "");
            b bVar2 = bVar;
            if (z) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.b(ae.class, bVar2.f8371e);
                    return;
                }
                return;
            }
            a(bVar2.f8371e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r0 != false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorScreenshotEnableSetting.INSTANCE.enable() != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.android.livesdkapi.depend.model.live.i r4, boolean r5) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.widget.PreviewLiveModeWidget.a(com.bytedance.android.livesdkapi.depend.model.live.i, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f8367a = false;

        /* renamed from: b  reason: collision with root package name */
        public final int f8368b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8369c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8370d;

        /* renamed from: e  reason: collision with root package name */
        public final com.bytedance.android.livesdkapi.depend.model.live.i f8371e;

        static {
            Covode.recordClassIndex(4273);
        }

        public b(int i2, int i3, int i4, com.bytedance.android.livesdkapi.depend.model.live.i iVar) {
            l.d(iVar, "");
            this.f8368b = i2;
            this.f8369c = i3;
            this.f8370d = i4;
            this.f8371e = iVar;
        }
    }
}
