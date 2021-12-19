package com.bytedance.android.livesdk.lynx.ui;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.e;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.b.k;
import com.bytedance.android.livesdk.browser.d.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.a.a.d;
import h.f.b.l;
import java.util.HashMap;
import org.json.JSONObject;

public abstract class a extends com.bytedance.android.livesdk.ui.a implements com.bytedance.android.livesdk.browser.jsbridge.b, com.bytedance.android.livesdkapi.b.a {
    public static final C0394a N = new C0394a((byte) 0);
    public h.a G;
    public b H;
    public f.a I;
    protected int J = 2;
    public String K = "";
    public String L = "";
    protected com.bytedance.android.livesdkapi.b.b M;

    /* renamed from: a  reason: collision with root package name */
    private HashMap f18803a;

    public interface b {
        static {
            Covode.recordClassIndex(11136);
        }

        void d();

        void e();

        void f();

        void g();
    }

    static {
        Covode.recordClassIndex(11134);
    }

    public abstract View f();

    public void i() {
        HashMap hashMap = this.f18803a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        i();
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.ui.a$a  reason: collision with other inner class name */
    public static final class C0394a {
        static {
            Covode.recordClassIndex(11135);
        }

        private C0394a() {
        }

        public /* synthetic */ C0394a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdkapi.b.a
    public boolean a(String str) {
        String str2 = "";
        l.d(str, str2);
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action_from", str);
        jSONObject.put("container_id", this.K);
        com.bytedance.ies.xbridge.e.a aVar = new com.bytedance.ies.xbridge.e.a("GESTURE_SLIDE_TOOGLE_EVENT", currentTimeMillis, new d(jSONObject));
        String str3 = this.K;
        if (str3 != null) {
            str2 = str3;
        }
        aVar.a(str2);
        com.bytedance.ies.xbridge.e.b.a(aVar);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        e activity;
        Window window;
        e activity2;
        Window window2;
        e activity3;
        Window window3;
        super.onActivityCreated(bundle);
        if (this.J == 1) {
            String str = this.L;
            int hashCode = str.hashCode();
            if (hashCode != 830576931) {
                if (hashCode != 1010202942) {
                    if (hashCode == 2003411598 && str.equals("adjustPan") && (activity3 = getActivity()) != null && (window3 = activity3.getWindow()) != null) {
                        window3.setSoftInputMode(32);
                    }
                } else if (str.equals("adjustNothing") && (activity2 = getActivity()) != null && (window2 = activity2.getWindow()) != null) {
                    window2.setSoftInputMode(48);
                }
            } else if (str.equals("adjustResize") && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
                window.setSoftInputMode(18);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i2;
        String str;
        f fVar;
        k hybridPageManager;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.getBoolean("is_dummy_host", false)) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            this.J = i2;
            if (i2 == 1 && (str = this.K) != null && str.length() != 0 && getActivity() != null && (fVar = (f) com.bytedance.android.live.t.a.a(f.class)) != null && (hybridPageManager = fVar.getHybridPageManager()) != null) {
                String str2 = this.K;
                if (str2 == null) {
                    l.b();
                }
                e activity = getActivity();
                if (activity == null) {
                    l.b();
                }
                l.b(activity, "");
                hybridPageManager.a(str2, activity);
            }
        }
    }
}
