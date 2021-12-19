package com.ss.android.ugc.aweme.im.sdk.share.ui.textbox;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.u;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import h.f.b.l;
import java.util.Set;

public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f103755b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ShareTextBoxViewModel f103756a;

    /* renamed from: c  reason: collision with root package name */
    private final View f103757c;

    static {
        Covode.recordClassIndex(66464);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66465);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        this.f103757c.setVisibility(0);
    }

    public final void b() {
        this.f103757c.setVisibility(8);
        u.f102444a.clear();
    }

    public e(View view, ShareTextBoxViewModel shareTextBoxViewModel, Set<? extends IMContact> set, boolean z, d dVar) {
        l.d(view, "");
        l.d(shareTextBoxViewModel, "");
        l.d(dVar, "");
        this.f103757c = view;
        this.f103756a = shareTextBoxViewModel;
        if (set == null || set.isEmpty()) {
            b();
        } else {
            a();
        }
        dVar.a(z);
    }
}
