package com.ss.android.ugc.aweme.choosemusic.view;

import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.choosemusic.view.SearchResultView;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements SearchResultView.a {

    /* renamed from: a  reason: collision with root package name */
    private final c f70839a;

    static {
        Covode.recordClassIndex(43647);
    }

    k(c cVar) {
        this.f70839a = cVar;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.view.SearchResultView.a
    public final void a(MotionEvent motionEvent) {
        c cVar = this.f70839a;
        if (motionEvent != null && motionEvent.getActionMasked() == 0 && cVar.t != null) {
            Boolean value = cVar.t.e().getValue();
            if (value == null || value.booleanValue()) {
                KeyboardUtils.c(cVar.f70819j);
            }
        }
    }
}
