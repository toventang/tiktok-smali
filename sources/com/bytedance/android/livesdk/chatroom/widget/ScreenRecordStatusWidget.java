package com.bytedance.android.livesdk.chatroom.widget;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.j.co;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.ArrayList;

public final class ScreenRecordStatusWidget extends LiveRecyclableWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public boolean f16613a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f16614b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f16615c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f16616d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<String> f16617e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private boolean f16618f = true;

    static {
        Covode.recordClassIndex(9215);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.b5m;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        if (!this.f16613a && this.f16618f) {
            super.show();
        }
    }

    public final void a(boolean z) {
        this.f16618f = z;
        if (z) {
            show();
        } else {
            hide();
        }
    }

    static final class a extends h.f.b.m implements b<Boolean, z> {
        final /* synthetic */ ScreenRecordStatusWidget this$0;

        static {
            Covode.recordClassIndex(9216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ScreenRecordStatusWidget screenRecordStatusWidget) {
            super(1);
            this.this$0 = screenRecordStatusWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            this.this$0.f16613a = booleanValue;
            if (booleanValue) {
                this.this$0.hide();
            } else {
                this.this$0.show();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        TextView textView = this.f16614b;
        if (textView == null) {
            l.a("titleTextView");
        }
        textView.setText(y.a((int) R.string.ekw));
        TextView textView2 = this.f16615c;
        if (textView2 == null) {
            l.a("contentTextView");
        }
        textView2.setText(y.a((int) R.string.ekv));
        TextView textView3 = this.f16616d;
        if (textView3 == null) {
            l.a("startButton");
        }
        textView3.setVisibility(8);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        String str;
        Resources resources;
        String[] strArr = new String[1];
        View view = getView();
        if (view == null || (resources = view.getResources()) == null || (str = resources.getString(R.string.eke)) == null) {
            str = "";
        }
        l.b(str, "");
        strArr[0] = str;
        this.f16617e = n.d(strArr);
        View findViewById = findViewById(R.id.emz);
        l.b(findViewById, "");
        this.f16614b = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.aem);
        l.b(findViewById2, "");
        this.f16615c = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.e9n);
        l.b(findViewById3, "");
        this.f16616d = (TextView) findViewById3;
        this.dataChannel.a((m) this, co.class, (b) new a(this));
    }
}
