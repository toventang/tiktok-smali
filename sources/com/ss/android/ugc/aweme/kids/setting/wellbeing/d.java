package com.ss.android.ugc.aweme.kids.setting.wellbeing;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.a.f;
import androidx.lifecycle.t;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.HashMap;

public final class d extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f107150a;

    /* renamed from: b  reason: collision with root package name */
    SmartImageView f107151b;

    /* renamed from: c  reason: collision with root package name */
    private View f107152c;

    /* renamed from: d  reason: collision with root package name */
    private final t<z> f107153d;

    /* renamed from: e  reason: collision with root package name */
    private final t<z> f107154e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f107155f;

    /* renamed from: g  reason: collision with root package name */
    private HashMap f107156g;

    static {
        Covode.recordClassIndex(68541);
    }

    private View a(int i2) {
        if (this.f107156g == null) {
            this.f107156g = new HashMap();
        }
        View view = (View) this.f107156g.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f107156g.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final t<z> getDismissLiveData$k_setting_release() {
        return this.f107153d;
    }

    public final t<z> getSnoozeLiveData$k_setting_release() {
        return this.f107154e;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f107157a;

        static {
            Covode.recordClassIndex(68542);
        }

        a(d dVar) {
            this.f107157a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f107157a.getDismissLiveData$k_setting_release().postValue(z.f158842a);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f107158a;

        static {
            Covode.recordClassIndex(68543);
        }

        b(d dVar) {
            this.f107158a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f107158a.getSnoozeLiveData$k_setting_release().postValue(z.f158842a);
        }
    }

    public final void setDesc$k_setting_release(String str) {
        l.d(str, "");
        TuxTextView tuxTextView = (TuxTextView) a(R.id.dkk);
        l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public final void setFullScreen(boolean z) {
        int i2;
        this.f107150a = z;
        View view = this.f107152c;
        if (view == null) {
            l.a("spaceView");
        }
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public final void setTitle$k_setting_release(String str) {
        l.d(str, "");
        TuxTextView tuxTextView = (TuxTextView) a(R.id.dkp);
        l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(boolean z, Context context) {
        super(context, null, 0);
        int i2;
        l.d(context, "");
        int i3 = 0;
        MethodCollector.i(3496);
        this.f107155f = z;
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.ae2, this, true);
        View findViewById = a2.findViewById(R.id.dkm);
        l.b(findViewById, "");
        this.f107151b = (SmartImageView) findViewById;
        Resources resources = getResources();
        if (z) {
            i2 = R.color.f159928l;
        } else {
            i2 = R.color.bx;
        }
        int b2 = f.b(resources, i2, null);
        ((TuxTextView) a(R.id.dkp)).setTextColor(b2);
        ((TuxTextView) a(R.id.dkk)).setTextColor(b2);
        View findViewById2 = a2.findViewById(R.id.dko);
        l.b(findViewById2, "");
        this.f107152c = findViewById2;
        TuxButton tuxButton = (TuxButton) a(R.id.dkn);
        l.b(tuxButton, "");
        tuxButton.setVisibility(!z ? 8 : i3);
        ((TuxButton) a(R.id.dkl)).setOnClickListener(new a(this));
        ((TuxButton) a(R.id.dkn)).setOnClickListener(new b(this));
        this.f107153d = new t<>();
        this.f107154e = new t<>();
        MethodCollector.o(3496);
    }

    public /* synthetic */ d(boolean z, Context context, byte b2) {
        this(z, context);
    }
}
