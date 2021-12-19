package com.ss.android.ugc.aweme.settingsrequest;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.settingsrequest.d.b;
import com.ss.android.ugc.aweme.settingsrequest.d.c;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import l.b.f;
import l.b.t;

public final class PopupSettingManager implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    static PopupSettingRequestApi f123150a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f123151b;

    /* renamed from: c  reason: collision with root package name */
    private WeakHandler f123152c;

    /* renamed from: d  reason: collision with root package name */
    private Map<WeakHandler, Integer> f123153d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, c> f123154e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f123155f;

    interface PopupSettingRequestApi {
        static {
            Covode.recordClassIndex(80878);
        }

        @f(a = "/aweme/v1/user/popup/")
        q<b> requestPopupConfig(@t(a = "post_video_status") String str);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static PopupSettingManager f123158a = new PopupSettingManager((byte) 0);

        static {
            Covode.recordClassIndex(80879);
        }
    }

    static {
        Covode.recordClassIndex(80876);
        String str = Api.f66569d;
        f123151b = str;
        f123150a = (PopupSettingRequestApi) com.bytedance.ies.ugc.aweme.network.ext.a.a(str, PopupSettingRequestApi.class);
    }

    private PopupSettingManager() {
        this.f123153d = new ConcurrentHashMap();
        this.f123155f = false;
        this.f123152c = new WeakHandler(this);
        this.f123154e = new HashMap();
    }

    /* synthetic */ PopupSettingManager(byte b2) {
        this();
    }

    public final c a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        c cVar = this.f123154e.get(str);
        this.f123154e.put(str, null);
        return cVar;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        List<c> list;
        Object obj = message.obj;
        int i2 = message.what;
        this.f123155f = false;
        if (obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(((com.ss.android.ugc.aweme.base.api.a.b.a) obj).getErrorMsg()).a();
        } else if (obj instanceof Exception) {
            new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(d.a().getResources().getString(R.string.de9)).a();
        } else if ((obj instanceof b) && i2 == 1 && (list = ((b) obj).f123189a) != null) {
            for (c cVar : list) {
                if (cVar != null) {
                    try {
                        String str = cVar.f123194e;
                        if (!TextUtils.isEmpty(str)) {
                            this.f123154e.put(str, cVar);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Iterator<Map.Entry<WeakHandler, Integer>> it = this.f123153d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<WeakHandler, Integer> next = it.next();
                next.getKey().sendEmptyMessage(next.getValue().intValue());
                it.remove();
            }
        }
    }

    private void a(WeakHandler weakHandler, final int i2) {
        n.a().a(weakHandler, new Callable() {
            /* class com.ss.android.ugc.aweme.settingsrequest.PopupSettingManager.AnonymousClass1 */

            static {
                Covode.recordClassIndex(80877);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                try {
                    PopupSettingRequestApi popupSettingRequestApi = PopupSettingManager.f123150a;
                    int i2 = i2;
                    if (i2 == 0) {
                        str = "1";
                    } else if (i2 != 2) {
                        str = "2";
                    } else {
                        str = "3";
                    }
                    return popupSettingRequestApi.requestPopupConfig(str).get();
                } catch (ExecutionException e2) {
                    throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
                }
            }
        }, 1);
    }

    public final void a(WeakHandler weakHandler, int i2, int i3) {
        MethodCollector.i(6539);
        this.f123153d.put(weakHandler, Integer.valueOf(i2));
        synchronized (this) {
            try {
                if (!this.f123155f) {
                    this.f123155f = true;
                    a(this.f123152c, i3);
                    MethodCollector.o(6539);
                }
            } finally {
                MethodCollector.o(6539);
            }
        }
    }
}
