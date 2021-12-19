package com.bytedance.android.livesdk.subscribe;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class a extends com.bytedance.android.livesdk.ui.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0469a f21488a = new C0469a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private String f21489b = "";

    /* renamed from: c  reason: collision with root package name */
    private HashMap f21490c;

    static {
        Covode.recordClassIndex(12646);
    }

    /* renamed from: com.bytedance.android.livesdk.subscribe.a$a  reason: collision with other inner class name */
    public static final class C0469a {
        static {
            Covode.recordClassIndex(12647);
        }

        private C0469a() {
        }

        public /* synthetic */ C0469a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f21490c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("enter_from");
            if (string == null) {
                l.b();
            }
            this.f21489b = string;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        g gVar = new g(LiveSubscribeLynxUrl.INSTANCE.getValue().getUser_subscribe_list());
        gVar.a("show_entrance", this.f21489b);
        Uri parse = Uri.parse(gVar.a());
        l.b(parse, "");
        ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(getContext(), parse);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b9y, viewGroup, false);
    }
}
