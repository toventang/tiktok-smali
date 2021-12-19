package com.ss.android.ugc.aweme.account.login;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.zhiliaoapp.musically.R;

public final class m extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public a f63490a;

    public interface a {
        static {
            Covode.recordClassIndex(39133);
        }

        void e();
    }

    static {
        Covode.recordClassIndex(39132);
    }

    public final void onBackPressed() {
        super.onBackPressed();
        a aVar = this.f63490a;
        if (aVar != null) {
            aVar.e();
        }
    }

    public m(Context context) {
        super(context, R.style.uk);
        MethodCollector.i(9153);
        View inflate = LayoutInflater.from(context).inflate(R.layout.fz, (ViewGroup) null);
        ((TuxDualBallView) inflate.findViewById(R.id.eu6)).b();
        setContentView(inflate);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = (int) n.b(context, 57.0f);
        attributes.width = (int) n.b(context, 57.0f);
        window.setAttributes(attributes);
        MethodCollector.o(9153);
    }
}
