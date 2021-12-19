package com.bytedance.android.live.p;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import java.util.List;

public abstract class a extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    protected Context f12160a;

    static {
        Covode.recordClassIndex(6666);
    }

    /* access modifiers changed from: protected */
    public abstract LinearLayout a(View view);

    /* access modifiers changed from: protected */
    public abstract q a();

    public a(Context context, List<l> list, DataChannel dataChannel) {
        super(context);
        this.f12160a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.b6c, (ViewGroup) null);
        setWidth(-1);
        setHeight(-2);
        setContentView(inflate);
        setOutsideTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setFocusable(true);
        setWindowLayoutMode(-1, -2);
        setAnimationStyle(R.style.a2j);
        o.POPUP.createHolder(dataChannel, a(inflate), list, a());
        dataChannel.a(d.class, (b) new b(this));
        setOnDismissListener(new c(dataChannel));
    }
}
