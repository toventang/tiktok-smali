package com.ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.commercialize.log.aj;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.log.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class aw implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    static final WeakHandler f74168a;

    /* renamed from: b  reason: collision with root package name */
    static a f74169b;

    /* renamed from: c  reason: collision with root package name */
    public static final aw f74170c;

    private aw() {
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final Aweme f74171a;

        /* renamed from: b  reason: collision with root package name */
        private final String f74172b;

        static {
            Covode.recordClassIndex(45764);
        }

        public final void run() {
            j.a(d.a(), this.f74171a, this.f74172b);
        }

        public a(Aweme aweme, String str) {
            this.f74171a = aweme;
            this.f74172b = str;
        }
    }

    public static final void a() {
        a aVar = f74169b;
        if (aVar != null) {
            aVar.run();
        }
        f74169b = null;
    }

    static {
        Covode.recordClassIndex(45763);
        aw awVar = new aw();
        f74170c = awVar;
        f74168a = new WeakHandler(awVar);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Bundle data;
        if (message != null && message.what == 1048577 && (data = message.getData()) != null) {
            try {
                String string = data.getString("refer");
                Serializable serializable = data.getSerializable("aweme_raw_data");
                if (serializable != null) {
                    AwemeRawAd awemeRawAd = (AwemeRawAd) serializable;
                    Context a2 = d.a();
                    JSONObject a3 = j.a(a2, awemeRawAd, true, (Map<String, String>) null);
                    if (string != null) {
                        try {
                            a3.put("refer", string);
                        } catch (JSONException unused) {
                        }
                    }
                    j.a(a2, "click", awemeRawAd, a3);
                    if (awemeRawAd != null) {
                        aj.a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new w(awemeRawAd));
                    }
                    message.setData(null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.AwemeRawAd");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static final void a(Context context, Aweme aweme, String str) {
        Integer valueOf;
        int i2;
        if (context != null && aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (!(awemeRawAd == null || (valueOf = Integer.valueOf(awemeRawAd.getLeftSlideClickType())) == null)) {
                if (valueOf.intValue() == 0) {
                    j.a(context, aweme, str);
                    return;
                } else if (valueOf.intValue() == 1) {
                    return;
                } else {
                    if (valueOf.intValue() == 2) {
                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                        if (awemeRawAd2 != null) {
                            i2 = awemeRawAd2.getLeftSlideClickDuration();
                        } else {
                            i2 = 0;
                        }
                        WeakHandler weakHandler = f74168a;
                        weakHandler.removeMessages(1048577);
                        try {
                            Message obtain = Message.obtain();
                            obtain.what = 1048577;
                            l.b(obtain, "");
                            Bundle bundle = new Bundle();
                            bundle.putString("refer", str);
                            bundle.putSerializable("aweme_raw_data", aweme.getAwemeRawAd());
                            obtain.setData(bundle);
                            weakHandler.sendMessageDelayed(obtain, ((long) i2) * 1000);
                            return;
                        } catch (Throwable unused) {
                        }
                    } else if (valueOf.intValue() == 3) {
                        f74169b = new a(aweme, str);
                        return;
                    }
                }
            }
            j.a(context, aweme, str);
        }
    }
}
