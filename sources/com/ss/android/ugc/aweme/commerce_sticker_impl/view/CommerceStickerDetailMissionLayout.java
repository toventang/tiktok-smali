package com.ss.android.ugc.aweme.commerce_sticker_impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.HTCMissionModule;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.model.c;
import com.ss.android.ugc.aweme.tcm.api.service.ITcmService;
import com.ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class CommerceStickerDetailMissionLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    HashMap f73607a;

    static {
        Covode.recordClassIndex(45303);
    }

    public CommerceStickerDetailMissionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommerceStickerDetailMissionLayout f73608a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f73609b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HTCMissionModule f73610c;

        static {
            Covode.recordClassIndex(45304);
        }

        a(CommerceStickerDetailMissionLayout commerceStickerDetailMissionLayout, c cVar, HTCMissionModule hTCMissionModule) {
            this.f73608a = commerceStickerDetailMissionLayout;
            this.f73609b = cVar;
            this.f73610c = hTCMissionModule;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.commerce_sticker_api.a.a a2 = com.ss.android.ugc.aweme.commerce_sticker_impl.a.a.a();
            if (a2 != null) {
                Context context = this.f73608a.getContext();
                l.b(context, "");
                HTCMissionModule htcMissionModule = this.f73609b.getHtcMissionModule();
                if (htcMissionModule != null) {
                    str = htcMissionModule.getOpenUrl();
                } else {
                    str = null;
                }
                a2.a(context, str, null, null, "click_variable_button", this.f73609b.getId());
            }
            CommerceStickerDetailMissionLayout.a(this.f73610c, false);
        }
    }

    public static void a(HTCMissionModule hTCMissionModule, boolean z) {
        String str;
        String str2;
        Boolean bool;
        String str3;
        Integer num;
        TcmConfig i2;
        User a2;
        if (z) {
            str = "mission_label_show";
        } else {
            str = "mission_label_click";
        }
        d dVar = new d();
        Integer num2 = null;
        if (hTCMissionModule != null) {
            str2 = hTCMissionModule.getMissionId();
        } else {
            str2 = null;
        }
        d a3 = dVar.a("mission_id", str2);
        if (hTCMissionModule != null) {
            bool = hTCMissionModule.isEligibleUser();
        } else {
            bool = null;
        }
        String str4 = "1";
        if (l.a((Object) bool, (Object) true)) {
            str3 = str4;
        } else {
            str3 = "0";
        }
        d a4 = a3.a("eligibility", str3);
        if (hTCMissionModule != null) {
            num = hTCMissionModule.getMissionLabelType();
        } else {
            num = null;
        }
        d a5 = a4.a("status", num).a("current_page", "2");
        com.ss.android.ugc.aweme.commerce_sticker_api.a.a a6 = com.ss.android.ugc.aweme.commerce_sticker_impl.a.a.a();
        if (!(a6 == null || (a2 = a6.a()) == null)) {
            num2 = Integer.valueOf(a2.getFollowerCount());
        }
        d a7 = a5.a("creator_followers", num2);
        ITcmService j2 = TcmServiceImpl.j();
        if (!(j2 == null || (i2 = j2.i()) == null || !i2.isTcmCreator())) {
            str4 = "0";
        }
        r.a(str, a7.a("creator_type", str4).f66730a);
    }

    private /* synthetic */ CommerceStickerDetailMissionLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommerceStickerDetailMissionLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(11061);
        com.a.a(LayoutInflater.from(context), R.layout.r9, this, true);
        MethodCollector.o(11061);
    }
}
