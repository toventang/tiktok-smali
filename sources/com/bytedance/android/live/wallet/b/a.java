package com.bytedance.android.live.wallet.b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.livesdk.chatroom.f.c;
import com.bytedance.android.livesdk.livesetting.wallet.LiveFirstRechargeUpgradePackageSetting;
import com.bytedance.android.livesdk.model.q;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class a extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    public static final C0274a f13052c = new C0274a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f13053a = R.layout.b97;

    /* renamed from: b  reason: collision with root package name */
    public int f13054b = R.layout.b_q;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f13055d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f13056e;

    /* renamed from: f  reason: collision with root package name */
    private LinearLayout f13057f;

    /* renamed from: g  reason: collision with root package name */
    private HashMap f13058g;

    static {
        Covode.recordClassIndex(7247);
    }

    /* renamed from: com.bytedance.android.live.wallet.b.a$a  reason: collision with other inner class name */
    public static final class C0274a {
        static {
            Covode.recordClassIndex(7248);
        }

        private C0274a() {
        }

        public /* synthetic */ C0274a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f13058g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final ImageView f13059a;

        /* renamed from: b  reason: collision with root package name */
        final TextView f13060b;

        /* renamed from: c  reason: collision with root package name */
        final View f13061c;

        /* renamed from: d  reason: collision with root package name */
        private final View f13062d;

        static {
            Covode.recordClassIndex(7249);
        }

        public b(View view) {
            l.d(view, "");
            this.f13062d = view;
            View findViewById = view.findViewById(R.id.c0k);
            l.b(findViewById, "");
            this.f13059a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.f65);
            l.b(findViewById2, "");
            this.f13060b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.dmy);
            l.b(findViewById3, "");
            this.f13061c = findViewById3;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int i2;
        MethodCollector.i(7220);
        l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f13055d = (ImageView) view.findViewById(R.id.c0j);
        this.f13056e = (TextView) view.findViewById(R.id.f66);
        this.f13057f = (LinearLayout) view.findViewById(R.id.cgc);
        q value = LiveFirstRechargeUpgradePackageSetting.INSTANCE.getValue();
        if (value == null) {
            MethodCollector.o(7220);
            return;
        }
        ImageModel imageModel = value.f19742b;
        if (imageModel != null) {
            p.a(this.f13055d, imageModel, 0);
        }
        com.bytedance.android.livesdk.model.message.c.b bVar = value.f19741a;
        if (bVar != null) {
            c.a(bVar, "");
            TextView textView = this.f13056e;
            if (textView != null) {
                textView.setText(c.a(bVar, ""));
            }
        }
        List<q.a> list = value.f19743c;
        l.b(list, "");
        if (!list.isEmpty()) {
            List<q.a> list2 = value.f19743c;
            l.b(list2, "");
            int i3 = 0;
            for (T t : list2) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    n.a();
                }
                T t2 = t;
                View a2 = com.a.a(getLayoutInflater(), this.f13054b, this.f13057f, false);
                l.b(a2, "");
                b bVar2 = new b(a2);
                l.b(t2, "");
                if (i3 == value.f19743c.size() - 1) {
                    z = true;
                } else {
                    z = false;
                }
                l.d(t2, "");
                View view2 = bVar2.f13061c;
                if (z) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                view2.setVisibility(i2);
                ImageModel imageModel2 = t2.f19745b;
                if (imageModel2 != null) {
                    p.a(bVar2.f13059a, imageModel2, 0);
                }
                com.bytedance.android.livesdk.model.message.c.b bVar3 = t2.f19744a;
                if (bVar3 != null) {
                    bVar2.f13060b.setText(c.a(bVar3, ""));
                }
                LinearLayout linearLayout = this.f13057f;
                if (linearLayout != null) {
                    linearLayout.addView(a2);
                }
                i3 = i4;
            }
        }
        MethodCollector.o(7220);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, this.f13053a, viewGroup, false);
    }
}
