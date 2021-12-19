package com.ss.android.ugc.aweme.utils;

import android.text.Editable;
import android.text.TextWatcher;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import f.a.v;
import f.a.w;
import h.f.b.l;
import h.f.b.z;

public final class hs {
    static {
        Covode.recordClassIndex(93642);
    }

    public static final class a implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DmtEditText f143071a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f143072b;

        static {
            Covode.recordClassIndex(93643);
        }

        public a(DmtEditText dmtEditText, c cVar) {
            this.f143071a = dmtEditText;
            this.f143072b = cVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f143071a.removeTextChangedListener(this.f143072b);
        }
    }

    public static final class c implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f143074a;

        static {
            Covode.recordClassIndex(93645);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public c(z.e eVar) {
            this.f143074a = eVar;
        }

        public final void afterTextChanged(Editable editable) {
            T t;
            if (editable != null && (t = this.f143074a.element) != null) {
                t.a(editable.toString());
            }
        }
    }

    public static final class b<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f143073a;

        static {
            Covode.recordClassIndex(93644);
        }

        public b(z.e eVar) {
            this.f143073a = eVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: f.a.v<java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.w
        public final void subscribe(v<String> vVar) {
            l.d(vVar, "");
            this.f143073a.element = vVar;
        }
    }
}
