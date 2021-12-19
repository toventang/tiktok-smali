package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.c.a;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.t;
import com.google.gson.v;
import com.google.gson.w;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class g extends v<Time> {

    /* renamed from: a  reason: collision with root package name */
    public static final w f54821a = new TimeTypeAdapter$1();

    /* renamed from: b  reason: collision with root package name */
    private final DateFormat f54822b = new SimpleDateFormat("hh:mm:ss a");

    static {
        Covode.recordClassIndex(33985);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized Time read(a aVar) {
        MethodCollector.i(5856);
        if (aVar.f() == b.NULL) {
            aVar.k();
            MethodCollector.o(5856);
            return null;
        }
        try {
            Time time = new Time(this.f54822b.parse(aVar.i()).getTime());
            MethodCollector.o(5856);
            return time;
        } catch (ParseException e2) {
            t tVar = new t(e2);
            MethodCollector.o(5856);
            throw tVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void write(c cVar, Time time) {
        String str;
        MethodCollector.i(5940);
        if (time == null) {
            str = null;
        } else {
            str = this.f54822b.format(time);
        }
        cVar.b(str);
        MethodCollector.o(5940);
    }
}
