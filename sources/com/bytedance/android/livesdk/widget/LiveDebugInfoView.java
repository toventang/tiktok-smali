package com.bytedance.android.livesdk.widget;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveSwitch;
import com.bytedance.android.livesdk.ab.d.b;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.b.s;
import com.bytedance.android.livesdk.chatroom.b.t;
import com.bytedance.android.livesdk.e;
import com.bytedance.android.livesdk.j.cx;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.bytedance.android.livesdkapi.depend.model.live.DebugRoomItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.f;
import com.bytedance.android.livesdkapi.m.d;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.a.a.a;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

public final class LiveDebugInfoView extends LiveRecyclableWidget implements View.OnClickListener, View.OnLongClickListener, a.AbstractC0502a, au {

    /* renamed from: a  reason: collision with root package name */
    private final int f22486a = 18;

    /* renamed from: b  reason: collision with root package name */
    private final long f22487b = 5000;

    /* renamed from: c  reason: collision with root package name */
    private final String f22488c = "LiveDebugInfoView";

    /* renamed from: d  reason: collision with root package name */
    private List<DebugRoomItem> f22489d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private List<DebugRoomItem> f22490e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final h f22491f = d.a(new a(this));

    /* renamed from: g  reason: collision with root package name */
    private TextView f22492g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f22493h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f22494i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f22495j;

    /* renamed from: k  reason: collision with root package name */
    private View f22496k;

    /* renamed from: l  reason: collision with root package name */
    private View f22497l;

    /* renamed from: m  reason: collision with root package name */
    private View f22498m;
    private LiveSwitch n;
    private LinearLayout o;
    private LinearLayout p;
    private LinearLayout q;
    private LinearLayout r;
    private Room s;
    private int t;
    private int u;

    static {
        Covode.recordClassIndex(13274);
    }

    private final com.bytedance.android.livesdkapi.depend.c.a a() {
        return (com.bytedance.android.livesdkapi.depend.c.a) this.f22491f.getValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bcb;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static final class a extends h.f.b.m implements h.f.a.a<com.bytedance.android.livesdkapi.depend.c.a> {
        final /* synthetic */ LiveDebugInfoView this$0;

        static {
            Covode.recordClassIndex(13275);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LiveDebugInfoView liveDebugInfoView) {
            super(0);
            this.this$0 = liveDebugInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.livesdkapi.depend.c.a invoke() {
            return new com.bytedance.android.livesdkapi.depend.c.a(this.this$0);
        }
    }

    private final void j() {
        if (this.f22490e.isEmpty()) {
            hide();
        } else {
            show();
        }
    }

    private final void c() {
        int i2 = this.t;
        if (i2 == 1) {
            e();
        } else if (i2 != 2) {
            d();
        } else {
            f();
        }
    }

    private final void k() {
        DebugRoomItem debugRoomItem = new DebugRoomItem(null, null, 3, null);
        String a2 = y.a((int) R.string.dzs);
        if (a2 == null) {
            a2 = "";
        }
        debugRoomItem.setTabTitle(a2);
        debugRoomItem.setTabContent("");
        this.f22490e.add(debugRoomItem);
    }

    private final void b() {
        LiveSwitch liveSwitch = this.n;
        if (liveSwitch == null) {
            l.a("mSwitchView");
        }
        liveSwitch.setChecked(f.f23136b);
        if (f.f23136b) {
            LinearLayout linearLayout = this.o;
            if (linearLayout == null) {
                l.a("mLinearContainer");
            }
            linearLayout.setVisibility(0);
            return;
        }
        LinearLayout linearLayout2 = this.o;
        if (linearLayout2 == null) {
            l.a("mLinearContainer");
        }
        linearLayout2.setVisibility(4);
    }

    private final void i() {
        this.f22490e.clear();
        if (this.f22489d.isEmpty()) {
            k();
        } else {
            this.f22490e.add(this.f22489d.get(0));
        }
        l();
        m();
        j();
    }

    private final void l() {
        DebugRoomItem debugRoomItem = new DebugRoomItem(null, null, 3, null);
        String a2 = y.a((int) R.string.dzt);
        if (a2 == null) {
            a2 = "";
        }
        debugRoomItem.setTabTitle(a2);
        debugRoomItem.setTabContent(g());
        this.f22490e.add(debugRoomItem);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (a() != null) {
            a().removeCallbacksAndMessages(null);
        }
        if (this.n == null) {
            l.a("mSwitchView");
            return;
        }
        LiveSwitch liveSwitch = this.n;
        if (liveSwitch == null) {
            l.a("mSwitchView");
        }
        liveSwitch.clearAnimation();
    }

    private final void d() {
        TextView textView = this.f22492g;
        if (textView == null) {
            l.a("mTextViewBasic");
        }
        textView.setText(y.a((int) R.string.dzs));
        TextView textView2 = this.f22495j;
        if (textView2 == null) {
            l.a("mTextViewContent");
        }
        textView2.setText("");
        if (!this.f22490e.isEmpty()) {
            DebugRoomItem debugRoomItem = this.f22490e.get(0);
            TextView textView3 = this.f22495j;
            if (textView3 == null) {
                l.a("mTextViewContent");
            }
            textView3.setText(debugRoomItem.getTabContent());
            TextView textView4 = this.f22492g;
            if (textView4 == null) {
                l.a("mTextViewBasic");
            }
            textView4.setText(debugRoomItem.getTabTitle());
        }
    }

    private final void e() {
        TextView textView = this.f22493h;
        if (textView == null) {
            l.a("mTextViewPerformance");
        }
        textView.setText(y.a((int) R.string.dzt));
        TextView textView2 = this.f22495j;
        if (textView2 == null) {
            l.a("mTextViewContent");
        }
        textView2.setText("");
        if (!(!this.f22490e.isEmpty()) || this.f22490e.size() <= 1) {
            String g2 = g();
            if (!TextUtils.isEmpty(g2)) {
                TextView textView3 = this.f22495j;
                if (textView3 == null) {
                    l.a("mTextViewContent");
                }
                textView3.setText(g2);
                return;
            }
            return;
        }
        DebugRoomItem debugRoomItem = this.f22490e.get(1);
        TextView textView4 = this.f22495j;
        if (textView4 == null) {
            l.a("mTextViewContent");
        }
        textView4.setText(debugRoomItem.getTabContent());
        TextView textView5 = this.f22493h;
        if (textView5 == null) {
            l.a("mTextViewPerformance");
        }
        textView5.setText(debugRoomItem.getTabTitle());
    }

    private final void f() {
        TextView textView = this.f22494i;
        if (textView == null) {
            l.a("mTextViewRecommend");
        }
        textView.setText(y.a((int) R.string.dzu));
        TextView textView2 = this.f22495j;
        if (textView2 == null) {
            l.a("mTextViewContent");
        }
        textView2.setText("");
        if ((!this.f22490e.isEmpty()) && this.f22490e.size() > 2) {
            DebugRoomItem debugRoomItem = this.f22490e.get(2);
            TextView textView3 = this.f22495j;
            if (textView3 == null) {
                l.a("mTextViewContent");
            }
            textView3.setText(debugRoomItem.getTabContent());
            TextView textView4 = this.f22494i;
            if (textView4 == null) {
                l.a("mTextViewRecommend");
            }
            textView4.setText(debugRoomItem.getTabTitle());
        }
    }

    private final void m() {
        String str;
        DataChannel provideDataChannel = provideDataChannel();
        String str2 = "";
        if (provideDataChannel == null || (str = (String) provideDataChannel.b(e.class)) == null) {
            str = str2;
        }
        DebugRoomItem debugRoomItem = new DebugRoomItem(null, null, 3, null);
        String a2 = y.a((int) R.string.dzu);
        if (a2 != null) {
            str2 = a2;
        }
        debugRoomItem.setTabTitle(str2);
        debugRoomItem.setTabContent(str);
        this.f22490e.add(debugRoomItem);
        if (TextUtils.isEmpty(str)) {
            TextView textView = this.f22494i;
            if (textView == null) {
                l.a("mTextViewRecommend");
            }
            textView.setVisibility(8);
            return;
        }
        TextView textView2 = this.f22494i;
        if (textView2 == null) {
            l.a("mTextViewRecommend");
        }
        textView2.setVisibility(0);
    }

    private static String g() {
        JSONObject e2;
        b bVar = (b) DataChannelGlobal.f34575d.b(cx.class);
        if (bVar == null || (e2 = bVar.e()) == null) {
            return "";
        }
        return "Resolution：" + Integer.valueOf(e2.optInt("width:", -1)) + " * " + Integer.valueOf(e2.optInt("height:", -1)) + "\r\nCodec：" + e2.optString("Codec_Type:", "") + "\r\nStream protocol：" + e2.optString("play_protocol:", "") + "\r\nFrame rate：" + Integer.valueOf(e2.optInt("render_fps:", -1)) + "\r\nBitrate：" + Integer.valueOf(e2.optInt("download_Speed:", -1)) + "\r\nPush client：" + e2.optString("sei_source:", "") + "\r\nConnection speed：" + Long.valueOf(e2.optLong("download_Speed:", -1)) + "\r\nBuffer health：" + Long.valueOf(e2.optLong("video_Buffer_Time:", -1)) + "\r\nLive latency：" + Long.valueOf(e2.optLong("delay:", -1));
    }

    private final void h() {
        TextView textView = this.f22492g;
        if (textView == null) {
            l.a("mTextViewBasic");
        }
        textView.setSelected(false);
        TextView textView2 = this.f22493h;
        if (textView2 == null) {
            l.a("mTextViewPerformance");
        }
        textView2.setSelected(false);
        TextView textView3 = this.f22494i;
        if (textView3 == null) {
            l.a("mTextViewRecommend");
        }
        textView3.setSelected(false);
        View view = this.f22496k;
        if (view == null) {
            l.a("mLineBasic");
        }
        view.setVisibility(8);
        View view2 = this.f22497l;
        if (view2 == null) {
            l.a("mLinePerformance");
        }
        view2.setVisibility(8);
        View view3 = this.f22498m;
        if (view3 == null) {
            l.a("mLineRecommend");
        }
        view3.setVisibility(8);
        int i2 = this.t;
        if (i2 == 1) {
            TextView textView4 = this.f22493h;
            if (textView4 == null) {
                l.a("mTextViewPerformance");
            }
            textView4.setSelected(true);
            View view4 = this.f22497l;
            if (view4 == null) {
                l.a("mLinePerformance");
            }
            view4.setVisibility(0);
        } else if (i2 != 2) {
            TextView textView5 = this.f22492g;
            if (textView5 == null) {
                l.a("mTextViewBasic");
            }
            textView5.setSelected(true);
            View view5 = this.f22496k;
            if (view5 == null) {
                l.a("mLineBasic");
            }
            view5.setVisibility(0);
        } else {
            TextView textView6 = this.f22494i;
            if (textView6 == null) {
                l.a("mTextViewRecommend");
            }
            textView6.setSelected(true);
            View view6 = this.f22498m;
            if (view6 == null) {
                l.a("mLineRecommend");
            }
            view6.setVisibility(0);
        }
    }

    public final void onClick(View view) {
        Integer valueOf;
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.eh4) {
                this.t = 0;
                h();
                c();
            } else if (valueOf != null) {
                if (valueOf.intValue() == R.id.ehg) {
                    this.t = 1;
                    h();
                    c();
                } else if (valueOf.intValue() == R.id.ehh) {
                    this.t = 2;
                    h();
                    c();
                } else if (valueOf.intValue() == R.id.ain) {
                    f.f23136b = !f.f23136b;
                    b();
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.c.a.AbstractC0502a
    public final void handleMsg(Message message) {
        Integer num;
        if (message != null) {
            num = Integer.valueOf(message.what);
        } else {
            num = null;
        }
        int i2 = this.f22486a;
        if (num != null) {
            if (num.intValue() == i2) {
                if (this.f22489d.isEmpty() && this.u < 2) {
                    com.bytedance.android.livesdkapi.depend.c.a a2 = a();
                    Room room = this.s;
                    if (room == null) {
                        l.a("mRoom");
                    }
                    ((RoomRetrofitApi) com.bytedance.android.live.network.e.a().a(RoomRetrofitApi.class)).getRoomDebugInfo(room.getId()).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new s(a2), new t(a2));
                    this.u++;
                }
                i();
                c();
                a().sendEmptyMessageDelayed(this.f22486a, this.f22487b);
            } else if (num.intValue() == 39 && message.obj != null && (message.obj instanceof ArrayList)) {
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.bytedance.android.livesdkapi.depend.model.live.DebugRoomItem> /* = java.util.ArrayList<com.bytedance.android.livesdkapi.depend.model.live.DebugRoomItem> */");
                this.f22489d = (ArrayList) obj;
                i();
                c();
            }
        }
    }

    public final boolean onLongClick(View view) {
        if (!this.f22490e.isEmpty()) {
            a().removeMessages(this.f22486a);
            try {
                String tabContent = this.f22490e.get(0).getTabContent();
                for (int i2 = 1; i2 < this.f22490e.size(); i2++) {
                    tabContent = tabContent + "\r\n" + this.f22490e.get(i2).getTabContent();
                }
                Object a2 = a(getContext(), "clipboard");
                if (a2 != null) {
                    ClipData newPlainText = ClipData.newPlainText(tabContent, tabContent);
                    l.b(newPlainText, "");
                    a.C0567a.a((ClipboardManager) a2, newPlainText, PrivacyCert.Builder.Companion.with("bpea-1055").usage("").tag("").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
                    ao.a("copided");
                    a().sendEmptyMessageDelayed(this.f22486a, this.f22487b);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
                }
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a(this.f22488c, e2);
            }
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        View findViewById = findViewById(R.id.f8p);
        l.b(findViewById, "");
        this.f22492g = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.f8v);
        l.b(findViewById2, "");
        this.f22493h = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.f8w);
        l.b(findViewById3, "");
        this.f22494i = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.ey8);
        l.b(findViewById4, "");
        this.f22495j = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.can);
        l.b(findViewById5, "");
        this.o = (LinearLayout) findViewById5;
        View findViewById6 = findViewById(R.id.ain);
        l.b(findViewById6, "");
        this.n = (LiveSwitch) findViewById6;
        View findViewById7 = findViewById(R.id.eh4);
        l.b(findViewById7, "");
        this.p = (LinearLayout) findViewById7;
        View findViewById8 = findViewById(R.id.ehg);
        l.b(findViewById8, "");
        this.q = (LinearLayout) findViewById8;
        View findViewById9 = findViewById(R.id.ehh);
        l.b(findViewById9, "");
        this.r = (LinearLayout) findViewById9;
        View findViewById10 = findViewById(R.id.cab);
        l.b(findViewById10, "");
        this.f22496k = findViewById10;
        View findViewById11 = findViewById(R.id.caf);
        l.b(findViewById11, "");
        this.f22497l = findViewById11;
        View findViewById12 = findViewById(R.id.cah);
        l.b(findViewById12, "");
        this.f22498m = findViewById12;
        LinearLayout linearLayout = this.p;
        if (linearLayout == null) {
            l.a("mTabBasic");
        }
        linearLayout.setOnClickListener(this);
        LinearLayout linearLayout2 = this.q;
        if (linearLayout2 == null) {
            l.a("mTabPerformance");
        }
        linearLayout2.setOnClickListener(this);
        LinearLayout linearLayout3 = this.r;
        if (linearLayout3 == null) {
            l.a("mTabRecommend");
        }
        linearLayout3.setOnClickListener(this);
        LiveSwitch liveSwitch = this.n;
        if (liveSwitch == null) {
            l.a("mSwitchView");
        }
        liveSwitch.setOnClickListener(this);
        TextView textView = this.f22495j;
        if (textView == null) {
            l.a("mTextViewContent");
        }
        textView.setOnLongClickListener(this);
        if (!(objArr == null || objArr.length == 0 || !(objArr[0] instanceof Room))) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
            if (Room.isValid((Room) obj)) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                this.s = (Room) obj2;
            }
        }
        this.u = 0;
        h();
        b();
        a().sendEmptyMessage(this.f22486a);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(4228);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(4228);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
