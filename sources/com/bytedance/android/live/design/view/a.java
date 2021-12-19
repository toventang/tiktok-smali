package com.bytedance.android.live.design.view;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.design.view.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class a extends h {
    static {
        Covode.recordClassIndex(4802);
    }

    /* renamed from: com.bytedance.android.live.design.view.a$a  reason: collision with other inner class name */
    public static class C0140a extends h.a<C0140a> {

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f9423a;

        static {
            Covode.recordClassIndex(4803);
        }

        /* renamed from: a */
        public final a b() {
            return new a(this);
        }

        public C0140a(View view) {
            super(view);
        }

        /* Return type fixed from 'com.bytedance.android.live.design.view.h$a' to match base method */
        @Override // com.bytedance.android.live.design.view.h.a
        public final /* synthetic */ C0140a a(View view) {
            throw new UnsupportedOperationException();
        }

        public final C0140a a(int i2) {
            if (this.f9467b != null) {
                this.f9423a = this.f9467b.getResources().getString(i2);
            }
            return this;
        }
    }

    protected a(C0140a aVar) {
        super(aVar);
        MethodCollector.i(5390);
        if (this.f9456a != null && !TextUtils.isEmpty(aVar.f9423a)) {
            TextView textView = (TextView) LayoutInflater.from(this.f9456a).inflate(R.layout.bc_, (ViewGroup) null);
            textView.setText(aVar.f9423a);
            this.f9458c = textView;
        }
        MethodCollector.o(5390);
    }
}
