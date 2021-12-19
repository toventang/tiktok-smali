package com.bytedance.android.live.broadcast.preview;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.model.k;
import com.bytedance.android.live.broadcast.model.o;
import com.bytedance.android.live.broadcast.utils.d;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.j.aq;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.FontSpan;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.j;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f8266a = new p();

    private p() {
    }

    public static final class b implements IBroadcastService.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DataChannel f8268a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f8269b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f8270c;

        /* renamed from: com.bytedance.android.live.broadcast.preview.p$b$b  reason: collision with other inner class name */
        static final class C0127b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final C0127b f8272a = new C0127b();

            static {
                Covode.recordClassIndex(4201);
            }

            C0127b() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(4199);
        }

        @Override // com.bytedance.android.live.broadcast.api.IBroadcastService.a
        public final /* synthetic */ z a() {
            com.bytedance.android.livesdkapi.depend.model.a.e eVar = (com.bytedance.android.livesdkapi.depend.model.a.e) this.f8270c.invoke();
            if (eVar != null) {
                eVar.a();
            }
            return z.f158842a;
        }

        static final class a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f8271a;

            static {
                Covode.recordClassIndex(4200);
            }

            a(b bVar) {
                this.f8271a = bVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                if (((o) ((com.bytedance.android.live.network.response.d) obj).data).t == 3) {
                    a.a(this.f8271a.f8269b, this.f8271a.f8268a);
                }
            }
        }

        @Override // com.bytedance.android.live.broadcast.api.IBroadcastService.a
        public final /* synthetic */ z a(String str) {
            l.d(str, "");
            if (str.length() > 0) {
                com.bytedance.android.livesdk.utils.p.a(str);
            }
            return z.f158842a;
        }

        @Override // com.bytedance.android.live.broadcast.api.IBroadcastService.a
        public final /* synthetic */ z a(String str, String str2) {
            long j2;
            Long l2;
            ao.a(y.e(), (int) R.string.dvk);
            Hashtag hashtag = (Hashtag) this.f8268a.b(aq.class);
            if (hashtag == null || (l2 = hashtag.id) == null) {
                j2 = 0;
            } else {
                j2 = l2.longValue();
            }
            d.a.a().a().getPreviewRoomCreateInfo(j2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this), C0127b.f8272a);
            return z.f158842a;
        }

        b(DataChannel dataChannel, Activity activity, h.f.a.a aVar) {
            this.f8268a = dataChannel;
            this.f8269b = activity;
            this.f8270c = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class e extends j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(4204);
        }

        e(IBroadcastService.a aVar) {
            super(0, aVar, IBroadcastService.a.class, "onDialogCanceled", "onDialogCanceled()Lkotlin/Unit;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            return ((IBroadcastService.a) this.receiver).a();
        }
    }

    static {
        Covode.recordClassIndex(4197);
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class d extends j implements h.f.a.b<String, z> {
        static {
            Covode.recordClassIndex(4203);
        }

        d(IBroadcastService.a aVar) {
            super(1, aVar, IBroadcastService.a.class, "onFailed", "onFailed(Ljava/lang/String;)Lkotlin/Unit;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            return ((IBroadcastService.a) this.receiver).a(str);
        }
    }

    public static final class f extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DataChannel f8273a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f8274b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f8275c;

        static {
            Covode.recordClassIndex(4205);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
        }

        public final void onClick(View view) {
            l.d(view, "");
            b.a.a("livesdk_appeal_click").a(this.f8273a).a("appeal_type", "age").b();
            com.bytedance.android.livesdk.browser.c.d webViewManager = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager();
            Context context = this.f8274b;
            d.a b2 = com.bytedance.android.livesdk.browser.c.e.b("https://webcast.tiktokv.com/falcon/webcast_mt/page/appeal_v3/index.html?enter_from=live_takepage");
            b2.f14292c = true;
            b2.f14291b = y.a((int) R.string.dv9);
            webViewManager.a(context, b2);
        }

        f(DataChannel dataChannel, Context context, String str) {
            this.f8273a = dataChannel;
            this.f8274b = context;
            this.f8275c = str;
        }
    }

    static final class a extends m implements h.f.a.m<Activity, DataChannel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8267a = new a();

        static {
            Covode.recordClassIndex(4198);
        }

        a() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Activity activity, DataChannel dataChannel) {
            a(activity, dataChannel);
            return z.f158842a;
        }

        public static void a(Activity activity, DataChannel dataChannel) {
            l.d(activity, "");
            l.d(dataChannel, "");
            dataChannel.c(com.bytedance.android.live.broadcast.a.class);
            p.a(activity, dataChannel);
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class c extends j implements h.f.a.m<String, String, z> {
        static {
            Covode.recordClassIndex(4202);
        }

        c(IBroadcastService.a aVar) {
            super(2, aVar, IBroadcastService.a.class, "onSuccess", "onSuccess(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, String str2) {
            return ((IBroadcastService.a) this.receiver).a(str, str2);
        }
    }

    public static void a(Context context, DataChannel dataChannel) {
        String str = y.a((int) R.string.dv9) + " >";
        SpannableString spannableString = new SpannableString(y.a((int) R.string.dvo, Integer.valueOf(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue())) + '\n' + str);
        spannableString.setSpan(new f(dataChannel, context, str), spannableString.length() - str.length(), spannableString.length(), 17);
        spannableString.setSpan(new FontSpan(com.bytedance.ies.dmt.ui.widget.util.d.f33801g), spannableString.length() - str.length(), spannableString.length(), 17);
        dataChannel.c(com.bytedance.android.live.broadcast.f.class, new k(0, com.bytedance.android.live.broadcast.model.l.AGE_GATE_BLOCK, spannableString));
        b.a.a("livesdk_live_banned_toast_show").a(dataChannel).c("show").a("show_scene", "age_appeal").b();
    }

    public static void a(Activity activity, int i2, DataChannel dataChannel, h.f.a.a<? extends com.bytedance.android.livesdkapi.depend.model.a.e> aVar) {
        l.d(activity, "");
        l.d(dataChannel, "");
        l.d(aVar, "");
        if (i2 == 1) {
            a(activity, "live_host", "live_takepage", new b(dataChannel, activity, aVar));
        } else if (i2 == 3) {
            a.a(activity, dataChannel);
        }
    }

    public static void a(Activity activity, String str, String str2, IBroadcastService.a aVar) {
        l.d(activity, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(aVar, "");
        if (com.bytedance.android.live.broadcast.b.e.a(activity, str, str2, new c(aVar), new d(aVar), new e(aVar))) {
            b.a.a("livesdk_add_birth_popup_window_show").a().a("request_page", str2).b();
        }
    }
}
