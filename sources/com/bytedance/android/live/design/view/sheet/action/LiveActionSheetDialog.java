package com.bytedance.android.live.design.view.sheet.action;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.design.view.action.LiveActionButton;
import com.bytedance.android.live.design.view.sheet.LiveFixedHeightSheetDialog;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public class LiveActionSheetDialog extends LiveFixedHeightSheetDialog implements au {

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f9545i;

    /* renamed from: j  reason: collision with root package name */
    private View f9546j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f9547k;

    /* renamed from: l  reason: collision with root package name */
    private final List<a> f9548l;

    /* renamed from: m  reason: collision with root package name */
    private CharSequence f9549m;
    private b n;

    /* access modifiers changed from: package-private */
    public static class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public a f9551a;

        /* renamed from: b  reason: collision with root package name */
        public LiveActionButton f9552b;

        static {
            Covode.recordClassIndex(4845);
        }
    }

    static {
        Covode.recordClassIndex(4843);
    }

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveFixedHeightSheetDialog, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: c  reason: collision with root package name */
        View f9553c;

        static {
            Covode.recordClassIndex(4846);
        }

        private c() {
        }

        /* synthetic */ c(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final List<b> f9550a = new ArrayList();

        static {
            Covode.recordClassIndex(4844);
        }

        /* access modifiers changed from: package-private */
        public final int a() {
            return this.f9550a.size();
        }

        private a() {
            super((byte) 0);
        }
    }

    private void d() {
        if (this.f9547k != null) {
            if (!TextUtils.isEmpty(this.f9549m)) {
                this.f9547k.setText(this.f9549m);
                this.f9547k.setVisibility(0);
            } else {
                this.f9547k.setVisibility(8);
            }
        }
        c();
    }

    private void c() {
        View view = this.f9546j;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (this.f9548l.size() > 0 && this.f9548l.get(0).a() > 0) {
                a aVar = this.f9548l.get(0).f9550a.get(0).f9551a;
                if (TextUtils.isEmpty(this.f9549m) && (aVar instanceof c) && ((c) aVar).f9559d != null) {
                    marginLayoutParams.topMargin = this.f9546j.getContext().getResources().getDimensionPixelSize(R.dimen.o3);
                    this.f9546j.setLayoutParams(marginLayoutParams);
                }
            }
            marginLayoutParams.topMargin = 0;
            this.f9546j.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, androidx.appcompat.app.h, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.f9549m = charSequence;
        d();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, androidx.appcompat.app.h, android.app.Dialog
    public void setTitle(int i2) {
        setTitle(getContext().getResources().getString(i2));
    }

    private int a(int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += this.f9548l.get(i4).a() * 2;
        }
        return i3 + 0;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, androidx.appcompat.app.h, com.bytedance.android.live.design.view.sheet.LiveFixedHeightSheetDialog
    public void onCreate(Bundle bundle) {
        MethodCollector.i(3077);
        super.onCreate(bundle);
        setContentView(getLayoutInflater().inflate(R.layout.ajs, (ViewGroup) null), new ViewGroup.LayoutParams(-1, -2));
        this.f9547k = (TextView) findViewById(R.id.cl);
        this.f9545i = (LinearLayout) findViewById(R.id.cj);
        View findViewById = findViewById(R.id.ck);
        this.f9546j = findViewById;
        if (this.f9547k == null || this.f9545i == null || findViewById == null) {
            MethodCollector.o(3077);
            return;
        }
        d();
        for (int i2 = 0; i2 < this.f9548l.size(); i2++) {
            a(i2, a(i2), this.f9548l.get(i2));
        }
        LinearLayout linearLayout = this.f9545i;
        if (!(linearLayout == null || this.n == null)) {
            a(linearLayout.getChildCount(), (c) this.n);
            a(false, this.f9545i.getChildCount(), this.n);
        }
        MethodCollector.o(3077);
    }

    private void a(int i2, b bVar) {
        MethodCollector.i(3409);
        if (bVar.f9553c == null) {
            View view = new View(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, view.getContext().getResources().getDimensionPixelSize(R.dimen.np));
            if ((bVar.f9551a instanceof c) && ((c) bVar.f9551a).f9559d != null) {
                int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.o1);
                layoutParams.rightMargin = dimensionPixelSize;
                layoutParams.leftMargin = dimensionPixelSize;
            }
            view.setLayoutParams(layoutParams);
            view.setBackgroundColor(com.bytedance.android.live.design.b.a(view, (int) R.attr.am3));
            this.f9545i.addView(view, i2);
            bVar.f9553c = view;
        }
        MethodCollector.o(3409);
    }

    private void a(int i2, c cVar) {
        MethodCollector.i(3402);
        if (cVar.f9553c == null) {
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, view.getContext().getResources().getDimensionPixelSize(R.dimen.o6)));
            view.setBackgroundColor(com.bytedance.android.live.design.b.a(view, (int) R.attr.alg));
            this.f9545i.addView(view, i2);
            cVar.f9553c = view;
        }
        MethodCollector.o(3402);
    }

    private void a(a aVar, LiveActionButton liveActionButton) {
        if (aVar instanceof c) {
            liveActionButton.setIcon(((c) aVar).f9559d);
        }
        liveActionButton.setText(aVar.f9554a);
        liveActionButton.setOnClickListener(new b(this, aVar));
        liveActionButton.setEnabled(aVar.f9556c);
        liveActionButton.a(aVar.f9555b);
    }

    private void a(int i2, int i3, a aVar) {
        List<b> list = aVar.f9550a;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i4 >= list.size()) {
                break;
            }
            if (i4 >= aVar.a() - 1) {
                z = false;
            }
            a(z, i3, list.get(i4));
            i3 += 2;
            i4++;
        }
        if (i2 < this.f9548l.size() - 1) {
            a(a(i2 + 1) - 1, aVar);
        }
    }

    private void a(boolean z, int i2, b bVar) {
        MethodCollector.i(3090);
        a aVar = bVar.f9551a;
        LiveActionButton liveActionButton = new LiveActionButton(getContext());
        liveActionButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        a(aVar, liveActionButton);
        this.f9545i.addView(liveActionButton, i2);
        bVar.f9552b = liveActionButton;
        if (z) {
            a(i2 + 1, bVar);
        }
        MethodCollector.o(3090);
    }
}
