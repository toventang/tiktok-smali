package com.ss.android.ugc.aweme.challenge.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.a;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import java.util.List;

public abstract class b extends a implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public List<Integer> f70119a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakHandler f70120b = new WeakHandler(this);

    /* renamed from: c  reason: collision with root package name */
    protected d f70121c;

    static {
        Covode.recordClassIndex(43246);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public final void bV_() {
        if (this.L != null) {
            this.L.a();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f70120b.removeCallbacksAndMessages(null);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        d dVar = this.f70121c;
        if (dVar != null && dVar.isShowing()) {
            this.f70121c.dismiss();
        }
        this.f70121c = null;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.detail.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
