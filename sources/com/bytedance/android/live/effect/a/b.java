package com.bytedance.android.live.effect.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.effect.c.e;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class b extends com.bytedance.android.livesdk.ui.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9634a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private HashMap f9635b;

    static {
        Covode.recordClassIndex(4889);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4890);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f9635b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        getChildFragmentManager().a().a(R.id.b2r, new e()).e();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b9u, viewGroup, false);
    }
}
