package com.ss.android.ugc.aweme.ecommerce.util;

import android.text.InputFilter;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import h.a.i;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.l.k;
import java.util.Objects;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f87558a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(55039);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements b<InputFilter, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f87559a = new a();

        static {
            Covode.recordClassIndex(55040);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(InputFilter inputFilter) {
            return Boolean.valueOf(!(inputFilter instanceof InputFilter.LengthFilter));
        }
    }

    public static final void a(EditText editText, int i2) {
        Object[] array;
        if (editText != null && i2 >= 0) {
            InputFilter[] filters = editText.getFilters();
            l.b(filters, "");
            if (filters.length == 0) {
                array = new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i2)};
            } else {
                InputFilter[] filters2 = editText.getFilters();
                l.b(filters2, "");
                array = k.g(k.a(k.a(i.p(filters2), (b) a.f87559a), new InputFilter.LengthFilter(i2))).toArray(new InputFilter[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            }
            editText.setFilters((InputFilter[]) array);
        }
    }
}
