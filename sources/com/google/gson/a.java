package com.google.gson;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.internal.d;
import com.google.gson.internal.i;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* access modifiers changed from: package-private */
public final class a extends v<Date> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<? extends Date> f54664a;

    /* renamed from: b  reason: collision with root package name */
    private final List<DateFormat> f54665b;

    static {
        Covode.recordClassIndex(33907);
    }

    public final String toString() {
        DateFormat dateFormat = this.f54665b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.v
    public final /* synthetic */ Date read(com.google.gson.c.a aVar) {
        if (aVar.f() == b.NULL) {
            aVar.k();
            return null;
        }
        Date a2 = a(aVar.i());
        Class<? extends Date> cls = this.f54664a;
        if (cls == Date.class) {
            return a2;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(a2.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(a2.getTime());
        }
        throw new AssertionError();
    }

    private static Class<? extends Date> a(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    private Date a(String str) {
        MethodCollector.i(6033);
        synchronized (this.f54665b) {
            try {
                for (DateFormat dateFormat : this.f54665b) {
                    try {
                        return dateFormat.parse(str);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    Date a2 = com.google.gson.internal.bind.a.a.a(str, new ParsePosition(0));
                    MethodCollector.o(6033);
                    return a2;
                } catch (ParseException e2) {
                    t tVar = new t(str, e2);
                    MethodCollector.o(6033);
                    throw tVar;
                }
            } finally {
                MethodCollector.o(6033);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
    @Override // com.google.gson.v
    public final /* synthetic */ void write(c cVar, Date date) {
        MethodCollector.i(6059);
        Date date2 = date;
        if (date2 == null) {
            cVar.f();
            MethodCollector.o(6059);
            return;
        }
        synchronized (this.f54665b) {
            try {
                cVar.b(this.f54665b.get(0).format(date2));
            } finally {
                MethodCollector.o(6059);
            }
        }
    }

    a(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f54665b = arrayList;
        this.f54664a = a(cls);
        arrayList.add(new SimpleDateFormat(str, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    public a(Class<? extends Date> cls, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        this.f54665b = arrayList;
        this.f54664a = a(cls);
        arrayList.add(DateFormat.getDateTimeInstance(i2, i3, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(i2, i3));
        }
        if (d.a()) {
            arrayList.add(i.a(i2, i3));
        }
    }
}
