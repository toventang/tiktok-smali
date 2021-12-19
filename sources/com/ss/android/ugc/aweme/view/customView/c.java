package com.ss.android.ugc.aweme.view.customView;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.y;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import h.f.b.r;
import h.k.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144193a = new c();

    static {
        Covode.recordClassIndex(94363);
    }

    c() {
        super(ProfileNaviEditorState.class, "currentMessage", "getCurrentMessage()Lcom/ss/android/ugc/aweme/common/NaviMessage;", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return ((ProfileNaviEditorState) obj).getCurrentMessage();
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviEditorState) obj).setCurrentMessage((y) obj2);
    }
}
