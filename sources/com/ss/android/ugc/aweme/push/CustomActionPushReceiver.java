package com.ss.android.ugc.aweme.push;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.commercialize.utils.aq;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.push.d;
import com.ss.android.ugc.aweme.push.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import org.json.JSONObject;

public final class CustomActionPushReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f118840a = "message_type";

    /* renamed from: b  reason: collision with root package name */
    public static final String f118841b = "message_obj";

    /* renamed from: c  reason: collision with root package name */
    public static final String f118842c = "message_from";

    /* renamed from: d  reason: collision with root package name */
    public static final String f118843d = "message_extra";

    /* renamed from: e  reason: collision with root package name */
    public static final String f118844e = "in_app_push_type";

    /* renamed from: f  reason: collision with root package name */
    public static final String f118845f = "in_app_push_form";

    /* renamed from: g  reason: collision with root package name */
    public static final String f118846g = "in_app_push";

    /* renamed from: h  reason: collision with root package name */
    public static final String f118847h = "live";

    /* renamed from: i  reason: collision with root package name */
    public static final a f118848i = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(77201);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(77200);
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ JSONObject $extra$inlined;
        final /* synthetic */ Intent $intent$inlined;

        static {
            Covode.recordClassIndex(77202);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(JSONObject jSONObject, Intent intent) {
            super(0);
            this.$extra$inlined = jSONObject;
            this.$intent$inlined = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String optString;
            String string;
            this.$intent$inlined.putExtra("track_info", this.$extra$inlined.optString("track_info", ""));
            if (!l.a((Object) "popup", (Object) this.$extra$inlined.optString(CustomActionPushReceiver.f118845f)) || !l.a((Object) "author", (Object) this.$extra$inlined.optString(CustomActionPushReceiver.f118844e)) || TextUtils.isEmpty(this.$extra$inlined.optString("event"))) {
                d a2 = d.a.a();
                Intent intent = this.$intent$inlined;
                l.d(intent, "");
                if (com.ss.android.ugc.aweme.setting.a.a.a()) {
                    String a3 = d.a(intent, "message_title");
                    String a4 = d.a(intent, "message_text");
                    String a5 = d.a(intent, "message_image_url");
                    String a6 = d.a(intent, "message_open_url");
                    String a7 = d.a(intent, "track_info");
                    a2.f118860c = d.a(intent, "message_in_app_push_type");
                    if (!TextUtils.isEmpty(a3) && !TextUtils.isEmpty(a4) && !TextUtils.isEmpty(a5) && !TextUtils.isEmpty(a6)) {
                        a2.a(true, a3, a4, a5, a6, a7, null);
                    }
                }
            } else {
                this.$intent$inlined.putExtra("event", this.$extra$inlined.optString("event"));
                d a8 = d.a.a();
                Intent intent2 = this.$intent$inlined;
                l.d(intent2, "");
                String a9 = d.a(intent2, "event");
                String a10 = d.a(intent2, "track_info");
                if (a10 == null) {
                    a10 = "";
                }
                String a11 = d.a(intent2, "message_open_url");
                if (!TextUtils.isEmpty(a9) && !TextUtils.isEmpty(a11)) {
                    JSONObject jSONObject = null;
                    try {
                        jSONObject = new JSONObject(a9);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    Activity j2 = f.j();
                    if (j2 != null) {
                        if (jSONObject != null) {
                            String optString2 = jSONObject.optString(StringSet.name);
                            if (!(optString2 == null || (optString = jSONObject.optString("id")) == null)) {
                                int optInt = jSONObject.optInt("start_time_minute", 0);
                                int optInt2 = jSONObject.optInt("viewers", 0);
                                boolean optBoolean = jSONObject.optBoolean("is_paid_event", false);
                                String str = "live_take_popup_in_room";
                                if (!optBoolean || !d.a(j2)) {
                                    Activity j3 = f.j();
                                    if (j3 != null) {
                                        String string2 = j3.getResources().getString(R.string.bqd);
                                        l.b(string2, "");
                                        ILiveOuterService s = LiveOuterService.s();
                                        l.b(s, "");
                                        Object a12 = s.k().a("live_event_no_penalty", false);
                                        l.b(a12, "");
                                        if (((Boolean) a12).booleanValue()) {
                                            if (optInt2 >= 100) {
                                                string = j3.getResources().getQuantityString(R.plurals.g8, optInt2, optString2, Integer.valueOf(optInt2));
                                            } else {
                                                string = j3.getResources().getString(R.string.eg3, optString2);
                                            }
                                        } else if (d.a(j3)) {
                                            string = j3.getResources().getString(R.string.bqh, optString2, Integer.valueOf(optInt));
                                        } else {
                                            string = j3.getResources().getString(R.string.bqg, optString2, Integer.valueOf(optInt));
                                        }
                                        l.b(string, "");
                                        com.bytedance.tux.dialog.b.d dVar = new com.bytedance.tux.dialog.b.d(j3);
                                        String string3 = j3.getResources().getString(R.string.bqe);
                                        l.b(string3, "");
                                        dVar.a(string3, new d.C3046d(a8, j3, optString, a10, optBoolean, a11));
                                        String string4 = j3.getResources().getString(R.string.bqf);
                                        l.b(string4, "");
                                        dVar.b(string4, new d.e(a8, a10, j3, optBoolean));
                                        if (!d.a(j3)) {
                                            str = "live_take_popup_out_room";
                                        }
                                        f.a.a(a10, "show", str, optBoolean);
                                        ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.a(com.bytedance.tux.dialog.e.b.a(new com.bytedance.tux.dialog.b(j3), R.drawable.aht).b(string2).d(string).a(dVar), false).a(false)).a().b().show();
                                    }
                                } else {
                                    String string5 = j2.getResources().getString(R.string.bqp);
                                    l.b(string5, "");
                                    String string6 = j2.getResources().getString(R.string.bqo, optString2, Integer.valueOf(optInt));
                                    l.b(string6, "");
                                    com.bytedance.tux.dialog.b.d dVar2 = new com.bytedance.tux.dialog.b.d(j2);
                                    String string7 = j2.getResources().getString(R.string.bqm);
                                    l.b(string7, "");
                                    dVar2.a(string7, new d.i(a10));
                                    String string8 = j2.getResources().getString(R.string.bqn);
                                    l.b(string8, "");
                                    dVar2.b(string8, new d.j(a8, a10, j2));
                                    if (!d.a(j2)) {
                                        str = "live_take_popup_out_room";
                                    }
                                    f.a.a(a10, "show", str, true);
                                    ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.a(com.bytedance.tux.dialog.e.b.a(new com.bytedance.tux.dialog.b(j2), R.drawable.aht).b(string5).d(string6).a(dVar2), false).a(false)).a().b().show();
                                }
                            }
                        }
                    }
                }
            }
            return z.f158842a;
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String a2 = a(intent, f118843d);
            if (!TextUtils.isEmpty(a2)) {
                try {
                    JSONObject jSONObject = new JSONObject(a2);
                    String optString = jSONObject.optString(f118846g, null);
                    if (optString != null && TextUtils.equals(f118847h, optString)) {
                        aq.a(new b(jSONObject, intent));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
