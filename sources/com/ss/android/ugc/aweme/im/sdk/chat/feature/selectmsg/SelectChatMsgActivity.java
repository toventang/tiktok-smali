package com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.im.core.d.ai;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.im.service.b.d;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public final class SelectChatMsgActivity extends a {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f101014a;

    static {
        Covode.recordClassIndex(64610);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f101014a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f101014a == null) {
            this.f101014a = new HashMap();
        }
        View view = (View) this.f101014a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f101014a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.SelectChatMsgActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.SelectChatMsgActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        a.a(this);
        super.onStart();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b, com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.SelectChatMsgActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b, com.bytedance.ies.foundation.activity.a
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.bt, R.anim.bw);
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        String conversationId;
        com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar = this.f101194d;
        if (!(aVar == null || (conversationId = aVar.getConversationId()) == null || conversationId.length() <= 0)) {
            d dVar = new d();
            dVar.f103831b = conversationId;
            c.a(dVar);
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b
    public final void bB_() {
        String str;
        int i2;
        List<ai> list;
        super.bB_();
        Bundle a2 = a(getIntent());
        if (a2 != null) {
            com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar = this.f101194d;
            com.ss.android.ugc.aweme.im.service.model.a aVar2 = null;
            if (aVar != null) {
                str = aVar.getConversationId();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar3 = this.f101194d;
            if (aVar3 != null) {
                HashMap<String, List<ai>> hashMap = c.f101017a;
                if (hashMap != null) {
                    list = hashMap.get(str);
                } else {
                    list = null;
                }
                aVar3.setSelectMsgList(list);
            }
            Serializable serializable = a2.getSerializable("key_enter_chat_params");
            if (serializable instanceof com.ss.android.ugc.aweme.im.service.model.a) {
                aVar2 = serializable;
            }
            com.ss.android.ugc.aweme.im.service.model.a aVar4 = aVar2;
            com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar5 = this.f101194d;
            if (aVar5 != null) {
                if (aVar4 != null) {
                    i2 = aVar4.getSelectMsgType();
                } else {
                    i2 = 0;
                }
                aVar5.setSelectMsgType(i2);
            }
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.a, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.SelectChatMsgActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.bu, R.anim.bt);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.SelectChatMsgActivity", "onCreate", false);
    }
}
