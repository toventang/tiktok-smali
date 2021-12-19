package com.apiguard3.internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.ExpandableListView;
import com.apiguard3.internal.getState;
import com.apiguard3.internal.log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class NTE<TaskResult> {
    private static int AGRequest;
    private static int getUrl = 191;
    private static int url = 1;
    private int getBody;
    private int getHeaders;
    private ExecutorService getMethod;

    static {
        Covode.recordClassIndex(2526);
    }

    public NTE() {
        this((byte) 0);
    }

    private NTE(byte b2) {
        this.getBody = 2;
        this.getHeaders = 2;
        this.getMethod = com_apiguard3_internal_NTE_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newFixedThreadPool(1);
    }

    public static ExecutorService com_apiguard3_internal_NTE_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newFixedThreadPool(int i2) {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = i2;
        return g.a(a2.a());
    }

    public final synchronized TaskResult AGRequest(MT<TaskResult> mt) {
        char c2;
        log.getBody getbody;
        getState.getHeaders getheaders;
        String str;
        MethodCollector.i(2762);
        int i2 = this.getHeaders;
        int i3 = this.getBody;
        Future future = null;
        while (i2 > 0) {
            int i4 = url + 109;
            AGRequest = i4 % 128;
            boolean z = false;
            if (i4 % 2 != 0) {
                try {
                    TaskResult taskresult = (TaskResult) this.getMethod.submit(mt).get((long) i3, TimeUnit.SECONDS);
                    MethodCollector.o(2762);
                    return taskresult;
                } catch (TimeoutException unused) {
                    checkCertificates.AGRequest(log.getBody.getHeaders, getState.getHeaders.onInitializationSuccess, mt.getMethod());
                    if (0 != 0 && !future.isDone()) {
                        future.cancel(true);
                        checkCertificates.AGRequest(log.getBody.AGRequest, getUrl(PhoneNumberUtils.isVoiceMailNumber(""), "\r\u0002\u0004\u000b\b\r\u0006﾿\u0013\u0007\u0004﾿\u0005\u0014\u0013\u0014\u0011\u0004￢\u0000", 288 - Drawable.resolveOpacity(0, 0), 20 - ((Process.getThreadPriority(0) + 20) >> 6), (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 18).intern());
                    }
                    i2--;
                    this.getMethod.shutdownNow();
                    this.getMethod = com_apiguard3_internal_NTE_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newFixedThreadPool(1);
                    i3 <<= 1;
                    if (i2 <= 0) {
                        z = true;
                    }
                    if (!z) {
                        int i5 = url + 21;
                        AGRequest = i5 % 128;
                        if (i5 % 2 == 0) {
                            c2 = '#';
                        } else {
                            c2 = 'Y';
                        }
                        if (c2 != 'Y') {
                            getbody = log.getBody.getHeaders;
                            getheaders = getState.getHeaders.onInitializationFailure;
                            str = mt.getMethod();
                        } else {
                            getbody = log.getBody.getHeaders;
                            getheaders = getState.getHeaders.onInitializationFailure;
                            str = mt.getMethod();
                        }
                        checkCertificates.AGRequest(getbody, getheaders, str);
                    }
                } catch (InterruptedException unused2) {
                    checkCertificates.AGRequest(log.getBody.getHeaders, getState.getHeaders.checkCertificates, mt.getMethod());
                    Thread.currentThread().interrupt();
                    MethodCollector.o(2762);
                    return null;
                } catch (Throwable th) {
                    checkCertificates.AGRequest(log.getBody.getHeaders, getState.getHeaders.BuildConfig, new StringBuilder().append(mt.getMethod()).append(getUrl(URLUtil.isDataUrl("data:"), "\u0000", TextUtils.indexOf((CharSequence) "", '0', 0) + 250, 1 - Color.argb(0, 0, 0, 0), -(ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1))).intern()).append(th.toString()).toString());
                    MethodCollector.o(2762);
                    return null;
                }
            } else {
                TaskResult taskresult2 = (TaskResult) this.getMethod.submit(mt).get((long) i3, TimeUnit.SECONDS);
                MethodCollector.o(2762);
                return taskresult2;
            }
        }
        MethodCollector.o(2762);
        return null;
    }

    private static String getUrl(boolean z, String str, int i2, int i3, int i4) {
        int i5 = AGRequest;
        int i6 = i5 + 103;
        url = i6 % 128;
        char[] cArr = str;
        cArr = str;
        if (i6 % 2 == 0 ? str != null : str != null) {
            int i7 = i5 + 55;
            url = i7 % 128;
            int i8 = i7 % 2;
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = new char[i3];
        for (int i9 = 0; i9 < i3; i9++) {
            cArr3[i9] = (char) (cArr2[i9] + i2);
            cArr3[i9] = (char) (cArr3[i9] - getUrl);
        }
        if (i4 > 0) {
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr3, 0, cArr4, 0, i3);
            int i10 = i3 - i4;
            System.arraycopy(cArr4, 0, cArr3, i10, i4);
            System.arraycopy(cArr4, i4, cArr3, 0, i10);
        }
        if (z) {
            char[] cArr5 = new char[i3];
            for (int i11 = 0; i11 < i3; i11++) {
                cArr5[i11] = cArr3[(i3 - i11) - 1];
            }
            cArr3 = cArr5;
        }
        return new String(cArr3);
    }
}
