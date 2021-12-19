package com.apiguard3.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import com.apiguard3.internal.getState;
import com.apiguard3.internal.log;
import com.apiguard3.internal.setImportantForAutofill;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class send implements de {
    private static int getHeaders = 1;
    private static int getMethod;
    private static send getUrl;

    static {
        Covode.recordClassIndex(2567);
    }

    private send() {
    }

    public static synchronized send getHeaders() {
        synchronized (send.class) {
            MethodCollector.i(2679);
            int i2 = getHeaders + 31;
            getMethod = i2 % 128;
            int i3 = i2 % 2;
            if (getUrl == null) {
                getUrl = new send();
            }
            send send = getUrl;
            int i4 = getMethod + 33;
            getHeaders = i4 % 128;
            if (i4 % 2 != 0) {
                MethodCollector.o(2679);
                return send;
            }
            MethodCollector.o(2679);
            return send;
        }
    }

    @Override // com.apiguard3.internal.de
    public final byte[] AGRequest(byte[] bArr) {
        int i2 = getHeaders;
        int i3 = i2 + 65;
        getMethod = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 109;
        getMethod = i5 % 128;
        int i6 = i5 % 2;
        return bArr;
    }

    @Override // com.apiguard3.internal.de
    public final byte[] getHeaders(byte[] bArr) {
        int i2 = getMethod + 11;
        int i3 = i2 % 128;
        getHeaders = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 33;
        getMethod = i5 % 128;
        int i6 = i5 % 2;
        return bArr;
    }

    public static initialize<Boolean> getMethod(final Context context, String str) {
        final initialize<Boolean> initialize = new initialize<>();
        try {
            if (((Boolean) ((Class) getMethod.AGRequest((char) Color.alpha(0), ImageFormat.getBitsPerPixel(0) + 42, 6166 - PhoneNumberUtils.toaFromString(""))).getMethod("getMethod", null).invoke(null, null)).booleanValue()) {
                setImportantForAutofill.AGRequest(context, str, new setImportantForAutofill.AGRequest() {
                    /* class com.apiguard3.internal.send.AnonymousClass5 */
                    private static int getHeaders;
                    private static int getMethod = 1;

                    static {
                        Covode.recordClassIndex(2568);
                    }

                    @Override // com.apiguard3.internal.setImportantForAutofill.AGRequest
                    public final void getUrl() {
                        int i2 = getHeaders + 123;
                        getMethod = i2 % 128;
                        int i3 = i2 % 2;
                        initialize.getHeaders(Boolean.TRUE);
                        int i4 = getMethod + 115;
                        getHeaders = i4 % 128;
                        int i5 = i4 % 2;
                    }

                    @Override // com.apiguard3.internal.setImportantForAutofill.AGRequest
                    public final void AGRequest(Throwable th) {
                        try {
                            checkCertificates.AGRequest(log.getBody.getHeaders, getState.getBody.get, new StringBuilder().append(th.toString()).append((String) ((Class) getMethod.AGRequest((char) ExpandableListView.getPackedPositionType(0), View.MeasureSpec.getMode(0) + 40, View.getDefaultSize(0, 0) + 5997)).getMethod("getUrl", Context.class).invoke(null, context)).toString());
                            checkCertificates.getMethod(log.getBody.getMethod, getState.getBody.get);
                            initialize.getHeaders(Boolean.FALSE);
                            int i2 = getHeaders + 119;
                            getMethod = i2 % 128;
                            if (i2 % 2 == 0) {
                                throw new NullPointerException("hashCode");
                            }
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        }
                    }
                });
                int i2 = getHeaders + 45;
                getMethod = i2 % 128;
                int i3 = i2 % 2;
            } else {
                setImportantForAutofill.AGRequest(context, str, null);
                initialize.getHeaders(Boolean.TRUE);
            }
        } catch (Throwable th) {
            try {
                checkCertificates.AGRequest(log.getBody.getHeaders, getState.getBody.get, new StringBuilder().append(th.toString()).append((String) ((Class) getMethod.AGRequest((char) TextUtils.getTrimmedLength(""), 'X' - AndroidCharacter.getMirror('0'), (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 5996)).getMethod("getUrl", Context.class).invoke(null, context)).toString());
                initialize.getHeaders(Boolean.FALSE);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        int i4 = getMethod + 69;
        getHeaders = i4 % 128;
        if (i4 % 2 != 0) {
            return initialize;
        }
        throw new NullPointerException("hashCode");
    }
}
