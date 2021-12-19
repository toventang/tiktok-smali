package com.bytedance.creativex.recorder.filter.c;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.filter.view.widget.CompositeFilterIndicator;
import com.bytedance.scene.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f28258b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    CompositeFilterIndicator f28259a;

    static {
        Covode.recordClassIndex(16575);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(16576);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        Activity t = t();
        l.b(t, "");
        View a2 = com.a.a(t.getLayoutInflater(), R.layout.biu, viewGroup, false);
        l.b(a2, "");
        return a2;
    }
}
