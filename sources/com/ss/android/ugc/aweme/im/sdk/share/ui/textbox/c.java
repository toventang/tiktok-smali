package com.ss.android.ugc.aweme.im.sdk.share.ui.textbox;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b;
import h.f.b.l;

public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f103720e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f103721a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f103722b;

    /* renamed from: c  reason: collision with root package name */
    public final View f103723c;

    /* renamed from: d  reason: collision with root package name */
    public final ShareTextBoxViewModel f103724d;

    static {
        Covode.recordClassIndex(66446);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66447);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public c(ViewGroup viewGroup, View view, ShareTextBoxViewModel shareTextBoxViewModel, d dVar) {
        l.d(viewGroup, "");
        l.d(view, "");
        l.d(shareTextBoxViewModel, "");
        l.d(dVar, "");
        this.f103722b = viewGroup;
        this.f103723c = view;
        this.f103724d = shareTextBoxViewModel;
        dVar.a(false);
    }
}
