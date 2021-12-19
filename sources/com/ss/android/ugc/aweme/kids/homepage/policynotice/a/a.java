package com.ss.android.ugc.aweme.kids.homepage.policynotice.a;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class a extends Dialog {

    /* renamed from: c  reason: collision with root package name */
    public static final C2724a f106596c = new C2724a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f106597d = ((int) n.b(d.a(), 20.0f));

    /* renamed from: a  reason: collision with root package name */
    public int f106598a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f106599b = -1;

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a$a  reason: collision with other inner class name */
    public static final class C2724a {
        static {
            Covode.recordClassIndex(68117);
        }

        private C2724a() {
        }

        public /* synthetic */ C2724a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(68116);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(this.f106598a, this.f106599b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context, R.style.zo);
        l.d(context, "");
        requestWindowFeature(1);
    }
}
