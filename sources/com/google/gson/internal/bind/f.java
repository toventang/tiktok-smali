package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.c.a;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.t;
import com.google.gson.v;
import com.google.gson.w;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class f extends v<Date> {

    /* renamed from: a  reason: collision with root package name */
    public static final w f54819a = new SqlDateTypeAdapter$1();

    /* renamed from: b  reason: collision with root package name */
    private final DateFormat f54820b = new SimpleDateFormat("MMM d, yyyy");

    static {
        Covode.recordClassIndex(33984);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized Date read(a aVar) {
        MethodCollector.i(6027);
        if (aVar.f() == b.NULL) {
            aVar.k();
            MethodCollector.o(6027);
            return null;
        }
        try {
            Date date = new Date(this.f54820b.parse(aVar.i()).getTime());
            MethodCollector.o(6027);
            return date;
        } catch (ParseException e2) {
            t tVar = new t(e2);
            MethodCollector.o(6027);
            throw tVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void write(c cVar, Date date) {
        String str;
        MethodCollector.i(6030);
        if (date == null) {
            str = null;
        } else {
            str = this.f54820b.format(date);
        }
        cVar.b(str);
        MethodCollector.o(6030);
    }
}
