package com.ss.android.ugc.aweme.sticker.p;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.a.q;
import h.z;

public final class b extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    public static final a f134989c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Intent f134990a;

    /* renamed from: b  reason: collision with root package name */
    public q<? super Integer, ? super Integer, ? super Intent, z> f134991b;

    static {
        Covode.recordClassIndex(88266);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88267);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (intent = this.f134990a) != null) {
            startActivityForResult(intent, arguments.getInt("extra_request_code"));
        }
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        q<? super Integer, ? super Integer, ? super Intent, z> qVar = this.f134991b;
        if (qVar != null) {
            qVar.invoke(Integer.valueOf(i2), Integer.valueOf(i3), intent);
        }
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }
}
