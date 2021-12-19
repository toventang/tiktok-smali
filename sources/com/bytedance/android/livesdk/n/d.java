package com.bytedance.android.livesdk.n;

import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.View;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.n.b;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class d extends v implements DialogInterface {

    /* renamed from: a  reason: collision with root package name */
    public boolean f19830a;

    /* renamed from: b  reason: collision with root package name */
    public IHostLongPressCallback f19831b;

    /* renamed from: c  reason: collision with root package name */
    public Room f19832c;

    /* renamed from: d  reason: collision with root package name */
    public String f19833d;

    /* renamed from: e  reason: collision with root package name */
    public String f19834e;

    /* renamed from: f  reason: collision with root package name */
    public String f19835f;

    /* renamed from: g  reason: collision with root package name */
    private final h.f.a.b<View, z> f19836g = new a(this);

    /* renamed from: h  reason: collision with root package name */
    private HashMap f19837h;

    final /* synthetic */ class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f19838a;

        static {
            Covode.recordClassIndex(11757);
        }

        b(h.f.a.b bVar) {
            this.f19838a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            l.b(this.f19838a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(11755);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f19837h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f19837h == null) {
            this.f19837h = new HashMap();
        }
        View view = (View) this.f19837h.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f19837h.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public final void cancel() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.cancel();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b7h);
        bVar.f22375b = R.style.a38;
        bVar.f22380g = 17;
        bVar.f22382i = -1;
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        e eVar = new e();
        eVar.f19839a = true;
        com.bytedance.android.livesdk.an.a.a().a(eVar);
    }

    static final class a extends m implements h.f.a.b<View, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(11756);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            View view2 = view;
            String str = "";
            l.d(view2, str);
            if (view2.getId() == R.id.cwg) {
                IHostLongPressCallback iHostLongPressCallback = this.this$0.f19831b;
                if (iHostLongPressCallback != null) {
                    iHostLongPressCallback.onDislikePressed();
                }
                Room room = this.this$0.f19832c;
                if (room != null) {
                    String str2 = this.this$0.f19833d;
                    if (str2 == null) {
                        str2 = str;
                    }
                    String str3 = this.this$0.f19834e;
                    if (str3 != null) {
                        str = str3;
                    }
                    b.a(room, str2, str, b.a.LONG_PRESS);
                }
            } else if (view2.getId() == R.id.dlv) {
                IHostLongPressCallback iHostLongPressCallback2 = this.this$0.f19831b;
                if (iHostLongPressCallback2 != null) {
                    iHostLongPressCallback2.onReportPressed();
                }
                Room room2 = this.this$0.f19832c;
                if (room2 != null) {
                    String str4 = this.this$0.f19833d;
                    if (str4 == null) {
                        str4 = str;
                    }
                    String str5 = this.this$0.f19834e;
                    if (str5 != null) {
                        str = str5;
                    }
                    com.bytedance.android.livesdk.watch.chatroom.b.a(room2, str4, str, this.this$0.f19835f);
                }
            } else if (view2.getId() == R.id.an0) {
                this.this$0.dismissAllowingStateLoss();
            }
            this.this$0.dismissAllowingStateLoss();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        if (context != null) {
            try {
                Object a2 = a(context, "vibrator");
                if (a2 != null) {
                    ((Vibrator) a2).vibrate(15);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
                }
            } catch (Exception unused) {
            }
        }
        Room room = this.f19832c;
        if (room != null) {
            String str = this.f19833d;
            if (str == null) {
                str = "";
            }
            String str2 = this.f19834e;
            if (str2 == null) {
                str2 = "";
            }
            l.d(room, "");
            l.d(str, "");
            l.d(str2, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            com.bytedance.android.livesdk.watch.chatroom.b.a(linkedHashMap, room, str, str2, "long_press");
            b.a.a("live_report_icon_show").a("request_page", "long_press").a("report_type", "long_press").a("show_type", "long_press").a().a((Map<String, String>) linkedHashMap).b();
        }
        e eVar = new e();
        eVar.f19839a = false;
        com.bytedance.android.livesdk.an.a.a().a(eVar);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(1795);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
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
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(1795);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.livesdk.n.d$b] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.livesdk.n.d$b] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.livesdk.n.d$b] */
    /* JADX WARNING: Unknown variable types count: 3 */
    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r6, r3)
            r4 = 2131366762(0x7f0a136a, float:1.8353427E38)
            android.view.View r2 = r5.a_(r4)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            h.f.a.b<android.view.View, h.z> r1 = r5.f19836g
            if (r1 == 0) goto L_0x0018
            com.bytedance.android.livesdk.n.d$b r0 = new com.bytedance.android.livesdk.n.d$b
            r0.<init>(r1)
            r1 = r0
        L_0x0018:
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r2.setOnClickListener(r1)
            r0 = 2131363670(0x7f0a0756, float:1.8347155E38)
            android.view.View r2 = r5.a_(r0)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            h.f.a.b<android.view.View, h.z> r1 = r5.f19836g
            if (r1 == 0) goto L_0x0030
            com.bytedance.android.livesdk.n.d$b r0 = new com.bytedance.android.livesdk.n.d$b
            r0.<init>(r1)
            r1 = r0
        L_0x0030:
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r2.setOnClickListener(r1)
            r0 = 2131367739(0x7f0a173b, float:1.8355408E38)
            android.view.View r2 = r5.a_(r0)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            h.f.a.b<android.view.View, h.z> r1 = r5.f19836g
            if (r1 == 0) goto L_0x0048
            com.bytedance.android.livesdk.n.d$b r0 = new com.bytedance.android.livesdk.n.d$b
            r0.<init>(r1)
            r1 = r0
        L_0x0048:
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r2.setOnClickListener(r1)
            boolean r0 = r5.f19830a
            if (r0 == 0) goto L_0x005f
            android.view.View r1 = r5.a_(r4)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            h.f.b.l.b(r1, r3)
            r0 = 8
            r1.setVisibility(r0)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.n.d.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
