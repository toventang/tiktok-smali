package com.bytedance.android.livesdk.chatroom.end;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class a extends Dialog {
    static {
        Covode.recordClassIndex(8516);
    }

    public a(Context context) {
        super(context, R.style.a32);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.i(3067);
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.b6z, (ViewGroup) null));
        ((TextView) findViewById(R.id.c3x)).setText(y.a((int) R.string.e8m));
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        MethodCollector.o(3067);
    }
}
