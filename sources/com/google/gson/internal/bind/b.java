package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.c.a;
import com.google.gson.c.c;
import com.google.gson.internal.d;
import com.google.gson.internal.i;
import com.google.gson.t;
import com.google.gson.v;
import com.google.gson.w;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class b extends v<Date> {

    /* renamed from: a  reason: collision with root package name */
    public static final w f54803a = new DateTypeAdapter$1();

    /* renamed from: b  reason: collision with root package name */
    private final List<DateFormat> f54804b;

    static {
        Covode.recordClassIndex(33977);
    }

    public b() {
        ArrayList arrayList = new ArrayList();
        this.f54804b = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (d.a()) {
            arrayList.add(i.a(2, 2));
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.v
    public final /* synthetic */ Date read(a aVar) {
        if (aVar.f() != com.google.gson.c.b.NULL) {
            return a(aVar.i());
        }
        aVar.k();
        return null;
    }

    private synchronized Date a(String str) {
        MethodCollector.i(5744);
        for (DateFormat dateFormat : this.f54804b) {
            try {
                Date parse = dateFormat.parse(str);
                MethodCollector.o(5744);
                return parse;
            } catch (ParseException unused) {
            }
        }
        try {
            Date a2 = com.google.gson.internal.bind.a.a.a(str, new ParsePosition(0));
            MethodCollector.o(5744);
            return a2;
        } catch (ParseException e2) {
            t tVar = new t(str, e2);
            MethodCollector.o(5744);
            throw tVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void write(c cVar, Date date) {
        MethodCollector.i(5813);
        if (date == null) {
            cVar.f();
            MethodCollector.o(5813);
            return;
        }
        cVar.b(this.f54804b.get(0).format(date));
        MethodCollector.o(5813);
    }
}
