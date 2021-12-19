package com.ss.android.ugc.aweme.search.l.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.b.d;
import com.bytedance.frameworks.baselib.network.http.cronet.b.c;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.search.l.a.a.e;
import h.f.b.l;
import h.j.h;
import h.m.p;
import java.io.IOException;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f121336a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(79073);
    }

    public static void a(e eVar, Throwable th) {
        Class<?> cls;
        String message;
        l.d(eVar, "");
        if (th instanceof d) {
            eVar.a(2);
            eVar.b(1);
            eVar.a(th.getMessage());
        } else if (th instanceof c) {
            int statusCode = ((c) th).getStatusCode();
            if (statusCode > 0) {
                eVar.a(3);
                eVar.b(statusCode);
            } else {
                eVar.a(2);
                eVar.b(100);
            }
            String message2 = th.getMessage();
            if (message2 != null) {
                StringBuilder append = new StringBuilder("(").append(statusCode).append(')');
                int c2 = h.c(message2.length(), 100);
                Objects.requireNonNull(message2, "null cannot be cast to non-null type java.lang.String");
                String substring = message2.substring(0, c2);
                l.b(substring, "");
                eVar.a(append.append(substring).toString());
                if (p.e((CharSequence) message2, (CharSequence) "PROXY_CONNECTION_FAILED")) {
                    eVar.b(2);
                } else if (p.e((CharSequence) message2, (CharSequence) "HTTP2_PROTOCOL_ERROR")) {
                    eVar.b(3);
                } else if (p.e((CharSequence) message2, (CharSequence) "TTNET_APP_TIMED_OUT")) {
                    eVar.b(4);
                }
            }
        } else {
            if (th != null) {
                cls = th.getClass();
            } else {
                cls = null;
            }
            if (l.a(cls, IOException.class)) {
                String message3 = th.getMessage();
                if (message3 != null) {
                    if (p.e((CharSequence) message3, (CharSequence) "missing CR")) {
                        eVar.a(4);
                        eVar.b(3);
                    } else if (p.e((CharSequence) message3, (CharSequence) "Premature EOF")) {
                        eVar.a(4);
                        eVar.b(2);
                    } else {
                        eVar.a(2);
                        eVar.b(101);
                    }
                }
                eVar.a(th.getMessage());
            } else if (th instanceof com.google.gson.c.d) {
                eVar.a(4);
                eVar.b(1);
                eVar.a(th.getMessage());
            } else if (th instanceof a) {
                eVar.a(5);
                eVar.b(((com.ss.android.ugc.aweme.base.api.a.a) th).getErrorCode());
                eVar.a(th.getMessage());
            } else {
                eVar.a(2);
                if (th != null && (message = th.getMessage()) != null) {
                    StringBuilder append2 = new StringBuilder().append(th.getClass().getName()).append('(');
                    int c3 = h.c(message.length(), 100);
                    Objects.requireNonNull(message, "null cannot be cast to non-null type java.lang.String");
                    String substring2 = message.substring(0, c3);
                    l.b(substring2, "");
                    String sb = append2.append(substring2).append(')').toString();
                    eVar.a(sb);
                    if (p.e((CharSequence) sb, (CharSequence) "TTNET_APP_TIMED_OUT")) {
                        eVar.a(4);
                    }
                }
            }
        }
    }
}
