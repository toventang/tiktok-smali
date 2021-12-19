package okhttp3.internal.http;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import okhttp3.internal.Util;

public final class HttpDate {
    private static final DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS = new DateFormat[15];
    private static final String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    private static final ThreadLocal<DateFormat> STANDARD_DATE_FORMAT = new ThreadLocal<DateFormat>() {
        /* class okhttp3.internal.http.HttpDate.AnonymousClass1 */

        static {
            Covode.recordClassIndex(106231);
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(Util.UTC);
            return simpleDateFormat;
        }
    };

    private HttpDate() {
    }

    static {
        Covode.recordClassIndex(106230);
    }

    public static String format(Date date) {
        return STANDARD_DATE_FORMAT.get().format(date);
    }

    public static Date parse(String str) {
        MethodCollector.i(285);
        if (str.length() == 0) {
            MethodCollector.o(285);
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = STANDARD_DATE_FORMAT.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            MethodCollector.o(285);
            return parse;
        }
        String[] strArr = BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    DateFormat[] dateFormatArr = BROWSER_COMPATIBLE_DATE_FORMATS;
                    DateFormat dateFormat = dateFormatArr[i2];
                    if (dateFormat == null) {
                        dateFormat = new SimpleDateFormat(BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[i2], Locale.US);
                        dateFormat.setTimeZone(Util.UTC);
                        dateFormatArr[i2] = dateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = dateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                }
                MethodCollector.o(285);
                return null;
            } finally {
                MethodCollector.o(285);
            }
        }
    }
}
