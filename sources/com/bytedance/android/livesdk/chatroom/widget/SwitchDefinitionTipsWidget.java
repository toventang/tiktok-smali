package com.bytedance.android.livesdk.chatroom.widget;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.model.n;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.n.ad;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdk.chatroom.c.an;
import com.bytedance.android.livesdk.j.bx;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.di;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.j.g;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.d.q;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.n;
import h.p;
import h.z;
import java.util.Map;

public final class SwitchDefinitionTipsWidget extends LiveRecyclableWidget implements au {

    /* renamed from: e  reason: collision with root package name */
    public static long f16622e;

    /* renamed from: f  reason: collision with root package name */
    public static final b f16623f = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Handler f16624a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16625b;

    /* renamed from: c  reason: collision with root package name */
    public a f16626c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f16627d;

    static {
        Covode.recordClassIndex(9218);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bhr;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(9220);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SwitchDefinitionTipsWidget f16633a;

        static {
            Covode.recordClassIndex(9221);
        }

        c(SwitchDefinitionTipsWidget switchDefinitionTipsWidget) {
            this.f16633a = switchDefinitionTipsWidget;
        }

        public final void run() {
            this.f16633a.hide();
        }
    }

    public SwitchDefinitionTipsWidget() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            l.b();
        }
        this.f16624a = new Handler(myLooper);
        this.f16625b = true;
        this.f16627d = new c(this);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.b(f.class, (Object) false);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        a aVar = this.f16626c;
        if (aVar != null) {
            this.f16624a.removeCallbacks(aVar);
        }
        this.f16624a.removeCallbacks(this.f16627d);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        String str;
        String str2;
        super.show();
        String valueOf = String.valueOf(this.dataChannel.b(di.class));
        com.bytedance.android.livesdkapi.depend.model.live.i iVar = (com.bytedance.android.livesdkapi.depend.model.live.i) this.dataChannel.b(bx.class);
        if (iVar != null) {
            str = j.a(iVar);
        } else {
            str = "";
        }
        boolean z = this.f16625b;
        if (z) {
            str2 = "0";
        } else if (!z) {
            str2 = "1";
        } else {
            throw new n();
        }
        com.bytedance.android.live.d.b bVar = (com.bytedance.android.live.d.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.d.b.class);
        if (bVar != null) {
            bVar.reportAudienceDefinitionTipsShow(valueOf, str, str2);
        }
        f16622e = System.currentTimeMillis();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.b(f.class, (Object) true);
        }
        this.f16624a.postDelayed(this.f16627d, 5000);
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final String f16628a;

        /* renamed from: b  reason: collision with root package name */
        private final String f16629b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f16630c;

        /* renamed from: d  reason: collision with root package name */
        private final DataChannel f16631d;

        /* renamed from: e  reason: collision with root package name */
        private final Runnable f16632e;

        static {
            Covode.recordClassIndex(9219);
        }

        public final void run() {
            Object obj;
            String str;
            String str2;
            String str3;
            com.bytedance.android.live.n.l livePlayControllerManager;
            k b2;
            String str4;
            Map map;
            Map map2;
            com.bytedance.android.livesdkapi.depend.model.live.i iVar;
            ao.a(y.e(), y.a((int) R.string.em7, this.f16628a), 0);
            String str5 = this.f16629b;
            DataChannel dataChannel = this.f16631d;
            if (dataChannel != null) {
                obj = dataChannel.b(di.class);
            } else {
                obj = null;
            }
            String valueOf = String.valueOf(obj);
            String str6 = "";
            if (valueOf == null) {
                valueOf = str6;
            }
            DataChannel dataChannel2 = this.f16631d;
            if (dataChannel2 == null || (iVar = (com.bytedance.android.livesdkapi.depend.model.live.i) dataChannel2.b(bx.class)) == null) {
                str = str6;
            } else {
                str = j.a(iVar);
            }
            boolean z = this.f16630c;
            String str7 = "0";
            if (z) {
                str2 = str7;
            } else if (!z) {
                str2 = "1";
            } else {
                throw new n();
            }
            DataChannel dataChannel3 = this.f16631d;
            if (dataChannel3 == null || (map2 = (Map) dataChannel3.b(g.class)) == null || (str3 = (String) map2.get("sdk_key")) == null) {
                str3 = str6;
            }
            try {
                DataChannel dataChannel4 = this.f16631d;
                if (dataChannel4 == null || (map = (Map) dataChannel4.b(g.class)) == null || (str4 = (String) map.get("start_time")) == null) {
                    str4 = String.valueOf(System.currentTimeMillis());
                }
                str7 = String.valueOf((System.currentTimeMillis() - Long.parseLong(str4)) / 1000);
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a(4, "SwitchDefinitionTipsWidget", "reportSwitchSuccess. catch exception=".concat(String.valueOf(e2)));
            }
            com.bytedance.android.live.d.b bVar = (com.bytedance.android.live.d.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.d.b.class);
            if (bVar != null) {
                bVar.reportAudienceDefinitionDialogSelectSuccess(valueOf, str, str2, str3, str7, "pool_connection", str5);
            }
            com.bytedance.android.livesdk.ap.b<Map<String, String>> bVar2 = com.bytedance.android.livesdk.ap.a.cQ;
            l.b(bVar2, str6);
            com.bytedance.android.livesdk.ap.c.a(bVar2, (Object) null);
            n.a aVar = new n.a();
            aVar.f7937a = this.f16628a;
            aVar.f7938b = this.f16629b;
            DataChannel dataChannel5 = this.f16631d;
            if (dataChannel5 != null) {
                dataChannel5.b(com.bytedance.android.livesdk.j.i.class, aVar);
            }
            com.bytedance.android.livesdkapi.session.f fVar = f.a.f23366a;
            l.b(fVar, str6);
            EnterRoomLinkSession a2 = fVar.a();
            l.b(a2, str6);
            String str8 = a2.f23354b.f23299c.E;
            if (str8 != null) {
                str6 = str8;
            }
            com.bytedance.android.live.i.a.d dVar = (com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class);
            if (!(dVar == null || (livePlayControllerManager = dVar.getLivePlayControllerManager()) == null || (b2 = livePlayControllerManager.b(str6)) == null)) {
                b2.e(true);
            }
            this.f16632e.run();
        }

        public a(String str, String str2, boolean z, DataChannel dataChannel, Runnable runnable) {
            l.d(str, "");
            l.d(str2, "");
            l.d(runnable, "");
            this.f16628a = str;
            this.f16629b = str2;
            this.f16630c = z;
            this.f16631d = dataChannel;
            this.f16632e = runnable;
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SwitchDefinitionTipsWidget f16634a;

        static {
            Covode.recordClassIndex(9222);
        }

        d(SwitchDefinitionTipsWidget switchDefinitionTipsWidget) {
            this.f16634a = switchDefinitionTipsWidget;
        }

        static final class a implements q {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f16635a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f16636b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ d f16637c;

            static {
                Covode.recordClassIndex(9223);
            }

            a(String str, String str2, d dVar) {
                this.f16635a = str;
                this.f16636b = str2;
                this.f16637c = dVar;
            }

            @Override // com.bytedance.android.livesdkapi.depend.d.q
            public final void a(final boolean z) {
                this.f16637c.f16634a.f16624a.post(new Runnable(this) {
                    /* class com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget.d.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f16638a;

                    static {
                        Covode.recordClassIndex(9224);
                    }

                    {
                        this.f16638a = r1;
                    }

                    public final void run() {
                        if (z) {
                            this.f16638a.f16637c.f16634a.f16626c = new a(this.f16638a.f16635a, this.f16638a.f16636b, this.f16638a.f16637c.f16634a.f16625b, this.f16638a.f16637c.f16634a.dataChannel, this.f16638a.f16637c.f16634a.f16627d);
                            Handler handler = this.f16638a.f16637c.f16634a.f16624a;
                            a aVar = this.f16638a.f16637c.f16634a.f16626c;
                            if (aVar == null) {
                                l.b();
                            }
                            handler.post(aVar);
                        }
                    }
                });
            }
        }

        public final void onClick(View view) {
            p<String, String> nextLowerLevelDefinition = ((com.bytedance.android.live.d.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.d.b.class)).getNextLowerLevelDefinition();
            com.bytedance.android.live.core.c.a.a(4, "SwitchDefinitionTipsWidget", "onInit. switchBtn click. nextLowerDefinition=".concat(String.valueOf(nextLowerLevelDefinition)));
            if (nextLowerLevelDefinition != null) {
                String first = nextLowerLevelDefinition.getFirst();
                String second = nextLowerLevelDefinition.getSecond();
                com.bytedance.android.livesdkapi.session.f fVar = f.a.f23366a;
                l.b(fVar, "");
                EnterRoomLinkSession a2 = fVar.a();
                l.b(a2, "");
                String str = a2.f23354b.f23299c.E;
                if (str == null) {
                    str = "";
                }
                com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class);
                l.b(a3, "");
                k b2 = ((com.bytedance.android.live.i.a.d) a3).getLivePlayControllerManager().b(str);
                if (b2 != null) {
                    b2.a(first, new a(second, first, this));
                }
            }
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<an, z> {
        final /* synthetic */ SwitchDefinitionTipsWidget this$0;

        static {
            Covode.recordClassIndex(9225);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SwitchDefinitionTipsWidget switchDefinitionTipsWidget) {
            super(1);
            this.this$0 = switchDefinitionTipsWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(an anVar) {
            an anVar2 = anVar;
            l.d(anVar2, "");
            if (this.this$0.f16625b) {
                this.this$0.a(anVar2.f15100a);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        ((LiveTextView) findViewById(R.id.zw)).setOnClickListener(new d(this));
    }

    public final void a(int i2) {
        ViewGroup.LayoutParams layoutParams;
        com.bytedance.android.live.core.c.a.a(4, "SwitchDefinitionTipsWidget", "updateViewPosition. videoBottom=".concat(String.valueOf(i2)));
        if (i2 > 0) {
            View view = getView();
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = y.b() - i2;
                View view2 = getView();
                if (view2 != null) {
                    view2.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        boolean z;
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (bool = (Boolean) dataChannel.b(cp.class)) == null) {
            z = true;
        } else {
            z = bool.booleanValue();
        }
        this.f16625b = z;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.b(ad.class, (h.f.a.b) new e(this));
        }
    }
}
