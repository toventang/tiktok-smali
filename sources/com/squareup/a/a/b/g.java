package com.squareup.a.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f57666a = TimeZone.getTimeZone("GMT");

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<DateFormat> f57667b = new ThreadLocal<DateFormat>() {
        /* class com.squareup.a.a.b.g.AnonymousClass1 */

        static {
            Covode.recordClassIndex(35946);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(g.f57666a);
            return simpleDateFormat;
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f57668c = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};

    /* renamed from: d  reason: collision with root package name */
    private static final DateFormat[] f57669d = new DateFormat[15];

    static {
        Covode.recordClassIndex(35945);
    }

    public static Date a(String str) {
        MethodCollector.i(9316);
        if (str.length() == 0) {
            MethodCollector.o(9316);
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f57667b.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            MethodCollector.o(9316);
            return parse;
        }
        String[] strArr = f57668c;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    DateFormat[] dateFormatArr = f57669d;
                    DateFormat dateFormat = dateFormatArr[i2];
                    if (dateFormat == null) {
                        dateFormat = new SimpleDateFormat(f57668c[i2], Locale.US);
                        dateFormat.setTimeZone(f57666a);
                        dateFormatArr[i2] = dateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = dateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                }
                MethodCollector.o(9316);
                return null;
            } finally {
                MethodCollector.o(9316);
            }
        }
    }
}
