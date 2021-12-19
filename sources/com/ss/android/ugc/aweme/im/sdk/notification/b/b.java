package com.ss.android.ugc.aweme.im.sdk.notification.b;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.u;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.g;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.notification.a.k;
import com.ss.android.ugc.aweme.im.sdk.notification.b.a;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.a;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f102905e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f102906a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f102907b;

    /* renamed from: c  reason: collision with root package name */
    public a f102908c;

    /* renamed from: d  reason: collision with root package name */
    public k f102909d;

    /* renamed from: f  reason: collision with root package name */
    private final CountDownTimer f102910f = new d(this);

    static {
        Covode.recordClassIndex(65963);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65964);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.b.b$b  reason: collision with other inner class name */
    public static final class C2600b implements com.bytedance.im.core.a.a.b<h> {
        static {
            Covode.recordClassIndex(65965);
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(u uVar) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* bridge */ /* synthetic */ void a(h hVar) {
        }

        C2600b() {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ h.f.a.a $dismissListener$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(65966);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, h.f.a.a aVar) {
            super(0);
            this.this$0 = bVar;
            this.$dismissListener$inlined = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            MethodCollector.i(5110);
            ViewGroup viewGroup = this.this$0.f102907b;
            if (viewGroup != null) {
                viewGroup.removeView(this.this$0.f102908c);
            }
            this.this$0.f102906a = false;
            h.f.a.a aVar = this.$dismissListener$inlined;
            if (aVar != null) {
                aVar.invoke();
            }
            z zVar = z.f158842a;
            MethodCollector.o(5110);
            return zVar;
        }
    }

    public static final class d extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f102911a;

        static {
            Covode.recordClassIndex(65967);
        }

        public final void onTick(long j2) {
        }

        public final void onFinish() {
            Integer num;
            String str = null;
            this.f102911a.a((h.f.a.a<z>) null);
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().getEnterFrom()).a("action_type", "auto");
            k kVar = this.f102911a.f102909d;
            if (kVar != null) {
                num = kVar.t;
            } else {
                num = null;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("chat_cnt", num);
            k kVar2 = this.f102911a.f102909d;
            if (kVar2 != null) {
                str = kVar2.u;
            }
            r.a("close_message_inner_push", a3.a("from_user_id", str).f66730a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(5000, 50);
            this.f102911a = bVar;
        }
    }

    public final void a(h.f.a.a<z> aVar) {
        a aVar2 = this.f102908c;
        if (aVar2 != null && this.f102906a) {
            c cVar = new c(this, aVar);
            float f2 = (-((float) aVar2.getMeasuredHeight())) - ((float) aVar2.f102892c);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar2.f102890a, "translationY", 0.0f, f2);
            l.b(ofFloat, "");
            ofFloat.setDuration(300L);
            ofFloat.addUpdateListener(new a.b(f2, cVar));
            ofFloat.start();
        }
        this.f102910f.cancel();
        this.f102908c = null;
        this.f102907b = null;
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ k $content$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(65968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, k kVar) {
            super(1);
            this.this$0 = bVar;
            this.$content$inlined = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            h a2;
            Map<String, String> map;
            Map<String, String> ext;
            Integer num2;
            int intValue = num.intValue();
            if (intValue != 0) {
                String str = null;
                if (intValue == 1) {
                    k kVar = this.this$0.f102909d;
                    if (!(kVar == null || (a2 = a.C0745a.a().a(kVar.f102870c)) == null)) {
                        com.bytedance.im.core.d.l settingInfo = a2.getSettingInfo();
                        if (settingInfo == null || (ext = settingInfo.getExt()) == null || (map = ag.d(ext)) == null || map.isEmpty()) {
                            map = new LinkedHashMap<>();
                        }
                        map.put("a:s_awe_push_close", "1");
                        com.bytedance.im.core.d.l settingInfo2 = a2.getSettingInfo();
                        if (settingInfo2 != null) {
                            settingInfo2.setExt(map);
                        }
                        if (kVar.f102870c != null) {
                            b.a.a(kVar.f102870c).a(map, new C2600b());
                        }
                    }
                } else if (intValue == 3) {
                    this.this$0.a((h.f.a.a<z>) null);
                    com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().getEnterFrom()).a("action_type", "slide_up");
                    k kVar2 = this.this$0.f102909d;
                    if (kVar2 != null) {
                        num2 = kVar2.t;
                    } else {
                        num2 = null;
                    }
                    com.ss.android.ugc.aweme.app.f.d a4 = a3.a("chat_cnt", num2);
                    k kVar3 = this.this$0.f102909d;
                    if (kVar3 != null) {
                        str = kVar3.u;
                    }
                    r.a("close_message_inner_push", a4.a("from_user_id", str).f66730a);
                }
            } else {
                this.this$0.a(new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.im.sdk.notification.b.b.e.AnonymousClass1 */
                    final /* synthetic */ e this$0;

                    static {
                        Covode.recordClassIndex(65969);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        k kVar = this.this$0.this$0.f102909d;
                        if (kVar != null) {
                            if (kVar.f102868a != 1) {
                                if (kVar.p && com.bytedance.ies.abmock.b.a().a(true, "polymeric_message_after_launch", 0) == 1) {
                                    t.a(t.a(), com.ss.android.ugc.aweme.ck.u.a("aweme://main").a("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION").a());
                                }
                                com.ss.android.ugc.aweme.im.sdk.notification.a.e.f102841b.a(kVar.f102870c);
                                Integer num = kVar.f102869b;
                                int i2 = e.a.f37581a;
                                if (num != null && num.intValue() == i2) {
                                    ChatRoomActivity.a.a(a.b.a((Context) com.ss.android.ugc.aweme.im.sdk.common.controller.e.a.a(), g.a(String.valueOf(b.a.c(kVar.f102870c)), com.ss.android.ugc.aweme.im.sdk.common.controller.e.c.a(kVar.f102870c))).c("inner_push").b("cell").f103883a);
                                } else {
                                    int i3 = e.a.f37582b;
                                    if (num != null && num.intValue() == i3) {
                                        ChatRoomActivity.a.a(a.b.a(com.ss.android.ugc.aweme.im.sdk.common.controller.e.a.a(), 3, kVar.f102870c).c("inner_push").b("cell").f103883a);
                                    }
                                }
                            } else {
                                com.ss.android.ugc.aweme.im.sdk.notification.a.e.f102841b.a(kVar.f102870c);
                                if (kVar.s.size() == 1) {
                                    ChatRoomActivity.a.a(a.b.a(com.ss.android.ugc.aweme.im.sdk.common.controller.e.a.a(), (IMContact) n.b(kVar.s, 0)).c("inner_push").b("cell").f103883a);
                                } else {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("enter_from", "inner_push");
                                    Activity a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.a.a();
                                    if (a2 != null) {
                                        IMService.Companion.get().openSessionListActivity(a2, bundle);
                                    }
                                }
                            }
                        }
                        return z.f158842a;
                    }
                });
            }
            return z.f158842a;
        }
    }

    public final void a(k kVar) {
        ViewGroup viewGroup;
        String str;
        MethodCollector.i(6382);
        if (kVar != null) {
            this.f102909d = kVar;
            com.ss.android.ugc.aweme.im.service.e b2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b();
            if (b2 != null) {
                viewGroup = b2.getCurrentDecorView(com.ss.android.ugc.aweme.im.sdk.common.controller.e.a.a());
            } else {
                viewGroup = null;
            }
            this.f102907b = viewGroup;
            this.f102910f.cancel();
            this.f102910f.start();
            if (this.f102906a) {
                a aVar = this.f102908c;
                if (aVar != null) {
                    aVar.a(this.f102909d);
                }
            } else {
                Activity a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.a.a();
                if (a2 == null) {
                    MethodCollector.o(6382);
                    return;
                }
                this.f102906a = true;
                a aVar2 = new a(a2, (byte) 0);
                aVar2.a(this.f102909d);
                aVar2.a();
                aVar2.setActionListener(new e(this, kVar));
                this.f102908c = aVar2;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 48;
                layoutParams.topMargin = com.bytedance.common.utility.n.e(com.ss.android.ugc.aweme.im.sdk.common.controller.e.a.a());
                ViewGroup viewGroup2 = this.f102907b;
                if (viewGroup2 != null) {
                    viewGroup2.addView(this.f102908c, layoutParams);
                }
            }
            r.a("show_message_inner_push", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().getEnterFrom()).a("chat_cnt", kVar.t).a("from_user_id", kVar.u).f66730a);
            if (kVar.f102868a == 3) {
                Integer num = kVar.f102869b;
                int i2 = e.a.f37581a;
                if (num != null && num.intValue() == i2) {
                    str = "private";
                } else {
                    str = "group";
                }
                com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.c(str);
            }
            MethodCollector.o(6382);
            return;
        }
        MethodCollector.o(6382);
    }
}
