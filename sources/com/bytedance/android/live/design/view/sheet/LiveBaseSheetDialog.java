package com.bytedance.android.live.design.view.sheet;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.a;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;

public class LiveBaseSheetDialog extends LiveBottomSheetDialog implements au {

    /* renamed from: a  reason: collision with root package name */
    LiveSheetHandleView f9492a;

    /* renamed from: i  reason: collision with root package name */
    private View f9493i;

    /* renamed from: j  reason: collision with root package name */
    private View f9494j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f9495k;

    /* renamed from: l  reason: collision with root package name */
    private CharSequence f9496l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f9497m;
    private View n;
    private int o;
    private boolean p;

    static {
        Covode.recordClassIndex(4824);
    }

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    private void c() {
        setTitle(this.f9496l);
        b(this.f9497m);
    }

    private void b(boolean z) {
        int i2;
        this.f9497m = z;
        View view = this.f9494j;
        if (view != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        int i2;
        this.p = z;
        LiveSheetHandleView liveSheetHandleView = this.f9492a;
        if (liveSheetHandleView != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            liveSheetHandleView.setVisibility(i2);
        }
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setTitle(int i2) {
        setTitle(getContext().getResources().getString(i2));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, androidx.appcompat.app.h
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View view = this.n;
        if (view != null) {
            setContentView(view);
            return;
        }
        int i2 = this.o;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(int i2) {
        super.setContentView(a((View) null, i2, new ViewGroup.LayoutParams(-1, -1)));
        c();
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.f9496l = charSequence;
        TextView textView = this.f9495k;
        if (textView != null) {
            textView.setText(charSequence);
            if (TextUtils.isEmpty(charSequence)) {
                this.f9493i.setVisibility(8);
            } else {
                this.f9493i.setVisibility(0);
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(a(view, 0, new ViewGroup.LayoutParams(-1, -1)));
        c();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, androidx.appcompat.app.h
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(a(view, 0, layoutParams));
        c();
    }

    private View a(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.i(3464);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ajt, (ViewGroup) null);
        this.f9493i = inflate.findViewById(R.id.e2r);
        View findViewById = inflate.findViewById(R.id.e2s);
        this.f9494j = findViewById;
        findViewById.setOnClickListener(new a(this));
        this.f9495k = (TextView) inflate.findViewById(R.id.e2t);
        this.f9492a = (LiveSheetHandleView) inflate.findViewById(R.id.e2q);
        a(this.p);
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.e2k);
        if (view == null && i2 != 0) {
            view = a.a(getLayoutInflater(), i2, viewGroup, false);
        }
        if (layoutParams == null) {
            viewGroup.addView(view, -1, -1);
        } else {
            viewGroup.addView(view, layoutParams);
        }
        this.f9492a.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            /* class com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog.AnonymousClass1 */

            static {
                Covode.recordClassIndex(4825);
            }

            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                if (LiveBaseSheetDialog.this.b().n == 3) {
                    LiveBaseSheetDialog.this.f9492a.setOffset(1.0f);
                } else {
                    LiveBaseSheetDialog.this.f9492a.setOffset(0.0f);
                }
                LiveBaseSheetDialog.this.f9492a.removeOnLayoutChangeListener(this);
            }
        });
        b().a(new LiveBottomSheetBehavior.a() {
            /* class com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog.AnonymousClass2 */

            static {
                Covode.recordClassIndex(4826);
            }

            @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.a
            public final void a(View view, int i2) {
            }

            @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.a
            public final void a(View view, float f2) {
                LiveBaseSheetDialog.this.f9492a.setOffset(Math.max(f2, 0.0f));
            }
        });
        MethodCollector.o(3464);
        return inflate;
    }
}
